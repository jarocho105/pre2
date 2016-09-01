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

//import com.bydan.erp.inventario.util.ProcesoCodigosAlternosConstantesFunciones;
import com.bydan.erp.inventario.util.report.ProcesoCodigosAlternosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ProcesoCodigosAlternosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ProcesoCodigosAlternosBean;
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

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoCodigosAlternosBeanSwingJInternalFrame extends ProcesoCodigosAlternosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoCodigosAlternosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoCodigosAlternos> procesocodigosalternosValidator = new ClassValidator<ProcesoCodigosAlternos>(ProcesoCodigosAlternos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoCodigosAlternos procesocodigosalternos;	
	public ProcesoCodigosAlternos procesocodigosalternosAux;
	public ProcesoCodigosAlternos procesocodigosalternosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoCodigosAlternos procesocodigosalternosTotales;
	public Long idProcesoCodigosAlternosActual;
	public Long iIdNuevoProcesoCodigosAlternos=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboBodega="";

	public List<Bodega> bodegasForeignKey;

	public List<Bodega> getbodegasForeignKey() {
		return bodegasForeignKey;
	}

	public void setbodegasForeignKey(List<Bodega> bodegasForeignKey) {
		this.bodegasForeignKey = bodegasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegaForeignKey;

	public Bodega getbodegaForeignKey() {
		return bodegaForeignKey;
	}

	public void setbodegaForeignKey(Bodega bodegaForeignKey) {
		this.bodegaForeignKey = bodegaForeignKey;
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
	
	public Boolean isPermisoTodoProcesoCodigosAlternos;
	public Boolean isPermisoNuevoProcesoCodigosAlternos;
	public Boolean isPermisoActualizarProcesoCodigosAlternos;
	public Boolean isPermisoActualizarOriginalProcesoCodigosAlternos;
	public Boolean isPermisoEliminarProcesoCodigosAlternos;
	public Boolean isPermisoGuardarCambiosProcesoCodigosAlternos;
	public Boolean isPermisoConsultaProcesoCodigosAlternos;
	public Boolean isPermisoBusquedaProcesoCodigosAlternos;
	public Boolean isPermisoReporteProcesoCodigosAlternos;
	public Boolean isPermisoPaginacionMedioProcesoCodigosAlternos;
	public Boolean isPermisoPaginacionAltoProcesoCodigosAlternos;
	public Boolean isPermisoPaginacionTodoProcesoCodigosAlternos;
	public Boolean isPermisoCopiarProcesoCodigosAlternos;
	public Boolean isPermisoVerFormProcesoCodigosAlternos;
	public Boolean isPermisoDuplicarProcesoCodigosAlternos;
	public Boolean isPermisoOrdenProcesoCodigosAlternos;
	
	
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
	
	public ProcesoCodigosAlternosParameterReturnGeneral procesocodigosalternosReturnGeneral;
	public ProcesoCodigosAlternosParameterReturnGeneral procesocodigosalternosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoCodigosAlternos=false;
	public Boolean esParaAccionDesdeFormularioProcesoCodigosAlternos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoCodigosAlternosSessionBeanAdditional procesocodigosalternosSessionBeanAdditional=null;
	
	public ProcesoCodigosAlternosSessionBeanAdditional getProcesoCodigosAlternosSessionBeanAdditional() {
		return this.procesocodigosalternosSessionBeanAdditional;
	}
	
	public void setProcesoCodigosAlternosSessionBeanAdditional(ProcesoCodigosAlternosSessionBeanAdditional procesocodigosalternosSessionBeanAdditional) {
		try {
			this.procesocodigosalternosSessionBeanAdditional=procesocodigosalternosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional procesocodigosalternosBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoCodigosAlternosBeanSwingJInternalFrame
	
	public ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional getProcesoCodigosAlternosBeanSwingJInternalFrameAdditional() {
		return this.procesocodigosalternosBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoCodigosAlternosBeanSwingJInternalFrameAdditional(ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional procesocodigosalternosBeanSwingJInternalFrameAdditional) {
		try {
			this.procesocodigosalternosBeanSwingJInternalFrameAdditional=procesocodigosalternosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoCodigosAlternosLogic procesocodigosalternosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoCodigosAlternos procesocodigosalternosBean;
	public ProcesoCodigosAlternosConstantesFunciones procesocodigosalternosConstantesFunciones;
	//public ProcesoCodigosAlternosParameterReturnGeneral procesocodigosalternosReturnGeneral;
	
	//FK
	
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoCodigosAlternos> procesocodigosalternoss;	
	//public List<ProcesoCodigosAlternos> procesocodigosalternossEliminados;
	//public List<ProcesoCodigosAlternos> procesocodigosalternossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoCodigosAlternos=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoCodigosAlternos=true;
	public Boolean isVisibilidadCeldaCopiarProcesoCodigosAlternos=true;
	public Boolean isVisibilidadCeldaVerFormProcesoCodigosAlternos=true;
	public Boolean isVisibilidadCeldaOrdenProcesoCodigosAlternos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=false;
	public Boolean isVisibilidadCeldaModificarProcesoCodigosAlternos=false;
	public Boolean isVisibilidadCeldaActualizarProcesoCodigosAlternos=false;
	public Boolean isVisibilidadCeldaEliminarProcesoCodigosAlternos=false;
	public Boolean isVisibilidadCeldaCancelarProcesoCodigosAlternos=false;
	public Boolean isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoCodigosAlternos=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProcesoCodigosAlternos() {
		return this.iIdNuevoProcesoCodigosAlternos;
	}

	public void setiIdNuevoProcesoCodigosAlternos(Long iIdNuevoProcesoCodigosAlternos) {
		this.iIdNuevoProcesoCodigosAlternos = iIdNuevoProcesoCodigosAlternos;
	}
	
	public Long getidProcesoCodigosAlternosActual() {
		return this.idProcesoCodigosAlternosActual;
	}

	public void setidProcesoCodigosAlternosActual(Long idProcesoCodigosAlternosActual) {
		this.idProcesoCodigosAlternosActual = idProcesoCodigosAlternosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoCodigosAlternos getprocesocodigosalternos() {
		return this.procesocodigosalternos;
	}

	public void setprocesocodigosalternos(ProcesoCodigosAlternos procesocodigosalternos) {
		this.procesocodigosalternos = procesocodigosalternos;
	}
	
	public ProcesoCodigosAlternos getprocesocodigosalternosAux() {
		return this.procesocodigosalternosAux;
	}

	public void setprocesocodigosalternosAux(ProcesoCodigosAlternos procesocodigosalternosAux) {
		this.procesocodigosalternosAux = procesocodigosalternosAux;
	}				
	
	public ProcesoCodigosAlternos getprocesocodigosalternosAnterior() {
		return this.procesocodigosalternosAnterior;
	}

	public void setprocesocodigosalternosAnterior(ProcesoCodigosAlternos procesocodigosalternosAnterior) {
		this.procesocodigosalternosAnterior = procesocodigosalternosAnterior;
	}	
	
	public ProcesoCodigosAlternos getprocesocodigosalternosTotales() {
		return this.procesocodigosalternosTotales;
	}

	public void setprocesocodigosalternosTotales(ProcesoCodigosAlternos procesocodigosalternosTotales) {
		this.procesocodigosalternosTotales = procesocodigosalternosTotales;
	}	
	
	public ProcesoCodigosAlternos getprocesocodigosalternosBean() {
		return this.procesocodigosalternosBean;
	}

	public void setprocesocodigosalternosBean(ProcesoCodigosAlternos procesocodigosalternosBean) {
		this.procesocodigosalternosBean = procesocodigosalternosBean;
	}	
	
	public ProcesoCodigosAlternosParameterReturnGeneral getprocesocodigosalternosReturnGeneral() {
		return this.procesocodigosalternosReturnGeneral;
	}

	public void setprocesocodigosalternosReturnGeneral(ProcesoCodigosAlternosParameterReturnGeneral procesocodigosalternosReturnGeneral) {
		this.procesocodigosalternosReturnGeneral = procesocodigosalternosReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaProcesoCodigosAlternos=-1L;

	public Long getid_bodegaBusquedaProcesoCodigosAlternos() {
		return this.id_bodegaBusquedaProcesoCodigosAlternos;
	}

	public void setid_bodegaBusquedaProcesoCodigosAlternos(Long id_bodegaBusquedaProcesoCodigosAlternos) {
		this.id_bodegaBusquedaProcesoCodigosAlternos = id_bodegaBusquedaProcesoCodigosAlternos;
	}

;
	public Long id_productoBusquedaProcesoCodigosAlternos=-1L;

	public Long getid_productoBusquedaProcesoCodigosAlternos() {
		return this.id_productoBusquedaProcesoCodigosAlternos;
	}

	public void setid_productoBusquedaProcesoCodigosAlternos(Long id_productoBusquedaProcesoCodigosAlternos) {
		this.id_productoBusquedaProcesoCodigosAlternos = id_productoBusquedaProcesoCodigosAlternos;
	}

;
	public Long id_lineaBusquedaProcesoCodigosAlternos=-1L;

	public Long getid_lineaBusquedaProcesoCodigosAlternos() {
		return this.id_lineaBusquedaProcesoCodigosAlternos;
	}

	public void setid_lineaBusquedaProcesoCodigosAlternos(Long id_lineaBusquedaProcesoCodigosAlternos) {
		this.id_lineaBusquedaProcesoCodigosAlternos = id_lineaBusquedaProcesoCodigosAlternos;
	}

;
	public Long id_linea_grupoBusquedaProcesoCodigosAlternos=-1L;

	public Long getid_linea_grupoBusquedaProcesoCodigosAlternos() {
		return this.id_linea_grupoBusquedaProcesoCodigosAlternos;
	}

	public void setid_linea_grupoBusquedaProcesoCodigosAlternos(Long id_linea_grupoBusquedaProcesoCodigosAlternos) {
		this.id_linea_grupoBusquedaProcesoCodigosAlternos = id_linea_grupoBusquedaProcesoCodigosAlternos;
	}

;
	public Long id_linea_categoriaBusquedaProcesoCodigosAlternos=-1L;

	public Long getid_linea_categoriaBusquedaProcesoCodigosAlternos() {
		return this.id_linea_categoriaBusquedaProcesoCodigosAlternos;
	}

	public void setid_linea_categoriaBusquedaProcesoCodigosAlternos(Long id_linea_categoriaBusquedaProcesoCodigosAlternos) {
		this.id_linea_categoriaBusquedaProcesoCodigosAlternos = id_linea_categoriaBusquedaProcesoCodigosAlternos;
	}

;
	public Long id_linea_marcaBusquedaProcesoCodigosAlternos=-1L;

	public Long getid_linea_marcaBusquedaProcesoCodigosAlternos() {
		return this.id_linea_marcaBusquedaProcesoCodigosAlternos;
	}

	public void setid_linea_marcaBusquedaProcesoCodigosAlternos(Long id_linea_marcaBusquedaProcesoCodigosAlternos) {
		this.id_linea_marcaBusquedaProcesoCodigosAlternos = id_linea_marcaBusquedaProcesoCodigosAlternos;
	}

	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
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

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
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
	
	
	public ProcesoCodigosAlternosLogic getProcesoCodigosAlternosLogic()	{		
		return procesocodigosalternosLogic;
	}

	public void setProcesoCodigosAlternosLogic(ProcesoCodigosAlternosLogic procesocodigosalternosLogic) {
		this.procesocodigosalternosLogic = procesocodigosalternosLogic;
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
	
	public Boolean getIsEsNuevoProcesoCodigosAlternos() {
		return isEsNuevoProcesoCodigosAlternos;
	}

	public void setIsEsNuevoProcesoCodigosAlternos(Boolean isEsNuevoProcesoCodigosAlternos) {
		this.isEsNuevoProcesoCodigosAlternos = isEsNuevoProcesoCodigosAlternos;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoCodigosAlternos() {
		return esParaAccionDesdeFormularioProcesoCodigosAlternos;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoCodigosAlternos(Boolean esParaAccionDesdeFormularioProcesoCodigosAlternos) {
		this.esParaAccionDesdeFormularioProcesoCodigosAlternos = esParaAccionDesdeFormularioProcesoCodigosAlternos;
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
	
	
	public void cargarCombosBodegasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.procesocodigosalternosSessionBean==null) {
				this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
			}

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodega(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(procesocodigosalternosSessionBean.getlidBodegaActual());
					this.bodegasForeignKey.add(bodegaLogic.getBodega());
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

			productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.procesocodigosalternosSessionBean==null) {
				this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
			}

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

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
					productoLogic.getEntityWithConnection(procesocodigosalternosSessionBean.getlidProductoActual());
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

			if(this.procesocodigosalternosSessionBean==null) {
				this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
			}

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(procesocodigosalternosSessionBean.getlidEmpresaActual());
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

			if(this.procesocodigosalternosSessionBean==null) {
				this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
			}

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(procesocodigosalternosSessionBean.getlidSucursalActual());
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

			if(this.procesocodigosalternosSessionBean==null) {
				this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
			}

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(procesocodigosalternosSessionBean.getlidLineaActual());
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

			if(this.procesocodigosalternosSessionBean==null) {
				this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
			}

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(procesocodigosalternosSessionBean.getlidLineaGrupoActual());
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

			if(this.procesocodigosalternosSessionBean==null) {
				this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
			}

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(procesocodigosalternosSessionBean.getlidLineaCategoriaActual());
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

			if(this.procesocodigosalternosSessionBean==null) {
				this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
			}

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(procesocodigosalternosSessionBean.getlidLineaMarcaActual());
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

	
	
	public void setActualBodegaForeignKey(Long idBodegaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegaTemp!=null) {

					if(this.procesocodigosalternos!=null) {
						this.procesocodigosalternos.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProcesoCodigosAlternos.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCodigosAlternos") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
						jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
							//jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedIndex(0);
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

	public String getActualBodegaForeignKeyDescripcion(Long idBodegaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProcesoCodigosAlternosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(bodegaTemp!=null) {
				jComboBoxid_bodegaProcesoCodigosAlternosGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProcesoCodigosAlternosGenerico!=null && jComboBoxid_bodegaProcesoCodigosAlternosGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProcesoCodigosAlternosGenerico.setSelectedIndex(0);
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

					if(this.procesocodigosalternos!=null) {
						this.procesocodigosalternos.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProcesoCodigosAlternos.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCodigosAlternos") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
						jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
							//jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getItemCount()>0) {
								jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProcesoCodigosAlternosGenerico)throws Exception
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
				jComboBoxid_productoProcesoCodigosAlternosGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProcesoCodigosAlternosGenerico!=null && jComboBoxid_productoProcesoCodigosAlternosGenerico.getItemCount()>0) {
					jComboBoxid_productoProcesoCodigosAlternosGenerico.setSelectedIndex(0);
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

					if(this.procesocodigosalternos!=null) {
						this.procesocodigosalternos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProcesoCodigosAlternos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProcesoCodigosAlternosGenerico)throws Exception
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
				jComboBoxid_empresaProcesoCodigosAlternosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProcesoCodigosAlternosGenerico!=null && jComboBoxid_empresaProcesoCodigosAlternosGenerico.getItemCount()>0) {
					jComboBoxid_empresaProcesoCodigosAlternosGenerico.setSelectedIndex(0);
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

					if(this.procesocodigosalternos!=null) {
						this.procesocodigosalternos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProcesoCodigosAlternos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProcesoCodigosAlternosGenerico)throws Exception
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
				jComboBoxid_sucursalProcesoCodigosAlternosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProcesoCodigosAlternosGenerico!=null && jComboBoxid_sucursalProcesoCodigosAlternosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProcesoCodigosAlternosGenerico.setSelectedIndex(0);
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

					if(this.procesocodigosalternos!=null) {
						this.procesocodigosalternos.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaProcesoCodigosAlternos.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCodigosAlternos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
						jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
							//jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getItemCount()>0) {
								jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaProcesoCodigosAlternosGenerico)throws Exception
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
				jComboBoxid_lineaProcesoCodigosAlternosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaProcesoCodigosAlternosGenerico!=null && jComboBoxid_lineaProcesoCodigosAlternosGenerico.getItemCount()>0) {
					jComboBoxid_lineaProcesoCodigosAlternosGenerico.setSelectedIndex(0);
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

					if(this.procesocodigosalternos!=null) {
						this.procesocodigosalternos.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoProcesoCodigosAlternos.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCodigosAlternos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
						jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
							//jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoProcesoCodigosAlternosGenerico)throws Exception
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
				jComboBoxid_linea_grupoProcesoCodigosAlternosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoProcesoCodigosAlternosGenerico!=null && jComboBoxid_linea_grupoProcesoCodigosAlternosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoProcesoCodigosAlternosGenerico.setSelectedIndex(0);
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

					if(this.procesocodigosalternos!=null) {
						this.procesocodigosalternos.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaProcesoCodigosAlternos.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCodigosAlternos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
						jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
							//jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaProcesoCodigosAlternosGenerico)throws Exception
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
				jComboBoxid_linea_categoriaProcesoCodigosAlternosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaProcesoCodigosAlternosGenerico!=null && jComboBoxid_linea_categoriaProcesoCodigosAlternosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaProcesoCodigosAlternosGenerico.setSelectedIndex(0);
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

					if(this.procesocodigosalternos!=null) {
						this.procesocodigosalternos.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaProcesoCodigosAlternos.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCodigosAlternos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
						jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
							//jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaProcesoCodigosAlternosGenerico)throws Exception
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
				jComboBoxid_linea_marcaProcesoCodigosAlternosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaProcesoCodigosAlternosGenerico!=null && jComboBoxid_linea_marcaProcesoCodigosAlternosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaProcesoCodigosAlternosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProcesoCodigosAlternos procesocodigosalternos,JComboBox jComboBoxid_bodegaProcesoCodigosAlternosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProcesoCodigosAlternosGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProcesoCodigosAlternosGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				procesocodigosalternos.setid_bodega(bodegaAux.getId());
				procesocodigosalternos.setbodega_descripcion(ProcesoCodigosAlternosConstantesFunciones.getBodegaDescripcion(bodegaAux));
				procesocodigosalternos.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProcesoCodigosAlternos procesocodigosalternos,JComboBox jComboBoxid_productoProcesoCodigosAlternosGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProcesoCodigosAlternosGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProcesoCodigosAlternosGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				procesocodigosalternos.setid_producto(productoAux.getId());
				procesocodigosalternos.setproducto_descripcion(ProcesoCodigosAlternosConstantesFunciones.getProductoDescripcion(productoAux));
				procesocodigosalternos.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProcesoCodigosAlternos procesocodigosalternos,JComboBox jComboBoxid_empresaProcesoCodigosAlternosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProcesoCodigosAlternosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProcesoCodigosAlternosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				procesocodigosalternos.setid_empresa(empresaAux.getId());
				procesocodigosalternos.setempresa_descripcion(ProcesoCodigosAlternosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				procesocodigosalternos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProcesoCodigosAlternos procesocodigosalternos,JComboBox jComboBoxid_sucursalProcesoCodigosAlternosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProcesoCodigosAlternosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProcesoCodigosAlternosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				procesocodigosalternos.setid_sucursal(sucursalAux.getId());
				procesocodigosalternos.setsucursal_descripcion(ProcesoCodigosAlternosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				procesocodigosalternos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ProcesoCodigosAlternos procesocodigosalternos,JComboBox jComboBoxid_lineaProcesoCodigosAlternosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaProcesoCodigosAlternosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaProcesoCodigosAlternosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesocodigosalternos.setid_linea(lineaAux.getId());
				procesocodigosalternos.setlinea_descripcion(ProcesoCodigosAlternosConstantesFunciones.getLineaDescripcion(lineaAux));
				procesocodigosalternos.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ProcesoCodigosAlternos procesocodigosalternos,JComboBox jComboBoxid_linea_grupoProcesoCodigosAlternosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoProcesoCodigosAlternosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoProcesoCodigosAlternosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesocodigosalternos.setid_linea_grupo(lineaAux.getId());
				procesocodigosalternos.setlineagrupo_descripcion(ProcesoCodigosAlternosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				procesocodigosalternos.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ProcesoCodigosAlternos procesocodigosalternos,JComboBox jComboBoxid_linea_categoriaProcesoCodigosAlternosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaProcesoCodigosAlternosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaProcesoCodigosAlternosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesocodigosalternos.setid_linea_categoria(lineaAux.getId());
				procesocodigosalternos.setlineacategoria_descripcion(ProcesoCodigosAlternosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				procesocodigosalternos.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ProcesoCodigosAlternos procesocodigosalternos,JComboBox jComboBoxid_linea_marcaProcesoCodigosAlternosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaProcesoCodigosAlternosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaProcesoCodigosAlternosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesocodigosalternos.setid_linea_marca(lineaAux.getId());
				procesocodigosalternos.setlineamarca_descripcion(ProcesoCodigosAlternosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				procesocodigosalternos.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
					}

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCodigosAlternos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.addItem(bodega);
							}
						}

						if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
					}

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCodigosAlternos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.addItem(producto);
							}
						}

						if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
					}

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
					}

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
					}

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCodigosAlternos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.addItem(linea);
							}
						}

						if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
					}

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCodigosAlternos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.addItem(lineagrupo);
							}
						}

						if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
					}

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCodigosAlternos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.addItem(lineacategoria);
							}
						}

						if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { 
					}

					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCodigosAlternos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.addItem(lineamarca);
							}
						}

						if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoCodigosAlternos() throws Exception {
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
		
	public ProcesoCodigosAlternosParameterReturnGeneral getProcesoCodigosAlternosParameterGeneral() {
		return this.procesocodigosalternosParameterGeneral;
	}
	
	public void setProcesoCodigosAlternosParameterGeneral(ProcesoCodigosAlternosParameterReturnGeneral procesocodigosalternosParameterGeneral) {
		this.procesocodigosalternosParameterGeneral = procesocodigosalternosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoCodigosAlternos() {
		return isPermisoTodoProcesoCodigosAlternos;
	}

	public void setIsPermisoTodoProcesoCodigosAlternos(Boolean isPermisoTodoProcesoCodigosAlternos) {
		this.isPermisoTodoProcesoCodigosAlternos = isPermisoTodoProcesoCodigosAlternos;
	}

	public Boolean getIsPermisoNuevoProcesoCodigosAlternos() {
		return isPermisoNuevoProcesoCodigosAlternos;
	}

	public void setIsPermisoNuevoProcesoCodigosAlternos(Boolean isPermisoNuevoProcesoCodigosAlternos) {
		this.isPermisoNuevoProcesoCodigosAlternos = isPermisoNuevoProcesoCodigosAlternos;
	}

	public Boolean getIsPermisoActualizarProcesoCodigosAlternos() {
		return isPermisoActualizarProcesoCodigosAlternos;
	}

	public void setIsPermisoActualizarProcesoCodigosAlternos(Boolean isPermisoActualizarProcesoCodigosAlternos) {
		this.isPermisoActualizarProcesoCodigosAlternos = isPermisoActualizarProcesoCodigosAlternos;
	}

	public Boolean getIsPermisoEliminarProcesoCodigosAlternos() {
		return isPermisoEliminarProcesoCodigosAlternos;
	}

	public void setIsPermisoEliminarProcesoCodigosAlternos(Boolean isPermisoEliminarProcesoCodigosAlternos) {
		this.isPermisoEliminarProcesoCodigosAlternos = isPermisoEliminarProcesoCodigosAlternos;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoCodigosAlternos() {
		return isPermisoGuardarCambiosProcesoCodigosAlternos;
	}

	public void setIsPermisoGuardarCambiosProcesoCodigosAlternos(Boolean isPermisoGuardarCambiosProcesoCodigosAlternos) {
		this.isPermisoGuardarCambiosProcesoCodigosAlternos = isPermisoGuardarCambiosProcesoCodigosAlternos;
	}
	
	public Boolean getIsPermisoConsultaProcesoCodigosAlternos() {
		return isPermisoConsultaProcesoCodigosAlternos;
	}

	public void setIsPermisoConsultaProcesoCodigosAlternos(Boolean isPermisoConsultaProcesoCodigosAlternos) {
		this.isPermisoConsultaProcesoCodigosAlternos = isPermisoConsultaProcesoCodigosAlternos;
	}

	public Boolean getIsPermisoBusquedaProcesoCodigosAlternos() {
		return isPermisoBusquedaProcesoCodigosAlternos;
	}

	public void setIsPermisoBusquedaProcesoCodigosAlternos(Boolean isPermisoBusquedaProcesoCodigosAlternos) {
		this.isPermisoBusquedaProcesoCodigosAlternos = isPermisoBusquedaProcesoCodigosAlternos;
	}

	public Boolean getIsPermisoReporteProcesoCodigosAlternos() {
		return isPermisoReporteProcesoCodigosAlternos;
	}

	public void setIsPermisoReporteProcesoCodigosAlternos(Boolean isPermisoReporteProcesoCodigosAlternos) {
		this.isPermisoReporteProcesoCodigosAlternos = isPermisoReporteProcesoCodigosAlternos;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoCodigosAlternos() {
		return isPermisoPaginacionMedioProcesoCodigosAlternos;
	}

	public void setIsPermisoPaginacionMedioProcesoCodigosAlternos(Boolean isPermisoPaginacionMedioProcesoCodigosAlternos) {
		this.isPermisoPaginacionMedioProcesoCodigosAlternos = isPermisoPaginacionMedioProcesoCodigosAlternos;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoCodigosAlternos() {
		return isPermisoPaginacionTodoProcesoCodigosAlternos;
	}

	public void setIsPermisoPaginacionTodoProcesoCodigosAlternos(Boolean isPermisoPaginacionTodoProcesoCodigosAlternos) {
		this.isPermisoPaginacionTodoProcesoCodigosAlternos = isPermisoPaginacionTodoProcesoCodigosAlternos;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoCodigosAlternos() {
		return isPermisoPaginacionAltoProcesoCodigosAlternos;
	}

	public void setIsPermisoPaginacionAltoProcesoCodigosAlternos(Boolean isPermisoPaginacionAltoProcesoCodigosAlternos) {
		this.isPermisoPaginacionAltoProcesoCodigosAlternos = isPermisoPaginacionAltoProcesoCodigosAlternos;
	}
	
	public Boolean getIsPermisoCopiarProcesoCodigosAlternos() {
		return isPermisoCopiarProcesoCodigosAlternos;
	}

	public void setIsPermisoCopiarProcesoCodigosAlternos(Boolean isPermisoCopiarProcesoCodigosAlternos) {
		this.isPermisoCopiarProcesoCodigosAlternos = isPermisoCopiarProcesoCodigosAlternos;
	}
	
	public Boolean getIsPermisoVerFormProcesoCodigosAlternos() {
		return isPermisoVerFormProcesoCodigosAlternos;
	}

	public void setIsPermisoVerFormProcesoCodigosAlternos(Boolean isPermisoVerFormProcesoCodigosAlternos) {
		this.isPermisoVerFormProcesoCodigosAlternos = isPermisoVerFormProcesoCodigosAlternos;
	}
	
	public Boolean getIsPermisoDuplicarProcesoCodigosAlternos() {
		return isPermisoDuplicarProcesoCodigosAlternos;
	}

	public void setIsPermisoDuplicarProcesoCodigosAlternos(Boolean isPermisoDuplicarProcesoCodigosAlternos) {
		this.isPermisoDuplicarProcesoCodigosAlternos = isPermisoDuplicarProcesoCodigosAlternos;
	}
	
	public Boolean getIsPermisoOrdenProcesoCodigosAlternos() {
		return isPermisoOrdenProcesoCodigosAlternos;
	}

	public void setIsPermisoOrdenProcesoCodigosAlternos(Boolean isPermisoOrdenProcesoCodigosAlternos) {
		this.isPermisoOrdenProcesoCodigosAlternos = isPermisoOrdenProcesoCodigosAlternos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoCodigosAlternos() {
		return isVisibilidadCeldaNuevoProcesoCodigosAlternos;
	}

	public void setIsVisibilidadCeldaNuevoProcesoCodigosAlternos(Boolean isVisibilidadCeldaNuevoProcesoCodigosAlternos) {
		this.isVisibilidadCeldaNuevoProcesoCodigosAlternos = isVisibilidadCeldaNuevoProcesoCodigosAlternos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoCodigosAlternos() {
		return isVisibilidadCeldaDuplicarProcesoCodigosAlternos;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoCodigosAlternos(Boolean isVisibilidadCeldaDuplicarProcesoCodigosAlternos) {
		this.isVisibilidadCeldaDuplicarProcesoCodigosAlternos = isVisibilidadCeldaDuplicarProcesoCodigosAlternos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoCodigosAlternos() {
		return isVisibilidadCeldaCopiarProcesoCodigosAlternos;
	}

	public void setIsVisibilidadCeldaCopiarProcesoCodigosAlternos(Boolean isVisibilidadCeldaCopiarProcesoCodigosAlternos) {
		this.isVisibilidadCeldaCopiarProcesoCodigosAlternos = isVisibilidadCeldaCopiarProcesoCodigosAlternos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoCodigosAlternos() {
		return isVisibilidadCeldaVerFormProcesoCodigosAlternos;
	}

	public void setIsVisibilidadCeldaVerFormProcesoCodigosAlternos(Boolean isVisibilidadCeldaVerFormProcesoCodigosAlternos) {
		this.isVisibilidadCeldaVerFormProcesoCodigosAlternos = isVisibilidadCeldaVerFormProcesoCodigosAlternos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoCodigosAlternos() {
		return isVisibilidadCeldaOrdenProcesoCodigosAlternos;
	}

	public void setIsVisibilidadCeldaOrdenProcesoCodigosAlternos(Boolean isVisibilidadCeldaOrdenProcesoCodigosAlternos) {
		this.isVisibilidadCeldaOrdenProcesoCodigosAlternos = isVisibilidadCeldaOrdenProcesoCodigosAlternos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos() {
		return isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos(Boolean isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos = isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoCodigosAlternos() {
		return isVisibilidadCeldaModificarProcesoCodigosAlternos;
	}

	public void setIsVisibilidadCeldaModificarProcesoCodigosAlternos(Boolean isVisibilidadCeldaModificarProcesoCodigosAlternos) {
		this.isVisibilidadCeldaModificarProcesoCodigosAlternos = isVisibilidadCeldaModificarProcesoCodigosAlternos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoCodigosAlternos() {
		return isVisibilidadCeldaActualizarProcesoCodigosAlternos;
	}

	public void setIsVisibilidadCeldaActualizarProcesoCodigosAlternos(Boolean isVisibilidadCeldaActualizarProcesoCodigosAlternos) {
		this.isVisibilidadCeldaActualizarProcesoCodigosAlternos = isVisibilidadCeldaActualizarProcesoCodigosAlternos;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoCodigosAlternos() {
		return isVisibilidadCeldaEliminarProcesoCodigosAlternos;
	}

	public void setIsVisibilidadCeldaEliminarProcesoCodigosAlternos(Boolean isVisibilidadCeldaEliminarProcesoCodigosAlternos) {
		this.isVisibilidadCeldaEliminarProcesoCodigosAlternos = isVisibilidadCeldaEliminarProcesoCodigosAlternos;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoCodigosAlternos() {
		return isVisibilidadCeldaCancelarProcesoCodigosAlternos;
	}

	public void setIsVisibilidadCeldaCancelarProcesoCodigosAlternos(Boolean isVisibilidadCeldaCancelarProcesoCodigosAlternos) {
		this.isVisibilidadCeldaCancelarProcesoCodigosAlternos = isVisibilidadCeldaCancelarProcesoCodigosAlternos;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoCodigosAlternos() {
		return isVisibilidadCeldaGuardarProcesoCodigosAlternos;
	}

	public void setIsVisibilidadCeldaGuardarProcesoCodigosAlternos(Boolean isVisibilidadCeldaGuardarProcesoCodigosAlternos) {
		this.isVisibilidadCeldaGuardarProcesoCodigosAlternos = isVisibilidadCeldaGuardarProcesoCodigosAlternos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos() {
		return isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos(Boolean isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos) {
		this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos = isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos;
	}
		
	public ProcesoCodigosAlternosSessionBean getprocesocodigosalternosSessionBean() {
		return this.procesocodigosalternosSessionBean;
	}
	
	public void setprocesocodigosalternosSessionBean(ProcesoCodigosAlternosSessionBean procesocodigosalternosSessionBean) {
		this.procesocodigosalternosSessionBean=procesocodigosalternosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoCodigosAlternos() {
		return this.isVisibilidadBusquedaProcesoCodigosAlternos;
	}

	public void setisVisibilidadBusquedaProcesoCodigosAlternos(Boolean isVisibilidadBusquedaProcesoCodigosAlternos) {
		this.isVisibilidadBusquedaProcesoCodigosAlternos=isVisibilidadBusquedaProcesoCodigosAlternos;
	}

	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
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

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos)throws Exception {
		try {
			
				this.setActualParaGuardarBodegaForeignKey(procesocodigosalternos,null);
				this.setActualParaGuardarProductoForeignKey(procesocodigosalternos,null);
				this.setActualParaGuardarEmpresaForeignKey(procesocodigosalternos,null);
				this.setActualParaGuardarSucursalForeignKey(procesocodigosalternos,null);
				this.setActualParaGuardarLineaForeignKey(procesocodigosalternos,null);
				this.setActualParaGuardarLineaGrupoForeignKey(procesocodigosalternos,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(procesocodigosalternos,null);
				this.setActualParaGuardarLineaMarcaForeignKey(procesocodigosalternos,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoCodigosAlternos procesocodigosalternos,ProcesoCodigosAlternos procesocodigosalternosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoCodigosAlternos(procesocodigosalternos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesocodigosalternosAux.setId(procesocodigosalternos.getId());
		procesocodigosalternosAux.setVersionRow(procesocodigosalternos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoCodigosAlternos procesocodigosalternosLocal) throws Exception {
		
		if(this.procesocodigosalternosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoCodigosAlternos procesocodigosalternosLocal) throws Exception {	
		if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				procesocodigosalternosLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				procesocodigosalternosLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				procesocodigosalternosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				procesocodigosalternosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				procesocodigosalternosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				procesocodigosalternosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				procesocodigosalternosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				procesocodigosalternosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoCodigosAlternosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesocodigosalternosValidator.getInvalidValues(this.procesocodigosalternos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoCodigosAlternos procesocodigosalternos,List<ProcesoCodigosAlternos> procesocodigosalternoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoCodigosAlternos procesocodigosalternos,List<ProcesoCodigosAlternos> procesocodigosalternoss) throws Exception {
		try	{			
			ProcesoCodigosAlternosConstantesFunciones.actualizarSelectedLista(procesocodigosalternos,procesocodigosalternoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoCodigosAlternos> procesocodigosalternossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesocodigosalternossLocal=this.procesocodigosalternosLogic.getProcesoCodigosAlternoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesocodigosalternossLocal=this.procesocodigosalternoss;
			}
			//ARCHITECTURE
		
			for(ProcesoCodigosAlternos procesocodigosalternosLocal:procesocodigosalternossLocal) {
				if(this.permiteMantenimiento(procesocodigosalternosLocal) && procesocodigosalternosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoCodigosAlternosConstantesFunciones.getProcesoCodigosAlternosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoCodigosAlternosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelcodigoProcesoCodigosAlternos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCodigosAlternosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelnombre_unidadProcesoCodigosAlternos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCodigosAlternosConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelnombre_completo_clienteProcesoCodigosAlternos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCodigosAlternosConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelcodigo_productoProcesoCodigosAlternos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCodigosAlternosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelnombreProcesoCodigosAlternos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCodigosAlternosConstantesFunciones.NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelcodigoProcesoCodigosAlternos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelnombre_unidadProcesoCodigosAlternos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelnombre_completo_clienteProcesoCodigosAlternos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelcodigo_productoProcesoCodigosAlternos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelnombreProcesoCodigosAlternos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos,"");
		
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
		this.iIdNuevoProcesoCodigosAlternos--;	
		
		
		this.procesocodigosalternosAux=new ProcesoCodigosAlternos();
		
		this.procesocodigosalternosAux.setId(this.iIdNuevoProcesoCodigosAlternos);
		this.procesocodigosalternosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().add(this.procesocodigosalternosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesocodigosalternoss.add(this.procesocodigosalternosAux);
		}
		//ARCHITECTURE
		
		this.procesocodigosalternos=this.procesocodigosalternosAux;
		
		if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoCodigosAlternos(this.procesocodigosalternos);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCodigosAlternos(this.procesocodigosalternos);
		}
				
		//this.setDefaultControlesProcesoCodigosAlternos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoCodigosAlternos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoCodigosAlternos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCodigosAlternos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternosBean,this.procesocodigosalternos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoCodigosAlternos(this.procesocodigosalternosReturnGeneral,this.procesocodigosalternosBean,false);
		
		if(this.procesocodigosalternosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCodigosAlternos(this.procesocodigosalternosReturnGeneral.getProcesoCodigosAlternos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoCodigosAlternos(this.procesocodigosalternosReturnGeneral.getProcesoCodigosAlternos());
		}
		
		if(this.procesocodigosalternosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoCodigosAlternos(this.procesocodigosalternosReturnGeneral.getProcesoCodigosAlternos(),classes);//this.procesocodigosalternosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoCodigosAlternos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoCodigosAlternos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.RecargarFormProcesoCodigosAlternos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoCodigosAlternos(false);
						
			if(procesocodigosalternosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCodigosAlternos();
			}
			
			this.actualizarVisualTableDatosProcesoCodigosAlternos();
			
			this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(this.getIndiceNuevoProcesoCodigosAlternos(), this.getIndiceNuevoProcesoCodigosAlternos());
			
			this.seleccionarFilaTablaProcesoCodigosAlternosActual();
						
			this.actualizarEstadoCeldasBotonesProcesoCodigosAlternos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoCodigosAlternos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreacodigoProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarcodigoProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldnombre_unidadProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarnombre_unidadProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_clienteProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarnombre_completo_clienteProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldcodigo_productoProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarcodigo_productoProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombreProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarnombreProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos);	
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarid_bodegaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarid_productoProcesoCodigosAlternos);//
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarid_empresaProcesoCodigosAlternos);//
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarid_sucursalProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarid_lineaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarid_linea_grupoProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarid_linea_categoriaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.setEnabled(isHabilitar && this.procesocodigosalternosConstantesFunciones.activarid_linea_marcaProcesoCodigosAlternos);
	};
	
	public void setDefaultControlesProcesoCodigosAlternos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoCodigosAlternos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesocodigosalternosSessionBean.setConGuardarRelaciones(true);			
			this.procesocodigosalternosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTabbedPaneRelacionesProcesoCodigosAlternos.setVisible(true);
			
					
		} else {
			//this.procesocodigosalternosSessionBean.setConGuardarRelaciones(false);			
			this.procesocodigosalternosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTabbedPaneRelacionesProcesoCodigosAlternos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoCodigosAlternos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternosLogic.getProcesoCodigosAlternoss()) {
				if(procesocodigosalternosAux.getId().equals(this.iIdNuevoProcesoCodigosAlternos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternoss) {
				if(procesocodigosalternosAux.getId().equals(this.iIdNuevoProcesoCodigosAlternos)) {
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
	
	public int getIndiceActualProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternosLogic.getProcesoCodigosAlternoss()) {
				if(procesocodigosalternosAux.getId().equals(procesocodigosalternos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternoss) {
				if(procesocodigosalternosAux.getId().equals(procesocodigosalternos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternosLogic.getProcesoCodigosAlternoss()) {
				if(procesocodigosalternosAux.getProcesoCodigosAlternosOriginal().getId().equals(procesocodigosalternosOriginal.getId())) {
					existe=true;
					procesocodigosalternosOriginal.setId(procesocodigosalternosAux.getId());
					procesocodigosalternosOriginal.setVersionRow(procesocodigosalternosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternoss) {
				if(procesocodigosalternosAux.getProcesoCodigosAlternosOriginal().getId().equals(procesocodigosalternosOriginal.getId())) {
					existe=true;
					procesocodigosalternosOriginal.setId(procesocodigosalternosAux.getId());
					procesocodigosalternosOriginal.setVersionRow(procesocodigosalternosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoCodigosAlternos(Boolean esParaCancelar) throws Exception {
		procesocodigosalternossAux=new ArrayList<ProcesoCodigosAlternos>();
		procesocodigosalternosAux=new ProcesoCodigosAlternos();
		
		if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternosLogic.getProcesoCodigosAlternoss()) {
					if(procesocodigosalternosAux.getId()<0) {
						procesocodigosalternossAux.add(procesocodigosalternosAux);
					}		
				}
				this.iIdNuevoProcesoCodigosAlternos=0L;
				this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().removeAll(procesocodigosalternossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternoss) {
					if(procesocodigosalternosAux.getId()<0) {
						procesocodigosalternossAux.add(procesocodigosalternosAux);
					}		
				}
				this.iIdNuevoProcesoCodigosAlternos=0L;
				this.procesocodigosalternoss.removeAll(procesocodigosalternossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoCodigosAlternos 
					&& this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().size()>0
					) {
					procesocodigosalternosAux=this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().get(this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().size() - 1);
				
					if(procesocodigosalternosAux.getId()<0) {
						this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().remove(procesocodigosalternosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoCodigosAlternos && this.procesocodigosalternoss.size()>0) {
					procesocodigosalternosAux=this.procesocodigosalternoss.get(this.procesocodigosalternoss.size() - 1);
				
					if(procesocodigosalternosAux.getId()<0) {
						this.procesocodigosalternoss.remove(procesocodigosalternosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoCodigosAlternos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesocodigosalternos.getId()<0) {
				this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().remove(this.procesocodigosalternos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesocodigosalternos.getId()<0) {
				this.procesocodigosalternoss.remove(this.procesocodigosalternos);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoCodigosAlternos(List<ProcesoCodigosAlternos> procesocodigosalternossAux) throws Exception {
		ProcesoCodigosAlternosConstantesFunciones.setEstadosInicialesProcesoCodigosAlternos(procesocodigosalternossAux);
	}
	
	public void setEstadosInicialesProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternosAux) throws Exception {
		ProcesoCodigosAlternosConstantesFunciones.setEstadosInicialesProcesoCodigosAlternos(procesocodigosalternosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoCodigosAlternosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoCodigosAlternos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoCodigosAlternosActual()) {
				if(!this.isEsNuevoProcesoCodigosAlternos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoCodigosAlternos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoCodigosAlternos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoCodigosAlternosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Codigos Alternos ?", "MANTENIMIENTO DE Proceso Codigos Alternos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoCodigosAlternos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoCodigosAlternos procesocodigosalternos) throws Exception {
		ProcesoCodigosAlternosConstantesFunciones.seleccionarAsignar(this.procesocodigosalternos,procesocodigosalternos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoCodigosAlternos=this.isPermisoActualizarOriginalProcesoCodigosAlternos;
			
			
			this.seleccionarAsignar(procesocodigosalternos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoCodigosAlternos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesocodigosalternosSessionBean.setsFuncionBusquedaRapida(this.procesocodigosalternosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoCodigosAlternos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoCodigosAlternos(esParaCancelar);				
				this.cancelarNuevoProcesoCodigosAlternos(esParaCancelar);								
			}
			
			this.procesocodigosalternos=new ProcesoCodigosAlternos();
			
			this.inicializarProcesoCodigosAlternos();
			
			this.actualizarEstadoCeldasBotonesProcesoCodigosAlternos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoCodigosAlternos() throws Exception {
		try {
			ProcesoCodigosAlternosConstantesFunciones.inicializarProcesoCodigosAlternos(this.procesocodigosalternos);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoCodigosAlternoss(String sAccionBusqueda,List<ProcesoCodigosAlternos> procesocodigosalternossParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoCodigosAlternos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoCodigosAlternosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoCodigosAlternosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoCodigosAlternos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Codigos Alternoses");		
		parameters.put("busquedapor", ProcesoCodigosAlternosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoCodigosAlternos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoCodigosAlternosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoCodigosAlternosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoCodigosAlternos=new JRBeanArrayDataSource(ProcesoCodigosAlternosJInternalFrame.TraerProcesoCodigosAlternosBeans(procesocodigosalternossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoCodigosAlternos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoCodigosAlternosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoCodigosAlternosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoCodigosAlternosBean.TraerProcesoCodigosAlternosBeans(procesocodigosalternossParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoCodigosAlternoss(sAccionBusqueda,sTipoArchivoReporte,procesocodigosalternossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoCodigosAlternoss(sAccionBusqueda,sTipoArchivoReporte,procesocodigosalternossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoCodigosAlternosActionPerformed(null);
					//this.generarExcelReporteProcesoCodigosAlternoss(sAccionBusqueda,sTipoArchivoReporte,procesocodigosalternossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoCodigosAlternoss(sAccionBusqueda,sTipoArchivoReporte,procesocodigosalternossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoCodigosAlternoss(sAccionBusqueda,sTipoArchivoReporte,procesocodigosalternossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoCodigosAlternoss(sAccionBusqueda,sTipoArchivoReporte,procesocodigosalternossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoCodigosAlternoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCodigosAlternos> procesocodigosalternossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocodigosalternos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCodigosAlternoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCodigosAlternos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoCodigosAlternos procesocodigosalternos : procesocodigosalternossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoCodigosAlternosConstantesFunciones.generarExcelReporteDataProcesoCodigosAlternos("NORMAL",row,workbook,procesocodigosalternos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Codigos Alternos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoCodigosAlternos(String sTipo,Row row,Workbook workbook) {
		
		ProcesoCodigosAlternosConstantesFunciones.generarExcelReporteHeaderProcesoCodigosAlternos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoCodigosAlternoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCodigosAlternos> procesocodigosalternossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocodigosalternos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCodigosAlternoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoCodigosAlternos procesocodigosalternos : procesocodigosalternossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.getProcesoCodigosAlternosDescripcion(procesocodigosalternos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getcodigo_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocodigosalternos.getnombre_completo_cliente_proveedor_defecto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Codigos Alternos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoCodigosAlternoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCodigosAlternos> procesocodigosalternossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoCodigosAlternos> procesocodigosalternossRespaldo=null;
		
		classes=ProcesoCodigosAlternosConstantesFunciones.getClassesRelationshipsOfProcesoCodigosAlternos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesocodigosalternosLogic.setDatosCliente(this.datosCliente);
		this.procesocodigosalternosLogic.setDatosDeep(this.datosDeep);
		this.procesocodigosalternosLogic.setIsConDeep(true);
		
		procesocodigosalternossRespaldo=this.procesocodigosalternosLogic.getProcesoCodigosAlternoss();
		
		this.procesocodigosalternosLogic.setProcesoCodigosAlternoss(procesocodigosalternossParaReportes);	
		this.procesocodigosalternosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesocodigosalternossParaReportes=this.procesocodigosalternosLogic.getProcesoCodigosAlternoss();
		this.procesocodigosalternosLogic.setProcesoCodigosAlternoss(procesocodigosalternossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocodigosalternos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCodigosAlternoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCodigosAlternos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoCodigosAlternos procesocodigosalternos : procesocodigosalternossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoCodigosAlternos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoCodigosAlternosConstantesFunciones.generarExcelReporteDataProcesoCodigosAlternos("NORMAL",row,workbook,procesocodigosalternos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.getProcesoCodigosAlternosDescripcion(procesocodigosalternos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Codigos Alternos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoCodigosAlternos() throws Exception {		
		this.startProcessProcesoCodigosAlternos(true);
	}
	
	public void startProcessProcesoCodigosAlternos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoCodigosAlternos ,this.jPanelParametrosReportesProcesoCodigosAlternos, this.jScrollPanelDatosProcesoCodigosAlternos,this.jPanelPaginacionProcesoCodigosAlternos, this.jScrollPanelDatosEdicionProcesoCodigosAlternos, this.jPanelAccionesProcesoCodigosAlternos,this.jPanelAccionesFormularioProcesoCodigosAlternos,this.jmenuBarProcesoCodigosAlternos,this.jmenuBarDetalleProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,this.jTtoolBarDetalleProcesoCodigosAlternos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCodigosAlternos=this.jTabbedPaneBusquedasProcesoCodigosAlternos; 
		
		final JPanel jPanelParametrosReportesProcesoCodigosAlternos=this.jPanelParametrosReportesProcesoCodigosAlternos;
		//final JScrollPane jScrollPanelDatosProcesoCodigosAlternos=this.jScrollPanelDatosProcesoCodigosAlternos;
		final JTable jTableDatosProcesoCodigosAlternos=this.jTableDatosProcesoCodigosAlternos;		
		final JPanel jPanelPaginacionProcesoCodigosAlternos=this.jPanelPaginacionProcesoCodigosAlternos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCodigosAlternos=this.jScrollPanelDatosEdicionProcesoCodigosAlternos;
		final JPanel jPanelAccionesProcesoCodigosAlternos=this.jPanelAccionesProcesoCodigosAlternos;
		
		JPanel jPanelCamposAuxiliarProcesoCodigosAlternos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCodigosAlternos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			jPanelCamposAuxiliarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelCamposProcesoCodigosAlternos;
			jPanelAccionesFormularioAuxiliarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelAccionesFormularioProcesoCodigosAlternos;
		}
		
		final JPanel jPanelCamposProcesoCodigosAlternos=jPanelCamposAuxiliarProcesoCodigosAlternos;
		final JPanel jPanelAccionesFormularioProcesoCodigosAlternos=jPanelAccionesFormularioAuxiliarProcesoCodigosAlternos;
		
		
		final JMenuBar jmenuBarProcesoCodigosAlternos=this.jmenuBarProcesoCodigosAlternos;
		final JToolBar jTtoolBarProcesoCodigosAlternos=this.jTtoolBarProcesoCodigosAlternos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoCodigosAlternos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCodigosAlternos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			jmenuBarDetalleAuxiliarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jmenuBarDetalleProcesoCodigosAlternos;
			jTtoolBarDetalleAuxiliarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTtoolBarDetalleProcesoCodigosAlternos;
		}
		
		final JMenuBar jmenuBarDetalleProcesoCodigosAlternos=jmenuBarDetalleAuxiliarProcesoCodigosAlternos;
		final JToolBar jTtoolBarDetalleProcesoCodigosAlternos=jTtoolBarDetalleAuxiliarProcesoCodigosAlternos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCodigosAlternos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCodigosAlternos;
			processRunnable.jTableDatos=jTableDatosProcesoCodigosAlternos;
			processRunnable.jPanelCampos=jPanelCamposProcesoCodigosAlternos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCodigosAlternos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCodigosAlternos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCodigosAlternos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCodigosAlternos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCodigosAlternos;
			processRunnable.jTtoolBar=jTtoolBarProcesoCodigosAlternos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCodigosAlternos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCodigosAlternos ,jPanelParametrosReportesProcesoCodigosAlternos,jTableDatosProcesoCodigosAlternos, /*jScrollPanelDatosProcesoCodigosAlternos,*/jPanelCamposProcesoCodigosAlternos,jPanelPaginacionProcesoCodigosAlternos, /*jScrollPanelDatosEdicionProcesoCodigosAlternos,*/ jPanelAccionesProcesoCodigosAlternos,jPanelAccionesFormularioProcesoCodigosAlternos,jmenuBarProcesoCodigosAlternos,jmenuBarDetalleProcesoCodigosAlternos,jTtoolBarProcesoCodigosAlternos,jTtoolBarDetalleProcesoCodigosAlternos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCodigosAlternos ,jPanelParametrosReportesProcesoCodigosAlternos, jScrollPanelDatosProcesoCodigosAlternos,jPanelPaginacionProcesoCodigosAlternos, jScrollPanelDatosEdicionProcesoCodigosAlternos, jPanelAccionesProcesoCodigosAlternos,jPanelAccionesFormularioProcesoCodigosAlternos,jmenuBarProcesoCodigosAlternos,jmenuBarDetalleProcesoCodigosAlternos,jTtoolBarProcesoCodigosAlternos,jTtoolBarDetalleProcesoCodigosAlternos);
						
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
	
	public void finishProcessProcesoCodigosAlternos() {// throws Exception 
		this.finishProcessProcesoCodigosAlternos(true);
	}
	
	public void finishProcessProcesoCodigosAlternos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoCodigosAlternos ,this.jPanelParametrosReportesProcesoCodigosAlternos, this.jScrollPanelDatosProcesoCodigosAlternos,this.jPanelPaginacionProcesoCodigosAlternos, this.jScrollPanelDatosEdicionProcesoCodigosAlternos, this.jPanelAccionesProcesoCodigosAlternos,this.jPanelAccionesFormularioProcesoCodigosAlternos,this.jmenuBarProcesoCodigosAlternos,this.jmenuBarDetalleProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,this.jTtoolBarDetalleProcesoCodigosAlternos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCodigosAlternos=this.jTabbedPaneBusquedasProcesoCodigosAlternos; 
		
		final JPanel jPanelParametrosReportesProcesoCodigosAlternos=this.jPanelParametrosReportesProcesoCodigosAlternos;
		//final JScrollPane jScrollPanelDatosProcesoCodigosAlternos=this.jScrollPanelDatosProcesoCodigosAlternos;
		final JTable jTableDatosProcesoCodigosAlternos=this.jTableDatosProcesoCodigosAlternos;		
		final JPanel jPanelPaginacionProcesoCodigosAlternos=this.jPanelPaginacionProcesoCodigosAlternos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCodigosAlternos=this.jScrollPanelDatosEdicionProcesoCodigosAlternos;
		final JPanel jPanelAccionesProcesoCodigosAlternos=this.jPanelAccionesProcesoCodigosAlternos;
		
		JPanel jPanelCamposAuxiliarProcesoCodigosAlternos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCodigosAlternos=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			jPanelCamposAuxiliarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelCamposProcesoCodigosAlternos;
			jPanelAccionesFormularioAuxiliarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelAccionesFormularioProcesoCodigosAlternos;
		}
		
		final JPanel jPanelCamposProcesoCodigosAlternos=jPanelCamposAuxiliarProcesoCodigosAlternos;
		final JPanel jPanelAccionesFormularioProcesoCodigosAlternos=jPanelAccionesFormularioAuxiliarProcesoCodigosAlternos;
		
		
		final JMenuBar jmenuBarProcesoCodigosAlternos=this.jmenuBarProcesoCodigosAlternos;		
		final JToolBar jTtoolBarProcesoCodigosAlternos=this.jTtoolBarProcesoCodigosAlternos;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoCodigosAlternos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCodigosAlternos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			jmenuBarDetalleAuxiliarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jmenuBarDetalleProcesoCodigosAlternos;
			jTtoolBarDetalleAuxiliarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTtoolBarDetalleProcesoCodigosAlternos;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoCodigosAlternos=jmenuBarDetalleAuxiliarProcesoCodigosAlternos;
		final JToolBar jTtoolBarDetalleProcesoCodigosAlternos=jTtoolBarDetalleAuxiliarProcesoCodigosAlternos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCodigosAlternos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCodigosAlternos;
			processRunnable.jTableDatos=jTableDatosProcesoCodigosAlternos;
			processRunnable.jPanelCampos=jPanelCamposProcesoCodigosAlternos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCodigosAlternos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCodigosAlternos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCodigosAlternos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCodigosAlternos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCodigosAlternos;
			processRunnable.jTtoolBar=jTtoolBarProcesoCodigosAlternos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCodigosAlternos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoCodigosAlternos ,jPanelParametrosReportesProcesoCodigosAlternos, jTableDatosProcesoCodigosAlternos,/*jScrollPanelDatosProcesoCodigosAlternos,*/jPanelCamposProcesoCodigosAlternos,jPanelPaginacionProcesoCodigosAlternos, /*jScrollPanelDatosEdicionProcesoCodigosAlternos,*/ jPanelAccionesProcesoCodigosAlternos,jPanelAccionesFormularioProcesoCodigosAlternos,jmenuBarProcesoCodigosAlternos,jmenuBarDetalleProcesoCodigosAlternos,jTtoolBarProcesoCodigosAlternos,jTtoolBarDetalleProcesoCodigosAlternos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoCodigosAlternos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoCodigosAlternos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoCodigosAlternos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoCodigosAlternos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoCodigosAlternos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoCodigosAlternos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoCodigosAlternos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoCodigosAlternos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoCodigosAlternos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesocodigosalternosConstantesFunciones.getsFinalQueryProcesoCodigosAlternos();
		String  finalQueryPaginacionTodos=this.procesocodigosalternosConstantesFunciones.getsFinalQueryProcesoCodigosAlternos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoCodigosAlternosConstantesFunciones.getArrayColumnasGlobalesNoProcesoCodigosAlternos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoCodigosAlternosConstantesFunciones.getArrayColumnasGlobalesProcesoCodigosAlternos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoCodigosAlternosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesocodigosalternossEliminados= new ArrayList<ProcesoCodigosAlternos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoCodigosAlternos();
		
				///*ProcesoCodigosAlternosSessionBean*/this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
			
			if(this.procesocodigosalternosSessionBean==null) {
				this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
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
					this.iNumeroPaginacion=ProcesoCodigosAlternosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoCodigosAlternosConstantesFunciones.getClassesForeignKeysOfProcesoCodigosAlternos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesocodigosalternos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesocodigosalternossAux= new ArrayList<ProcesoCodigosAlternos>();
			
				
			procesocodigosalternosLogic.setDatosCliente(this.datosCliente);
			procesocodigosalternosLogic.setDatosDeep(this.datosDeep);
			procesocodigosalternosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoCodigosAlternos")) {
				this.sDetalleReporte=ProcesoCodigosAlternosConstantesFunciones.getDetalleIndiceBusquedaProcesoCodigosAlternos(id_bodegaBusquedaProcesoCodigosAlternos,id_productoBusquedaProcesoCodigosAlternos,id_lineaBusquedaProcesoCodigosAlternos,id_linea_grupoBusquedaProcesoCodigosAlternos,id_linea_categoriaBusquedaProcesoCodigosAlternos,id_linea_marcaBusquedaProcesoCodigosAlternos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesocodigosalternosLogic.getProcesoCodigosAlternossBusquedaProcesoCodigosAlternos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProcesoCodigosAlternos,id_productoBusquedaProcesoCodigosAlternos,id_lineaBusquedaProcesoCodigosAlternos,id_linea_grupoBusquedaProcesoCodigosAlternos,id_linea_categoriaBusquedaProcesoCodigosAlternos,id_linea_marcaBusquedaProcesoCodigosAlternos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCodigosAlternosConstantesFunciones.getDetalleIndiceBusquedaProcesoCodigosAlternos(id_bodegaBusquedaProcesoCodigosAlternos,id_productoBusquedaProcesoCodigosAlternos,id_lineaBusquedaProcesoCodigosAlternos,id_linea_grupoBusquedaProcesoCodigosAlternos,id_linea_categoriaBusquedaProcesoCodigosAlternos,id_linea_marcaBusquedaProcesoCodigosAlternos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCodigosAlternosConstantesFunciones.getDetalleIndiceBusquedaProcesoCodigosAlternos(id_bodegaBusquedaProcesoCodigosAlternos,id_productoBusquedaProcesoCodigosAlternos,id_lineaBusquedaProcesoCodigosAlternos,id_linea_grupoBusquedaProcesoCodigosAlternos,id_linea_categoriaBusquedaProcesoCodigosAlternos,id_linea_marcaBusquedaProcesoCodigosAlternos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesocodigosalternosLogic.getProcesoCodigosAlternoss()==null||procesocodigosalternosLogic.getProcesoCodigosAlternoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesocodigosalternoss==null|| procesocodigosalternoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocodigosalternossAux=new ArrayList<ProcesoCodigosAlternos>();
						procesocodigosalternossAux.addAll(procesocodigosalternosLogic.getProcesoCodigosAlternoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocodigosalternossAux=new ArrayList<ProcesoCodigosAlternos>();
							procesocodigosalternossAux.addAll(procesocodigosalternoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesocodigosalternosLogic.getProcesoCodigosAlternossBusquedaProcesoCodigosAlternos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProcesoCodigosAlternos,id_productoBusquedaProcesoCodigosAlternos,id_lineaBusquedaProcesoCodigosAlternos,id_linea_grupoBusquedaProcesoCodigosAlternos,id_linea_categoriaBusquedaProcesoCodigosAlternos,id_linea_marcaBusquedaProcesoCodigosAlternos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCodigosAlternosConstantesFunciones.getDetalleIndiceBusquedaProcesoCodigosAlternos(id_bodegaBusquedaProcesoCodigosAlternos,id_productoBusquedaProcesoCodigosAlternos,id_lineaBusquedaProcesoCodigosAlternos,id_linea_grupoBusquedaProcesoCodigosAlternos,id_linea_categoriaBusquedaProcesoCodigosAlternos,id_linea_marcaBusquedaProcesoCodigosAlternos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCodigosAlternosConstantesFunciones.getDetalleIndiceBusquedaProcesoCodigosAlternos(id_bodegaBusquedaProcesoCodigosAlternos,id_productoBusquedaProcesoCodigosAlternos,id_lineaBusquedaProcesoCodigosAlternos,id_linea_grupoBusquedaProcesoCodigosAlternos,id_linea_categoriaBusquedaProcesoCodigosAlternos,id_linea_marcaBusquedaProcesoCodigosAlternos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoCodigosAlternoss("BusquedaProcesoCodigosAlternos",procesocodigosalternosLogic.getProcesoCodigosAlternoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoCodigosAlternoss("BusquedaProcesoCodigosAlternos",procesocodigosalternoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocodigosalternosLogic.setProcesoCodigosAlternoss(new ArrayList<ProcesoCodigosAlternos>());
						procesocodigosalternosLogic.getProcesoCodigosAlternoss().addAll(procesocodigosalternossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocodigosalternoss=new ArrayList<ProcesoCodigosAlternos>();
							procesocodigosalternoss.addAll(procesocodigosalternossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoCodigosAlternos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoCodigosAlternos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocodigosalternosLogic.getProcesoCodigosAlternoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocodigosalternoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocodigosalternosLogic.getProcesoCodigosAlternoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocodigosalternoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoCodigosAlternos procesocodigosalternos) {
		Boolean permite=true;
		
		if(this.procesocodigosalternos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoCodigosAlternosConstantesFunciones.getOrderByListaProcesoCodigosAlternos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoCodigosAlternosConstantesFunciones.getOrderByListaProcesoCodigosAlternos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternosLogic.getProcesoCodigosAlternoss()) {
				if(procesocodigosalternos.getsType().equals(Constantes2.S_TOTALES)) {
					procesocodigosalternosTotales=procesocodigosalternos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCodigosAlternos procesocodigosalternos:this.procesocodigosalternoss) {
				if(procesocodigosalternos.getsType().equals(Constantes2.S_TOTALES)) {
					procesocodigosalternosTotales=procesocodigosalternos;
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
			this.procesocodigosalternosAux=new ProcesoCodigosAlternos();
			this.procesocodigosalternosAux.setsType(Constantes2.S_TOTALES);
			this.procesocodigosalternosAux.setIsNew(false);
			this.procesocodigosalternosAux.setIsChanged(false);
			this.procesocodigosalternosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoCodigosAlternosConstantesFunciones.TotalizarValoresFilaProcesoCodigosAlternos(this.procesocodigosalternosLogic.getProcesoCodigosAlternoss(),this.procesocodigosalternosAux);
				
				//this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().add(this.procesocodigosalternosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoCodigosAlternosConstantesFunciones.TotalizarValoresFilaProcesoCodigosAlternos(this.procesocodigosalternoss,this.procesocodigosalternosAux);
				
				this.procesocodigosalternoss.add(this.procesocodigosalternosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesocodigosalternosTotales=new ProcesoCodigosAlternos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().remove(procesocodigosalternosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocodigosalternoss.remove(procesocodigosalternosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesocodigosalternosTotales=new ProcesoCodigosAlternos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternosLogic.getProcesoCodigosAlternoss()) {
				if(procesocodigosalternos.getsType().equals(Constantes2.S_TOTALES)) {
					procesocodigosalternosTotales=procesocodigosalternos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCodigosAlternosConstantesFunciones.TotalizarValoresFilaProcesoCodigosAlternos(this.procesocodigosalternosLogic.getProcesoCodigosAlternoss(),procesocodigosalternosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCodigosAlternos procesocodigosalternos:this.procesocodigosalternoss) {
				if(procesocodigosalternos.getsType().equals(Constantes2.S_TOTALES)) {
					procesocodigosalternosTotales=procesocodigosalternos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCodigosAlternosConstantesFunciones.TotalizarValoresFilaProcesoCodigosAlternos(this.procesocodigosalternoss,procesocodigosalternosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoCodigosAlternossBusquedaProcesoCodigosAlternos()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoCodigosAlternos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCodigosAlternossFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCodigosAlternossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCodigosAlternossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCodigosAlternossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCodigosAlternossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCodigosAlternossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCodigosAlternossFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCodigosAlternossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoCodigosAlternossBusquedaProcesoCodigosAlternos(String sFinalQuery,Long id_bodega,Long id_producto,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocodigosalternosLogic.getProcesoCodigosAlternossBusquedaProcesoCodigosAlternos(sFinalQuery,this.pagination,id_bodega,id_producto,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCodigosAlternossFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocodigosalternosLogic.getProcesoCodigosAlternossFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCodigosAlternossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocodigosalternosLogic.getProcesoCodigosAlternossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCodigosAlternossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocodigosalternosLogic.getProcesoCodigosAlternossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCodigosAlternossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocodigosalternosLogic.getProcesoCodigosAlternossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCodigosAlternossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocodigosalternosLogic.getProcesoCodigosAlternossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCodigosAlternossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocodigosalternosLogic.getProcesoCodigosAlternossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCodigosAlternossFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocodigosalternosLogic.getProcesoCodigosAlternossFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCodigosAlternossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocodigosalternosLogic.getProcesoCodigosAlternossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProcesoCodigosAlternos() {
		this.isPermisoTodoProcesoCodigosAlternos=false;
		this.isPermisoNuevoProcesoCodigosAlternos=false;
		this.isPermisoActualizarProcesoCodigosAlternos=false;
		this.isPermisoActualizarOriginalProcesoCodigosAlternos=false;
		this.isPermisoEliminarProcesoCodigosAlternos=false;
		this.isPermisoGuardarCambiosProcesoCodigosAlternos=false;
		this.isPermisoConsultaProcesoCodigosAlternos=true;
		this.isPermisoBusquedaProcesoCodigosAlternos=true;
		this.isPermisoReporteProcesoCodigosAlternos=true;
		this.isPermisoOrdenProcesoCodigosAlternos=false;		
		this.isPermisoPaginacionMedioProcesoCodigosAlternos=false;		
		this.isPermisoPaginacionAltoProcesoCodigosAlternos=false;		
		this.isPermisoPaginacionTodoProcesoCodigosAlternos=false;		
		this.isPermisoCopiarProcesoCodigosAlternos=false;		
		this.isPermisoVerFormProcesoCodigosAlternos=false;		
		this.isPermisoDuplicarProcesoCodigosAlternos=false;
		this.isPermisoOrdenProcesoCodigosAlternos=false;
	}
	
	public void setPermisosUsuarioProcesoCodigosAlternos(Boolean isPermiso) {
		this.isPermisoTodoProcesoCodigosAlternos=isPermiso;
		this.isPermisoNuevoProcesoCodigosAlternos=isPermiso;
		this.isPermisoActualizarProcesoCodigosAlternos=isPermiso;
		this.isPermisoActualizarOriginalProcesoCodigosAlternos=isPermiso;
		this.isPermisoEliminarProcesoCodigosAlternos=isPermiso;
		this.isPermisoGuardarCambiosProcesoCodigosAlternos=isPermiso;
		this.isPermisoConsultaProcesoCodigosAlternos=isPermiso;
		this.isPermisoBusquedaProcesoCodigosAlternos=isPermiso;
		this.isPermisoReporteProcesoCodigosAlternos=isPermiso;
		this.isPermisoOrdenProcesoCodigosAlternos=isPermiso;		
		this.isPermisoPaginacionMedioProcesoCodigosAlternos=isPermiso;		
		this.isPermisoPaginacionAltoProcesoCodigosAlternos=isPermiso;		
		this.isPermisoPaginacionTodoProcesoCodigosAlternos=isPermiso;		
		this.isPermisoCopiarProcesoCodigosAlternos=isPermiso;		
		this.isPermisoVerFormProcesoCodigosAlternos=isPermiso;		
		this.isPermisoDuplicarProcesoCodigosAlternos=isPermiso;
		this.isPermisoOrdenProcesoCodigosAlternos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoCodigosAlternos(Boolean isPermiso) {
		//this.isPermisoTodoProcesoCodigosAlternos=isPermiso;
		this.isPermisoNuevoProcesoCodigosAlternos=isPermiso;
		this.isPermisoActualizarProcesoCodigosAlternos=isPermiso;
		this.isPermisoActualizarOriginalProcesoCodigosAlternos=isPermiso;
		this.isPermisoEliminarProcesoCodigosAlternos=isPermiso;
		this.isPermisoGuardarCambiosProcesoCodigosAlternos=isPermiso;
		//this.isPermisoConsultaProcesoCodigosAlternos=isPermiso;
		//this.isPermisoBusquedaProcesoCodigosAlternos=isPermiso;
		//this.isPermisoReporteProcesoCodigosAlternos=isPermiso;
		//this.isPermisoOrdenProcesoCodigosAlternos=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoCodigosAlternos=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoCodigosAlternos=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoCodigosAlternos=isPermiso;		
		//this.isPermisoCopiarProcesoCodigosAlternos=isPermiso;		
		//this.isPermisoDuplicarProcesoCodigosAlternos=isPermiso;
		//this.isPermisoOrdenProcesoCodigosAlternos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCodigosAlternosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoCodigosAlternosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoCodigosAlternos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCodigosAlternosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoCodigosAlternosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoCodigosAlternosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoCodigosAlternosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoCodigosAlternos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoCodigosAlternosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoCodigosAlternosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoCodigosAlternos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoCodigosAlternos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoCodigosAlternos=this.isPermisoActualizarProcesoCodigosAlternos;
			this.isPermisoEliminarProcesoCodigosAlternos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoCodigosAlternos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoCodigosAlternos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoCodigosAlternos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoCodigosAlternos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoCodigosAlternos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCodigosAlternos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoCodigosAlternos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoCodigosAlternos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoCodigosAlternos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoCodigosAlternos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoCodigosAlternos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoCodigosAlternos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCodigosAlternos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoCodigosAlternos.setToolTipText(this.jTableDatosProcesoCodigosAlternos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoCodigosAlternos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoCodigosAlternos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoCodigosAlternosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoCodigosAlternosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoCodigosAlternos() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoCodigosAlternosListas()throws Exception {
		try	{						
			
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoCodigosAlternosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoCodigosAlternosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyBodegaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoCodigosAlternos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {
			if(this.procesocodigosalternosSessionBean==null) {
				this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
			}

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				Bodega bodega=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodega,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodega.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasForeignKey,bodega,true)) {

					this.bodegasForeignKey.add(0,bodega);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.procesocodigosalternosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoCodigosAlternos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCodigosAlternos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoCodigosAlternos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCodigosAlternos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoCodigosAlternos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCodigosAlternos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoCodigosAlternos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoCodigosAlternos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoCodigosAlternos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoCodigosAlternos()throws Exception {
		try {
			

			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoCodigosAlternos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoCodigosAlternos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public ProcesoCodigosAlternosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoCodigosAlternosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoCodigosAlternosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean(); 
		this.procesocodigosalternosConstantesFunciones=new ProcesoCodigosAlternosConstantesFunciones(); 
		this.procesocodigosalternosBean=new ProcesoCodigosAlternos();//(this.procesocodigosalternosConstantesFunciones); 		
		this.procesocodigosalternosReturnGeneral=new ProcesoCodigosAlternosParameterReturnGeneral(); 
		
		this.procesocodigosalternosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocodigosalternosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoCodigosAlternosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoCodigosAlternosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoCodigosAlternosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoCodigosAlternos(true);
			
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
			
			this.procesocodigosalternosConstantesFunciones=new ProcesoCodigosAlternosConstantesFunciones(); 
			this.procesocodigosalternosBean=new ProcesoCodigosAlternos();//this.procesocodigosalternosConstantesFunciones); 			
			this.procesocodigosalternosReturnGeneral=new ProcesoCodigosAlternosParameterReturnGeneral(); 
		
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Codigos Alternos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesocodigosalternos=new ProcesoCodigosAlternos();
			this.procesocodigosalternoss = new ArrayList<ProcesoCodigosAlternos>();
			this.procesocodigosalternossAux = new ArrayList<ProcesoCodigosAlternos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic=new ProcesoCodigosAlternosLogic();
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}
			
			//this.procesocodigosalternosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesocodigosalternosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoCodigosAlternos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCodigosAlternos);	
					}
					
					if(this.jInternalFrameImportacionProcesoCodigosAlternos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCodigosAlternos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoCodigosAlternos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoCodigosAlternos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCodigosAlternos);
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.setVisible(false);
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos);
					this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoCodigosAlternos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCodigosAlternos);
					this.jInternalFrameImportacionProcesoCodigosAlternos.setVisible(false);
					this.jInternalFrameImportacionProcesoCodigosAlternos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoCodigosAlternos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCodigosAlternos);
					this.jInternalFrameOrderByProcesoCodigosAlternos.setVisible(false);
					this.jInternalFrameOrderByProcesoCodigosAlternos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoCodigosAlternosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoCodigosAlternosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesocodigosalternosReturnGeneral=new ProcesoCodigosAlternosParameterReturnGeneral();
			
			this.procesocodigosalternosParameterGeneral=new ProcesoCodigosAlternosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesocodigosalternosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoCodigosAlternosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCodigosAlternosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocodigosalternosSessionBean.getEsGuardarRelacionado(),this.procesocodigosalternosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCodigosAlternosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocodigosalternosSessionBean.getEsGuardarRelacionado(),this.procesocodigosalternosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaDuplicarProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaCopiarProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaVerFormProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaOrdenProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaModificarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaCancelarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=false;
			
			
			this.isVisibilidadBusquedaProcesoCodigosAlternos=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoCodigosAlternos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoCodigosAlternos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoCodigosAlternos(false);
			
			this.setPermisosUsuarioProcesoCodigosAlternos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() 
				|| (this.procesocodigosalternosSessionBean.getEsGuardarRelacionado() && this.procesocodigosalternosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoCodigosAlternosClasesRelacionadas();
			}
			
			if(this.procesocodigosalternosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoCodigosAlternosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoCodigosAlternos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoCodigosAlternos();
			}
			
			if(!this.isPermisoBusquedaProcesoCodigosAlternos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoCodigosAlternos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoCodigosAlternosConstantesFunciones.getTiposSeleccionarProcesoCodigosAlternos());
				
				this.tiposColumnasSelect=ProcesoCodigosAlternosConstantesFunciones.getTiposSeleccionarProcesoCodigosAlternos(true);
				
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
			//if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoCodigosAlternos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoCodigosAlternos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoCodigosAlternos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCodigosAlternos() ;
			
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
			
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesocodigosalternosImplementable= (ProcesoCodigosAlternosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCodigosAlternosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesocodigosalternosImplementableHome= (ProcesoCodigosAlternosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCodigosAlternosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesocodigosalternoss= new ArrayList<ProcesoCodigosAlternos>();
			this.procesocodigosalternossEliminados= new ArrayList<ProcesoCodigosAlternos>();
						
			this.isEsNuevoProcesoCodigosAlternos=false;
			this.esParaAccionDesdeFormularioProcesoCodigosAlternos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoCodigosAlternos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoCodigosAlternos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoCodigosAlternosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoCodigosAlternos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoCodigosAlternos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoCodigosAlternos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoCodigosAlternos();
			}
			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoCodigosAlternos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoCodigosAlternos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoCodigosAlternos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoCodigosAlternos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoCodigosAlternos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoCodigosAlternos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoCodigosAlternos")) {
				iIndex=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTabbedPaneRelacionesProcesoCodigosAlternos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTabbedPaneRelacionesProcesoCodigosAlternos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoCodigosAlternos();	
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
	
	public void cargarCombosForeignKeyProcesoCodigosAlternos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoCodigosAlternos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoCodigosAlternos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoCodigosAlternosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoCodigosAlternos();
		
		this.cargarCombosFrameForeignKeyProcesoCodigosAlternos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoCodigosAlternos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoCodigosAlternos();
		}
	}
	
	

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodega(this.bodegasForeignKey);

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
	
	public void jButtonNuevoProcesoCodigosAlternosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesocodigosalternosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			
			
			if(jTableDatosProcesoCodigosAlternos.getRowCount()>=1) {
				jTableDatosProcesoCodigosAlternos.removeRowSelectionInterval(0, jTableDatosProcesoCodigosAlternos.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoCodigosAlternos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoCodigosAlternos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoCodigosAlternos(true);			
			//this.procesocodigosalternos=new ProcesoCodigosAlternos();
			//this.procesocodigosalternos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCodigosAlternos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCodigosAlternos() ;
			
			if(ProcesoCodigosAlternosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCodigosAlternos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesocodigosalternos);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);				
			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			
			if(this.procesocodigosalternosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoCodigosAlternos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoCodigosAlternosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoCodigosAlternos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoCodigosAlternos.getSelectedRows().length;			
			}
			
			procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoCodigosAlternos--;			
				//ProcesoCodigosAlternos procesocodigosalternosAux= new ProcesoCodigosAlternos();			
				//procesocodigosalternosAux.setId(this.iIdNuevoProcesoCodigosAlternos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoCodigosAlternos procesocodigosalternosOrigen=new ProcesoCodigosAlternos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoCodigosAlternos procesocodigosalternosOrigen : procesocodigosalternossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesocodigosalternosOrigen =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocodigosalternosOrigen =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoCodigosAlternos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesocodigosalternos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoCodigosAlternos(procesocodigosalternosOrigen,this.procesocodigosalternos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().add(this.procesocodigosalternosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternoss.add(this.procesocodigosalternosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
				
				this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(this.getIndiceNuevoProcesoCodigosAlternos(), this.getIndiceNuevoProcesoCodigosAlternos());
				
				int iLastRow =  this.jTableDatosProcesoCodigosAlternos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCodigosAlternos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCodigosAlternos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();									
		
			ProcesoCodigosAlternos procesocodigosalternosOrigen=new ProcesoCodigosAlternos();
			ProcesoCodigosAlternos procesocodigosalternosDestino=new ProcesoCodigosAlternos();
				
			procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoCodigosAlternos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesocodigosalternossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoCodigosAlternos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocodigosalternosOrigen =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocodigosalternosOrigen =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocodigosalternosDestino =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocodigosalternosDestino =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesocodigosalternosOrigen =procesocodigosalternossSeleccionados.get(0);
				procesocodigosalternosDestino =procesocodigosalternossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoCodigosAlternos(procesocodigosalternosOrigen,procesocodigosalternosDestino,true,false);
				
				procesocodigosalternosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesocodigosalternosDestino,procesocodigosalternosLogic.getProcesoCodigosAlternoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesocodigosalternosDestino,procesocodigosalternoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
				
				//this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(this.getIndiceNuevoProcesoCodigosAlternos(), this.getIndiceNuevoProcesoCodigosAlternos());
				
				int iLastRow =  this.jTableDatosProcesoCodigosAlternos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCodigosAlternos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCodigosAlternos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoCodigosAlternos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoCodigosAlternos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoCodigosAlternos.setVisible(!isVisible);
			this.jPanelPaginacionProcesoCodigosAlternos.setVisible(!isVisible);
			this.jPanelAccionesProcesoCodigosAlternos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoCodigosAlternos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoCodigosAlternos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoCodigosAlternos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoCodigosAlternos();
			
			this.abrirFrameOrderByProcesoCodigosAlternos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoCodigosAlternos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoCodigosAlternos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCodigosAlternos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoCodigosAlternos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoCodigosAlternos.setSize(this.jInternalFrameDetalleFormProcesoCodigosAlternos.iWidthFormulario,this.jInternalFrameDetalleFormProcesoCodigosAlternos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoCodigosAlternos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoCodigosAlternos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoCodigosAlternos.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoCodigosAlternos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jContentPaneDetalleProcesoCodigosAlternos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTabbedPaneRelacionesProcesoCodigosAlternos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jContentPaneDetalleProcesoCodigosAlternos.getWidth(),ProcesoCodigosAlternosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTabbedPaneRelacionesProcesoCodigosAlternos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jContentPaneDetalleProcesoCodigosAlternos.getWidth(),ProcesoCodigosAlternosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTabbedPaneRelacionesProcesoCodigosAlternos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jContentPaneDetalleProcesoCodigosAlternos.getWidth(),ProcesoCodigosAlternosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoCodigosAlternos.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoCodigosAlternos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoCodigosAlternos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoCodigosAlternos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoCodigosAlternos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCodigosAlternos,false,this);
				} else {
					this.jInternalFrameOrderByProcesoCodigosAlternos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCodigosAlternos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCodigosAlternos);
				this.jInternalFrameOrderByProcesoCodigosAlternos.setVisible(false);
				this.jInternalFrameOrderByProcesoCodigosAlternos.setSelected(false);
				
				this.jInternalFrameOrderByProcesoCodigosAlternos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCodigosAlternos"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoCodigosAlternos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoCodigosAlternos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoCodigosAlternos==null) {
				
				this.jInternalFrameImportacionProcesoCodigosAlternos=new ImportacionJInternalFrame(ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCodigosAlternos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCodigosAlternos);
				this.jInternalFrameImportacionProcesoCodigosAlternos.setVisible(false);
				this.jInternalFrameImportacionProcesoCodigosAlternos.setSelected(false);


				this.jInternalFrameImportacionProcesoCodigosAlternos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCodigosAlternos"));
				this.jInternalFrameImportacionProcesoCodigosAlternos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCodigosAlternos"));
				this.jInternalFrameImportacionProcesoCodigosAlternos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCodigosAlternos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoCodigosAlternos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos==null) {
				this.jInternalFrameReporteDinamicoProcesoCodigosAlternos=new ReporteDinamicoJInternalFrame(ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCodigosAlternos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos);
				this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCodigosAlternos"));
				this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCodigosAlternos"));
				this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCodigosAlternos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCodigosAlternos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoCodigosAlternos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCodigosAlternos);
			
	       	this.jInternalFrameDetalleFormProcesoCodigosAlternos.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoCodigosAlternos.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoCodigosAlternos.dispose();
			//this.jInternalFrameDetalleFormProcesoCodigosAlternos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoCodigosAlternos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoCodigosAlternos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoCodigosAlternos.setVisible(true);
	        this.jInternalFrameImportacionProcesoCodigosAlternos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoCodigosAlternos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoCodigosAlternos.setVisible(true);
	        this.jInternalFrameOrderByProcesoCodigosAlternos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoCodigosAlternos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoCodigosAlternos.setVisible(false);
	        this.jInternalFrameOrderByProcesoCodigosAlternos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoCodigosAlternos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoCodigosAlternos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoCodigosAlternos.setVisible(false);
	        this.jInternalFrameImportacionProcesoCodigosAlternos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoCodigosAlternos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoCodigosAlternos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoCodigosAlternos(true);
			//this.isEsNuevoProcesoCodigosAlternos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoCodigosAlternos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCodigosAlternos(false) ;
			
			if(procesocodigosalternosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoCodigosAlternosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCodigosAlternos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCodigosAlternos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoCodigosAlternosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoCodigosAlternos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoCodigosAlternos(true);
			//this.isEsNuevoProcesoCodigosAlternos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesocodigosalternos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoCodigosAlternos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoCodigosAlternos(false) ;
			
			if(ProcesoCodigosAlternosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCodigosAlternos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCodigosAlternos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoCodigosAlternos(false);
			
			//if(!this.isEsNuevoProcesoCodigosAlternos) {								
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				
			}
			
			if(this.permiteMantenimiento(this.procesocodigosalternos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoCodigosAlternos=true;
					this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
					this.isEsNuevoProcesoCodigosAlternos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoCodigosAlternos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoCodigosAlternos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCodigosAlternos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCodigosAlternos(false);
				
				this.habilitarDeshabilitarControlesProcesoCodigosAlternos(false);
			
												
				
				if(ProcesoCodigosAlternosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoCodigosAlternos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,procesocodigosalternosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoCodigosAlternos(this.procesocodigosalternos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesocodigosalternosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesocodigosalternos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoCodigosAlternos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCodigosAlternos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				this.procesocodigosalternos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				this.procesocodigosalternos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesocodigosalternos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoCodigosAlternosModel) this.jTableDatosProcesoCodigosAlternos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoCodigosAlternos=true;
				this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
				this.isEsNuevoProcesoCodigosAlternos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCodigosAlternos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCodigosAlternos(false);
				
				this.habilitarDeshabilitarControlesProcesoCodigosAlternos(false);
				
				
				
				if(ProcesoCodigosAlternosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoCodigosAlternos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoCodigosAlternos.getRowCount()>=1) {
				jTableDatosProcesoCodigosAlternos.removeRowSelectionInterval(0, jTableDatosProcesoCodigosAlternos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoCodigosAlternos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCodigosAlternos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCodigosAlternos(false) ;
			
			this.isEsNuevoProcesoCodigosAlternos=false;
			
			if(ProcesoCodigosAlternosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoCodigosAlternos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				
				//SI ES MANUAL
				if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoCodigosAlternos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoCodigosAlternos--;			
			//ProcesoCodigosAlternos procesocodigosalternosAux= new ProcesoCodigosAlternos();			
			//procesocodigosalternosAux.setId(this.iIdNuevoProcesoCodigosAlternos);
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoCodigosAlternos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
			
			this.procesocodigosalternos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().add(this.procesocodigosalternosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesocodigosalternoss.add(this.procesocodigosalternosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
			
			this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(this.getIndiceNuevoProcesoCodigosAlternos(), this.getIndiceNuevoProcesoCodigosAlternos());
			
			int iLastRow =  this.jTableDatosProcesoCodigosAlternos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoCodigosAlternos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoCodigosAlternos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCodigosAlternos(false);
			
			//SI ES MANUAL
			if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCodigosAlternos();
			}
			
			//this.abrirFrameTreeProcesoCodigosAlternos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoCodigosAlternos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoCodigosAlternos.setFileImportacion(this.jInternalFrameImportacionProcesoCodigosAlternos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoCodigosAlternos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoCodigosAlternos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoCodigosAlternos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoCodigosAlternos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();		

		procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoCodigosAlternosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoCodigosAlternosBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoCodigosAlternoss("Todos",procesocodigosalternossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Codigos Alternos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoClienteProveedorDefecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoClienteProveedorDefecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoClienteProveedorDefecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoClienteProveedorDefecto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO:
					sNombreCampoCategoria="nombre_completo_cliente_proveedor_defecto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO:
					sNombreCampoCategoriaValor="nombre_completo_cliente_proveedor_defecto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente Proveedor Defecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente_proveedor_defecto");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();		
		
		procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocodigosalternos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoCodigosAlternoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoCodigosAlternosConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getcodigo_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO);
					iRow++;

					for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocodigosalternos.getnombre_completo_cliente_proveedor_defecto());
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
			//	this.getFilaCabeceraExportarExcelProcesoCodigosAlternos(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoCodigosAlternos(procesocodigosalternosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Codigos Alternos",JOptionPane.INFORMATION_MESSAGE);
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
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCodigosAlternos(false);
			
			//SI ES MANUAL
			if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCodigosAlternos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCodigosAlternos(false);
			
			//SI ES MANUAL
			if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCodigosAlternos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCodigosAlternos(false);
			
			//SI ES MANUAL
			if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCodigosAlternos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoCodigosAlternos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoCodigosAlternos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoCodigosAlternos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoCodigosAlternos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoCodigosAlternos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoCodigosAlternos.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoCodigosAlternos.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoCodigosAlternos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoCodigosAlternos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoCodigosAlternos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoCodigosAlternos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoCodigosAlternos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoCodigosAlternos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoCodigosAlternos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCodigosAlternos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoCodigosAlternos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoCodigosAlternos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoCodigosAlternos();
		
		this.inicializarActualizarBindingBotonesManualProcesoCodigosAlternos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCodigosAlternos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCodigosAlternos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCodigosAlternos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCodigosAlternos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoCodigosAlternos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoCodigosAlternos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jCheckBoxPostAccionNuevoProcesoCodigosAlternos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jCheckBoxPostAccionSinCerrarProcesoCodigosAlternos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jCheckBoxPostAccionSinMensajeProcesoCodigosAlternos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoCodigosAlternos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoCodigosAlternos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jCheckBoxPostAccionNuevoProcesoCodigosAlternos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jCheckBoxPostAccionSinCerrarProcesoCodigosAlternos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jCheckBoxPostAccionSinMensajeProcesoCodigosAlternos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoCodigosAlternos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoCodigosAlternos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoCodigosAlternos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoCodigosAlternos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoCodigosAlternos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoCodigosAlternos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoCodigosAlternos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoCodigosAlternos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoCodigosAlternos(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCodigosAlternos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCodigosAlternos() throws Exception {
		try	{
			if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCodigosAlternos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCodigosAlternos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCodigosAlternos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoCodigosAlternos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoCodigosAlternos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoCodigosAlternos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoCodigosAlternos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoCodigosAlternos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoCodigosAlternos.addItem(reporte);
			}
			
			
			if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoCodigosAlternos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoCodigosAlternos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoCodigosAlternos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoCodigosAlternos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoCodigosAlternos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoCodigosAlternos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoCodigosAlternos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoCodigosAlternos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoCodigosAlternos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCodigosAlternos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCodigosAlternos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos!=null) {
				this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos!=null) {
				this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoCodigosAlternos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getSelectedItem()!=null){this.id_bodegaBusquedaProcesoCodigosAlternos=((Bodega)this.jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getSelectedItem()!=null){this.id_productoBusquedaProcesoCodigosAlternos=((Producto)this.jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getSelectedItem()!=null){this.id_lineaBusquedaProcesoCodigosAlternos=((Linea)this.jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getSelectedItem()!=null){this.id_linea_grupoBusquedaProcesoCodigosAlternos=((Linea)this.jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getSelectedItem()!=null){this.id_linea_categoriaBusquedaProcesoCodigosAlternos=((Linea)this.jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getSelectedItem()!=null){this.id_linea_marcaBusquedaProcesoCodigosAlternos=((Linea)this.jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoCodigosAlternos(Boolean esInicializar) throws Exception {				
		if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCodigosAlternos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoCodigosAlternos() throws Exception {
		this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoCodigosAlternos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoCodigosAlternosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoCodigosAlternosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoCodigosAlternosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoCodigosAlternosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoCodigosAlternosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoCodigosAlternos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesocodigosalternosLogic.getProcesoCodigosAlternoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesocodigosalternoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoCodigosAlternos.setModel(new ProcesoCodigosAlternosModel(this.procesocodigosalternosLogic.getProcesoCodigosAlternoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoCodigosAlternos.setModel(new ProcesoCodigosAlternosModel(this.procesocodigosalternoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoCodigosAlternos!=null && this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoCodigosAlternos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoCodigosAlternosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO,procesocodigosalternosConstantesFunciones.resaltarSeleccionarProcesoCodigosAlternos,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO,procesocodigosalternosConstantesFunciones.resaltarSeleccionarProcesoCodigosAlternos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_ID));

		if(this.procesocodigosalternosConstantesFunciones.mostraridProcesoCodigosAlternos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCodigosAlternosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocodigosalternosConstantesFunciones.resaltaridProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activaridProcesoCodigosAlternos,this,true,"idProcesoCodigosAlternos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocodigosalternosConstantesFunciones.resaltaridProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activaridProcesoCodigosAlternos,this,true,"idProcesoCodigosAlternos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO));

		if(this.procesocodigosalternosConstantesFunciones.mostrarcodigoProcesoCodigosAlternos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesocodigosalternosConstantesFunciones.resaltarcodigoProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activarcodigoProcesoCodigosAlternos,this,true,"codigoProcesoCodigosAlternos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocodigosalternosConstantesFunciones.resaltarcodigoProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activarcodigoProcesoCodigosAlternos,this,true,"codigoProcesoCodigosAlternos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCodigosAlternosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.procesocodigosalternosConstantesFunciones.mostrarnombre_unidadProcesoCodigosAlternos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesocodigosalternosConstantesFunciones.resaltarnombre_unidadProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activarnombre_unidadProcesoCodigosAlternos,this,true,"nombre_unidadProcesoCodigosAlternos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocodigosalternosConstantesFunciones.resaltarnombre_unidadProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activarnombre_unidadProcesoCodigosAlternos,this,true,"nombre_unidadProcesoCodigosAlternos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCodigosAlternosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.procesocodigosalternosConstantesFunciones.mostrarnombre_completo_clienteProcesoCodigosAlternos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesocodigosalternosConstantesFunciones.resaltarnombre_completo_clienteProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activarnombre_completo_clienteProcesoCodigosAlternos,this,true,"nombre_completo_clienteProcesoCodigosAlternos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocodigosalternosConstantesFunciones.resaltarnombre_completo_clienteProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activarnombre_completo_clienteProcesoCodigosAlternos,this,true,"nombre_completo_clienteProcesoCodigosAlternos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCodigosAlternosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.procesocodigosalternosConstantesFunciones.mostrarcodigo_productoProcesoCodigosAlternos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesocodigosalternosConstantesFunciones.resaltarcodigo_productoProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activarcodigo_productoProcesoCodigosAlternos,this,true,"codigo_productoProcesoCodigosAlternos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocodigosalternosConstantesFunciones.resaltarcodigo_productoProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activarcodigo_productoProcesoCodigosAlternos,this,true,"codigo_productoProcesoCodigosAlternos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCodigosAlternosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE));

		if(this.procesocodigosalternosConstantesFunciones.mostrarnombreProcesoCodigosAlternos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesocodigosalternosConstantesFunciones.resaltarnombreProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activarnombreProcesoCodigosAlternos,this,true,"nombreProcesoCodigosAlternos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocodigosalternosConstantesFunciones.resaltarnombreProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activarnombreProcesoCodigosAlternos,this,true,"nombreProcesoCodigosAlternos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCodigosAlternosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO));

		if(this.procesocodigosalternosConstantesFunciones.mostrarnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesocodigosalternosConstantesFunciones.resaltarnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activarnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos,this,true,"nombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocodigosalternosConstantesFunciones.resaltarnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos,this.procesocodigosalternosConstantesFunciones.activarnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos,this,true,"nombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCodigosAlternosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCodigosAlternos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCodigosAlternos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoCodigosAlternos.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoCodigosAlternos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoCodigosAlternos.moveColumn(this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoCodigosAlternos.moveColumn(this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoCodigosAlternos.moveColumn(this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoCodigosAlternos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoCodigosAlternos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoCodigosAlternos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoCodigosAlternos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoCodigosAlternos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoCodigosAlternos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesocodigosalternosLogic.getProcesoCodigosAlternoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesocodigosalternoss.size()-1;
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
		//this.jTableDatosProcesoCodigosAlternos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoCodigosAlternos();
			
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
				
				//this.isEsNuevoProcesoCodigosAlternos=false;
					
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			
				if(this.procesocodigosalternosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCodigosAlternos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCodigosAlternos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesocodigosalternos.getsType().equals("DUPLICADO")
				   || this.procesocodigosalternos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoCodigosAlternos=true;
				
				} else {
					this.isEsNuevoProcesoCodigosAlternos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
					if(this.procesocodigosalternos.getId()>=0 && !this.procesocodigosalternos.getIsNew()) {						
						this.isEsNuevoProcesoCodigosAlternos=false;
						
					} else {
						this.isEsNuevoProcesoCodigosAlternos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoCodigosAlternos(esRelaciones);						
				
				this.seleccionarProcesoCodigosAlternos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesocodigosalternos.getId()<0) {
					this.isEsNuevoProcesoCodigosAlternos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoCodigosAlternos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoCodigosAlternos(evt,rowIndex);
				}	
				
				if(this.procesocodigosalternosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoCodigosAlternos: " + this.dDif); 
					}
				}								
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoCodigosAlternos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesocodigosalternos)) {
					if(this.procesocodigosalternos.getId()>0) {
						this.procesocodigosalternos.setIsDeleted(true);
						
						this.procesocodigosalternossEliminados.add(this.procesocodigosalternos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().remove(this.procesocodigosalternos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternoss.remove(this.procesocodigosalternos);				
					}
					
					
					((ProcesoCodigosAlternosModel) this.jTableDatosProcesoCodigosAlternos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoCodigosAlternos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoCodigosAlternos) {
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCodigosAlternos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCodigosAlternos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoCodigosAlternos(this.procesocodigosalternos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoCodigosAlternos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoCodigosAlternos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCodigosAlternos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoCodigosAlternos(procesocodigosalternos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoCodigosAlternos(procesocodigosalternos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoCodigosAlternos(procesocodigosalternos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoCodigosAlternos(procesocodigosalternos);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelidProcesoCodigosAlternos.setText(procesocodigosalternos.getId().toString());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreacodigoProcesoCodigosAlternos.setText(procesocodigosalternos.getcodigo());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldnombre_unidadProcesoCodigosAlternos.setText(procesocodigosalternos.getnombre_unidad());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_clienteProcesoCodigosAlternos.setText(procesocodigosalternos.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldcodigo_productoProcesoCodigosAlternos.setText(procesocodigosalternos.getcodigo_producto());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombreProcesoCodigosAlternos.setText(procesocodigosalternos.getnombre());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setText(procesocodigosalternos.getnombre_completo_cliente_proveedor_defecto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoCodigosAlternos procesocodigosalternosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesocodigosalternosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoCodigosAlternos procesocodigosalternosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesocodigosalternosLocal=this.procesocodigosalternos;
			} else {
				procesocodigosalternosLocal=this.procesocodigosalternosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesocodigosalternosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoCodigosAlternos(procesocodigosalternosLocal,true);
					
					if(procesocodigosalternosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesocodigosalternosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesocodigosalternosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(procesocodigosalternos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(procesocodigosalternos);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(procesocodigosalternos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelidProcesoCodigosAlternos.getText()==null || this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelidProcesoCodigosAlternos.getText()=="" || this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelidProcesoCodigosAlternos.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelidProcesoCodigosAlternos.setText("0");
			}

			if(conColumnasBase) {procesocodigosalternos.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelidProcesoCodigosAlternos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCodigosAlternosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelIdProcesoCodigosAlternos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocodigosalternos.setcodigo(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreacodigoProcesoCodigosAlternos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelcodigoProcesoCodigosAlternos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocodigosalternos.setnombre_unidad(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldnombre_unidadProcesoCodigosAlternos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelnombre_unidadProcesoCodigosAlternos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocodigosalternos.setnombre_completo_cliente(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_clienteProcesoCodigosAlternos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelnombre_completo_clienteProcesoCodigosAlternos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocodigosalternos.setcodigo_producto(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldcodigo_productoProcesoCodigosAlternos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelcodigo_productoProcesoCodigosAlternos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocodigosalternos.setnombre(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombreProcesoCodigosAlternos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelnombreProcesoCodigosAlternos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocodigosalternos.setnombre_completo_cliente_proveedor_defecto(this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternosBean,ProcesoCodigosAlternos procesocodigosalternos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternosOrigen,ProcesoCodigosAlternos procesocodigosalternos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocodigosalternosOrigen.getId()!=null && !procesocodigosalternosOrigen.getId().equals(0L))) {procesocodigosalternos.setId(procesocodigosalternosOrigen.getId());}}
			if(conDefault || (!conDefault && procesocodigosalternosOrigen.getcodigo()!=null && !procesocodigosalternosOrigen.getcodigo().equals(""))) {procesocodigosalternos.setcodigo(procesocodigosalternosOrigen.getcodigo());}
			if(conDefault || (!conDefault && procesocodigosalternosOrigen.getnombre_unidad()!=null && !procesocodigosalternosOrigen.getnombre_unidad().equals(""))) {procesocodigosalternos.setnombre_unidad(procesocodigosalternosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && procesocodigosalternosOrigen.getnombre_completo_cliente()!=null && !procesocodigosalternosOrigen.getnombre_completo_cliente().equals(""))) {procesocodigosalternos.setnombre_completo_cliente(procesocodigosalternosOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && procesocodigosalternosOrigen.getcodigo_producto()!=null && !procesocodigosalternosOrigen.getcodigo_producto().equals(""))) {procesocodigosalternos.setcodigo_producto(procesocodigosalternosOrigen.getcodigo_producto());}
			if(conDefault || (!conDefault && procesocodigosalternosOrigen.getnombre()!=null && !procesocodigosalternosOrigen.getnombre().equals(""))) {procesocodigosalternos.setnombre(procesocodigosalternosOrigen.getnombre());}
			if(conDefault || (!conDefault && procesocodigosalternosOrigen.getnombre_completo_cliente_proveedor_defecto()!=null && !procesocodigosalternosOrigen.getnombre_completo_cliente_proveedor_defecto().equals(""))) {procesocodigosalternos.setnombre_completo_cliente_proveedor_defecto(procesocodigosalternosOrigen.getnombre_completo_cliente_proveedor_defecto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelidProcesoCodigosAlternos.setText(procesocodigosalternos.getId().toString());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreacodigoProcesoCodigosAlternos.setText(procesocodigosalternos.getcodigo());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldnombre_unidadProcesoCodigosAlternos.setText(procesocodigosalternos.getnombre_unidad());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_clienteProcesoCodigosAlternos.setText(procesocodigosalternos.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldcodigo_productoProcesoCodigosAlternos.setText(procesocodigosalternos.getcodigo_producto());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombreProcesoCodigosAlternos.setText(procesocodigosalternos.getnombre());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setText(procesocodigosalternos.getnombre_completo_cliente_proveedor_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCodigosAlternos(ProcesoCodigosAlternosBean procesocodigosalternosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelidProcesoCodigosAlternos.setText(procesocodigosalternosBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreacodigoProcesoCodigosAlternos.setText(procesocodigosalternosBean.getcodigo());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldnombre_unidadProcesoCodigosAlternos.setText(procesocodigosalternosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_clienteProcesoCodigosAlternos.setText(procesocodigosalternosBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldcodigo_productoProcesoCodigosAlternos.setText(procesocodigosalternosBean.getcodigo_producto());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombreProcesoCodigosAlternos.setText(procesocodigosalternosBean.getnombre());
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setText(procesocodigosalternosBean.getnombre_completo_cliente_proveedor_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoCodigosAlternos(ProcesoCodigosAlternosParameterReturnGeneral procesocodigosalternosReturnGeneral,ProcesoCodigosAlternosBean procesocodigosalternosBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoCodigosAlternos procesocodigosalternosLocal=new ProcesoCodigosAlternos();
			
			procesocodigosalternosLocal=procesocodigosalternosReturnGeneral.getProcesoCodigosAlternos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocodigosalternosLocal.getId()!=null && !procesocodigosalternosLocal.getId().equals(0L))) {procesocodigosalternosBean.setId(procesocodigosalternosLocal.getId());}}
			if(conDefault || (!conDefault && procesocodigosalternosLocal.getcodigo()!=null && !procesocodigosalternosLocal.getcodigo().equals(""))) {procesocodigosalternosBean.setcodigo(procesocodigosalternosLocal.getcodigo());}
			if(conDefault || (!conDefault && procesocodigosalternosLocal.getnombre_unidad()!=null && !procesocodigosalternosLocal.getnombre_unidad().equals(""))) {procesocodigosalternosBean.setnombre_unidad(procesocodigosalternosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && procesocodigosalternosLocal.getnombre_completo_cliente()!=null && !procesocodigosalternosLocal.getnombre_completo_cliente().equals(""))) {procesocodigosalternosBean.setnombre_completo_cliente(procesocodigosalternosLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && procesocodigosalternosLocal.getcodigo_producto()!=null && !procesocodigosalternosLocal.getcodigo_producto().equals(""))) {procesocodigosalternosBean.setcodigo_producto(procesocodigosalternosLocal.getcodigo_producto());}
			if(conDefault || (!conDefault && procesocodigosalternosLocal.getnombre()!=null && !procesocodigosalternosLocal.getnombre().equals(""))) {procesocodigosalternosBean.setnombre(procesocodigosalternosLocal.getnombre());}
			if(conDefault || (!conDefault && procesocodigosalternosLocal.getnombre_completo_cliente_proveedor_defecto()!=null && !procesocodigosalternosLocal.getnombre_completo_cliente_proveedor_defecto().equals(""))) {procesocodigosalternosBean.setnombre_completo_cliente_proveedor_defecto(procesocodigosalternosLocal.getnombre_completo_cliente_proveedor_defecto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoCodigosAlternosGenerico(Long idProcesoCodigosAlternosSeleccionado,JComboBox jComboBoxProcesoCodigosAlternos,List<ProcesoCodigosAlternos> procesocodigosalternossLocal)throws Exception {
		try {
			ProcesoCodigosAlternos  procesocodigosalternosTemp=null;

			for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternossLocal) {
				if(procesocodigosalternosAux.getId()!=null && procesocodigosalternosAux.getId().equals(idProcesoCodigosAlternosSeleccionado)) {
					procesocodigosalternosTemp=procesocodigosalternosAux;
					break;
				}
			}

			jComboBoxProcesoCodigosAlternos.setSelectedItem(procesocodigosalternosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoCodigosAlternosGenerico(JComboBox jComboBoxProcesoCodigosAlternos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCodigosAlternos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoCodigosAlternos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCodigosAlternos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoCodigosAlternos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoCodigosAlternos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoCodigosAlternos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocodigosalternos=(ProcesoCodigosAlternos) procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocodigosalternos =(ProcesoCodigosAlternos) procesocodigosalternoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!procesocodigosalternos.getIsNew() && !procesocodigosalternos.getIsChanged() && !procesocodigosalternos.getIsDeleted()) {
				sDescripcion=procesocodigosalternos.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocodigosalternos.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!procesocodigosalternos.getIsNew() && !procesocodigosalternos.getIsChanged() && !procesocodigosalternos.getIsDeleted()) {
				sDescripcion=procesocodigosalternos.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=procesocodigosalternos.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!procesocodigosalternos.getIsNew() && !procesocodigosalternos.getIsChanged() && !procesocodigosalternos.getIsDeleted()) {
				sDescripcion=procesocodigosalternos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocodigosalternos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!procesocodigosalternos.getIsNew() && !procesocodigosalternos.getIsChanged() && !procesocodigosalternos.getIsDeleted()) {
				sDescripcion=procesocodigosalternos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=procesocodigosalternos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!procesocodigosalternos.getIsNew() && !procesocodigosalternos.getIsChanged() && !procesocodigosalternos.getIsDeleted()) {
				sDescripcion=procesocodigosalternos.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocodigosalternos.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!procesocodigosalternos.getIsNew() && !procesocodigosalternos.getIsChanged() && !procesocodigosalternos.getIsDeleted()) {
				sDescripcion=procesocodigosalternos.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=procesocodigosalternos.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!procesocodigosalternos.getIsNew() && !procesocodigosalternos.getIsChanged() && !procesocodigosalternos.getIsDeleted()) {
				sDescripcion=procesocodigosalternos.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocodigosalternos.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!procesocodigosalternos.getIsNew() && !procesocodigosalternos.getIsChanged() && !procesocodigosalternos.getIsDeleted()) {
				sDescripcion=procesocodigosalternos.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocodigosalternos.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoCodigosAlternos procesocodigosalternosRow=new ProcesoCodigosAlternos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocodigosalternosRow=(ProcesoCodigosAlternos) procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocodigosalternosRow=(ProcesoCodigosAlternos) procesocodigosalternoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoCodigosAlternos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaNuevoProcesoCodigosAlternos && this.isPermisoNuevoProcesoCodigosAlternos));			
			this.jButtonDuplicarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaDuplicarProcesoCodigosAlternos && this.isPermisoDuplicarProcesoCodigosAlternos));			
			this.jButtonCopiarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaCopiarProcesoCodigosAlternos && this.isPermisoCopiarProcesoCodigosAlternos));
			this.jButtonVerFormProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaVerFormProcesoCodigosAlternos && this.isPermisoVerFormProcesoCodigosAlternos));
			
			this.jButtonAbrirOrderByProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaOrdenProcesoCodigosAlternos && this.isPermisoOrdenProcesoCodigosAlternos));			
			
			this.jButtonNuevoRelacionesProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos && this.isPermisoNuevoProcesoCodigosAlternos));			
			this.jButtonNuevoGuardarCambiosProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaNuevoProcesoCodigosAlternos && this.isPermisoNuevoProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos));
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonModificarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaModificarProcesoCodigosAlternos && this.isPermisoActualizarProcesoCodigosAlternos));	
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonActualizarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaActualizarProcesoCodigosAlternos && this.isPermisoActualizarProcesoCodigosAlternos));	
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonEliminarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaEliminarProcesoCodigosAlternos && this.isPermisoEliminarProcesoCodigosAlternos));
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonCancelarProcesoCodigosAlternos.setVisible(this.isVisibilidadCeldaCancelarProcesoCodigosAlternos);							
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonGuardarCambiosProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaGuardarProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaNuevoProcesoCodigosAlternos && this.isPermisoNuevoProcesoCodigosAlternos));						
			this.jButtonDuplicarToolBarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaDuplicarProcesoCodigosAlternos && this.isPermisoDuplicarProcesoCodigosAlternos));						
			this.jButtonCopiarToolBarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaCopiarProcesoCodigosAlternos && this.isPermisoCopiarProcesoCodigosAlternos));			
			this.jButtonVerFormToolBarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaVerFormProcesoCodigosAlternos && this.isPermisoVerFormProcesoCodigosAlternos));			
			this.jButtonAbrirOrderByToolBarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaOrdenProcesoCodigosAlternos && this.isPermisoOrdenProcesoCodigosAlternos));
			this.jButtonNuevoRelacionesToolBarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos && this.isPermisoNuevoProcesoCodigosAlternos));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaNuevoProcesoCodigosAlternos && this.isPermisoNuevoProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos));			
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonModificarToolBarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaModificarProcesoCodigosAlternos && this.isPermisoActualizarProcesoCodigosAlternos));	
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonActualizarToolBarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaActualizarProcesoCodigosAlternos  && this.isPermisoActualizarProcesoCodigosAlternos));	
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonEliminarToolBarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaEliminarProcesoCodigosAlternos && this.isPermisoEliminarProcesoCodigosAlternos));
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonCancelarToolBarProcesoCodigosAlternos.setVisible(this.isVisibilidadCeldaCancelarProcesoCodigosAlternos);				
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonGuardarCambiosToolBarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaGuardarProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaNuevoProcesoCodigosAlternos && this.isPermisoNuevoProcesoCodigosAlternos));			
			this.jMenuItemDuplicarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaDuplicarProcesoCodigosAlternos && this.isPermisoDuplicarProcesoCodigosAlternos));			
			this.jMenuItemCopiarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaCopiarProcesoCodigosAlternos && this.isPermisoCopiarProcesoCodigosAlternos));			
			this.jMenuItemVerFormProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaVerFormProcesoCodigosAlternos && this.isPermisoVerFormProcesoCodigosAlternos));			
			this.jMenuItemAbrirOrderByProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaOrdenProcesoCodigosAlternos && this.isPermisoOrdenProcesoCodigosAlternos));			
			//this.jMenuItemMostrarOcultarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaOrdenProcesoCodigosAlternos && this.isPermisoOrdenProcesoCodigosAlternos));
			this.jMenuItemDetalleAbrirOrderByProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaOrdenProcesoCodigosAlternos && this.isPermisoOrdenProcesoCodigosAlternos));			
			//this.jMenuItemDetalleMostrarOcultarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaOrdenProcesoCodigosAlternos && this.isPermisoOrdenProcesoCodigosAlternos));			
			this.jMenuItemNuevoRelacionesProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos && this.isPermisoNuevoProcesoCodigosAlternos));			
			this.jMenuItemNuevoGuardarCambiosProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaNuevoProcesoCodigosAlternos && this.isPermisoNuevoProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos));									
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemModificarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaModificarProcesoCodigosAlternos && this.isPermisoActualizarProcesoCodigosAlternos));	
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemActualizarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaActualizarProcesoCodigosAlternos && this.isPermisoActualizarProcesoCodigosAlternos));	
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemEliminarProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaEliminarProcesoCodigosAlternos && this.isPermisoEliminarProcesoCodigosAlternos));
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemCancelarProcesoCodigosAlternos.setVisible(this.isVisibilidadCeldaCancelarProcesoCodigosAlternos);				
			}
			
			this.jMenuItemGuardarCambiosProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaGuardarProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos));						
			this.jMenuItemGuardarCambiosTablaProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=this.jButtonNuevoProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoCodigosAlternos=this.jButtonDuplicarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaCopiarProcesoCodigosAlternos=this.jButtonCopiarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaVerFormProcesoCodigosAlternos=this.jButtonVerFormProcesoCodigosAlternos.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoCodigosAlternos=this.jButtonAbrirOrderByProcesoCodigosAlternos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=this.jButtonNuevoRelacionesProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaModificarProcesoCodigosAlternos=this.jButtonModificarProcesoCodigosAlternos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonActualizarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonEliminarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonCancelarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonGuardarCambiosProcesoCodigosAlternos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=this.jButtonNuevoToolBarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=this.jButtonNuevoRelacionesToolBarProcesoCodigosAlternos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			this.isVisibilidadCeldaModificarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonModificarToolBarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonActualizarToolBarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonEliminarToolBarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonCancelarToolBarProcesoCodigosAlternos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=this.jButtonGuardarCambiosToolBarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=this.jButtonGuardarCambiosTablaToolBarProcesoCodigosAlternos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=this.jMenuItemNuevoProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=this.jMenuItemNuevoRelacionesProcesoCodigosAlternos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			this.isVisibilidadCeldaModificarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemModificarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemActualizarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemEliminarProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCodigosAlternos=this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemCancelarProcesoCodigosAlternos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=this.jMenuItemGuardarCambiosProcesoCodigosAlternos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=this.jMenuItemGuardarCambiosTablaProcesoCodigosAlternos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoCodigosAlternos(Boolean esInicializar) {
		if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesocodigosalternosSessionBean.getConGuardarRelaciones()) {
				//if(this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCodigosAlternos();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoCodigosAlternos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoCodigosAlternos() {
		this.jButtonNuevoProcesoCodigosAlternos.setVisible(this.isPermisoNuevoProcesoCodigosAlternos);			
		this.jButtonDuplicarProcesoCodigosAlternos.setVisible(this.isPermisoDuplicarProcesoCodigosAlternos);			
		this.jButtonCopiarProcesoCodigosAlternos.setVisible(this.isPermisoCopiarProcesoCodigosAlternos);			
		this.jButtonVerFormProcesoCodigosAlternos.setVisible(this.isPermisoVerFormProcesoCodigosAlternos);			
		
		this.jButtonAbrirOrderByProcesoCodigosAlternos.setVisible(this.isPermisoOrdenProcesoCodigosAlternos);					
		
		this.jButtonNuevoRelacionesProcesoCodigosAlternos.setVisible(this.isPermisoNuevoProcesoCodigosAlternos);			
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonModificarProcesoCodigosAlternos.setVisible(this.isPermisoActualizarProcesoCodigosAlternos);	
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonActualizarProcesoCodigosAlternos.setVisible(this.isPermisoActualizarProcesoCodigosAlternos);	
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonEliminarProcesoCodigosAlternos.setVisible(this.isPermisoEliminarProcesoCodigosAlternos);
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonCancelarProcesoCodigosAlternos.setVisible(this.isVisibilidadCeldaCancelarProcesoCodigosAlternos);						
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonGuardarCambiosProcesoCodigosAlternos.setVisible(this.isPermisoGuardarCambiosProcesoCodigosAlternos);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.setVisible(this.isPermisoActualizarProcesoCodigosAlternos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCodigosAlternos() {
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonModificarProcesoCodigosAlternos.setVisible(this.isPermisoActualizarProcesoCodigosAlternos);	
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonActualizarProcesoCodigosAlternos.setVisible(this.isPermisoActualizarProcesoCodigosAlternos);	
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonEliminarProcesoCodigosAlternos.setVisible(this.isPermisoEliminarProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonCancelarProcesoCodigosAlternos.setVisible(this.isVisibilidadCeldaCancelarProcesoCodigosAlternos);							
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonGuardarCambiosProcesoCodigosAlternos.setVisible((this.isVisibilidadCeldaGuardarProcesoCodigosAlternos && this.isPermisoGuardarCambiosProcesoCodigosAlternos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoCodigosAlternos() {
		if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoCodigosAlternos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoCodigosAlternos() {
	}
	
	public void jTableDatosProcesoCodigosAlternosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoCodigosAlternos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesocodigosalternos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProcesoCodigosAlternosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProcesoCodigosAlternos(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCodigosAlternos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.procesocodigosalternosLogic.getConnexion());

				if(this.procesocodigosalternos.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.procesocodigosalternos.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCodigosAlternos=(TitledBorder)this.jScrollPanelDatosProcesoCodigosAlternos.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProcesoCodigosAlternos.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.procesocodigosalternos.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProcesoCodigosAlternosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProcesoCodigosAlternos(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCodigosAlternos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.procesocodigosalternosLogic.getConnexion());

				if(this.procesocodigosalternos.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.procesocodigosalternos.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCodigosAlternos=(TitledBorder)this.jScrollPanelDatosProcesoCodigosAlternos.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProcesoCodigosAlternos.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.procesocodigosalternos.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProcesoCodigosAlternosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProcesoCodigosAlternos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCodigosAlternos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.procesocodigosalternosLogic.getConnexion());

				if(this.procesocodigosalternos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.procesocodigosalternos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCodigosAlternos=(TitledBorder)this.jScrollPanelDatosProcesoCodigosAlternos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProcesoCodigosAlternos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.procesocodigosalternos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProcesoCodigosAlternosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProcesoCodigosAlternos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCodigosAlternos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.procesocodigosalternosLogic.getConnexion());

				if(this.procesocodigosalternos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.procesocodigosalternos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCodigosAlternos=(TitledBorder)this.jScrollPanelDatosProcesoCodigosAlternos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProcesoCodigosAlternos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.procesocodigosalternos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaProcesoCodigosAlternosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebProcesoCodigosAlternos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCodigosAlternos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesocodigosalternosLogic.getConnexion());

				if(this.procesocodigosalternos.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.procesocodigosalternos.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCodigosAlternos=(TitledBorder)this.jScrollPanelDatosProcesoCodigosAlternos.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderProcesoCodigosAlternos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.procesocodigosalternos.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoProcesoCodigosAlternosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebProcesoCodigosAlternos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCodigosAlternos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesocodigosalternosLogic.getConnexion());

				if(this.procesocodigosalternos.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.procesocodigosalternos.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCodigosAlternos=(TitledBorder)this.jScrollPanelDatosProcesoCodigosAlternos.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderProcesoCodigosAlternos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.procesocodigosalternos.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaProcesoCodigosAlternosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebProcesoCodigosAlternos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCodigosAlternos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesocodigosalternosLogic.getConnexion());

				if(this.procesocodigosalternos.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.procesocodigosalternos.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCodigosAlternos=(TitledBorder)this.jScrollPanelDatosProcesoCodigosAlternos.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderProcesoCodigosAlternos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.procesocodigosalternos.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaProcesoCodigosAlternosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebProcesoCodigosAlternos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCodigosAlternos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCodigosAlternos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesocodigosalternosLogic.getConnexion());

				if(this.procesocodigosalternos.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.procesocodigosalternos.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCodigosAlternos=(TitledBorder)this.jScrollPanelDatosProcesoCodigosAlternos.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderProcesoCodigosAlternos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.procesocodigosalternos.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.procesocodigosalternos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.procesocodigosalternos.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.procesocodigosalternos.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.procesocodigosalternos.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.procesocodigosalternos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.getprocesocodigosalternos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocodigosalternos==null) {
						this.procesocodigosalternos = new ProcesoCodigosAlternos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);
				}

				if(this.procesocodigosalternos.getnombre_completo_cliente_proveedor_defecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente_proveedor_defecto like '%"+this.procesocodigosalternos.getnombre_completo_cliente_proveedor_defecto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCodigosAlternos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoCodigosAlternosProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);

			this.getProcesoCodigosAlternossBusquedaProcesoCodigosAlternos();

			this.inicializarActualizarBindingProcesoCodigosAlternos(false);

			//if(ProcesoCodigosAlternosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);

			this.getProcesoCodigosAlternossFK_IdBodega();

			this.inicializarActualizarBindingProcesoCodigosAlternos(false);

			//if(ProcesoCodigosAlternosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);

			this.getProcesoCodigosAlternossFK_IdEmpresa();

			this.inicializarActualizarBindingProcesoCodigosAlternos(false);

			//if(ProcesoCodigosAlternosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);

			this.getProcesoCodigosAlternossFK_IdLinea();

			this.inicializarActualizarBindingProcesoCodigosAlternos(false);

			//if(ProcesoCodigosAlternosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);

			this.getProcesoCodigosAlternossFK_IdLineaCategoria();

			this.inicializarActualizarBindingProcesoCodigosAlternos(false);

			//if(ProcesoCodigosAlternosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);

			this.getProcesoCodigosAlternossFK_IdLineaGrupo();

			this.inicializarActualizarBindingProcesoCodigosAlternos(false);

			//if(ProcesoCodigosAlternosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);

			this.getProcesoCodigosAlternossFK_IdLineaMarca();

			this.inicializarActualizarBindingProcesoCodigosAlternos(false);

			//if(ProcesoCodigosAlternosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);

			this.getProcesoCodigosAlternossFK_IdProducto();

			this.inicializarActualizarBindingProcesoCodigosAlternos(false);

			//if(ProcesoCodigosAlternosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProcesoCodigosAlternosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);

			this.getProcesoCodigosAlternossFK_IdSucursal();

			this.inicializarActualizarBindingProcesoCodigosAlternos(false);

			//if(ProcesoCodigosAlternosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocodigosalternosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoCodigosAlternos() {
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.dispose();
			this.jInternalFrameDetalleFormProcesoCodigosAlternos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos!=null) {
			this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.dispose();
			this.jInternalFrameReporteDinamicoProcesoCodigosAlternos=null;
		}
		
		if(this.jInternalFrameImportacionProcesoCodigosAlternos!=null) {
			this.jInternalFrameImportacionProcesoCodigosAlternos.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoCodigosAlternos.dispose();
			this.jInternalFrameImportacionProcesoCodigosAlternos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoCodigosAlternos();
			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoCodigosAlternos")) {
				jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoCodigosAlternos")) {
				jButtonDuplicarProcesoCodigosAlternosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoCodigosAlternos")) {
				jButtonCopiarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoCodigosAlternos")) {
				jButtonVerFormProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoCodigosAlternos")) {
				jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoCodigosAlternos")) {
				jButtonDuplicarProcesoCodigosAlternosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoCodigosAlternos")) {
				jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoCodigosAlternos")) {
				jButtonDuplicarProcesoCodigosAlternosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoCodigosAlternos")) {
				jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoCodigosAlternos")) {
				jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoCodigosAlternos")) {
				jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoCodigosAlternos")) {
				jButtonModificarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoCodigosAlternos")) {
				jButtonModificarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoCodigosAlternos")) {
				jButtonModificarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoCodigosAlternos")) {
				jButtonActualizarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoCodigosAlternos")) {
				jButtonActualizarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoCodigosAlternos")) {
				jButtonActualizarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoCodigosAlternos")) {
				jButtonEliminarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoCodigosAlternos")) {
				jButtonEliminarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoCodigosAlternos")) {
				jButtonEliminarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoCodigosAlternos")) {
				jButtonCancelarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoCodigosAlternos")) {
				jButtonCancelarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoCodigosAlternos")) {
				jButtonCancelarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoCodigosAlternos")) {
				jButtonCerrarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoCodigosAlternos")) {
				jButtonCerrarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoCodigosAlternos")) {
				jButtonCerrarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoCodigosAlternos")) {
				jButtonMostrarOcultarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoCodigosAlternos")) {
				jButtonCancelarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoCodigosAlternos")) {
				jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoCodigosAlternos")) {
				jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoCodigosAlternos")) {
				jButtonCopiarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoCodigosAlternos")) {
				jButtonVerFormProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoCodigosAlternos")) {
				jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoCodigosAlternos")) {
				jButtonCopiarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoCodigosAlternos")) {
				jButtonVerFormProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCodigosAlternos")) {
				jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoCodigosAlternos")) {
				jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoCodigosAlternos")) {
				jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoCodigosAlternos")) {
				jButtonRecargarInformacionProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoCodigosAlternos")) {
				jButtonRecargarInformacionProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoCodigosAlternos")) {
				jButtonRecargarInformacionProcesoCodigosAlternosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoCodigosAlternos")) {
				jButtonAnterioresProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoCodigosAlternos")) {
				jButtonAnterioresProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoCodigosAlternos")) {
				jButtonAnterioresProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoCodigosAlternos")) {
				jButtonSiguientesProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoCodigosAlternos")) {
				jButtonSiguientesProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoCodigosAlternos")) {
				jButtonSiguientesProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoCodigosAlternos") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoCodigosAlternos")) {
				jButtonAbrirOrderByProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoCodigosAlternos") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoCodigosAlternos")) {
				jButtonMostrarOcultarProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCodigosAlternos")) {
				jButtonNuevoGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoCodigosAlternos")) {
				jButtonNuevoGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoCodigosAlternos")) {
				jButtonNuevoGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoCodigosAlternos")) {
				jButtonCerrarReporteDinamicoProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoCodigosAlternos")) {
				jButtonGenerarReporteDinamicoProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoCodigosAlternos")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoCodigosAlternos")) {
				jButtonCerrarImportacionProcesoCodigosAlternosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoCodigosAlternos")) {
				
				jButtonGenerarImportacionProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoCodigosAlternos")) {
				
				jButtonAbrirImportacionProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoCodigosAlternos")) {
				jComboBoxTiposAccionesProcesoCodigosAlternosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoCodigosAlternos")) {
				jComboBoxTiposRelacionesProcesoCodigosAlternosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoCodigosAlternos")) {
				jComboBoxTiposAccionesProcesoCodigosAlternosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoCodigosAlternos")) {
				
				jComboBoxTiposSeleccionarProcesoCodigosAlternosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoCodigosAlternos")) {
				jTextFieldValorCampoGeneralProcesoCodigosAlternosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoCodigosAlternos")) {
				jButtonAbrirOrderByProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoCodigosAlternos")) {
				jButtonAbrirOrderByProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoCodigosAlternos")) {
				jButtonCerrarOrderByProcesoCodigosAlternosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCodigosAlternosBusqueda")) {
				this.jButtonidProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProcesoCodigosAlternosUpdate")) {
				this.jButtonid_bodegaProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_bodegaProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProcesoCodigosAlternosUpdate")) {
				this.jButtonid_productoProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_productoProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoCodigosAlternosUpdate")) {
				this.jButtonid_empresaProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_empresaProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoCodigosAlternosUpdate")) {
				this.jButtonid_sucursalProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_sucursalProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProcesoCodigosAlternosUpdate")) {
				this.jButtonid_lineaProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_lineaProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoCodigosAlternosUpdate")) {
				this.jButtonid_linea_grupoProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_linea_grupoProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoCodigosAlternosUpdate")) {
				this.jButtonid_linea_categoriaProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_linea_categoriaProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoCodigosAlternosUpdate")) {
				this.jButtonid_linea_marcaProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_linea_marcaProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoCodigosAlternosBusqueda")) {
				this.jButtoncodigoProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProcesoCodigosAlternosBusqueda")) {
				this.jButtonnombre_unidadProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteProcesoCodigosAlternosBusqueda")) {
				this.jButtonnombre_completo_clienteProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoProcesoCodigosAlternosBusqueda")) {
				this.jButtoncodigo_productoProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesoCodigosAlternosBusqueda")) {
				this.jButtonnombreProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda")) {
				this.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoCodigosAlternosProcesoCodigosAlternos")) {
				this.jButtonBusquedaProcesoCodigosAlternosProcesoCodigosAlternosActionPerformed(evt);
			}
			
			;
			
			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoCodigosAlternos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCodigosAlternosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				


				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCodigosAlternos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCodigosAlternos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoCodigosAlternos procesocodigosalternosLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesocodigosalternosLocal=this.procesocodigosalternos;
			} else {
				procesocodigosalternosLocal=this.procesocodigosalternosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
							
				
				


				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCodigosAlternos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCodigosAlternos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCodigosAlternosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
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
			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			
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
			
			


			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCodigosAlternosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
								
						
				


				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCodigosAlternos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCodigosAlternos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
								
				
				


				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCodigosAlternos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCodigosAlternos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCodigosAlternosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCodigosAlternosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCodigosAlternosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
							
				
				


				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCodigosAlternos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCodigosAlternos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCodigosAlternosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
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
			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			
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
			
			


			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCodigosAlternosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
								
				
				


				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCodigosAlternos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCodigosAlternos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCodigosAlternosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCodigosAlternosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCodigosAlternosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoCodigosAlternos")) {
					jCheckBoxSeleccionarTodosProcesoCodigosAlternosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoCodigosAlternos")) {
					jCheckBoxSeleccionadosProcesoCodigosAlternosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoCodigosAlternos")) {
					
				}
				
				


				
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCodigosAlternos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCodigosAlternos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
												
				
				


				
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCodigosAlternos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCodigosAlternos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCodigosAlternosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCodigosAlternosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
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
			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
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
			
			


			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCodigosAlternosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCodigosAlternos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCodigosAlternos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocodigosalternos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocodigosalternos);
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
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
				
				


				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCodigosAlternos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCodigosAlternos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCodigosAlternosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocodigosalternosAnterior =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoCodigosAlternos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoCodigosAlternosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoCodigosAlternos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesocodigosalternos =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesocodigosalternos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoCodigosAlternos")) {
				
				}
				
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoCodigosAlternos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoCodigosAlternos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoCodigosAlternos")) {
			
			}
			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoCodigosAlternos();
			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoCodigosAlternos")) {
				jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoCodigosAlternos")) {
				jButtonDuplicarProcesoCodigosAlternosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoCodigosAlternos")) {
				jButtonCopiarProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoCodigosAlternos")) {
				jButtonVerFormProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoCodigosAlternos")) {
				jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoCodigosAlternos")) {
				jButtonModificarProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoCodigosAlternos")) {
				jButtonActualizarProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoCodigosAlternos")) {
				jButtonEliminarProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCodigosAlternos")) {
				jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoCodigosAlternos")) {
				jButtonCancelarProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoCodigosAlternos")) {
				jButtonCerrarProcesoCodigosAlternosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoCodigosAlternos")) {
				jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCodigosAlternos")) {
				jButtonNuevoGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoCodigosAlternos")) {
				jButtonAbrirOrderByProcesoCodigosAlternosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoCodigosAlternos")) {
				jButtonRecargarInformacionProcesoCodigosAlternosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoCodigosAlternos")) {
				jButtonAnterioresProcesoCodigosAlternosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoCodigosAlternos")) {
				jButtonSiguientesProcesoCodigosAlternosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCodigosAlternosBusqueda")) {
				this.jButtonidProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProcesoCodigosAlternosUpdate")) {
				this.jButtonid_bodegaProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_bodegaProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProcesoCodigosAlternosUpdate")) {
				this.jButtonid_productoProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_productoProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoCodigosAlternosUpdate")) {
				this.jButtonid_empresaProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_empresaProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoCodigosAlternosUpdate")) {
				this.jButtonid_sucursalProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_sucursalProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProcesoCodigosAlternosUpdate")) {
				this.jButtonid_lineaProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_lineaProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoCodigosAlternosUpdate")) {
				this.jButtonid_linea_grupoProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_linea_grupoProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoCodigosAlternosUpdate")) {
				this.jButtonid_linea_categoriaProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_linea_categoriaProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoCodigosAlternosUpdate")) {
				this.jButtonid_linea_marcaProcesoCodigosAlternosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoCodigosAlternosBusqueda")) {
				this.jButtonid_linea_marcaProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoCodigosAlternosBusqueda")) {
				this.jButtoncodigoProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProcesoCodigosAlternosBusqueda")) {
				this.jButtonnombre_unidadProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteProcesoCodigosAlternosBusqueda")) {
				this.jButtonnombre_completo_clienteProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoProcesoCodigosAlternosBusqueda")) {
				this.jButtoncodigo_productoProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesoCodigosAlternosBusqueda")) {
				this.jButtonnombreProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda")) {
				this.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusquedaActionPerformed(evt);
			}
			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoCodigosAlternos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoCodigosAlternos")) {
				closingInternalFrameProcesoCodigosAlternos();
				
			} else if(sTipo.equals("jButtonCancelarProcesoCodigosAlternos")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoCodigosAlternos = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoCodigosAlternosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCodigosAlternosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCodigosAlternos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoCodigosAlternosActionPerformed(null);
			}
			
			ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocodigosalternos,new Object(),this.procesocodigosalternosParameterGeneral,this.procesocodigosalternosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoCodigosAlternos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoCodigosAlternos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoCodigosAlternos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesocodigosalternos)) {
			if(!esControlTabla) {
				if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);			
				}
				
				if(this.procesocodigosalternosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoCodigosAlternos(this.procesocodigosalternosReturnGeneral,this.procesocodigosalternosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesocodigosalternosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCodigosAlternos(classes,this.procesocodigosalternosReturnGeneral,this.procesocodigosalternosBean,false);
					}
						
					if(this.procesocodigosalternosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoCodigosAlternos(this.procesocodigosalternosReturnGeneral.getProcesoCodigosAlternos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoCodigosAlternos(this.procesocodigosalternosReturnGeneral.getProcesoCodigosAlternos());	
					}
						
					if(this.procesocodigosalternosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoCodigosAlternos(this.procesocodigosalternosReturnGeneral.getProcesoCodigosAlternos(),classes);//this.procesocodigosalternosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoCodigosAlternos(this.procesocodigosalternos,classes);//this.procesocodigosalternosBean);									
				}
			
				if(ProcesoCodigosAlternosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoCodigosAlternos(this.procesocodigosalternos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCodigosAlternos(this.procesocodigosalternos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesocodigosalternosAnterior!=null) {
						this.procesocodigosalternos=this.procesocodigosalternosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesocodigosalternosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesocodigosalternosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesocodigosalternosReturnGeneral.getProcesoCodigosAlternos(),procesocodigosalternosLogic.getProcesoCodigosAlternoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesocodigosalternosReturnGeneral.getProcesoCodigosAlternos(),this.procesocodigosalternoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoCodigosAlternos.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoCodigosAlternos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoCodigosAlternos();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoCodigosAlternos() throws Exception {
		
		ProcesoCodigosAlternosModel procesocodigosalternosModel=(ProcesoCodigosAlternosModel)this.jTableDatosProcesoCodigosAlternos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocodigosalternosModel.procesocodigosalternoss=this.procesocodigosalternosLogic.getProcesoCodigosAlternoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesocodigosalternosModel.procesocodigosalternoss=this.procesocodigosalternoss;
		}
		
		
		((ProcesoCodigosAlternosModel) this.jTableDatosProcesoCodigosAlternos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoCodigosAlternos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesocodigosalternosAnterior(),this.procesocodigosalternosLogic.getProcesoCodigosAlternoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesocodigosalternosAnterior(),this.procesocodigosalternoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoCodigosAlternos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
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
										
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocodigosalternos,new Object(),generalEntityParameterGeneral,this.procesocodigosalternosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesocodigosalternosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoCodigosAlternosConstantesFunciones.getClassesRelationshipsOfProcesoCodigosAlternos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoCodigosAlternosConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoCodigosAlternos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoCodigosAlternos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocodigosalternos,new Object(),generalEntityParameterGeneral,this.procesocodigosalternosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoCodigosAlternos(ProcesoCodigosAlternosBean procesocodigosalternosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCodigosAlternos(ArrayList<Classe> classes,ProcesoCodigosAlternosReturnGeneral procesocodigosalternosReturnGeneral,ProcesoCodigosAlternosBean procesocodigosalternosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesocodigosalternos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos = new ProcesoCodigosAlternosDetalleFormJInternalFrame(jDesktopPane,this.procesocodigosalternosSessionBean.getConGuardarRelaciones(),this.procesocodigosalternosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.setVisible(false);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.procesocodigosalternosLogic=this.procesocodigosalternosLogic;
		
		this.cargarCombosFrameForeignKeyProcesoCodigosAlternos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCodigosAlternos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCodigosAlternos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoCodigosAlternos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoCodigosAlternos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCodigosAlternos"));
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonModificarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"ModificarProcesoCodigosAlternos"));

		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonModificarToolBarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCodigosAlternos"));
					
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemModificarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCodigosAlternos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonActualizarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCodigosAlternos"));
		
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonActualizarToolBarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCodigosAlternos"));
						
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemActualizarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCodigosAlternos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonEliminarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"EliminarProcesoCodigosAlternos"));
		
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonEliminarToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCodigosAlternos"));
								
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemEliminarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCodigosAlternos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonCancelarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"CancelarProcesoCodigosAlternos"));
		
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonCancelarToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCodigosAlternos"));
					
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemCancelarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCodigosAlternos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemDetalleCerrarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCodigosAlternos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonGuardarCambiosToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCodigosAlternos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonGuardarCambiosToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCodigosAlternos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCodigosAlternos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonidProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_bodegaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_bodegaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_productoProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_productoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_empresaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_empresaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_sucursalProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_sucursalProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_lineaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_lineaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_grupoProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_grupoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_categoriaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_marcaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_marcaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtoncodigoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonnombre_unidadProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtoncodigo_productoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonnombreProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTabbedPaneRelacionesProcesoCodigosAlternos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCodigosAlternos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoCodigosAlternos"));
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCodigosAlternos"));
		}
		
		this.jTableDatosProcesoCodigosAlternos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoCodigosAlternos"));
		
		this.jTableDatosProcesoCodigosAlternos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoCodigosAlternos"));
		
		this.jButtonNuevoProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"NuevoProcesoCodigosAlternos"));
		
		this.jButtonDuplicarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"DuplicarProcesoCodigosAlternos"));
		
		this.jButtonCopiarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"CopiarProcesoCodigosAlternos"));
		
		this.jButtonVerFormProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"VerFormProcesoCodigosAlternos"));
		
		
		this.jButtonNuevoToolBarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoCodigosAlternos"));
			
		this.jButtonDuplicarToolBarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoCodigosAlternos"));
			
		this.jMenuItemNuevoProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoCodigosAlternos"));
			
		this.jMenuItemDuplicarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoCodigosAlternos"));		
		
		
		this.jButtonNuevoRelacionesProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoCodigosAlternos"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoCodigosAlternos"));
			
		this.jMenuItemNuevoRelacionesProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoCodigosAlternos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonModificarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"ModificarProcesoCodigosAlternos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonModificarToolBarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCodigosAlternos"));
			
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemModificarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCodigosAlternos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonActualizarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCodigosAlternos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonActualizarToolBarProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCodigosAlternos"));
				
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemActualizarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCodigosAlternos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonEliminarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"EliminarProcesoCodigosAlternos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonEliminarToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCodigosAlternos"));
						
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemEliminarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCodigosAlternos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonCancelarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"CancelarProcesoCodigosAlternos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonCancelarToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCodigosAlternos"));
			
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemCancelarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCodigosAlternos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoCodigosAlternos"));		
		
		
		this.jButtonCerrarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"CerrarProcesoCodigosAlternos"));
		
		
		this.jButtonCerrarToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoCodigosAlternos"));
			
		this.jMenuItemCerrarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoCodigosAlternos"));
			
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jMenuItemDetalleCerrarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCodigosAlternos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonGuardarCambiosProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoCodigosAlternos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonGuardarCambiosToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCodigosAlternos"));
		}
		
		this.jButtonCopiarToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoCodigosAlternos"));
			
		this.jButtonVerFormToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoCodigosAlternos"));
		
		this.jMenuItemGuardarCambiosProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoCodigosAlternos"));
			
		this.jMenuItemCopiarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoCodigosAlternos"));		
		
		this.jMenuItemVerFormProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoCodigosAlternos"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCodigosAlternos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoCodigosAlternos"));
			
		this.jMenuItemGuardarCambiosTablaProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCodigosAlternos"));		
		
		
		
		this.jButtonRecargarInformacionProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoCodigosAlternos"));
					
		this.jButtonRecargarInformacionToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoCodigosAlternos"));
		
		this.jMenuItemRecargarInformacionProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoCodigosAlternos"));		
		
		
		
		this.jButtonAnterioresProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"AnterioresProcesoCodigosAlternos"));
		
		
		this.jButtonAnterioresToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoCodigosAlternos"));
		
		this.jMenuItemAnterioresProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoCodigosAlternos"));		
		
		
		this.jButtonSiguientesProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"SiguientesProcesoCodigosAlternos"));
		
		
		this.jButtonSiguientesToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoCodigosAlternos"));
			
		this.jMenuItemSiguientesProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoCodigosAlternos"));
			
		this.jMenuItemAbrirOrderByProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoCodigosAlternos"));
			
		this.jMenuItemMostrarOcultarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoCodigosAlternos"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoCodigosAlternos"));
			
		this.jMenuItemDetalleMostarOcultarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoCodigosAlternos"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoCodigosAlternos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoCodigosAlternos"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoCodigosAlternos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoCodigosAlternos"));

		this.jCheckBoxSeleccionadosProcesoCodigosAlternos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoCodigosAlternos"));
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCodigosAlternos"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoCodigosAlternos"));
			
		this.jComboBoxTiposAccionesProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoCodigosAlternos"));
					
		this.jComboBoxTiposSeleccionarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoCodigosAlternos"));
			
		this.jTextFieldValorCampoGeneralProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoCodigosAlternos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonidProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_bodegaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_bodegaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_productoProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_productoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_empresaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_empresaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_sucursalProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_sucursalProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_lineaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_lineaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_grupoProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_grupoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_categoriaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_marcaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_marcaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtoncodigoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonnombre_unidadProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtoncodigo_productoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonnombreProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCodigosAlternosProcesoCodigosAlternos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoCodigosAlternos!=null) {
				this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCodigosAlternos"));
				this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCodigosAlternos"));
				this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCodigosAlternos"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCodigosAlternos"));				
			//this.jButtonGenerarReporteDinamicoProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCodigosAlternos"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCodigosAlternos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoCodigosAlternos!=null) {
				this.jInternalFrameImportacionProcesoCodigosAlternos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCodigosAlternos"));
				this.jInternalFrameImportacionProcesoCodigosAlternos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCodigosAlternos"));
				this.jInternalFrameImportacionProcesoCodigosAlternos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCodigosAlternos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoCodigosAlternos"));
			
			this.jButtonAbrirOrderByToolBarProcesoCodigosAlternos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoCodigosAlternos"));			
			
			if(this.jInternalFrameOrderByProcesoCodigosAlternos!=null) {
				this.jInternalFrameOrderByProcesoCodigosAlternos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCodigosAlternos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTabbedPaneRelacionesProcesoCodigosAlternos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCodigosAlternos"));
		
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
            		closingInternalFrameProcesoCodigosAlternos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoCodigosAlternos = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoCodigosAlternosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCodigosAlternosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCodigosAlternos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoCodigosAlternosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoCodigosAlternos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoCodigosAlternosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoCodigosAlternos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoCodigosAlternos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoCodigosAlternos";
		inputMap = this.jButtonNuevoProcesoCodigosAlternos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoCodigosAlternos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoCodigosAlternos";
		inputMap = this.jButtonNuevoRelacionesProcesoCodigosAlternos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoCodigosAlternos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCodigosAlternosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoCodigosAlternos";
		inputMap = this.jButtonModificarProcesoCodigosAlternos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoCodigosAlternos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoCodigosAlternosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoCodigosAlternos";
		inputMap = this.jButtonActualizarProcesoCodigosAlternos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoCodigosAlternos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoCodigosAlternosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoCodigosAlternos";
		inputMap = this.jButtonEliminarProcesoCodigosAlternos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoCodigosAlternos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoCodigosAlternosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoCodigosAlternos";
		inputMap = this.jButtonCancelarProcesoCodigosAlternos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoCodigosAlternos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoCodigosAlternosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoCodigosAlternos";
		inputMap = this.jButtonCerrarProcesoCodigosAlternos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoCodigosAlternos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoCodigosAlternosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonGuardarCambiosProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoCodigosAlternos";
		inputMap = this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonGuardarCambiosProcesoCodigosAlternos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonGuardarCambiosProcesoCodigosAlternos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoCodigosAlternosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoCodigosAlternos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoCodigosAlternosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoCodigosAlternos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoCodigosAlternosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoCodigosAlternos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoCodigosAlternosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonidProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_bodegaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_bodegaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_productoProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_productoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_empresaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_empresaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_sucursalProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_sucursalProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_lineaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_lineaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_grupoProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_grupoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_categoriaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_categoriaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCodigosAlternosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_marcaProcesoCodigosAlternosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCodigosAlternosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonid_linea_marcaProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtoncodigoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonnombre_unidadProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonnombre_completo_clienteProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtoncodigo_productoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonnombreProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoCodigosAlternosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jButtonnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_cliente_proveedor_defectoProcesoCodigosAlternosBusqueda"));
		
		
		this.jButtonBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCodigosAlternosProcesoCodigosAlternos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoCodigosAlternos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoCodigosAlternosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoCodigosAlternosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoCodigosAlternos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoCodigosAlternos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternosLogic.getProcesoCodigosAlternoss()) {
					procesocodigosalternosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternoss) {
					procesocodigosalternosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoCodigosAlternosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternosLogic.getProcesoCodigosAlternoss()) {
						procesocodigosalternosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternoss) {
						procesocodigosalternosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternosLogic.getProcesoCodigosAlternoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCodigosAlternos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCodigosAlternos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoCodigosAlternosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoCodigosAlternos.getSelectedRows();
			
			ProcesoCodigosAlternos procesocodigosalternosLocal=new ProcesoCodigosAlternos();
			
			//this.seleccionarTodosProcesoCodigosAlternos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesocodigosalternosLocal =(ProcesoCodigosAlternos) this.procesocodigosalternosLogic.getProcesoCodigosAlternoss().toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesocodigosalternosLocal =(ProcesoCodigosAlternos) this.procesocodigosalternoss.toArray()[this.jTableDatosProcesoCodigosAlternos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesocodigosalternosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternosLogic.getProcesoCodigosAlternoss()) {
						procesocodigosalternosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternoss) {
						procesocodigosalternosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCodigosAlternos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCodigosAlternos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCodigosAlternos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoCodigosAlternosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoCodigosAlternosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoCodigosAlternosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoCodigosAlternos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternosLogic.getProcesoCodigosAlternoss()) {
				
						if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesocodigosalternosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							procesocodigosalternosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							procesocodigosalternosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							procesocodigosalternosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesocodigosalternosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO)) {
							existe=true;
							procesocodigosalternosAux.setnombre_completo_cliente_proveedor_defecto(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternoss) {
					
						if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesocodigosalternosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							procesocodigosalternosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							procesocodigosalternosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							procesocodigosalternosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesocodigosalternosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO)) {
							existe=true;
							procesocodigosalternosAux.setnombre_completo_cliente_proveedor_defecto(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoCodigosAlternosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoCodigosAlternos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoCodigosAlternos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoCodigosAlternos) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoCodigosAlternos(conSplash);
				
					this.generarReporteProcesoCodigosAlternossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCodigosAlternos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoCodigosAlternossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCodigosAlternos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCodigosAlternossSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoCodigosAlternos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCodigosAlternossSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoCodigosAlternos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCodigosAlternos();
				
				this.exportarProcesoCodigosAlternossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCodigosAlternos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoCodigosAlternoss();
				//this.importarProcesoCodigosAlternoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCodigosAlternos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCodigosAlternos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoCodigosAlternossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCodigosAlternos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Codigos Alternos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoCodigosAlternos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoCodigosAlternos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoCodigosAlternos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Codigos Alternos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCodigosAlternos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoCodigosAlternosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoCodigosAlternos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoCodigosAlternos(conSplash);
					
						//this.actualizarParametrosGeneralProcesoCodigosAlternos();
						
						this.generarReporteProcesoAccionProcesoCodigosAlternossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoCodigosAlternos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Codigos AlternosES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Codigos Alternos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoCodigosAlternos();
				
						this.actualizarParametrosGeneralProcesoCodigosAlternos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesocodigosalternosReturnGeneral=procesocodigosalternosLogic.procesarAccionProcesoCodigosAlternossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesocodigosalternosLogic.getProcesoCodigosAlternoss(),this.procesocodigosalternosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoCodigosAlternosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCodigosAlternos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoCodigosAlternos();
					
					ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoCodigosAlternosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCodigosAlternos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxTiposAccionesFormularioProcesoCodigosAlternos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoCodigosAlternos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoCodigosAlternosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoCodigosAlternos();
			
			if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();		
			ProcesoCodigosAlternos procesocodigosalternos=new ProcesoCodigosAlternos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoCodigosAlternos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoCodigosAlternos.getSelectedItem();
			
			
			
			
			procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesocodigosalternossSeleccionados.size()==1) {
				for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternossSeleccionados) {
					procesocodigosalternos=procesocodigosalternosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoCodigosAlternos();
			
      		//this.finishProcessProcesoCodigosAlternos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoCodigosAlternosReturnGeneral() throws Exception {
		if(this.procesocodigosalternosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesocodigosalternosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesocodigosalternosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesocodigosalternosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesocodigosalternosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesocodigosalternosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoCodigosAlternos(false);
		}
		
		if(this.procesocodigosalternosReturnGeneral.getConRetornoLista() || this.procesocodigosalternosReturnGeneral.getConRetornoObjeto()) {
			if(this.procesocodigosalternosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.procesocodigosalternosLogic.setProcesoCodigosAlternoss(this.procesocodigosalternosReturnGeneral.getProcesoCodigosAlternoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoCodigosAlternos(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoCodigosAlternos() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoCodigosAlternos> getProcesoCodigosAlternossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoCodigosAlternos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternosLogic.getProcesoCodigosAlternoss()) {
					if(procesocodigosalternosAux.getIsSelected()) {
						procesocodigosalternossSeleccionados.add(procesocodigosalternosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCodigosAlternos procesocodigosalternosAux:this.procesocodigosalternoss) {
					if(procesocodigosalternosAux.getIsSelected()) {
						procesocodigosalternossSeleccionados.add(procesocodigosalternosAux);				
					}
				}
			}
			
			if(procesocodigosalternossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesocodigosalternossSeleccionados.addAll(this.procesocodigosalternosLogic.getProcesoCodigosAlternoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesocodigosalternossSeleccionados.addAll(this.procesocodigosalternoss);				
					}
				}
			}
		} else {
			procesocodigosalternossSeleccionados.add(this.procesocodigosalternos);
		}
		
		return procesocodigosalternossSeleccionados;
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
	
	public void generarReporteProcesoCodigosAlternossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoCodigosAlternossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoCodigosAlternossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCodigosAlternossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCodigosAlternossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Codigos Alternos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoCodigosAlternossSeleccionados() throws Exception {
		ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();		
		
		procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoCodigosAlternoss("Todos",procesocodigosalternossSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoCodigosAlternossSeleccionados() throws Exception {
		ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();		
		
		procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoCodigosAlternoss("Todos",procesocodigosalternossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoCodigosAlternossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();
		
		procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoCodigosAlternoss("Todos",procesocodigosalternossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoCodigosAlternossSeleccionados() throws Exception {
		ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoCodigosAlternos();
		
		
		procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoCodigosAlternos();
		
		
		//this.generarReporteProcesoCodigosAlternoss("Todos",procesocodigosalternossSeleccionados ,procesocodigosalternosImplementable,procesocodigosalternosImplementableHome);
	}
	
	public void mostrarImportacionProcesoCodigosAlternoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoCodigosAlternos();
		
		this.abrirFrameImportacionProcesoCodigosAlternos();		
		
			
		//this.generarReporteProcesoCodigosAlternoss("Todos",procesocodigosalternossSeleccionados ,procesocodigosalternosImplementable,procesocodigosalternosImplementableHome);
	}
	
	public void importarProcesoCodigosAlternoss() throws Exception {		
	
	}
	
	public void exportarProcesoCodigosAlternossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoCodigosAlternossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoCodigosAlternossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoCodigosAlternossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Codigos Alternos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoCodigosAlternossSeleccionados() throws Exception {
		ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();		
		
		procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocodigosalternos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoCodigosAlternos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoCodigosAlternos(procesocodigosalternosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesocodigosalternosAux.setsDetalleGeneralEntityReporte(procesocodigosalternosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Codigos Alternos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoCodigosAlternos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesocodigosalternos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getcodigo_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocodigosalternos.getnombre_completo_cliente_proveedor_defecto();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoCodigosAlternossSeleccionados() throws Exception {
		ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();		
		
		procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocodigosalternos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoCodigosAlternoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoCodigosAlternos(row);				
				iRow++;
			}				
			
			for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoCodigosAlternos(procesocodigosalternosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Codigos Alternos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoCodigosAlternossSeleccionados() throws Exception {
		ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();		
		
		procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocodigosalternos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesocodigosalternoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesocodigosalternos");
			//elementRoot.appendChild(element);
		
			for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternossSeleccionados) {
				element = document.createElement("procesocodigosalternos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoCodigosAlternos(procesocodigosalternosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Codigos Alternos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoCodigosAlternos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getcodigo_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocodigosalternos.getnombre_completo_cliente_proveedor_defecto());				
	}
	
	public void setFilaDatosExportarXmlProcesoCodigosAlternos(ProcesoCodigosAlternos procesocodigosalternos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoCodigosAlternosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesocodigosalternos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoCodigosAlternosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesocodigosalternos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementbodega_descripcion = document.createElement(ProcesoCodigosAlternosConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(procesocodigosalternos.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProcesoCodigosAlternosConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(procesocodigosalternos.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementempresa_descripcion = document.createElement(ProcesoCodigosAlternosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(procesocodigosalternos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProcesoCodigosAlternosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(procesocodigosalternos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementlinea_descripcion = document.createElement(ProcesoCodigosAlternosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(procesocodigosalternos.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ProcesoCodigosAlternosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(procesocodigosalternos.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ProcesoCodigosAlternosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(procesocodigosalternos.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ProcesoCodigosAlternosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(procesocodigosalternos.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementcodigo = document.createElement(ProcesoCodigosAlternosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(procesocodigosalternos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_unidad = document.createElement(ProcesoCodigosAlternosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(procesocodigosalternos.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementnombre_completo_cliente = document.createElement(ProcesoCodigosAlternosConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(procesocodigosalternos.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementcodigo_producto = document.createElement(ProcesoCodigosAlternosConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(procesocodigosalternos.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);

		Element elementnombre = document.createElement(ProcesoCodigosAlternosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(procesocodigosalternos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_completo_cliente_proveedor_defecto = document.createElement(ProcesoCodigosAlternosConstantesFunciones.NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO);
		elementnombre_completo_cliente_proveedor_defecto.appendChild(document.createTextNode(procesocodigosalternos.getnombre_completo_cliente_proveedor_defecto().trim()));
		element.appendChild(elementnombre_completo_cliente_proveedor_defecto);
	}
	
	public void generarReporteGroupGenericoProcesoCodigosAlternossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados=new ArrayList<ProcesoCodigosAlternos>();
		
		procesocodigosalternossSeleccionados=this.getProcesoCodigosAlternossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoCodigosAlternos(procesocodigosalternossSeleccionados);
		
		this.generarReporteProcesoCodigosAlternoss("Todos",procesocodigosalternossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoCodigosAlternos(ArrayList<ProcesoCodigosAlternos> procesocodigosalternossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoCodigosAlternos procesocodigosalternosAux:procesocodigosalternossSeleccionados) {
				procesocodigosalternosAux.setsDetalleGeneralEntityReporte(procesocodigosalternosAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getcodigo_producto());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCodigosAlternosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTEPROVEEDORDEFECTO)) {
					existe=true;
					procesocodigosalternosAux.setsDescripcionGeneralEntityReporte1(procesocodigosalternosAux.getnombre_completo_cliente_proveedor_defecto());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCodigosAlternosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoCodigosAlternos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaCancelarProcesoCodigosAlternos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaModificarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaCancelarProcesoCodigosAlternos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaModificarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaCancelarProcesoCodigosAlternos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaModificarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaCancelarProcesoCodigosAlternos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaModificarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaCancelarProcesoCodigosAlternos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaCancelarProcesoCodigosAlternos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaModificarProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaCancelarProcesoCodigosAlternos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoCodigosAlternosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=true;
		} else {
			this.actualizarEstadoPanelsProcesoCodigosAlternos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoCodigosAlternos=false;
			//this.isVisibilidadCeldaVerFormProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaDuplicarProcesoCodigosAlternos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesocodigosalternosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
			if(!procesocodigosalternosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=false;												
			}
			
			this.jButtonCerrarProcesoCodigosAlternos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=false;
		}
		
		if(!this.permiteMantenimiento(this.procesocodigosalternos)) {
			this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=false;
			this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoCodigosAlternos=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoCodigosAlternos=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoCodigosAlternos=false;
		//this.isVisibilidadCeldaModificarProcesoCodigosAlternos=true;
		this.isVisibilidadCeldaActualizarProcesoCodigosAlternos=false;
		this.isVisibilidadCeldaEliminarProcesoCodigosAlternos=false;
		//this.isVisibilidadCeldaCancelarProcesoCodigosAlternos=true;			
		this.isVisibilidadCeldaGuardarProcesoCodigosAlternos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCodigosAlternos() {
	}
	
	public void actualizarEstadoPanelsProcesoCodigosAlternos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCodigosAlternos!=null) {
				this.jTabbedPaneBusquedasProcesoCodigosAlternos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosProcesoCodigosAlternos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCodigosAlternos!=null) {
				this.jPanelPaginacionProcesoCodigosAlternos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCodigosAlternos!=null) {
				this.jPanelParametrosReportesProcesoCodigosAlternos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCodigosAlternos!=null) {
				this.jTabbedPaneBusquedasProcesoCodigosAlternos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosProcesoCodigosAlternos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCodigosAlternos!=null) {
				this.jPanelPaginacionProcesoCodigosAlternos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCodigosAlternos!=null) {
				this.jPanelParametrosReportesProcesoCodigosAlternos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCodigosAlternos!=null) {
				this.jTabbedPaneBusquedasProcesoCodigosAlternos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosProcesoCodigosAlternos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCodigosAlternos!=null) {
				this.jPanelPaginacionProcesoCodigosAlternos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCodigosAlternos!=null) {
				this.jPanelParametrosReportesProcesoCodigosAlternos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCodigosAlternos!=null) {
				this.jTabbedPaneBusquedasProcesoCodigosAlternos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosProcesoCodigosAlternos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCodigosAlternos!=null) {
				this.jPanelPaginacionProcesoCodigosAlternos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCodigosAlternos!=null) {
				this.jPanelParametrosReportesProcesoCodigosAlternos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCodigosAlternos!=null) {
				this.jTabbedPaneBusquedasProcesoCodigosAlternos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosProcesoCodigosAlternos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCodigosAlternos!=null) {
				this.jPanelPaginacionProcesoCodigosAlternos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCodigosAlternos!=null) {
				this.jPanelParametrosReportesProcesoCodigosAlternos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCodigosAlternos!=null) {
				this.jTabbedPaneBusquedasProcesoCodigosAlternos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosProcesoCodigosAlternos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCodigosAlternos!=null) {
				this.jPanelPaginacionProcesoCodigosAlternos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCodigosAlternos!=null) {
				this.jPanelParametrosReportesProcesoCodigosAlternos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosEdicionProcesoCodigosAlternos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCodigosAlternos!=null) {
				this.jTabbedPaneBusquedasProcesoCodigosAlternos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCodigosAlternos!=null) {
				this.jScrollPanelDatosProcesoCodigosAlternos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCodigosAlternos!=null) {
				this.jPanelPaginacionProcesoCodigosAlternos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCodigosAlternos!=null) {
				this.jPanelParametrosReportesProcesoCodigosAlternos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoCodigosAlternos!=null) {
					this.jTabbedPaneBusquedasProcesoCodigosAlternos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoCodigosAlternos!=null) {
				this.jPanelParametrosReportesProcesoCodigosAlternos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCodigosAlternos!=null) {
				this.jTabbedPaneBusquedasProcesoCodigosAlternos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoCodigosAlternos!=null) {
				this.jPanelParametrosReportesProcesoCodigosAlternos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaProcesoCodigosAlternos=isParaBodega;
			if(!this.isVisibilidadBusquedaProcesoCodigosAlternos) {this.jTabbedPaneBusquedasProcesoCodigosAlternos.remove(jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaProcesoCodigosAlternos=isParaProducto;
			if(!this.isVisibilidadBusquedaProcesoCodigosAlternos) {this.jTabbedPaneBusquedasProcesoCodigosAlternos.remove(jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProcesoCodigosAlternos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProcesoCodigosAlternos) {this.jTabbedPaneBusquedasProcesoCodigosAlternos.remove(jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProcesoCodigosAlternos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProcesoCodigosAlternos) {this.jTabbedPaneBusquedasProcesoCodigosAlternos.remove(jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaProcesoCodigosAlternos=isParaLinea;
			if(!this.isVisibilidadBusquedaProcesoCodigosAlternos) {this.jTabbedPaneBusquedasProcesoCodigosAlternos.remove(jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaProcesoCodigosAlternos=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaProcesoCodigosAlternos) {this.jTabbedPaneBusquedasProcesoCodigosAlternos.remove(jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaProcesoCodigosAlternos=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaProcesoCodigosAlternos) {this.jTabbedPaneBusquedasProcesoCodigosAlternos.remove(jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaProcesoCodigosAlternos=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaProcesoCodigosAlternos) {this.jTabbedPaneBusquedasProcesoCodigosAlternos.remove(jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);}
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
			
			this.inicializarActualizarBindingTablaProcesoCodigosAlternos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoCodigosAlternos() {
		this.updateBorderResaltarBusquedasFormularioProcesoCodigosAlternos();
		this.updateVisibilidadBusquedasFormularioProcesoCodigosAlternos();
		this.updateHabilitarBusquedasFormularioProcesoCodigosAlternos();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoCodigosAlternos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoCodigosAlternos.getComponents().length>0) {
	

		if(this.procesocodigosalternosConstantesFunciones.resaltarBusquedaProcesoCodigosAlternosProcesoCodigosAlternos!=null) {
			index= this.jTabbedPaneBusquedasProcesoCodigosAlternos.indexOfComponent(this.jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCodigosAlternos.getComponent(index);
				jPanel.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoCodigosAlternos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoCodigosAlternos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCodigosAlternos.indexOfComponent(this.jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCodigosAlternos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);
			if(!this.procesocodigosalternosConstantesFunciones.mostrarBusquedaProcesoCodigosAlternosProcesoCodigosAlternos && index>-1) {
				this.jTabbedPaneBusquedasProcesoCodigosAlternos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoCodigosAlternos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoCodigosAlternos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCodigosAlternos.indexOfComponent(this.jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCodigosAlternos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesocodigosalternosConstantesFunciones.activarBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);
				this.jTabbedPaneBusquedasProcesoCodigosAlternos.setEnabledAt(index,this.procesocodigosalternosConstantesFunciones.activarBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoCodigosAlternos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoCodigosAlternos")) {
			index= this.jTabbedPaneBusquedasProcesoCodigosAlternos.indexOfComponent(this.jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);

			this.jTabbedPaneBusquedasProcesoCodigosAlternos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCodigosAlternos.getComponent(index);

			this.procesocodigosalternosConstantesFunciones.setResaltarBusquedaProcesoCodigosAlternosProcesoCodigosAlternos(resaltar);

			jPanel.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoCodigosAlternos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoCodigosAlternos() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoCodigosAlternos();
		this.updateVisibilidadResaltarControlesFormularioProcesoCodigosAlternos();
		this.updateHabilitarResaltarControlesFormularioProcesoCodigosAlternos();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoCodigosAlternos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesocodigosalternosConstantesFunciones.resaltaridProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelidProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltaridProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarid_bodegaProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarid_bodegaProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarid_productoProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarid_productoProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarid_empresaProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarid_empresaProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarid_sucursalProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarid_sucursalProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarid_lineaProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarid_lineaProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarid_linea_grupoProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarid_linea_grupoProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarid_linea_categoriaProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarid_linea_categoriaProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarid_linea_marcaProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarid_linea_marcaProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarcodigoProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreacodigoProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarcodigoProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarnombre_unidadProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldnombre_unidadProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarnombre_unidadProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarnombre_completo_clienteProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_clienteProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarnombre_completo_clienteProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarcodigo_productoProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldcodigo_productoProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarcodigo_productoProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarnombreProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombreProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarnombreProcesoCodigosAlternos);}
		if(this.procesocodigosalternosConstantesFunciones.resaltarnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos!=null && this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setBorder(this.procesocodigosalternosConstantesFunciones.resaltarnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoCodigosAlternos() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
	
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelidProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostraridProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelidProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostraridProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_bodegaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelid_bodegaProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_bodegaProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_productoProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelid_productoProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_productoProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_empresaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelid_empresaProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_empresaProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_sucursalProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelid_sucursalProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_sucursalProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_lineaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelid_lineaProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_lineaProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_linea_grupoProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelid_linea_grupoProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_linea_grupoProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_linea_categoriaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelid_linea_categoriaProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_linea_categoriaProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_linea_marcaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelid_linea_marcaProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarid_linea_marcaProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreacodigoProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarcodigoProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelcodigoProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarcodigoProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldnombre_unidadProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarnombre_unidadProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelnombre_unidadProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarnombre_unidadProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_clienteProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarnombre_completo_clienteProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelnombre_completo_clienteProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarnombre_completo_clienteProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldcodigo_productoProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarcodigo_productoProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelcodigo_productoProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarcodigo_productoProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombreProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarnombreProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelnombreProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarnombreProcesoCodigosAlternos);
		//this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jPanelnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setVisible(this.procesocodigosalternosConstantesFunciones.mostrarnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoCodigosAlternos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCodigosAlternos!=null) {
	
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jLabelidProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activaridProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_bodegaProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarid_bodegaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_productoProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarid_productoProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_empresaProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarid_empresaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_sucursalProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarid_sucursalProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_lineaProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarid_lineaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_grupoProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarid_linea_grupoProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_categoriaProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarid_linea_categoriaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jComboBoxid_linea_marcaProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarid_linea_marcaProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreacodigoProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarcodigoProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldnombre_unidadProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarnombre_unidadProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_clienteProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarnombre_completo_clienteProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextFieldcodigo_productoProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarcodigo_productoProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombreProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarnombreProcesoCodigosAlternos);
		this.jInternalFrameDetalleFormProcesoCodigosAlternos.jTextAreanombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos.setEnabled(this.procesocodigosalternosConstantesFunciones.activarnombre_completo_cliente_proveedor_defectoProcesoCodigosAlternos);
		}
	}
	
		
}