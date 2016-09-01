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

import com.bydan.erp.inventario.util.IngredienteConstantesFunciones;
import com.bydan.erp.inventario.util.IngredienteParameterReturnGeneral;
//import com.bydan.erp.inventario.util.IngredienteParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.IngredienteBean;
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
public class IngredienteBeanSwingJInternalFrame extends IngredienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(IngredienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Ingrediente> ingredienteValidator = new ClassValidator<Ingrediente>(Ingrediente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Ingrediente ingrediente;	
	public Ingrediente ingredienteAux;
	public Ingrediente ingredienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Ingrediente ingredienteTotales;
	public Long idIngredienteActual;
	public Long iIdNuevoIngrediente=0L;
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

	public String sFinalQueryComboBodegaRelacion="";

	public List<Bodega> bodegarelacionsForeignKey;

	public List<Bodega> getbodegarelacionsForeignKey() {
		return bodegarelacionsForeignKey;
	}

	public void setbodegarelacionsForeignKey(List<Bodega> bodegarelacionsForeignKey) {
		this.bodegarelacionsForeignKey = bodegarelacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegarelacionForeignKey;

	public Bodega getbodegarelacionForeignKey() {
		return bodegarelacionForeignKey;
	}

	public void setbodegarelacionForeignKey(Bodega bodegarelacionForeignKey) {
		this.bodegarelacionForeignKey = bodegarelacionForeignKey;
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

	public String sFinalQueryComboProductoRelacion="";

	public List<Producto> productorelacionsForeignKey;

	public List<Producto> getproductorelacionsForeignKey() {
		return productorelacionsForeignKey;
	}

	public void setproductorelacionsForeignKey(List<Producto> productorelacionsForeignKey) {
		this.productorelacionsForeignKey = productorelacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Producto productorelacionForeignKey;

	public Producto getproductorelacionForeignKey() {
		return productorelacionForeignKey;
	}

	public void setproductorelacionForeignKey(Producto productorelacionForeignKey) {
		this.productorelacionForeignKey = productorelacionForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
	}
	public Long idProductoRelacionActual=0L;

	public Long getidProductoRelacionActual() {
		return idProductoRelacionActual;
	}

	public void setidProductoRelacionActual(Long idProductoRelacionActual) {
		this.idProductoRelacionActual= idProductoRelacionActual;
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
	
	public Boolean isPermisoTodoIngrediente;
	public Boolean isPermisoNuevoIngrediente;
	public Boolean isPermisoActualizarIngrediente;
	public Boolean isPermisoActualizarOriginalIngrediente;
	public Boolean isPermisoEliminarIngrediente;
	public Boolean isPermisoGuardarCambiosIngrediente;
	public Boolean isPermisoConsultaIngrediente;
	public Boolean isPermisoBusquedaIngrediente;
	public Boolean isPermisoReporteIngrediente;
	public Boolean isPermisoPaginacionMedioIngrediente;
	public Boolean isPermisoPaginacionAltoIngrediente;
	public Boolean isPermisoPaginacionTodoIngrediente;
	public Boolean isPermisoCopiarIngrediente;
	public Boolean isPermisoVerFormIngrediente;
	public Boolean isPermisoDuplicarIngrediente;
	public Boolean isPermisoOrdenIngrediente;
	
	
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
	
	public IngredienteParameterReturnGeneral ingredienteReturnGeneral;
	public IngredienteParameterReturnGeneral ingredienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoIngrediente=false;
	public Boolean esParaAccionDesdeFormularioIngrediente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected IngredienteSessionBeanAdditional ingredienteSessionBeanAdditional=null;
	
	public IngredienteSessionBeanAdditional getIngredienteSessionBeanAdditional() {
		return this.ingredienteSessionBeanAdditional;
	}
	
	public void setIngredienteSessionBeanAdditional(IngredienteSessionBeanAdditional ingredienteSessionBeanAdditional) {
		try {
			this.ingredienteSessionBeanAdditional=ingredienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected IngredienteBeanSwingJInternalFrameAdditional ingredienteBeanSwingJInternalFrameAdditional=null;
	//public class IngredienteBeanSwingJInternalFrame
	
	public IngredienteBeanSwingJInternalFrameAdditional getIngredienteBeanSwingJInternalFrameAdditional() {
		return this.ingredienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setIngredienteBeanSwingJInternalFrameAdditional(IngredienteBeanSwingJInternalFrameAdditional ingredienteBeanSwingJInternalFrameAdditional) {
		try {
			this.ingredienteBeanSwingJInternalFrameAdditional=ingredienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public IngredienteLogic ingredienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Ingrediente ingredienteBean;
	public IngredienteConstantesFunciones ingredienteConstantesFunciones;
	//public IngredienteParameterReturnGeneral ingredienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public BodegaLogic bodegarelacionLogic;
	public ProductoLogic productoLogic;
	public ProductoLogic productorelacionLogic;
	
	//PARAMETROS
	
	
	//public List<Ingrediente> ingredientes;	
	//public List<Ingrediente> ingredientesEliminados;
	//public List<Ingrediente> ingredientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoIngrediente=false;
	public Boolean isVisibilidadCeldaDuplicarIngrediente=true;
	public Boolean isVisibilidadCeldaCopiarIngrediente=true;
	public Boolean isVisibilidadCeldaVerFormIngrediente=true;
	public Boolean isVisibilidadCeldaOrdenIngrediente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesIngrediente=false;
	public Boolean isVisibilidadCeldaModificarIngrediente=false;
	public Boolean isVisibilidadCeldaActualizarIngrediente=false;
	public Boolean isVisibilidadCeldaEliminarIngrediente=false;
	public Boolean isVisibilidadCeldaCancelarIngrediente=false;
	public Boolean isVisibilidadCeldaGuardarIngrediente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosIngrediente=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdBodegaRelacion=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdProductoRelacion=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoIngrediente() {
		return this.iIdNuevoIngrediente;
	}

	public void setiIdNuevoIngrediente(Long iIdNuevoIngrediente) {
		this.iIdNuevoIngrediente = iIdNuevoIngrediente;
	}
	
	public Long getidIngredienteActual() {
		return this.idIngredienteActual;
	}

	public void setidIngredienteActual(Long idIngredienteActual) {
		this.idIngredienteActual = idIngredienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Ingrediente getingrediente() {
		return this.ingrediente;
	}

	public void setingrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	
	public Ingrediente getingredienteAux() {
		return this.ingredienteAux;
	}

	public void setingredienteAux(Ingrediente ingredienteAux) {
		this.ingredienteAux = ingredienteAux;
	}				
	
	public Ingrediente getingredienteAnterior() {
		return this.ingredienteAnterior;
	}

	public void setingredienteAnterior(Ingrediente ingredienteAnterior) {
		this.ingredienteAnterior = ingredienteAnterior;
	}	
	
	public Ingrediente getingredienteTotales() {
		return this.ingredienteTotales;
	}

	public void setingredienteTotales(Ingrediente ingredienteTotales) {
		this.ingredienteTotales = ingredienteTotales;
	}	
	
	public Ingrediente getingredienteBean() {
		return this.ingredienteBean;
	}

	public void setingredienteBean(Ingrediente ingredienteBean) {
		this.ingredienteBean = ingredienteBean;
	}	
	
	public IngredienteParameterReturnGeneral getingredienteReturnGeneral() {
		return this.ingredienteReturnGeneral;
	}

	public void setingredienteReturnGeneral(IngredienteParameterReturnGeneral ingredienteReturnGeneral) {
		this.ingredienteReturnGeneral = ingredienteReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_bodega_relacionFK_IdBodegaRelacion=-1L;

	public Long getid_bodega_relacionFK_IdBodegaRelacion() {
		return this.id_bodega_relacionFK_IdBodegaRelacion;
	}

	public void setid_bodega_relacionFK_IdBodegaRelacion(Long id_bodega_relacionFK_IdBodegaRelacion) {
		this.id_bodega_relacionFK_IdBodegaRelacion = id_bodega_relacionFK_IdBodegaRelacion;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
	}

	public Long id_producto_relacionFK_IdProductoRelacion=-1L;

	public Long getid_producto_relacionFK_IdProductoRelacion() {
		return this.id_producto_relacionFK_IdProductoRelacion;
	}

	public void setid_producto_relacionFK_IdProductoRelacion(Long id_producto_relacionFK_IdProductoRelacion) {
		this.id_producto_relacionFK_IdProductoRelacion = id_producto_relacionFK_IdProductoRelacion;
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
	
	
	public IngredienteLogic getIngredienteLogic()	{		
		return ingredienteLogic;
	}

	public void setIngredienteLogic(IngredienteLogic ingredienteLogic) {
		this.ingredienteLogic = ingredienteLogic;
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
	
	public Boolean getIsEsNuevoIngrediente() {
		return isEsNuevoIngrediente;
	}

	public void setIsEsNuevoIngrediente(Boolean isEsNuevoIngrediente) {
		this.isEsNuevoIngrediente = isEsNuevoIngrediente;
	}

	public Boolean getEsParaAccionDesdeFormularioIngrediente() {
		return esParaAccionDesdeFormularioIngrediente;
	}
	
	public void setEsParaAccionDesdeFormularioIngrediente(Boolean esParaAccionDesdeFormularioIngrediente) {
		this.esParaAccionDesdeFormularioIngrediente = esParaAccionDesdeFormularioIngrediente;
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

			if(this.ingredienteSessionBean==null) {
				this.ingredienteSessionBean=new IngredienteSessionBean();
			}

			if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ingredienteSessionBean.getlidEmpresaActual());
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

			if(this.ingredienteSessionBean==null) {
				this.ingredienteSessionBean=new IngredienteSessionBean();
			}

			if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(ingredienteSessionBean.getlidSucursalActual());
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

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.ingredienteSessionBean==null) {
				this.ingredienteSessionBean=new IngredienteSessionBean();
			}

			if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

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
					bodegaLogic.getEntityWithConnection(ingredienteSessionBean.getlidBodegaActual());
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

	public void cargarCombosBodegaRelacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegarelacionsForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.ingredienteSessionBean==null) {
				this.ingredienteSessionBean=new IngredienteSessionBean();
			}

			if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionBodegaRelacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegarelacionLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegarelacionsForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodegaRelacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(ingredienteSessionBean.getlidBodegaRelacionActual());
					this.bodegarelacionsForeignKey.add(bodegaLogic.getBodega());
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

			if(this.ingredienteSessionBean==null) {
				this.ingredienteSessionBean=new IngredienteSessionBean();
			}

			if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(ingredienteSessionBean.getlidProductoActual());
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

	public void cargarCombosProductoRelacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productorelacionsForeignKey=new ArrayList<Producto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoLogic productoLogic=new ProductoLogic();

			//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.ingredienteSessionBean==null) {
				this.ingredienteSessionBean=new IngredienteSessionBean();
			}

			if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionProductoRelacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productorelacionLogic.getProductoDataAccess().setIsForForeingKeyData(true);

					productoLogic.getTodosProductosWithConnection(sFinalQuery,new Pagination());

					this.productorelacionsForeignKey=productoLogic.getProductos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProductoRelacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(ingredienteSessionBean.getlidProductoRelacionActual());
					this.productorelacionsForeignKey.add(productoLogic.getProducto());
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

					if(this.ingrediente!=null) {
						this.ingrediente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormIngrediente!=null) {
						this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaIngrediente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormIngrediente!=null) {
						if(this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.getItemCount()>0) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaIngredienteGenerico)throws Exception
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
				jComboBoxid_empresaIngredienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaIngredienteGenerico!=null && jComboBoxid_empresaIngredienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaIngredienteGenerico.setSelectedIndex(0);
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

					if(this.ingrediente!=null) {
						this.ingrediente.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormIngrediente!=null) {
						this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalIngrediente.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormIngrediente!=null) {
						if(this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.getItemCount()>0) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalIngredienteGenerico)throws Exception
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
				jComboBoxid_sucursalIngredienteGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalIngredienteGenerico!=null && jComboBoxid_sucursalIngredienteGenerico.getItemCount()>0) {
					jComboBoxid_sucursalIngredienteGenerico.setSelectedIndex(0);
				}
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

					if(this.ingrediente!=null) {
						this.ingrediente.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormIngrediente!=null) {
						this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaIngrediente.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormIngrediente!=null) {
						if(this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.getItemCount()>0) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaIngrediente!=null) {
						jComboBoxid_bodegaFK_IdBodegaIngrediente.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaIngrediente!=null) {
							//jComboBoxid_bodegaFK_IdBodegaIngrediente.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaIngrediente.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaIngrediente.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaIngredienteGenerico)throws Exception
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
				jComboBoxid_bodegaIngredienteGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaIngredienteGenerico!=null && jComboBoxid_bodegaIngredienteGenerico.getItemCount()>0) {
					jComboBoxid_bodegaIngredienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaRelacionForeignKey(Long idBodegaRelacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegarelacionTemp=null;

			for(Bodega bodegarelacionAux:bodegarelacionsForeignKey) {
				if(bodegarelacionAux.getId()!=null && bodegarelacionAux.getId().equals(idBodegaRelacionSeleccionado)) {
					bodegarelacionTemp=bodegarelacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegarelacionTemp!=null) {

					if(this.ingrediente!=null) {
						this.ingrediente.setBodegaRelacion(bodegarelacionTemp);
					}

					if(this.jInternalFrameDetalleFormIngrediente!=null) {
						this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.setSelectedItem(bodegarelacionTemp);
					}
				} else {
					//jComboBoxid_bodega_relacionIngrediente.setSelectedItem(bodegarelacionTemp);
					if(this.jInternalFrameDetalleFormIngrediente!=null) {
						if(this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.getItemCount()>0) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodegaRelacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegarelacionTemp!=null && jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente!=null) {
						jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.setSelectedItem(bodegarelacionTemp);
					} else {
						if(jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente!=null) {
							//jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.setSelectedItem(bodegarelacionTemp);
							if(jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.getItemCount()>0) {
								jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.setSelectedIndex(0);
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

	public String getActualBodegaRelacionForeignKeyDescripcion(Long idBodegaRelacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegarelacionTemp=null;

			for(Bodega bodegarelacionAux:bodegarelacionsForeignKey) {
				if(bodegarelacionAux.getId()!=null && bodegarelacionAux.getId().equals(idBodegaRelacionSeleccionado)) {
					bodegarelacionTemp=bodegarelacionAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegarelacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaRelacionForeignKeyGenerico(Long idBodegaRelacionSeleccionado,JComboBox jComboBoxid_bodega_relacionIngredienteGenerico)throws Exception
	{
		try
		{
			Bodega  bodegarelacionTemp=null;

			for(Bodega bodegarelacionAux:bodegarelacionsForeignKey) {
				if(bodegarelacionAux.getId()!=null && bodegarelacionAux.getId().equals(idBodegaRelacionSeleccionado)) {
					bodegarelacionTemp=bodegarelacionAux;
					break;
				}
			}

			if(bodegarelacionTemp!=null) {
				jComboBoxid_bodega_relacionIngredienteGenerico.setSelectedItem(bodegarelacionTemp);
			} else {
				if(jComboBoxid_bodega_relacionIngredienteGenerico!=null && jComboBoxid_bodega_relacionIngredienteGenerico.getItemCount()>0) {
					jComboBoxid_bodega_relacionIngredienteGenerico.setSelectedIndex(0);
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

					if(this.ingrediente!=null) {
						this.ingrediente.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormIngrediente!=null) {
						this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoIngrediente.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormIngrediente!=null) {
						if(this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.getItemCount()>0) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoIngrediente!=null) {
						jComboBoxid_productoFK_IdProductoIngrediente.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoIngrediente!=null) {
							//jComboBoxid_productoFK_IdProductoIngrediente.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoIngrediente.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoIngrediente.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoIngredienteGenerico)throws Exception
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
				jComboBoxid_productoIngredienteGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoIngredienteGenerico!=null && jComboBoxid_productoIngredienteGenerico.getItemCount()>0) {
					jComboBoxid_productoIngredienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProductoRelacionForeignKey(Long idProductoRelacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Producto  productorelacionTemp=null;

			for(Producto productorelacionAux:productorelacionsForeignKey) {
				if(productorelacionAux.getId()!=null && productorelacionAux.getId().equals(idProductoRelacionSeleccionado)) {
					productorelacionTemp=productorelacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productorelacionTemp!=null) {

					if(this.ingrediente!=null) {
						this.ingrediente.setProductoRelacion(productorelacionTemp);
					}

					if(this.jInternalFrameDetalleFormIngrediente!=null) {
						this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.setSelectedItem(productorelacionTemp);
					}
				} else {
					//jComboBoxid_producto_relacionIngrediente.setSelectedItem(productorelacionTemp);
					if(this.jInternalFrameDetalleFormIngrediente!=null) {
						if(this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.getItemCount()>0) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProductoRelacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(productorelacionTemp!=null && jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente!=null) {
						jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.setSelectedItem(productorelacionTemp);
					} else {
						if(jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente!=null) {
							//jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.setSelectedItem(productorelacionTemp);
							if(jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.getItemCount()>0) {
								jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.setSelectedIndex(0);
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

	public String getActualProductoRelacionForeignKeyDescripcion(Long idProductoRelacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Producto  productorelacionTemp=null;

			for(Producto productorelacionAux:productorelacionsForeignKey) {
				if(productorelacionAux.getId()!=null && productorelacionAux.getId().equals(idProductoRelacionSeleccionado)) {
					productorelacionTemp=productorelacionAux;
					break;
				}
			}


			sDescripcion=ProductoConstantesFunciones.getProductoDescripcion(productorelacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoRelacionForeignKeyGenerico(Long idProductoRelacionSeleccionado,JComboBox jComboBoxid_producto_relacionIngredienteGenerico)throws Exception
	{
		try
		{
			Producto  productorelacionTemp=null;

			for(Producto productorelacionAux:productorelacionsForeignKey) {
				if(productorelacionAux.getId()!=null && productorelacionAux.getId().equals(idProductoRelacionSeleccionado)) {
					productorelacionTemp=productorelacionAux;
					break;
				}
			}

			if(productorelacionTemp!=null) {
				jComboBoxid_producto_relacionIngredienteGenerico.setSelectedItem(productorelacionTemp);
			} else {
				if(jComboBoxid_producto_relacionIngredienteGenerico!=null && jComboBoxid_producto_relacionIngredienteGenerico.getItemCount()>0) {
					jComboBoxid_producto_relacionIngredienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Ingrediente ingrediente,JComboBox jComboBoxid_empresaIngredienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaIngredienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaIngredienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ingrediente.setid_empresa(empresaAux.getId());
				ingrediente.setempresa_descripcion(IngredienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ingrediente.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Ingrediente ingrediente,JComboBox jComboBoxid_sucursalIngredienteGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalIngredienteGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalIngredienteGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				ingrediente.setid_sucursal(sucursalAux.getId());
				ingrediente.setsucursal_descripcion(IngredienteConstantesFunciones.getSucursalDescripcion(sucursalAux));
				ingrediente.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(Ingrediente ingrediente,JComboBox jComboBoxid_bodegaIngredienteGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaIngredienteGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaIngredienteGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				ingrediente.setid_bodega(bodegaAux.getId());
				ingrediente.setbodega_descripcion(IngredienteConstantesFunciones.getBodegaDescripcion(bodegaAux));
				ingrediente.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaRelacionForeignKey(Ingrediente ingrediente,JComboBox jComboBoxid_bodega_relacionIngredienteGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodega_relacionIngredienteGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodega_relacionIngredienteGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				ingrediente.setid_bodega_relacion(bodegaAux.getId());
				ingrediente.setbodegarelacion_descripcion(IngredienteConstantesFunciones.getBodegaRelacionDescripcion(bodegaAux));
				ingrediente.setBodegaRelacion(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(Ingrediente ingrediente,JComboBox jComboBoxid_productoIngredienteGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoIngredienteGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoIngredienteGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				ingrediente.setid_producto(productoAux.getId());
				ingrediente.setproducto_descripcion(IngredienteConstantesFunciones.getProductoDescripcion(productoAux));
				ingrediente.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoRelacionForeignKey(Ingrediente ingrediente,JComboBox jComboBoxid_producto_relacionIngredienteGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_producto_relacionIngredienteGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_producto_relacionIngredienteGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				ingrediente.setid_producto_relacion(productoAux.getId());
				ingrediente.setproductorelacion_descripcion(IngredienteConstantesFunciones.getProductoRelacionDescripcion(productoAux));
				ingrediente.setProductoRelacion(productoAux);			}
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

					if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormIngrediente!=null) { 
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormIngrediente!=null) { 
					}

					if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormIngrediente!=null) { 
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormIngrediente!=null) { 
					}

					if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormIngrediente!=null) { 
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormIngrediente!=null) { 
					}

					if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaIngrediente.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaIngrediente.addItem(bodega);
							}
						}

						if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegaRelacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormIngrediente!=null) { 
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.removeAllItems();

							for(Bodega bodegarelacion:this.bodegarelacionsForeignKey) {
								this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.addItem(bodegarelacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormIngrediente!=null) { 
					}

					if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodegaRelacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.removeAllItems();

							for(Bodega bodegarelacion:this.bodegarelacionsForeignKey) {
								this.jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.addItem(bodegarelacion);
							}
						}

						if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormIngrediente!=null) { 
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormIngrediente!=null) { 
					}

					if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoIngrediente.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoIngrediente.addItem(producto);
							}
						}

						if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductoRelacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormIngrediente!=null) { 
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.removeAllItems();

							for(Producto productorelacion:this.productorelacionsForeignKey) {
								this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.addItem(productorelacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormIngrediente!=null) { 
					}

					if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProductoRelacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.removeAllItems();

							for(Producto productorelacion:this.productorelacionsForeignKey) {
								this.jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.addItem(productorelacion);
							}
						}

						if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormIngrediente!=null) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormIngrediente!=null) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormIngrediente!=null) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormIngrediente!=null) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormIngrediente!=null) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormIngrediente!=null) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaIngrediente.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaIngrediente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameBodegaRelacionForeignKey(Bodega bodegarelacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormIngrediente!=null) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.setSelectedItem(bodegarelacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormIngrediente!=null) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.setSelectedItem(bodegarelacion);
						} else {
							this.jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormIngrediente!=null) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormIngrediente!=null) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoIngrediente.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoIngrediente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProductoRelacionForeignKey(Producto productorelacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormIngrediente!=null) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.setSelectedItem(productorelacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormIngrediente!=null) {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.setSelectedItem(productorelacion);
						} else {
							this.jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesIngrediente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			IngredienteConstantesFunciones.refrescarForeignKeysDescripcionesIngrediente(this.ingredienteLogic.getIngredientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			IngredienteConstantesFunciones.refrescarForeignKeysDescripcionesIngrediente(this.ingredientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//ingredienteLogic.setIngredientes(this.ingredientes);
			ingredienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public IngredienteParameterReturnGeneral getIngredienteParameterGeneral() {
		return this.ingredienteParameterGeneral;
	}
	
	public void setIngredienteParameterGeneral(IngredienteParameterReturnGeneral ingredienteParameterGeneral) {
		this.ingredienteParameterGeneral = ingredienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoIngrediente() {
		return isPermisoTodoIngrediente;
	}

	public void setIsPermisoTodoIngrediente(Boolean isPermisoTodoIngrediente) {
		this.isPermisoTodoIngrediente = isPermisoTodoIngrediente;
	}

	public Boolean getIsPermisoNuevoIngrediente() {
		return isPermisoNuevoIngrediente;
	}

	public void setIsPermisoNuevoIngrediente(Boolean isPermisoNuevoIngrediente) {
		this.isPermisoNuevoIngrediente = isPermisoNuevoIngrediente;
	}

	public Boolean getIsPermisoActualizarIngrediente() {
		return isPermisoActualizarIngrediente;
	}

	public void setIsPermisoActualizarIngrediente(Boolean isPermisoActualizarIngrediente) {
		this.isPermisoActualizarIngrediente = isPermisoActualizarIngrediente;
	}

	public Boolean getIsPermisoEliminarIngrediente() {
		return isPermisoEliminarIngrediente;
	}

	public void setIsPermisoEliminarIngrediente(Boolean isPermisoEliminarIngrediente) {
		this.isPermisoEliminarIngrediente = isPermisoEliminarIngrediente;
	}

	public Boolean getIsPermisoGuardarCambiosIngrediente() {
		return isPermisoGuardarCambiosIngrediente;
	}

	public void setIsPermisoGuardarCambiosIngrediente(Boolean isPermisoGuardarCambiosIngrediente) {
		this.isPermisoGuardarCambiosIngrediente = isPermisoGuardarCambiosIngrediente;
	}
	
	public Boolean getIsPermisoConsultaIngrediente() {
		return isPermisoConsultaIngrediente;
	}

	public void setIsPermisoConsultaIngrediente(Boolean isPermisoConsultaIngrediente) {
		this.isPermisoConsultaIngrediente = isPermisoConsultaIngrediente;
	}

	public Boolean getIsPermisoBusquedaIngrediente() {
		return isPermisoBusquedaIngrediente;
	}

	public void setIsPermisoBusquedaIngrediente(Boolean isPermisoBusquedaIngrediente) {
		this.isPermisoBusquedaIngrediente = isPermisoBusquedaIngrediente;
	}

	public Boolean getIsPermisoReporteIngrediente() {
		return isPermisoReporteIngrediente;
	}

	public void setIsPermisoReporteIngrediente(Boolean isPermisoReporteIngrediente) {
		this.isPermisoReporteIngrediente = isPermisoReporteIngrediente;
	}
	
	public Boolean getIsPermisoPaginacionMedioIngrediente() {
		return isPermisoPaginacionMedioIngrediente;
	}

	public void setIsPermisoPaginacionMedioIngrediente(Boolean isPermisoPaginacionMedioIngrediente) {
		this.isPermisoPaginacionMedioIngrediente = isPermisoPaginacionMedioIngrediente;
	}
	
	public Boolean getIsPermisoPaginacionTodoIngrediente() {
		return isPermisoPaginacionTodoIngrediente;
	}

	public void setIsPermisoPaginacionTodoIngrediente(Boolean isPermisoPaginacionTodoIngrediente) {
		this.isPermisoPaginacionTodoIngrediente = isPermisoPaginacionTodoIngrediente;
	}
	
	public Boolean getIsPermisoPaginacionAltoIngrediente() {
		return isPermisoPaginacionAltoIngrediente;
	}

	public void setIsPermisoPaginacionAltoIngrediente(Boolean isPermisoPaginacionAltoIngrediente) {
		this.isPermisoPaginacionAltoIngrediente = isPermisoPaginacionAltoIngrediente;
	}
	
	public Boolean getIsPermisoCopiarIngrediente() {
		return isPermisoCopiarIngrediente;
	}

	public void setIsPermisoCopiarIngrediente(Boolean isPermisoCopiarIngrediente) {
		this.isPermisoCopiarIngrediente = isPermisoCopiarIngrediente;
	}
	
	public Boolean getIsPermisoVerFormIngrediente() {
		return isPermisoVerFormIngrediente;
	}

	public void setIsPermisoVerFormIngrediente(Boolean isPermisoVerFormIngrediente) {
		this.isPermisoVerFormIngrediente = isPermisoVerFormIngrediente;
	}
	
	public Boolean getIsPermisoDuplicarIngrediente() {
		return isPermisoDuplicarIngrediente;
	}

	public void setIsPermisoDuplicarIngrediente(Boolean isPermisoDuplicarIngrediente) {
		this.isPermisoDuplicarIngrediente = isPermisoDuplicarIngrediente;
	}
	
	public Boolean getIsPermisoOrdenIngrediente() {
		return isPermisoOrdenIngrediente;
	}

	public void setIsPermisoOrdenIngrediente(Boolean isPermisoOrdenIngrediente) {
		this.isPermisoOrdenIngrediente = isPermisoOrdenIngrediente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoIngrediente() {
		return isVisibilidadCeldaNuevoIngrediente;
	}

	public void setIsVisibilidadCeldaNuevoIngrediente(Boolean isVisibilidadCeldaNuevoIngrediente) {
		this.isVisibilidadCeldaNuevoIngrediente = isVisibilidadCeldaNuevoIngrediente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarIngrediente() {
		return isVisibilidadCeldaDuplicarIngrediente;
	}

	public void setIsVisibilidadCeldaDuplicarIngrediente(Boolean isVisibilidadCeldaDuplicarIngrediente) {
		this.isVisibilidadCeldaDuplicarIngrediente = isVisibilidadCeldaDuplicarIngrediente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarIngrediente() {
		return isVisibilidadCeldaCopiarIngrediente;
	}

	public void setIsVisibilidadCeldaCopiarIngrediente(Boolean isVisibilidadCeldaCopiarIngrediente) {
		this.isVisibilidadCeldaCopiarIngrediente = isVisibilidadCeldaCopiarIngrediente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormIngrediente() {
		return isVisibilidadCeldaVerFormIngrediente;
	}

	public void setIsVisibilidadCeldaVerFormIngrediente(Boolean isVisibilidadCeldaVerFormIngrediente) {
		this.isVisibilidadCeldaVerFormIngrediente = isVisibilidadCeldaVerFormIngrediente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenIngrediente() {
		return isVisibilidadCeldaOrdenIngrediente;
	}

	public void setIsVisibilidadCeldaOrdenIngrediente(Boolean isVisibilidadCeldaOrdenIngrediente) {
		this.isVisibilidadCeldaOrdenIngrediente = isVisibilidadCeldaOrdenIngrediente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesIngrediente() {
		return isVisibilidadCeldaNuevoRelacionesIngrediente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesIngrediente(Boolean isVisibilidadCeldaNuevoRelacionesIngrediente) {
		this.isVisibilidadCeldaNuevoRelacionesIngrediente = isVisibilidadCeldaNuevoRelacionesIngrediente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarIngrediente() {
		return isVisibilidadCeldaModificarIngrediente;
	}

	public void setIsVisibilidadCeldaModificarIngrediente(Boolean isVisibilidadCeldaModificarIngrediente) {
		this.isVisibilidadCeldaModificarIngrediente = isVisibilidadCeldaModificarIngrediente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarIngrediente() {
		return isVisibilidadCeldaActualizarIngrediente;
	}

	public void setIsVisibilidadCeldaActualizarIngrediente(Boolean isVisibilidadCeldaActualizarIngrediente) {
		this.isVisibilidadCeldaActualizarIngrediente = isVisibilidadCeldaActualizarIngrediente;
	}

	public Boolean getIsVisibilidadCeldaEliminarIngrediente() {
		return isVisibilidadCeldaEliminarIngrediente;
	}

	public void setIsVisibilidadCeldaEliminarIngrediente(Boolean isVisibilidadCeldaEliminarIngrediente) {
		this.isVisibilidadCeldaEliminarIngrediente = isVisibilidadCeldaEliminarIngrediente;
	}

	public Boolean getIsVisibilidadCeldaCancelarIngrediente() {
		return isVisibilidadCeldaCancelarIngrediente;
	}

	public void setIsVisibilidadCeldaCancelarIngrediente(Boolean isVisibilidadCeldaCancelarIngrediente) {
		this.isVisibilidadCeldaCancelarIngrediente = isVisibilidadCeldaCancelarIngrediente;
	}

	public Boolean getIsVisibilidadCeldaGuardarIngrediente() {
		return isVisibilidadCeldaGuardarIngrediente;
	}

	public void setIsVisibilidadCeldaGuardarIngrediente(Boolean isVisibilidadCeldaGuardarIngrediente) {
		this.isVisibilidadCeldaGuardarIngrediente = isVisibilidadCeldaGuardarIngrediente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosIngrediente() {
		return isVisibilidadCeldaGuardarCambiosIngrediente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosIngrediente(Boolean isVisibilidadCeldaGuardarCambiosIngrediente) {
		this.isVisibilidadCeldaGuardarCambiosIngrediente = isVisibilidadCeldaGuardarCambiosIngrediente;
	}
		
	public IngredienteSessionBean getingredienteSessionBean() {
		return this.ingredienteSessionBean;
	}
	
	public void setingredienteSessionBean(IngredienteSessionBean ingredienteSessionBean) {
		this.ingredienteSessionBean=ingredienteSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdBodegaRelacion() {
		return this.isVisibilidadFK_IdBodegaRelacion;
	}

	public void setisVisibilidadFK_IdBodegaRelacion(Boolean isVisibilidadFK_IdBodegaRelacion) {
		this.isVisibilidadFK_IdBodegaRelacion=isVisibilidadFK_IdBodegaRelacion;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdProductoRelacion() {
		return this.isVisibilidadFK_IdProductoRelacion;
	}

	public void setisVisibilidadFK_IdProductoRelacion(Boolean isVisibilidadFK_IdProductoRelacion) {
		this.isVisibilidadFK_IdProductoRelacion=isVisibilidadFK_IdProductoRelacion;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysIngrediente(Ingrediente ingrediente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ingrediente,null);
				this.setActualParaGuardarSucursalForeignKey(ingrediente,null);
				this.setActualParaGuardarBodegaForeignKey(ingrediente,null);
				this.setActualParaGuardarBodegaRelacionForeignKey(ingrediente,null);
				this.setActualParaGuardarProductoForeignKey(ingrediente,null);
				this.setActualParaGuardarProductoRelacionForeignKey(ingrediente,null);
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
	
	public void bugActualizarReferenciaActual(Ingrediente ingrediente,Ingrediente ingredienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalIngrediente(ingrediente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ingredienteAux.setId(ingrediente.getId());
		ingredienteAux.setVersionRow(ingrediente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessIngrediente();
		
			int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(IngredienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = ingredienteValidator.getInvalidValues(this.ingrediente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			ingredienteLogic.setDatosCliente(datosCliente);
			ingredienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				ingredienteAux=new  Ingrediente();
				
				ingredienteAux.setIsNew(true);
				ingredienteAux.setIsChanged(true);
				
				ingredienteAux.setIngredienteOriginal(this.ingrediente);
				
				ingredienteAux.setId(this.ingrediente.getId());	
				ingredienteAux.setVersionRow(this.ingrediente.getVersionRow());	
				ingredienteAux.setid_empresa(this.ingrediente.getid_empresa());	
				ingredienteAux.setid_sucursal(this.ingrediente.getid_sucursal());	
				ingredienteAux.setid_bodega(this.ingrediente.getid_bodega());	
				ingredienteAux.setid_bodega_relacion(this.ingrediente.getid_bodega_relacion());	
				ingredienteAux.setid_producto(this.ingrediente.getid_producto());	
				ingredienteAux.setid_producto_relacion(this.ingrediente.getid_producto_relacion());	
				ingredienteAux.setcantidad(this.ingrediente.getcantidad());	
				ingredienteAux.setprecio(this.ingrediente.getprecio());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ingredienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ingredienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(ingredienteAux,ingredienteLogic.getIngredientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ingredienteAux,ingredientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.ingredienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ingredienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredienteLogic.saveIngredientes();//WithConnection
						//ingredienteLogic.getSetVersionRowIngredientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ingrediente,ingredienteAux);
					
					this.refrescarForeignKeysDescripcionesIngrediente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.ingredienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								ingredienteLogic.saveIngredienteRelaciones(ingredienteAux);//WithConnection
								//ingredienteLogic.getSetVersionRowIngredientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.ingrediente,ingredienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.ingredienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.ingredienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(ingredienteAux,ingredienteLogic.getIngredientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(ingredienteAux,ingredientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.ingrediente,ingredienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				ingredienteAux=new  Ingrediente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.ingredienteSessionBean.getEsGuardarRelacionado() 
					|| (this.ingredienteSessionBean.getEsGuardarRelacionado() && this.ingrediente.getId()>=0)) {
						
					ingredienteAux.setIsNew(false);
				}
				
				ingredienteAux.setIsDeleted(false);
			
				ingredienteAux.setId(this.ingrediente.getId());	
				ingredienteAux.setVersionRow(this.ingrediente.getVersionRow());	
				ingredienteAux.setid_empresa(this.ingrediente.getid_empresa());	
				ingredienteAux.setid_sucursal(this.ingrediente.getid_sucursal());	
				ingredienteAux.setid_bodega(this.ingrediente.getid_bodega());	
				ingredienteAux.setid_bodega_relacion(this.ingrediente.getid_bodega_relacion());	
				ingredienteAux.setid_producto(this.ingrediente.getid_producto());	
				ingredienteAux.setid_producto_relacion(this.ingrediente.getid_producto_relacion());	
				ingredienteAux.setcantidad(this.ingrediente.getcantidad());	
				ingredienteAux.setprecio(this.ingrediente.getprecio());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ingredienteAux,ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ingredienteAux,ingredientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.ingredienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ingredienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredienteLogic.saveIngredientes();//WithConnection
						//ingredienteLogic.getSetVersionRowIngredientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ingrediente,ingredienteAux);
					
					this.refrescarForeignKeysDescripcionesIngrediente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.ingredienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								ingredienteLogic.saveIngredienteRelaciones(ingredienteAux);//WithConnection
								//ingredienteLogic.getSetVersionRowIngredientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.ingrediente,ingredienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.ingredienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.ingredienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(ingredienteAux,ingredienteLogic.getIngredientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(ingredienteAux,ingredientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.ingrediente,ingredienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				ingredienteAux=new  Ingrediente();
				
				ingredienteAux.setIsNew(false);
				ingredienteAux.setIsChanged(false);
				
				ingredienteAux.setIsDeleted(true);
				
				ingredienteAux.setId(this.ingrediente.getId());	
				ingredienteAux.setVersionRow(this.ingrediente.getVersionRow());	
				ingredienteAux.setid_empresa(this.ingrediente.getid_empresa());	
				ingredienteAux.setid_sucursal(this.ingrediente.getid_sucursal());	
				ingredienteAux.setid_bodega(this.ingrediente.getid_bodega());	
				ingredienteAux.setid_bodega_relacion(this.ingrediente.getid_bodega_relacion());	
				ingredienteAux.setid_producto(this.ingrediente.getid_producto());	
				ingredienteAux.setid_producto_relacion(this.ingrediente.getid_producto_relacion());	
				ingredienteAux.setcantidad(this.ingrediente.getcantidad());	
				ingredienteAux.setprecio(this.ingrediente.getprecio());	
				
				if(this.ingredienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.ingredienteAux.getId()>=0) {	
						this.ingredientesEliminados.add(ingredienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(ingredienteAux,ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ingredienteAux,ingredientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.ingredienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ingredienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredienteLogic.saveIngredientes();//WithConnection
						//ingredienteLogic.getSetVersionRowIngredientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.ingredienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								ingredienteLogic.saveIngredienteRelaciones(ingredienteAux);//WithConnection
								//ingredienteLogic.getSetVersionRowIngredientes();//WithConnection
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
							if(this.ingredienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.ingredienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(ingredienteAux,ingredienteLogic.getIngredientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(ingredienteAux,ingredientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.getIngredientes().addAll(this.ingredientesEliminados);
					
					ingredienteLogic.saveIngredientes();//WithConnection
					//ingredienteLogic.getSetVersionRowIngredientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesIngrediente();
				
				this.ingredientesEliminados= new ArrayList<Ingrediente>();		
			}
			
			if(this.ingredienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Ingrediente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Ingrediente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.ingrediente=ingredienteAux;
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
      		//this.finishProcessIngrediente();
      	}
		
	}	
	
	public void actualizarRelaciones(Ingrediente ingredienteLocal) throws Exception {
		
		if(this.ingredienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Ingrediente ingredienteLocal) throws Exception {	
		if(this.ingredienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ingredienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				ingredienteLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				ingredienteLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegarelacionBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegarelacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegarelacionBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegarelacionBeanSwingJInternalFrameLocal.actualizarLista(bodegarelacionBeanSwingJInternalFrameLocal.bodega,this.bodegarelacionsForeignKey);

				bodegarelacionBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegarelacionBeanSwingJInternalFrameLocal.bodega);

				ingredienteLocal.setBodegaRelacion(bodegarelacionBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodegaRelacion();
				this.cargarCombosFrameBodegaRelacionsForeignKey("Formulario");
				this.setActualBodegaRelacionForeignKey(bodegarelacionBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				ingredienteLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productorelacionBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productorelacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productorelacionBeanSwingJInternalFrameLocal.getproducto(),true);
				productorelacionBeanSwingJInternalFrameLocal.actualizarLista(productorelacionBeanSwingJInternalFrameLocal.producto,this.productorelacionsForeignKey);

				productorelacionBeanSwingJInternalFrameLocal.actualizarRelaciones(productorelacionBeanSwingJInternalFrameLocal.producto);

				ingredienteLocal.setProductoRelacion(productorelacionBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProductoRelacion();
				this.cargarCombosFrameProductoRelacionsForeignKey("Formulario");
				this.setActualProductoRelacionForeignKey(productorelacionBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarIngredienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ingredienteValidator.getInvalidValues(this.ingrediente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Ingrediente ingrediente,List<Ingrediente> ingredientes) throws Exception {
		try	{		
			IngredienteConstantesFunciones.actualizarLista(ingrediente,ingredientes,this.ingredienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Ingrediente ingrediente,List<Ingrediente> ingredientes) throws Exception {
		try	{			
			IngredienteConstantesFunciones.actualizarSelectedLista(ingrediente,ingredientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Ingrediente> ingredientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ingredientesLocal=this.ingredienteLogic.getIngredientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ingredientesLocal=this.ingredientes;
			}
			//ARCHITECTURE
		
			for(Ingrediente ingredienteLocal:ingredientesLocal) {
				if(this.permiteMantenimiento(ingredienteLocal) && ingredienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+IngredienteConstantesFunciones.getIngredienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(IngredienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngrediente.jLabelid_empresaIngrediente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngredienteConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngrediente.jLabelid_sucursalIngrediente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngredienteConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngrediente.jLabelid_bodegaIngrediente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngredienteConstantesFunciones.IDBODEGARELACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngrediente.jLabelid_bodega_relacionIngrediente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngredienteConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngrediente.jLabelid_productoIngrediente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngredienteConstantesFunciones.IDPRODUCTORELACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngrediente.jLabelid_producto_relacionIngrediente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngredienteConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngrediente.jLabelcantidadIngrediente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngredienteConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngrediente.jLabelprecioIngrediente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngrediente.jLabelid_empresaIngrediente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngrediente.jLabelid_sucursalIngrediente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngrediente.jLabelid_bodegaIngrediente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngrediente.jLabelid_bodega_relacionIngrediente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngrediente.jLabelid_productoIngrediente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngrediente.jLabelid_producto_relacionIngrediente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngrediente.jLabelcantidadIngrediente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngrediente.jLabelprecioIngrediente,"");
		
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
		this.iIdNuevoIngrediente--;	
		
		
		this.ingredienteAux=new Ingrediente();
		
		this.ingredienteAux.setId(this.iIdNuevoIngrediente);
		this.ingredienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ingredienteLogic.getIngredientes().add(this.ingredienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ingredientes.add(this.ingredienteAux);
		}
		//ARCHITECTURE
		
		this.ingrediente=this.ingredienteAux;
		
		if(IngredienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioIngrediente(this.ingrediente);
			this.setVariablesObjetoActualToFormularioForeignKeyIngrediente(this.ingrediente);
		}
				
		//this.setDefaultControlesIngrediente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyIngrediente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyIngrediente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyIngrediente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualIngrediente(this.ingredienteBean,this.ingrediente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(IngredienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.ingredienteSessionBean.getConGuardarRelaciones()) {
			classes=IngredienteConstantesFunciones.getClassesRelationshipsOfIngrediente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.ingredienteReturnGeneral=ingredienteLogic.procesarEventosIngredientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ingredienteLogic.getIngredientes(),this.ingrediente,this.ingredienteParameterGeneral,this.isEsNuevoIngrediente,classes);//this.ingredienteLogic.getIngrediente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanIngrediente(this.ingredienteReturnGeneral,this.ingredienteBean,false);
		
		if(this.ingredienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyIngrediente(this.ingredienteReturnGeneral.getIngrediente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioIngrediente(this.ingredienteReturnGeneral.getIngrediente());
		}
		
		if(this.ingredienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioIngrediente(this.ingredienteReturnGeneral.getIngrediente(),classes);//this.ingredienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyIngrediente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyIngrediente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			IngredienteBeanSwingJInternalFrameAdditional.RecargarFormIngrediente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingIngrediente(false);
						
			if(ingredienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(IngredienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIngrediente();
			}
			
			this.actualizarVisualTableDatosIngrediente();
			
			this.jTableDatosIngrediente.setRowSelectionInterval(this.getIndiceNuevoIngrediente(), this.getIndiceNuevoIngrediente());
			
			this.seleccionarFilaTablaIngredienteActual();
						
			this.actualizarEstadoCeldasBotonesIngrediente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesIngrediente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormIngrediente.jTextFieldcantidadIngrediente.setEnabled(isHabilitar && this.ingredienteConstantesFunciones.activarcantidadIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jTextFieldprecioIngrediente.setEnabled(isHabilitar && this.ingredienteConstantesFunciones.activarprecioIngrediente);	
		//
		this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.setEnabled(isHabilitar && this.ingredienteConstantesFunciones.activarid_empresaIngrediente);//
		this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.setEnabled(isHabilitar && this.ingredienteConstantesFunciones.activarid_sucursalIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.setEnabled(isHabilitar && this.ingredienteConstantesFunciones.activarid_bodegaIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.setEnabled(isHabilitar && this.ingredienteConstantesFunciones.activarid_bodega_relacionIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.setEnabled(isHabilitar && this.ingredienteConstantesFunciones.activarid_productoIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.setEnabled(isHabilitar && this.ingredienteConstantesFunciones.activarid_producto_relacionIngrediente);
	};
	
	public void setDefaultControlesIngrediente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoIngrediente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ingredienteSessionBean.setConGuardarRelaciones(true);			
			this.ingredienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormIngrediente.jTabbedPaneRelacionesIngrediente.setVisible(true);
			
					
		} else {
			//this.ingredienteSessionBean.setConGuardarRelaciones(false);			
			this.ingredienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormIngrediente.jTabbedPaneRelacionesIngrediente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoIngrediente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ingrediente ingredienteAux:this.ingredienteLogic.getIngredientes()) {
				if(ingredienteAux.getId().equals(this.iIdNuevoIngrediente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ingrediente ingredienteAux:this.ingredientes) {
				if(ingredienteAux.getId().equals(this.iIdNuevoIngrediente)) {
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
	
	public int getIndiceActualIngrediente(Ingrediente ingrediente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ingrediente ingredienteAux:this.ingredienteLogic.getIngredientes()) {
				if(ingredienteAux.getId().equals(ingrediente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ingrediente ingredienteAux:this.ingredientes) {
				if(ingredienteAux.getId().equals(ingrediente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalIngrediente(Ingrediente ingredienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ingrediente ingredienteAux:this.ingredienteLogic.getIngredientes()) {
				if(ingredienteAux.getIngredienteOriginal().getId().equals(ingredienteOriginal.getId())) {
					existe=true;
					ingredienteOriginal.setId(ingredienteAux.getId());
					ingredienteOriginal.setVersionRow(ingredienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ingrediente ingredienteAux:this.ingredientes) {
				if(ingredienteAux.getIngredienteOriginal().getId().equals(ingredienteOriginal.getId())) {
					existe=true;
					ingredienteOriginal.setId(ingredienteAux.getId());
					ingredienteOriginal.setVersionRow(ingredienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosIngrediente(Boolean esParaCancelar) throws Exception {
		ingredientesAux=new ArrayList<Ingrediente>();
		ingredienteAux=new Ingrediente();
		
		if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Ingrediente ingredienteAux:this.ingredienteLogic.getIngredientes()) {
					if(ingredienteAux.getId()<0) {
						ingredientesAux.add(ingredienteAux);
					}		
				}
				this.iIdNuevoIngrediente=0L;
				this.ingredienteLogic.getIngredientes().removeAll(ingredientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ingrediente ingredienteAux:this.ingredientes) {
					if(ingredienteAux.getId()<0) {
						ingredientesAux.add(ingredienteAux);
					}		
				}
				this.iIdNuevoIngrediente=0L;
				this.ingredientes.removeAll(ingredientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoIngrediente 
					&& this.ingredienteLogic.getIngredientes().size()>0
					) {
					ingredienteAux=this.ingredienteLogic.getIngredientes().get(this.ingredienteLogic.getIngredientes().size() - 1);
				
					if(ingredienteAux.getId()<0) {
						this.ingredienteLogic.getIngredientes().remove(ingredienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoIngrediente && this.ingredientes.size()>0) {
					ingredienteAux=this.ingredientes.get(this.ingredientes.size() - 1);
				
					if(ingredienteAux.getId()<0) {
						this.ingredientes.remove(ingredienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoIngrediente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ingrediente.getId()<0) {
				this.ingredienteLogic.getIngredientes().remove(this.ingrediente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ingrediente.getId()<0) {
				this.ingredientes.remove(this.ingrediente);
			}
		}			
	}
	
	public void setEstadosInicialesIngrediente(List<Ingrediente> ingredientesAux) throws Exception {
		IngredienteConstantesFunciones.setEstadosInicialesIngrediente(ingredientesAux);
	}
	
	public void setEstadosInicialesIngrediente(Ingrediente ingredienteAux) throws Exception {
		IngredienteConstantesFunciones.setEstadosInicialesIngrediente(ingredienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarIngredienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesIngrediente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarIngredienteActual()) {
				if(!this.isEsNuevoIngrediente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesIngrediente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoIngrediente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarIngredienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ingrediente ?", "MANTENIMIENTO DE Ingrediente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesIngrediente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Ingrediente ingrediente) throws Exception {
		IngredienteConstantesFunciones.seleccionarAsignar(this.ingrediente,ingrediente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarIngrediente=this.isPermisoActualizarOriginalIngrediente;
			
			
			this.seleccionarAsignar(ingrediente);
			
			

			idProductoActual=ingrediente.getid_producto();
			this.seleccionarProductoActual();

			idProductoRelacionActual=ingrediente.getid_producto_relacion();
			this.seleccionarProductoRelacionActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			IngredienteConstantesFunciones.quitarEspaciosIngrediente(this.ingrediente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesIngrediente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ingredienteSessionBean.setsFuncionBusquedaRapida(this.ingredienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
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
	public void seleccionarProductoRelacionActual() throws Exception {
		try	{
			Producto productorelacionAux=new Producto();

			if(this.idProductoRelacionActual != null && this.idProductoRelacionActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productorelacionLogic.getEntityWithConnection(this.idProductoRelacionActual);
					productorelacionAux= productorelacionLogic.getProducto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				productorelacionsForeignKey=new ArrayList<Producto>();
				productorelacionsForeignKey.add(productorelacionAux);
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
			if(this.isEsNuevoIngrediente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosIngrediente(esParaCancelar);				
				this.cancelarNuevoIngrediente(esParaCancelar);								
			}
			
			this.ingrediente=new Ingrediente();
			
			this.inicializarIngrediente();
			
			this.actualizarEstadoCeldasBotonesIngrediente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarIngrediente() throws Exception {
		try {
			IngredienteConstantesFunciones.inicializarIngrediente(this.ingrediente);
			
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
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ingredienteLogic.getIngredientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteIngredientes(String sAccionBusqueda,List<Ingrediente> ingredientesParaReportes) throws Exception {
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
					sPathReporteFinal="Ingrediente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="IngredienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("IngredienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Ingrediente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ingredientes");		
		parameters.put("busquedapor", IngredienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceIngrediente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			IngredienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			IngredienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceIngrediente=new JRBeanArrayDataSource(IngredienteJInternalFrame.TraerIngredienteBeans(ingredientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceIngrediente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+IngredienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+IngredienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(IngredienteBean.TraerIngredienteBeans(ingredientesParaReportes).toArray()));
							
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
				this.generarExcelReporteIngredientes(sAccionBusqueda,sTipoArchivoReporte,ingredientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalIngredientes(sAccionBusqueda,sTipoArchivoReporte,ingredientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoIngredienteActionPerformed(null);
					//this.generarExcelReporteIngredientes(sAccionBusqueda,sTipoArchivoReporte,ingredientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalIngredientes(sAccionBusqueda,sTipoArchivoReporte,ingredientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesIngredientes(sAccionBusqueda,sTipoArchivoReporte,ingredientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesIngredientes(sAccionBusqueda,sTipoArchivoReporte,ingredientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteIngredientes(String sAccionBusqueda,String sTipoArchivoReporte,List<Ingrediente> ingredientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingrediente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Ingredientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderIngrediente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Ingrediente ingrediente : ingredientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			IngredienteConstantesFunciones.generarExcelReporteDataIngrediente("NORMAL",row,workbook,ingrediente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingrediente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderIngrediente(String sTipo,Row row,Workbook workbook) {
		
		IngredienteConstantesFunciones.generarExcelReporteHeaderIngrediente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalIngredientes(String sAccionBusqueda,String sTipoArchivoReporte,List<Ingrediente> ingredientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingrediente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Ingredientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Ingrediente ingrediente : ingredientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(IngredienteConstantesFunciones.getIngredienteDescripcion(ingrediente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngredienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingrediente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngredienteConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingrediente.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngredienteConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingrediente.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngredienteConstantesFunciones.LABEL_IDBODEGARELACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDBODEGARELACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingrediente.getbodegarelacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngredienteConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingrediente.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingrediente.getproductorelacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngredienteConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngredienteConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingrediente.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngredienteConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngredienteConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingrediente.getprecio());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingrediente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesIngredientes(String sAccionBusqueda,String sTipoArchivoReporte,List<Ingrediente> ingredientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Ingrediente> ingredientesRespaldo=null;
		
		classes=IngredienteConstantesFunciones.getClassesRelationshipsOfIngrediente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ingredienteLogic.setDatosCliente(this.datosCliente);
		this.ingredienteLogic.setDatosDeep(this.datosDeep);
		this.ingredienteLogic.setIsConDeep(true);
		
		ingredientesRespaldo=this.ingredienteLogic.getIngredientes();
		
		this.ingredienteLogic.setIngredientes(ingredientesParaReportes);	
		this.ingredienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ingredientesParaReportes=this.ingredienteLogic.getIngredientes();
		this.ingredienteLogic.setIngredientes(ingredientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingrediente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Ingredientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderIngrediente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Ingrediente ingrediente : ingredientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderIngrediente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			IngredienteConstantesFunciones.generarExcelReporteDataIngrediente("NORMAL",row,workbook,ingrediente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(IngredienteConstantesFunciones.getIngredienteDescripcion(ingrediente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingrediente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoIngrediente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIngrediente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessIngrediente() throws Exception {		
		this.startProcessIngrediente(true);
	}
	
	public void startProcessIngrediente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasIngrediente ,this.jPanelParametrosReportesIngrediente, this.jScrollPanelDatosIngrediente,this.jPanelPaginacionIngrediente, this.jScrollPanelDatosEdicionIngrediente, this.jPanelAccionesIngrediente,this.jPanelAccionesFormularioIngrediente,this.jmenuBarIngrediente,this.jmenuBarDetalleIngrediente,this.jTtoolBarIngrediente,this.jTtoolBarDetalleIngrediente);		
		
		final JTabbedPane jTabbedPaneBusquedasIngrediente=this.jTabbedPaneBusquedasIngrediente; 
		
		final JPanel jPanelParametrosReportesIngrediente=this.jPanelParametrosReportesIngrediente;
		//final JScrollPane jScrollPanelDatosIngrediente=this.jScrollPanelDatosIngrediente;
		final JTable jTableDatosIngrediente=this.jTableDatosIngrediente;		
		final JPanel jPanelPaginacionIngrediente=this.jPanelPaginacionIngrediente;
		//final JScrollPane jScrollPanelDatosEdicionIngrediente=this.jScrollPanelDatosEdicionIngrediente;
		final JPanel jPanelAccionesIngrediente=this.jPanelAccionesIngrediente;
		
		JPanel jPanelCamposAuxiliarIngrediente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarIngrediente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) {
			jPanelCamposAuxiliarIngrediente=this.jInternalFrameDetalleFormIngrediente.jPanelCamposIngrediente;
			jPanelAccionesFormularioAuxiliarIngrediente=this.jInternalFrameDetalleFormIngrediente.jPanelAccionesFormularioIngrediente;
		}
		
		final JPanel jPanelCamposIngrediente=jPanelCamposAuxiliarIngrediente;
		final JPanel jPanelAccionesFormularioIngrediente=jPanelAccionesFormularioAuxiliarIngrediente;
		
		
		final JMenuBar jmenuBarIngrediente=this.jmenuBarIngrediente;
		final JToolBar jTtoolBarIngrediente=this.jTtoolBarIngrediente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarIngrediente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarIngrediente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) {
			jmenuBarDetalleAuxiliarIngrediente=this.jInternalFrameDetalleFormIngrediente.jmenuBarDetalleIngrediente;
			jTtoolBarDetalleAuxiliarIngrediente=this.jInternalFrameDetalleFormIngrediente.jTtoolBarDetalleIngrediente;
		}
		
		final JMenuBar jmenuBarDetalleIngrediente=jmenuBarDetalleAuxiliarIngrediente;
		final JToolBar jTtoolBarDetalleIngrediente=jTtoolBarDetalleAuxiliarIngrediente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasIngrediente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesIngrediente;
			processRunnable.jTableDatos=jTableDatosIngrediente;
			processRunnable.jPanelCampos=jPanelCamposIngrediente;
			processRunnable.jPanelPaginacion=jPanelPaginacionIngrediente;
			processRunnable.jPanelAcciones=jPanelAccionesIngrediente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioIngrediente;
			
			
			processRunnable.jmenuBar=jmenuBarIngrediente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleIngrediente;
			processRunnable.jTtoolBar=jTtoolBarIngrediente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleIngrediente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasIngrediente ,jPanelParametrosReportesIngrediente,jTableDatosIngrediente, /*jScrollPanelDatosIngrediente,*/jPanelCamposIngrediente,jPanelPaginacionIngrediente, /*jScrollPanelDatosEdicionIngrediente,*/ jPanelAccionesIngrediente,jPanelAccionesFormularioIngrediente,jmenuBarIngrediente,jmenuBarDetalleIngrediente,jTtoolBarIngrediente,jTtoolBarDetalleIngrediente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasIngrediente ,jPanelParametrosReportesIngrediente, jScrollPanelDatosIngrediente,jPanelPaginacionIngrediente, jScrollPanelDatosEdicionIngrediente, jPanelAccionesIngrediente,jPanelAccionesFormularioIngrediente,jmenuBarIngrediente,jmenuBarDetalleIngrediente,jTtoolBarIngrediente,jTtoolBarDetalleIngrediente);
						
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
	
	public void finishProcessIngrediente() {// throws Exception 
		this.finishProcessIngrediente(true);
	}
	
	public void finishProcessIngrediente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasIngrediente ,this.jPanelParametrosReportesIngrediente, this.jScrollPanelDatosIngrediente,this.jPanelPaginacionIngrediente, this.jScrollPanelDatosEdicionIngrediente, this.jPanelAccionesIngrediente,this.jPanelAccionesFormularioIngrediente,this.jmenuBarIngrediente,this.jmenuBarDetalleIngrediente,this.jTtoolBarIngrediente,this.jTtoolBarDetalleIngrediente);		
		
		final JTabbedPane jTabbedPaneBusquedasIngrediente=this.jTabbedPaneBusquedasIngrediente; 
		
		final JPanel jPanelParametrosReportesIngrediente=this.jPanelParametrosReportesIngrediente;
		//final JScrollPane jScrollPanelDatosIngrediente=this.jScrollPanelDatosIngrediente;
		final JTable jTableDatosIngrediente=this.jTableDatosIngrediente;		
		final JPanel jPanelPaginacionIngrediente=this.jPanelPaginacionIngrediente;
		//final JScrollPane jScrollPanelDatosEdicionIngrediente=this.jScrollPanelDatosEdicionIngrediente;
		final JPanel jPanelAccionesIngrediente=this.jPanelAccionesIngrediente;
		
		JPanel jPanelCamposAuxiliarIngrediente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarIngrediente=new JPanel();
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) {
			jPanelCamposAuxiliarIngrediente=this.jInternalFrameDetalleFormIngrediente.jPanelCamposIngrediente;
			jPanelAccionesFormularioAuxiliarIngrediente=this.jInternalFrameDetalleFormIngrediente.jPanelAccionesFormularioIngrediente;
		}
		
		final JPanel jPanelCamposIngrediente=jPanelCamposAuxiliarIngrediente;
		final JPanel jPanelAccionesFormularioIngrediente=jPanelAccionesFormularioAuxiliarIngrediente;
		
		
		final JMenuBar jmenuBarIngrediente=this.jmenuBarIngrediente;		
		final JToolBar jTtoolBarIngrediente=this.jTtoolBarIngrediente;
				
		JMenuBar jmenuBarDetalleAuxiliarIngrediente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarIngrediente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) {
			jmenuBarDetalleAuxiliarIngrediente=this.jInternalFrameDetalleFormIngrediente.jmenuBarDetalleIngrediente;
			jTtoolBarDetalleAuxiliarIngrediente=this.jInternalFrameDetalleFormIngrediente.jTtoolBarDetalleIngrediente;		
		}
		
		final JMenuBar jmenuBarDetalleIngrediente=jmenuBarDetalleAuxiliarIngrediente;
		final JToolBar jTtoolBarDetalleIngrediente=jTtoolBarDetalleAuxiliarIngrediente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasIngrediente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesIngrediente;
			processRunnable.jTableDatos=jTableDatosIngrediente;
			processRunnable.jPanelCampos=jPanelCamposIngrediente;
			processRunnable.jPanelPaginacion=jPanelPaginacionIngrediente;
			processRunnable.jPanelAcciones=jPanelAccionesIngrediente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioIngrediente;
			
			
			processRunnable.jmenuBar=jmenuBarIngrediente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleIngrediente;
			processRunnable.jTtoolBar=jTtoolBarIngrediente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleIngrediente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasIngrediente ,jPanelParametrosReportesIngrediente, jTableDatosIngrediente,/*jScrollPanelDatosIngrediente,*/jPanelCamposIngrediente,jPanelPaginacionIngrediente, /*jScrollPanelDatosEdicionIngrediente,*/ jPanelAccionesIngrediente,jPanelAccionesFormularioIngrediente,jmenuBarIngrediente,jmenuBarDetalleIngrediente,jTtoolBarIngrediente,jTtoolBarDetalleIngrediente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesIngrediente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarIngrediente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuIngrediente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarIngrediente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarIngrediente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleIngrediente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuIngrediente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarIngrediente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleIngrediente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ingredienteConstantesFunciones.getsFinalQueryIngrediente();
		String  finalQueryPaginacionTodos=this.ingredienteConstantesFunciones.getsFinalQueryIngrediente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=IngredienteConstantesFunciones.getArrayColumnasGlobalesNoIngrediente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=IngredienteConstantesFunciones.getArrayColumnasGlobalesIngrediente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,IngredienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ingredientesEliminados= new ArrayList<Ingrediente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessIngrediente();
		
				///*IngredienteSessionBean*/this.ingredienteSessionBean=new IngredienteSessionBean();
			
			if(this.ingredienteSessionBean==null) {
				this.ingredienteSessionBean=new IngredienteSessionBean();
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
					this.iNumeroPaginacion=IngredienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=IngredienteConstantesFunciones.getClassesForeignKeysOfIngrediente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ingrediente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ingredientesAux= new ArrayList<Ingrediente>();
			
				
			ingredienteLogic.setDatosCliente(this.datosCliente);
			ingredienteLogic.setDatosDeep(this.datosDeep);
			ingredienteLogic.setIsConDeep(true);
			
			
			ingredienteLogic.getIngredienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					ingredienteLogic.getTodosIngredientes(finalQueryGlobal,pagination);
					
					//ingredienteLogic.getTodosIngredientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(ingredienteLogic.getIngredientes()==null|| ingredienteLogic.getIngredientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ingredientesAux= new ArrayList<Ingrediente>();
							ingredientesAux.addAll(ingredienteLogic.getIngredientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientesAux= new ArrayList<Ingrediente>();
							ingredientesAux.addAll(ingredientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ingredienteLogic.getTodosIngredientes(finalQueryGlobal+"",this.pagination);												
							
							//ingredienteLogic.getTodosIngredientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteIngredientes("Todos",ingredienteLogic.getIngredientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ingredienteLogic.setIngredientes(new ArrayList<Ingrediente>());					
							ingredienteLogic.getIngredientes().addAll(ingredientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientes=new ArrayList<Ingrediente>();
							ingredientes.addAll(ingredientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idIngrediente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idIngrediente=this.idActual;
				
				} else if(this.idIngredienteActual!=null && this.idIngredienteActual!=0L) {
					idIngrediente=idIngredienteActual;
				}
				
					
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndicePorId(idIngrediente);
				
				this.ingredientes=new ArrayList<Ingrediente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					ingredienteLogic.getEntity(idIngrediente);
					
					//ingredienteLogic.getEntityWithConnection(idIngrediente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ingredienteLogic.setIngredientes(new ArrayList<Ingrediente>());
					ingredienteLogic.getIngredientes().add(ingredienteLogic.getIngrediente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingredientes=new ArrayList<Ingrediente>();
					this.ingredientes.add(ingrediente);
				}
				
				if(ingredienteLogic.getIngrediente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ingredienteLogic.getIngredientesFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ingredienteLogic.getIngredientes()==null||ingredienteLogic.getIngredientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ingredientes==null|| ingredientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredientesAux=new ArrayList<Ingrediente>();
						ingredientesAux.addAll(ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientesAux=new ArrayList<Ingrediente>();
							ingredientesAux.addAll(ingredientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ingredienteLogic.getIngredientesFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteIngredientes("FK_IdBodega",ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteIngredientes("FK_IdBodega",ingredientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredienteLogic.setIngredientes(new ArrayList<Ingrediente>());
						ingredienteLogic.getIngredientes().addAll(ingredientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientes=new ArrayList<Ingrediente>();
							ingredientes.addAll(ingredientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdBodegaRelacion")) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdBodegaRelacion(id_bodega_relacionFK_IdBodegaRelacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ingredienteLogic.getIngredientesFK_IdBodegaRelacion(finalQueryGlobal,pagination,id_bodega_relacionFK_IdBodegaRelacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdBodegaRelacion(id_bodega_relacionFK_IdBodegaRelacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdBodegaRelacion(id_bodega_relacionFK_IdBodegaRelacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ingredienteLogic.getIngredientes()==null||ingredienteLogic.getIngredientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ingredientes==null|| ingredientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredientesAux=new ArrayList<Ingrediente>();
						ingredientesAux.addAll(ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientesAux=new ArrayList<Ingrediente>();
							ingredientesAux.addAll(ingredientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ingredienteLogic.getIngredientesFK_IdBodegaRelacion(finalQueryGlobal,pagination,id_bodega_relacionFK_IdBodegaRelacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdBodegaRelacion(id_bodega_relacionFK_IdBodegaRelacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdBodegaRelacion(id_bodega_relacionFK_IdBodegaRelacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteIngredientes("FK_IdBodegaRelacion",ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteIngredientes("FK_IdBodegaRelacion",ingredientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredienteLogic.setIngredientes(new ArrayList<Ingrediente>());
						ingredienteLogic.getIngredientes().addAll(ingredientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientes=new ArrayList<Ingrediente>();
							ingredientes.addAll(ingredientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ingredienteLogic.getIngredientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ingredienteLogic.getIngredientes()==null||ingredienteLogic.getIngredientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ingredientes==null|| ingredientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredientesAux=new ArrayList<Ingrediente>();
						ingredientesAux.addAll(ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientesAux=new ArrayList<Ingrediente>();
							ingredientesAux.addAll(ingredientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ingredienteLogic.getIngredientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteIngredientes("FK_IdEmpresa",ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteIngredientes("FK_IdEmpresa",ingredientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredienteLogic.setIngredientes(new ArrayList<Ingrediente>());
						ingredienteLogic.getIngredientes().addAll(ingredientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientes=new ArrayList<Ingrediente>();
							ingredientes.addAll(ingredientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ingredienteLogic.getIngredientesFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ingredienteLogic.getIngredientes()==null||ingredienteLogic.getIngredientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ingredientes==null|| ingredientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredientesAux=new ArrayList<Ingrediente>();
						ingredientesAux.addAll(ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientesAux=new ArrayList<Ingrediente>();
							ingredientesAux.addAll(ingredientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ingredienteLogic.getIngredientesFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteIngredientes("FK_IdProducto",ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteIngredientes("FK_IdProducto",ingredientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredienteLogic.setIngredientes(new ArrayList<Ingrediente>());
						ingredienteLogic.getIngredientes().addAll(ingredientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientes=new ArrayList<Ingrediente>();
							ingredientes.addAll(ingredientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProductoRelacion")) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdProductoRelacion(id_producto_relacionFK_IdProductoRelacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ingredienteLogic.getIngredientesFK_IdProductoRelacion(finalQueryGlobal,pagination,id_producto_relacionFK_IdProductoRelacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdProductoRelacion(id_producto_relacionFK_IdProductoRelacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdProductoRelacion(id_producto_relacionFK_IdProductoRelacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ingredienteLogic.getIngredientes()==null||ingredienteLogic.getIngredientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ingredientes==null|| ingredientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredientesAux=new ArrayList<Ingrediente>();
						ingredientesAux.addAll(ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientesAux=new ArrayList<Ingrediente>();
							ingredientesAux.addAll(ingredientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ingredienteLogic.getIngredientesFK_IdProductoRelacion(finalQueryGlobal,pagination,id_producto_relacionFK_IdProductoRelacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdProductoRelacion(id_producto_relacionFK_IdProductoRelacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdProductoRelacion(id_producto_relacionFK_IdProductoRelacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteIngredientes("FK_IdProductoRelacion",ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteIngredientes("FK_IdProductoRelacion",ingredientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredienteLogic.setIngredientes(new ArrayList<Ingrediente>());
						ingredienteLogic.getIngredientes().addAll(ingredientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientes=new ArrayList<Ingrediente>();
							ingredientes.addAll(ingredientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ingredienteLogic.getIngredientesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ingredienteLogic.getIngredientes()==null||ingredienteLogic.getIngredientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ingredientes==null|| ingredientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredientesAux=new ArrayList<Ingrediente>();
						ingredientesAux.addAll(ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientesAux=new ArrayList<Ingrediente>();
							ingredientesAux.addAll(ingredientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ingredienteLogic.getIngredientesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngredienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteIngredientes("FK_IdSucursal",ingredienteLogic.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteIngredientes("FK_IdSucursal",ingredientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredienteLogic.setIngredientes(new ArrayList<Ingrediente>());
						ingredienteLogic.getIngredientes().addAll(ingredientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredientes=new ArrayList<Ingrediente>();
							ingredientes.addAll(ingredientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesIngrediente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessIngrediente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ingredienteLogic.getIngredientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ingredientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ingredienteLogic.getIngredientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ingredientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Ingrediente ingrediente) {
		Boolean permite=true;
		
		if(this.ingrediente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=IngredienteConstantesFunciones.getOrderByListaIngrediente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=IngredienteConstantesFunciones.getOrderByListaIngrediente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ingrediente ingrediente:ingredienteLogic.getIngredientes()) {
				if(ingrediente.getsType().equals(Constantes2.S_TOTALES)) {
					ingredienteTotales=ingrediente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ingrediente ingrediente:this.ingredientes) {
				if(ingrediente.getsType().equals(Constantes2.S_TOTALES)) {
					ingredienteTotales=ingrediente;
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
			this.ingredienteAux=new Ingrediente();
			this.ingredienteAux.setsType(Constantes2.S_TOTALES);
			this.ingredienteAux.setIsNew(false);
			this.ingredienteAux.setIsChanged(false);
			this.ingredienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				IngredienteConstantesFunciones.TotalizarValoresFilaIngrediente(this.ingredienteLogic.getIngredientes(),this.ingredienteAux);
				
				this.ingredienteLogic.getIngredientes().add(this.ingredienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				IngredienteConstantesFunciones.TotalizarValoresFilaIngrediente(this.ingredientes,this.ingredienteAux);
				
				this.ingredientes.add(this.ingredienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ingredienteTotales=new Ingrediente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ingredienteLogic.getIngredientes().remove(ingredienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ingredientes.remove(ingredienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ingredienteTotales=new Ingrediente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ingrediente ingrediente:ingredienteLogic.getIngredientes()) {
				if(ingrediente.getsType().equals(Constantes2.S_TOTALES)) {
					ingredienteTotales=ingrediente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				IngredienteConstantesFunciones.TotalizarValoresFilaIngrediente(this.ingredienteLogic.getIngredientes(),ingredienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ingrediente ingrediente:this.ingredientes) {
				if(ingrediente.getsType().equals(Constantes2.S_TOTALES)) {
					ingredienteTotales=ingrediente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				IngredienteConstantesFunciones.TotalizarValoresFilaIngrediente(this.ingredientes,ingredienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getIngredientesFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getIngredientesFK_IdBodegaRelacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodegaRelacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getIngredientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getIngredientesFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getIngredientesFK_IdProductoRelacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdProductoRelacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getIngredientesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getIngredientesFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ingredienteLogic.getIngredientesFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getIngredientesFK_IdBodegaRelacion(String sFinalQuery,Long id_bodega_relacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ingredienteLogic.getIngredientesFK_IdBodegaRelacion(sFinalQuery,this.pagination,id_bodega_relacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getIngredientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ingredienteLogic.getIngredientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getIngredientesFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ingredienteLogic.getIngredientesFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getIngredientesFK_IdProductoRelacion(String sFinalQuery,Long id_producto_relacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ingredienteLogic.getIngredientesFK_IdProductoRelacion(sFinalQuery,this.pagination,id_producto_relacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getIngredientesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ingredienteLogic.getIngredientesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosIngrediente() {
		this.isPermisoTodoIngrediente=false;
		this.isPermisoNuevoIngrediente=false;
		this.isPermisoActualizarIngrediente=false;
		this.isPermisoActualizarOriginalIngrediente=false;
		this.isPermisoEliminarIngrediente=false;
		this.isPermisoGuardarCambiosIngrediente=false;
		this.isPermisoConsultaIngrediente=false;
		this.isPermisoBusquedaIngrediente=false;
		this.isPermisoReporteIngrediente=false;		
		this.isPermisoOrdenIngrediente=false;		
		this.isPermisoPaginacionMedioIngrediente=false;		
		this.isPermisoPaginacionAltoIngrediente=false;
		this.isPermisoPaginacionTodoIngrediente=false;
		this.isPermisoCopiarIngrediente=false;		
		this.isPermisoVerFormIngrediente=false;		
		this.isPermisoDuplicarIngrediente=false;		
		this.isPermisoOrdenIngrediente=false;		
	}
	
	public void setPermisosUsuarioIngrediente(Boolean isPermiso) {
		this.isPermisoTodoIngrediente=isPermiso;
		this.isPermisoNuevoIngrediente=isPermiso;
		this.isPermisoActualizarIngrediente=isPermiso;
		this.isPermisoActualizarOriginalIngrediente=isPermiso;
		this.isPermisoEliminarIngrediente=isPermiso;
		this.isPermisoGuardarCambiosIngrediente=isPermiso;
		this.isPermisoConsultaIngrediente=isPermiso;
		this.isPermisoBusquedaIngrediente=isPermiso;
		this.isPermisoReporteIngrediente=isPermiso;
		this.isPermisoOrdenIngrediente=isPermiso;		
		this.isPermisoPaginacionMedioIngrediente=isPermiso;		
		this.isPermisoPaginacionAltoIngrediente=isPermiso;		
		this.isPermisoPaginacionTodoIngrediente=isPermiso;		
		this.isPermisoCopiarIngrediente=isPermiso;		
		this.isPermisoVerFormIngrediente=isPermiso;		
		this.isPermisoDuplicarIngrediente=isPermiso;
		this.isPermisoOrdenIngrediente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioIngrediente(Boolean isPermiso) {
		//this.isPermisoTodoIngrediente=isPermiso;
		this.isPermisoNuevoIngrediente=isPermiso;
		this.isPermisoActualizarIngrediente=isPermiso;
		this.isPermisoActualizarOriginalIngrediente=isPermiso;
		this.isPermisoEliminarIngrediente=isPermiso;
		this.isPermisoGuardarCambiosIngrediente=isPermiso;
		//this.isPermisoConsultaIngrediente=isPermiso;
		//this.isPermisoBusquedaIngrediente=isPermiso;
		//this.isPermisoReporteIngrediente=isPermiso;
		//this.isPermisoOrdenIngrediente=isPermiso;		
		//this.isPermisoPaginacionMedioIngrediente=isPermiso;		
		//this.isPermisoPaginacionAltoIngrediente=isPermiso;		
		//this.isPermisoPaginacionTodoIngrediente=isPermiso;		
		//this.isPermisoCopiarIngrediente=isPermiso;		
		//this.isPermisoDuplicarIngrediente=isPermiso;
		//this.isPermisoOrdenIngrediente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioIngredienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(IngredienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebIngrediente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioIngredienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioIngredienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionIngredienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioIngredienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioIngrediente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(IngredienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ingredienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, IngredienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoIngrediente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarIngrediente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalIngrediente=this.isPermisoActualizarIngrediente;
			this.isPermisoEliminarIngrediente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosIngrediente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaIngrediente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaIngrediente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoIngrediente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteIngrediente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenIngrediente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioIngrediente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoIngrediente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoIngrediente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarIngrediente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormIngrediente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarIngrediente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenIngrediente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ingredienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosIngrediente.setToolTipText(this.jTableDatosIngrediente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioIngrediente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioIngrediente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(IngredienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(IngredienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioIngrediente() throws Exception {
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
	public void inicializarCombosForeignKeyIngredienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.bodegarelacionsForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.productorelacionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyIngredienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(IngredienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyIngredienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaRelacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoRelacionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyBodegaRelacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegarelacionsForeignKey==null||this.bodegarelacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegaRelacionsForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyProductoRelacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.productorelacionsForeignKey==null||this.productorelacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductoRelacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyIngredienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			IngredienteParameterReturnGeneral ingredienteReturnGeneral=new IngredienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.ingredienteConstantesFunciones.cargarid_empresaIngrediente)
					 || (this.esRecargarFks && this.ingredienteConstantesFunciones.cargarid_empresaIngrediente)) {

					if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+ingredienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.ingredienteConstantesFunciones.cargarid_sucursalIngrediente)
					 || (this.esRecargarFks && this.ingredienteConstantesFunciones.cargarid_sucursalIngrediente)) {

					if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+ingredienteSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.ingredienteConstantesFunciones.cargarid_bodegaIngrediente)
					 || (this.esRecargarFks && this.ingredienteConstantesFunciones.cargarid_bodegaIngrediente)) {

					if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+ingredienteSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalBodegaRelacion="";

				if(((this.bodegarelacionsForeignKey==null||this.bodegarelacionsForeignKey.size()<=0) && this.ingredienteConstantesFunciones.cargarid_bodega_relacionIngrediente)
					 || (this.esRecargarFks && this.ingredienteConstantesFunciones.cargarid_bodega_relacionIngrediente)) {

					if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionBodegaRelacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodegaRelacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodegaRelacion=Funciones.GetFinalQueryAppend(finalQueryGlobalBodegaRelacion, "");
						finalQueryGlobalBodegaRelacion+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegaRelacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodegaRelacion=" WHERE " + ConstantesSql.ID + "="+ingredienteSessionBean.getlidBodegaRelacionActual();
					}
				} else {
					finalQueryGlobalBodegaRelacion="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.ingredienteConstantesFunciones.cargarid_productoIngrediente)
					 || (this.esRecargarFks && this.ingredienteConstantesFunciones.cargarid_productoIngrediente)) {

					if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+ingredienteSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalProductoRelacion="";

				if(((this.productorelacionsForeignKey==null||this.productorelacionsForeignKey.size()<=0) && this.ingredienteConstantesFunciones.cargarid_producto_relacionIngrediente)
					 || (this.esRecargarFks && this.ingredienteConstantesFunciones.cargarid_producto_relacionIngrediente)) {

					if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionProductoRelacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProductoRelacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProductoRelacion=Funciones.GetFinalQueryAppend(finalQueryGlobalProductoRelacion, "");
						finalQueryGlobalProductoRelacion+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductoRelacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProductoRelacion=" WHERE " + ConstantesSql.ID + "="+ingredienteSessionBean.getlidProductoRelacionActual();
					}
				} else {
					finalQueryGlobalProductoRelacion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				ingredienteReturnGeneral=ingredienteLogic.cargarCombosLoteForeignKeyIngrediente(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalBodegaRelacion,finalQueryGlobalProducto,finalQueryGlobalProductoRelacion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=ingredienteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=ingredienteReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=ingredienteReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalBodegaRelacion.equals("NONE")) {
				this.bodegarelacionsForeignKey=ingredienteReturnGeneral.getbodegarelacionsForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=ingredienteReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalProductoRelacion.equals("NONE")) {
				this.productorelacionsForeignKey=ingredienteReturnGeneral.getproductorelacionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyIngrediente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyBodegaRelacion();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyProductoRelacion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ingredienteSessionBean==null) {
				this.ingredienteSessionBean=new IngredienteSessionBean();
			}

			if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

	public void addItemDefectoCombosForeignKeyBodegaRelacion()throws Exception {
		try {

			if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionBodegaRelacion()) {
				Bodega bodegarelacion=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodegarelacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodegarelacion.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegarelacionsForeignKey,bodegarelacion,true)) {

					this.bodegarelacionsForeignKey.add(0,bodegarelacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyProductoRelacion()throws Exception {
		try {

			if(!this.ingredienteSessionBean.getisBusquedaDesdeForeignKeySesionProductoRelacion()) {
				Producto productorelacion=new Producto();
				ProductoConstantesFunciones.setProductoDescripcion(productorelacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				productorelacion.setId(null);

				if(!ProductoConstantesFunciones.ExisteEnLista(this.productorelacionsForeignKey,productorelacion,true)) {

					this.productorelacionsForeignKey.add(0,productorelacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyIngrediente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyIngrediente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyIngrediente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyIngrediente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyIngrediente(Ingrediente ingrediente)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(ingrediente.getid_bodega(),false,"Formulario");
			this.setActualBodegaRelacionForeignKey(ingrediente.getid_bodega_relacion(),false,"Formulario");
			this.setActualProductoForeignKey(ingrediente.getid_producto(),false,"Formulario");
			this.setActualProductoRelacionForeignKey(ingrediente.getid_producto_relacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyIngrediente(Ingrediente ingrediente,String sTipoEvento)throws Exception {	
		try {
			
			

				if(ingrediente.getProducto()!=null && !sTipoEvento.equals("id_productoIngrediente")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(ingrediente.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				if(ingrediente.getProductoRelacion()!=null && !sTipoEvento.equals("id_producto_relacionIngrediente")) { //sTipoEvento Evita Bucle Infinito

					this.productorelacionsForeignKey=new ArrayList<Producto>();
					this.productorelacionsForeignKey.add(ingrediente.getProductoRelacion());

					this.addItemDefectoCombosForeignKeyProductoRelacion();
					this.cargarCombosFrameProductoRelacionsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyIngrediente()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.ingredienteConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualBodegaRelacionForeignKey(this.ingredienteConstantesFunciones.getid_bodega_relacion(),false,"Formulario");
			this.setActualProductoForeignKey(this.ingredienteConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualProductoRelacionForeignKey(this.ingredienteConstantesFunciones.getid_producto_relacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyIngrediente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyIngrediente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyIngrediente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroIngrediente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyIngrediente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameBodegaRelacionsForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameProductoRelacionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyIngrediente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegaRelacionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductoRelacionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyIngrediente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente!=null && this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.getItemCount()>0) {
				this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente!=null && this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.getItemCount()>0) {
				this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente!=null && this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.getItemCount()>0) {
				this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente!=null && this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.getItemCount()>0) {
				this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente!=null && this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.getItemCount()>0) {
				this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente!=null && this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.getItemCount()>0) {
				this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public IngredienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public IngredienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public IngredienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ingredienteSessionBean=new IngredienteSessionBean(); 
		this.ingredienteConstantesFunciones=new IngredienteConstantesFunciones(); 
		this.ingredienteBean=new Ingrediente();//(this.ingredienteConstantesFunciones); 		
		this.ingredienteReturnGeneral=new IngredienteParameterReturnGeneral(); 
		
		this.ingredienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ingredienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public IngredienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public IngredienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public IngredienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessIngrediente(true);
			
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
			
			this.ingredienteConstantesFunciones=new IngredienteConstantesFunciones(); 
			this.ingredienteBean=new Ingrediente();//this.ingredienteConstantesFunciones); 			
			this.ingredienteReturnGeneral=new IngredienteParameterReturnGeneral(); 
		
			IngredienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ingrediente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ingrediente=new Ingrediente();
			this.ingredientes = new ArrayList<Ingrediente>();
			this.ingredientesAux = new ArrayList<Ingrediente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic=new IngredienteLogic();
				this.ingredienteLogic.getNewConnexionToDeep("");
			}
			
			//this.ingredienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ingredienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormIngrediente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoIngrediente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoIngrediente);	
					}
					
					if(this.jInternalFrameImportacionIngrediente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionIngrediente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByIngrediente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByIngrediente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormIngrediente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormIngrediente);
				this.jInternalFrameDetalleFormIngrediente.setVisible(false);
				this.jInternalFrameDetalleFormIngrediente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoIngrediente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoIngrediente);
					this.jInternalFrameReporteDinamicoIngrediente.setVisible(false);
					this.jInternalFrameReporteDinamicoIngrediente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionIngrediente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionIngrediente);
					this.jInternalFrameImportacionIngrediente.setVisible(false);
					this.jInternalFrameImportacionIngrediente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByIngrediente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByIngrediente);
					this.jInternalFrameOrderByIngrediente.setVisible(false);
					this.jInternalFrameOrderByIngrediente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idIngredienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=IngredienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ingredienteReturnGeneral=new IngredienteParameterReturnGeneral();
			
			this.ingredienteParameterGeneral=new IngredienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ingredienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(IngredienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ingredienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,IngredienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ingredienteSessionBean.getEsGuardarRelacionado(),this.ingredienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,IngredienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ingredienteSessionBean.getEsGuardarRelacionado(),this.ingredienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoIngrediente=false;
			this.isVisibilidadCeldaDuplicarIngrediente=true;
			this.isVisibilidadCeldaCopiarIngrediente=true;
			this.isVisibilidadCeldaVerFormIngrediente=true;
			this.isVisibilidadCeldaOrdenIngrediente=true;
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=false;
			this.isVisibilidadCeldaModificarIngrediente=false;
			this.isVisibilidadCeldaActualizarIngrediente=false;
			this.isVisibilidadCeldaEliminarIngrediente=false;
			this.isVisibilidadCeldaCancelarIngrediente=false;
			this.isVisibilidadCeldaGuardarIngrediente=false;
			this.isVisibilidadCeldaGuardarCambiosIngrediente=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdBodegaRelacion=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdProductoRelacion=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesIngrediente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosIngrediente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioIngrediente(false);
			
			this.setPermisosUsuarioIngrediente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ingredienteSessionBean.getEsGuardarRelacionado() 
				|| (this.ingredienteSessionBean.getEsGuardarRelacionado() && this.ingredienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioIngredienteClasesRelacionadas();
			}
			
			if(this.ingredienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioIngredienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!IngredienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosIngrediente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualIngrediente();
			}
			
			if(!this.isPermisoBusquedaIngrediente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasIngrediente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioIngrediente,this.isPermisoPaginacionMedioIngrediente,this.isPermisoPaginacionTodoIngrediente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(IngredienteConstantesFunciones.getTiposSeleccionarIngrediente());
				
				this.tiposColumnasSelect=IngredienteConstantesFunciones.getTiposSeleccionarIngrediente(true);
				
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
			//if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioIngrediente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioIngrediente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioIngrediente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesIngrediente() ;
			
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
			this.bodegaLogic=new BodegaLogic();
			this.bodegarelacionLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.productorelacionLogic=new ProductoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ingredienteImplementable= (IngredienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+IngredienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ingredienteImplementableHome= (IngredienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+IngredienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ingredientes= new ArrayList<Ingrediente>();
			this.ingredientesEliminados= new ArrayList<Ingrediente>();
						
			this.isEsNuevoIngrediente=false;
			this.esParaAccionDesdeFormularioIngrediente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			this.idProductoRelacionActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.bodegarelacionsForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.productorelacionsForeignKey=new ArrayList<Producto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyIngrediente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroIngrediente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			IngredienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=IngredienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesIngrediente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingIngrediente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormIngrediente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioIngrediente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioIngrediente();
			}
			
			IngredienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasIngrediente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasIngrediente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasIngrediente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessIngrediente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Ingrediente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectIngrediente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesIngrediente")) {
				iIndex=this.jInternalFrameDetalleFormIngrediente.jTabbedPaneRelacionesIngrediente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormIngrediente.jTabbedPaneRelacionesIngrediente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessIngrediente();	
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
	
	public void cargarCombosForeignKeyIngrediente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyIngrediente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyIngrediente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyIngredienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyIngrediente();
		
		this.cargarCombosFrameForeignKeyIngrediente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyIngrediente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyIngrediente();
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

	public void cargarCombosForeignKeyBodegaRelacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaRelacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodegaRelacion();
				this.cargarCombosFrameBodegaRelacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodegaRelacion(this.bodegarelacionsForeignKey);

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

	public void cargarCombosForeignKeyProductoRelacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoRelacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProductoRelacion();
				this.cargarCombosFrameProductoRelacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProductoRelacion(this.productorelacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoIngredienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ingredienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormIngrediente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			
			
			if(jTableDatosIngrediente.getRowCount()>=1) {
				jTableDatosIngrediente.removeRowSelectionInterval(0, jTableDatosIngrediente.getRowCount()-1);						
			}
			
			this.isEsNuevoIngrediente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoIngrediente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesIngrediente(true);			
			//this.ingrediente=new Ingrediente();
			//this.ingrediente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIngrediente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIngrediente() ;
			
			if(IngredienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIngrediente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ingrediente);	
			this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);				
			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			
			if(this.ingredienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Ingrediente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarIngredienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosIngrediente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosIngrediente.getSelectedRows().length;			
			}
			
			ingredientesSeleccionados=this.getIngredientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoIngrediente--;			
				//Ingrediente ingredienteAux= new Ingrediente();			
				//ingredienteAux.setId(this.iIdNuevoIngrediente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Ingrediente ingredienteOrigen=new Ingrediente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Ingrediente ingredienteOrigen : ingredientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ingredienteOrigen =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingredienteOrigen =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaIngrediente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ingrediente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosIngrediente(ingredienteOrigen,this.ingrediente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ingredienteLogic.getIngredientes().add(this.ingredienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ingredientes.add(this.ingredienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaIngrediente(false);
				
				this.jTableDatosIngrediente.setRowSelectionInterval(this.getIndiceNuevoIngrediente(), this.getIndiceNuevoIngrediente());
				
				int iLastRow =  this.jTableDatosIngrediente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosIngrediente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosIngrediente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaIngrediente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarIngredienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();									
		
			Ingrediente ingredienteOrigen=new Ingrediente();
			Ingrediente ingredienteDestino=new Ingrediente();
				
			ingredientesSeleccionados=this.getIngredientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosIngrediente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ingredientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosIngrediente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredienteOrigen =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ingredienteOrigen =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ingredienteDestino =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ingredienteDestino =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ingredienteOrigen =ingredientesSeleccionados.get(0);
				ingredienteDestino =ingredientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosIngrediente(ingredienteOrigen,ingredienteDestino,true,false);
				
				ingredienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ingredienteDestino,ingredienteLogic.getIngredientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ingredienteDestino,ingredientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaIngrediente(false);
				
				//this.jTableDatosIngrediente.setRowSelectionInterval(this.getIndiceNuevoIngrediente(), this.getIndiceNuevoIngrediente());
				
				int iLastRow =  this.jTableDatosIngrediente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosIngrediente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosIngrediente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaIngrediente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormIngredienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormIngrediente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormIngrediente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarIngredienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesIngrediente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasIngrediente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesIngrediente.setVisible(!isVisible);
			this.jPanelPaginacionIngrediente.setVisible(!isVisible);
			this.jPanelAccionesIngrediente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarIngredienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameIngrediente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoIngredienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoIngrediente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionIngredienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionIngrediente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByIngredienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByIngrediente();
			
			this.abrirFrameOrderByIngrediente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByIngredienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByIngrediente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleIngrediente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormIngrediente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormIngrediente.isMaximum()) {
					this.jInternalFrameDetalleFormIngrediente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormIngrediente.setSize(this.jInternalFrameDetalleFormIngrediente.iWidthFormulario,this.jInternalFrameDetalleFormIngrediente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormIngrediente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormIngrediente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormIngrediente.isMaximum()) {
						this.jInternalFrameDetalleFormIngrediente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormIngrediente.jContentPaneDetalleIngrediente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormIngrediente.jTabbedPaneRelacionesIngrediente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormIngrediente.jContentPaneDetalleIngrediente.getWidth(),IngredienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormIngrediente.jTabbedPaneRelacionesIngrediente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormIngrediente.jContentPaneDetalleIngrediente.getWidth(),IngredienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormIngrediente.jTabbedPaneRelacionesIngrediente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormIngrediente.jContentPaneDetalleIngrediente.getWidth(),IngredienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormIngrediente.setVisible(true);
	        this.jInternalFrameDetalleFormIngrediente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByIngrediente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByIngrediente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByIngrediente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIngrediente,false,this);
				} else {
					this.jInternalFrameOrderByIngrediente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIngrediente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByIngrediente);
				this.jInternalFrameOrderByIngrediente.setVisible(false);
				this.jInternalFrameOrderByIngrediente.setSelected(false);
				
				this.jInternalFrameOrderByIngrediente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByIngrediente"));
				
				this.inicializarActualizarBindingTablaOrderByIngrediente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionIngrediente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionIngrediente==null) {
				
				this.jInternalFrameImportacionIngrediente=new ImportacionJInternalFrame(IngredienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionIngrediente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionIngrediente);
				this.jInternalFrameImportacionIngrediente.setVisible(false);
				this.jInternalFrameImportacionIngrediente.setSelected(false);


				this.jInternalFrameImportacionIngrediente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionIngrediente"));
				this.jInternalFrameImportacionIngrediente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionIngrediente"));
				this.jInternalFrameImportacionIngrediente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionIngrediente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoIngrediente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoIngrediente==null) {
				this.jInternalFrameReporteDinamicoIngrediente=new ReporteDinamicoJInternalFrame(IngredienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoIngrediente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoIngrediente);
				this.jInternalFrameReporteDinamicoIngrediente.setVisible(false);
				this.jInternalFrameReporteDinamicoIngrediente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoIngrediente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIngrediente"));
				this.jInternalFrameReporteDinamicoIngrediente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIngrediente"));
				this.jInternalFrameReporteDinamicoIngrediente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIngrediente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIngrediente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleIngrediente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormIngrediente);
			
	       	this.jInternalFrameDetalleFormIngrediente.setVisible(false);
	        this.jInternalFrameDetalleFormIngrediente.setSelected(false);
			
			//this.jInternalFrameDetalleFormIngrediente.dispose();
			//this.jInternalFrameDetalleFormIngrediente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoIngrediente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoIngrediente.setVisible(true);
	        this.jInternalFrameReporteDinamicoIngrediente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionIngrediente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionIngrediente.setVisible(true);
	        this.jInternalFrameImportacionIngrediente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByIngrediente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByIngrediente.setVisible(true);
	        this.jInternalFrameOrderByIngrediente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByIngrediente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByIngrediente.setVisible(false);
	        this.jInternalFrameOrderByIngrediente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoIngrediente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoIngrediente.setVisible(false);
	        this.jInternalFrameReporteDinamicoIngrediente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionIngrediente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionIngrediente.setVisible(false);
	        this.jInternalFrameImportacionIngrediente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarIngredienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarIngrediente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarIngrediente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesIngrediente(true);
			//this.isEsNuevoIngrediente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesIngrediente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIngrediente(false) ;
			
			if(ingredienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(IngredienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIngrediente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIngrediente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaIngredienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarIngrediente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormIngrediente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesIngrediente(true);
			//this.isEsNuevoIngrediente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ingrediente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesIngrediente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesIngrediente(false) ;
			
			if(IngredienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIngrediente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIngrediente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.ingredienteConstantesFunciones.cargarid_productoIngrediente) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingIngrediente(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
			
			if(sType.equals("ProductoRelacion")) {
				if(!this.ingredienteConstantesFunciones.cargarid_producto_relacionIngrediente) {
					this.cargarCombosProductoRelacionsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingIngrediente(false,false);
					this.cargarCombosFrameProductoRelacionsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto_relacion (id);

				this.recargarComboTablaProductoRelacion(this.productorelacionsForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosIngrediente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodegaRelacion(List<Bodega> bodegarelacionsForeignKey)throws Exception{
		TableColumn tableColumnBodegaRelacion=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_IDBODEGARELACION));
		TableCellEditor tableCellEditorBodegaRelacion =tableColumnBodegaRelacion.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodegaRelacion;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegarelacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosIngrediente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegarelacionsForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosIngrediente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProductoRelacion(List<Producto> productorelacionsForeignKey)throws Exception{
		TableColumn tableColumnProductoRelacion=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION));
		TableCellEditor tableCellEditorProductoRelacion =tableColumnProductoRelacion.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProductoRelacion;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productorelacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosIngrediente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productorelacionsForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_producto_relacion (Long id) throws Exception {
		this.setActualProductoRelacionForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarIngredienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesIngrediente(false);
			
			//if(!this.isEsNuevoIngrediente) {								
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(IngredienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
				
			}
			
			if(this.permiteMantenimiento(this.ingrediente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoIngrediente=true;
					this.inicializarActualizarBindingTablaIngrediente(false);
					this.isEsNuevoIngrediente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoIngrediente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoIngrediente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesIngrediente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIngrediente(false);
				
				this.habilitarDeshabilitarControlesIngrediente(false);
			
												
				
				if(IngredienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleIngrediente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoIngredienteActionPerformed(evt,ingredienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualIngrediente(this.ingrediente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosIngrediente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ingredienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ingrediente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Ingrediente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ingrediente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarIngredienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				this.ingrediente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				this.ingrediente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ingrediente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((IngredienteModel) this.jTableDatosIngrediente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoIngrediente=true;
				this.inicializarActualizarBindingTablaIngrediente(false);
				this.isEsNuevoIngrediente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesIngrediente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIngrediente(false);
				
				this.habilitarDeshabilitarControlesIngrediente(false);
				
				
				
				if(IngredienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleIngrediente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarIngredienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosIngrediente.getRowCount()>=1) {
				jTableDatosIngrediente.removeRowSelectionInterval(0, jTableDatosIngrediente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesIngrediente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaIngrediente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIngrediente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIngrediente(false) ;
			
			this.isEsNuevoIngrediente=false;
			
			if(IngredienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleIngrediente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosIngredienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingIngrediente(false);
				
				//SI ES MANUAL
				if(IngredienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualIngrediente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosIngredienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoIngrediente--;			
			//Ingrediente ingredienteAux= new Ingrediente();			
			//ingredienteAux.setId(this.iIdNuevoIngrediente);
			
			if(this.jInternalFrameDetalleFormIngrediente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaIngrediente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
			
			this.ingrediente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ingredienteLogic.getIngredientes().add(this.ingredienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ingredientes.add(this.ingredienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaIngrediente(false);
			
			this.jTableDatosIngrediente.setRowSelectionInterval(this.getIndiceNuevoIngrediente(), this.getIndiceNuevoIngrediente());
			
			int iLastRow =  this.jTableDatosIngrediente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosIngrediente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosIngrediente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaIngrediente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionIngredienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingIngrediente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIngrediente(false);
			
			//SI ES MANUAL
			if(IngredienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIngrediente();
			}
			
			//this.abrirFrameTreeIngrediente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionIngredienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE IngredienteS ?", "MANTENIMIENTO DE Ingrediente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionIngrediente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralIngrediente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.ingredienteReturnGeneral=ingredienteLogic.procesarImportacionIngredientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.ingredienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarIngredienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionIngredienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionIngrediente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionIngrediente.setFileImportacion(this.jInternalFrameImportacionIngrediente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionIngrediente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionIngrediente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionIngrediente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionIngrediente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoIngredienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();		

		ingredientesSeleccionados=this.getIngredientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("IngredienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"IngredienteBaseDesign.jrxml";
			
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
			
			this.generarReporteIngredientes("Todos",ingredientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingrediente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case IngredienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngredienteConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngredienteConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngredienteConstantesFunciones.LABEL_IDBODEGARELACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_BodegaRelacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_BodegaRelacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_BodegaRelacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_BodegaRelacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngredienteConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ProductoRelacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ProductoRelacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ProductoRelacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ProductoRelacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngredienteConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngredienteConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoIngrediente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case IngredienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case IngredienteConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case IngredienteConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case IngredienteConstantesFunciones.LABEL_IDBODEGARELACION:
					sNombreCampoCategoria="id_bodega_relacion";
					break;

				case IngredienteConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION:
					sNombreCampoCategoria="id_producto_relacion";
					break;

				case IngredienteConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case IngredienteConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case IngredienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case IngredienteConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case IngredienteConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case IngredienteConstantesFunciones.LABEL_IDBODEGARELACION:
					sNombreCampoCategoriaValor="id_bodega_relacion";
					break;

				case IngredienteConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION:
					sNombreCampoCategoriaValor="id_producto_relacion";
					break;

				case IngredienteConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case IngredienteConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case IngredienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case IngredienteConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case IngredienteConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case IngredienteConstantesFunciones.LABEL_IDBODEGARELACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega Relacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega_relacion");
					break;

				case IngredienteConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto Relacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto_relacion");
					break;

				case IngredienteConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case IngredienteConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
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
	
	public void jButtonGenerarExcelReporteDinamicoIngredienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();		
		
		ingredientesSeleccionados=this.getIngredientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingrediente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Ingredientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case IngredienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Ingrediente ingrediente:ingredientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingrediente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngredienteConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Ingrediente ingrediente:ingredientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingrediente.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngredienteConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(Ingrediente ingrediente:ingredientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingrediente.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngredienteConstantesFunciones.LABEL_IDBODEGARELACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDBODEGARELACION);
					iRow++;

					for(Ingrediente ingrediente:ingredientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingrediente.getbodegarelacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngredienteConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(Ingrediente ingrediente:ingredientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingrediente.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION);
					iRow++;

					for(Ingrediente ingrediente:ingredientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingrediente.getproductorelacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngredienteConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngredienteConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(Ingrediente ingrediente:ingredientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingrediente.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngredienteConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngredienteConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(Ingrediente ingrediente:ingredientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingrediente.getprecio());
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
			//	this.getFilaCabeceraExportarExcelIngrediente(row);				
			//	iRow++;
			//}				
			
			//for(Ingrediente ingredienteAux:ingredientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelIngrediente(ingredienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingrediente",JOptionPane.INFORMATION_MESSAGE);
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
				this.ingredienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIngrediente(false);
			
			//SI ES MANUAL
			if(IngredienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIngrediente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresIngredienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIngrediente(false);
			
			//SI ES MANUAL
			if(IngredienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualIngrediente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesIngredienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIngrediente(false);
			
			//SI ES MANUAL
			if(IngredienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualIngrediente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaIngrediente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosIngrediente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosIngrediente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosIngrediente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosIngrediente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosIngrediente.setMinimumSize(dimensionMinimum);
		this.jTableDatosIngrediente.setMaximumSize(dimensionMaximum);
		this.jTableDatosIngrediente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingIngrediente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingIngrediente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingIngrediente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaIngrediente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesIngrediente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasIngrediente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesIngrediente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesIngrediente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !IngredienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!IngredienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualIngrediente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaIngrediente();
		
		this.inicializarActualizarBindingBotonesManualIngrediente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualIngrediente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesIngrediente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualIngrediente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualIngrediente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosIngrediente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosIngrediente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteIngrediente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormIngrediente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormIngrediente.jCheckBoxPostAccionNuevoIngrediente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormIngrediente.jCheckBoxPostAccionSinCerrarIngrediente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormIngrediente.jCheckBoxPostAccionSinMensajeIngrediente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosIngrediente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosIngrediente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteIngrediente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormIngrediente!=null) {
				this.jInternalFrameDetalleFormIngrediente.jCheckBoxPostAccionNuevoIngrediente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormIngrediente.jCheckBoxPostAccionSinCerrarIngrediente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormIngrediente.jCheckBoxPostAccionSinMensajeIngrediente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionIngrediente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionIngrediente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormIngrediente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesIngrediente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoIngrediente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesIngrediente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesIngrediente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarIngrediente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesIngrediente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoIngrediente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesIngrediente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralIngrediente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesIngrediente(Boolean esInicializar) throws Exception {
		try	{	
			if(IngredienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualIngrediente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesIngrediente() throws Exception {
		try	{
			if(IngredienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualIngrediente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleIngrediente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualIngrediente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesIngrediente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesIngrediente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesIngrediente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesIngrediente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesIngrediente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesIngrediente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionIngrediente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionIngrediente.addItem(reporte);
			}
			
			
			if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionIngrediente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionIngrediente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesIngrediente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesIngrediente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesIngrediente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesIngrediente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarIngrediente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarIngrediente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarIngrediente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIngrediente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIngrediente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoIngrediente!=null) {
				this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoIngrediente!=null) {
				this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoIngrediente!=null) {
				
				if(this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoIngrediente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoIngrediente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIngrediente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=IngredienteConstantesFunciones.getTiposSeleccionarIngrediente(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=IngredienteConstantesFunciones.getTiposSeleccionarIngrediente(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=IngredienteConstantesFunciones.getTiposSeleccionarIngrediente(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIngrediente.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoIngrediente.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualIngrediente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaIngrediente.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaIngrediente.getSelectedItem()).getId();}
		if(this.jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.getSelectedItem()!=null){this.id_bodega_relacionFK_IdBodegaRelacion=((Bodega)this.jComboBoxid_bodega_relacionFK_IdBodegaRelacionIngrediente.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoIngrediente.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoIngrediente.getSelectedItem()).getId();}
		if(this.jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.getSelectedItem()!=null){this.id_producto_relacionFK_IdProductoRelacion=((Producto)this.jComboBoxid_producto_relacionFK_IdProductoRelacionIngrediente.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasIngrediente(Boolean esInicializar) throws Exception {				
		if(IngredienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualIngrediente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaIngrediente() throws Exception {
		this.inicializarActualizarBindingTablaIngrediente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByIngrediente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosIngredienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngredienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaIngrediente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ingredienteLogic.getIngredientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ingredientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(IngredienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosIngrediente.setModel(new IngredienteModel(this.ingredienteLogic.getIngredientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosIngrediente.setModel(new IngredienteModel(this.ingredientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByIngrediente!=null && this.jInternalFrameOrderByIngrediente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByIngrediente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+IngredienteConstantesFunciones.SCLASSWEBTITULO,ingredienteConstantesFunciones.resaltarSeleccionarIngrediente,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+IngredienteConstantesFunciones.SCLASSWEBTITULO,ingredienteConstantesFunciones.resaltarSeleccionarIngrediente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_ID));

		if(this.ingredienteConstantesFunciones.mostraridIngrediente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngredienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ingredienteConstantesFunciones.resaltaridIngrediente,this.ingredienteConstantesFunciones.activaridIngrediente,iSizeTabla,this,true,"idIngrediente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingredienteConstantesFunciones.resaltaridIngrediente,this.ingredienteConstantesFunciones.activaridIngrediente,this,true,"idIngrediente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.ingredienteConstantesFunciones.mostrarid_empresaIngrediente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngredienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.ingredienteConstantesFunciones.resaltarid_empresaIngrediente,this,this.ingredienteConstantesFunciones.activarid_empresaIngrediente,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.ingredienteConstantesFunciones.resaltarid_empresaIngrediente,this,this.ingredienteConstantesFunciones.activarid_empresaIngrediente,false,"id_empresaIngrediente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.ingredienteConstantesFunciones.mostrarid_sucursalIngrediente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngredienteConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.ingredienteConstantesFunciones.resaltarid_sucursalIngrediente,this,this.ingredienteConstantesFunciones.activarid_sucursalIngrediente,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.ingredienteConstantesFunciones.resaltarid_sucursalIngrediente,this,this.ingredienteConstantesFunciones.activarid_sucursalIngrediente,false,"id_sucursalIngrediente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_IDBODEGA));

		if(this.ingredienteConstantesFunciones.mostrarid_bodegaIngrediente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngredienteConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.ingredienteConstantesFunciones.resaltarid_bodegaIngrediente,this,this.ingredienteConstantesFunciones.activarid_bodegaIngrediente,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.ingredienteConstantesFunciones.resaltarid_bodegaIngrediente,this,this.ingredienteConstantesFunciones.activarid_bodegaIngrediente,true,"id_bodegaIngrediente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_IDBODEGARELACION));

		if(this.ingredienteConstantesFunciones.mostrarid_bodega_relacionIngrediente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngredienteConstantesFunciones.LABEL_IDBODEGARELACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegarelacionsForeignKey,this.ingredienteConstantesFunciones.resaltarid_bodega_relacionIngrediente,this,this.ingredienteConstantesFunciones.activarid_bodega_relacionIngrediente,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegarelacionsForeignKey,this.ingredienteConstantesFunciones.resaltarid_bodega_relacionIngrediente,this,this.ingredienteConstantesFunciones.activarid_bodega_relacionIngrediente,true,"id_bodega_relacionIngrediente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.ingredienteConstantesFunciones.mostrarid_productoIngrediente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngredienteConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.ingredienteConstantesFunciones.resaltarid_productoIngrediente,this,this.ingredienteConstantesFunciones.activarid_productoIngrediente,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.ingredienteConstantesFunciones.resaltarid_productoIngrediente,this,this.ingredienteConstantesFunciones.activarid_productoIngrediente,true,"id_productoIngrediente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION));

		if(this.ingredienteConstantesFunciones.mostrarid_producto_relacionIngrediente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productorelacionsForeignKey,this.ingredienteConstantesFunciones.resaltarid_producto_relacionIngrediente,this,this.ingredienteConstantesFunciones.activarid_producto_relacionIngrediente,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productorelacionsForeignKey,this.ingredienteConstantesFunciones.resaltarid_producto_relacionIngrediente,this,this.ingredienteConstantesFunciones.activarid_producto_relacionIngrediente,true,"id_producto_relacionIngrediente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_CANTIDAD));

		if(this.ingredienteConstantesFunciones.mostrarcantidadIngrediente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngredienteConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ingredienteConstantesFunciones.resaltarcantidadIngrediente,this.ingredienteConstantesFunciones.activarcantidadIngrediente,iSizeTabla,this,true,"cantidadIngrediente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingredienteConstantesFunciones.resaltarcantidadIngrediente,this.ingredienteConstantesFunciones.activarcantidadIngrediente,this,true,"cantidadIngrediente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,IngredienteConstantesFunciones.LABEL_PRECIO));

		if(this.ingredienteConstantesFunciones.mostrarprecioIngrediente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngredienteConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ingredienteConstantesFunciones.resaltarprecioIngrediente,this.ingredienteConstantesFunciones.activarprecioIngrediente,iSizeTabla,this,true,"precioIngrediente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingredienteConstantesFunciones.resaltarprecioIngrediente,this.ingredienteConstantesFunciones.activarprecioIngrediente,this,true,"precioIngrediente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new IngredientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ingredienteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ingredienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ingredienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosIngrediente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ingredienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ingredienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosIngrediente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarIngrediente && this.isPermisoGuardarCambiosIngrediente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ingredienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ingredienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosIngrediente.addColumn(tableColumn);
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
			
			this.jTableDatosIngrediente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarIngrediente && this.isPermisoGuardarCambiosIngrediente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarIngrediente && this.isPermisoGuardarCambiosIngrediente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosIngrediente.moveColumn(this.jTableDatosIngrediente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosIngrediente.moveColumn(this.jTableDatosIngrediente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosIngrediente.moveColumn(this.jTableDatosIngrediente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosIngrediente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosIngrediente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosIngrediente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!IngredienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosIngrediente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosIngrediente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!IngredienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!IngredienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosIngrediente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosIngrediente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosIngrediente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=ingredienteLogic.getIngredientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ingredientes.size()-1;
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
		//this.jTableDatosIngrediente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosIngrediente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosIngrediente();
			
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
				
				//this.isEsNuevoIngrediente=false;
					
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			
				if(this.ingredienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormIngrediente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosIngrediente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosIngrediente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ingrediente.getsType().equals("DUPLICADO")
				   || this.ingrediente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoIngrediente=true;
				
				} else {
					this.isEsNuevoIngrediente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
					if(this.ingrediente.getId()>=0 && !this.ingrediente.getIsNew()) {						
						this.isEsNuevoIngrediente=false;
						
					} else {
						this.isEsNuevoIngrediente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoIngrediente(esRelaciones);						
				
				this.seleccionarIngrediente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ingrediente.getId()<0) {
					this.isEsNuevoIngrediente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarIngrediente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarIngrediente(evt,rowIndex);
				}	
				
				if(this.ingredienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Ingrediente: " + this.dDif); 
					}
				}								
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarIngrediente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ingrediente)) {
					if(this.ingrediente.getId()>0) {
						this.ingrediente.setIsDeleted(true);
						
						this.ingredientesEliminados.add(this.ingrediente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ingredienteLogic.getIngredientes().remove(this.ingrediente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ingredientes.remove(this.ingrediente);				
					}
					
					
					((IngredienteModel) this.jTableDatosIngrediente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaIngrediente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarIngrediente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoIngrediente) {
			
			if(this.jInternalFrameDetalleFormIngrediente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosIngrediente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosIngrediente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(IngredienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioIngrediente(this.ingrediente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.ingredienteConstantesFunciones.cargarid_empresaIngrediente || this.ingredienteConstantesFunciones.event_dependid_empresaIngrediente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.ingrediente.getid_empresa());
									//this.inicializarActualizarBindingIngrediente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(ingrediente.getEmpresa()!=null) {
							this.empresasForeignKey.add(ingrediente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.ingrediente.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.ingredienteConstantesFunciones.cargarid_sucursalIngrediente || this.ingredienteConstantesFunciones.event_dependid_sucursalIngrediente) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.ingrediente.getid_sucursal());
									//this.inicializarActualizarBindingIngrediente(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(ingrediente.getSucursal()!=null) {
							this.sucursalsForeignKey.add(ingrediente.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.ingrediente.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.ingredienteConstantesFunciones.cargarid_bodegaIngrediente || this.ingredienteConstantesFunciones.event_dependid_bodegaIngrediente) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.ingrediente.getid_bodega());
									//this.inicializarActualizarBindingIngrediente(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(ingrediente.getBodega()!=null) {
							this.bodegasForeignKey.add(ingrediente.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.ingrediente.getid_bodega(),false,"Formulario");

					//BodegaRelacion
					if(!this.ingredienteConstantesFunciones.cargarid_bodega_relacionIngrediente || this.ingredienteConstantesFunciones.event_dependid_bodega_relacionIngrediente) {
						//this.cargarCombosBodegaRelacionsForeignKeyLista(" where id="+this.ingrediente.getid_bodega_relacion());
									//this.inicializarActualizarBindingIngrediente(false,false);
						this.bodegarelacionsForeignKey=new ArrayList<Bodega>();

						if(ingrediente.getBodegaRelacion()!=null) {
							this.bodegarelacionsForeignKey.add(ingrediente.getBodegaRelacion());
						}

						this.addItemDefectoCombosForeignKeyBodegaRelacion();
						this.cargarCombosFrameBodegaRelacionsForeignKey("Todos");
					}
					this.setActualBodegaRelacionForeignKey(this.ingrediente.getid_bodega_relacion(),false,"Formulario");

					//Producto
					if(!this.ingredienteConstantesFunciones.cargarid_productoIngrediente || this.ingredienteConstantesFunciones.event_dependid_productoIngrediente) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.ingrediente.getid_producto());
									//this.inicializarActualizarBindingIngrediente(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(ingrediente.getProducto()!=null) {
							this.productosForeignKey.add(ingrediente.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.ingrediente.getid_producto(),false,"Formulario");

					//ProductoRelacion
					if(!this.ingredienteConstantesFunciones.cargarid_producto_relacionIngrediente || this.ingredienteConstantesFunciones.event_dependid_producto_relacionIngrediente) {
						//this.cargarCombosProductoRelacionsForeignKeyLista(" where id="+this.ingrediente.getid_producto_relacion());
									//this.inicializarActualizarBindingIngrediente(false,false);
						this.productorelacionsForeignKey=new ArrayList<Producto>();

						if(ingrediente.getProductoRelacion()!=null) {
							this.productorelacionsForeignKey.add(ingrediente.getProductoRelacion());
						}

						this.addItemDefectoCombosForeignKeyProductoRelacion();
						this.cargarCombosFrameProductoRelacionsForeignKey("Todos");
					}
					this.setActualProductoRelacionForeignKey(this.ingrediente.getid_producto_relacion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesIngrediente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesIngrediente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIngrediente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoIngrediente(Ingrediente ingrediente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoIngrediente(ingrediente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoIngrediente(Ingrediente ingrediente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioIngrediente(ingrediente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyIngrediente(ingrediente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyIngrediente(ingrediente);
	}
	
	public void setVariablesObjetoActualToFormularioIngrediente(Ingrediente ingrediente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormIngrediente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormIngrediente.jLabelidIngrediente.setText(ingrediente.getId().toString());
			this.jInternalFrameDetalleFormIngrediente.jTextFieldcantidadIngrediente.setText(ingrediente.getcantidad().toString());
			this.jInternalFrameDetalleFormIngrediente.jTextFieldprecioIngrediente.setText(ingrediente.getprecio().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Ingrediente ingredienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ingredienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Ingrediente ingredienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ingredienteLocal=this.ingrediente;
			} else {
				ingredienteLocal=this.ingredienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ingredienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoIngrediente(ingredienteLocal,true);
					
					if(ingredienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ingredienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ingredienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ingredienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoIngrediente(Ingrediente ingrediente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualIngrediente(ingrediente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(ingrediente);
	}
	
	public void setVariablesFormularioToObjetoActualIngrediente(Ingrediente ingrediente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualIngrediente(ingrediente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualIngrediente(Ingrediente ingrediente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormIngrediente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormIngrediente.jLabelidIngrediente.getText()==null || this.jInternalFrameDetalleFormIngrediente.jLabelidIngrediente.getText()=="" || this.jInternalFrameDetalleFormIngrediente.jLabelidIngrediente.getText()=="Id") {
				this.jInternalFrameDetalleFormIngrediente.jLabelidIngrediente.setText("0");
			}

			if(conColumnasBase) {ingrediente.setId(Long.parseLong(this.jInternalFrameDetalleFormIngrediente.jLabelidIngrediente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngredienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngrediente.jLabelIdIngrediente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingrediente.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormIngrediente.jTextFieldcantidadIngrediente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngredienteConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngrediente.jLabelcantidadIngrediente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingrediente.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormIngrediente.jTextFieldprecioIngrediente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngredienteConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngrediente.jLabelprecioIngrediente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualIngrediente(Ingrediente ingredienteBean,Ingrediente ingrediente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && ingredienteBean.getid_bodega()!=null && !ingredienteBean.getid_bodega().equals(-1L))) {ingrediente.setid_bodega(ingredienteBean.getid_bodega());}
			if(conDefault || (!conDefault && ingredienteBean.getid_bodega_relacion()!=null && !ingredienteBean.getid_bodega_relacion().equals(-1L))) {ingrediente.setid_bodega_relacion(ingredienteBean.getid_bodega_relacion());}
			if(conDefault || (!conDefault && ingredienteBean.getid_producto()!=null && !ingredienteBean.getid_producto().equals(-1L))) {ingrediente.setid_producto(ingredienteBean.getid_producto());}
			if(conDefault || (!conDefault && ingredienteBean.getid_producto_relacion()!=null && !ingredienteBean.getid_producto_relacion().equals(-1L))) {ingrediente.setid_producto_relacion(ingredienteBean.getid_producto_relacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosIngrediente(Ingrediente ingredienteOrigen,Ingrediente ingrediente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ingredienteOrigen.getId()!=null && !ingredienteOrigen.getId().equals(0L))) {ingrediente.setId(ingredienteOrigen.getId());}}
			if(conDefault || (!conDefault && ingredienteOrigen.getid_bodega()!=null && !ingredienteOrigen.getid_bodega().equals(-1L))) {ingrediente.setid_bodega(ingredienteOrigen.getid_bodega());}
			if(conDefault || (!conDefault && ingredienteOrigen.getid_bodega_relacion()!=null && !ingredienteOrigen.getid_bodega_relacion().equals(-1L))) {ingrediente.setid_bodega_relacion(ingredienteOrigen.getid_bodega_relacion());}
			if(conDefault || (!conDefault && ingredienteOrigen.getid_producto()!=null && !ingredienteOrigen.getid_producto().equals(-1L))) {ingrediente.setid_producto(ingredienteOrigen.getid_producto());}
			if(conDefault || (!conDefault && ingredienteOrigen.getid_producto_relacion()!=null && !ingredienteOrigen.getid_producto_relacion().equals(-1L))) {ingrediente.setid_producto_relacion(ingredienteOrigen.getid_producto_relacion());}
			if(conDefault || (!conDefault && ingredienteOrigen.getcantidad()!=null && !ingredienteOrigen.getcantidad().equals(0))) {ingrediente.setcantidad(ingredienteOrigen.getcantidad());}
			if(conDefault || (!conDefault && ingredienteOrigen.getprecio()!=null && !ingredienteOrigen.getprecio().equals(0.0))) {ingrediente.setprecio(ingredienteOrigen.getprecio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioIngrediente(Ingrediente ingrediente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormIngrediente.jLabelidIngrediente.setText(ingrediente.getId().toString());
			this.jInternalFrameDetalleFormIngrediente.jTextFieldcantidadIngrediente.setText(ingrediente.getcantidad().toString());
			this.jInternalFrameDetalleFormIngrediente.jTextFieldprecioIngrediente.setText(ingrediente.getprecio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioIngrediente(IngredienteBean ingredienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormIngrediente.jLabelidIngrediente.setText(ingredienteBean.getId().toString());
			this.jInternalFrameDetalleFormIngrediente.jTextFieldcantidadIngrediente.setText(ingredienteBean.getcantidad().toString());
			this.jInternalFrameDetalleFormIngrediente.jTextFieldprecioIngrediente.setText(ingredienteBean.getprecio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanIngrediente(IngredienteParameterReturnGeneral ingredienteReturnGeneral,IngredienteBean ingredienteBean,Boolean conDefault) throws Exception { 
		try {
			Ingrediente ingredienteLocal=new Ingrediente();
			
			ingredienteLocal=ingredienteReturnGeneral.getIngrediente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ingredienteLocal.getId()!=null && !ingredienteLocal.getId().equals(0L))) {ingredienteBean.setId(ingredienteLocal.getId());}}
			if(conDefault || (!conDefault && ingredienteLocal.getid_bodega()!=null && !ingredienteLocal.getid_bodega().equals(-1L))) {ingredienteBean.setid_bodega(ingredienteLocal.getid_bodega());}
			if(conDefault || (!conDefault && ingredienteLocal.getid_bodega_relacion()!=null && !ingredienteLocal.getid_bodega_relacion().equals(-1L))) {ingredienteBean.setid_bodega_relacion(ingredienteLocal.getid_bodega_relacion());}
			if(conDefault || (!conDefault && ingredienteLocal.getid_producto()!=null && !ingredienteLocal.getid_producto().equals(-1L))) {ingredienteBean.setid_producto(ingredienteLocal.getid_producto());}
			if(conDefault || (!conDefault && ingredienteLocal.getid_producto_relacion()!=null && !ingredienteLocal.getid_producto_relacion().equals(-1L))) {ingredienteBean.setid_producto_relacion(ingredienteLocal.getid_producto_relacion());}
			if(conDefault || (!conDefault && ingredienteLocal.getcantidad()!=null && !ingredienteLocal.getcantidad().equals(0))) {ingredienteBean.setcantidad(ingredienteLocal.getcantidad());}
			if(conDefault || (!conDefault && ingredienteLocal.getprecio()!=null && !ingredienteLocal.getprecio().equals(0.0))) {ingredienteBean.setprecio(ingredienteLocal.getprecio());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxIngredienteGenerico(Long idIngredienteSeleccionado,JComboBox jComboBoxIngrediente,List<Ingrediente> ingredientesLocal)throws Exception {
		try {
			Ingrediente  ingredienteTemp=null;

			for(Ingrediente ingredienteAux:ingredientesLocal) {
				if(ingredienteAux.getId()!=null && ingredienteAux.getId().equals(idIngredienteSeleccionado)) {
					ingredienteTemp=ingredienteAux;
					break;
				}
			}

			jComboBoxIngrediente.setSelectedItem(ingredienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxIngredienteGenerico(JComboBox jComboBoxIngrediente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxIngrediente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxIngrediente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxIngrediente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxIngrediente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ingrediente=(Ingrediente) ingredienteLogic.getIngredientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ingrediente =(Ingrediente) ingredientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ingrediente.getIsNew() && !ingrediente.getIsChanged() && !ingrediente.getIsDeleted()) {
				sDescripcion=ingrediente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ingrediente.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!ingrediente.getIsNew() && !ingrediente.getIsChanged() && !ingrediente.getIsDeleted()) {
				sDescripcion=ingrediente.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=ingrediente.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!ingrediente.getIsNew() && !ingrediente.getIsChanged() && !ingrediente.getIsDeleted()) {
				sDescripcion=ingrediente.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=ingrediente.getbodega_descripcion();
			}
		}

		if(sTipo.equals("BodegaRelacion")) {
			//sDescripcion=this.getActualBodegaRelacionForeignKeyDescripcion((Long)value);
			if(!ingrediente.getIsNew() && !ingrediente.getIsChanged() && !ingrediente.getIsDeleted()) {
				sDescripcion=ingrediente.getbodegarelacion_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaRelacionForeignKeyDescripcion((Long)value);
				sDescripcion=ingrediente.getbodegarelacion_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!ingrediente.getIsNew() && !ingrediente.getIsChanged() && !ingrediente.getIsDeleted()) {
				sDescripcion=ingrediente.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=ingrediente.getproducto_descripcion();
			}
		}

		if(sTipo.equals("ProductoRelacion")) {
			//sDescripcion=this.getActualProductoRelacionForeignKeyDescripcion((Long)value);
			if(!ingrediente.getIsNew() && !ingrediente.getIsChanged() && !ingrediente.getIsDeleted()) {
				sDescripcion=ingrediente.getproductorelacion_descripcion();
			} else {
				//sDescripcion=this.getActualProductoRelacionForeignKeyDescripcion((Long)value);
				sDescripcion=ingrediente.getproductorelacion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Ingrediente ingredienteRow=new Ingrediente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ingredienteRow=(Ingrediente) ingredienteLogic.getIngredientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ingredienteRow=(Ingrediente) ingredientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualIngrediente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoIngrediente.setVisible((this.isVisibilidadCeldaNuevoIngrediente && this.isPermisoNuevoIngrediente));			
			this.jButtonDuplicarIngrediente.setVisible((this.isVisibilidadCeldaDuplicarIngrediente && this.isPermisoDuplicarIngrediente));			
			this.jButtonCopiarIngrediente.setVisible((this.isVisibilidadCeldaCopiarIngrediente && this.isPermisoCopiarIngrediente));
			this.jButtonVerFormIngrediente.setVisible((this.isVisibilidadCeldaVerFormIngrediente && this.isPermisoVerFormIngrediente));
			
			this.jButtonAbrirOrderByIngrediente.setVisible((this.isVisibilidadCeldaOrdenIngrediente && this.isPermisoOrdenIngrediente));			
			
			this.jButtonNuevoRelacionesIngrediente.setVisible((this.isVisibilidadCeldaNuevoRelacionesIngrediente && this.isPermisoNuevoIngrediente));			
			this.jButtonNuevoGuardarCambiosIngrediente.setVisible((this.isVisibilidadCeldaNuevoIngrediente && this.isPermisoNuevoIngrediente && this.isPermisoGuardarCambiosIngrediente));
			
			if(this.jInternalFrameDetalleFormIngrediente!=null) {
			this.jInternalFrameDetalleFormIngrediente.jButtonModificarIngrediente.setVisible((this.isVisibilidadCeldaModificarIngrediente && this.isPermisoActualizarIngrediente));	
			this.jInternalFrameDetalleFormIngrediente.jButtonActualizarIngrediente.setVisible((this.isVisibilidadCeldaActualizarIngrediente && this.isPermisoActualizarIngrediente));	
			this.jInternalFrameDetalleFormIngrediente.jButtonEliminarIngrediente.setVisible((this.isVisibilidadCeldaEliminarIngrediente && this.isPermisoEliminarIngrediente));
			this.jInternalFrameDetalleFormIngrediente.jButtonCancelarIngrediente.setVisible(this.isVisibilidadCeldaCancelarIngrediente);							
			this.jInternalFrameDetalleFormIngrediente.jButtonGuardarCambiosIngrediente.setVisible((this.isVisibilidadCeldaGuardarIngrediente && this.isPermisoGuardarCambiosIngrediente));			
			
			}
						
			this.jButtonGuardarCambiosTablaIngrediente.setVisible((this.isVisibilidadCeldaGuardarCambiosIngrediente && this.isPermisoGuardarCambiosIngrediente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarIngrediente.setVisible((this.isVisibilidadCeldaNuevoIngrediente && this.isPermisoNuevoIngrediente));						
			this.jButtonDuplicarToolBarIngrediente.setVisible((this.isVisibilidadCeldaDuplicarIngrediente && this.isPermisoDuplicarIngrediente));						
			this.jButtonCopiarToolBarIngrediente.setVisible((this.isVisibilidadCeldaCopiarIngrediente && this.isPermisoCopiarIngrediente));			
			this.jButtonVerFormToolBarIngrediente.setVisible((this.isVisibilidadCeldaVerFormIngrediente && this.isPermisoVerFormIngrediente));			
			this.jButtonAbrirOrderByToolBarIngrediente.setVisible((this.isVisibilidadCeldaOrdenIngrediente && this.isPermisoOrdenIngrediente));
			this.jButtonNuevoRelacionesToolBarIngrediente.setVisible((this.isVisibilidadCeldaNuevoRelacionesIngrediente && this.isPermisoNuevoIngrediente));			
			this.jButtonNuevoGuardarCambiosToolBarIngrediente.setVisible((this.isVisibilidadCeldaNuevoIngrediente && this.isPermisoNuevoIngrediente && this.isPermisoGuardarCambiosIngrediente));			
			
			if(this.jInternalFrameDetalleFormIngrediente!=null) {
			this.jInternalFrameDetalleFormIngrediente.jButtonModificarToolBarIngrediente.setVisible((this.isVisibilidadCeldaModificarIngrediente && this.isPermisoActualizarIngrediente));	
			this.jInternalFrameDetalleFormIngrediente.jButtonActualizarToolBarIngrediente.setVisible((this.isVisibilidadCeldaActualizarIngrediente  && this.isPermisoActualizarIngrediente));	
			this.jInternalFrameDetalleFormIngrediente.jButtonEliminarToolBarIngrediente.setVisible((this.isVisibilidadCeldaEliminarIngrediente && this.isPermisoEliminarIngrediente));
			this.jInternalFrameDetalleFormIngrediente.jButtonCancelarToolBarIngrediente.setVisible(this.isVisibilidadCeldaCancelarIngrediente);				
			this.jInternalFrameDetalleFormIngrediente.jButtonGuardarCambiosToolBarIngrediente.setVisible((this.isVisibilidadCeldaGuardarIngrediente && this.isPermisoGuardarCambiosIngrediente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarIngrediente.setVisible((this.isVisibilidadCeldaGuardarCambiosIngrediente && this.isPermisoGuardarCambiosIngrediente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoIngrediente.setVisible((this.isVisibilidadCeldaNuevoIngrediente && this.isPermisoNuevoIngrediente));			
			this.jMenuItemDuplicarIngrediente.setVisible((this.isVisibilidadCeldaDuplicarIngrediente && this.isPermisoDuplicarIngrediente));			
			this.jMenuItemCopiarIngrediente.setVisible((this.isVisibilidadCeldaCopiarIngrediente && this.isPermisoCopiarIngrediente));			
			this.jMenuItemVerFormIngrediente.setVisible((this.isVisibilidadCeldaVerFormIngrediente && this.isPermisoVerFormIngrediente));			
			this.jMenuItemAbrirOrderByIngrediente.setVisible((this.isVisibilidadCeldaOrdenIngrediente && this.isPermisoOrdenIngrediente));			
			//this.jMenuItemMostrarOcultarIngrediente.setVisible((this.isVisibilidadCeldaOrdenIngrediente && this.isPermisoOrdenIngrediente));
			this.jMenuItemDetalleAbrirOrderByIngrediente.setVisible((this.isVisibilidadCeldaOrdenIngrediente && this.isPermisoOrdenIngrediente));			
			//this.jMenuItemDetalleMostrarOcultarIngrediente.setVisible((this.isVisibilidadCeldaOrdenIngrediente && this.isPermisoOrdenIngrediente));			
			this.jMenuItemNuevoRelacionesIngrediente.setVisible((this.isVisibilidadCeldaNuevoRelacionesIngrediente && this.isPermisoNuevoIngrediente));			
			this.jMenuItemNuevoGuardarCambiosIngrediente.setVisible((this.isVisibilidadCeldaNuevoIngrediente && this.isPermisoNuevoIngrediente && this.isPermisoGuardarCambiosIngrediente));									
			
			if(this.jInternalFrameDetalleFormIngrediente!=null) {
			this.jInternalFrameDetalleFormIngrediente.jMenuItemModificarIngrediente.setVisible((this.isVisibilidadCeldaModificarIngrediente && this.isPermisoActualizarIngrediente));	
			this.jInternalFrameDetalleFormIngrediente.jMenuItemActualizarIngrediente.setVisible((this.isVisibilidadCeldaActualizarIngrediente && this.isPermisoActualizarIngrediente));	
			this.jInternalFrameDetalleFormIngrediente.jMenuItemEliminarIngrediente.setVisible((this.isVisibilidadCeldaEliminarIngrediente && this.isPermisoEliminarIngrediente));
			this.jInternalFrameDetalleFormIngrediente.jMenuItemCancelarIngrediente.setVisible(this.isVisibilidadCeldaCancelarIngrediente);				
			}
			
			this.jMenuItemGuardarCambiosIngrediente.setVisible((this.isVisibilidadCeldaGuardarIngrediente && this.isPermisoGuardarCambiosIngrediente));						
			this.jMenuItemGuardarCambiosTablaIngrediente.setVisible((this.isVisibilidadCeldaGuardarCambiosIngrediente && this.isPermisoGuardarCambiosIngrediente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoIngrediente=this.jButtonNuevoIngrediente.isVisible();
			this.isVisibilidadCeldaDuplicarIngrediente=this.jButtonDuplicarIngrediente.isVisible();
			this.isVisibilidadCeldaCopiarIngrediente=this.jButtonCopiarIngrediente.isVisible();
			this.isVisibilidadCeldaVerFormIngrediente=this.jButtonVerFormIngrediente.isVisible();
			
			this.isVisibilidadCeldaOrdenIngrediente=this.jButtonAbrirOrderByIngrediente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=this.jButtonNuevoRelacionesIngrediente.isVisible();
			this.isVisibilidadCeldaModificarIngrediente=this.jButtonModificarIngrediente.isVisible();
			
			if(this.jInternalFrameDetalleFormIngrediente!=null) {
			this.isVisibilidadCeldaActualizarIngrediente=this.jInternalFrameDetalleFormIngrediente.jButtonActualizarIngrediente.isVisible();
			this.isVisibilidadCeldaEliminarIngrediente=this.jInternalFrameDetalleFormIngrediente.jButtonEliminarIngrediente.isVisible();
			this.isVisibilidadCeldaCancelarIngrediente=this.jInternalFrameDetalleFormIngrediente.jButtonCancelarIngrediente.isVisible();
			this.isVisibilidadCeldaGuardarIngrediente=this.jInternalFrameDetalleFormIngrediente.jButtonGuardarCambiosIngrediente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosIngrediente=this.jButtonGuardarCambiosTablaIngrediente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoIngrediente=this.jButtonNuevoToolBarIngrediente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=this.jButtonNuevoRelacionesToolBarIngrediente.isVisible();
			
			if(this.jInternalFrameDetalleFormIngrediente!=null) {
			this.isVisibilidadCeldaModificarIngrediente=this.jInternalFrameDetalleFormIngrediente.jButtonModificarToolBarIngrediente.isVisible();
			this.isVisibilidadCeldaActualizarIngrediente=this.jInternalFrameDetalleFormIngrediente.jButtonActualizarToolBarIngrediente.isVisible();
			this.isVisibilidadCeldaEliminarIngrediente=this.jInternalFrameDetalleFormIngrediente.jButtonEliminarToolBarIngrediente.isVisible();
			this.isVisibilidadCeldaCancelarIngrediente=this.jInternalFrameDetalleFormIngrediente.jButtonCancelarToolBarIngrediente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarIngrediente=this.jButtonGuardarCambiosToolBarIngrediente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosIngrediente=this.jButtonGuardarCambiosTablaToolBarIngrediente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoIngrediente=this.jMenuItemNuevoIngrediente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=this.jMenuItemNuevoRelacionesIngrediente.isVisible();
			
			if(this.jInternalFrameDetalleFormIngrediente!=null) {
			this.isVisibilidadCeldaModificarIngrediente=this.jInternalFrameDetalleFormIngrediente.jMenuItemModificarIngrediente.isVisible();
			this.isVisibilidadCeldaActualizarIngrediente=this.jInternalFrameDetalleFormIngrediente.jMenuItemActualizarIngrediente.isVisible();
			this.isVisibilidadCeldaEliminarIngrediente=this.jInternalFrameDetalleFormIngrediente.jMenuItemEliminarIngrediente.isVisible();
			this.isVisibilidadCeldaCancelarIngrediente=this.jInternalFrameDetalleFormIngrediente.jMenuItemCancelarIngrediente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarIngrediente=this.jMenuItemGuardarCambiosIngrediente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosIngrediente=this.jMenuItemGuardarCambiosTablaIngrediente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesIngrediente(Boolean esInicializar) {
		if(IngredienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ingredienteSessionBean.getConGuardarRelaciones()) {
				//if(this.ingredienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesIngrediente();
			}
			
			this.inicializarActualizarBindingBotonesManualIngrediente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualIngrediente() {
		this.jButtonNuevoIngrediente.setVisible(this.isPermisoNuevoIngrediente);			
		this.jButtonDuplicarIngrediente.setVisible(this.isPermisoDuplicarIngrediente);			
		this.jButtonCopiarIngrediente.setVisible(this.isPermisoCopiarIngrediente);			
		this.jButtonVerFormIngrediente.setVisible(this.isPermisoVerFormIngrediente);			
		
		this.jButtonAbrirOrderByIngrediente.setVisible(this.isPermisoOrdenIngrediente);					
		
		this.jButtonNuevoRelacionesIngrediente.setVisible(this.isPermisoNuevoIngrediente);			
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jButtonModificarIngrediente.setVisible(this.isPermisoActualizarIngrediente);	
			this.jInternalFrameDetalleFormIngrediente.jButtonActualizarIngrediente.setVisible(this.isPermisoActualizarIngrediente);	
			this.jInternalFrameDetalleFormIngrediente.jButtonEliminarIngrediente.setVisible(this.isPermisoEliminarIngrediente);
			this.jInternalFrameDetalleFormIngrediente.jButtonCancelarIngrediente.setVisible(this.isVisibilidadCeldaCancelarIngrediente);						
			this.jInternalFrameDetalleFormIngrediente.jButtonGuardarCambiosIngrediente.setVisible(this.isPermisoGuardarCambiosIngrediente);							
		}
		
		this.jButtonGuardarCambiosTablaIngrediente.setVisible(this.isPermisoActualizarIngrediente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleIngrediente() {
		this.jInternalFrameDetalleFormIngrediente.jButtonModificarIngrediente.setVisible(this.isPermisoActualizarIngrediente);	
		this.jInternalFrameDetalleFormIngrediente.jButtonActualizarIngrediente.setVisible(this.isPermisoActualizarIngrediente);	
		this.jInternalFrameDetalleFormIngrediente.jButtonEliminarIngrediente.setVisible(this.isPermisoEliminarIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jButtonCancelarIngrediente.setVisible(this.isVisibilidadCeldaCancelarIngrediente);							
		this.jInternalFrameDetalleFormIngrediente.jButtonGuardarCambiosIngrediente.setVisible((this.isVisibilidadCeldaGuardarIngrediente && this.isPermisoGuardarCambiosIngrediente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosIngrediente() {
		if(IngredienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualIngrediente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesIngrediente() {
	}
	
	public void jTableDatosIngredienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarIngrediente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidIngredienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingrediente==null) {
						this.ingrediente = new Ingrediente();
					}

					this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
				}

				if(this.ingrediente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ingrediente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngrediente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaIngredienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebIngrediente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosIngrediente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosIngrediente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ingredienteLogic.getConnexion());

				if(this.ingrediente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ingrediente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderIngrediente=(TitledBorder)this.jScrollPanelDatosIngrediente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderIngrediente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaIngredienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingrediente==null) {
						this.ingrediente = new Ingrediente();
					}

					this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
				}

				if(this.ingrediente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ingrediente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngrediente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalIngredienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebIngrediente(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosIngrediente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosIngrediente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.ingredienteLogic.getConnexion());

				if(this.ingrediente.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.ingrediente.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderIngrediente=(TitledBorder)this.jScrollPanelDatosIngrediente.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderIngrediente.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalIngredienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingrediente==null) {
						this.ingrediente = new Ingrediente();
					}

					this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
				}

				if(this.ingrediente.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.ingrediente.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngrediente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaIngredienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebIngrediente(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosIngrediente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosIngrediente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.ingredienteLogic.getConnexion());

				if(this.ingrediente.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.ingrediente.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderIngrediente=(TitledBorder)this.jScrollPanelDatosIngrediente.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderIngrediente.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaIngredienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingrediente==null) {
						this.ingrediente = new Ingrediente();
					}

					this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
				}

				if(this.ingrediente.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.ingrediente.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngrediente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodega_relacionIngredienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodegarelacion=true;

			idTienePermisobodegarelacion=this.tienePermisosUsuarioEnPaginaWebIngrediente(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodegarelacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosIngrediente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosIngrediente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);

				this.bodegarelacionBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegarelacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegarelacionBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.ingredienteLogic.getConnexion());

				if(this.ingrediente.getid_bodega_relacion()!=null) {
					this.bodegarelacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegarelacionBeanSwingJInternalFrame.setIdActual(this.ingrediente.getid_bodega_relacion());
					this.bodegarelacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegarelacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegarelacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegarelacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderIngrediente=(TitledBorder)this.jScrollPanelDatosIngrediente.getBorder();
				TitledBorder titledBorderbodegarelacion=(TitledBorder)this.bodegarelacionBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodegarelacion.setTitle(titledBorderIngrediente.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodega_relacionIngredienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingrediente==null) {
						this.ingrediente = new Ingrediente();
					}

					this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
				}

				if(this.ingrediente.getid_bodega_relacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega_relacion = "+this.ingrediente.getid_bodega_relacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngrediente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoIngredienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderIngrediente=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosIngrediente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderIngrediente=(TitledBorder)this.jScrollPanelDatosIngrediente.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderIngrediente.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoIngredienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebIngrediente(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosIngrediente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosIngrediente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.ingredienteLogic.getConnexion());

				if(this.ingrediente.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.ingrediente.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderIngrediente=(TitledBorder)this.jScrollPanelDatosIngrediente.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderIngrediente.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoIngredienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingrediente==null) {
						this.ingrediente = new Ingrediente();
					}

					this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
				}

				if(this.ingrediente.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.ingrediente.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngrediente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_producto_relacionIngredienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.productorelacionBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.productorelacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.productorelacionBeanSwingJInternalFrame.sTipoBusqueda="ProductoRelacion";

			if(!this.sFinalQueryGeneral_productorelacion.equals("")) {
				this.productorelacionBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_productorelacion);
				this.productorelacionBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.productorelacionBeanSwingJInternalFrame.procesarBusqueda(this.productorelacionBeanSwingJInternalFrame.sAccionBusqueda);
				this.productorelacionBeanSwingJInternalFrame.inicializarActualizarBindingProducto(false);
			}

			if(!this.sFinalQueryComboProductoRelacion.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.productorelacionBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderIngrediente=null;
			TitledBorder titledBorderproductorelacion=null;

			if(!this.jScrollPanelDatosIngrediente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderIngrediente=(TitledBorder)this.jScrollPanelDatosIngrediente.getBorder();
				titledBorderproductorelacion=(TitledBorder)this.productorelacionBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproductorelacion.setTitle(titledBorderIngrediente.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_producto_relacionIngredienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproductorelacion=true;

			idTienePermisoproductorelacion=this.tienePermisosUsuarioEnPaginaWebIngrediente(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproductorelacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosIngrediente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosIngrediente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);

				this.productorelacionBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productorelacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productorelacionBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.ingredienteLogic.getConnexion());

				if(this.ingrediente.getid_producto_relacion()!=null) {
					this.productorelacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productorelacionBeanSwingJInternalFrame.setIdActual(this.ingrediente.getid_producto_relacion());
					this.productorelacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productorelacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productorelacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productorelacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderIngrediente=(TitledBorder)this.jScrollPanelDatosIngrediente.getBorder();
				TitledBorder titledBorderproductorelacion=(TitledBorder)this.productorelacionBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproductorelacion.setTitle(titledBorderIngrediente.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_producto_relacionIngredienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingrediente==null) {
						this.ingrediente = new Ingrediente();
					}

					this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
				}

				if(this.ingrediente.getid_producto_relacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto_relacion = "+this.ingrediente.getid_producto_relacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngrediente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadIngredienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingrediente==null) {
						this.ingrediente = new Ingrediente();
					}

					this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
				}

				if(this.ingrediente.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.ingrediente.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngrediente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioIngredienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngrediente(this.getingrediente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingrediente==null) {
						this.ingrediente = new Ingrediente();
					}

					this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);
				}

				if(this.ingrediente.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.ingrediente.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngrediente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaIngredienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIngrediente(false,false);

			this.getIngredientesFK_IdBodega();

			this.inicializarActualizarBindingIngrediente(false);

			//if(IngredienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIngrediente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaRelacionIngredienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIngrediente(false,false);

			this.getIngredientesFK_IdBodegaRelacion();

			this.inicializarActualizarBindingIngrediente(false);

			//if(IngredienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIngrediente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaIngredienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIngrediente(false,false);

			this.getIngredientesFK_IdEmpresa();

			this.inicializarActualizarBindingIngrediente(false);

			//if(IngredienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIngrediente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoIngredienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIngrediente(false,false);

			this.getIngredientesFK_IdProducto();

			this.inicializarActualizarBindingIngrediente(false);

			//if(IngredienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIngrediente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoRelacionIngredienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIngrediente(false,false);

			this.getIngredientesFK_IdProductoRelacion();

			this.inicializarActualizarBindingIngrediente(false);

			//if(IngredienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIngrediente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalIngredienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIngrediente(false,false);

			this.getIngredientesFK_IdSucursal();

			this.inicializarActualizarBindingIngrediente(false);

			//if(IngredienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIngrediente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingredienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameIngrediente() {
		if(this.jInternalFrameDetalleFormIngrediente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) {
			this.jInternalFrameDetalleFormIngrediente.setVisible(false);	    			
			this.jInternalFrameDetalleFormIngrediente.dispose();
			this.jInternalFrameDetalleFormIngrediente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoIngrediente!=null) {
			this.jInternalFrameReporteDinamicoIngrediente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoIngrediente.dispose();
			this.jInternalFrameReporteDinamicoIngrediente=null;
		}
		
		if(this.jInternalFrameImportacionIngrediente!=null) {
			this.jInternalFrameImportacionIngrediente.setVisible(false);	    			
			this.jInternalFrameImportacionIngrediente.dispose();
			this.jInternalFrameImportacionIngrediente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessIngrediente();
			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoIngrediente")) {
				jButtonNuevoIngredienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarIngrediente")) {
				jButtonDuplicarIngredienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarIngrediente")) {
				jButtonCopiarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormIngrediente")) {
				jButtonVerFormIngredienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarIngrediente")) {
				jButtonNuevoIngredienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarIngrediente")) {
				jButtonDuplicarIngredienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoIngrediente")) {
				jButtonNuevoIngredienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarIngrediente")) {
				jButtonDuplicarIngredienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesIngrediente")) {
				jButtonNuevoIngredienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarIngrediente")) {
				jButtonNuevoIngredienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesIngrediente")) {
				jButtonNuevoIngredienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarIngrediente")) {
				jButtonModificarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarIngrediente")) {
				jButtonModificarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarIngrediente")) {
				jButtonModificarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarIngrediente")) {
				jButtonActualizarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarIngrediente")) {
				jButtonActualizarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarIngrediente")) {
				jButtonActualizarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarIngrediente")) {
				jButtonEliminarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarIngrediente")) {
				jButtonEliminarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarIngrediente")) {
				jButtonEliminarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarIngrediente")) {
				jButtonCancelarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarIngrediente")) {
				jButtonCancelarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarIngrediente")) {
				jButtonCancelarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarIngrediente")) {
				jButtonCerrarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarIngrediente")) {
				jButtonCerrarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarIngrediente")) {
				jButtonCerrarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarIngrediente")) {
				jButtonMostrarOcultarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarIngrediente")) {
				jButtonCancelarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosIngrediente")) {
				jButtonGuardarCambiosIngredienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarIngrediente")) {
				jButtonGuardarCambiosIngredienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarIngrediente")) {
				jButtonCopiarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarIngrediente")) {
				jButtonVerFormIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosIngrediente")) {
				jButtonGuardarCambiosIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarIngrediente")) {
				jButtonCopiarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormIngrediente")) {
				jButtonVerFormIngredienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaIngrediente")) {
				jButtonGuardarCambiosIngredienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarIngrediente")) {
				jButtonGuardarCambiosIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaIngrediente")) {
				jButtonGuardarCambiosIngredienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionIngrediente")) {
				jButtonRecargarInformacionIngredienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarIngrediente")) {
				jButtonRecargarInformacionIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionIngrediente")) {
				jButtonRecargarInformacionIngredienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresIngrediente")) {
				jButtonAnterioresIngredienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarIngrediente")) {
				jButtonAnterioresIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreIngrediente")) {
				jButtonAnterioresIngredienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesIngrediente")) {
				jButtonSiguientesIngredienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarIngrediente")) {
				jButtonSiguientesIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesIngrediente")) {
				jButtonSiguientesIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByIngrediente") || sTipo.equals("MenuItemDetalleAbrirOrderByIngrediente")) {
				jButtonAbrirOrderByIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarIngrediente") || sTipo.equals("MenuItemDetalleMostrarOcultarIngrediente")) {
				jButtonMostrarOcultarIngredienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosIngrediente")) {
				jButtonNuevoGuardarCambiosIngredienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarIngrediente")) {
				jButtonNuevoGuardarCambiosIngredienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosIngrediente")) {
				jButtonNuevoGuardarCambiosIngredienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoIngrediente")) {
				jButtonCerrarReporteDinamicoIngredienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoIngrediente")) {
				jButtonGenerarReporteDinamicoIngredienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoIngrediente")) {
				
				jButtonGenerarExcelReporteDinamicoIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionIngrediente")) {
				jButtonCerrarImportacionIngredienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionIngrediente")) {
				
				jButtonGenerarImportacionIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionIngrediente")) {
				
				jButtonAbrirImportacionIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesIngrediente")) {
				jComboBoxTiposAccionesIngredienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesIngrediente")) {
				jComboBoxTiposRelacionesIngredienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioIngrediente")) {
				jComboBoxTiposAccionesIngredienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarIngrediente")) {
				
				jComboBoxTiposSeleccionarIngredienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralIngrediente")) {
				jTextFieldValorCampoGeneralIngredienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByIngrediente")) {
				jButtonAbrirOrderByIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarIngrediente")) {
				jButtonAbrirOrderByIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByIngrediente")) {
				jButtonCerrarOrderByIngredienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idIngredienteBusqueda")) {
				this.jButtonidIngredienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaIngredienteUpdate")) {
				this.jButtonid_empresaIngredienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaIngredienteBusqueda")) {
				this.jButtonid_empresaIngredienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalIngredienteUpdate")) {
				this.jButtonid_sucursalIngredienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalIngredienteBusqueda")) {
				this.jButtonid_sucursalIngredienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaIngredienteUpdate")) {
				this.jButtonid_bodegaIngredienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaIngredienteBusqueda")) {
				this.jButtonid_bodegaIngredienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodega_relacionIngredienteUpdate")) {
				this.jButtonid_bodega_relacionIngredienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodega_relacionIngredienteBusqueda")) {
				this.jButtonid_bodega_relacionIngredienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoIngrediente")) {
				this.jButtonid_productoIngredienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoIngredienteUpdate")) {
				this.jButtonid_productoIngredienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoIngredienteBusqueda")) {
				this.jButtonid_productoIngredienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_producto_relacionIngrediente")) {
				this.jButtonid_producto_relacionIngredienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_relacionIngredienteUpdate")) {
				this.jButtonid_producto_relacionIngredienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_relacionIngredienteBusqueda")) {
				this.jButtonid_producto_relacionIngredienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadIngredienteBusqueda")) {
				this.jButtoncantidadIngredienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioIngredienteBusqueda")) {
				this.jButtonprecioIngredienteBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoIngrediente")) {
				this.jButtonid_productoIngredienteActionPerformed(evt);
			}
			else if(sTipo.equals("id_producto_relacionIngrediente")) {
				this.jButtonid_producto_relacionIngredienteActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaIngrediente")) {
				this.jButtonFK_IdBodegaIngredienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdBodegaRelacionIngrediente")) {
				this.jButtonFK_IdBodegaRelacionIngredienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoIngrediente")) {
				this.jButtonFK_IdProductoIngredienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoRelacionIngrediente")) {
				this.jButtonFK_IdProductoRelacionIngredienteActionPerformed(evt);
			}
			
			;
			
			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessIngrediente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngredienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				


				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ingrediente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ingrediente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Ingrediente ingredienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				ingredienteLocal=this.ingrediente;
			} else {
				ingredienteLocal=this.ingredienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
							
				
				


				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ingrediente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ingrediente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngredienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteAnterior =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingredienteAnterior =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
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
			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			
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
			
			


			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngredienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
								
						
				


				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ingrediente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ingrediente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
								
				
				


				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ingrediente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ingrediente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngredienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteAnterior =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingredienteAnterior =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngredienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteAnterior =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingredienteAnterior =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngredienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
							
				
				


				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ingrediente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ingrediente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngredienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingredienteAnterior =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ingredienteAnterior =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
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
			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			
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
			
			


			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngredienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
								
				
				


				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ingrediente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ingrediente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngredienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteAnterior =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingredienteAnterior =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngredienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngredienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosIngrediente")) {
					jCheckBoxSeleccionarTodosIngredienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosIngrediente")) {
					jCheckBoxSeleccionadosIngredienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarIngrediente")) {
					
				}
				
				


				
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ingrediente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ingrediente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
												
				
				


				
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ingrediente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ingrediente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngredienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingredienteAnterior =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ingredienteAnterior =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngredienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
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
			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
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
			
			


			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngredienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ingrediente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ingrediente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingrediente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingrediente);
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
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
				
				


				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ingrediente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ingrediente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngredienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingredienteAnterior =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingredienteAnterior =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarIngrediente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosIngredienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosIngrediente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ingrediente =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ingrediente =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ingrediente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarIngrediente")) {
				
				}
				
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarIngrediente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosIngrediente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarIngrediente")) {
			
			}
			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessIngrediente();
			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			
			if(sTipo.equals("NuevoIngrediente")) {
				jButtonNuevoIngredienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarIngrediente")) {
				jButtonDuplicarIngredienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarIngrediente")) {
				jButtonCopiarIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormIngrediente")) {
				jButtonVerFormIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesIngrediente")) {
				jButtonNuevoIngredienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarIngrediente")) {
				jButtonModificarIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarIngrediente")) {
				jButtonActualizarIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarIngrediente")) {
				jButtonEliminarIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaIngrediente")) {
				jButtonGuardarCambiosIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarIngrediente")) {
				jButtonCancelarIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarIngrediente")) {
				jButtonCerrarIngredienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosIngrediente")) {
				jButtonGuardarCambiosIngredienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosIngrediente")) {
				jButtonNuevoGuardarCambiosIngredienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByIngrediente")) {
				jButtonAbrirOrderByIngredienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionIngrediente")) {
				jButtonRecargarInformacionIngredienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresIngrediente")) {
				jButtonAnterioresIngredienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesIngrediente")) {
				jButtonSiguientesIngredienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idIngredienteBusqueda")) {
				this.jButtonidIngredienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaIngredienteUpdate")) {
				this.jButtonid_empresaIngredienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaIngredienteBusqueda")) {
				this.jButtonid_empresaIngredienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalIngredienteUpdate")) {
				this.jButtonid_sucursalIngredienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalIngredienteBusqueda")) {
				this.jButtonid_sucursalIngredienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaIngredienteUpdate")) {
				this.jButtonid_bodegaIngredienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaIngredienteBusqueda")) {
				this.jButtonid_bodegaIngredienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodega_relacionIngredienteUpdate")) {
				this.jButtonid_bodega_relacionIngredienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodega_relacionIngredienteBusqueda")) {
				this.jButtonid_bodega_relacionIngredienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoIngrediente")) {
				this.jButtonid_productoIngredienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoIngredienteUpdate")) {
				this.jButtonid_productoIngredienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoIngredienteBusqueda")) {
				this.jButtonid_productoIngredienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_producto_relacionIngrediente")) {
				this.jButtonid_producto_relacionIngredienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_relacionIngredienteUpdate")) {
				this.jButtonid_producto_relacionIngredienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_relacionIngredienteBusqueda")) {
				this.jButtonid_producto_relacionIngredienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadIngredienteBusqueda")) {
				this.jButtoncantidadIngredienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioIngredienteBusqueda")) {
				this.jButtonprecioIngredienteBusquedaActionPerformed(evt);
			}
			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessIngrediente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameIngrediente")) {
				closingInternalFrameIngrediente();
				
			} else if(sTipo.equals("jButtonCancelarIngrediente")) {
				JInternalFrameBase jInternalFrameDetalleFormIngrediente = (JInternalFrameBase)evt.getSource();
	            	
	            IngredienteBeanSwingJInternalFrame jInternalFrameParent=(IngredienteBeanSwingJInternalFrame)jInternalFrameDetalleFormIngrediente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarIngredienteActionPerformed(null);
			}
			
			IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ingrediente,new Object(),this.ingredienteParameterGeneral,this.ingredienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormIngrediente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormIngrediente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormIngrediente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ingrediente)) {
			if(!esControlTabla) {
				if(IngredienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);			
				}
				
				if(this.ingredienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualIngrediente(this.ingrediente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.ingredienteReturnGeneral=ingredienteLogic.procesarEventosIngredientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ingredienteLogic.getIngredientes(),this.ingrediente,this.ingredienteParameterGeneral,this.isEsNuevoIngrediente,classes);//this.ingredienteLogic.getIngrediente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanIngrediente(this.ingredienteReturnGeneral,this.ingredienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ingredienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanIngrediente(classes,this.ingredienteReturnGeneral,this.ingredienteBean,false);
					}
						
					if(this.ingredienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyIngrediente(this.ingredienteReturnGeneral.getIngrediente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioIngrediente(this.ingredienteReturnGeneral.getIngrediente());	
					}
						
					if(this.ingredienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioIngrediente(this.ingredienteReturnGeneral.getIngrediente(),classes);//this.ingredienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioIngrediente(this.ingrediente,classes);//this.ingredienteBean);									
				}
			
				if(IngredienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualIngrediente(this.ingrediente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysIngrediente(this.ingrediente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ingredienteAnterior!=null) {
						this.ingrediente=this.ingredienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.ingredienteReturnGeneral=ingredienteLogic.procesarEventosIngredientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ingredienteLogic.getIngredientes(),this.ingrediente,this.ingredienteParameterGeneral,this.isEsNuevoIngrediente,classes);//this.ingredienteLogic.getIngrediente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ingredienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ingredienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ingredienteReturnGeneral.getIngrediente(),ingredienteLogic.getIngredientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ingredienteReturnGeneral.getIngrediente(),this.ingredientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosIngrediente.repaint();
				
				//((AbstractTableModel) this.jTableDatosIngrediente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosIngrediente();
			}
		}
	}
	
	public void actualizarVisualTableDatosIngrediente() throws Exception {
		
		IngredienteModel ingredienteModel=(IngredienteModel)this.jTableDatosIngrediente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ingredienteModel.ingredientes=this.ingredienteLogic.getIngredientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ingredienteModel.ingredientes=this.ingredientes;
		}
		
		
		((IngredienteModel) this.jTableDatosIngrediente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaIngrediente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getingredienteAnterior(),this.ingredienteLogic.getIngredientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getingredienteAnterior(),this.ingredientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosIngrediente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioIngrediente(Ingrediente ingrediente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
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
										
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ingrediente,new Object(),generalEntityParameterGeneral,this.ingredienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ingredienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=IngredienteConstantesFunciones.getClassesRelationshipsOfIngrediente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=IngredienteConstantesFunciones.getClassesRelationshipsFromStringsOfIngrediente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormIngrediente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				IngredienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ingrediente,new Object(),generalEntityParameterGeneral,this.ingredienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioIngrediente(IngredienteBean ingredienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanIngrediente(ArrayList<Classe> classes,IngredienteReturnGeneral ingredienteReturnGeneral,IngredienteBean ingredienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualIngrediente(Ingrediente ingrediente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ingrediente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormIngrediente = new IngredienteDetalleFormJInternalFrame(jDesktopPane,this.ingredienteSessionBean.getConGuardarRelaciones(),this.ingredienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormIngrediente);
		this.jInternalFrameDetalleFormIngrediente.setVisible(false);
		this.jInternalFrameDetalleFormIngrediente.setSelected(false);						
		
		this.jInternalFrameDetalleFormIngrediente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormIngrediente.ingredienteLogic=this.ingredienteLogic;
		
		this.cargarCombosFrameForeignKeyIngrediente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleIngrediente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleIngrediente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyIngrediente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyIngrediente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormIngrediente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarIngrediente"));
		
		this.jInternalFrameDetalleFormIngrediente.jButtonModificarIngrediente.addActionListener(new ButtonActionListener(this,"ModificarIngrediente"));

		
		this.jInternalFrameDetalleFormIngrediente.jButtonModificarToolBarIngrediente.addActionListener(new ButtonActionListener(this,"ModificarToolBarIngrediente"));
					
		this.jInternalFrameDetalleFormIngrediente.jMenuItemModificarIngrediente.addActionListener(new ButtonActionListener(this,"MenuItemModificarIngrediente"));		
		
		
		
		this.jInternalFrameDetalleFormIngrediente.jButtonActualizarIngrediente.addActionListener (new ButtonActionListener(this,"ActualizarIngrediente"));
		
		
		this.jInternalFrameDetalleFormIngrediente.jButtonActualizarToolBarIngrediente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarIngrediente"));
						
		this.jInternalFrameDetalleFormIngrediente.jMenuItemActualizarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarIngrediente"));		
		
		
		
		this.jInternalFrameDetalleFormIngrediente.jButtonEliminarIngrediente.addActionListener (new ButtonActionListener(this,"EliminarIngrediente"));
		
		
		this.jInternalFrameDetalleFormIngrediente.jButtonEliminarToolBarIngrediente.addActionListener (new ButtonActionListener(this,"EliminarToolBarIngrediente"));
								
		this.jInternalFrameDetalleFormIngrediente.jMenuItemEliminarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarIngrediente"));		
		
		
		
		this.jInternalFrameDetalleFormIngrediente.jButtonCancelarIngrediente.addActionListener (new ButtonActionListener(this,"CancelarIngrediente"));
		
		
		this.jInternalFrameDetalleFormIngrediente.jButtonCancelarToolBarIngrediente.addActionListener (new ButtonActionListener(this,"CancelarToolBarIngrediente"));
					
		this.jInternalFrameDetalleFormIngrediente.jMenuItemCancelarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarIngrediente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormIngrediente.jMenuItemDetalleCerrarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarIngrediente"));		
		
		
		
		this.jInternalFrameDetalleFormIngrediente.jButtonGuardarCambiosToolBarIngrediente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIngrediente"));
		
		
		
		this.jInternalFrameDetalleFormIngrediente.jButtonGuardarCambiosToolBarIngrediente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIngrediente"));
		
		
		
		this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioIngrediente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonidIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"idIngredienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_empresaIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_empresaIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaIngredienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_sucursalIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_sucursalIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalIngredienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_bodegaIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_bodegaIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaIngredienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_bodega_relacionIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_relacionIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_bodega_relacionIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_relacionIngredienteBusqueda"));
		//jButtonid_productoIngrediente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoIngredienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormIngrediente.jButtonid_productoIngrediente.addActionListener(new ButtonActionListener(this,"id_productoIngrediente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_productoIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_productoIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_productoIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_productoIngredienteBusqueda"));
		//jButtonid_producto_relacionIngrediente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_producto_relacionIngredienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormIngrediente.jButtonid_producto_relacionIngrediente.addActionListener(new ButtonActionListener(this,"id_producto_relacionIngrediente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_producto_relacionIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_producto_relacionIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_producto_relacionIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_relacionIngredienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtoncantidadIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"cantidadIngredienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonprecioIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"precioIngredienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormIngrediente.jTabbedPaneRelacionesIngrediente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesIngrediente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameIngrediente"));
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarIngrediente"));
		}
		
		this.jTableDatosIngrediente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarIngrediente"));
		
		this.jTableDatosIngrediente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarIngrediente"));
		
		this.jButtonNuevoIngrediente.addActionListener(new ButtonActionListener(this,"NuevoIngrediente"));
		
		this.jButtonDuplicarIngrediente.addActionListener(new ButtonActionListener(this,"DuplicarIngrediente"));
		
		this.jButtonCopiarIngrediente.addActionListener(new ButtonActionListener(this,"CopiarIngrediente"));
		
		this.jButtonVerFormIngrediente.addActionListener(new ButtonActionListener(this,"VerFormIngrediente"));
		
		
		this.jButtonNuevoToolBarIngrediente.addActionListener(new ButtonActionListener(this,"NuevoToolBarIngrediente"));
			
		this.jButtonDuplicarToolBarIngrediente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarIngrediente"));
			
		this.jMenuItemNuevoIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoIngrediente"));
			
		this.jMenuItemDuplicarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarIngrediente"));		
		
		
		this.jButtonNuevoRelacionesIngrediente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesIngrediente"));
		
		
		this.jButtonNuevoRelacionesToolBarIngrediente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarIngrediente"));
			
		this.jMenuItemNuevoRelacionesIngrediente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesIngrediente"));		
		
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jButtonModificarIngrediente.addActionListener(new ButtonActionListener(this,"ModificarIngrediente"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jButtonModificarToolBarIngrediente.addActionListener(new ButtonActionListener(this,"ModificarToolBarIngrediente"));
			
			this.jInternalFrameDetalleFormIngrediente.jMenuItemModificarIngrediente.addActionListener(new ButtonActionListener(this,"MenuItemModificarIngrediente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormIngrediente.jButtonActualizarIngrediente.addActionListener (new ButtonActionListener(this,"ActualizarIngrediente"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jButtonActualizarToolBarIngrediente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarIngrediente"));
				
			this.jInternalFrameDetalleFormIngrediente.jMenuItemActualizarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarIngrediente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jButtonEliminarIngrediente.addActionListener (new ButtonActionListener(this,"EliminarIngrediente"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jButtonEliminarToolBarIngrediente.addActionListener (new ButtonActionListener(this,"EliminarToolBarIngrediente"));
						
			this.jInternalFrameDetalleFormIngrediente.jMenuItemEliminarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarIngrediente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jButtonCancelarIngrediente.addActionListener (new ButtonActionListener(this,"CancelarIngrediente"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jButtonCancelarToolBarIngrediente.addActionListener (new ButtonActionListener(this,"CancelarToolBarIngrediente"));
			
			this.jInternalFrameDetalleFormIngrediente.jMenuItemCancelarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarIngrediente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarIngrediente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarIngrediente"));		
		
		
		this.jButtonCerrarIngrediente.addActionListener (new ButtonActionListener(this,"CerrarIngrediente"));
		
		
		this.jButtonCerrarToolBarIngrediente.addActionListener (new ButtonActionListener(this,"CerrarToolBarIngrediente"));
			
		this.jMenuItemCerrarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarIngrediente"));
			
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jMenuItemDetalleCerrarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarIngrediente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jButtonGuardarCambiosIngrediente.addActionListener (new ButtonActionListener(this,"GuardarCambiosIngrediente"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jButtonGuardarCambiosToolBarIngrediente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIngrediente"));
		}
		
		this.jButtonCopiarToolBarIngrediente.addActionListener (new ButtonActionListener(this,"CopiarToolBarIngrediente"));
			
		this.jButtonVerFormToolBarIngrediente.addActionListener (new ButtonActionListener(this,"VerFormToolBarIngrediente"));
		
		this.jMenuItemGuardarCambiosIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosIngrediente"));
			
		this.jMenuItemCopiarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarIngrediente"));		
		
		this.jMenuItemVerFormIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormIngrediente"));		
		
		
		this.jButtonGuardarCambiosTablaIngrediente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaIngrediente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarIngrediente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarIngrediente"));
			
		this.jMenuItemGuardarCambiosTablaIngrediente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaIngrediente"));		
		
		
		
		this.jButtonRecargarInformacionIngrediente.addActionListener (new ButtonActionListener(this,"RecargarInformacionIngrediente"));
					
		this.jButtonRecargarInformacionToolBarIngrediente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarIngrediente"));
		
		this.jMenuItemRecargarInformacionIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionIngrediente"));		
		
		
		
		this.jButtonAnterioresIngrediente.addActionListener (new ButtonActionListener(this,"AnterioresIngrediente"));
		
		
		this.jButtonAnterioresToolBarIngrediente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarIngrediente"));
		
		this.jMenuItemAnterioresIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresIngrediente"));		
		
		
		this.jButtonSiguientesIngrediente.addActionListener (new ButtonActionListener(this,"SiguientesIngrediente"));
		
		
		this.jButtonSiguientesToolBarIngrediente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarIngrediente"));
			
		this.jMenuItemSiguientesIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesIngrediente"));
			
		this.jMenuItemAbrirOrderByIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByIngrediente"));
			
		this.jMenuItemMostrarOcultarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarIngrediente"));
			
		this.jMenuItemDetalleAbrirOrderByIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByIngrediente"));
			
		this.jMenuItemDetalleMostarOcultarIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarIngrediente"));		
		
		
		this.jButtonNuevoGuardarCambiosIngrediente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosIngrediente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarIngrediente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarIngrediente"));
			
		this.jMenuItemNuevoGuardarCambiosIngrediente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosIngrediente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosIngrediente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosIngrediente"));

		this.jCheckBoxSeleccionadosIngrediente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosIngrediente"));
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioIngrediente"));
		}
		
		
		this.jComboBoxTiposRelacionesIngrediente.addActionListener (new ButtonActionListener(this,"TiposRelacionesIngrediente"));
			
		this.jComboBoxTiposAccionesIngrediente.addActionListener (new ButtonActionListener(this,"TiposAccionesIngrediente"));
					
		this.jComboBoxTiposSeleccionarIngrediente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarIngrediente"));
			
		this.jTextFieldValorCampoGeneralIngrediente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralIngrediente"));		
		
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonidIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"idIngredienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_empresaIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_empresaIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaIngredienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_sucursalIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_sucursalIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalIngredienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_bodegaIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_bodegaIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaIngredienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_bodega_relacionIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_relacionIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_bodega_relacionIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_relacionIngredienteBusqueda"));
		//jButtonid_productoIngrediente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoIngredienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormIngrediente.jButtonid_productoIngrediente.addActionListener(new ButtonActionListener(this,"id_productoIngrediente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_productoIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_productoIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_productoIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_productoIngredienteBusqueda"));
		//jButtonid_producto_relacionIngrediente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_producto_relacionIngredienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormIngrediente.jButtonid_producto_relacionIngrediente.addActionListener(new ButtonActionListener(this,"id_producto_relacionIngrediente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_producto_relacionIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_producto_relacionIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_producto_relacionIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_relacionIngredienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtoncantidadIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"cantidadIngredienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonprecioIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"precioIngredienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaIngrediente.addActionListener(new ButtonActionListener(this,"FK_IdBodegaIngrediente"));

			this.jButtonFK_IdBodegaRelacionIngrediente.addActionListener(new ButtonActionListener(this,"FK_IdBodegaRelacionIngrediente"));

			this.jButtonFK_IdProductoIngrediente.addActionListener(new ButtonActionListener(this,"FK_IdProductoIngrediente"));

			this.jButtonBuscarFK_IdProductoid_productoIngrediente.addActionListener(new ButtonActionListener(this,"id_productoIngrediente"));

			this.jButtonFK_IdProductoRelacionIngrediente.addActionListener(new ButtonActionListener(this,"FK_IdProductoRelacionIngrediente"));

			this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionIngrediente.addActionListener(new ButtonActionListener(this,"id_producto_relacionIngrediente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoIngrediente!=null) {
				this.jInternalFrameReporteDinamicoIngrediente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIngrediente"));
				this.jInternalFrameReporteDinamicoIngrediente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIngrediente"));
				this.jInternalFrameReporteDinamicoIngrediente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIngrediente"));
			}
			
			//this.jButtonCerrarReporteDinamicoIngrediente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIngrediente"));				
			//this.jButtonGenerarReporteDinamicoIngrediente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIngrediente"));
			//this.jButtonGenerarExcelReporteDinamicoIngrediente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIngrediente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionIngrediente!=null) {
				this.jInternalFrameImportacionIngrediente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionIngrediente"));
				this.jInternalFrameImportacionIngrediente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionIngrediente"));
				this.jInternalFrameImportacionIngrediente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionIngrediente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByIngrediente.addActionListener (new ButtonActionListener(this,"AbrirOrderByIngrediente"));
			
			this.jButtonAbrirOrderByToolBarIngrediente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarIngrediente"));			
			
			if(this.jInternalFrameOrderByIngrediente!=null) {
				this.jInternalFrameOrderByIngrediente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByIngrediente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormIngrediente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngrediente.jTabbedPaneRelacionesIngrediente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesIngrediente"));
		
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
            		closingInternalFrameIngrediente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormIngrediente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormIngrediente = (JInternalFrameBase)event.getSource();
	            	
	            IngredienteBeanSwingJInternalFrame jInternalFrameParent=(IngredienteBeanSwingJInternalFrame)jInternalFrameDetalleFormIngrediente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarIngredienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosIngrediente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosIngredienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosIngrediente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosIngrediente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngredienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngredienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngredienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoIngrediente";
		inputMap = this.jButtonNuevoIngrediente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoIngrediente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoIngredienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngredienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngredienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngredienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesIngrediente";
		inputMap = this.jButtonNuevoRelacionesIngrediente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesIngrediente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoIngredienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarIngrediente";
		inputMap = this.jButtonModificarIngrediente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarIngrediente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarIngredienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarIngrediente";
		inputMap = this.jButtonActualizarIngrediente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarIngrediente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarIngredienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarIngrediente";
		inputMap = this.jButtonEliminarIngrediente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarIngrediente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarIngredienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarIngrediente";
		inputMap = this.jButtonCancelarIngrediente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarIngrediente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarIngredienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarIngrediente";
		inputMap = this.jButtonCerrarIngrediente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarIngrediente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarIngredienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormIngrediente.jButtonGuardarCambiosIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosIngrediente";
		inputMap = this.jInternalFrameDetalleFormIngrediente.jButtonGuardarCambiosIngrediente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormIngrediente.jButtonGuardarCambiosIngrediente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosIngredienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosIngrediente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosIngredienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesIngrediente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesIngredienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarIngrediente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarIngredienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralIngrediente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralIngredienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonidIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"idIngredienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_empresaIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_empresaIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaIngredienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_sucursalIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_sucursalIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalIngredienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_bodegaIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_bodegaIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaIngredienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_bodega_relacionIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_relacionIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_bodega_relacionIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_relacionIngredienteBusqueda"));
		//jButtonid_productoIngrediente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoIngredienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormIngrediente.jButtonid_productoIngrediente.addActionListener(new ButtonActionListener(this,"id_productoIngrediente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_productoIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_productoIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_productoIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_productoIngredienteBusqueda"));
		//jButtonid_producto_relacionIngrediente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_producto_relacionIngredienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormIngrediente.jButtonid_producto_relacionIngrediente.addActionListener(new ButtonActionListener(this,"id_producto_relacionIngrediente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngrediente.jButtonid_producto_relacionIngredienteUpdate.addActionListener(new ButtonActionListener(this,"id_producto_relacionIngredienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonid_producto_relacionIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_relacionIngredienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtoncantidadIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"cantidadIngredienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngrediente.jButtonprecioIngredienteBusqueda.addActionListener(new ButtonActionListener(this,"precioIngredienteBusqueda"));
		
		
		this.jButtonFK_IdBodegaIngrediente.addActionListener(new ButtonActionListener(this,"FK_IdBodegaIngrediente"));

		this.jButtonFK_IdBodegaRelacionIngrediente.addActionListener(new ButtonActionListener(this,"FK_IdBodegaRelacionIngrediente"));

		this.jButtonFK_IdProductoIngrediente.addActionListener(new ButtonActionListener(this,"FK_IdProductoIngrediente"));

		this.jButtonBuscarFK_IdProductoid_productoIngrediente.addActionListener(new ButtonActionListener(this,"id_productoIngrediente"));

		this.jButtonFK_IdProductoRelacionIngrediente.addActionListener(new ButtonActionListener(this,"FK_IdProductoRelacionIngrediente"));

		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionIngrediente.addActionListener(new ButtonActionListener(this,"id_producto_relacionIngrediente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionIngrediente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionIngredienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarIngredienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarIngrediente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosIngrediente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Ingrediente ingredienteAux:this.ingredienteLogic.getIngredientes()) {
					ingredienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ingrediente ingredienteAux:ingredientes) {
					ingredienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosIngredienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingIngrediente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Ingrediente ingredienteAux:this.ingredienteLogic.getIngredientes()) {
						ingredienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Ingrediente ingredienteAux:ingredientes) {
						ingredienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Ingrediente ingredienteAux:this.ingredienteLogic.getIngredientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Ingrediente ingredienteAux:ingredientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaIngrediente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosIngrediente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosIngrediente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosIngredienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingIngrediente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosIngrediente.getSelectedRows();
			
			Ingrediente ingredienteLocal=new Ingrediente();
			
			//this.seleccionarTodosIngrediente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ingredienteLocal =(Ingrediente) this.ingredienteLogic.getIngredientes().toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ingredienteLocal =(Ingrediente) this.ingredientes.toArray()[this.jTableDatosIngrediente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ingredienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Ingrediente ingredienteAux:this.ingredienteLogic.getIngredientes()) {
						ingredienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Ingrediente ingredienteAux:ingredientes) {
						ingredienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaIngrediente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosIngrediente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosIngrediente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosIngrediente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualIngredienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarIngredienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralIngredienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingIngrediente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralIngrediente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Ingrediente ingredienteAux:this.ingredienteLogic.getIngredientes()) {
				
						if(sTipoSeleccionar.equals(IngredienteConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							ingredienteAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(IngredienteConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							ingredienteAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ingrediente ingredienteAux:ingredientes) {
					
						if(sTipoSeleccionar.equals(IngredienteConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							ingredienteAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(IngredienteConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							ingredienteAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaIngrediente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesIngredienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingIngrediente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioIngrediente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesIngrediente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteIngrediente) {				
					conSplash=true;//false;										
					
					//this.startProcessIngrediente(conSplash);
				
					this.generarReporteIngredientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIngrediente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoIngredientesSeleccionados();
				//this.jComboBoxTiposAccionesIngrediente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoIngredientesSeleccionados(false);
				//this.jComboBoxTiposAccionesIngrediente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoIngredientesSeleccionados(true);
				//this.jComboBoxTiposAccionesIngrediente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessIngrediente();
				
				this.exportarIngredientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIngrediente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionIngredientes();
				//this.importarIngredientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIngrediente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessIngrediente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelIngredientesSeleccionados();
				//this.jComboBoxTiposAccionesIngrediente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ingrediente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessIngrediente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoIngrediente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyIngrediente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ingrediente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIngrediente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.setSelectedIndex(0);					
				}	
			} 			
			else if(IngredienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteIngrediente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessIngrediente(conSplash);
					
						//this.actualizarParametrosGeneralIngrediente();
						
						this.generarReporteProcesoAccionIngredientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesIngrediente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(IngredienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO IngredienteS SELECCIONADOS?", "MANTENIMIENTO DE Ingrediente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessIngrediente();
				
						this.actualizarParametrosGeneralIngrediente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ingredienteReturnGeneral=ingredienteLogic.procesarAccionIngredientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ingredienteLogic.getIngredientes(),this.ingredienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarIngredienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesIngrediente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralIngrediente();
					
					IngredienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarIngredienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesIngrediente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormIngrediente.jComboBoxTiposAccionesFormularioIngrediente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessIngrediente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesIngredienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessIngrediente();
			
			if(this.jInternalFrameDetalleFormIngrediente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();		
			Ingrediente ingrediente=new Ingrediente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingIngrediente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesIngrediente.getSelectedItem();
			
			
			
			
			ingredientesSeleccionados=this.getIngredientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(ingredientesSeleccionados.size()==1) {
				for(Ingrediente ingredienteAux:ingredientesSeleccionados) {
					ingrediente=ingredienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessIngrediente();
			
      		//this.finishProcessIngrediente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarIngredienteReturnGeneral() throws Exception {
		if(this.ingredienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ingredienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ingredienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ingredienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ingredienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ingredienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingIngrediente(false);
		}
		
		if(this.ingredienteReturnGeneral.getConRetornoLista() || this.ingredienteReturnGeneral.getConRetornoObjeto()) {
			if(this.ingredienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ingredienteLogic.setIngredientes(this.ingredienteReturnGeneral.getIngredientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.ingredienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ingredienteLogic.setIngrediente(this.ingredienteReturnGeneral.getIngrediente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingIngrediente(false);
		}
	}
	
	public void actualizarParametrosGeneralIngrediente() throws Exception {
		
		
	}
	
	public ArrayList<Ingrediente> getIngredientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioIngrediente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Ingrediente ingredienteAux:ingredienteLogic.getIngredientes()) {
					if(ingredienteAux.getIsSelected()) {
						ingredientesSeleccionados.add(ingredienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ingrediente ingredienteAux:this.ingredientes) {
					if(ingredienteAux.getIsSelected()) {
						ingredientesSeleccionados.add(ingredienteAux);				
					}
				}
			}
			
			if(ingredientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ingredientesSeleccionados.addAll(this.ingredienteLogic.getIngredientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ingredientesSeleccionados.addAll(this.ingredientes);				
					}
				}
			}
		} else {
			ingredientesSeleccionados.add(this.ingrediente);
		}
		
		return ingredientesSeleccionados;
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
	
	public void generarReporteIngredientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalIngredientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoIngredientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoIngredientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoIngredientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ingrediente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesIngredientesSeleccionados() throws Exception {
		ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();		
		
		ingredientesSeleccionados=this.getIngredientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteIngredientes("Todos",ingredientesSeleccionados);
		
	}	
	
	public void generarReporteNormalIngredientesSeleccionados() throws Exception {
		ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();		
		
		ingredientesSeleccionados=this.getIngredientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteIngredientes("Todos",ingredientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionIngredientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();
		
		ingredientesSeleccionados=this.getIngredientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteIngredientes("Todos",ingredientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoIngredientesSeleccionados() throws Exception {
		ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoIngrediente();
		
		
		ingredientesSeleccionados=this.getIngredientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoIngrediente();
		
		
		//this.generarReporteIngredientes("Todos",ingredientesSeleccionados ,ingredienteImplementable,ingredienteImplementableHome);
	}
	
	public void mostrarImportacionIngredientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionIngrediente();
		
		this.abrirFrameImportacionIngrediente();		
		
			
		//this.generarReporteIngredientes("Todos",ingredientesSeleccionados ,ingredienteImplementable,ingredienteImplementableHome);
	}
	
	public void importarIngredientes() throws Exception {		
	
	}
	
	public void exportarIngredientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelIngredientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoIngredientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlIngredientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ingrediente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoIngredientesSeleccionados() throws Exception {
		ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();		
		
		ingredientesSeleccionados=this.getIngredientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingrediente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarIngrediente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Ingrediente ingredienteAux:ingredientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarIngrediente(ingredienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ingredienteAux.setsDetalleGeneralEntityReporte(ingredienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingrediente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarIngrediente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=IngredienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngredienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngredienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngredienteConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngredienteConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngredienteConstantesFunciones.LABEL_IDBODEGARELACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngredienteConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngredienteConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngredienteConstantesFunciones.LABEL_PRECIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarIngrediente(Ingrediente ingrediente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ingrediente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ingrediente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingrediente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingrediente.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingrediente.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingrediente.getbodegarelacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingrediente.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingrediente.getproductorelacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingrediente.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingrediente.getprecio().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelIngredientesSeleccionados() throws Exception {
		ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();		
		
		ingredientesSeleccionados=this.getIngredientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingrediente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Ingredientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelIngrediente(row);				
				iRow++;
			}				
			
			for(Ingrediente ingredienteAux:ingredientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelIngrediente(ingredienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingrediente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlIngredientesSeleccionados() throws Exception {
		ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();		
		
		ingredientesSeleccionados=this.getIngredientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingrediente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ingredientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ingrediente");
			//elementRoot.appendChild(element);
		
			for(Ingrediente ingredienteAux:ingredientesSeleccionados) {
				element = document.createElement("ingrediente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlIngrediente(ingredienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingrediente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelIngrediente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(IngredienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(IngredienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDBODEGARELACION);
		cell = row.createCell(iColumn++);cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION);
		cell = row.createCell(iColumn++);cell.setCellValue(IngredienteConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(IngredienteConstantesFunciones.LABEL_PRECIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelIngrediente(Ingrediente ingrediente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ingrediente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ingrediente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ingrediente.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ingrediente.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ingrediente.getbodegarelacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ingrediente.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ingrediente.getproductorelacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ingrediente.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(ingrediente.getprecio());				
	}
	
	public void setFilaDatosExportarXmlIngrediente(Ingrediente ingrediente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(IngredienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ingrediente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(IngredienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ingrediente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(IngredienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ingrediente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(IngredienteConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(ingrediente.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(IngredienteConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(ingrediente.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementbodegarelacion_descripcion = document.createElement(IngredienteConstantesFunciones.IDBODEGARELACION);
		elementbodegarelacion_descripcion.appendChild(document.createTextNode(ingrediente.getbodegarelacion_descripcion()));
		element.appendChild(elementbodegarelacion_descripcion);

		Element elementproducto_descripcion = document.createElement(IngredienteConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(ingrediente.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementproductorelacion_descripcion = document.createElement(IngredienteConstantesFunciones.IDPRODUCTORELACION);
		elementproductorelacion_descripcion.appendChild(document.createTextNode(ingrediente.getproductorelacion_descripcion()));
		element.appendChild(elementproductorelacion_descripcion);

		Element elementcantidad = document.createElement(IngredienteConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(ingrediente.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementprecio = document.createElement(IngredienteConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(ingrediente.getprecio().toString().trim()));
		element.appendChild(elementprecio);
	}
	
	public void generarReporteGroupGenericoIngredientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Ingrediente> ingredientesSeleccionados=new ArrayList<Ingrediente>();
		
		ingredientesSeleccionados=this.getIngredientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoIngrediente(ingredientesSeleccionados);
		
		this.generarReporteIngredientes("Todos",ingredientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoIngrediente(ArrayList<Ingrediente> ingredientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Ingrediente ingredienteAux:ingredientesSeleccionados) {
				ingredienteAux.setsDetalleGeneralEntityReporte(ingredienteAux.toString());
			
				if(sTipoSeleccionar.equals(IngredienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ingredienteAux.setsDescripcionGeneralEntityReporte1(ingredienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(IngredienteConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					ingredienteAux.setsDescripcionGeneralEntityReporte1(ingredienteAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(IngredienteConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					ingredienteAux.setsDescripcionGeneralEntityReporte1(ingredienteAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(IngredienteConstantesFunciones.LABEL_IDBODEGARELACION)) {
					existe=true;
					ingredienteAux.setsDescripcionGeneralEntityReporte1(ingredienteAux.getbodegarelacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(IngredienteConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					ingredienteAux.setsDescripcionGeneralEntityReporte1(ingredienteAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION)) {
					existe=true;
					ingredienteAux.setsDescripcionGeneralEntityReporte1(ingredienteAux.getproductorelacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(IngredienteConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					ingredienteAux.setsDescripcionGeneralEntityReporte1(ingredienteAux.getcantidad().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngredienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesIngrediente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoIngrediente=true;
				this.isVisibilidadCeldaNuevoRelacionesIngrediente=true;
				this.isVisibilidadCeldaGuardarCambiosIngrediente=true;
			}
			
			this.isVisibilidadCeldaModificarIngrediente=false;
			this.isVisibilidadCeldaActualizarIngrediente=false;
			this.isVisibilidadCeldaEliminarIngrediente=false;
			this.isVisibilidadCeldaCancelarIngrediente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngrediente=true;
				} else {
					this.isVisibilidadCeldaGuardarIngrediente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoIngrediente=false;
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=false;
			this.isVisibilidadCeldaGuardarCambiosIngrediente=false;
			this.isVisibilidadCeldaModificarIngrediente=false;
			this.isVisibilidadCeldaActualizarIngrediente=true;
			this.isVisibilidadCeldaEliminarIngrediente=false;
			this.isVisibilidadCeldaCancelarIngrediente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngrediente=true;
				} else {
					this.isVisibilidadCeldaGuardarIngrediente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoIngrediente=false;
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=false;
			this.isVisibilidadCeldaGuardarCambiosIngrediente=false;
			this.isVisibilidadCeldaModificarIngrediente=false;
			this.isVisibilidadCeldaActualizarIngrediente=true;
			this.isVisibilidadCeldaEliminarIngrediente=true;
			this.isVisibilidadCeldaCancelarIngrediente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngrediente=true;
				} else {
					this.isVisibilidadCeldaGuardarIngrediente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoIngrediente=false;
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=false;
			this.isVisibilidadCeldaGuardarCambiosIngrediente=false;
			this.isVisibilidadCeldaModificarIngrediente=false;
			this.isVisibilidadCeldaActualizarIngrediente=true;
			this.isVisibilidadCeldaEliminarIngrediente=false;
			this.isVisibilidadCeldaCancelarIngrediente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngrediente=false;
				} else {
					this.isVisibilidadCeldaGuardarIngrediente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoIngrediente=true;
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=true;
			this.isVisibilidadCeldaGuardarCambiosIngrediente=true;
			this.isVisibilidadCeldaModificarIngrediente=false;
			this.isVisibilidadCeldaActualizarIngrediente=false;
			this.isVisibilidadCeldaEliminarIngrediente=false;
			this.isVisibilidadCeldaCancelarIngrediente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngrediente=true;
				} else {
					this.isVisibilidadCeldaGuardarIngrediente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoIngrediente=false;
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=false;
			this.isVisibilidadCeldaGuardarCambiosIngrediente=false;
			this.isVisibilidadCeldaActualizarIngrediente=false;
			this.isVisibilidadCeldaEliminarIngrediente=false;
			this.isVisibilidadCeldaCancelarIngrediente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngrediente=false;
				} else {
					this.isVisibilidadCeldaGuardarIngrediente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoIngrediente=false;
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=false;
			this.isVisibilidadCeldaGuardarCambiosIngrediente=false;
			this.isVisibilidadCeldaModificarIngrediente=true;
			this.isVisibilidadCeldaActualizarIngrediente=false;
			this.isVisibilidadCeldaEliminarIngrediente=false;
			this.isVisibilidadCeldaCancelarIngrediente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngrediente=false;
				} else {
					this.isVisibilidadCeldaGuardarIngrediente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(IngredienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoIngrediente=true;
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=true;
			this.isVisibilidadCeldaGuardarCambiosIngrediente=true;
		} else {
			this.actualizarEstadoPanelsIngrediente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarIngrediente=false;
			//this.isVisibilidadCeldaVerFormIngrediente=false;
			this.isVisibilidadCeldaDuplicarIngrediente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ingredienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=false;
		} else {
			this.isVisibilidadCeldaNuevoIngrediente=false;
			this.isVisibilidadCeldaGuardarCambiosIngrediente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ingredienteSessionBean.getEsGuardarRelacionado()) {
			if(!ingredienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesIngrediente=false;												
			}
			
			this.jButtonCerrarIngrediente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesIngrediente=false;
		}
		
		if(!this.permiteMantenimiento(this.ingrediente)) {
			this.isVisibilidadCeldaActualizarIngrediente=false;
			this.isVisibilidadCeldaEliminarIngrediente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesIngrediente() {
	}
	
	public void actualizarEstadoPanelsIngrediente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionIngrediente!=null) {
				this.jScrollPanelDatosEdicionIngrediente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngrediente!=null) {
				this.jTabbedPaneBusquedasIngrediente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIngrediente!=null) {
				this.jScrollPanelDatosIngrediente.setVisible(true);
			}
			
			if(this.jPanelPaginacionIngrediente!=null) {
				this.jPanelPaginacionIngrediente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIngrediente!=null) {
				this.jPanelParametrosReportesIngrediente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionIngrediente!=null) {
				this.jScrollPanelDatosEdicionIngrediente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngrediente!=null) {
				this.jTabbedPaneBusquedasIngrediente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosIngrediente!=null) {
				this.jScrollPanelDatosIngrediente.setVisible(false);
			}
			
			if(this.jPanelPaginacionIngrediente!=null) {
				this.jPanelPaginacionIngrediente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIngrediente!=null) {
				this.jPanelParametrosReportesIngrediente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionIngrediente!=null) {
				this.jScrollPanelDatosEdicionIngrediente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngrediente!=null) {
				this.jTabbedPaneBusquedasIngrediente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosIngrediente!=null) {
				this.jScrollPanelDatosIngrediente.setVisible(false);
			}
			
			if(this.jPanelPaginacionIngrediente!=null) {
				this.jPanelPaginacionIngrediente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIngrediente!=null) {
				this.jPanelParametrosReportesIngrediente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionIngrediente!=null) {
				this.jScrollPanelDatosEdicionIngrediente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngrediente!=null) {
				this.jTabbedPaneBusquedasIngrediente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosIngrediente!=null) {
				this.jScrollPanelDatosIngrediente.setVisible(false);
			}
			
			if(this.jPanelPaginacionIngrediente!=null) {
				this.jPanelPaginacionIngrediente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIngrediente!=null) {
				this.jPanelParametrosReportesIngrediente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionIngrediente!=null) {
				this.jScrollPanelDatosEdicionIngrediente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngrediente!=null) {
				this.jTabbedPaneBusquedasIngrediente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIngrediente!=null) {
				this.jScrollPanelDatosIngrediente.setVisible(true);
			}
			
			if(this.jPanelPaginacionIngrediente!=null) {
				this.jPanelPaginacionIngrediente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIngrediente!=null) {
				this.jPanelParametrosReportesIngrediente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionIngrediente!=null) {
				this.jScrollPanelDatosEdicionIngrediente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngrediente!=null) {
				this.jTabbedPaneBusquedasIngrediente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIngrediente!=null) {
				this.jScrollPanelDatosIngrediente.setVisible(true);
			}
			
			if(this.jPanelPaginacionIngrediente!=null) {
				this.jPanelPaginacionIngrediente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIngrediente!=null) {
				this.jPanelParametrosReportesIngrediente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionIngrediente!=null) {
				this.jScrollPanelDatosEdicionIngrediente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngrediente!=null) {
				this.jTabbedPaneBusquedasIngrediente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIngrediente!=null) {
				this.jScrollPanelDatosIngrediente.setVisible(true);
			}
			
			if(this.jPanelPaginacionIngrediente!=null) {
				this.jPanelPaginacionIngrediente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIngrediente!=null) {
				this.jPanelParametrosReportesIngrediente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ingredienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasIngrediente!=null) {
					this.jTabbedPaneBusquedasIngrediente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesIngrediente!=null) {
				this.jPanelParametrosReportesIngrediente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngrediente!=null) {
				this.jTabbedPaneBusquedasIngrediente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesIngrediente!=null) {
				this.jPanelParametrosReportesIngrediente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdBodegaIngrediente);}

			this.isVisibilidadFK_IdBodegaRelacion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodegaRelacion) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdBodegaRelacionIngrediente);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdProductoIngrediente);}

			this.isVisibilidadFK_IdProductoRelacion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProductoRelacion) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdProductoRelacionIngrediente);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdBodegaIngrediente);}

			this.isVisibilidadFK_IdBodegaRelacion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodegaRelacion) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdBodegaRelacionIngrediente);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdProductoIngrediente);}

			this.isVisibilidadFK_IdProductoRelacion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProductoRelacion) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdProductoRelacionIngrediente);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdBodegaIngrediente);}

			this.isVisibilidadFK_IdBodegaRelacion=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdBodegaRelacion) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdBodegaRelacionIngrediente);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdProductoIngrediente);}

			this.isVisibilidadFK_IdProductoRelacion=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProductoRelacion) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdProductoRelacionIngrediente);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodegaRelacion(Boolean isParaBodegaRelacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaRelacionNegation=!isParaBodegaRelacion;

			this.isVisibilidadFK_IdBodega=isParaBodegaRelacionNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdBodegaIngrediente);}

			this.isVisibilidadFK_IdBodegaRelacion=isParaBodegaRelacion;
			if(!this.isVisibilidadFK_IdBodegaRelacion) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdBodegaRelacionIngrediente);}

			this.isVisibilidadFK_IdProducto=isParaBodegaRelacionNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdProductoIngrediente);}

			this.isVisibilidadFK_IdProductoRelacion=isParaBodegaRelacionNegation;
			if(!this.isVisibilidadFK_IdProductoRelacion) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdProductoRelacionIngrediente);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdBodegaIngrediente);}

			this.isVisibilidadFK_IdBodegaRelacion=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodegaRelacion) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdBodegaRelacionIngrediente);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdProductoIngrediente);}

			this.isVisibilidadFK_IdProductoRelacion=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdProductoRelacion) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdProductoRelacionIngrediente);}
		}
		
	}

	public void setVisibilidadBusquedasParaProductoRelacion(Boolean isParaProductoRelacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoRelacionNegation=!isParaProductoRelacion;

			this.isVisibilidadFK_IdBodega=isParaProductoRelacionNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdBodegaIngrediente);}

			this.isVisibilidadFK_IdBodegaRelacion=isParaProductoRelacionNegation;
			if(!this.isVisibilidadFK_IdBodegaRelacion) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdBodegaRelacionIngrediente);}

			this.isVisibilidadFK_IdProducto=isParaProductoRelacionNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdProductoIngrediente);}

			this.isVisibilidadFK_IdProductoRelacion=isParaProductoRelacion;
			if(!this.isVisibilidadFK_IdProductoRelacion) {this.jTabbedPaneBusquedasIngrediente.remove(jPanelFK_IdProductoRelacionIngrediente);}
		}
		
	}
	
	
	
	

	public String registrarSesionIngredienteParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(ingredienteSessionBean==null) {
				ingredienteSessionBean=new IngredienteSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(ingredienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.ingredienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(IngredienteConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionIngrediente(true);
			//productoSessionBean.setlidIngredienteActual(this.idIngredienteActual);

			ingredienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyIngrediente(true);
			ingredienteSessionBean.setlIdIngredienteActualForeignKey(this.idIngredienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionIngredienteParaBusquedaProductoRelacions() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(ingredienteSessionBean==null) {
				ingredienteSessionBean=new IngredienteSessionBean();
			}

			if(productorelacionSessionBean==null) {
				productorelacionSessionBean=new ProductoSessionBean();
			}

			productorelacionSessionBean.setsPathNavegacionActual(ingredienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productorelacionSessionBean.setisPermiteRecargarInformacion(false);
			productorelacionSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productorelacionSessionBean.getisPaginaPopup();
			productorelacionSessionBean.setisPaginaPopup(false);
			productorelacionSessionBean.setEstaModoBusqueda(true);
			productorelacionSessionBean.setsFuncionBusquedaRapida("window.opener.ingredienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto_relacion(TO_REPLACE);");
			productorelacionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productorelacionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(IngredienteConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionIngrediente(true);
			//productoSessionBean.setlidIngredienteActual(this.idIngredienteActual);

			ingredienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyIngrediente(true);
			ingredienteSessionBean.setlIdIngredienteActualForeignKey(this.idIngredienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//IngredienteSessionBean ingredienteSessionBean=new IngredienteSessionBean();
		
		if(this.ingredienteSessionBean==null) {
			this.ingredienteSessionBean=new IngredienteSessionBean();
		}
		
		this.ingredienteSessionBean.setsUltimaBusquedaIngrediente(this.getsAccionBusqueda());
		this.ingredienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.ingredienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			ingredienteSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdBodegaRelacion")) {
			ingredienteSessionBean.setid_bodega_relacion(this.getid_bodega_relacionFK_IdBodegaRelacion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			ingredienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			ingredienteSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProductoRelacion")) {
			ingredienteSessionBean.setid_producto_relacion(this.getid_producto_relacionFK_IdProductoRelacion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			ingredienteSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//IngredienteSessionBean ingredienteSessionBean=new IngredienteSessionBean();
		
		if(this.ingredienteSessionBean==null) {
			this.ingredienteSessionBean=new IngredienteSessionBean();
		}
		
		if(this.ingredienteSessionBean.getsUltimaBusquedaIngrediente()!=null&&!this.ingredienteSessionBean.getsUltimaBusquedaIngrediente().equals("")) {
			this.setsAccionBusqueda(ingredienteSessionBean.getsUltimaBusquedaIngrediente());
			this.setiNumeroPaginacion(ingredienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(ingredienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(ingredienteSessionBean.getid_bodega());
				ingredienteSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdBodegaRelacion")) {
				this.setid_bodega_relacionFK_IdBodegaRelacion(ingredienteSessionBean.getid_bodega_relacion());
				ingredienteSessionBean.setid_bodega_relacion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(ingredienteSessionBean.getid_empresa());
				ingredienteSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(ingredienteSessionBean.getid_producto());
				ingredienteSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProductoRelacion")) {
				this.setid_producto_relacionFK_IdProductoRelacion(ingredienteSessionBean.getid_producto_relacion());
				ingredienteSessionBean.setid_producto_relacion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(ingredienteSessionBean.getid_sucursal());
				ingredienteSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.ingredienteSessionBean.setsUltimaBusquedaIngrediente("");
		this.ingredienteSessionBean.setiNumeroPaginacion(IngredienteConstantesFunciones.INUMEROPAGINACION);
		this.ingredienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaIngrediente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioIngrediente() {
		this.updateBorderResaltarBusquedasFormularioIngrediente();
		this.updateVisibilidadBusquedasFormularioIngrediente();
		this.updateHabilitarBusquedasFormularioIngrediente();
	}
	
	public void updateBorderResaltarBusquedasFormularioIngrediente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasIngrediente.getComponents().length>0) {
	

		if(this.ingredienteConstantesFunciones.resaltarFK_IdBodegaIngrediente!=null) {
			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdBodegaIngrediente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);
				jPanel.setBorder(this.ingredienteConstantesFunciones.resaltarFK_IdBodegaIngrediente);
			}
		}

		if(this.ingredienteConstantesFunciones.resaltarFK_IdBodegaRelacionIngrediente!=null) {
			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdBodegaRelacionIngrediente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);
				jPanel.setBorder(this.ingredienteConstantesFunciones.resaltarFK_IdBodegaRelacionIngrediente);
			}
		}

		if(this.ingredienteConstantesFunciones.resaltarFK_IdProductoIngrediente!=null) {
			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdProductoIngrediente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);
				jPanel.setBorder(this.ingredienteConstantesFunciones.resaltarFK_IdProductoIngrediente);
			}
		}

		if(this.ingredienteConstantesFunciones.resaltarFK_IdProductoRelacionIngrediente!=null) {
			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdProductoRelacionIngrediente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);
				jPanel.setBorder(this.ingredienteConstantesFunciones.resaltarFK_IdProductoRelacionIngrediente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioIngrediente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasIngrediente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdBodegaIngrediente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ingredienteConstantesFunciones.mostrarFK_IdBodegaIngrediente);
			if(!this.ingredienteConstantesFunciones.mostrarFK_IdBodegaIngrediente && index>-1) {
				this.jTabbedPaneBusquedasIngrediente.remove(index);
			}

			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdBodegaRelacionIngrediente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ingredienteConstantesFunciones.mostrarFK_IdBodegaRelacionIngrediente);
			if(!this.ingredienteConstantesFunciones.mostrarFK_IdBodegaRelacionIngrediente && index>-1) {
				this.jTabbedPaneBusquedasIngrediente.remove(index);
			}

			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdProductoIngrediente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ingredienteConstantesFunciones.mostrarFK_IdProductoIngrediente);
			if(!this.ingredienteConstantesFunciones.mostrarFK_IdProductoIngrediente && index>-1) {
				this.jTabbedPaneBusquedasIngrediente.remove(index);
			}

			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdProductoRelacionIngrediente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ingredienteConstantesFunciones.mostrarFK_IdProductoRelacionIngrediente);
			if(!this.ingredienteConstantesFunciones.mostrarFK_IdProductoRelacionIngrediente && index>-1) {
				this.jTabbedPaneBusquedasIngrediente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioIngrediente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasIngrediente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdBodegaIngrediente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ingredienteConstantesFunciones.activarFK_IdBodegaIngrediente);
				this.jTabbedPaneBusquedasIngrediente.setEnabledAt(index,this.ingredienteConstantesFunciones.activarFK_IdBodegaIngrediente);
			}

			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdBodegaRelacionIngrediente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ingredienteConstantesFunciones.activarFK_IdBodegaRelacionIngrediente);
				this.jTabbedPaneBusquedasIngrediente.setEnabledAt(index,this.ingredienteConstantesFunciones.activarFK_IdBodegaRelacionIngrediente);
			}

			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdProductoIngrediente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ingredienteConstantesFunciones.activarFK_IdProductoIngrediente);
				this.jTabbedPaneBusquedasIngrediente.setEnabledAt(index,this.ingredienteConstantesFunciones.activarFK_IdProductoIngrediente);
			}

			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdProductoRelacionIngrediente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ingredienteConstantesFunciones.activarFK_IdProductoRelacionIngrediente);
				this.jTabbedPaneBusquedasIngrediente.setEnabledAt(index,this.ingredienteConstantesFunciones.activarFK_IdProductoRelacionIngrediente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaIngrediente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdBodegaIngrediente);

			this.jTabbedPaneBusquedasIngrediente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);

			this.ingredienteConstantesFunciones.setResaltarFK_IdBodegaIngrediente(resaltar);

			jPanel.setBorder(this.ingredienteConstantesFunciones.resaltarFK_IdBodegaIngrediente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdBodegaRelacion")) {
			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdBodegaRelacionIngrediente);

			this.jTabbedPaneBusquedasIngrediente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);

			this.ingredienteConstantesFunciones.setResaltarFK_IdBodegaRelacionIngrediente(resaltar);

			jPanel.setBorder(this.ingredienteConstantesFunciones.resaltarFK_IdBodegaRelacionIngrediente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdProductoIngrediente);

			this.jTabbedPaneBusquedasIngrediente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);

			this.ingredienteConstantesFunciones.setResaltarFK_IdProductoIngrediente(resaltar);

			jPanel.setBorder(this.ingredienteConstantesFunciones.resaltarFK_IdProductoIngrediente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProductoRelacion")) {
			index= this.jTabbedPaneBusquedasIngrediente.indexOfComponent(this.jPanelFK_IdProductoRelacionIngrediente);

			this.jTabbedPaneBusquedasIngrediente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasIngrediente.getComponent(index);

			this.ingredienteConstantesFunciones.setResaltarFK_IdProductoRelacionIngrediente(resaltar);

			jPanel.setBorder(this.ingredienteConstantesFunciones.resaltarFK_IdProductoRelacionIngrediente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarIngrediente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioIngrediente() throws Exception {

		if(this.jInternalFrameDetalleFormIngrediente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioIngrediente();
		this.updateVisibilidadResaltarControlesFormularioIngrediente();
		this.updateHabilitarResaltarControlesFormularioIngrediente();
		
	}
	
	public void updateBorderResaltarControlesFormularioIngrediente() throws Exception {
		if(this.jInternalFrameDetalleFormIngrediente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ingredienteConstantesFunciones.resaltaridIngrediente!=null && this.jInternalFrameDetalleFormIngrediente!=null) {this.jInternalFrameDetalleFormIngrediente.jLabelidIngrediente.setBorder(this.ingredienteConstantesFunciones.resaltaridIngrediente);}
		if(this.ingredienteConstantesFunciones.resaltarid_empresaIngrediente!=null && this.jInternalFrameDetalleFormIngrediente!=null) {this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.setBorder(this.ingredienteConstantesFunciones.resaltarid_empresaIngrediente);}
		if(this.ingredienteConstantesFunciones.resaltarid_sucursalIngrediente!=null && this.jInternalFrameDetalleFormIngrediente!=null) {this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.setBorder(this.ingredienteConstantesFunciones.resaltarid_sucursalIngrediente);}
		if(this.ingredienteConstantesFunciones.resaltarid_bodegaIngrediente!=null && this.jInternalFrameDetalleFormIngrediente!=null) {this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.setBorder(this.ingredienteConstantesFunciones.resaltarid_bodegaIngrediente);}
		if(this.ingredienteConstantesFunciones.resaltarid_bodega_relacionIngrediente!=null && this.jInternalFrameDetalleFormIngrediente!=null) {this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.setBorder(this.ingredienteConstantesFunciones.resaltarid_bodega_relacionIngrediente);}
		if(this.ingredienteConstantesFunciones.resaltarid_productoIngrediente!=null && this.jInternalFrameDetalleFormIngrediente!=null) {this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.setBorder(this.ingredienteConstantesFunciones.resaltarid_productoIngrediente);}
		if(this.ingredienteConstantesFunciones.resaltarid_producto_relacionIngrediente!=null && this.jInternalFrameDetalleFormIngrediente!=null) {this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.setBorder(this.ingredienteConstantesFunciones.resaltarid_producto_relacionIngrediente);}
		if(this.ingredienteConstantesFunciones.resaltarcantidadIngrediente!=null && this.jInternalFrameDetalleFormIngrediente!=null) {this.jInternalFrameDetalleFormIngrediente.jTextFieldcantidadIngrediente.setBorder(this.ingredienteConstantesFunciones.resaltarcantidadIngrediente);}
		if(this.ingredienteConstantesFunciones.resaltarprecioIngrediente!=null && this.jInternalFrameDetalleFormIngrediente!=null) {this.jInternalFrameDetalleFormIngrediente.jTextFieldprecioIngrediente.setBorder(this.ingredienteConstantesFunciones.resaltarprecioIngrediente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioIngrediente() throws Exception {		
		if(this.jInternalFrameDetalleFormIngrediente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) {
	
		//this.jInternalFrameDetalleFormIngrediente.jLabelidIngrediente.setVisible(this.ingredienteConstantesFunciones.mostraridIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jPanelidIngrediente.setVisible(this.ingredienteConstantesFunciones.mostraridIngrediente);
		//this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_empresaIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jPanelid_empresaIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_empresaIngrediente);
		//this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_sucursalIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jPanelid_sucursalIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_sucursalIngrediente);
		//this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_bodegaIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jPanelid_bodegaIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_bodegaIngrediente);
		//this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_bodega_relacionIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jPanelid_bodega_relacionIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_bodega_relacionIngrediente);
		//this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_productoIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jPanelid_productoIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_productoIngrediente);
			this.jInternalFrameDetalleFormIngrediente.jButtonid_productoIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_productoIngrediente);
		//this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_producto_relacionIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jPanelid_producto_relacionIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_producto_relacionIngrediente);
			this.jInternalFrameDetalleFormIngrediente.jButtonid_producto_relacionIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarid_producto_relacionIngrediente);
		//this.jInternalFrameDetalleFormIngrediente.jTextFieldcantidadIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarcantidadIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jPanelcantidadIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarcantidadIngrediente);
		//this.jInternalFrameDetalleFormIngrediente.jTextFieldprecioIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarprecioIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jPanelprecioIngrediente.setVisible(this.ingredienteConstantesFunciones.mostrarprecioIngrediente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioIngrediente() throws Exception {
		if(this.jInternalFrameDetalleFormIngrediente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormIngrediente!=null) {
	
		this.jInternalFrameDetalleFormIngrediente.jLabelidIngrediente.setEnabled(this.ingredienteConstantesFunciones.activaridIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jComboBoxid_empresaIngrediente.setEnabled(this.ingredienteConstantesFunciones.activarid_empresaIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jComboBoxid_sucursalIngrediente.setEnabled(this.ingredienteConstantesFunciones.activarid_sucursalIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodegaIngrediente.setEnabled(this.ingredienteConstantesFunciones.activarid_bodegaIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jComboBoxid_bodega_relacionIngrediente.setEnabled(this.ingredienteConstantesFunciones.activarid_bodega_relacionIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jComboBoxid_productoIngrediente.setEnabled(this.ingredienteConstantesFunciones.activarid_productoIngrediente);
			this.jInternalFrameDetalleFormIngrediente.jButtonid_productoIngrediente.setEnabled(this.ingredienteConstantesFunciones.activarid_productoIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jComboBoxid_producto_relacionIngrediente.setEnabled(this.ingredienteConstantesFunciones.activarid_producto_relacionIngrediente);
			this.jInternalFrameDetalleFormIngrediente.jButtonid_producto_relacionIngrediente.setEnabled(this.ingredienteConstantesFunciones.activarid_producto_relacionIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jTextFieldcantidadIngrediente.setEnabled(this.ingredienteConstantesFunciones.activarcantidadIngrediente);
		this.jInternalFrameDetalleFormIngrediente.jTextFieldprecioIngrediente.setEnabled(this.ingredienteConstantesFunciones.activarprecioIngrediente);
		}
	}
	
		
}