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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.inventario.util.ConsumosServiciosConstantesFunciones;
import com.bydan.erp.inventario.util.report.ConsumosServiciosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ConsumosServiciosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ConsumosServiciosBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.inventario.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.inventario.util.*;

import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.inventario.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ConsumosServiciosBeanSwingJInternalFrame extends ConsumosServiciosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConsumosServiciosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ConsumosServicios> consumosserviciosValidator = new ClassValidator<ConsumosServicios>(ConsumosServicios.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ConsumosServicios consumosservicios;	
	public ConsumosServicios consumosserviciosAux;
	public ConsumosServicios consumosserviciosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ConsumosServicios consumosserviciosTotales;
	public Long idConsumosServiciosActual;
	public Long iIdNuevoConsumosServicios=0L;
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

	public String sFinalQueryComboTransaccion="";

	public List<Transaccion> transaccionsForeignKey;

	public List<Transaccion> gettransaccionsForeignKey() {
		return transaccionsForeignKey;
	}

	public void settransaccionsForeignKey(List<Transaccion> transaccionsForeignKey) {
		this.transaccionsForeignKey = transaccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionForeignKey;

	public Transaccion gettransaccionForeignKey() {
		return transaccionForeignKey;
	}

	public void settransaccionForeignKey(Transaccion transaccionForeignKey) {
		this.transaccionForeignKey = transaccionForeignKey;
	}

	public String sFinalQueryComboLinea="";

	public List<Linea> lineasForeignKey;

	public List<Linea> getlineasForeignKey() {
		return lineasForeignKey;
	}

	public void setlineasForeignKey(List<Linea> lineasForeignKey) {
		this.lineasForeignKey = lineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineaForeignKey;

	public Linea getlineaForeignKey() {
		return lineaForeignKey;
	}

	public void setlineaForeignKey(Linea lineaForeignKey) {
		this.lineaForeignKey = lineaForeignKey;
	}

	public String sFinalQueryComboLineaGrupo="";

	public List<Linea> lineagruposForeignKey;

	public List<Linea> getlineagruposForeignKey() {
		return lineagruposForeignKey;
	}

	public void setlineagruposForeignKey(List<Linea> lineagruposForeignKey) {
		this.lineagruposForeignKey = lineagruposForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineagrupoForeignKey;

	public Linea getlineagrupoForeignKey() {
		return lineagrupoForeignKey;
	}

	public void setlineagrupoForeignKey(Linea lineagrupoForeignKey) {
		this.lineagrupoForeignKey = lineagrupoForeignKey;
	}

	public String sFinalQueryComboLineaCategoria="";

	public List<Linea> lineacategoriasForeignKey;

	public List<Linea> getlineacategoriasForeignKey() {
		return lineacategoriasForeignKey;
	}

	public void setlineacategoriasForeignKey(List<Linea> lineacategoriasForeignKey) {
		this.lineacategoriasForeignKey = lineacategoriasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineacategoriaForeignKey;

	public Linea getlineacategoriaForeignKey() {
		return lineacategoriaForeignKey;
	}

	public void setlineacategoriaForeignKey(Linea lineacategoriaForeignKey) {
		this.lineacategoriaForeignKey = lineacategoriaForeignKey;
	}

	public String sFinalQueryComboLineaMarca="";

	public List<Linea> lineamarcasForeignKey;

	public List<Linea> getlineamarcasForeignKey() {
		return lineamarcasForeignKey;
	}

	public void setlineamarcasForeignKey(List<Linea> lineamarcasForeignKey) {
		this.lineamarcasForeignKey = lineamarcasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineamarcaForeignKey;

	public Linea getlineamarcaForeignKey() {
		return lineamarcaForeignKey;
	}

	public void setlineamarcaForeignKey(Linea lineamarcaForeignKey) {
		this.lineamarcaForeignKey = lineamarcaForeignKey;
	}

	public String sFinalQueryComboTipoProductoServicio="";

	public List<TipoProductoServicio> tipoproductoserviciosForeignKey;

	public List<TipoProductoServicio> gettipoproductoserviciosForeignKey() {
		return tipoproductoserviciosForeignKey;
	}

	public void settipoproductoserviciosForeignKey(List<TipoProductoServicio> tipoproductoserviciosForeignKey) {
		this.tipoproductoserviciosForeignKey = tipoproductoserviciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoProductoServicio tipoproductoservicioForeignKey;

	public TipoProductoServicio gettipoproductoservicioForeignKey() {
		return tipoproductoservicioForeignKey;
	}

	public void settipoproductoservicioForeignKey(TipoProductoServicio tipoproductoservicioForeignKey) {
		this.tipoproductoservicioForeignKey = tipoproductoservicioForeignKey;
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
	
	public Boolean isPermisoTodoConsumosServicios;
	public Boolean isPermisoNuevoConsumosServicios;
	public Boolean isPermisoActualizarConsumosServicios;
	public Boolean isPermisoActualizarOriginalConsumosServicios;
	public Boolean isPermisoEliminarConsumosServicios;
	public Boolean isPermisoGuardarCambiosConsumosServicios;
	public Boolean isPermisoConsultaConsumosServicios;
	public Boolean isPermisoBusquedaConsumosServicios;
	public Boolean isPermisoReporteConsumosServicios;
	public Boolean isPermisoPaginacionMedioConsumosServicios;
	public Boolean isPermisoPaginacionAltoConsumosServicios;
	public Boolean isPermisoPaginacionTodoConsumosServicios;
	public Boolean isPermisoCopiarConsumosServicios;
	public Boolean isPermisoVerFormConsumosServicios;
	public Boolean isPermisoDuplicarConsumosServicios;
	public Boolean isPermisoOrdenConsumosServicios;
	
	
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
	
	public ConsumosServiciosParameterReturnGeneral consumosserviciosReturnGeneral;
	public ConsumosServiciosParameterReturnGeneral consumosserviciosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConsumosServicios=false;
	public Boolean esParaAccionDesdeFormularioConsumosServicios=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ConsumosServiciosSessionBeanAdditional consumosserviciosSessionBeanAdditional=null;
	
	public ConsumosServiciosSessionBeanAdditional getConsumosServiciosSessionBeanAdditional() {
		return this.consumosserviciosSessionBeanAdditional;
	}
	
	public void setConsumosServiciosSessionBeanAdditional(ConsumosServiciosSessionBeanAdditional consumosserviciosSessionBeanAdditional) {
		try {
			this.consumosserviciosSessionBeanAdditional=consumosserviciosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ConsumosServiciosBeanSwingJInternalFrameAdditional consumosserviciosBeanSwingJInternalFrameAdditional=null;
	//public class ConsumosServiciosBeanSwingJInternalFrame
	
	public ConsumosServiciosBeanSwingJInternalFrameAdditional getConsumosServiciosBeanSwingJInternalFrameAdditional() {
		return this.consumosserviciosBeanSwingJInternalFrameAdditional;
	}
	
	public void setConsumosServiciosBeanSwingJInternalFrameAdditional(ConsumosServiciosBeanSwingJInternalFrameAdditional consumosserviciosBeanSwingJInternalFrameAdditional) {
		try {
			this.consumosserviciosBeanSwingJInternalFrameAdditional=consumosserviciosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ConsumosServiciosLogic consumosserviciosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ConsumosServicios consumosserviciosBean;
	public ConsumosServiciosConstantesFunciones consumosserviciosConstantesFunciones;
	//public ConsumosServiciosParameterReturnGeneral consumosserviciosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TransaccionLogic transaccionLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	public TipoProductoServicioLogic tipoproductoservicioLogic;
	
	//PARAMETROS
	
	
	//public List<ConsumosServicios> consumosservicioss;	
	//public List<ConsumosServicios> consumosserviciossEliminados;
	//public List<ConsumosServicios> consumosserviciossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConsumosServicios=false;
	public Boolean isVisibilidadCeldaDuplicarConsumosServicios=true;
	public Boolean isVisibilidadCeldaCopiarConsumosServicios=true;
	public Boolean isVisibilidadCeldaVerFormConsumosServicios=true;
	public Boolean isVisibilidadCeldaOrdenConsumosServicios=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConsumosServicios=false;
	public Boolean isVisibilidadCeldaModificarConsumosServicios=false;
	public Boolean isVisibilidadCeldaActualizarConsumosServicios=false;
	public Boolean isVisibilidadCeldaEliminarConsumosServicios=false;
	public Boolean isVisibilidadCeldaCancelarConsumosServicios=false;
	public Boolean isVisibilidadCeldaGuardarConsumosServicios=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConsumosServicios=false;	
	
	
	public Boolean isVisibilidadBusquedaConsumosServicios=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdTipoProductoServicio=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	
	public Long getiIdNuevoConsumosServicios() {
		return this.iIdNuevoConsumosServicios;
	}

	public void setiIdNuevoConsumosServicios(Long iIdNuevoConsumosServicios) {
		this.iIdNuevoConsumosServicios = iIdNuevoConsumosServicios;
	}
	
	public Long getidConsumosServiciosActual() {
		return this.idConsumosServiciosActual;
	}

	public void setidConsumosServiciosActual(Long idConsumosServiciosActual) {
		this.idConsumosServiciosActual = idConsumosServiciosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ConsumosServicios getconsumosservicios() {
		return this.consumosservicios;
	}

	public void setconsumosservicios(ConsumosServicios consumosservicios) {
		this.consumosservicios = consumosservicios;
	}
	
	public ConsumosServicios getconsumosserviciosAux() {
		return this.consumosserviciosAux;
	}

	public void setconsumosserviciosAux(ConsumosServicios consumosserviciosAux) {
		this.consumosserviciosAux = consumosserviciosAux;
	}				
	
	public ConsumosServicios getconsumosserviciosAnterior() {
		return this.consumosserviciosAnterior;
	}

	public void setconsumosserviciosAnterior(ConsumosServicios consumosserviciosAnterior) {
		this.consumosserviciosAnterior = consumosserviciosAnterior;
	}	
	
	public ConsumosServicios getconsumosserviciosTotales() {
		return this.consumosserviciosTotales;
	}

	public void setconsumosserviciosTotales(ConsumosServicios consumosserviciosTotales) {
		this.consumosserviciosTotales = consumosserviciosTotales;
	}	
	
	public ConsumosServicios getconsumosserviciosBean() {
		return this.consumosserviciosBean;
	}

	public void setconsumosserviciosBean(ConsumosServicios consumosserviciosBean) {
		this.consumosserviciosBean = consumosserviciosBean;
	}	
	
	public ConsumosServiciosParameterReturnGeneral getconsumosserviciosReturnGeneral() {
		return this.consumosserviciosReturnGeneral;
	}

	public void setconsumosserviciosReturnGeneral(ConsumosServiciosParameterReturnGeneral consumosserviciosReturnGeneral) {
		this.consumosserviciosReturnGeneral = consumosserviciosReturnGeneral;
	}	
	
	
	public Long id_transaccionBusquedaConsumosServicios=-1L;

	public Long getid_transaccionBusquedaConsumosServicios() {
		return this.id_transaccionBusquedaConsumosServicios;
	}

	public void setid_transaccionBusquedaConsumosServicios(Long id_transaccionBusquedaConsumosServicios) {
		this.id_transaccionBusquedaConsumosServicios = id_transaccionBusquedaConsumosServicios;
	}

;
	public Long id_lineaBusquedaConsumosServicios=-1L;

	public Long getid_lineaBusquedaConsumosServicios() {
		return this.id_lineaBusquedaConsumosServicios;
	}

	public void setid_lineaBusquedaConsumosServicios(Long id_lineaBusquedaConsumosServicios) {
		this.id_lineaBusquedaConsumosServicios = id_lineaBusquedaConsumosServicios;
	}

;
	public Long id_linea_grupoBusquedaConsumosServicios=-1L;

	public Long getid_linea_grupoBusquedaConsumosServicios() {
		return this.id_linea_grupoBusquedaConsumosServicios;
	}

	public void setid_linea_grupoBusquedaConsumosServicios(Long id_linea_grupoBusquedaConsumosServicios) {
		this.id_linea_grupoBusquedaConsumosServicios = id_linea_grupoBusquedaConsumosServicios;
	}

;
	public Long id_linea_categoriaBusquedaConsumosServicios=-1L;

	public Long getid_linea_categoriaBusquedaConsumosServicios() {
		return this.id_linea_categoriaBusquedaConsumosServicios;
	}

	public void setid_linea_categoriaBusquedaConsumosServicios(Long id_linea_categoriaBusquedaConsumosServicios) {
		this.id_linea_categoriaBusquedaConsumosServicios = id_linea_categoriaBusquedaConsumosServicios;
	}

;
	public Long id_linea_marcaBusquedaConsumosServicios=-1L;

	public Long getid_linea_marcaBusquedaConsumosServicios() {
		return this.id_linea_marcaBusquedaConsumosServicios;
	}

	public void setid_linea_marcaBusquedaConsumosServicios(Long id_linea_marcaBusquedaConsumosServicios) {
		this.id_linea_marcaBusquedaConsumosServicios = id_linea_marcaBusquedaConsumosServicios;
	}

;
	public Long id_tipo_producto_servicioBusquedaConsumosServicios=-1L;

	public Long getid_tipo_producto_servicioBusquedaConsumosServicios() {
		return this.id_tipo_producto_servicioBusquedaConsumosServicios;
	}

	public void setid_tipo_producto_servicioBusquedaConsumosServicios(Long id_tipo_producto_servicioBusquedaConsumosServicios) {
		this.id_tipo_producto_servicioBusquedaConsumosServicios = id_tipo_producto_servicioBusquedaConsumosServicios;
	}

;
	public Date fecha_emision_desdeBusquedaConsumosServicios=new Date();

	public Date getfecha_emision_desdeBusquedaConsumosServicios() {
		return this.fecha_emision_desdeBusquedaConsumosServicios;
	}

	public void setfecha_emision_desdeBusquedaConsumosServicios(Date fecha_emision_desdeBusquedaConsumosServicios) {
		this.fecha_emision_desdeBusquedaConsumosServicios = fecha_emision_desdeBusquedaConsumosServicios;
	}

;
	public Date fecha_emision_hastaBusquedaConsumosServicios=new Date();

	public Date getfecha_emision_hastaBusquedaConsumosServicios() {
		return this.fecha_emision_hastaBusquedaConsumosServicios;
	}

	public void setfecha_emision_hastaBusquedaConsumosServicios(Date fecha_emision_hastaBusquedaConsumosServicios) {
		this.fecha_emision_hastaBusquedaConsumosServicios = fecha_emision_hastaBusquedaConsumosServicios;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_lineaFK_IdLinea=-1L;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_linea_categoriaFK_IdLineaCategoria=-1L;

	public Long getid_linea_categoriaFK_IdLineaCategoria() {
		return this.id_linea_categoriaFK_IdLineaCategoria;
	}

	public void setid_linea_categoriaFK_IdLineaCategoria(Long id_linea_categoriaFK_IdLineaCategoria) {
		this.id_linea_categoriaFK_IdLineaCategoria = id_linea_categoriaFK_IdLineaCategoria;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_marcaFK_IdLineaMarca=-1L;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
	}

	public Long id_tipo_producto_servicioFK_IdTipoProductoServicio=-1L;

	public Long getid_tipo_producto_servicioFK_IdTipoProductoServicio() {
		return this.id_tipo_producto_servicioFK_IdTipoProductoServicio;
	}

	public void setid_tipo_producto_servicioFK_IdTipoProductoServicio(Long id_tipo_producto_servicioFK_IdTipoProductoServicio) {
		this.id_tipo_producto_servicioFK_IdTipoProductoServicio = id_tipo_producto_servicioFK_IdTipoProductoServicio;
	}

	public Long id_transaccionFK_IdTransaccion=-1L;

	public Long getid_transaccionFK_IdTransaccion() {
		return this.id_transaccionFK_IdTransaccion;
	}

	public void setid_transaccionFK_IdTransaccion(Long id_transaccionFK_IdTransaccion) {
		this.id_transaccionFK_IdTransaccion = id_transaccionFK_IdTransaccion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ConsumosServiciosLogic getConsumosServiciosLogic()	{		
		return consumosserviciosLogic;
	}

	public void setConsumosServiciosLogic(ConsumosServiciosLogic consumosserviciosLogic) {
		this.consumosserviciosLogic = consumosserviciosLogic;
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
	
	public Boolean getIsEsNuevoConsumosServicios() {
		return isEsNuevoConsumosServicios;
	}

	public void setIsEsNuevoConsumosServicios(Boolean isEsNuevoConsumosServicios) {
		this.isEsNuevoConsumosServicios = isEsNuevoConsumosServicios;
	}

	public Boolean getEsParaAccionDesdeFormularioConsumosServicios() {
		return esParaAccionDesdeFormularioConsumosServicios;
	}
	
	public void setEsParaAccionDesdeFormularioConsumosServicios(Boolean esParaAccionDesdeFormularioConsumosServicios) {
		this.esParaAccionDesdeFormularioConsumosServicios = esParaAccionDesdeFormularioConsumosServicios;
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

			if(this.consumosserviciosSessionBean==null) {
				this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean();
			}

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(consumosserviciosSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTransaccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionsForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.consumosserviciosSessionBean==null) {
				this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean();
			}

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionsForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(consumosserviciosSessionBean.getlidTransaccionActual());
					this.transaccionsForeignKey.add(transaccionLogic.getTransaccion());
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

	public void cargarCombosLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.consumosserviciosSessionBean==null) {
				this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean();
			}

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(consumosserviciosSessionBean.getlidLineaActual());
					this.lineasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaGruposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineagruposForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.consumosserviciosSessionBean==null) {
				this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean();
			}

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(consumosserviciosSessionBean.getlidLineaGrupoActual());
					this.lineagruposForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaCategoriasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineacategoriasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.consumosserviciosSessionBean==null) {
				this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean();
			}

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(consumosserviciosSessionBean.getlidLineaCategoriaActual());
					this.lineacategoriasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaMarcasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineamarcasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.consumosserviciosSessionBean==null) {
				this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean();
			}

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarca(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(consumosserviciosSessionBean.getlidLineaMarcaActual());
					this.lineamarcasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosTipoProductoServiciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoproductoserviciosForeignKey=new ArrayList<TipoProductoServicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoProductoServicioLogic tipoproductoservicioLogic=new TipoProductoServicioLogic();

			//tipoproductoservicioLogic.getTipoProductoServicioDataAccess().setIsForForeingKeyData(true);

			if(this.consumosserviciosSessionBean==null) {
				this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean();
			}

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionTipoProductoServicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoproductoservicioLogic.getTipoProductoServicioDataAccess().setIsForForeingKeyData(true);

					tipoproductoservicioLogic.getTodosTipoProductoServiciosWithConnection(sFinalQuery,new Pagination());

					this.tipoproductoserviciosForeignKey=tipoproductoservicioLogic.getTipoProductoServicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoProductoServicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoservicioLogic.getEntityWithConnection(consumosserviciosSessionBean.getlidTipoProductoServicioActual());
					this.tipoproductoserviciosForeignKey.add(tipoproductoservicioLogic.getTipoProductoServicio());
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

					if(this.consumosservicios!=null) {
						this.consumosservicios.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaConsumosServicios.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaConsumosServiciosGenerico)throws Exception
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
				jComboBoxid_empresaConsumosServiciosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaConsumosServiciosGenerico!=null && jComboBoxid_empresaConsumosServiciosGenerico.getItemCount()>0) {
					jComboBoxid_empresaConsumosServiciosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionForeignKey(Long idTransaccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionTemp!=null) {

					if(this.consumosservicios!=null) {
						this.consumosservicios.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionConsumosServicios.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConsumosServicios") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionTemp!=null && jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios!=null) {
						jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.setSelectedItem(transaccionTemp);
					} else {
						if(jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios!=null) {
							//jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.setSelectedItem(transaccionTemp);
							if(jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.getItemCount()>0) {
								jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.setSelectedIndex(0);
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

	public String getActualTransaccionForeignKeyDescripcion(Long idTransaccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionConsumosServiciosGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(transaccionTemp!=null) {
				jComboBoxid_transaccionConsumosServiciosGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionConsumosServiciosGenerico!=null && jComboBoxid_transaccionConsumosServiciosGenerico.getItemCount()>0) {
					jComboBoxid_transaccionConsumosServiciosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaForeignKey(Long idLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineaTemp!=null) {

					if(this.consumosservicios!=null) {
						this.consumosservicios.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaConsumosServicios.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConsumosServicios") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios!=null) {
						jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios!=null) {
							//jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.getItemCount()>0) {
								jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.setSelectedIndex(0);
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

	public String getActualLineaForeignKeyDescripcion(Long idLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaConsumosServiciosGenerico)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(lineaTemp!=null) {
				jComboBoxid_lineaConsumosServiciosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaConsumosServiciosGenerico!=null && jComboBoxid_lineaConsumosServiciosGenerico.getItemCount()>0) {
					jComboBoxid_lineaConsumosServiciosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaGrupoForeignKey(Long idLineaGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineagrupoTemp!=null) {

					if(this.consumosservicios!=null) {
						this.consumosservicios.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoConsumosServicios.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConsumosServicios") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios!=null) {
						jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios!=null) {
							//jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setSelectedIndex(0);
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

	public String getActualLineaGrupoForeignKeyDescripcion(Long idLineaGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineagrupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoConsumosServiciosGenerico)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(lineagrupoTemp!=null) {
				jComboBoxid_linea_grupoConsumosServiciosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoConsumosServiciosGenerico!=null && jComboBoxid_linea_grupoConsumosServiciosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoConsumosServiciosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaCategoriaForeignKey(Long idLineaCategoriaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineacategoriaTemp!=null) {

					if(this.consumosservicios!=null) {
						this.consumosservicios.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaConsumosServicios.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConsumosServicios") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios!=null) {
						jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios!=null) {
							//jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setSelectedIndex(0);
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

	public String getActualLineaCategoriaForeignKeyDescripcion(Long idLineaCategoriaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineacategoriaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaConsumosServiciosGenerico)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(lineacategoriaTemp!=null) {
				jComboBoxid_linea_categoriaConsumosServiciosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaConsumosServiciosGenerico!=null && jComboBoxid_linea_categoriaConsumosServiciosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaConsumosServiciosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaMarcaForeignKey(Long idLineaMarcaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineamarcaTemp!=null) {

					if(this.consumosservicios!=null) {
						this.consumosservicios.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaConsumosServicios.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConsumosServicios") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios!=null) {
						jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios!=null) {
							//jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setSelectedIndex(0);
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

	public String getActualLineaMarcaForeignKeyDescripcion(Long idLineaMarcaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineamarcaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaConsumosServiciosGenerico)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(lineamarcaTemp!=null) {
				jComboBoxid_linea_marcaConsumosServiciosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaConsumosServiciosGenerico!=null && jComboBoxid_linea_marcaConsumosServiciosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaConsumosServiciosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoProductoServicioForeignKey(Long idTipoProductoServicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosForeignKey) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoproductoservicioTemp!=null) {

					if(this.consumosservicios!=null) {
						this.consumosservicios.setTipoProductoServicio(tipoproductoservicioTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.setSelectedItem(tipoproductoservicioTemp);
					}
				} else {
					//jComboBoxid_tipo_producto_servicioConsumosServicios.setSelectedItem(tipoproductoservicioTemp);
					if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
						if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConsumosServicios") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoservicioTemp!=null && jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios!=null) {
						jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setSelectedItem(tipoproductoservicioTemp);
					} else {
						if(jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios!=null) {
							//jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setSelectedItem(tipoproductoservicioTemp);
							if(jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.getItemCount()>0) {
								jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setSelectedIndex(0);
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

	public String getActualTipoProductoServicioForeignKeyDescripcion(Long idTipoProductoServicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosForeignKey) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}


			sDescripcion=TipoProductoServicioConstantesFunciones.getTipoProductoServicioDescripcion(tipoproductoservicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoProductoServicioForeignKeyGenerico(Long idTipoProductoServicioSeleccionado,JComboBox jComboBoxid_tipo_producto_servicioConsumosServiciosGenerico)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosForeignKey) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}

			if(tipoproductoservicioTemp!=null) {
				jComboBoxid_tipo_producto_servicioConsumosServiciosGenerico.setSelectedItem(tipoproductoservicioTemp);
			} else {
				if(jComboBoxid_tipo_producto_servicioConsumosServiciosGenerico!=null && jComboBoxid_tipo_producto_servicioConsumosServiciosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_producto_servicioConsumosServiciosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ConsumosServicios consumosservicios,JComboBox jComboBoxid_empresaConsumosServiciosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaConsumosServiciosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaConsumosServiciosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				consumosservicios.setid_empresa(empresaAux.getId());
				consumosservicios.setempresa_descripcion(ConsumosServiciosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				consumosservicios.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(ConsumosServicios consumosservicios,JComboBox jComboBoxid_transaccionConsumosServiciosGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionConsumosServiciosGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionConsumosServiciosGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				consumosservicios.setid_transaccion(transaccionAux.getId());
				consumosservicios.settransaccion_descripcion(ConsumosServiciosConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				consumosservicios.setTransaccion(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ConsumosServicios consumosservicios,JComboBox jComboBoxid_lineaConsumosServiciosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaConsumosServiciosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaConsumosServiciosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				consumosservicios.setid_linea(lineaAux.getId());
				consumosservicios.setlinea_descripcion(ConsumosServiciosConstantesFunciones.getLineaDescripcion(lineaAux));
				consumosservicios.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ConsumosServicios consumosservicios,JComboBox jComboBoxid_linea_grupoConsumosServiciosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoConsumosServiciosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoConsumosServiciosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				consumosservicios.setid_linea_grupo(lineaAux.getId());
				consumosservicios.setlineagrupo_descripcion(ConsumosServiciosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				consumosservicios.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ConsumosServicios consumosservicios,JComboBox jComboBoxid_linea_categoriaConsumosServiciosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaConsumosServiciosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaConsumosServiciosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				consumosservicios.setid_linea_categoria(lineaAux.getId());
				consumosservicios.setlineacategoria_descripcion(ConsumosServiciosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				consumosservicios.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ConsumosServicios consumosservicios,JComboBox jComboBoxid_linea_marcaConsumosServiciosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaConsumosServiciosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaConsumosServiciosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				consumosservicios.setid_linea_marca(lineaAux.getId());
				consumosservicios.setlineamarca_descripcion(ConsumosServiciosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				consumosservicios.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoServicioForeignKey(ConsumosServicios consumosservicios,JComboBox jComboBoxid_tipo_producto_servicioConsumosServiciosGenerico)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioAux=new TipoProductoServicio();

			if(jComboBoxid_tipo_producto_servicioConsumosServiciosGenerico==null) {
				tipoproductoservicioAux=(TipoProductoServicio)this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.getSelectedItem();
			} else {
				tipoproductoservicioAux=(TipoProductoServicio)jComboBoxid_tipo_producto_servicioConsumosServiciosGenerico.getSelectedItem();
			}

			if(tipoproductoservicioAux!=null && tipoproductoservicioAux.getId()!=null) {
				consumosservicios.setid_tipo_producto_servicio(tipoproductoservicioAux.getId());
				consumosservicios.settipoproductoservicio_descripcion(ConsumosServiciosConstantesFunciones.getTipoProductoServicioDescripcion(tipoproductoservicioAux));
				consumosservicios.setTipoProductoServicio(tipoproductoservicioAux);			}
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

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
					}

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
					}

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConsumosServicios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.addItem(transaccion);
							}
						}

						if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
					}

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConsumosServicios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.addItem(linea);
							}
						}

						if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaGruposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
					}

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConsumosServicios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.addItem(lineagrupo);
							}
						}

						if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaCategoriasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
					}

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConsumosServicios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.addItem(lineacategoria);
							}
						}

						if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaMarcasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
					}

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConsumosServicios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.addItem(lineamarca);
							}
						}

						if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoProductoServiciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoProductoServicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.removeAllItems();

							for(TipoProductoServicio tipoproductoservicio:this.tipoproductoserviciosForeignKey) {
								this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.addItem(tipoproductoservicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosServicios!=null) { 
					}

					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConsumosServicios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.removeAllItems();

							for(TipoProductoServicio tipoproductoservicio:this.tipoproductoserviciosForeignKey) {
								this.jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.addItem(tipoproductoservicio);
							}
						}

						if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTransaccionForeignKey(Transaccion transaccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.setSelectedItem(transaccion);
						} else {
							this.jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaCategoriaForeignKey(Linea lineacategoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaMarcaForeignKey(Linea lineamarca,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoProductoServicioForeignKey(TipoProductoServicio tipoproductoservicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.setSelectedItem(tipoproductoservicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setSelectedItem(tipoproductoservicio);
						} else {
							this.jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesConsumosServicios() throws Exception {
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
		
	public ConsumosServiciosParameterReturnGeneral getConsumosServiciosParameterGeneral() {
		return this.consumosserviciosParameterGeneral;
	}
	
	public void setConsumosServiciosParameterGeneral(ConsumosServiciosParameterReturnGeneral consumosserviciosParameterGeneral) {
		this.consumosserviciosParameterGeneral = consumosserviciosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConsumosServicios() {
		return isPermisoTodoConsumosServicios;
	}

	public void setIsPermisoTodoConsumosServicios(Boolean isPermisoTodoConsumosServicios) {
		this.isPermisoTodoConsumosServicios = isPermisoTodoConsumosServicios;
	}

	public Boolean getIsPermisoNuevoConsumosServicios() {
		return isPermisoNuevoConsumosServicios;
	}

	public void setIsPermisoNuevoConsumosServicios(Boolean isPermisoNuevoConsumosServicios) {
		this.isPermisoNuevoConsumosServicios = isPermisoNuevoConsumosServicios;
	}

	public Boolean getIsPermisoActualizarConsumosServicios() {
		return isPermisoActualizarConsumosServicios;
	}

	public void setIsPermisoActualizarConsumosServicios(Boolean isPermisoActualizarConsumosServicios) {
		this.isPermisoActualizarConsumosServicios = isPermisoActualizarConsumosServicios;
	}

	public Boolean getIsPermisoEliminarConsumosServicios() {
		return isPermisoEliminarConsumosServicios;
	}

	public void setIsPermisoEliminarConsumosServicios(Boolean isPermisoEliminarConsumosServicios) {
		this.isPermisoEliminarConsumosServicios = isPermisoEliminarConsumosServicios;
	}

	public Boolean getIsPermisoGuardarCambiosConsumosServicios() {
		return isPermisoGuardarCambiosConsumosServicios;
	}

	public void setIsPermisoGuardarCambiosConsumosServicios(Boolean isPermisoGuardarCambiosConsumosServicios) {
		this.isPermisoGuardarCambiosConsumosServicios = isPermisoGuardarCambiosConsumosServicios;
	}
	
	public Boolean getIsPermisoConsultaConsumosServicios() {
		return isPermisoConsultaConsumosServicios;
	}

	public void setIsPermisoConsultaConsumosServicios(Boolean isPermisoConsultaConsumosServicios) {
		this.isPermisoConsultaConsumosServicios = isPermisoConsultaConsumosServicios;
	}

	public Boolean getIsPermisoBusquedaConsumosServicios() {
		return isPermisoBusquedaConsumosServicios;
	}

	public void setIsPermisoBusquedaConsumosServicios(Boolean isPermisoBusquedaConsumosServicios) {
		this.isPermisoBusquedaConsumosServicios = isPermisoBusquedaConsumosServicios;
	}

	public Boolean getIsPermisoReporteConsumosServicios() {
		return isPermisoReporteConsumosServicios;
	}

	public void setIsPermisoReporteConsumosServicios(Boolean isPermisoReporteConsumosServicios) {
		this.isPermisoReporteConsumosServicios = isPermisoReporteConsumosServicios;
	}
	
	public Boolean getIsPermisoPaginacionMedioConsumosServicios() {
		return isPermisoPaginacionMedioConsumosServicios;
	}

	public void setIsPermisoPaginacionMedioConsumosServicios(Boolean isPermisoPaginacionMedioConsumosServicios) {
		this.isPermisoPaginacionMedioConsumosServicios = isPermisoPaginacionMedioConsumosServicios;
	}
	
	public Boolean getIsPermisoPaginacionTodoConsumosServicios() {
		return isPermisoPaginacionTodoConsumosServicios;
	}

	public void setIsPermisoPaginacionTodoConsumosServicios(Boolean isPermisoPaginacionTodoConsumosServicios) {
		this.isPermisoPaginacionTodoConsumosServicios = isPermisoPaginacionTodoConsumosServicios;
	}
	
	public Boolean getIsPermisoPaginacionAltoConsumosServicios() {
		return isPermisoPaginacionAltoConsumosServicios;
	}

	public void setIsPermisoPaginacionAltoConsumosServicios(Boolean isPermisoPaginacionAltoConsumosServicios) {
		this.isPermisoPaginacionAltoConsumosServicios = isPermisoPaginacionAltoConsumosServicios;
	}
	
	public Boolean getIsPermisoCopiarConsumosServicios() {
		return isPermisoCopiarConsumosServicios;
	}

	public void setIsPermisoCopiarConsumosServicios(Boolean isPermisoCopiarConsumosServicios) {
		this.isPermisoCopiarConsumosServicios = isPermisoCopiarConsumosServicios;
	}
	
	public Boolean getIsPermisoVerFormConsumosServicios() {
		return isPermisoVerFormConsumosServicios;
	}

	public void setIsPermisoVerFormConsumosServicios(Boolean isPermisoVerFormConsumosServicios) {
		this.isPermisoVerFormConsumosServicios = isPermisoVerFormConsumosServicios;
	}
	
	public Boolean getIsPermisoDuplicarConsumosServicios() {
		return isPermisoDuplicarConsumosServicios;
	}

	public void setIsPermisoDuplicarConsumosServicios(Boolean isPermisoDuplicarConsumosServicios) {
		this.isPermisoDuplicarConsumosServicios = isPermisoDuplicarConsumosServicios;
	}
	
	public Boolean getIsPermisoOrdenConsumosServicios() {
		return isPermisoOrdenConsumosServicios;
	}

	public void setIsPermisoOrdenConsumosServicios(Boolean isPermisoOrdenConsumosServicios) {
		this.isPermisoOrdenConsumosServicios = isPermisoOrdenConsumosServicios;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConsumosServicios() {
		return isVisibilidadCeldaNuevoConsumosServicios;
	}

	public void setIsVisibilidadCeldaNuevoConsumosServicios(Boolean isVisibilidadCeldaNuevoConsumosServicios) {
		this.isVisibilidadCeldaNuevoConsumosServicios = isVisibilidadCeldaNuevoConsumosServicios;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConsumosServicios() {
		return isVisibilidadCeldaDuplicarConsumosServicios;
	}

	public void setIsVisibilidadCeldaDuplicarConsumosServicios(Boolean isVisibilidadCeldaDuplicarConsumosServicios) {
		this.isVisibilidadCeldaDuplicarConsumosServicios = isVisibilidadCeldaDuplicarConsumosServicios;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConsumosServicios() {
		return isVisibilidadCeldaCopiarConsumosServicios;
	}

	public void setIsVisibilidadCeldaCopiarConsumosServicios(Boolean isVisibilidadCeldaCopiarConsumosServicios) {
		this.isVisibilidadCeldaCopiarConsumosServicios = isVisibilidadCeldaCopiarConsumosServicios;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConsumosServicios() {
		return isVisibilidadCeldaVerFormConsumosServicios;
	}

	public void setIsVisibilidadCeldaVerFormConsumosServicios(Boolean isVisibilidadCeldaVerFormConsumosServicios) {
		this.isVisibilidadCeldaVerFormConsumosServicios = isVisibilidadCeldaVerFormConsumosServicios;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConsumosServicios() {
		return isVisibilidadCeldaOrdenConsumosServicios;
	}

	public void setIsVisibilidadCeldaOrdenConsumosServicios(Boolean isVisibilidadCeldaOrdenConsumosServicios) {
		this.isVisibilidadCeldaOrdenConsumosServicios = isVisibilidadCeldaOrdenConsumosServicios;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConsumosServicios() {
		return isVisibilidadCeldaNuevoRelacionesConsumosServicios;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConsumosServicios(Boolean isVisibilidadCeldaNuevoRelacionesConsumosServicios) {
		this.isVisibilidadCeldaNuevoRelacionesConsumosServicios = isVisibilidadCeldaNuevoRelacionesConsumosServicios;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConsumosServicios() {
		return isVisibilidadCeldaModificarConsumosServicios;
	}

	public void setIsVisibilidadCeldaModificarConsumosServicios(Boolean isVisibilidadCeldaModificarConsumosServicios) {
		this.isVisibilidadCeldaModificarConsumosServicios = isVisibilidadCeldaModificarConsumosServicios;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConsumosServicios() {
		return isVisibilidadCeldaActualizarConsumosServicios;
	}

	public void setIsVisibilidadCeldaActualizarConsumosServicios(Boolean isVisibilidadCeldaActualizarConsumosServicios) {
		this.isVisibilidadCeldaActualizarConsumosServicios = isVisibilidadCeldaActualizarConsumosServicios;
	}

	public Boolean getIsVisibilidadCeldaEliminarConsumosServicios() {
		return isVisibilidadCeldaEliminarConsumosServicios;
	}

	public void setIsVisibilidadCeldaEliminarConsumosServicios(Boolean isVisibilidadCeldaEliminarConsumosServicios) {
		this.isVisibilidadCeldaEliminarConsumosServicios = isVisibilidadCeldaEliminarConsumosServicios;
	}

	public Boolean getIsVisibilidadCeldaCancelarConsumosServicios() {
		return isVisibilidadCeldaCancelarConsumosServicios;
	}

	public void setIsVisibilidadCeldaCancelarConsumosServicios(Boolean isVisibilidadCeldaCancelarConsumosServicios) {
		this.isVisibilidadCeldaCancelarConsumosServicios = isVisibilidadCeldaCancelarConsumosServicios;
	}

	public Boolean getIsVisibilidadCeldaGuardarConsumosServicios() {
		return isVisibilidadCeldaGuardarConsumosServicios;
	}

	public void setIsVisibilidadCeldaGuardarConsumosServicios(Boolean isVisibilidadCeldaGuardarConsumosServicios) {
		this.isVisibilidadCeldaGuardarConsumosServicios = isVisibilidadCeldaGuardarConsumosServicios;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConsumosServicios() {
		return isVisibilidadCeldaGuardarCambiosConsumosServicios;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConsumosServicios(Boolean isVisibilidadCeldaGuardarCambiosConsumosServicios) {
		this.isVisibilidadCeldaGuardarCambiosConsumosServicios = isVisibilidadCeldaGuardarCambiosConsumosServicios;
	}
		
	public ConsumosServiciosSessionBean getconsumosserviciosSessionBean() {
		return this.consumosserviciosSessionBean;
	}
	
	public void setconsumosserviciosSessionBean(ConsumosServiciosSessionBean consumosserviciosSessionBean) {
		this.consumosserviciosSessionBean=consumosserviciosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaConsumosServicios() {
		return this.isVisibilidadBusquedaConsumosServicios;
	}

	public void setisVisibilidadBusquedaConsumosServicios(Boolean isVisibilidadBusquedaConsumosServicios) {
		this.isVisibilidadBusquedaConsumosServicios=isVisibilidadBusquedaConsumosServicios;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdLinea() {
		return this.isVisibilidadFK_IdLinea;
	}

	public void setisVisibilidadFK_IdLinea(Boolean isVisibilidadFK_IdLinea) {
		this.isVisibilidadFK_IdLinea=isVisibilidadFK_IdLinea;
	}

	public Boolean getisVisibilidadFK_IdLineaCategoria() {
		return this.isVisibilidadFK_IdLineaCategoria;
	}

	public void setisVisibilidadFK_IdLineaCategoria(Boolean isVisibilidadFK_IdLineaCategoria) {
		this.isVisibilidadFK_IdLineaCategoria=isVisibilidadFK_IdLineaCategoria;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdLineaMarca() {
		return this.isVisibilidadFK_IdLineaMarca;
	}

	public void setisVisibilidadFK_IdLineaMarca(Boolean isVisibilidadFK_IdLineaMarca) {
		this.isVisibilidadFK_IdLineaMarca=isVisibilidadFK_IdLineaMarca;
	}

	public Boolean getisVisibilidadFK_IdTipoProductoServicio() {
		return this.isVisibilidadFK_IdTipoProductoServicio;
	}

	public void setisVisibilidadFK_IdTipoProductoServicio(Boolean isVisibilidadFK_IdTipoProductoServicio) {
		this.isVisibilidadFK_IdTipoProductoServicio=isVisibilidadFK_IdTipoProductoServicio;
	}

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(ConsumosServicios consumosservicios)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(consumosservicios,null);
				this.setActualParaGuardarTransaccionForeignKey(consumosservicios,null);
				this.setActualParaGuardarLineaForeignKey(consumosservicios,null);
				this.setActualParaGuardarLineaGrupoForeignKey(consumosservicios,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(consumosservicios,null);
				this.setActualParaGuardarLineaMarcaForeignKey(consumosservicios,null);
				this.setActualParaGuardarTipoProductoServicioForeignKey(consumosservicios,null);
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
	
	public void bugActualizarReferenciaActual(ConsumosServicios consumosservicios,ConsumosServicios consumosserviciosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConsumosServicios(consumosservicios);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		consumosserviciosAux.setId(consumosservicios.getId());
		consumosserviciosAux.setVersionRow(consumosservicios.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ConsumosServicios consumosserviciosLocal) throws Exception {
		
		if(this.consumosserviciosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ConsumosServicios consumosserviciosLocal) throws Exception {	
		if(this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				consumosserviciosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				consumosserviciosLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				consumosserviciosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				consumosserviciosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				consumosserviciosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				consumosserviciosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoServicioDetalleFormJInternalFrame.class)) {
				TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrameLocal=(TipoProductoServicioBeanSwingJInternalFrame) ((TipoProductoServicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoservicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProductoServicio(tipoproductoservicioBeanSwingJInternalFrameLocal.gettipoproductoservicio(),true);
				tipoproductoservicioBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio,this.tipoproductoserviciosForeignKey);

				tipoproductoservicioBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio);

				consumosserviciosLocal.setTipoProductoServicio(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio);

				this.addItemDefectoCombosForeignKeyTipoProductoServicio();
				this.cargarCombosFrameTipoProductoServiciosForeignKey("Formulario");
				this.setActualTipoProductoServicioForeignKey(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConsumosServiciosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = consumosserviciosValidator.getInvalidValues(this.consumosservicios);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ConsumosServicios consumosservicios,List<ConsumosServicios> consumosservicioss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ConsumosServicios consumosservicios,List<ConsumosServicios> consumosservicioss) throws Exception {
		try	{			
			ConsumosServiciosConstantesFunciones.actualizarSelectedLista(consumosservicios,consumosservicioss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ConsumosServicios> consumosserviciossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				consumosserviciossLocal=this.consumosserviciosLogic.getConsumosServicioss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				consumosserviciossLocal=this.consumosservicioss;
			}
			//ARCHITECTURE
		
			for(ConsumosServicios consumosserviciosLocal:consumosserviciossLocal) {
				if(this.permiteMantenimiento(consumosserviciosLocal) && consumosserviciosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConsumosServiciosConstantesFunciones.getConsumosServiciosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ConsumosServiciosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_unidadConsumosServicios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosServiciosConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_productoConsumosServicios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosServiciosConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelcantidadConsumosServicios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosServiciosConstantesFunciones.NOMBRELINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_lineaConsumosServicios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosServiciosConstantesFunciones.NOMBRELINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_linea_grupoConsumosServicios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosServiciosConstantesFunciones.NOMBRELINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_linea_categoriaConsumosServicios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosServiciosConstantesFunciones.NOMBRELINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_linea_marcaConsumosServicios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosServiciosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelcodigoConsumosServicios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosServiciosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabeltotalConsumosServicios,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_unidadConsumosServicios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_productoConsumosServicios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosServicios.jLabelcantidadConsumosServicios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_lineaConsumosServicios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_linea_grupoConsumosServicios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_linea_categoriaConsumosServicios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_linea_marcaConsumosServicios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosServicios.jLabelcodigoConsumosServicios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosServicios.jLabeltotalConsumosServicios,"");
		
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
		this.iIdNuevoConsumosServicios--;	
		
		
		this.consumosserviciosAux=new ConsumosServicios();
		
		this.consumosserviciosAux.setId(this.iIdNuevoConsumosServicios);
		this.consumosserviciosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.consumosserviciosLogic.getConsumosServicioss().add(this.consumosserviciosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.consumosservicioss.add(this.consumosserviciosAux);
		}
		//ARCHITECTURE
		
		this.consumosservicios=this.consumosserviciosAux;
		
		if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConsumosServicios(this.consumosservicios);
			this.setVariablesObjetoActualToFormularioForeignKeyConsumosServicios(this.consumosservicios);
		}
				
		//this.setDefaultControlesConsumosServicios();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConsumosServicios();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConsumosServicios();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConsumosServicios();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConsumosServicios(this.consumosserviciosBean,this.consumosservicios,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConsumosServicios(this.consumosserviciosReturnGeneral,this.consumosserviciosBean,false);
		
		if(this.consumosserviciosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConsumosServicios(this.consumosserviciosReturnGeneral.getConsumosServicios());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConsumosServicios(this.consumosserviciosReturnGeneral.getConsumosServicios());
		}
		
		if(this.consumosserviciosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConsumosServicios(this.consumosserviciosReturnGeneral.getConsumosServicios(),classes);//this.consumosserviciosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConsumosServicios();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConsumosServicios();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.RecargarFormConsumosServicios(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConsumosServicios(false);
						
			if(consumosserviciosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsumosServicios();
			}
			
			this.actualizarVisualTableDatosConsumosServicios();
			
			this.jTableDatosConsumosServicios.setRowSelectionInterval(this.getIndiceNuevoConsumosServicios(), this.getIndiceNuevoConsumosServicios());
			
			this.seleccionarFilaTablaConsumosServiciosActual();
						
			this.actualizarEstadoCeldasBotonesConsumosServicios("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConsumosServicios(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConsumosServicios.jDateChooserfecha_emision_desdeConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarfecha_emision_desdeConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jDateChooserfecha_emision_hastaConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarfecha_emision_hastaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextFieldnombre_unidadConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarnombre_unidadConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_productoConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarnombre_productoConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcantidadConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarcantidadConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_lineaConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarnombre_lineaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_grupoConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarnombre_linea_grupoConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_categoriaConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarnombre_linea_categoriaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_marcaConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarnombre_linea_marcaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcodigoConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarcodigoConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextFieldtotalConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activartotalConsumosServicios);	
		//
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarid_empresaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarid_transaccionConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarid_lineaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarid_linea_grupoConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarid_linea_categoriaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarid_linea_marcaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.setEnabled(isHabilitar && this.consumosserviciosConstantesFunciones.activarid_tipo_producto_servicioConsumosServicios);
	};
	
	public void setDefaultControlesConsumosServicios() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConsumosServicios(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.consumosserviciosSessionBean.setConGuardarRelaciones(true);			
			this.consumosserviciosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConsumosServicios.jTabbedPaneRelacionesConsumosServicios.setVisible(true);
			
					
		} else {
			//this.consumosserviciosSessionBean.setConGuardarRelaciones(false);			
			this.consumosserviciosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConsumosServicios.jTabbedPaneRelacionesConsumosServicios.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoConsumosServicios() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsumosServicios consumosserviciosAux:this.consumosserviciosLogic.getConsumosServicioss()) {
				if(consumosserviciosAux.getId().equals(this.iIdNuevoConsumosServicios)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsumosServicios consumosserviciosAux:this.consumosservicioss) {
				if(consumosserviciosAux.getId().equals(this.iIdNuevoConsumosServicios)) {
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
	
	public int getIndiceActualConsumosServicios(ConsumosServicios consumosservicios,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsumosServicios consumosserviciosAux:this.consumosserviciosLogic.getConsumosServicioss()) {
				if(consumosserviciosAux.getId().equals(consumosservicios.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsumosServicios consumosserviciosAux:this.consumosservicioss) {
				if(consumosserviciosAux.getId().equals(consumosservicios.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConsumosServicios(ConsumosServicios consumosserviciosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsumosServicios consumosserviciosAux:this.consumosserviciosLogic.getConsumosServicioss()) {
				if(consumosserviciosAux.getConsumosServiciosOriginal().getId().equals(consumosserviciosOriginal.getId())) {
					existe=true;
					consumosserviciosOriginal.setId(consumosserviciosAux.getId());
					consumosserviciosOriginal.setVersionRow(consumosserviciosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsumosServicios consumosserviciosAux:this.consumosservicioss) {
				if(consumosserviciosAux.getConsumosServiciosOriginal().getId().equals(consumosserviciosOriginal.getId())) {
					existe=true;
					consumosserviciosOriginal.setId(consumosserviciosAux.getId());
					consumosserviciosOriginal.setVersionRow(consumosserviciosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConsumosServicios(Boolean esParaCancelar) throws Exception {
		consumosserviciossAux=new ArrayList<ConsumosServicios>();
		consumosserviciosAux=new ConsumosServicios();
		
		if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConsumosServicios consumosserviciosAux:this.consumosserviciosLogic.getConsumosServicioss()) {
					if(consumosserviciosAux.getId()<0) {
						consumosserviciossAux.add(consumosserviciosAux);
					}		
				}
				this.iIdNuevoConsumosServicios=0L;
				this.consumosserviciosLogic.getConsumosServicioss().removeAll(consumosserviciossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsumosServicios consumosserviciosAux:this.consumosservicioss) {
					if(consumosserviciosAux.getId()<0) {
						consumosserviciossAux.add(consumosserviciosAux);
					}		
				}
				this.iIdNuevoConsumosServicios=0L;
				this.consumosservicioss.removeAll(consumosserviciossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConsumosServicios 
					&& this.consumosserviciosLogic.getConsumosServicioss().size()>0
					) {
					consumosserviciosAux=this.consumosserviciosLogic.getConsumosServicioss().get(this.consumosserviciosLogic.getConsumosServicioss().size() - 1);
				
					if(consumosserviciosAux.getId()<0) {
						this.consumosserviciosLogic.getConsumosServicioss().remove(consumosserviciosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConsumosServicios && this.consumosservicioss.size()>0) {
					consumosserviciosAux=this.consumosservicioss.get(this.consumosservicioss.size() - 1);
				
					if(consumosserviciosAux.getId()<0) {
						this.consumosservicioss.remove(consumosserviciosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConsumosServicios(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(consumosservicios.getId()<0) {
				this.consumosserviciosLogic.getConsumosServicioss().remove(this.consumosservicios);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(consumosservicios.getId()<0) {
				this.consumosservicioss.remove(this.consumosservicios);
			}
		}			
	}
	
	public void setEstadosInicialesConsumosServicios(List<ConsumosServicios> consumosserviciossAux) throws Exception {
		ConsumosServiciosConstantesFunciones.setEstadosInicialesConsumosServicios(consumosserviciossAux);
	}
	
	public void setEstadosInicialesConsumosServicios(ConsumosServicios consumosserviciosAux) throws Exception {
		ConsumosServiciosConstantesFunciones.setEstadosInicialesConsumosServicios(consumosserviciosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConsumosServiciosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConsumosServicios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConsumosServiciosActual()) {
				if(!this.isEsNuevoConsumosServicios) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConsumosServicios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConsumosServicios=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConsumosServiciosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Consumos Servicios ?", "MANTENIMIENTO DE Consumos Servicios", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConsumosServicios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ConsumosServicios consumosservicios) throws Exception {
		ConsumosServiciosConstantesFunciones.seleccionarAsignar(this.consumosservicios,consumosservicios);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConsumosServicios=this.isPermisoActualizarOriginalConsumosServicios;
			
			
			this.seleccionarAsignar(consumosservicios);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesConsumosServicios("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.consumosserviciosSessionBean.setsFuncionBusquedaRapida(this.consumosserviciosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoConsumosServicios) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConsumosServicios(esParaCancelar);				
				this.cancelarNuevoConsumosServicios(esParaCancelar);								
			}
			
			this.consumosservicios=new ConsumosServicios();
			
			this.inicializarConsumosServicios();
			
			this.actualizarEstadoCeldasBotonesConsumosServicios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConsumosServicios() throws Exception {
		try {
			ConsumosServiciosConstantesFunciones.inicializarConsumosServicios(this.consumosservicios);
			
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
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.consumosserviciosLogic.getConsumosServicioss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConsumosServicioss(String sAccionBusqueda,List<ConsumosServicios> consumosserviciossParaReportes) throws Exception {
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
					sPathReporteFinal="ConsumosServicios"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConsumosServiciosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConsumosServiciosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ConsumosServicios"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Consumos Servicioses");		
		parameters.put("busquedapor", ConsumosServiciosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConsumosServicios=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConsumosServiciosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConsumosServiciosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConsumosServicios=new JRBeanArrayDataSource(ConsumosServiciosJInternalFrame.TraerConsumosServiciosBeans(consumosserviciossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConsumosServicios);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConsumosServiciosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConsumosServiciosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConsumosServiciosBean.TraerConsumosServiciosBeans(consumosserviciossParaReportes).toArray()));
							
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
				this.generarExcelReporteConsumosServicioss(sAccionBusqueda,sTipoArchivoReporte,consumosserviciossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConsumosServicioss(sAccionBusqueda,sTipoArchivoReporte,consumosserviciossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConsumosServiciosActionPerformed(null);
					//this.generarExcelReporteConsumosServicioss(sAccionBusqueda,sTipoArchivoReporte,consumosserviciossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConsumosServicioss(sAccionBusqueda,sTipoArchivoReporte,consumosserviciossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConsumosServicioss(sAccionBusqueda,sTipoArchivoReporte,consumosserviciossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConsumosServicioss(sAccionBusqueda,sTipoArchivoReporte,consumosserviciossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConsumosServicioss(String sAccionBusqueda,String sTipoArchivoReporte,List<ConsumosServicios> consumosserviciossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosservicios";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConsumosServicioss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConsumosServicios("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ConsumosServicios consumosservicios : consumosserviciossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConsumosServiciosConstantesFunciones.generarExcelReporteDataConsumosServicios("NORMAL",row,workbook,consumosservicios,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Servicios",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConsumosServicios(String sTipo,Row row,Workbook workbook) {
		
		ConsumosServiciosConstantesFunciones.generarExcelReporteHeaderConsumosServicios(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConsumosServicioss(String sAccionBusqueda,String sTipoArchivoReporte,List<ConsumosServicios> consumosserviciossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosservicios_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConsumosServicioss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ConsumosServicios consumosservicios : consumosserviciossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConsumosServiciosConstantesFunciones.getConsumosServiciosDescripcion(consumosservicios));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.gettipoproductoservicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getnombre_linea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getnombre_linea_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getnombre_linea_categoria());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getnombre_linea_marca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosServiciosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosservicios.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Servicios",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConsumosServicioss(String sAccionBusqueda,String sTipoArchivoReporte,List<ConsumosServicios> consumosserviciossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ConsumosServicios> consumosserviciossRespaldo=null;
		
		classes=ConsumosServiciosConstantesFunciones.getClassesRelationshipsOfConsumosServicios(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.consumosserviciosLogic.setDatosCliente(this.datosCliente);
		this.consumosserviciosLogic.setDatosDeep(this.datosDeep);
		this.consumosserviciosLogic.setIsConDeep(true);
		
		consumosserviciossRespaldo=this.consumosserviciosLogic.getConsumosServicioss();
		
		this.consumosserviciosLogic.setConsumosServicioss(consumosserviciossParaReportes);	
		this.consumosserviciosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		consumosserviciossParaReportes=this.consumosserviciosLogic.getConsumosServicioss();
		this.consumosserviciosLogic.setConsumosServicioss(consumosserviciossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosservicios_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConsumosServicioss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConsumosServicios("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ConsumosServicios consumosservicios : consumosserviciossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConsumosServicios("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConsumosServiciosConstantesFunciones.generarExcelReporteDataConsumosServicios("NORMAL",row,workbook,consumosservicios,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ConsumosServiciosConstantesFunciones.getConsumosServiciosDescripcion(consumosservicios));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Servicios",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConsumosServicios.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsumosServicios.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConsumosServicios() throws Exception {		
		this.startProcessConsumosServicios(true);
	}
	
	public void startProcessConsumosServicios(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConsumosServicios ,this.jPanelParametrosReportesConsumosServicios, this.jScrollPanelDatosConsumosServicios,this.jPanelPaginacionConsumosServicios, this.jScrollPanelDatosEdicionConsumosServicios, this.jPanelAccionesConsumosServicios,this.jPanelAccionesFormularioConsumosServicios,this.jmenuBarConsumosServicios,this.jmenuBarDetalleConsumosServicios,this.jTtoolBarConsumosServicios,this.jTtoolBarDetalleConsumosServicios);		
		
		final JTabbedPane jTabbedPaneBusquedasConsumosServicios=this.jTabbedPaneBusquedasConsumosServicios; 
		
		final JPanel jPanelParametrosReportesConsumosServicios=this.jPanelParametrosReportesConsumosServicios;
		//final JScrollPane jScrollPanelDatosConsumosServicios=this.jScrollPanelDatosConsumosServicios;
		final JTable jTableDatosConsumosServicios=this.jTableDatosConsumosServicios;		
		final JPanel jPanelPaginacionConsumosServicios=this.jPanelPaginacionConsumosServicios;
		//final JScrollPane jScrollPanelDatosEdicionConsumosServicios=this.jScrollPanelDatosEdicionConsumosServicios;
		final JPanel jPanelAccionesConsumosServicios=this.jPanelAccionesConsumosServicios;
		
		JPanel jPanelCamposAuxiliarConsumosServicios=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConsumosServicios=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			jPanelCamposAuxiliarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jPanelCamposConsumosServicios;
			jPanelAccionesFormularioAuxiliarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jPanelAccionesFormularioConsumosServicios;
		}
		
		final JPanel jPanelCamposConsumosServicios=jPanelCamposAuxiliarConsumosServicios;
		final JPanel jPanelAccionesFormularioConsumosServicios=jPanelAccionesFormularioAuxiliarConsumosServicios;
		
		
		final JMenuBar jmenuBarConsumosServicios=this.jmenuBarConsumosServicios;
		final JToolBar jTtoolBarConsumosServicios=this.jTtoolBarConsumosServicios;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConsumosServicios=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConsumosServicios=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			jmenuBarDetalleAuxiliarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jmenuBarDetalleConsumosServicios;
			jTtoolBarDetalleAuxiliarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jTtoolBarDetalleConsumosServicios;
		}
		
		final JMenuBar jmenuBarDetalleConsumosServicios=jmenuBarDetalleAuxiliarConsumosServicios;
		final JToolBar jTtoolBarDetalleConsumosServicios=jTtoolBarDetalleAuxiliarConsumosServicios;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConsumosServicios;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConsumosServicios;
			processRunnable.jTableDatos=jTableDatosConsumosServicios;
			processRunnable.jPanelCampos=jPanelCamposConsumosServicios;
			processRunnable.jPanelPaginacion=jPanelPaginacionConsumosServicios;
			processRunnable.jPanelAcciones=jPanelAccionesConsumosServicios;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConsumosServicios;
			
			
			processRunnable.jmenuBar=jmenuBarConsumosServicios;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConsumosServicios;
			processRunnable.jTtoolBar=jTtoolBarConsumosServicios;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConsumosServicios;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConsumosServicios ,jPanelParametrosReportesConsumosServicios,jTableDatosConsumosServicios, /*jScrollPanelDatosConsumosServicios,*/jPanelCamposConsumosServicios,jPanelPaginacionConsumosServicios, /*jScrollPanelDatosEdicionConsumosServicios,*/ jPanelAccionesConsumosServicios,jPanelAccionesFormularioConsumosServicios,jmenuBarConsumosServicios,jmenuBarDetalleConsumosServicios,jTtoolBarConsumosServicios,jTtoolBarDetalleConsumosServicios);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConsumosServicios ,jPanelParametrosReportesConsumosServicios, jScrollPanelDatosConsumosServicios,jPanelPaginacionConsumosServicios, jScrollPanelDatosEdicionConsumosServicios, jPanelAccionesConsumosServicios,jPanelAccionesFormularioConsumosServicios,jmenuBarConsumosServicios,jmenuBarDetalleConsumosServicios,jTtoolBarConsumosServicios,jTtoolBarDetalleConsumosServicios);
						
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
	
	public void finishProcessConsumosServicios() {// throws Exception 
		this.finishProcessConsumosServicios(true);
	}
	
	public void finishProcessConsumosServicios(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConsumosServicios ,this.jPanelParametrosReportesConsumosServicios, this.jScrollPanelDatosConsumosServicios,this.jPanelPaginacionConsumosServicios, this.jScrollPanelDatosEdicionConsumosServicios, this.jPanelAccionesConsumosServicios,this.jPanelAccionesFormularioConsumosServicios,this.jmenuBarConsumosServicios,this.jmenuBarDetalleConsumosServicios,this.jTtoolBarConsumosServicios,this.jTtoolBarDetalleConsumosServicios);		
		
		final JTabbedPane jTabbedPaneBusquedasConsumosServicios=this.jTabbedPaneBusquedasConsumosServicios; 
		
		final JPanel jPanelParametrosReportesConsumosServicios=this.jPanelParametrosReportesConsumosServicios;
		//final JScrollPane jScrollPanelDatosConsumosServicios=this.jScrollPanelDatosConsumosServicios;
		final JTable jTableDatosConsumosServicios=this.jTableDatosConsumosServicios;		
		final JPanel jPanelPaginacionConsumosServicios=this.jPanelPaginacionConsumosServicios;
		//final JScrollPane jScrollPanelDatosEdicionConsumosServicios=this.jScrollPanelDatosEdicionConsumosServicios;
		final JPanel jPanelAccionesConsumosServicios=this.jPanelAccionesConsumosServicios;
		
		JPanel jPanelCamposAuxiliarConsumosServicios=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConsumosServicios=new JPanel();
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			jPanelCamposAuxiliarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jPanelCamposConsumosServicios;
			jPanelAccionesFormularioAuxiliarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jPanelAccionesFormularioConsumosServicios;
		}
		
		final JPanel jPanelCamposConsumosServicios=jPanelCamposAuxiliarConsumosServicios;
		final JPanel jPanelAccionesFormularioConsumosServicios=jPanelAccionesFormularioAuxiliarConsumosServicios;
		
		
		final JMenuBar jmenuBarConsumosServicios=this.jmenuBarConsumosServicios;		
		final JToolBar jTtoolBarConsumosServicios=this.jTtoolBarConsumosServicios;
				
		JMenuBar jmenuBarDetalleAuxiliarConsumosServicios=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConsumosServicios=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			jmenuBarDetalleAuxiliarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jmenuBarDetalleConsumosServicios;
			jTtoolBarDetalleAuxiliarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jTtoolBarDetalleConsumosServicios;		
		}
		
		final JMenuBar jmenuBarDetalleConsumosServicios=jmenuBarDetalleAuxiliarConsumosServicios;
		final JToolBar jTtoolBarDetalleConsumosServicios=jTtoolBarDetalleAuxiliarConsumosServicios;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConsumosServicios;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConsumosServicios;
			processRunnable.jTableDatos=jTableDatosConsumosServicios;
			processRunnable.jPanelCampos=jPanelCamposConsumosServicios;
			processRunnable.jPanelPaginacion=jPanelPaginacionConsumosServicios;
			processRunnable.jPanelAcciones=jPanelAccionesConsumosServicios;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConsumosServicios;
			
			
			processRunnable.jmenuBar=jmenuBarConsumosServicios;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConsumosServicios;
			processRunnable.jTtoolBar=jTtoolBarConsumosServicios;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConsumosServicios;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConsumosServicios ,jPanelParametrosReportesConsumosServicios, jTableDatosConsumosServicios,/*jScrollPanelDatosConsumosServicios,*/jPanelCamposConsumosServicios,jPanelPaginacionConsumosServicios, /*jScrollPanelDatosEdicionConsumosServicios,*/ jPanelAccionesConsumosServicios,jPanelAccionesFormularioConsumosServicios,jmenuBarConsumosServicios,jmenuBarDetalleConsumosServicios,jTtoolBarConsumosServicios,jTtoolBarDetalleConsumosServicios));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConsumosServicios(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConsumosServicios(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConsumosServicios(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConsumosServicios(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConsumosServicios,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConsumosServicios,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConsumosServicios(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConsumosServicios,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConsumosServicios,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.consumosserviciosConstantesFunciones.getsFinalQueryConsumosServicios();
		String  finalQueryPaginacionTodos=this.consumosserviciosConstantesFunciones.getsFinalQueryConsumosServicios();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConsumosServiciosConstantesFunciones.getArrayColumnasGlobalesNoConsumosServicios(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConsumosServiciosConstantesFunciones.getArrayColumnasGlobalesConsumosServicios(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConsumosServiciosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.consumosserviciossEliminados= new ArrayList<ConsumosServicios>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConsumosServicios();
		
				///*ConsumosServiciosSessionBean*/this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean();
			
			if(this.consumosserviciosSessionBean==null) {
				this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean();
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
					this.iNumeroPaginacion=ConsumosServiciosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConsumosServiciosConstantesFunciones.getClassesForeignKeysOfConsumosServicios(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/consumosservicios."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			consumosserviciossAux= new ArrayList<ConsumosServicios>();
			
				
			consumosserviciosLogic.setDatosCliente(this.datosCliente);
			consumosserviciosLogic.setDatosDeep(this.datosDeep);
			consumosserviciosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaConsumosServicios")) {
				this.sDetalleReporte=ConsumosServiciosConstantesFunciones.getDetalleIndiceBusquedaConsumosServicios(id_transaccionBusquedaConsumosServicios,id_lineaBusquedaConsumosServicios,id_linea_grupoBusquedaConsumosServicios,id_linea_categoriaBusquedaConsumosServicios,id_linea_marcaBusquedaConsumosServicios,id_tipo_producto_servicioBusquedaConsumosServicios,fecha_emision_desdeBusquedaConsumosServicios,fecha_emision_hastaBusquedaConsumosServicios);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					consumosserviciosLogic.getConsumosServiciossBusquedaConsumosServicios(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_transaccionBusquedaConsumosServicios,id_lineaBusquedaConsumosServicios,id_linea_grupoBusquedaConsumosServicios,id_linea_categoriaBusquedaConsumosServicios,id_linea_marcaBusquedaConsumosServicios,id_tipo_producto_servicioBusquedaConsumosServicios,fecha_emision_desdeBusquedaConsumosServicios,fecha_emision_hastaBusquedaConsumosServicios);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsumosServiciosConstantesFunciones.getDetalleIndiceBusquedaConsumosServicios(id_transaccionBusquedaConsumosServicios,id_lineaBusquedaConsumosServicios,id_linea_grupoBusquedaConsumosServicios,id_linea_categoriaBusquedaConsumosServicios,id_linea_marcaBusquedaConsumosServicios,id_tipo_producto_servicioBusquedaConsumosServicios,fecha_emision_desdeBusquedaConsumosServicios,fecha_emision_hastaBusquedaConsumosServicios);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsumosServiciosConstantesFunciones.getDetalleIndiceBusquedaConsumosServicios(id_transaccionBusquedaConsumosServicios,id_lineaBusquedaConsumosServicios,id_linea_grupoBusquedaConsumosServicios,id_linea_categoriaBusquedaConsumosServicios,id_linea_marcaBusquedaConsumosServicios,id_tipo_producto_servicioBusquedaConsumosServicios,fecha_emision_desdeBusquedaConsumosServicios,fecha_emision_hastaBusquedaConsumosServicios);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=consumosserviciosLogic.getConsumosServicioss()==null||consumosserviciosLogic.getConsumosServicioss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=consumosservicioss==null|| consumosservicioss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						consumosserviciossAux=new ArrayList<ConsumosServicios>();
						consumosserviciossAux.addAll(consumosserviciosLogic.getConsumosServicioss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consumosserviciossAux=new ArrayList<ConsumosServicios>();
							consumosserviciossAux.addAll(consumosservicioss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							consumosserviciosLogic.getConsumosServiciossBusquedaConsumosServicios(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_transaccionBusquedaConsumosServicios,id_lineaBusquedaConsumosServicios,id_linea_grupoBusquedaConsumosServicios,id_linea_categoriaBusquedaConsumosServicios,id_linea_marcaBusquedaConsumosServicios,id_tipo_producto_servicioBusquedaConsumosServicios,fecha_emision_desdeBusquedaConsumosServicios,fecha_emision_hastaBusquedaConsumosServicios);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsumosServiciosConstantesFunciones.getDetalleIndiceBusquedaConsumosServicios(id_transaccionBusquedaConsumosServicios,id_lineaBusquedaConsumosServicios,id_linea_grupoBusquedaConsumosServicios,id_linea_categoriaBusquedaConsumosServicios,id_linea_marcaBusquedaConsumosServicios,id_tipo_producto_servicioBusquedaConsumosServicios,fecha_emision_desdeBusquedaConsumosServicios,fecha_emision_hastaBusquedaConsumosServicios);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsumosServiciosConstantesFunciones.getDetalleIndiceBusquedaConsumosServicios(id_transaccionBusquedaConsumosServicios,id_lineaBusquedaConsumosServicios,id_linea_grupoBusquedaConsumosServicios,id_linea_categoriaBusquedaConsumosServicios,id_linea_marcaBusquedaConsumosServicios,id_tipo_producto_servicioBusquedaConsumosServicios,fecha_emision_desdeBusquedaConsumosServicios,fecha_emision_hastaBusquedaConsumosServicios);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConsumosServicioss("BusquedaConsumosServicios",consumosserviciosLogic.getConsumosServicioss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConsumosServicioss("BusquedaConsumosServicios",consumosservicioss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						consumosserviciosLogic.setConsumosServicioss(new ArrayList<ConsumosServicios>());
						consumosserviciosLogic.getConsumosServicioss().addAll(consumosserviciossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consumosservicioss=new ArrayList<ConsumosServicios>();
							consumosservicioss.addAll(consumosserviciossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConsumosServicios();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConsumosServicios();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=consumosserviciosLogic.getConsumosServicioss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consumosservicioss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=consumosserviciosLogic.getConsumosServicioss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consumosservicioss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ConsumosServicios consumosservicios) {
		Boolean permite=true;
		
		if(this.consumosservicios.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConsumosServiciosConstantesFunciones.getOrderByListaConsumosServicios();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConsumosServiciosConstantesFunciones.getOrderByListaConsumosServicios();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsumosServicios consumosservicios:consumosserviciosLogic.getConsumosServicioss()) {
				if(consumosservicios.getsType().equals(Constantes2.S_TOTALES)) {
					consumosserviciosTotales=consumosservicios;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsumosServicios consumosservicios:this.consumosservicioss) {
				if(consumosservicios.getsType().equals(Constantes2.S_TOTALES)) {
					consumosserviciosTotales=consumosservicios;
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
			this.consumosserviciosAux=new ConsumosServicios();
			this.consumosserviciosAux.setsType(Constantes2.S_TOTALES);
			this.consumosserviciosAux.setIsNew(false);
			this.consumosserviciosAux.setIsChanged(false);
			this.consumosserviciosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ConsumosServiciosConstantesFunciones.TotalizarValoresFilaConsumosServicios(this.consumosserviciosLogic.getConsumosServicioss(),this.consumosserviciosAux);
				
				//this.consumosserviciosLogic.getConsumosServicioss().add(this.consumosserviciosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ConsumosServiciosConstantesFunciones.TotalizarValoresFilaConsumosServicios(this.consumosservicioss,this.consumosserviciosAux);
				
				this.consumosservicioss.add(this.consumosserviciosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		consumosserviciosTotales=new ConsumosServicios();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.consumosserviciosLogic.getConsumosServicioss().remove(consumosserviciosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.consumosservicioss.remove(consumosserviciosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		consumosserviciosTotales=new ConsumosServicios();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsumosServicios consumosservicios:consumosserviciosLogic.getConsumosServicioss()) {
				if(consumosservicios.getsType().equals(Constantes2.S_TOTALES)) {
					consumosserviciosTotales=consumosservicios;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConsumosServiciosConstantesFunciones.TotalizarValoresFilaConsumosServicios(this.consumosserviciosLogic.getConsumosServicioss(),consumosserviciosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsumosServicios consumosservicios:this.consumosservicioss) {
				if(consumosservicios.getsType().equals(Constantes2.S_TOTALES)) {
					consumosserviciosTotales=consumosservicios;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConsumosServiciosConstantesFunciones.TotalizarValoresFilaConsumosServicios(this.consumosservicioss,consumosserviciosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConsumosServiciossBusquedaConsumosServicios()throws Exception {
		try {
			sAccionBusqueda="BusquedaConsumosServicios";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosServiciossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosServiciossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosServiciossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosServiciossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosServiciossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosServiciossFK_IdTipoProductoServicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProductoServicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosServiciossFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConsumosServiciossBusquedaConsumosServicios(String sFinalQuery,Long id_transaccion,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Long id_tipo_producto_servicio,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosserviciosLogic.getConsumosServiciossBusquedaConsumosServicios(sFinalQuery,this.pagination,id_transaccion,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,id_tipo_producto_servicio,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosServiciossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosserviciosLogic.getConsumosServiciossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosServiciossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosserviciosLogic.getConsumosServiciossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosServiciossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosserviciosLogic.getConsumosServiciossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosServiciossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosserviciosLogic.getConsumosServiciossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosServiciossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosserviciosLogic.getConsumosServiciossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosServiciossFK_IdTipoProductoServicio(String sFinalQuery,Long id_tipo_producto_servicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosserviciosLogic.getConsumosServiciossFK_IdTipoProductoServicio(sFinalQuery,this.pagination,id_tipo_producto_servicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosServiciossFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosserviciosLogic.getConsumosServiciossFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
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
	
	public void inicializarPermisosConsumosServicios() {
		this.isPermisoTodoConsumosServicios=false;
		this.isPermisoNuevoConsumosServicios=false;
		this.isPermisoActualizarConsumosServicios=false;
		this.isPermisoActualizarOriginalConsumosServicios=false;
		this.isPermisoEliminarConsumosServicios=false;
		this.isPermisoGuardarCambiosConsumosServicios=false;
		this.isPermisoConsultaConsumosServicios=true;
		this.isPermisoBusquedaConsumosServicios=true;
		this.isPermisoReporteConsumosServicios=true;
		this.isPermisoOrdenConsumosServicios=false;		
		this.isPermisoPaginacionMedioConsumosServicios=false;		
		this.isPermisoPaginacionAltoConsumosServicios=false;		
		this.isPermisoPaginacionTodoConsumosServicios=false;		
		this.isPermisoCopiarConsumosServicios=false;		
		this.isPermisoVerFormConsumosServicios=false;		
		this.isPermisoDuplicarConsumosServicios=false;
		this.isPermisoOrdenConsumosServicios=false;
	}
	
	public void setPermisosUsuarioConsumosServicios(Boolean isPermiso) {
		this.isPermisoTodoConsumosServicios=isPermiso;
		this.isPermisoNuevoConsumosServicios=isPermiso;
		this.isPermisoActualizarConsumosServicios=isPermiso;
		this.isPermisoActualizarOriginalConsumosServicios=isPermiso;
		this.isPermisoEliminarConsumosServicios=isPermiso;
		this.isPermisoGuardarCambiosConsumosServicios=isPermiso;
		this.isPermisoConsultaConsumosServicios=isPermiso;
		this.isPermisoBusquedaConsumosServicios=isPermiso;
		this.isPermisoReporteConsumosServicios=isPermiso;
		this.isPermisoOrdenConsumosServicios=isPermiso;		
		this.isPermisoPaginacionMedioConsumosServicios=isPermiso;		
		this.isPermisoPaginacionAltoConsumosServicios=isPermiso;		
		this.isPermisoPaginacionTodoConsumosServicios=isPermiso;		
		this.isPermisoCopiarConsumosServicios=isPermiso;		
		this.isPermisoVerFormConsumosServicios=isPermiso;		
		this.isPermisoDuplicarConsumosServicios=isPermiso;
		this.isPermisoOrdenConsumosServicios=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConsumosServicios(Boolean isPermiso) {
		//this.isPermisoTodoConsumosServicios=isPermiso;
		this.isPermisoNuevoConsumosServicios=isPermiso;
		this.isPermisoActualizarConsumosServicios=isPermiso;
		this.isPermisoActualizarOriginalConsumosServicios=isPermiso;
		this.isPermisoEliminarConsumosServicios=isPermiso;
		this.isPermisoGuardarCambiosConsumosServicios=isPermiso;
		//this.isPermisoConsultaConsumosServicios=isPermiso;
		//this.isPermisoBusquedaConsumosServicios=isPermiso;
		//this.isPermisoReporteConsumosServicios=isPermiso;
		//this.isPermisoOrdenConsumosServicios=isPermiso;		
		//this.isPermisoPaginacionMedioConsumosServicios=isPermiso;		
		//this.isPermisoPaginacionAltoConsumosServicios=isPermiso;		
		//this.isPermisoPaginacionTodoConsumosServicios=isPermiso;		
		//this.isPermisoCopiarConsumosServicios=isPermiso;		
		//this.isPermisoDuplicarConsumosServicios=isPermiso;
		//this.isPermisoOrdenConsumosServicios=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConsumosServiciosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ConsumosServiciosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebConsumosServicios(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConsumosServiciosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioConsumosServiciosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConsumosServiciosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConsumosServiciosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioConsumosServicios() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConsumosServiciosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConsumosServiciosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConsumosServicios=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConsumosServicios=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConsumosServicios=this.isPermisoActualizarConsumosServicios;
			this.isPermisoEliminarConsumosServicios=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConsumosServicios=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConsumosServicios=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConsumosServicios=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConsumosServicios=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConsumosServicios=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConsumosServicios=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConsumosServicios=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConsumosServicios=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConsumosServicios=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConsumosServicios=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConsumosServicios=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConsumosServicios=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConsumosServicios=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConsumosServicios.setToolTipText(this.jTableDatosConsumosServicios.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConsumosServicios(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConsumosServicios(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConsumosServiciosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConsumosServiciosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConsumosServicios() throws Exception {
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
	public void inicializarCombosForeignKeyConsumosServiciosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
				this.tipoproductoserviciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyConsumosServiciosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConsumosServiciosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProductoServicioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTransaccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoriaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarcaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProductoServicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoproductoserviciosForeignKey==null||this.tipoproductoserviciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoProductoServicioConstantesFunciones.getArrayColumnasGlobalesTipoProductoServicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoServicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoProductoServicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoProductoServiciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyConsumosServicios()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTransaccion();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
			this.addItemDefectoCombosForeignKeyTipoProductoServicio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.consumosserviciosSessionBean==null) {
				this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean();
			}

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				Transaccion transaccion=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionsForeignKey,transaccion,true)) {

					this.transaccionsForeignKey.add(0,transaccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				Linea linea=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(linea,Constantes.SMENSAJE_ESCOJA_OPCION);
				linea.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineasForeignKey,linea,true)) {

					this.lineasForeignKey.add(0,linea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaGrupo()throws Exception {
		try {

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				Linea lineagrupo=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineagrupo,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineagrupo.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineagruposForeignKey,lineagrupo,true)) {

					this.lineagruposForeignKey.add(0,lineagrupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaCategoria()throws Exception {
		try {

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				Linea lineacategoria=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineacategoria,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineacategoria.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineacategoriasForeignKey,lineacategoria,true)) {

					this.lineacategoriasForeignKey.add(0,lineacategoria);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaMarca()throws Exception {
		try {

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				Linea lineamarca=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineamarca,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineamarca.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineamarcasForeignKey,lineamarca,true)) {

					this.lineamarcasForeignKey.add(0,lineamarca);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoProductoServicio()throws Exception {
		try {

			if(!this.consumosserviciosSessionBean.getisBusquedaDesdeForeignKeySesionTipoProductoServicio()) {
				TipoProductoServicio tipoproductoservicio=new TipoProductoServicio();
				TipoProductoServicioConstantesFunciones.setTipoProductoServicioDescripcion(tipoproductoservicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoproductoservicio.setId(null);

				if(!TipoProductoServicioConstantesFunciones.ExisteEnLista(this.tipoproductoserviciosForeignKey,tipoproductoservicio,true)) {

					this.tipoproductoserviciosForeignKey.add(0,tipoproductoservicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyConsumosServicios()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConsumosServicios(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConsumosServicios()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConsumosServicios();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConsumosServicios(ConsumosServicios consumosservicios)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConsumosServicios(ConsumosServicios consumosservicios,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConsumosServicios()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConsumosServicios()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConsumosServicios()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConsumosServicios()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConsumosServicios()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConsumosServicios()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");
			this.cargarCombosFrameTipoProductoServiciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyConsumosServicios(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProductoServiciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyConsumosServicios()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public ConsumosServiciosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConsumosServiciosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConsumosServiciosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.consumosserviciosSessionBean=new ConsumosServiciosSessionBean(); 
		this.consumosserviciosConstantesFunciones=new ConsumosServiciosConstantesFunciones(); 
		this.consumosserviciosBean=new ConsumosServicios();//(this.consumosserviciosConstantesFunciones); 		
		this.consumosserviciosReturnGeneral=new ConsumosServiciosParameterReturnGeneral(); 
		
		this.consumosserviciosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consumosserviciosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConsumosServiciosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConsumosServiciosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConsumosServiciosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConsumosServicios(true);
			
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
			
			this.consumosserviciosConstantesFunciones=new ConsumosServiciosConstantesFunciones(); 
			this.consumosserviciosBean=new ConsumosServicios();//this.consumosserviciosConstantesFunciones); 			
			this.consumosserviciosReturnGeneral=new ConsumosServiciosParameterReturnGeneral(); 
		
			ConsumosServiciosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consumos Servicios Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.consumosservicios=new ConsumosServicios();
			this.consumosservicioss = new ArrayList<ConsumosServicios>();
			this.consumosserviciossAux = new ArrayList<ConsumosServicios>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic=new ConsumosServiciosLogic();
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}
			
			//this.consumosserviciosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.consumosserviciosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConsumosServicios);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConsumosServicios!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConsumosServicios);	
					}
					
					if(this.jInternalFrameImportacionConsumosServicios!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConsumosServicios);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConsumosServicios!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConsumosServicios);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConsumosServicios);
				this.jInternalFrameDetalleFormConsumosServicios.setVisible(false);
				this.jInternalFrameDetalleFormConsumosServicios.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConsumosServicios!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConsumosServicios);
					this.jInternalFrameReporteDinamicoConsumosServicios.setVisible(false);
					this.jInternalFrameReporteDinamicoConsumosServicios.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConsumosServicios!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConsumosServicios);
					this.jInternalFrameImportacionConsumosServicios.setVisible(false);
					this.jInternalFrameImportacionConsumosServicios.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConsumosServicios!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConsumosServicios);
					this.jInternalFrameOrderByConsumosServicios.setVisible(false);
					this.jInternalFrameOrderByConsumosServicios.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConsumosServiciosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConsumosServiciosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.consumosserviciosReturnGeneral=new ConsumosServiciosParameterReturnGeneral();
			
			this.consumosserviciosParameterGeneral=new ConsumosServiciosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.consumosserviciosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConsumosServiciosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConsumosServiciosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.consumosserviciosSessionBean.getEsGuardarRelacionado(),this.consumosserviciosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConsumosServiciosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.consumosserviciosSessionBean.getEsGuardarRelacionado(),this.consumosserviciosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConsumosServicios=false;
			this.isVisibilidadCeldaDuplicarConsumosServicios=true;
			this.isVisibilidadCeldaCopiarConsumosServicios=true;
			this.isVisibilidadCeldaVerFormConsumosServicios=true;
			this.isVisibilidadCeldaOrdenConsumosServicios=true;
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=false;
			this.isVisibilidadCeldaModificarConsumosServicios=false;
			this.isVisibilidadCeldaActualizarConsumosServicios=false;
			this.isVisibilidadCeldaEliminarConsumosServicios=false;
			this.isVisibilidadCeldaCancelarConsumosServicios=false;
			this.isVisibilidadCeldaGuardarConsumosServicios=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosServicios=false;
			
			
			this.isVisibilidadBusquedaConsumosServicios=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdTipoProductoServicio=true;
			this.isVisibilidadFK_IdTransaccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesConsumosServicios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConsumosServicios();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConsumosServicios(false);
			
			this.setPermisosUsuarioConsumosServicios();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado() 
				|| (this.consumosserviciosSessionBean.getEsGuardarRelacionado() && this.consumosserviciosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConsumosServiciosClasesRelacionadas();
			}
			
			if(this.consumosserviciosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConsumosServiciosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConsumosServicios();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConsumosServicios();
			}
			
			if(!this.isPermisoBusquedaConsumosServicios) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConsumosServicios.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConsumosServiciosConstantesFunciones.getTiposSeleccionarConsumosServicios());
				
				this.tiposColumnasSelect=ConsumosServiciosConstantesFunciones.getTiposSeleccionarConsumosServicios(true);
				
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
			//if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConsumosServicios();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioConsumosServicios(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioConsumosServicios(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConsumosServicios() ;
			
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
			this.transaccionLogic=new TransaccionLogic();
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			this.tipoproductoservicioLogic=new TipoProductoServicioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				consumosserviciosImplementable= (ConsumosServiciosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConsumosServiciosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				consumosserviciosImplementableHome= (ConsumosServiciosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConsumosServiciosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.consumosservicioss= new ArrayList<ConsumosServicios>();
			this.consumosserviciossEliminados= new ArrayList<ConsumosServicios>();
						
			this.isEsNuevoConsumosServicios=false;
			this.esParaAccionDesdeFormularioConsumosServicios=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			this.tipoproductoserviciosForeignKey=new ArrayList<TipoProductoServicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyConsumosServicios(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConsumosServicios();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ConsumosServiciosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConsumosServiciosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConsumosServicios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConsumosServicios(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConsumosServicios!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConsumosServicios();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConsumosServicios();
			}
			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConsumosServicios.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConsumosServicios.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConsumosServicios.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConsumosServicios(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ConsumosServicios: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConsumosServicios() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConsumosServicios")) {
				iIndex=this.jInternalFrameDetalleFormConsumosServicios.jTabbedPaneRelacionesConsumosServicios.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConsumosServicios.jTabbedPaneRelacionesConsumosServicios.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConsumosServicios();	
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
	
	public void cargarCombosForeignKeyConsumosServicios(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConsumosServicios(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConsumosServicios(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConsumosServiciosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConsumosServicios();
		
		this.cargarCombosFrameForeignKeyConsumosServicios();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConsumosServicios();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConsumosServicios();
		}
	}
	
	

	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion(this.transaccionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLinea(this.lineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaGrupo(this.lineagruposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaCategoria(this.lineacategoriasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarca(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaMarca(this.lineamarcasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProductoServicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoProductoServicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoProductoServicio();
				this.cargarCombosFrameTipoProductoServiciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoProductoServicio(this.tipoproductoserviciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoConsumosServiciosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.consumosserviciosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConsumosServicios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			
			
			if(jTableDatosConsumosServicios.getRowCount()>=1) {
				jTableDatosConsumosServicios.removeRowSelectionInterval(0, jTableDatosConsumosServicios.getRowCount()-1);						
			}
			
			this.isEsNuevoConsumosServicios=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConsumosServicios(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConsumosServicios(true);			
			//this.consumosservicios=new ConsumosServicios();
			//this.consumosservicios.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsumosServicios(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsumosServicios() ;
			
			if(ConsumosServiciosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsumosServicios(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.consumosservicios);	
			this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);				
			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			
			if(this.consumosserviciosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ConsumosServicios: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConsumosServiciosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConsumosServicios.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConsumosServicios.getSelectedRows().length;			
			}
			
			consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConsumosServicios--;			
				//ConsumosServicios consumosserviciosAux= new ConsumosServicios();			
				//consumosserviciosAux.setId(this.iIdNuevoConsumosServicios);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ConsumosServicios consumosserviciosOrigen=new ConsumosServicios();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ConsumosServicios consumosserviciosOrigen : consumosserviciossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							consumosserviciosOrigen =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consumosserviciosOrigen =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConsumosServicios();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.consumosservicios.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConsumosServicios(consumosserviciosOrigen,this.consumosservicios,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.consumosserviciosLogic.getConsumosServicioss().add(this.consumosserviciosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.consumosservicioss.add(this.consumosserviciosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConsumosServicios(false);
				
				this.jTableDatosConsumosServicios.setRowSelectionInterval(this.getIndiceNuevoConsumosServicios(), this.getIndiceNuevoConsumosServicios());
				
				int iLastRow =  this.jTableDatosConsumosServicios.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConsumosServicios.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConsumosServicios.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConsumosServicios(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();									
		
			ConsumosServicios consumosserviciosOrigen=new ConsumosServicios();
			ConsumosServicios consumosserviciosDestino=new ConsumosServicios();
				
			consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConsumosServicios.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || consumosserviciossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConsumosServicios.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consumosserviciosOrigen =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						consumosserviciosOrigen =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consumosserviciosDestino =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						consumosserviciosDestino =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				consumosserviciosOrigen =consumosserviciossSeleccionados.get(0);
				consumosserviciosDestino =consumosserviciossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConsumosServicios(consumosserviciosOrigen,consumosserviciosDestino,true,false);
				
				consumosserviciosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(consumosserviciosDestino,consumosserviciosLogic.getConsumosServicioss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(consumosserviciosDestino,consumosservicioss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConsumosServicios(false);
				
				//this.jTableDatosConsumosServicios.setRowSelectionInterval(this.getIndiceNuevoConsumosServicios(), this.getIndiceNuevoConsumosServicios());
				
				int iLastRow =  this.jTableDatosConsumosServicios.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConsumosServicios.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConsumosServicios.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConsumosServicios(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConsumosServicios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConsumosServicios.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConsumosServicios.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConsumosServicios.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConsumosServicios.setVisible(!isVisible);
			this.jPanelPaginacionConsumosServicios.setVisible(!isVisible);
			this.jPanelAccionesConsumosServicios.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConsumosServicios();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConsumosServicios();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConsumosServicios();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConsumosServicios();
			
			this.abrirFrameOrderByConsumosServicios();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConsumosServicios();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConsumosServicios(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConsumosServicios);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConsumosServicios.isMaximum()) {
					this.jInternalFrameDetalleFormConsumosServicios.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConsumosServicios.setSize(this.jInternalFrameDetalleFormConsumosServicios.iWidthFormulario,this.jInternalFrameDetalleFormConsumosServicios.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConsumosServicios.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConsumosServicios.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConsumosServicios.isMaximum()) {
						this.jInternalFrameDetalleFormConsumosServicios.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConsumosServicios.jContentPaneDetalleConsumosServicios.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConsumosServicios.jTabbedPaneRelacionesConsumosServicios.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConsumosServicios.jContentPaneDetalleConsumosServicios.getWidth(),ConsumosServiciosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConsumosServicios.jTabbedPaneRelacionesConsumosServicios.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConsumosServicios.jContentPaneDetalleConsumosServicios.getWidth(),ConsumosServiciosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConsumosServicios.jTabbedPaneRelacionesConsumosServicios.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConsumosServicios.jContentPaneDetalleConsumosServicios.getWidth(),ConsumosServiciosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConsumosServicios.setVisible(true);
	        this.jInternalFrameDetalleFormConsumosServicios.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConsumosServicios() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConsumosServicios==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConsumosServicios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsumosServicios,false,this);
				} else {
					this.jInternalFrameOrderByConsumosServicios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsumosServicios,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConsumosServicios);
				this.jInternalFrameOrderByConsumosServicios.setVisible(false);
				this.jInternalFrameOrderByConsumosServicios.setSelected(false);
				
				this.jInternalFrameOrderByConsumosServicios.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConsumosServicios"));
				
				this.inicializarActualizarBindingTablaOrderByConsumosServicios();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConsumosServicios() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConsumosServicios==null) {
				
				this.jInternalFrameImportacionConsumosServicios=new ImportacionJInternalFrame(ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConsumosServicios);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConsumosServicios);
				this.jInternalFrameImportacionConsumosServicios.setVisible(false);
				this.jInternalFrameImportacionConsumosServicios.setSelected(false);


				this.jInternalFrameImportacionConsumosServicios.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConsumosServicios"));
				this.jInternalFrameImportacionConsumosServicios.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConsumosServicios"));
				this.jInternalFrameImportacionConsumosServicios.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConsumosServicios"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConsumosServicios() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConsumosServicios==null) {
				this.jInternalFrameReporteDinamicoConsumosServicios=new ReporteDinamicoJInternalFrame(ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConsumosServicios);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConsumosServicios);
				this.jInternalFrameReporteDinamicoConsumosServicios.setVisible(false);
				this.jInternalFrameReporteDinamicoConsumosServicios.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConsumosServicios.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsumosServicios"));
				this.jInternalFrameReporteDinamicoConsumosServicios.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsumosServicios"));
				this.jInternalFrameReporteDinamicoConsumosServicios.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsumosServicios"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsumosServicios();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleConsumosServicios() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConsumosServicios);
			
	       	this.jInternalFrameDetalleFormConsumosServicios.setVisible(false);
	        this.jInternalFrameDetalleFormConsumosServicios.setSelected(false);
			
			//this.jInternalFrameDetalleFormConsumosServicios.dispose();
			//this.jInternalFrameDetalleFormConsumosServicios=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConsumosServicios() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConsumosServicios.setVisible(true);
	        this.jInternalFrameReporteDinamicoConsumosServicios.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConsumosServicios() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConsumosServicios.setVisible(true);
	        this.jInternalFrameImportacionConsumosServicios.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConsumosServicios() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConsumosServicios.setVisible(true);
	        this.jInternalFrameOrderByConsumosServicios.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConsumosServicios() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConsumosServicios.setVisible(false);
	        this.jInternalFrameOrderByConsumosServicios.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConsumosServicios() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConsumosServicios.setVisible(false);
	        this.jInternalFrameReporteDinamicoConsumosServicios.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConsumosServicios() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConsumosServicios.setVisible(false);
	        this.jInternalFrameImportacionConsumosServicios.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConsumosServicios(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConsumosServicios(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConsumosServicios(true);
			//this.isEsNuevoConsumosServicios=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConsumosServicios("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsumosServicios(false) ;
			
			if(consumosserviciosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ConsumosServiciosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsumosServicios(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsumosServicios(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConsumosServiciosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConsumosServicios(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConsumosServicios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConsumosServicios(true);
			//this.isEsNuevoConsumosServicios=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.consumosservicios.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConsumosServicios("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConsumosServicios(false) ;
			
			if(ConsumosServiciosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsumosServicios(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsumosServicios(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConsumosServicios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConsumosServicios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaGrupo(List<Linea> lineagruposForeignKey)throws Exception{
		TableColumn tableColumnLineaGrupo=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConsumosServicios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagruposForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaCategoria(List<Linea> lineacategoriasForeignKey)throws Exception{
		TableColumn tableColumnLineaCategoria=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConsumosServicios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineacategoriasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaMarca(List<Linea> lineamarcasForeignKey)throws Exception{
		TableColumn tableColumnLineaMarca=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConsumosServicios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoProductoServicio(List<TipoProductoServicio> tipoproductoserviciosForeignKey)throws Exception{
		TableColumn tableColumnTipoProductoServicio=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO));
		TableCellEditor tableCellEditorTipoProductoServicio =tableColumnTipoProductoServicio.getCellEditor();

		TipoProductoServicioTableCell tipoproductoservicioTableCellFk=(TipoProductoServicioTableCell)tableCellEditorTipoProductoServicio;

		if(tipoproductoservicioTableCellFk!=null) {
			tipoproductoservicioTableCellFk.settipoproductoserviciosForeignKey(tipoproductoserviciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConsumosServicios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoservicioTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoservicioTableCellFk.settipoproductoserviciosForeignKeyActual(tipoproductoserviciosForeignKey);
		//}


		if(tipoproductoservicioTableCellFk!=null) {
			tipoproductoservicioTableCellFk.RecargarTipoProductoServiciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConsumosServicios(false);
			
			//if(!this.isEsNuevoConsumosServicios) {								
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				
			}
			
			if(this.permiteMantenimiento(this.consumosservicios)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConsumosServicios=true;
					this.inicializarActualizarBindingTablaConsumosServicios(false);
					this.isEsNuevoConsumosServicios=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConsumosServicios=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConsumosServicios=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConsumosServicios(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsumosServicios(false);
				
				this.habilitarDeshabilitarControlesConsumosServicios(false);
			
												
				
				if(ConsumosServiciosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConsumosServicios();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConsumosServiciosActionPerformed(evt,consumosserviciosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConsumosServicios(this.consumosservicios,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConsumosServicios.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,consumosserviciosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.consumosservicios.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ConsumosServicios.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosServicios.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				this.consumosservicios.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				this.consumosservicios.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.consumosservicios)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConsumosServiciosModel) this.jTableDatosConsumosServicios.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConsumosServicios=true;
				this.inicializarActualizarBindingTablaConsumosServicios(false);
				this.isEsNuevoConsumosServicios=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConsumosServicios(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsumosServicios(false);
				
				this.habilitarDeshabilitarControlesConsumosServicios(false);
				
				
				
				if(ConsumosServiciosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConsumosServicios();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConsumosServicios.getRowCount()>=1) {
				jTableDatosConsumosServicios.removeRowSelectionInterval(0, jTableDatosConsumosServicios.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConsumosServicios(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConsumosServicios(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsumosServicios(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsumosServicios(false) ;
			
			this.isEsNuevoConsumosServicios=false;
			
			if(ConsumosServiciosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConsumosServicios();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConsumosServicios(false);
				
				//SI ES MANUAL
				if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConsumosServicios();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConsumosServicios--;			
			//ConsumosServicios consumosserviciosAux= new ConsumosServicios();			
			//consumosserviciosAux.setId(this.iIdNuevoConsumosServicios);
			
			if(this.jInternalFrameDetalleFormConsumosServicios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConsumosServicios();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
			
			this.consumosservicios.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.consumosserviciosLogic.getConsumosServicioss().add(this.consumosserviciosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.consumosservicioss.add(this.consumosserviciosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConsumosServicios(false);
			
			this.jTableDatosConsumosServicios.setRowSelectionInterval(this.getIndiceNuevoConsumosServicios(), this.getIndiceNuevoConsumosServicios());
			
			int iLastRow =  this.jTableDatosConsumosServicios.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConsumosServicios.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConsumosServicios.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConsumosServicios(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConsumosServicios(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsumosServicios(false);
			
			//SI ES MANUAL
			if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsumosServicios();
			}
			
			//this.abrirFrameTreeConsumosServicios();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConsumosServicios.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConsumosServicios.setFileImportacion(this.jInternalFrameImportacionConsumosServicios.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConsumosServicios.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConsumosServicios.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConsumosServicios.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConsumosServicios.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();		

		consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConsumosServiciosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConsumosServiciosBaseDesign.jrxml";
			
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
			
			this.generarReporteConsumosServicioss("Todos",consumosserviciossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Servicios",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosServiciosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosServiciosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoConsumosServicios.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoria="nombre_linea";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoria="nombre_linea_grupo";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoria="nombre_linea_categoria";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoria="nombre_linea_marca";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoriaValor="nombre_linea";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoriaValor="nombre_linea_grupo";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoriaValor="nombre_linea_categoria";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoriaValor="nombre_linea_marca";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea");
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_grupo");
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_categoria");
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_marca");
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();		
		
		consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosservicios";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ConsumosServicioss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConsumosServiciosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.gettipoproductoservicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getnombre_linea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getnombre_linea_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getnombre_linea_categoria());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getnombre_linea_marca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosServiciosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(ConsumosServicios consumosservicios:consumosserviciossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosservicios.gettotal());
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
			//	this.getFilaCabeceraExportarExcelConsumosServicios(row);				
			//	iRow++;
			//}				
			
			//for(ConsumosServicios consumosserviciosAux:consumosserviciossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConsumosServicios(consumosserviciosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Servicios",JOptionPane.INFORMATION_MESSAGE);
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
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsumosServicios(false);
			
			//SI ES MANUAL
			if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsumosServicios();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsumosServicios(false);
			
			//SI ES MANUAL
			if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConsumosServicios();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsumosServicios(false);
			
			//SI ES MANUAL
			if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConsumosServicios();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConsumosServicios() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConsumosServicios.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConsumosServicios.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConsumosServicios.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConsumosServicios.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConsumosServicios.setMinimumSize(dimensionMinimum);
		this.jTableDatosConsumosServicios.setMaximumSize(dimensionMaximum);
		this.jTableDatosConsumosServicios.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConsumosServicios(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConsumosServicios(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConsumosServicios(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConsumosServicios(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConsumosServicios(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConsumosServicios(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConsumosServicios(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConsumosServicios(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConsumosServiciosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConsumosServicios() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConsumosServicios();
		
		this.inicializarActualizarBindingBotonesManualConsumosServicios(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConsumosServicios();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConsumosServicios() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConsumosServicios(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConsumosServicios(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConsumosServicios.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConsumosServicios.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConsumosServicios.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConsumosServicios.jCheckBoxPostAccionNuevoConsumosServicios.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConsumosServicios.jCheckBoxPostAccionSinCerrarConsumosServicios.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConsumosServicios.jCheckBoxPostAccionSinMensajeConsumosServicios.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConsumosServicios.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConsumosServicios.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConsumosServicios.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
				this.jInternalFrameDetalleFormConsumosServicios.jCheckBoxPostAccionNuevoConsumosServicios.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConsumosServicios.jCheckBoxPostAccionSinCerrarConsumosServicios.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConsumosServicios.jCheckBoxPostAccionSinMensajeConsumosServicios.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConsumosServicios.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConsumosServicios.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConsumosServicios.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConsumosServicios!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConsumosServicios.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConsumosServicios.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConsumosServicios.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConsumosServicios.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConsumosServicios!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConsumosServicios.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConsumosServicios.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConsumosServicios(Boolean esInicializar) throws Exception {
		try	{	
			if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConsumosServicios(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConsumosServicios() throws Exception {
		try	{
			if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConsumosServicios();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConsumosServicios() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConsumosServicios() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConsumosServicios.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConsumosServicios.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConsumosServicios.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConsumosServicios.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConsumosServicios.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConsumosServicios.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConsumosServicios.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConsumosServicios.addItem(reporte);
			}
			
			
			if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConsumosServicios.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConsumosServicios.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConsumosServicios.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConsumosServicios.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConsumosServicios.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConsumosServicios.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConsumosServicios.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConsumosServicios.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConsumosServicios.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsumosServicios();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsumosServicios() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConsumosServicios!=null) {
				this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConsumosServicios!=null) {
				this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConsumosServicios!=null) {
				
				if(this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConsumosServicios.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConsumosServicios.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsumosServicios.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ConsumosServiciosConstantesFunciones.getTiposSeleccionarConsumosServicios(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ConsumosServiciosConstantesFunciones.getTiposSeleccionarConsumosServicios(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ConsumosServiciosConstantesFunciones.getTiposSeleccionarConsumosServicios(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsumosServicios.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoConsumosServicios.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConsumosServicios()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.getSelectedItem()!=null){this.id_transaccionBusquedaConsumosServicios=((Transaccion)this.jComboBoxid_transaccionBusquedaConsumosServiciosConsumosServicios.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.getSelectedItem()!=null){this.id_lineaBusquedaConsumosServicios=((Linea)this.jComboBoxid_lineaBusquedaConsumosServiciosConsumosServicios.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.getSelectedItem()!=null){this.id_linea_grupoBusquedaConsumosServicios=((Linea)this.jComboBoxid_linea_grupoBusquedaConsumosServiciosConsumosServicios.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.getSelectedItem()!=null){this.id_linea_categoriaBusquedaConsumosServicios=((Linea)this.jComboBoxid_linea_categoriaBusquedaConsumosServiciosConsumosServicios.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.getSelectedItem()!=null){this.id_linea_marcaBusquedaConsumosServicios=((Linea)this.jComboBoxid_linea_marcaBusquedaConsumosServiciosConsumosServicios.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.getSelectedItem()!=null){this.id_tipo_producto_servicioBusquedaConsumosServicios=((TipoProductoServicio)this.jComboBoxid_tipo_producto_servicioBusquedaConsumosServiciosConsumosServicios.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaConsumosServicios=new Date(this.jDateChooserfecha_emision_desdeBusquedaConsumosServiciosConsumosServicios.getDate().getTime());
		this.fecha_emision_hastaBusquedaConsumosServicios=new Date(this.jDateChooserfecha_emision_hastaBusquedaConsumosServiciosConsumosServicios.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConsumosServicios(Boolean esInicializar) throws Exception {				
		if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConsumosServicios();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConsumosServicios() throws Exception {
		this.inicializarActualizarBindingTablaConsumosServicios(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConsumosServicios() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConsumosServiciosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServiciosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConsumosServicios(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=consumosserviciosLogic.getConsumosServicioss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=consumosservicioss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConsumosServicios.setModel(new ConsumosServiciosModel(this.consumosserviciosLogic.getConsumosServicioss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConsumosServicios.setModel(new ConsumosServiciosModel(this.consumosservicioss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConsumosServicios!=null && this.jInternalFrameOrderByConsumosServicios.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConsumosServicios();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO,consumosserviciosConstantesFunciones.resaltarSeleccionarConsumosServicios,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConsumosServiciosConstantesFunciones.SCLASSWEBTITULO,consumosserviciosConstantesFunciones.resaltarSeleccionarConsumosServicios,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_ID));

		if(this.consumosserviciosConstantesFunciones.mostraridConsumosServicios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosServiciosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consumosserviciosConstantesFunciones.resaltaridConsumosServicios,this.consumosserviciosConstantesFunciones.activaridConsumosServicios,iSizeTabla,this,true,"idConsumosServicios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosserviciosConstantesFunciones.resaltaridConsumosServicios,this.consumosserviciosConstantesFunciones.activaridConsumosServicios,this,true,"idConsumosServicios","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.consumosserviciosConstantesFunciones.mostrarnombre_unidadConsumosServicios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosserviciosConstantesFunciones.resaltarnombre_unidadConsumosServicios,this.consumosserviciosConstantesFunciones.activarnombre_unidadConsumosServicios,iSizeTabla,this,true,"nombre_unidadConsumosServicios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosserviciosConstantesFunciones.resaltarnombre_unidadConsumosServicios,this.consumosserviciosConstantesFunciones.activarnombre_unidadConsumosServicios,this,true,"nombre_unidadConsumosServicios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.consumosserviciosConstantesFunciones.mostrarnombre_productoConsumosServicios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosserviciosConstantesFunciones.resaltarnombre_productoConsumosServicios,this.consumosserviciosConstantesFunciones.activarnombre_productoConsumosServicios,iSizeTabla,this,true,"nombre_productoConsumosServicios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosserviciosConstantesFunciones.resaltarnombre_productoConsumosServicios,this.consumosserviciosConstantesFunciones.activarnombre_productoConsumosServicios,this,true,"nombre_productoConsumosServicios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD));

		if(this.consumosserviciosConstantesFunciones.mostrarcantidadConsumosServicios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consumosserviciosConstantesFunciones.resaltarcantidadConsumosServicios,this.consumosserviciosConstantesFunciones.activarcantidadConsumosServicios,iSizeTabla,this,true,"cantidadConsumosServicios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosserviciosConstantesFunciones.resaltarcantidadConsumosServicios,this.consumosserviciosConstantesFunciones.activarcantidadConsumosServicios,this,true,"cantidadConsumosServicios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA));

		if(this.consumosserviciosConstantesFunciones.mostrarnombre_lineaConsumosServicios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosserviciosConstantesFunciones.resaltarnombre_lineaConsumosServicios,this.consumosserviciosConstantesFunciones.activarnombre_lineaConsumosServicios,iSizeTabla,this,true,"nombre_lineaConsumosServicios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosserviciosConstantesFunciones.resaltarnombre_lineaConsumosServicios,this.consumosserviciosConstantesFunciones.activarnombre_lineaConsumosServicios,this,true,"nombre_lineaConsumosServicios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO));

		if(this.consumosserviciosConstantesFunciones.mostrarnombre_linea_grupoConsumosServicios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosserviciosConstantesFunciones.resaltarnombre_linea_grupoConsumosServicios,this.consumosserviciosConstantesFunciones.activarnombre_linea_grupoConsumosServicios,iSizeTabla,this,true,"nombre_linea_grupoConsumosServicios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosserviciosConstantesFunciones.resaltarnombre_linea_grupoConsumosServicios,this.consumosserviciosConstantesFunciones.activarnombre_linea_grupoConsumosServicios,this,true,"nombre_linea_grupoConsumosServicios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA));

		if(this.consumosserviciosConstantesFunciones.mostrarnombre_linea_categoriaConsumosServicios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosserviciosConstantesFunciones.resaltarnombre_linea_categoriaConsumosServicios,this.consumosserviciosConstantesFunciones.activarnombre_linea_categoriaConsumosServicios,iSizeTabla,this,true,"nombre_linea_categoriaConsumosServicios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosserviciosConstantesFunciones.resaltarnombre_linea_categoriaConsumosServicios,this.consumosserviciosConstantesFunciones.activarnombre_linea_categoriaConsumosServicios,this,true,"nombre_linea_categoriaConsumosServicios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA));

		if(this.consumosserviciosConstantesFunciones.mostrarnombre_linea_marcaConsumosServicios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosserviciosConstantesFunciones.resaltarnombre_linea_marcaConsumosServicios,this.consumosserviciosConstantesFunciones.activarnombre_linea_marcaConsumosServicios,iSizeTabla,this,true,"nombre_linea_marcaConsumosServicios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosserviciosConstantesFunciones.resaltarnombre_linea_marcaConsumosServicios,this.consumosserviciosConstantesFunciones.activarnombre_linea_marcaConsumosServicios,this,true,"nombre_linea_marcaConsumosServicios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_CODIGO));

		if(this.consumosserviciosConstantesFunciones.mostrarcodigoConsumosServicios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosServiciosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosserviciosConstantesFunciones.resaltarcodigoConsumosServicios,this.consumosserviciosConstantesFunciones.activarcodigoConsumosServicios,iSizeTabla,this,true,"codigoConsumosServicios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosserviciosConstantesFunciones.resaltarcodigoConsumosServicios,this.consumosserviciosConstantesFunciones.activarcodigoConsumosServicios,this,true,"codigoConsumosServicios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,ConsumosServiciosConstantesFunciones.LABEL_TOTAL));

		if(this.consumosserviciosConstantesFunciones.mostrartotalConsumosServicios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosServiciosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consumosserviciosConstantesFunciones.resaltartotalConsumosServicios,this.consumosserviciosConstantesFunciones.activartotalConsumosServicios,iSizeTabla,this,true,"totalConsumosServicios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosserviciosConstantesFunciones.resaltartotalConsumosServicios,this.consumosserviciosConstantesFunciones.activartotalConsumosServicios,this,true,"totalConsumosServicios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConsumosServiciosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.consumosserviciosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.consumosserviciosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConsumosServicios.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.consumosserviciosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.consumosserviciosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConsumosServicios.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.consumosserviciosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.consumosserviciosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConsumosServicios.addColumn(tableColumn);
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
			
			this.jTableDatosConsumosServicios.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConsumosServicios.moveColumn(this.jTableDatosConsumosServicios.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConsumosServicios.moveColumn(this.jTableDatosConsumosServicios.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConsumosServicios.moveColumn(this.jTableDatosConsumosServicios.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConsumosServicios.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConsumosServicios.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConsumosServicios,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConsumosServicios.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConsumosServicios.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConsumosServiciosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConsumosServicios.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConsumosServicios.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConsumosServicios.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=consumosserviciosLogic.getConsumosServicioss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=consumosservicioss.size()-1;
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
		//this.jTableDatosConsumosServicios.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConsumosServicios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConsumosServicios();
			
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
				
				//this.isEsNuevoConsumosServicios=false;
					
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			
				if(this.consumosserviciosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConsumosServicios==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConsumosServicios.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConsumosServicios.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.consumosservicios.getsType().equals("DUPLICADO")
				   || this.consumosservicios.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConsumosServicios=true;
				
				} else {
					this.isEsNuevoConsumosServicios=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
					if(this.consumosservicios.getId()>=0 && !this.consumosservicios.getIsNew()) {						
						this.isEsNuevoConsumosServicios=false;
						
					} else {
						this.isEsNuevoConsumosServicios=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConsumosServicios(esRelaciones);						
				
				this.seleccionarConsumosServicios(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.consumosservicios.getId()<0) {
					this.isEsNuevoConsumosServicios=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConsumosServicios(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConsumosServicios(evt,rowIndex);
				}	
				
				if(this.consumosserviciosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ConsumosServicios: " + this.dDif); 
					}
				}								
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConsumosServicios(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.consumosservicios)) {
					if(this.consumosservicios.getId()>0) {
						this.consumosservicios.setIsDeleted(true);
						
						this.consumosserviciossEliminados.add(this.consumosservicios);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.consumosserviciosLogic.getConsumosServicioss().remove(this.consumosservicios);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.consumosservicioss.remove(this.consumosservicios);				
					}
					
					
					((ConsumosServiciosModel) this.jTableDatosConsumosServicios.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConsumosServicios(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConsumosServicios(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConsumosServicios) {
			
			if(this.jInternalFrameDetalleFormConsumosServicios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConsumosServicios.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConsumosServicios.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConsumosServicios(this.consumosservicios);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConsumosServicios("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConsumosServicios(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsumosServicios() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConsumosServicios(ConsumosServicios consumosservicios) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConsumosServicios(consumosservicios,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConsumosServicios(ConsumosServicios consumosservicios,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConsumosServicios(consumosservicios);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConsumosServicios(consumosservicios,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConsumosServicios(consumosservicios);
	}
	
	public void setVariablesObjetoActualToFormularioConsumosServicios(ConsumosServicios consumosservicios) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConsumosServicios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConsumosServicios.jLabelidConsumosServicios.setText(consumosservicios.getId().toString());
			this.jInternalFrameDetalleFormConsumosServicios.jTextFieldnombre_unidadConsumosServicios.setText(consumosservicios.getnombre_unidad());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_productoConsumosServicios.setText(consumosservicios.getnombre_producto());
			this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcantidadConsumosServicios.setText(consumosservicios.getcantidad().toString());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_lineaConsumosServicios.setText(consumosservicios.getnombre_linea());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_grupoConsumosServicios.setText(consumosservicios.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_categoriaConsumosServicios.setText(consumosservicios.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_marcaConsumosServicios.setText(consumosservicios.getnombre_linea_marca());
			this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcodigoConsumosServicios.setText(consumosservicios.getcodigo());
			this.jInternalFrameDetalleFormConsumosServicios.jTextFieldtotalConsumosServicios.setText(consumosservicios.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ConsumosServicios consumosserviciosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,consumosserviciosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ConsumosServicios consumosserviciosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				consumosserviciosLocal=this.consumosservicios;
			} else {
				consumosserviciosLocal=this.consumosserviciosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(consumosserviciosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConsumosServicios(consumosserviciosLocal,true);
					
					if(consumosserviciosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(consumosserviciosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(consumosserviciosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConsumosServicios(ConsumosServicios consumosservicios,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConsumosServicios(consumosservicios,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(consumosservicios);
	}
	
	public void setVariablesFormularioToObjetoActualConsumosServicios(ConsumosServicios consumosservicios,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConsumosServicios(consumosservicios,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConsumosServicios(ConsumosServicios consumosservicios,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConsumosServicios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormConsumosServicios.jLabelidConsumosServicios.getText()==null || this.jInternalFrameDetalleFormConsumosServicios.jLabelidConsumosServicios.getText()=="" || this.jInternalFrameDetalleFormConsumosServicios.jLabelidConsumosServicios.getText()=="Id") {
				this.jInternalFrameDetalleFormConsumosServicios.jLabelidConsumosServicios.setText("0");
			}

			if(conColumnasBase) {consumosservicios.setId(Long.parseLong(this.jInternalFrameDetalleFormConsumosServicios.jLabelidConsumosServicios.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosServiciosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelIdConsumosServicios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosservicios.setnombre_unidad(this.jInternalFrameDetalleFormConsumosServicios.jTextFieldnombre_unidadConsumosServicios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_unidadConsumosServicios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosservicios.setnombre_producto(this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_productoConsumosServicios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_productoConsumosServicios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosservicios.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcantidadConsumosServicios.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelcantidadConsumosServicios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosservicios.setnombre_linea(this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_lineaConsumosServicios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_lineaConsumosServicios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosservicios.setnombre_linea_grupo(this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_grupoConsumosServicios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_linea_grupoConsumosServicios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosservicios.setnombre_linea_categoria(this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_categoriaConsumosServicios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_linea_categoriaConsumosServicios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosservicios.setnombre_linea_marca(this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_marcaConsumosServicios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelnombre_linea_marcaConsumosServicios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosservicios.setcodigo(this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcodigoConsumosServicios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosServiciosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabelcodigoConsumosServicios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosservicios.settotal(Double.parseDouble(this.jInternalFrameDetalleFormConsumosServicios.jTextFieldtotalConsumosServicios.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosServiciosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosServicios.jLabeltotalConsumosServicios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConsumosServicios(ConsumosServicios consumosserviciosBean,ConsumosServicios consumosservicios,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConsumosServicios(ConsumosServicios consumosserviciosOrigen,ConsumosServicios consumosservicios,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && consumosserviciosOrigen.getId()!=null && !consumosserviciosOrigen.getId().equals(0L))) {consumosservicios.setId(consumosserviciosOrigen.getId());}}
			if(conDefault || (!conDefault && consumosserviciosOrigen.getfecha_emision_desde()!=null && !consumosserviciosOrigen.getfecha_emision_desde().equals(new Date()))) {consumosservicios.setfecha_emision_desde(consumosserviciosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && consumosserviciosOrigen.getfecha_emision_hasta()!=null && !consumosserviciosOrigen.getfecha_emision_hasta().equals(new Date()))) {consumosservicios.setfecha_emision_hasta(consumosserviciosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && consumosserviciosOrigen.getnombre_unidad()!=null && !consumosserviciosOrigen.getnombre_unidad().equals(""))) {consumosservicios.setnombre_unidad(consumosserviciosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && consumosserviciosOrigen.getnombre_producto()!=null && !consumosserviciosOrigen.getnombre_producto().equals(""))) {consumosservicios.setnombre_producto(consumosserviciosOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && consumosserviciosOrigen.getcantidad()!=null && !consumosserviciosOrigen.getcantidad().equals(0))) {consumosservicios.setcantidad(consumosserviciosOrigen.getcantidad());}
			if(conDefault || (!conDefault && consumosserviciosOrigen.getnombre_linea()!=null && !consumosserviciosOrigen.getnombre_linea().equals(""))) {consumosservicios.setnombre_linea(consumosserviciosOrigen.getnombre_linea());}
			if(conDefault || (!conDefault && consumosserviciosOrigen.getnombre_linea_grupo()!=null && !consumosserviciosOrigen.getnombre_linea_grupo().equals(""))) {consumosservicios.setnombre_linea_grupo(consumosserviciosOrigen.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && consumosserviciosOrigen.getnombre_linea_categoria()!=null && !consumosserviciosOrigen.getnombre_linea_categoria().equals(""))) {consumosservicios.setnombre_linea_categoria(consumosserviciosOrigen.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && consumosserviciosOrigen.getnombre_linea_marca()!=null && !consumosserviciosOrigen.getnombre_linea_marca().equals(""))) {consumosservicios.setnombre_linea_marca(consumosserviciosOrigen.getnombre_linea_marca());}
			if(conDefault || (!conDefault && consumosserviciosOrigen.getcodigo()!=null && !consumosserviciosOrigen.getcodigo().equals(""))) {consumosservicios.setcodigo(consumosserviciosOrigen.getcodigo());}
			if(conDefault || (!conDefault && consumosserviciosOrigen.gettotal()!=null && !consumosserviciosOrigen.gettotal().equals(0.0))) {consumosservicios.settotal(consumosserviciosOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConsumosServicios(ConsumosServicios consumosservicios) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConsumosServicios.jLabelidConsumosServicios.setText(consumosservicios.getId().toString());
			this.jInternalFrameDetalleFormConsumosServicios.jTextFieldnombre_unidadConsumosServicios.setText(consumosservicios.getnombre_unidad());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_productoConsumosServicios.setText(consumosservicios.getnombre_producto());
			this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcantidadConsumosServicios.setText(consumosservicios.getcantidad().toString());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_lineaConsumosServicios.setText(consumosservicios.getnombre_linea());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_grupoConsumosServicios.setText(consumosservicios.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_categoriaConsumosServicios.setText(consumosservicios.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_marcaConsumosServicios.setText(consumosservicios.getnombre_linea_marca());
			this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcodigoConsumosServicios.setText(consumosservicios.getcodigo());
			this.jInternalFrameDetalleFormConsumosServicios.jTextFieldtotalConsumosServicios.setText(consumosservicios.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConsumosServicios(ConsumosServiciosBean consumosserviciosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConsumosServicios.jLabelidConsumosServicios.setText(consumosserviciosBean.getId().toString());
			this.jInternalFrameDetalleFormConsumosServicios.jTextFieldnombre_unidadConsumosServicios.setText(consumosserviciosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_productoConsumosServicios.setText(consumosserviciosBean.getnombre_producto());
			this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcantidadConsumosServicios.setText(consumosserviciosBean.getcantidad().toString());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_lineaConsumosServicios.setText(consumosserviciosBean.getnombre_linea());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_grupoConsumosServicios.setText(consumosserviciosBean.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_categoriaConsumosServicios.setText(consumosserviciosBean.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_marcaConsumosServicios.setText(consumosserviciosBean.getnombre_linea_marca());
			this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcodigoConsumosServicios.setText(consumosserviciosBean.getcodigo());
			this.jInternalFrameDetalleFormConsumosServicios.jTextFieldtotalConsumosServicios.setText(consumosserviciosBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConsumosServicios(ConsumosServiciosParameterReturnGeneral consumosserviciosReturnGeneral,ConsumosServiciosBean consumosserviciosBean,Boolean conDefault) throws Exception { 
		try {
			ConsumosServicios consumosserviciosLocal=new ConsumosServicios();
			
			consumosserviciosLocal=consumosserviciosReturnGeneral.getConsumosServicios();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && consumosserviciosLocal.getId()!=null && !consumosserviciosLocal.getId().equals(0L))) {consumosserviciosBean.setId(consumosserviciosLocal.getId());}}
			if(conDefault || (!conDefault && consumosserviciosLocal.getnombre_unidad()!=null && !consumosserviciosLocal.getnombre_unidad().equals(""))) {consumosserviciosBean.setnombre_unidad(consumosserviciosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && consumosserviciosLocal.getnombre_producto()!=null && !consumosserviciosLocal.getnombre_producto().equals(""))) {consumosserviciosBean.setnombre_producto(consumosserviciosLocal.getnombre_producto());}
			if(conDefault || (!conDefault && consumosserviciosLocal.getcantidad()!=null && !consumosserviciosLocal.getcantidad().equals(0))) {consumosserviciosBean.setcantidad(consumosserviciosLocal.getcantidad());}
			if(conDefault || (!conDefault && consumosserviciosLocal.getnombre_linea()!=null && !consumosserviciosLocal.getnombre_linea().equals(""))) {consumosserviciosBean.setnombre_linea(consumosserviciosLocal.getnombre_linea());}
			if(conDefault || (!conDefault && consumosserviciosLocal.getnombre_linea_grupo()!=null && !consumosserviciosLocal.getnombre_linea_grupo().equals(""))) {consumosserviciosBean.setnombre_linea_grupo(consumosserviciosLocal.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && consumosserviciosLocal.getnombre_linea_categoria()!=null && !consumosserviciosLocal.getnombre_linea_categoria().equals(""))) {consumosserviciosBean.setnombre_linea_categoria(consumosserviciosLocal.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && consumosserviciosLocal.getnombre_linea_marca()!=null && !consumosserviciosLocal.getnombre_linea_marca().equals(""))) {consumosserviciosBean.setnombre_linea_marca(consumosserviciosLocal.getnombre_linea_marca());}
			if(conDefault || (!conDefault && consumosserviciosLocal.getcodigo()!=null && !consumosserviciosLocal.getcodigo().equals(""))) {consumosserviciosBean.setcodigo(consumosserviciosLocal.getcodigo());}
			if(conDefault || (!conDefault && consumosserviciosLocal.gettotal()!=null && !consumosserviciosLocal.gettotal().equals(0.0))) {consumosserviciosBean.settotal(consumosserviciosLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConsumosServiciosGenerico(Long idConsumosServiciosSeleccionado,JComboBox jComboBoxConsumosServicios,List<ConsumosServicios> consumosserviciossLocal)throws Exception {
		try {
			ConsumosServicios  consumosserviciosTemp=null;

			for(ConsumosServicios consumosserviciosAux:consumosserviciossLocal) {
				if(consumosserviciosAux.getId()!=null && consumosserviciosAux.getId().equals(idConsumosServiciosSeleccionado)) {
					consumosserviciosTemp=consumosserviciosAux;
					break;
				}
			}

			jComboBoxConsumosServicios.setSelectedItem(consumosserviciosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConsumosServiciosGenerico(JComboBox jComboBoxConsumosServicios,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConsumosServicios.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConsumosServicios.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConsumosServicios.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConsumosServicios.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConsumosServicios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConsumosServicios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consumosservicios=(ConsumosServicios) consumosserviciosLogic.getConsumosServicioss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			consumosservicios =(ConsumosServicios) consumosservicioss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!consumosservicios.getIsNew() && !consumosservicios.getIsChanged() && !consumosservicios.getIsDeleted()) {
				sDescripcion=consumosservicios.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=consumosservicios.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!consumosservicios.getIsNew() && !consumosservicios.getIsChanged() && !consumosservicios.getIsDeleted()) {
				sDescripcion=consumosservicios.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=consumosservicios.gettransaccion_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!consumosservicios.getIsNew() && !consumosservicios.getIsChanged() && !consumosservicios.getIsDeleted()) {
				sDescripcion=consumosservicios.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=consumosservicios.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!consumosservicios.getIsNew() && !consumosservicios.getIsChanged() && !consumosservicios.getIsDeleted()) {
				sDescripcion=consumosservicios.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=consumosservicios.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!consumosservicios.getIsNew() && !consumosservicios.getIsChanged() && !consumosservicios.getIsDeleted()) {
				sDescripcion=consumosservicios.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=consumosservicios.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!consumosservicios.getIsNew() && !consumosservicios.getIsChanged() && !consumosservicios.getIsDeleted()) {
				sDescripcion=consumosservicios.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=consumosservicios.getlineamarca_descripcion();
			}
		}

		if(sTipo.equals("TipoProductoServicio")) {
			//sDescripcion=this.getActualTipoProductoServicioForeignKeyDescripcion((Long)value);
			if(!consumosservicios.getIsNew() && !consumosservicios.getIsChanged() && !consumosservicios.getIsDeleted()) {
				sDescripcion=consumosservicios.gettipoproductoservicio_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoServicioForeignKeyDescripcion((Long)value);
				sDescripcion=consumosservicios.gettipoproductoservicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ConsumosServicios consumosserviciosRow=new ConsumosServicios();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consumosserviciosRow=(ConsumosServicios) consumosserviciosLogic.getConsumosServicioss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			consumosserviciosRow=(ConsumosServicios) consumosservicioss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConsumosServicios(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConsumosServicios.setVisible((this.isVisibilidadCeldaNuevoConsumosServicios && this.isPermisoNuevoConsumosServicios));			
			this.jButtonDuplicarConsumosServicios.setVisible((this.isVisibilidadCeldaDuplicarConsumosServicios && this.isPermisoDuplicarConsumosServicios));			
			this.jButtonCopiarConsumosServicios.setVisible((this.isVisibilidadCeldaCopiarConsumosServicios && this.isPermisoCopiarConsumosServicios));
			this.jButtonVerFormConsumosServicios.setVisible((this.isVisibilidadCeldaVerFormConsumosServicios && this.isPermisoVerFormConsumosServicios));
			
			this.jButtonAbrirOrderByConsumosServicios.setVisible((this.isVisibilidadCeldaOrdenConsumosServicios && this.isPermisoOrdenConsumosServicios));			
			
			this.jButtonNuevoRelacionesConsumosServicios.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsumosServicios && this.isPermisoNuevoConsumosServicios));			
			this.jButtonNuevoGuardarCambiosConsumosServicios.setVisible((this.isVisibilidadCeldaNuevoConsumosServicios && this.isPermisoNuevoConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios));
			
			if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			this.jInternalFrameDetalleFormConsumosServicios.jButtonModificarConsumosServicios.setVisible((this.isVisibilidadCeldaModificarConsumosServicios && this.isPermisoActualizarConsumosServicios));	
			this.jInternalFrameDetalleFormConsumosServicios.jButtonActualizarConsumosServicios.setVisible((this.isVisibilidadCeldaActualizarConsumosServicios && this.isPermisoActualizarConsumosServicios));	
			this.jInternalFrameDetalleFormConsumosServicios.jButtonEliminarConsumosServicios.setVisible((this.isVisibilidadCeldaEliminarConsumosServicios && this.isPermisoEliminarConsumosServicios));
			this.jInternalFrameDetalleFormConsumosServicios.jButtonCancelarConsumosServicios.setVisible(this.isVisibilidadCeldaCancelarConsumosServicios);							
			this.jInternalFrameDetalleFormConsumosServicios.jButtonGuardarCambiosConsumosServicios.setVisible((this.isVisibilidadCeldaGuardarConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios));			
			
			}
						
			this.jButtonGuardarCambiosTablaConsumosServicios.setVisible((this.isVisibilidadCeldaGuardarCambiosConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConsumosServicios.setVisible((this.isVisibilidadCeldaNuevoConsumosServicios && this.isPermisoNuevoConsumosServicios));						
			this.jButtonDuplicarToolBarConsumosServicios.setVisible((this.isVisibilidadCeldaDuplicarConsumosServicios && this.isPermisoDuplicarConsumosServicios));						
			this.jButtonCopiarToolBarConsumosServicios.setVisible((this.isVisibilidadCeldaCopiarConsumosServicios && this.isPermisoCopiarConsumosServicios));			
			this.jButtonVerFormToolBarConsumosServicios.setVisible((this.isVisibilidadCeldaVerFormConsumosServicios && this.isPermisoVerFormConsumosServicios));			
			this.jButtonAbrirOrderByToolBarConsumosServicios.setVisible((this.isVisibilidadCeldaOrdenConsumosServicios && this.isPermisoOrdenConsumosServicios));
			this.jButtonNuevoRelacionesToolBarConsumosServicios.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsumosServicios && this.isPermisoNuevoConsumosServicios));			
			this.jButtonNuevoGuardarCambiosToolBarConsumosServicios.setVisible((this.isVisibilidadCeldaNuevoConsumosServicios && this.isPermisoNuevoConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios));			
			
			if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			this.jInternalFrameDetalleFormConsumosServicios.jButtonModificarToolBarConsumosServicios.setVisible((this.isVisibilidadCeldaModificarConsumosServicios && this.isPermisoActualizarConsumosServicios));	
			this.jInternalFrameDetalleFormConsumosServicios.jButtonActualizarToolBarConsumosServicios.setVisible((this.isVisibilidadCeldaActualizarConsumosServicios  && this.isPermisoActualizarConsumosServicios));	
			this.jInternalFrameDetalleFormConsumosServicios.jButtonEliminarToolBarConsumosServicios.setVisible((this.isVisibilidadCeldaEliminarConsumosServicios && this.isPermisoEliminarConsumosServicios));
			this.jInternalFrameDetalleFormConsumosServicios.jButtonCancelarToolBarConsumosServicios.setVisible(this.isVisibilidadCeldaCancelarConsumosServicios);				
			this.jInternalFrameDetalleFormConsumosServicios.jButtonGuardarCambiosToolBarConsumosServicios.setVisible((this.isVisibilidadCeldaGuardarConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConsumosServicios.setVisible((this.isVisibilidadCeldaGuardarCambiosConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConsumosServicios.setVisible((this.isVisibilidadCeldaNuevoConsumosServicios && this.isPermisoNuevoConsumosServicios));			
			this.jMenuItemDuplicarConsumosServicios.setVisible((this.isVisibilidadCeldaDuplicarConsumosServicios && this.isPermisoDuplicarConsumosServicios));			
			this.jMenuItemCopiarConsumosServicios.setVisible((this.isVisibilidadCeldaCopiarConsumosServicios && this.isPermisoCopiarConsumosServicios));			
			this.jMenuItemVerFormConsumosServicios.setVisible((this.isVisibilidadCeldaVerFormConsumosServicios && this.isPermisoVerFormConsumosServicios));			
			this.jMenuItemAbrirOrderByConsumosServicios.setVisible((this.isVisibilidadCeldaOrdenConsumosServicios && this.isPermisoOrdenConsumosServicios));			
			//this.jMenuItemMostrarOcultarConsumosServicios.setVisible((this.isVisibilidadCeldaOrdenConsumosServicios && this.isPermisoOrdenConsumosServicios));
			this.jMenuItemDetalleAbrirOrderByConsumosServicios.setVisible((this.isVisibilidadCeldaOrdenConsumosServicios && this.isPermisoOrdenConsumosServicios));			
			//this.jMenuItemDetalleMostrarOcultarConsumosServicios.setVisible((this.isVisibilidadCeldaOrdenConsumosServicios && this.isPermisoOrdenConsumosServicios));			
			this.jMenuItemNuevoRelacionesConsumosServicios.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsumosServicios && this.isPermisoNuevoConsumosServicios));			
			this.jMenuItemNuevoGuardarCambiosConsumosServicios.setVisible((this.isVisibilidadCeldaNuevoConsumosServicios && this.isPermisoNuevoConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios));									
			
			if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			this.jInternalFrameDetalleFormConsumosServicios.jMenuItemModificarConsumosServicios.setVisible((this.isVisibilidadCeldaModificarConsumosServicios && this.isPermisoActualizarConsumosServicios));	
			this.jInternalFrameDetalleFormConsumosServicios.jMenuItemActualizarConsumosServicios.setVisible((this.isVisibilidadCeldaActualizarConsumosServicios && this.isPermisoActualizarConsumosServicios));	
			this.jInternalFrameDetalleFormConsumosServicios.jMenuItemEliminarConsumosServicios.setVisible((this.isVisibilidadCeldaEliminarConsumosServicios && this.isPermisoEliminarConsumosServicios));
			this.jInternalFrameDetalleFormConsumosServicios.jMenuItemCancelarConsumosServicios.setVisible(this.isVisibilidadCeldaCancelarConsumosServicios);				
			}
			
			this.jMenuItemGuardarCambiosConsumosServicios.setVisible((this.isVisibilidadCeldaGuardarConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios));						
			this.jMenuItemGuardarCambiosTablaConsumosServicios.setVisible((this.isVisibilidadCeldaGuardarCambiosConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConsumosServicios=this.jButtonNuevoConsumosServicios.isVisible();
			this.isVisibilidadCeldaDuplicarConsumosServicios=this.jButtonDuplicarConsumosServicios.isVisible();
			this.isVisibilidadCeldaCopiarConsumosServicios=this.jButtonCopiarConsumosServicios.isVisible();
			this.isVisibilidadCeldaVerFormConsumosServicios=this.jButtonVerFormConsumosServicios.isVisible();
			
			this.isVisibilidadCeldaOrdenConsumosServicios=this.jButtonAbrirOrderByConsumosServicios.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=this.jButtonNuevoRelacionesConsumosServicios.isVisible();
			this.isVisibilidadCeldaModificarConsumosServicios=this.jButtonModificarConsumosServicios.isVisible();
			
			if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			this.isVisibilidadCeldaActualizarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jButtonActualizarConsumosServicios.isVisible();
			this.isVisibilidadCeldaEliminarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jButtonEliminarConsumosServicios.isVisible();
			this.isVisibilidadCeldaCancelarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jButtonCancelarConsumosServicios.isVisible();
			this.isVisibilidadCeldaGuardarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jButtonGuardarCambiosConsumosServicios.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConsumosServicios=this.jButtonGuardarCambiosTablaConsumosServicios.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConsumosServicios=this.jButtonNuevoToolBarConsumosServicios.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=this.jButtonNuevoRelacionesToolBarConsumosServicios.isVisible();
			
			if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			this.isVisibilidadCeldaModificarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jButtonModificarToolBarConsumosServicios.isVisible();
			this.isVisibilidadCeldaActualizarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jButtonActualizarToolBarConsumosServicios.isVisible();
			this.isVisibilidadCeldaEliminarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jButtonEliminarToolBarConsumosServicios.isVisible();
			this.isVisibilidadCeldaCancelarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jButtonCancelarToolBarConsumosServicios.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConsumosServicios=this.jButtonGuardarCambiosToolBarConsumosServicios.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConsumosServicios=this.jButtonGuardarCambiosTablaToolBarConsumosServicios.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConsumosServicios=this.jMenuItemNuevoConsumosServicios.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=this.jMenuItemNuevoRelacionesConsumosServicios.isVisible();
			
			if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			this.isVisibilidadCeldaModificarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jMenuItemModificarConsumosServicios.isVisible();
			this.isVisibilidadCeldaActualizarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jMenuItemActualizarConsumosServicios.isVisible();
			this.isVisibilidadCeldaEliminarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jMenuItemEliminarConsumosServicios.isVisible();
			this.isVisibilidadCeldaCancelarConsumosServicios=this.jInternalFrameDetalleFormConsumosServicios.jMenuItemCancelarConsumosServicios.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConsumosServicios=this.jMenuItemGuardarCambiosConsumosServicios.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConsumosServicios=this.jMenuItemGuardarCambiosTablaConsumosServicios.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConsumosServicios(Boolean esInicializar) {
		if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.consumosserviciosSessionBean.getConGuardarRelaciones()) {
				//if(this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConsumosServicios();
			}
			
			this.inicializarActualizarBindingBotonesManualConsumosServicios(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConsumosServicios() {
		this.jButtonNuevoConsumosServicios.setVisible(this.isPermisoNuevoConsumosServicios);			
		this.jButtonDuplicarConsumosServicios.setVisible(this.isPermisoDuplicarConsumosServicios);			
		this.jButtonCopiarConsumosServicios.setVisible(this.isPermisoCopiarConsumosServicios);			
		this.jButtonVerFormConsumosServicios.setVisible(this.isPermisoVerFormConsumosServicios);			
		
		this.jButtonAbrirOrderByConsumosServicios.setVisible(this.isPermisoOrdenConsumosServicios);					
		
		this.jButtonNuevoRelacionesConsumosServicios.setVisible(this.isPermisoNuevoConsumosServicios);			
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jButtonModificarConsumosServicios.setVisible(this.isPermisoActualizarConsumosServicios);	
			this.jInternalFrameDetalleFormConsumosServicios.jButtonActualizarConsumosServicios.setVisible(this.isPermisoActualizarConsumosServicios);	
			this.jInternalFrameDetalleFormConsumosServicios.jButtonEliminarConsumosServicios.setVisible(this.isPermisoEliminarConsumosServicios);
			this.jInternalFrameDetalleFormConsumosServicios.jButtonCancelarConsumosServicios.setVisible(this.isVisibilidadCeldaCancelarConsumosServicios);						
			this.jInternalFrameDetalleFormConsumosServicios.jButtonGuardarCambiosConsumosServicios.setVisible(this.isPermisoGuardarCambiosConsumosServicios);							
		}
		
		this.jButtonGuardarCambiosTablaConsumosServicios.setVisible(this.isPermisoActualizarConsumosServicios);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConsumosServicios() {
		this.jInternalFrameDetalleFormConsumosServicios.jButtonModificarConsumosServicios.setVisible(this.isPermisoActualizarConsumosServicios);	
		this.jInternalFrameDetalleFormConsumosServicios.jButtonActualizarConsumosServicios.setVisible(this.isPermisoActualizarConsumosServicios);	
		this.jInternalFrameDetalleFormConsumosServicios.jButtonEliminarConsumosServicios.setVisible(this.isPermisoEliminarConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jButtonCancelarConsumosServicios.setVisible(this.isVisibilidadCeldaCancelarConsumosServicios);							
		this.jInternalFrameDetalleFormConsumosServicios.jButtonGuardarCambiosConsumosServicios.setVisible((this.isVisibilidadCeldaGuardarConsumosServicios && this.isPermisoGuardarCambiosConsumosServicios));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConsumosServicios() {
		if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConsumosServicios();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConsumosServicios() {
	}
	
	public void jTableDatosConsumosServiciosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConsumosServicios(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.consumosservicios.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaConsumosServiciosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebConsumosServicios(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosServicios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosServicios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.consumosserviciosLogic.getConnexion());

				if(this.consumosservicios.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.consumosservicios.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosServicios=(TitledBorder)this.jScrollPanelDatosConsumosServicios.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderConsumosServicios.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.consumosservicios.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionConsumosServiciosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebConsumosServicios(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosServicios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosServicios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.consumosserviciosLogic.getConnexion());

				if(this.consumosservicios.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.consumosservicios.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosServicios=(TitledBorder)this.jScrollPanelDatosConsumosServicios.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderConsumosServicios.getTitle() + " -> TRANSACCION");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.consumosservicios.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaConsumosServiciosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebConsumosServicios(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosServicios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosServicios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.consumosserviciosLogic.getConnexion());

				if(this.consumosservicios.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.consumosservicios.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosServicios=(TitledBorder)this.jScrollPanelDatosConsumosServicios.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderConsumosServicios.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.consumosservicios.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoConsumosServiciosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebConsumosServicios(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosServicios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosServicios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.consumosserviciosLogic.getConnexion());

				if(this.consumosservicios.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.consumosservicios.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosServicios=(TitledBorder)this.jScrollPanelDatosConsumosServicios.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderConsumosServicios.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.consumosservicios.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaConsumosServiciosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebConsumosServicios(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosServicios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosServicios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.consumosserviciosLogic.getConnexion());

				if(this.consumosservicios.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.consumosservicios.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosServicios=(TitledBorder)this.jScrollPanelDatosConsumosServicios.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderConsumosServicios.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.consumosservicios.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaConsumosServiciosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebConsumosServicios(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosServicios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosServicios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.consumosserviciosLogic.getConnexion());

				if(this.consumosservicios.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.consumosservicios.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosServicios=(TitledBorder)this.jScrollPanelDatosConsumosServicios.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderConsumosServicios.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.consumosservicios.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_producto_servicioConsumosServiciosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproductoservicio=true;

			idTienePermisotipoproductoservicio=this.tienePermisosUsuarioEnPaginaWebConsumosServicios(TipoProductoServicioConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproductoservicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosServicios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosServicios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);

				this.tipoproductoservicioBeanSwingJInternalFrame=new TipoProductoServicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoservicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoservicioBeanSwingJInternalFrame.getTipoProductoServicioLogic().setConnexion(this.consumosserviciosLogic.getConnexion());

				if(this.consumosservicios.getid_tipo_producto_servicio()!=null) {
					this.tipoproductoservicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoservicioBeanSwingJInternalFrame.setIdActual(this.consumosservicios.getid_tipo_producto_servicio());
					this.tipoproductoservicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoservicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoservicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProductoServicio();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoservicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosServicios=(TitledBorder)this.jScrollPanelDatosConsumosServicios.getBorder();
				TitledBorder titledBordertipoproductoservicio=(TitledBorder)this.tipoproductoservicioBeanSwingJInternalFrame.jScrollPanelDatosTipoProductoServicio.getBorder();

				titledBordertipoproductoservicio.setTitle(titledBorderConsumosServicios.getTitle() + " -> TIPOPRODUCTOSERVICIO");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_producto_servicioConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getid_tipo_producto_servicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto_servicio = "+this.consumosservicios.getid_tipo_producto_servicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.consumosservicios.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.consumosservicios.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.consumosservicios.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.consumosservicios.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.consumosservicios.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_lineaConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getnombre_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea like '%"+this.consumosservicios.getnombre_linea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_grupoConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getnombre_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_grupo like '%"+this.consumosservicios.getnombre_linea_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_categoriaConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getnombre_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_categoria like '%"+this.consumosservicios.getnombre_linea_categoria()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_marcaConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getnombre_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_marca like '%"+this.consumosservicios.getnombre_linea_marca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.consumosservicios.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalConsumosServiciosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.getconsumosservicios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosservicios==null) {
						this.consumosservicios = new ConsumosServicios();
					}

					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);
				}

				if(this.consumosservicios.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.consumosservicios.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosServicios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaConsumosServiciosConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosServicios(false,false);

			this.getConsumosServiciossBusquedaConsumosServicios();

			this.inicializarActualizarBindingConsumosServicios(false);

			//if(ConsumosServiciosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosServicios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosServicios(false,false);

			this.getConsumosServiciossFK_IdEmpresa();

			this.inicializarActualizarBindingConsumosServicios(false);

			//if(ConsumosServiciosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosServicios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosServicios(false,false);

			this.getConsumosServiciossFK_IdLinea();

			this.inicializarActualizarBindingConsumosServicios(false);

			//if(ConsumosServiciosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosServicios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosServicios(false,false);

			this.getConsumosServiciossFK_IdLineaCategoria();

			this.inicializarActualizarBindingConsumosServicios(false);

			//if(ConsumosServiciosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosServicios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosServicios(false,false);

			this.getConsumosServiciossFK_IdLineaGrupo();

			this.inicializarActualizarBindingConsumosServicios(false);

			//if(ConsumosServiciosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosServicios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosServicios(false,false);

			this.getConsumosServiciossFK_IdLineaMarca();

			this.inicializarActualizarBindingConsumosServicios(false);

			//if(ConsumosServiciosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosServicios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoServicioConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosServicios(false,false);

			this.getConsumosServiciossFK_IdTipoProductoServicio();

			this.inicializarActualizarBindingConsumosServicios(false);

			//if(ConsumosServiciosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosServicios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionConsumosServiciosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosServicios(false,false);

			this.getConsumosServiciossFK_IdTransaccion();

			this.inicializarActualizarBindingConsumosServicios(false);

			//if(ConsumosServiciosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosServicios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosserviciosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConsumosServicios() {
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
			this.jInternalFrameDetalleFormConsumosServicios.setVisible(false);	    			
			this.jInternalFrameDetalleFormConsumosServicios.dispose();
			this.jInternalFrameDetalleFormConsumosServicios=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConsumosServicios!=null) {
			this.jInternalFrameReporteDinamicoConsumosServicios.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConsumosServicios.dispose();
			this.jInternalFrameReporteDinamicoConsumosServicios=null;
		}
		
		if(this.jInternalFrameImportacionConsumosServicios!=null) {
			this.jInternalFrameImportacionConsumosServicios.setVisible(false);	    			
			this.jInternalFrameImportacionConsumosServicios.dispose();
			this.jInternalFrameImportacionConsumosServicios=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConsumosServicios();
			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			
			
			if(sTipo.equals("NuevoConsumosServicios")) {
				jButtonNuevoConsumosServiciosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConsumosServicios")) {
				jButtonDuplicarConsumosServiciosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConsumosServicios")) {
				jButtonCopiarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("VerFormConsumosServicios")) {
				jButtonVerFormConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConsumosServicios")) {
				jButtonNuevoConsumosServiciosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConsumosServicios")) {
				jButtonDuplicarConsumosServiciosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConsumosServicios")) {
				jButtonNuevoConsumosServiciosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConsumosServicios")) {
				jButtonDuplicarConsumosServiciosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConsumosServicios")) {
				jButtonNuevoConsumosServiciosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConsumosServicios")) {
				jButtonNuevoConsumosServiciosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConsumosServicios")) {
				jButtonNuevoConsumosServiciosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConsumosServicios")) {
				jButtonModificarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConsumosServicios")) {
				jButtonModificarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConsumosServicios")) {
				jButtonModificarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConsumosServicios")) {
				jButtonActualizarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConsumosServicios")) {
				jButtonActualizarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConsumosServicios")) {
				jButtonActualizarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("EliminarConsumosServicios")) {
				jButtonEliminarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConsumosServicios")) {
				jButtonEliminarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConsumosServicios")) {
				jButtonEliminarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("CancelarConsumosServicios")) {
				jButtonCancelarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConsumosServicios")) {
				jButtonCancelarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConsumosServicios")) {
				jButtonCancelarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("CerrarConsumosServicios")) {
				jButtonCerrarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConsumosServicios")) {
				jButtonCerrarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConsumosServicios")) {
				jButtonCerrarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConsumosServicios")) {
				jButtonMostrarOcultarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConsumosServicios")) {
				jButtonCancelarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConsumosServicios")) {
				jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConsumosServicios")) {
				jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConsumosServicios")) {
				jButtonCopiarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConsumosServicios")) {
				jButtonVerFormConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConsumosServicios")) {
				jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConsumosServicios")) {
				jButtonCopiarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConsumosServicios")) {
				jButtonVerFormConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConsumosServicios")) {
				jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConsumosServicios")) {
				jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConsumosServicios")) {
				jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConsumosServicios")) {
				jButtonRecargarInformacionConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConsumosServicios")) {
				jButtonRecargarInformacionConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConsumosServicios")) {
				jButtonRecargarInformacionConsumosServiciosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConsumosServicios")) {
				jButtonAnterioresConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConsumosServicios")) {
				jButtonAnterioresConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConsumosServicios")) {
				jButtonAnterioresConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConsumosServicios")) {
				jButtonSiguientesConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConsumosServicios")) {
				jButtonSiguientesConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConsumosServicios")) {
				jButtonSiguientesConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConsumosServicios") || sTipo.equals("MenuItemDetalleAbrirOrderByConsumosServicios")) {
				jButtonAbrirOrderByConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConsumosServicios") || sTipo.equals("MenuItemDetalleMostrarOcultarConsumosServicios")) {
				jButtonMostrarOcultarConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConsumosServicios")) {
				jButtonNuevoGuardarCambiosConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConsumosServicios")) {
				jButtonNuevoGuardarCambiosConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConsumosServicios")) {
				jButtonNuevoGuardarCambiosConsumosServiciosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConsumosServicios")) {
				jButtonCerrarReporteDinamicoConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConsumosServicios")) {
				jButtonGenerarReporteDinamicoConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConsumosServicios")) {
				
				jButtonGenerarExcelReporteDinamicoConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConsumosServicios")) {
				jButtonCerrarImportacionConsumosServiciosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConsumosServicios")) {
				
				jButtonGenerarImportacionConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConsumosServicios")) {
				
				jButtonAbrirImportacionConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConsumosServicios")) {
				jComboBoxTiposAccionesConsumosServiciosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConsumosServicios")) {
				jComboBoxTiposRelacionesConsumosServiciosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConsumosServicios")) {
				jComboBoxTiposAccionesConsumosServiciosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConsumosServicios")) {
				
				jComboBoxTiposSeleccionarConsumosServiciosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConsumosServicios")) {
				jTextFieldValorCampoGeneralConsumosServiciosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConsumosServicios")) {
				jButtonAbrirOrderByConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConsumosServicios")) {
				jButtonAbrirOrderByConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConsumosServicios")) {
				jButtonCerrarOrderByConsumosServiciosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConsumosServiciosBusqueda")) {
				this.jButtonidConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConsumosServiciosUpdate")) {
				this.jButtonid_empresaConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConsumosServiciosBusqueda")) {
				this.jButtonid_empresaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionConsumosServiciosUpdate")) {
				this.jButtonid_transaccionConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionConsumosServiciosBusqueda")) {
				this.jButtonid_transaccionConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaConsumosServiciosUpdate")) {
				this.jButtonid_lineaConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaConsumosServiciosBusqueda")) {
				this.jButtonid_lineaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoConsumosServiciosUpdate")) {
				this.jButtonid_linea_grupoConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoConsumosServiciosBusqueda")) {
				this.jButtonid_linea_grupoConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaConsumosServiciosUpdate")) {
				this.jButtonid_linea_categoriaConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaConsumosServiciosBusqueda")) {
				this.jButtonid_linea_categoriaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaConsumosServiciosUpdate")) {
				this.jButtonid_linea_marcaConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaConsumosServiciosBusqueda")) {
				this.jButtonid_linea_marcaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioConsumosServiciosUpdate")) {
				this.jButtonid_tipo_producto_servicioConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioConsumosServiciosBusqueda")) {
				this.jButtonid_tipo_producto_servicioConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeConsumosServiciosBusqueda")) {
				this.jButtonfecha_emision_desdeConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaConsumosServiciosBusqueda")) {
				this.jButtonfecha_emision_hastaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadConsumosServiciosBusqueda")) {
				this.jButtonnombre_unidadConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoConsumosServiciosBusqueda")) {
				this.jButtonnombre_productoConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadConsumosServiciosBusqueda")) {
				this.jButtoncantidadConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaConsumosServiciosBusqueda")) {
				this.jButtonnombre_lineaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoConsumosServiciosBusqueda")) {
				this.jButtonnombre_linea_grupoConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaConsumosServiciosBusqueda")) {
				this.jButtonnombre_linea_categoriaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaConsumosServiciosBusqueda")) {
				this.jButtonnombre_linea_marcaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoConsumosServiciosBusqueda")) {
				this.jButtoncodigoConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalConsumosServiciosBusqueda")) {
				this.jButtontotalConsumosServiciosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaConsumosServiciosConsumosServicios")) {
				this.jButtonBusquedaConsumosServiciosConsumosServiciosActionPerformed(evt);
			}
			
			;
			
			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConsumosServicios();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosServiciosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				


				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosServicios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosServicios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ConsumosServicios consumosserviciosLocal=null;
			
			if(!this.getEsControlTabla()) {
				consumosserviciosLocal=this.consumosservicios;
			} else {
				consumosserviciosLocal=this.consumosserviciosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
							
				
				


				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosServicios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosServicios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosServiciosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosAnterior =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosserviciosAnterior =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
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
			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			
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
			
			


			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosServiciosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
								
						
				


				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosServicios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosServicios.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
								
				
				


				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosServicios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosServicios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosServiciosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosAnterior =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosserviciosAnterior =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosServiciosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosAnterior =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosserviciosAnterior =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosServiciosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
							
				
				


				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosServicios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosServicios.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosServiciosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosserviciosAnterior =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.consumosserviciosAnterior =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
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
			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			
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
			
			


			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosServiciosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
								
				
				


				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosServicios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosServicios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosServiciosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosAnterior =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosserviciosAnterior =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosServiciosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosServiciosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConsumosServicios")) {
					jCheckBoxSeleccionarTodosConsumosServiciosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConsumosServicios")) {
					jCheckBoxSeleccionadosConsumosServiciosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConsumosServicios")) {
					
				}
				
				


				
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosServicios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosServicios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
												
				
				


				
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosServicios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosServicios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosServiciosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosserviciosAnterior =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.consumosserviciosAnterior =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosServiciosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
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
			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
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
			
			


			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosServiciosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosServicios.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosServicios.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosservicios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosservicios);
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
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
				
				


				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosServicios.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosServicios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosServiciosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosserviciosAnterior =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosserviciosAnterior =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConsumosServicios")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConsumosServiciosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConsumosServicios.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.consumosservicios =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.consumosservicios =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.consumosservicios);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConsumosServicios")) {
				
				}
				
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConsumosServicios")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConsumosServicios.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConsumosServicios")) {
			
			}
			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConsumosServicios();
			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			
			if(sTipo.equals("NuevoConsumosServicios")) {
				jButtonNuevoConsumosServiciosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConsumosServicios")) {
				jButtonDuplicarConsumosServiciosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConsumosServicios")) {
				jButtonCopiarConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConsumosServicios")) {
				jButtonVerFormConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConsumosServicios")) {
				jButtonNuevoConsumosServiciosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConsumosServicios")) {
				jButtonModificarConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConsumosServicios")) {
				jButtonActualizarConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConsumosServicios")) {
				jButtonEliminarConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConsumosServicios")) {
				jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConsumosServicios")) {
				jButtonCancelarConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConsumosServicios")) {
				jButtonCerrarConsumosServiciosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConsumosServicios")) {
				jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConsumosServicios")) {
				jButtonNuevoGuardarCambiosConsumosServiciosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConsumosServicios")) {
				jButtonAbrirOrderByConsumosServiciosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConsumosServicios")) {
				jButtonRecargarInformacionConsumosServiciosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConsumosServicios")) {
				jButtonAnterioresConsumosServiciosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConsumosServicios")) {
				jButtonSiguientesConsumosServiciosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConsumosServiciosBusqueda")) {
				this.jButtonidConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConsumosServiciosUpdate")) {
				this.jButtonid_empresaConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConsumosServiciosBusqueda")) {
				this.jButtonid_empresaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionConsumosServiciosUpdate")) {
				this.jButtonid_transaccionConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionConsumosServiciosBusqueda")) {
				this.jButtonid_transaccionConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaConsumosServiciosUpdate")) {
				this.jButtonid_lineaConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaConsumosServiciosBusqueda")) {
				this.jButtonid_lineaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoConsumosServiciosUpdate")) {
				this.jButtonid_linea_grupoConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoConsumosServiciosBusqueda")) {
				this.jButtonid_linea_grupoConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaConsumosServiciosUpdate")) {
				this.jButtonid_linea_categoriaConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaConsumosServiciosBusqueda")) {
				this.jButtonid_linea_categoriaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaConsumosServiciosUpdate")) {
				this.jButtonid_linea_marcaConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaConsumosServiciosBusqueda")) {
				this.jButtonid_linea_marcaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioConsumosServiciosUpdate")) {
				this.jButtonid_tipo_producto_servicioConsumosServiciosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioConsumosServiciosBusqueda")) {
				this.jButtonid_tipo_producto_servicioConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeConsumosServiciosBusqueda")) {
				this.jButtonfecha_emision_desdeConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaConsumosServiciosBusqueda")) {
				this.jButtonfecha_emision_hastaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadConsumosServiciosBusqueda")) {
				this.jButtonnombre_unidadConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoConsumosServiciosBusqueda")) {
				this.jButtonnombre_productoConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadConsumosServiciosBusqueda")) {
				this.jButtoncantidadConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaConsumosServiciosBusqueda")) {
				this.jButtonnombre_lineaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoConsumosServiciosBusqueda")) {
				this.jButtonnombre_linea_grupoConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaConsumosServiciosBusqueda")) {
				this.jButtonnombre_linea_categoriaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaConsumosServiciosBusqueda")) {
				this.jButtonnombre_linea_marcaConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoConsumosServiciosBusqueda")) {
				this.jButtoncodigoConsumosServiciosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalConsumosServiciosBusqueda")) {
				this.jButtontotalConsumosServiciosBusquedaActionPerformed(evt);
			}
			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConsumosServicios();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConsumosServicios")) {
				closingInternalFrameConsumosServicios();
				
			} else if(sTipo.equals("jButtonCancelarConsumosServicios")) {
				JInternalFrameBase jInternalFrameDetalleFormConsumosServicios = (JInternalFrameBase)evt.getSource();
	            	
	            ConsumosServiciosBeanSwingJInternalFrame jInternalFrameParent=(ConsumosServiciosBeanSwingJInternalFrame)jInternalFrameDetalleFormConsumosServicios.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConsumosServiciosActionPerformed(null);
			}
			
			ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.consumosservicios,new Object(),this.consumosserviciosParameterGeneral,this.consumosserviciosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConsumosServicios(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConsumosServicios(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConsumosServicios(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.consumosservicios)) {
			if(!esControlTabla) {
				if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);			
				}
				
				if(this.consumosserviciosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConsumosServicios(this.consumosservicios,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConsumosServicios(this.consumosserviciosReturnGeneral,this.consumosserviciosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.consumosserviciosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConsumosServicios(classes,this.consumosserviciosReturnGeneral,this.consumosserviciosBean,false);
					}
						
					if(this.consumosserviciosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConsumosServicios(this.consumosserviciosReturnGeneral.getConsumosServicios());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConsumosServicios(this.consumosserviciosReturnGeneral.getConsumosServicios());	
					}
						
					if(this.consumosserviciosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConsumosServicios(this.consumosserviciosReturnGeneral.getConsumosServicios(),classes);//this.consumosserviciosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConsumosServicios(this.consumosservicios,classes);//this.consumosserviciosBean);									
				}
			
				if(ConsumosServiciosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConsumosServicios(this.consumosservicios,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosServicios(this.consumosservicios);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.consumosserviciosAnterior!=null) {
						this.consumosservicios=this.consumosserviciosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.consumosserviciosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.consumosserviciosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.consumosserviciosReturnGeneral.getConsumosServicios(),consumosserviciosLogic.getConsumosServicioss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.consumosserviciosReturnGeneral.getConsumosServicios(),this.consumosservicioss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConsumosServicios.repaint();
				
				//((AbstractTableModel) this.jTableDatosConsumosServicios.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConsumosServicios();
			}
		}
	}
	
	public void actualizarVisualTableDatosConsumosServicios() throws Exception {
		
		ConsumosServiciosModel consumosserviciosModel=(ConsumosServiciosModel)this.jTableDatosConsumosServicios.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consumosserviciosModel.consumosservicioss=this.consumosserviciosLogic.getConsumosServicioss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			consumosserviciosModel.consumosservicioss=this.consumosservicioss;
		}
		
		
		((ConsumosServiciosModel) this.jTableDatosConsumosServicios.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConsumosServicios() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconsumosserviciosAnterior(),this.consumosserviciosLogic.getConsumosServicioss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconsumosserviciosAnterior(),this.consumosservicioss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConsumosServicios();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConsumosServicios(ConsumosServicios consumosservicios,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
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
										
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consumosservicios,new Object(),generalEntityParameterGeneral,this.consumosserviciosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.consumosserviciosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConsumosServiciosConstantesFunciones.getClassesRelationshipsOfConsumosServicios(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConsumosServiciosConstantesFunciones.getClassesRelationshipsFromStringsOfConsumosServicios(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConsumosServicios(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConsumosServiciosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consumosservicios,new Object(),generalEntityParameterGeneral,this.consumosserviciosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConsumosServicios(ConsumosServiciosBean consumosserviciosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConsumosServicios(ArrayList<Classe> classes,ConsumosServiciosReturnGeneral consumosserviciosReturnGeneral,ConsumosServiciosBean consumosserviciosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConsumosServicios(ConsumosServicios consumosservicios,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.consumosservicios)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConsumosServicios = new ConsumosServiciosDetalleFormJInternalFrame(jDesktopPane,this.consumosserviciosSessionBean.getConGuardarRelaciones(),this.consumosserviciosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.setVisible(false);
		this.jInternalFrameDetalleFormConsumosServicios.setSelected(false);						
		
		this.jInternalFrameDetalleFormConsumosServicios.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConsumosServicios.consumosserviciosLogic=this.consumosserviciosLogic;
		
		this.cargarCombosFrameForeignKeyConsumosServicios("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConsumosServicios();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConsumosServicios();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConsumosServicios("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConsumosServicios();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConsumosServicios.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConsumosServicios"));
		
		this.jInternalFrameDetalleFormConsumosServicios.jButtonModificarConsumosServicios.addActionListener(new ButtonActionListener(this,"ModificarConsumosServicios"));

		
		this.jInternalFrameDetalleFormConsumosServicios.jButtonModificarToolBarConsumosServicios.addActionListener(new ButtonActionListener(this,"ModificarToolBarConsumosServicios"));
					
		this.jInternalFrameDetalleFormConsumosServicios.jMenuItemModificarConsumosServicios.addActionListener(new ButtonActionListener(this,"MenuItemModificarConsumosServicios"));		
		
		
		
		this.jInternalFrameDetalleFormConsumosServicios.jButtonActualizarConsumosServicios.addActionListener (new ButtonActionListener(this,"ActualizarConsumosServicios"));
		
		
		this.jInternalFrameDetalleFormConsumosServicios.jButtonActualizarToolBarConsumosServicios.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConsumosServicios"));
						
		this.jInternalFrameDetalleFormConsumosServicios.jMenuItemActualizarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConsumosServicios"));		
		
		
		
		this.jInternalFrameDetalleFormConsumosServicios.jButtonEliminarConsumosServicios.addActionListener (new ButtonActionListener(this,"EliminarConsumosServicios"));
		
		
		this.jInternalFrameDetalleFormConsumosServicios.jButtonEliminarToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"EliminarToolBarConsumosServicios"));
								
		this.jInternalFrameDetalleFormConsumosServicios.jMenuItemEliminarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConsumosServicios"));		
		
		
		
		this.jInternalFrameDetalleFormConsumosServicios.jButtonCancelarConsumosServicios.addActionListener (new ButtonActionListener(this,"CancelarConsumosServicios"));
		
		
		this.jInternalFrameDetalleFormConsumosServicios.jButtonCancelarToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"CancelarToolBarConsumosServicios"));
					
		this.jInternalFrameDetalleFormConsumosServicios.jMenuItemCancelarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConsumosServicios"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConsumosServicios.jMenuItemDetalleCerrarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConsumosServicios"));		
		
		
		
		this.jInternalFrameDetalleFormConsumosServicios.jButtonGuardarCambiosToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsumosServicios"));
		
		
		
		this.jInternalFrameDetalleFormConsumosServicios.jButtonGuardarCambiosToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsumosServicios"));
		
		
		
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConsumosServicios"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonidConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"idConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_empresaConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_empresaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_transaccionConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_transaccionConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_lineaConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_lineaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_grupoConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_grupoConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_categoriaConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_categoriaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_marcaConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_marcaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_tipo_producto_servicioConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_tipo_producto_servicioConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonfecha_emision_desdeConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonfecha_emision_hastaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_unidadConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_productoConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtoncantidadConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_lineaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_linea_grupoConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_linea_categoriaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_linea_marcaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtoncodigoConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"codigoConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtontotalConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"totalConsumosServiciosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConsumosServicios.jTabbedPaneRelacionesConsumosServicios.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConsumosServicios"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConsumosServicios"));
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConsumosServicios"));
		}
		
		this.jTableDatosConsumosServicios.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConsumosServicios"));
		
		this.jTableDatosConsumosServicios.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConsumosServicios"));
		
		this.jButtonNuevoConsumosServicios.addActionListener(new ButtonActionListener(this,"NuevoConsumosServicios"));
		
		this.jButtonDuplicarConsumosServicios.addActionListener(new ButtonActionListener(this,"DuplicarConsumosServicios"));
		
		this.jButtonCopiarConsumosServicios.addActionListener(new ButtonActionListener(this,"CopiarConsumosServicios"));
		
		this.jButtonVerFormConsumosServicios.addActionListener(new ButtonActionListener(this,"VerFormConsumosServicios"));
		
		
		this.jButtonNuevoToolBarConsumosServicios.addActionListener(new ButtonActionListener(this,"NuevoToolBarConsumosServicios"));
			
		this.jButtonDuplicarToolBarConsumosServicios.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConsumosServicios"));
			
		this.jMenuItemNuevoConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConsumosServicios"));
			
		this.jMenuItemDuplicarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConsumosServicios"));		
		
		
		this.jButtonNuevoRelacionesConsumosServicios.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConsumosServicios"));
		
		
		this.jButtonNuevoRelacionesToolBarConsumosServicios.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConsumosServicios"));
			
		this.jMenuItemNuevoRelacionesConsumosServicios.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConsumosServicios"));		
		
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jButtonModificarConsumosServicios.addActionListener(new ButtonActionListener(this,"ModificarConsumosServicios"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jButtonModificarToolBarConsumosServicios.addActionListener(new ButtonActionListener(this,"ModificarToolBarConsumosServicios"));
			
			this.jInternalFrameDetalleFormConsumosServicios.jMenuItemModificarConsumosServicios.addActionListener(new ButtonActionListener(this,"MenuItemModificarConsumosServicios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConsumosServicios.jButtonActualizarConsumosServicios.addActionListener (new ButtonActionListener(this,"ActualizarConsumosServicios"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jButtonActualizarToolBarConsumosServicios.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConsumosServicios"));
				
			this.jInternalFrameDetalleFormConsumosServicios.jMenuItemActualizarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConsumosServicios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jButtonEliminarConsumosServicios.addActionListener (new ButtonActionListener(this,"EliminarConsumosServicios"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jButtonEliminarToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"EliminarToolBarConsumosServicios"));
						
			this.jInternalFrameDetalleFormConsumosServicios.jMenuItemEliminarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConsumosServicios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jButtonCancelarConsumosServicios.addActionListener (new ButtonActionListener(this,"CancelarConsumosServicios"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jButtonCancelarToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"CancelarToolBarConsumosServicios"));
			
			this.jInternalFrameDetalleFormConsumosServicios.jMenuItemCancelarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConsumosServicios"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConsumosServicios"));		
		
		
		this.jButtonCerrarConsumosServicios.addActionListener (new ButtonActionListener(this,"CerrarConsumosServicios"));
		
		
		this.jButtonCerrarToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"CerrarToolBarConsumosServicios"));
			
		this.jMenuItemCerrarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConsumosServicios"));
			
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jMenuItemDetalleCerrarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConsumosServicios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jButtonGuardarCambiosConsumosServicios.addActionListener (new ButtonActionListener(this,"GuardarCambiosConsumosServicios"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jButtonGuardarCambiosToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsumosServicios"));
		}
		
		this.jButtonCopiarToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"CopiarToolBarConsumosServicios"));
			
		this.jButtonVerFormToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"VerFormToolBarConsumosServicios"));
		
		this.jMenuItemGuardarCambiosConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConsumosServicios"));
			
		this.jMenuItemCopiarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConsumosServicios"));		
		
		this.jMenuItemVerFormConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConsumosServicios"));		
		
		
		this.jButtonGuardarCambiosTablaConsumosServicios.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConsumosServicios"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConsumosServicios"));
			
		this.jMenuItemGuardarCambiosTablaConsumosServicios.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConsumosServicios"));		
		
		
		
		this.jButtonRecargarInformacionConsumosServicios.addActionListener (new ButtonActionListener(this,"RecargarInformacionConsumosServicios"));
					
		this.jButtonRecargarInformacionToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConsumosServicios"));
		
		this.jMenuItemRecargarInformacionConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConsumosServicios"));		
		
		
		
		this.jButtonAnterioresConsumosServicios.addActionListener (new ButtonActionListener(this,"AnterioresConsumosServicios"));
		
		
		this.jButtonAnterioresToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConsumosServicios"));
		
		this.jMenuItemAnterioresConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConsumosServicios"));		
		
		
		this.jButtonSiguientesConsumosServicios.addActionListener (new ButtonActionListener(this,"SiguientesConsumosServicios"));
		
		
		this.jButtonSiguientesToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConsumosServicios"));
			
		this.jMenuItemSiguientesConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConsumosServicios"));
			
		this.jMenuItemAbrirOrderByConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConsumosServicios"));
			
		this.jMenuItemMostrarOcultarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConsumosServicios"));
			
		this.jMenuItemDetalleAbrirOrderByConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConsumosServicios"));
			
		this.jMenuItemDetalleMostarOcultarConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConsumosServicios"));		
		
		
		this.jButtonNuevoGuardarCambiosConsumosServicios.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConsumosServicios"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConsumosServicios"));
			
		this.jMenuItemNuevoGuardarCambiosConsumosServicios.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConsumosServicios"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConsumosServicios.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConsumosServicios"));

		this.jCheckBoxSeleccionadosConsumosServicios.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConsumosServicios"));
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConsumosServicios"));
		}
		
		
		this.jComboBoxTiposRelacionesConsumosServicios.addActionListener (new ButtonActionListener(this,"TiposRelacionesConsumosServicios"));
			
		this.jComboBoxTiposAccionesConsumosServicios.addActionListener (new ButtonActionListener(this,"TiposAccionesConsumosServicios"));
					
		this.jComboBoxTiposSeleccionarConsumosServicios.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConsumosServicios"));
			
		this.jTextFieldValorCampoGeneralConsumosServicios.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConsumosServicios"));		
		
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonidConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"idConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_empresaConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_empresaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_transaccionConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_transaccionConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_lineaConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_lineaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_grupoConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_grupoConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_categoriaConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_categoriaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_marcaConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_marcaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_tipo_producto_servicioConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_tipo_producto_servicioConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonfecha_emision_desdeConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonfecha_emision_hastaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_unidadConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_productoConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtoncantidadConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_lineaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_linea_grupoConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_linea_categoriaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_linea_marcaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtoncodigoConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"codigoConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtontotalConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"totalConsumosServiciosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaConsumosServiciosConsumosServicios.addActionListener(new ButtonActionListener(this,"BusquedaConsumosServiciosConsumosServicios"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConsumosServicios!=null) {
				this.jInternalFrameReporteDinamicoConsumosServicios.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsumosServicios"));
				this.jInternalFrameReporteDinamicoConsumosServicios.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsumosServicios"));
				this.jInternalFrameReporteDinamicoConsumosServicios.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsumosServicios"));
			}
			
			//this.jButtonCerrarReporteDinamicoConsumosServicios.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsumosServicios"));				
			//this.jButtonGenerarReporteDinamicoConsumosServicios.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsumosServicios"));
			//this.jButtonGenerarExcelReporteDinamicoConsumosServicios.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsumosServicios"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConsumosServicios!=null) {
				this.jInternalFrameImportacionConsumosServicios.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConsumosServicios"));
				this.jInternalFrameImportacionConsumosServicios.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConsumosServicios"));
				this.jInternalFrameImportacionConsumosServicios.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConsumosServicios"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConsumosServicios.addActionListener (new ButtonActionListener(this,"AbrirOrderByConsumosServicios"));
			
			this.jButtonAbrirOrderByToolBarConsumosServicios.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConsumosServicios"));			
			
			if(this.jInternalFrameOrderByConsumosServicios!=null) {
				this.jInternalFrameOrderByConsumosServicios.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConsumosServicios"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosServicios.jTabbedPaneRelacionesConsumosServicios.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConsumosServicios"));
		
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
            		closingInternalFrameConsumosServicios();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConsumosServicios.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConsumosServicios = (JInternalFrameBase)event.getSource();
	            	
	            ConsumosServiciosBeanSwingJInternalFrame jInternalFrameParent=(ConsumosServiciosBeanSwingJInternalFrame)jInternalFrameDetalleFormConsumosServicios.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConsumosServiciosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConsumosServicios.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConsumosServiciosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConsumosServicios.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConsumosServicios.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsumosServiciosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsumosServiciosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsumosServiciosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConsumosServicios";
		inputMap = this.jButtonNuevoConsumosServicios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConsumosServicios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConsumosServiciosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsumosServiciosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsumosServiciosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsumosServiciosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConsumosServicios";
		inputMap = this.jButtonNuevoRelacionesConsumosServicios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConsumosServicios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConsumosServiciosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConsumosServicios";
		inputMap = this.jButtonModificarConsumosServicios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConsumosServicios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConsumosServiciosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConsumosServicios";
		inputMap = this.jButtonActualizarConsumosServicios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConsumosServicios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConsumosServiciosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConsumosServicios";
		inputMap = this.jButtonEliminarConsumosServicios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConsumosServicios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConsumosServiciosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConsumosServicios";
		inputMap = this.jButtonCancelarConsumosServicios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConsumosServicios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConsumosServiciosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConsumosServicios";
		inputMap = this.jButtonCerrarConsumosServicios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConsumosServicios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConsumosServiciosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConsumosServicios.jButtonGuardarCambiosConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConsumosServicios";
		inputMap = this.jInternalFrameDetalleFormConsumosServicios.jButtonGuardarCambiosConsumosServicios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConsumosServicios.jButtonGuardarCambiosConsumosServicios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConsumosServiciosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConsumosServicios.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConsumosServiciosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConsumosServicios.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConsumosServiciosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConsumosServicios.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConsumosServiciosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConsumosServicios.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConsumosServiciosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonidConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"idConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_empresaConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_empresaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_transaccionConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_transaccionConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_lineaConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_lineaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_grupoConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_grupoConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_categoriaConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_categoriaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_marcaConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_linea_marcaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaConsumosServiciosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_tipo_producto_servicioConsumosServiciosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioConsumosServiciosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonid_tipo_producto_servicioConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonfecha_emision_desdeConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonfecha_emision_hastaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_unidadConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_productoConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtoncantidadConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_lineaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_linea_grupoConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_linea_categoriaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtonnombre_linea_marcaConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtoncodigoConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"codigoConsumosServiciosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosServicios.jButtontotalConsumosServiciosBusqueda.addActionListener(new ButtonActionListener(this,"totalConsumosServiciosBusqueda"));
		
		
		this.jButtonBusquedaConsumosServiciosConsumosServicios.addActionListener(new ButtonActionListener(this,"BusquedaConsumosServiciosConsumosServicios"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConsumosServicios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConsumosServiciosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConsumosServiciosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConsumosServicios.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConsumosServicios(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ConsumosServicios consumosserviciosAux:this.consumosserviciosLogic.getConsumosServicioss()) {
					consumosserviciosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsumosServicios consumosserviciosAux:consumosservicioss) {
					consumosserviciosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConsumosServiciosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConsumosServicios(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConsumosServicios consumosserviciosAux:this.consumosserviciosLogic.getConsumosServicioss()) {
						consumosserviciosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConsumosServicios consumosserviciosAux:consumosservicioss) {
						consumosserviciosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ConsumosServicios consumosserviciosAux:this.consumosserviciosLogic.getConsumosServicioss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConsumosServicios consumosserviciosAux:consumosservicioss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConsumosServicios(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConsumosServicios.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConsumosServicios.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConsumosServiciosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConsumosServicios(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConsumosServicios.getSelectedRows();
			
			ConsumosServicios consumosserviciosLocal=new ConsumosServicios();
			
			//this.seleccionarTodosConsumosServicios(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consumosserviciosLocal =(ConsumosServicios) this.consumosserviciosLogic.getConsumosServicioss().toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					consumosserviciosLocal =(ConsumosServicios) this.consumosservicioss.toArray()[this.jTableDatosConsumosServicios.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				consumosserviciosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConsumosServicios consumosserviciosAux:this.consumosserviciosLogic.getConsumosServicioss()) {
						consumosserviciosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConsumosServicios consumosserviciosAux:consumosservicioss) {
						consumosserviciosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConsumosServicios(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConsumosServicios.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConsumosServicios.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConsumosServicios,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConsumosServiciosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConsumosServiciosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConsumosServiciosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConsumosServicios(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConsumosServicios.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConsumosServicios consumosserviciosAux:this.consumosserviciosLogic.getConsumosServicioss()) {
				
						if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							consumosserviciosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							consumosserviciosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							consumosserviciosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							consumosserviciosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							consumosserviciosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							consumosserviciosAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							consumosserviciosAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							consumosserviciosAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							consumosserviciosAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							consumosserviciosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							consumosserviciosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsumosServicios consumosserviciosAux:consumosservicioss) {
					
						if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							consumosserviciosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							consumosserviciosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							consumosserviciosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							consumosserviciosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							consumosserviciosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							consumosserviciosAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							consumosserviciosAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							consumosserviciosAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							consumosserviciosAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							consumosserviciosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							consumosserviciosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConsumosServicios(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConsumosServiciosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConsumosServicios(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConsumosServicios=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConsumosServicios.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConsumosServicios) {				
					conSplash=true;//false;										
					
					//this.startProcessConsumosServicios(conSplash);
				
					this.generarReporteConsumosServiciossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsumosServicios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConsumosServiciossSeleccionados();
				//this.jComboBoxTiposAccionesConsumosServicios.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConsumosServiciossSeleccionados(false);
				//this.jComboBoxTiposAccionesConsumosServicios.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConsumosServiciossSeleccionados(true);
				//this.jComboBoxTiposAccionesConsumosServicios.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConsumosServicios();
				
				this.exportarConsumosServiciossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsumosServicios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConsumosServicioss();
				//this.importarConsumosServicioss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsumosServicios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConsumosServicios();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConsumosServiciossSeleccionados();
				//this.jComboBoxTiposAccionesConsumosServicios.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Consumos Servicios", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConsumosServicios();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConsumosServicios)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConsumosServicios(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Consumos Servicios",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsumosServicios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.setSelectedIndex(0);					
				}	
			} 			
			else if(ConsumosServiciosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteConsumosServicios) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessConsumosServicios(conSplash);
					
						//this.actualizarParametrosGeneralConsumosServicios();
						
						this.generarReporteProcesoAccionConsumosServiciossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesConsumosServicios.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ConsumosServiciosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Consumos ServiciosES SELECCIONADOS?", "MANTENIMIENTO DE Consumos Servicios", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessConsumosServicios();
				
						this.actualizarParametrosGeneralConsumosServicios();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.consumosserviciosReturnGeneral=consumosserviciosLogic.procesarAccionConsumosServiciossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.consumosserviciosLogic.getConsumosServicioss(),this.consumosserviciosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarConsumosServiciosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConsumosServicios.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConsumosServicios();
					
					ConsumosServiciosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarConsumosServiciosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConsumosServicios.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConsumosServicios.jComboBoxTiposAccionesFormularioConsumosServicios.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConsumosServicios(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConsumosServiciosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConsumosServicios();
			
			if(this.jInternalFrameDetalleFormConsumosServicios==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();		
			ConsumosServicios consumosservicios=new ConsumosServicios();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConsumosServicios(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConsumosServicios.getSelectedItem();
			
			
			
			
			consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(true);
			//this.sTipoAccion;
			
			if(consumosserviciossSeleccionados.size()==1) {
				for(ConsumosServicios consumosserviciosAux:consumosserviciossSeleccionados) {
					consumosservicios=consumosserviciosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConsumosServicios();
			
      		//this.finishProcessConsumosServicios(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConsumosServiciosReturnGeneral() throws Exception {
		if(this.consumosserviciosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.consumosserviciosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.consumosserviciosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.consumosserviciosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.consumosserviciosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.consumosserviciosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConsumosServicios(false);
		}
		
		if(this.consumosserviciosReturnGeneral.getConRetornoLista() || this.consumosserviciosReturnGeneral.getConRetornoObjeto()) {
			if(this.consumosserviciosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.consumosserviciosLogic.setConsumosServicioss(this.consumosserviciosReturnGeneral.getConsumosServicioss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingConsumosServicios(false);
		}
	}
	
	public void actualizarParametrosGeneralConsumosServicios() throws Exception {
		
		
	}
	
	public ArrayList<ConsumosServicios> getConsumosServiciossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConsumosServicios) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ConsumosServicios consumosserviciosAux:consumosserviciosLogic.getConsumosServicioss()) {
					if(consumosserviciosAux.getIsSelected()) {
						consumosserviciossSeleccionados.add(consumosserviciosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsumosServicios consumosserviciosAux:this.consumosservicioss) {
					if(consumosserviciosAux.getIsSelected()) {
						consumosserviciossSeleccionados.add(consumosserviciosAux);				
					}
				}
			}
			
			if(consumosserviciossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						consumosserviciossSeleccionados.addAll(this.consumosserviciosLogic.getConsumosServicioss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						consumosserviciossSeleccionados.addAll(this.consumosservicioss);				
					}
				}
			}
		} else {
			consumosserviciossSeleccionados.add(this.consumosservicios);
		}
		
		return consumosserviciossSeleccionados;
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
	
	public void generarReporteConsumosServiciossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConsumosServiciossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConsumosServiciossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConsumosServiciossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConsumosServiciossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Consumos Servicios",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConsumosServiciossSeleccionados() throws Exception {
		ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();		
		
		consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConsumosServicioss("Todos",consumosserviciossSeleccionados);
		
	}	
	
	public void generarReporteNormalConsumosServiciossSeleccionados() throws Exception {
		ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();		
		
		consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConsumosServicioss("Todos",consumosserviciossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConsumosServiciossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();
		
		consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConsumosServicioss("Todos",consumosserviciossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConsumosServiciossSeleccionados() throws Exception {
		ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConsumosServicios();
		
		
		consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConsumosServicios();
		
		
		//this.generarReporteConsumosServicioss("Todos",consumosserviciossSeleccionados ,consumosserviciosImplementable,consumosserviciosImplementableHome);
	}
	
	public void mostrarImportacionConsumosServicioss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConsumosServicios();
		
		this.abrirFrameImportacionConsumosServicios();		
		
			
		//this.generarReporteConsumosServicioss("Todos",consumosserviciossSeleccionados ,consumosserviciosImplementable,consumosserviciosImplementableHome);
	}
	
	public void importarConsumosServicioss() throws Exception {		
	
	}
	
	public void exportarConsumosServiciossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConsumosServiciossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConsumosServiciossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConsumosServiciossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Consumos Servicios",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConsumosServiciossSeleccionados() throws Exception {
		ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();		
		
		consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosservicios."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConsumosServicios(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ConsumosServicios consumosserviciosAux:consumosserviciossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConsumosServicios(consumosserviciosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//consumosserviciosAux.setsDetalleGeneralEntityReporte(consumosserviciosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Servicios",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConsumosServicios(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosServiciosConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConsumosServicios(ConsumosServicios consumosservicios,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=consumosservicios.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.gettipoproductoservicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getnombre_linea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getnombre_linea_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getnombre_linea_categoria();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getnombre_linea_marca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosservicios.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConsumosServiciossSeleccionados() throws Exception {
		ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();		
		
		consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosservicios.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ConsumosServicioss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConsumosServicios(row);				
				iRow++;
			}				
			
			for(ConsumosServicios consumosserviciosAux:consumosserviciossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConsumosServicios(consumosserviciosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Servicios",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConsumosServiciossSeleccionados() throws Exception {
		ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();		
		
		consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosservicios.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("consumosservicioss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("consumosservicios");
			//elementRoot.appendChild(element);
		
			for(ConsumosServicios consumosserviciosAux:consumosserviciossSeleccionados) {
				element = document.createElement("consumosservicios");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConsumosServicios(consumosserviciosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Servicios",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConsumosServicios(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosServiciosConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConsumosServicios(ConsumosServicios consumosservicios,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.gettipoproductoservicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getnombre_linea());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getnombre_linea_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getnombre_linea_categoria());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getnombre_linea_marca());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosservicios.gettotal());				
	}
	
	public void setFilaDatosExportarXmlConsumosServicios(ConsumosServicios consumosservicios,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ConsumosServiciosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(consumosservicios.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConsumosServiciosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(consumosservicios.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ConsumosServiciosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(consumosservicios.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtransaccion_descripcion = document.createElement(ConsumosServiciosConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(consumosservicios.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementlinea_descripcion = document.createElement(ConsumosServiciosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(consumosservicios.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ConsumosServiciosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(consumosservicios.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ConsumosServiciosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(consumosservicios.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ConsumosServiciosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(consumosservicios.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementtipoproductoservicio_descripcion = document.createElement(ConsumosServiciosConstantesFunciones.IDTIPOPRODUCTOSERVICIO);
		elementtipoproductoservicio_descripcion.appendChild(document.createTextNode(consumosservicios.gettipoproductoservicio_descripcion()));
		element.appendChild(elementtipoproductoservicio_descripcion);

		Element elementfecha_emision_desde = document.createElement(ConsumosServiciosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(consumosservicios.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(ConsumosServiciosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(consumosservicios.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_unidad = document.createElement(ConsumosServiciosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(consumosservicios.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementnombre_producto = document.createElement(ConsumosServiciosConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(consumosservicios.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementcantidad = document.createElement(ConsumosServiciosConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(consumosservicios.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementnombre_linea = document.createElement(ConsumosServiciosConstantesFunciones.NOMBRELINEA);
		elementnombre_linea.appendChild(document.createTextNode(consumosservicios.getnombre_linea().trim()));
		element.appendChild(elementnombre_linea);

		Element elementnombre_linea_grupo = document.createElement(ConsumosServiciosConstantesFunciones.NOMBRELINEAGRUPO);
		elementnombre_linea_grupo.appendChild(document.createTextNode(consumosservicios.getnombre_linea_grupo().trim()));
		element.appendChild(elementnombre_linea_grupo);

		Element elementnombre_linea_categoria = document.createElement(ConsumosServiciosConstantesFunciones.NOMBRELINEACATEGORIA);
		elementnombre_linea_categoria.appendChild(document.createTextNode(consumosservicios.getnombre_linea_categoria().trim()));
		element.appendChild(elementnombre_linea_categoria);

		Element elementnombre_linea_marca = document.createElement(ConsumosServiciosConstantesFunciones.NOMBRELINEAMARCA);
		elementnombre_linea_marca.appendChild(document.createTextNode(consumosservicios.getnombre_linea_marca().trim()));
		element.appendChild(elementnombre_linea_marca);

		Element elementcodigo = document.createElement(ConsumosServiciosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(consumosservicios.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementtotal = document.createElement(ConsumosServiciosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(consumosservicios.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoConsumosServiciossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ConsumosServicios> consumosserviciossSeleccionados=new ArrayList<ConsumosServicios>();
		
		consumosserviciossSeleccionados=this.getConsumosServiciossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConsumosServicios(consumosserviciossSeleccionados);
		
		this.generarReporteConsumosServicioss("Todos",consumosserviciossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConsumosServicios(ArrayList<ConsumosServicios> consumosserviciossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ConsumosServicios consumosserviciosAux:consumosserviciossSeleccionados) {
				consumosserviciosAux.setsDetalleGeneralEntityReporte(consumosserviciosAux.toString());
			
				if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.gettipoproductoservicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(consumosserviciosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(consumosserviciosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEA)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getnombre_linea());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getnombre_linea_grupo());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getnombre_linea_categoria());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getnombre_linea_marca());
				}
				 else if(sTipoSeleccionar.equals(ConsumosServiciosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					consumosserviciosAux.setsDescripcionGeneralEntityReporte1(consumosserviciosAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosServiciosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConsumosServicios(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConsumosServicios=true;
				this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=true;
				this.isVisibilidadCeldaGuardarCambiosConsumosServicios=true;
			}
			
			this.isVisibilidadCeldaModificarConsumosServicios=false;
			this.isVisibilidadCeldaActualizarConsumosServicios=false;
			this.isVisibilidadCeldaEliminarConsumosServicios=false;
			this.isVisibilidadCeldaCancelarConsumosServicios=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosServicios=true;
				} else {
					this.isVisibilidadCeldaGuardarConsumosServicios=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConsumosServicios=false;
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosServicios=false;
			this.isVisibilidadCeldaModificarConsumosServicios=false;
			this.isVisibilidadCeldaActualizarConsumosServicios=true;
			this.isVisibilidadCeldaEliminarConsumosServicios=false;
			this.isVisibilidadCeldaCancelarConsumosServicios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosServicios=true;
				} else {
					this.isVisibilidadCeldaGuardarConsumosServicios=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConsumosServicios=false;
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosServicios=false;
			this.isVisibilidadCeldaModificarConsumosServicios=false;
			this.isVisibilidadCeldaActualizarConsumosServicios=true;
			this.isVisibilidadCeldaEliminarConsumosServicios=true;
			this.isVisibilidadCeldaCancelarConsumosServicios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosServicios=true;
				} else {
					this.isVisibilidadCeldaGuardarConsumosServicios=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConsumosServicios=false;
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosServicios=false;
			this.isVisibilidadCeldaModificarConsumosServicios=false;
			this.isVisibilidadCeldaActualizarConsumosServicios=true;
			this.isVisibilidadCeldaEliminarConsumosServicios=false;
			this.isVisibilidadCeldaCancelarConsumosServicios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosServicios=false;
				} else {
					this.isVisibilidadCeldaGuardarConsumosServicios=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConsumosServicios=true;
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=true;
			this.isVisibilidadCeldaGuardarCambiosConsumosServicios=true;
			this.isVisibilidadCeldaModificarConsumosServicios=false;
			this.isVisibilidadCeldaActualizarConsumosServicios=false;
			this.isVisibilidadCeldaEliminarConsumosServicios=false;
			this.isVisibilidadCeldaCancelarConsumosServicios=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosServicios=true;
				} else {
					this.isVisibilidadCeldaGuardarConsumosServicios=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConsumosServicios=false;
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosServicios=false;
			this.isVisibilidadCeldaActualizarConsumosServicios=false;
			this.isVisibilidadCeldaEliminarConsumosServicios=false;
			this.isVisibilidadCeldaCancelarConsumosServicios=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosServicios=false;
				} else {
					this.isVisibilidadCeldaGuardarConsumosServicios=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConsumosServicios=false;
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosServicios=false;
			this.isVisibilidadCeldaModificarConsumosServicios=true;
			this.isVisibilidadCeldaActualizarConsumosServicios=false;
			this.isVisibilidadCeldaEliminarConsumosServicios=false;
			this.isVisibilidadCeldaCancelarConsumosServicios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosServicios=false;
				} else {
					this.isVisibilidadCeldaGuardarConsumosServicios=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConsumosServiciosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConsumosServicios=true;
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=true;
			this.isVisibilidadCeldaGuardarCambiosConsumosServicios=true;
		} else {
			this.actualizarEstadoPanelsConsumosServicios(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConsumosServicios=false;
			//this.isVisibilidadCeldaVerFormConsumosServicios=false;
			this.isVisibilidadCeldaDuplicarConsumosServicios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!consumosserviciosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=false;
		} else {
			this.isVisibilidadCeldaNuevoConsumosServicios=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosServicios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(consumosserviciosSessionBean.getEsGuardarRelacionado()) {
			if(!consumosserviciosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=false;												
			}
			
			this.jButtonCerrarConsumosServicios.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=false;
		}
		
		if(!this.permiteMantenimiento(this.consumosservicios)) {
			this.isVisibilidadCeldaActualizarConsumosServicios=false;
			this.isVisibilidadCeldaEliminarConsumosServicios=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoConsumosServicios=false;
		this.isVisibilidadCeldaNuevoRelacionesConsumosServicios=false;
		this.isVisibilidadCeldaGuardarCambiosConsumosServicios=false;
		//this.isVisibilidadCeldaModificarConsumosServicios=true;
		this.isVisibilidadCeldaActualizarConsumosServicios=false;
		this.isVisibilidadCeldaEliminarConsumosServicios=false;
		//this.isVisibilidadCeldaCancelarConsumosServicios=true;			
		this.isVisibilidadCeldaGuardarConsumosServicios=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConsumosServicios() {
	}
	
	public void actualizarEstadoPanelsConsumosServicios(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConsumosServicios!=null) {
				this.jScrollPanelDatosEdicionConsumosServicios.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosServicios!=null) {
				this.jTabbedPaneBusquedasConsumosServicios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsumosServicios!=null) {
				this.jScrollPanelDatosConsumosServicios.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsumosServicios!=null) {
				this.jPanelPaginacionConsumosServicios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsumosServicios!=null) {
				this.jPanelParametrosReportesConsumosServicios.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConsumosServicios!=null) {
				this.jScrollPanelDatosEdicionConsumosServicios.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosServicios!=null) {
				this.jTabbedPaneBusquedasConsumosServicios.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConsumosServicios!=null) {
				this.jScrollPanelDatosConsumosServicios.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsumosServicios!=null) {
				this.jPanelPaginacionConsumosServicios.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsumosServicios!=null) {
				this.jPanelParametrosReportesConsumosServicios.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConsumosServicios!=null) {
				this.jScrollPanelDatosEdicionConsumosServicios.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosServicios!=null) {
				this.jTabbedPaneBusquedasConsumosServicios.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConsumosServicios!=null) {
				this.jScrollPanelDatosConsumosServicios.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsumosServicios!=null) {
				this.jPanelPaginacionConsumosServicios.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsumosServicios!=null) {
				this.jPanelParametrosReportesConsumosServicios.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConsumosServicios!=null) {
				this.jScrollPanelDatosEdicionConsumosServicios.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosServicios!=null) {
				this.jTabbedPaneBusquedasConsumosServicios.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConsumosServicios!=null) {
				this.jScrollPanelDatosConsumosServicios.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsumosServicios!=null) {
				this.jPanelPaginacionConsumosServicios.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsumosServicios!=null) {
				this.jPanelParametrosReportesConsumosServicios.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConsumosServicios!=null) {
				this.jScrollPanelDatosEdicionConsumosServicios.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosServicios!=null) {
				this.jTabbedPaneBusquedasConsumosServicios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsumosServicios!=null) {
				this.jScrollPanelDatosConsumosServicios.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsumosServicios!=null) {
				this.jPanelPaginacionConsumosServicios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsumosServicios!=null) {
				this.jPanelParametrosReportesConsumosServicios.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConsumosServicios!=null) {
				this.jScrollPanelDatosEdicionConsumosServicios.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosServicios!=null) {
				this.jTabbedPaneBusquedasConsumosServicios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsumosServicios!=null) {
				this.jScrollPanelDatosConsumosServicios.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsumosServicios!=null) {
				this.jPanelPaginacionConsumosServicios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsumosServicios!=null) {
				this.jPanelParametrosReportesConsumosServicios.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConsumosServicios!=null) {
				this.jScrollPanelDatosEdicionConsumosServicios.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosServicios!=null) {
				this.jTabbedPaneBusquedasConsumosServicios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsumosServicios!=null) {
				this.jScrollPanelDatosConsumosServicios.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsumosServicios!=null) {
				this.jPanelPaginacionConsumosServicios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsumosServicios!=null) {
				this.jPanelParametrosReportesConsumosServicios.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConsumosServicios!=null) {
					this.jTabbedPaneBusquedasConsumosServicios.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConsumosServicios!=null) {
				this.jPanelParametrosReportesConsumosServicios.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.consumosserviciosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosServicios!=null) {
				this.jTabbedPaneBusquedasConsumosServicios.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConsumosServicios!=null) {
				this.jPanelParametrosReportesConsumosServicios.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaConsumosServicios=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaConsumosServicios) {this.jTabbedPaneBusquedasConsumosServicios.remove(jPanelBusquedaConsumosServiciosConsumosServicios);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadBusquedaConsumosServicios=isParaTransaccion;
			if(!this.isVisibilidadBusquedaConsumosServicios) {this.jTabbedPaneBusquedasConsumosServicios.remove(jPanelBusquedaConsumosServiciosConsumosServicios);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaConsumosServicios=isParaLinea;
			if(!this.isVisibilidadBusquedaConsumosServicios) {this.jTabbedPaneBusquedasConsumosServicios.remove(jPanelBusquedaConsumosServiciosConsumosServicios);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaConsumosServicios=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaConsumosServicios) {this.jTabbedPaneBusquedasConsumosServicios.remove(jPanelBusquedaConsumosServiciosConsumosServicios);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaConsumosServicios=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaConsumosServicios) {this.jTabbedPaneBusquedasConsumosServicios.remove(jPanelBusquedaConsumosServiciosConsumosServicios);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaConsumosServicios=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaConsumosServicios) {this.jTabbedPaneBusquedasConsumosServicios.remove(jPanelBusquedaConsumosServiciosConsumosServicios);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProductoServicio(Boolean isParaTipoProductoServicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoServicioNegation=!isParaTipoProductoServicio;

			this.isVisibilidadBusquedaConsumosServicios=isParaTipoProductoServicio;
			if(!this.isVisibilidadBusquedaConsumosServicios) {this.jTabbedPaneBusquedasConsumosServicios.remove(jPanelBusquedaConsumosServiciosConsumosServicios);}
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
			
			this.inicializarActualizarBindingTablaConsumosServicios(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConsumosServicios() {
		this.updateBorderResaltarBusquedasFormularioConsumosServicios();
		this.updateVisibilidadBusquedasFormularioConsumosServicios();
		this.updateHabilitarBusquedasFormularioConsumosServicios();
	}
	
	public void updateBorderResaltarBusquedasFormularioConsumosServicios() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConsumosServicios.getComponents().length>0) {
	

		if(this.consumosserviciosConstantesFunciones.resaltarBusquedaConsumosServiciosConsumosServicios!=null) {
			index= this.jTabbedPaneBusquedasConsumosServicios.indexOfComponent(this.jPanelBusquedaConsumosServiciosConsumosServicios);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConsumosServicios.getComponent(index);
				jPanel.setBorder(this.consumosserviciosConstantesFunciones.resaltarBusquedaConsumosServiciosConsumosServicios);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConsumosServicios() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConsumosServicios.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConsumosServicios.indexOfComponent(this.jPanelBusquedaConsumosServiciosConsumosServicios);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConsumosServicios.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.consumosserviciosConstantesFunciones.mostrarBusquedaConsumosServiciosConsumosServicios);
			if(!this.consumosserviciosConstantesFunciones.mostrarBusquedaConsumosServiciosConsumosServicios && index>-1) {
				this.jTabbedPaneBusquedasConsumosServicios.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConsumosServicios() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConsumosServicios.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConsumosServicios.indexOfComponent(this.jPanelBusquedaConsumosServiciosConsumosServicios);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConsumosServicios.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.consumosserviciosConstantesFunciones.activarBusquedaConsumosServiciosConsumosServicios);
				this.jTabbedPaneBusquedasConsumosServicios.setEnabledAt(index,this.consumosserviciosConstantesFunciones.activarBusquedaConsumosServiciosConsumosServicios);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConsumosServicios(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaConsumosServicios")) {
			index= this.jTabbedPaneBusquedasConsumosServicios.indexOfComponent(this.jPanelBusquedaConsumosServiciosConsumosServicios);

			this.jTabbedPaneBusquedasConsumosServicios.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConsumosServicios.getComponent(index);

			this.consumosserviciosConstantesFunciones.setResaltarBusquedaConsumosServiciosConsumosServicios(resaltar);

			jPanel.setBorder(this.consumosserviciosConstantesFunciones.resaltarBusquedaConsumosServiciosConsumosServicios);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarConsumosServicios.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioConsumosServicios() throws Exception {

		if(this.jInternalFrameDetalleFormConsumosServicios==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConsumosServicios();
		this.updateVisibilidadResaltarControlesFormularioConsumosServicios();
		this.updateHabilitarResaltarControlesFormularioConsumosServicios();
		
	}
	
	public void updateBorderResaltarControlesFormularioConsumosServicios() throws Exception {
		if(this.jInternalFrameDetalleFormConsumosServicios==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.consumosserviciosConstantesFunciones.resaltaridConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jLabelidConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltaridConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarid_empresaConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarid_empresaConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarid_transaccionConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarid_transaccionConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarid_lineaConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarid_lineaConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarid_linea_grupoConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarid_linea_grupoConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarid_linea_categoriaConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarid_linea_categoriaConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarid_linea_marcaConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarid_linea_marcaConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarid_tipo_producto_servicioConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarid_tipo_producto_servicioConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarfecha_emision_desdeConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jDateChooserfecha_emision_desdeConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarfecha_emision_desdeConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarfecha_emision_hastaConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jDateChooserfecha_emision_hastaConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarfecha_emision_hastaConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarnombre_unidadConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jTextFieldnombre_unidadConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarnombre_unidadConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarnombre_productoConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_productoConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarnombre_productoConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarcantidadConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcantidadConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarcantidadConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarnombre_lineaConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_lineaConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarnombre_lineaConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarnombre_linea_grupoConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_grupoConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarnombre_linea_grupoConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarnombre_linea_categoriaConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_categoriaConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarnombre_linea_categoriaConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarnombre_linea_marcaConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_marcaConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarnombre_linea_marcaConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltarcodigoConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcodigoConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltarcodigoConsumosServicios);}
		if(this.consumosserviciosConstantesFunciones.resaltartotalConsumosServicios!=null && this.jInternalFrameDetalleFormConsumosServicios!=null) {this.jInternalFrameDetalleFormConsumosServicios.jTextFieldtotalConsumosServicios.setBorder(this.consumosserviciosConstantesFunciones.resaltartotalConsumosServicios);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConsumosServicios() throws Exception {		
		if(this.jInternalFrameDetalleFormConsumosServicios==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
	
		//this.jInternalFrameDetalleFormConsumosServicios.jLabelidConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostraridConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelidConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostraridConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_empresaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelid_empresaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_empresaConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_transaccionConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelid_transaccionConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_transaccionConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_lineaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelid_lineaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_lineaConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_linea_grupoConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelid_linea_grupoConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_linea_grupoConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_linea_categoriaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelid_linea_categoriaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_linea_categoriaConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_linea_marcaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelid_linea_marcaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_linea_marcaConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_tipo_producto_servicioConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelid_tipo_producto_servicioConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarid_tipo_producto_servicioConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jDateChooserfecha_emision_desdeConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarfecha_emision_desdeConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelfecha_emision_desdeConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarfecha_emision_desdeConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jDateChooserfecha_emision_hastaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarfecha_emision_hastaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelfecha_emision_hastaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarfecha_emision_hastaConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jTextFieldnombre_unidadConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarnombre_unidadConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelnombre_unidadConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarnombre_unidadConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_productoConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarnombre_productoConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelnombre_productoConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarnombre_productoConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcantidadConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarcantidadConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelcantidadConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarcantidadConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_lineaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarnombre_lineaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelnombre_lineaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarnombre_lineaConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_grupoConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarnombre_linea_grupoConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelnombre_linea_grupoConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarnombre_linea_grupoConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_categoriaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarnombre_linea_categoriaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelnombre_linea_categoriaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarnombre_linea_categoriaConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_marcaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarnombre_linea_marcaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelnombre_linea_marcaConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarnombre_linea_marcaConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcodigoConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarcodigoConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPanelcodigoConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrarcodigoConsumosServicios);
		//this.jInternalFrameDetalleFormConsumosServicios.jTextFieldtotalConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrartotalConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jPaneltotalConsumosServicios.setVisible(this.consumosserviciosConstantesFunciones.mostrartotalConsumosServicios);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConsumosServicios() throws Exception {
		if(this.jInternalFrameDetalleFormConsumosServicios==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConsumosServicios!=null) {
	
		this.jInternalFrameDetalleFormConsumosServicios.jLabelidConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activaridConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_empresaConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarid_empresaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_transaccionConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarid_transaccionConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_lineaConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarid_lineaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_grupoConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarid_linea_grupoConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_categoriaConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarid_linea_categoriaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_linea_marcaConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarid_linea_marcaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jComboBoxid_tipo_producto_servicioConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarid_tipo_producto_servicioConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jDateChooserfecha_emision_desdeConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarfecha_emision_desdeConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jDateChooserfecha_emision_hastaConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarfecha_emision_hastaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextFieldnombre_unidadConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarnombre_unidadConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_productoConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarnombre_productoConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcantidadConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarcantidadConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_lineaConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarnombre_lineaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_grupoConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarnombre_linea_grupoConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_categoriaConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarnombre_linea_categoriaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextAreanombre_linea_marcaConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarnombre_linea_marcaConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextFieldcodigoConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activarcodigoConsumosServicios);
		this.jInternalFrameDetalleFormConsumosServicios.jTextFieldtotalConsumosServicios.setEnabled(this.consumosserviciosConstantesFunciones.activartotalConsumosServicios);
		}
	}
	
		
}