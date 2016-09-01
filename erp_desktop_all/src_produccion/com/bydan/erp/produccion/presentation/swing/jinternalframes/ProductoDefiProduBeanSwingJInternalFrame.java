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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




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

import com.bydan.erp.produccion.util.ProductoDefiProduConstantesFunciones;
import com.bydan.erp.produccion.util.ProductoDefiProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProductoDefiProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ProductoDefiProduBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProductoDefiProduBeanSwingJInternalFrame extends ProductoDefiProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoDefiProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoDefiProdu> productodefiproduValidator = new ClassValidator<ProductoDefiProdu>(ProductoDefiProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoDefiProdu productodefiprodu;	
	public ProductoDefiProdu productodefiproduAux;
	public ProductoDefiProdu productodefiproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoDefiProdu productodefiproduTotales;
	public Long idProductoDefiProduActual;
	public Long iIdNuevoProductoDefiProdu=0L;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
	}
	
	

	public Boolean isTienePermisosProductoProduMano=false;

	public Boolean getIsTienePermisosProductoProduMano() {
		return isTienePermisosProductoProduMano;
	}

	public void setIsTienePermisosProductoProduMano(Boolean isTienePermisosProductoProduMano) {
		this.isTienePermisosProductoProduMano= isTienePermisosProductoProduMano;
	}


	public Boolean isTienePermisosProductoProduMerma=false;

	public Boolean getIsTienePermisosProductoProduMerma() {
		return isTienePermisosProductoProduMerma;
	}

	public void setIsTienePermisosProductoProduMerma(Boolean isTienePermisosProductoProduMerma) {
		this.isTienePermisosProductoProduMerma= isTienePermisosProductoProduMerma;
	}


	public Boolean isTienePermisosProductoProduGasto=false;

	public Boolean getIsTienePermisosProductoProduGasto() {
		return isTienePermisosProductoProduGasto;
	}

	public void setIsTienePermisosProductoProduGasto(Boolean isTienePermisosProductoProduGasto) {
		this.isTienePermisosProductoProduGasto= isTienePermisosProductoProduGasto;
	}


	public Boolean isTienePermisosProductoProdu=false;

	public Boolean getIsTienePermisosProductoProdu() {
		return isTienePermisosProductoProdu;
	}

	public void setIsTienePermisosProductoProdu(Boolean isTienePermisosProductoProdu) {
		this.isTienePermisosProductoProdu= isTienePermisosProductoProdu;
	}


	public Boolean isTienePermisosProductoProduMaquina=false;

	public Boolean getIsTienePermisosProductoProduMaquina() {
		return isTienePermisosProductoProduMaquina;
	}

	public void setIsTienePermisosProductoProduMaquina(Boolean isTienePermisosProductoProduMaquina) {
		this.isTienePermisosProductoProduMaquina= isTienePermisosProductoProduMaquina;
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
	
	public Boolean isPermisoTodoProductoDefiProdu;
	public Boolean isPermisoNuevoProductoDefiProdu;
	public Boolean isPermisoActualizarProductoDefiProdu;
	public Boolean isPermisoActualizarOriginalProductoDefiProdu;
	public Boolean isPermisoEliminarProductoDefiProdu;
	public Boolean isPermisoGuardarCambiosProductoDefiProdu;
	public Boolean isPermisoConsultaProductoDefiProdu;
	public Boolean isPermisoBusquedaProductoDefiProdu;
	public Boolean isPermisoReporteProductoDefiProdu;
	public Boolean isPermisoPaginacionMedioProductoDefiProdu;
	public Boolean isPermisoPaginacionAltoProductoDefiProdu;
	public Boolean isPermisoPaginacionTodoProductoDefiProdu;
	public Boolean isPermisoCopiarProductoDefiProdu;
	public Boolean isPermisoVerFormProductoDefiProdu;
	public Boolean isPermisoDuplicarProductoDefiProdu;
	public Boolean isPermisoOrdenProductoDefiProdu;
	
	
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
	
	public ProductoDefiProduParameterReturnGeneral productodefiproduReturnGeneral;
	public ProductoDefiProduParameterReturnGeneral productodefiproduParameterGeneral;
	
	

	public ProductoProduManoLogic productoprodumanoLogic=null;

	public ProductoProduManoLogic getProductoProduManoLogic() {
		return productoprodumanoLogic;
	}

	public void setProductoProduManoLogic(ProductoProduManoLogic productoprodumanoLogic) {
		this.productoprodumanoLogic = productoprodumanoLogic;
	}


	public ProductoProduMermaLogic productoprodumermaLogic=null;

	public ProductoProduMermaLogic getProductoProduMermaLogic() {
		return productoprodumermaLogic;
	}

	public void setProductoProduMermaLogic(ProductoProduMermaLogic productoprodumermaLogic) {
		this.productoprodumermaLogic = productoprodumermaLogic;
	}


	public ProductoProduGastoLogic productoprodugastoLogic=null;

	public ProductoProduGastoLogic getProductoProduGastoLogic() {
		return productoprodugastoLogic;
	}

	public void setProductoProduGastoLogic(ProductoProduGastoLogic productoprodugastoLogic) {
		this.productoprodugastoLogic = productoprodugastoLogic;
	}


	public ProductoProduLogic productoproduLogic=null;

	public ProductoProduLogic getProductoProduLogic() {
		return productoproduLogic;
	}

	public void setProductoProduLogic(ProductoProduLogic productoproduLogic) {
		this.productoproduLogic = productoproduLogic;
	}


	public ProductoProduMaquinaLogic productoprodumaquinaLogic=null;

	public ProductoProduMaquinaLogic getProductoProduMaquinaLogic() {
		return productoprodumaquinaLogic;
	}

	public void setProductoProduMaquinaLogic(ProductoProduMaquinaLogic productoprodumaquinaLogic) {
		this.productoprodumaquinaLogic = productoprodumaquinaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoDefiProdu=false;
	public Boolean esParaAccionDesdeFormularioProductoDefiProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoDefiProduSessionBeanAdditional productodefiproduSessionBeanAdditional=null;
	
	public ProductoDefiProduSessionBeanAdditional getProductoDefiProduSessionBeanAdditional() {
		return this.productodefiproduSessionBeanAdditional;
	}
	
	public void setProductoDefiProduSessionBeanAdditional(ProductoDefiProduSessionBeanAdditional productodefiproduSessionBeanAdditional) {
		try {
			this.productodefiproduSessionBeanAdditional=productodefiproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoDefiProduBeanSwingJInternalFrameAdditional productodefiproduBeanSwingJInternalFrameAdditional=null;
	//public class ProductoDefiProduBeanSwingJInternalFrame
	
	public ProductoDefiProduBeanSwingJInternalFrameAdditional getProductoDefiProduBeanSwingJInternalFrameAdditional() {
		return this.productodefiproduBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoDefiProduBeanSwingJInternalFrameAdditional(ProductoDefiProduBeanSwingJInternalFrameAdditional productodefiproduBeanSwingJInternalFrameAdditional) {
		try {
			this.productodefiproduBeanSwingJInternalFrameAdditional=productodefiproduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoDefiProduLogic productodefiproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoDefiProdu productodefiproduBean;
	public ProductoDefiProduConstantesFunciones productodefiproduConstantesFunciones;
	//public ProductoDefiProduParameterReturnGeneral productodefiproduReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoDefiProdu> productodefiprodus;	
	//public List<ProductoDefiProdu> productodefiprodusEliminados;
	//public List<ProductoDefiProdu> productodefiprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoDefiProdu=false;
	public Boolean isVisibilidadCeldaDuplicarProductoDefiProdu=true;
	public Boolean isVisibilidadCeldaCopiarProductoDefiProdu=true;
	public Boolean isVisibilidadCeldaVerFormProductoDefiProdu=true;
	public Boolean isVisibilidadCeldaOrdenProductoDefiProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=false;
	public Boolean isVisibilidadCeldaModificarProductoDefiProdu=false;
	public Boolean isVisibilidadCeldaActualizarProductoDefiProdu=false;
	public Boolean isVisibilidadCeldaEliminarProductoDefiProdu=false;
	public Boolean isVisibilidadCeldaCancelarProductoDefiProdu=false;
	public Boolean isVisibilidadCeldaGuardarProductoDefiProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoDefiProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUnidadUnad=false;
	
	public Long getiIdNuevoProductoDefiProdu() {
		return this.iIdNuevoProductoDefiProdu;
	}

	public void setiIdNuevoProductoDefiProdu(Long iIdNuevoProductoDefiProdu) {
		this.iIdNuevoProductoDefiProdu = iIdNuevoProductoDefiProdu;
	}
	
	public Long getidProductoDefiProduActual() {
		return this.idProductoDefiProduActual;
	}

	public void setidProductoDefiProduActual(Long idProductoDefiProduActual) {
		this.idProductoDefiProduActual = idProductoDefiProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoDefiProdu getproductodefiprodu() {
		return this.productodefiprodu;
	}

	public void setproductodefiprodu(ProductoDefiProdu productodefiprodu) {
		this.productodefiprodu = productodefiprodu;
	}
	
	public ProductoDefiProdu getproductodefiproduAux() {
		return this.productodefiproduAux;
	}

	public void setproductodefiproduAux(ProductoDefiProdu productodefiproduAux) {
		this.productodefiproduAux = productodefiproduAux;
	}				
	
	public ProductoDefiProdu getproductodefiproduAnterior() {
		return this.productodefiproduAnterior;
	}

	public void setproductodefiproduAnterior(ProductoDefiProdu productodefiproduAnterior) {
		this.productodefiproduAnterior = productodefiproduAnterior;
	}	
	
	public ProductoDefiProdu getproductodefiproduTotales() {
		return this.productodefiproduTotales;
	}

	public void setproductodefiproduTotales(ProductoDefiProdu productodefiproduTotales) {
		this.productodefiproduTotales = productodefiproduTotales;
	}	
	
	public ProductoDefiProdu getproductodefiproduBean() {
		return this.productodefiproduBean;
	}

	public void setproductodefiproduBean(ProductoDefiProdu productodefiproduBean) {
		this.productodefiproduBean = productodefiproduBean;
	}	
	
	public ProductoDefiProduParameterReturnGeneral getproductodefiproduReturnGeneral() {
		return this.productodefiproduReturnGeneral;
	}

	public void setproductodefiproduReturnGeneral(ProductoDefiProduParameterReturnGeneral productodefiproduReturnGeneral) {
		this.productodefiproduReturnGeneral = productodefiproduReturnGeneral;
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

	public Long id_unidadFK_IdUnidadUnad=-1L;

	public Long getid_unidadFK_IdUnidadUnad() {
		return this.id_unidadFK_IdUnidadUnad;
	}

	public void setid_unidadFK_IdUnidadUnad(Long id_unidadFK_IdUnidadUnad) {
		this.id_unidadFK_IdUnidadUnad = id_unidadFK_IdUnidadUnad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProductoDefiProduLogic getProductoDefiProduLogic()	{		
		return productodefiproduLogic;
	}

	public void setProductoDefiProduLogic(ProductoDefiProduLogic productodefiproduLogic) {
		this.productodefiproduLogic = productodefiproduLogic;
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
	
	public Boolean getIsEsNuevoProductoDefiProdu() {
		return isEsNuevoProductoDefiProdu;
	}

	public void setIsEsNuevoProductoDefiProdu(Boolean isEsNuevoProductoDefiProdu) {
		this.isEsNuevoProductoDefiProdu = isEsNuevoProductoDefiProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoDefiProdu() {
		return esParaAccionDesdeFormularioProductoDefiProdu;
	}
	
	public void setEsParaAccionDesdeFormularioProductoDefiProdu(Boolean esParaAccionDesdeFormularioProductoDefiProdu) {
		this.esParaAccionDesdeFormularioProductoDefiProdu = esParaAccionDesdeFormularioProductoDefiProdu;
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

			if(this.productodefiproduSessionBean==null) {
				this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			}

			if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productodefiproduSessionBean.getlidEmpresaActual());
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

			if(this.productodefiproduSessionBean==null) {
				this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			}

			if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productodefiproduSessionBean.getlidSucursalActual());
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

			if(this.productodefiproduSessionBean==null) {
				this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			}

			if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(productodefiproduSessionBean.getlidBodegaActual());
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

			//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.productodefiproduSessionBean==null) {
				this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			}

			if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productodefiproduSessionBean.getlidProductoActual());
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

			if(this.productodefiproduSessionBean==null) {
				this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			}

			if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(productodefiproduSessionBean.getlidUnidadActual());
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

					if(this.productodefiprodu!=null) {
						this.productodefiprodu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductoDefiProdu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductoDefiProduGenerico)throws Exception
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
				jComboBoxid_empresaProductoDefiProduGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductoDefiProduGenerico!=null && jComboBoxid_empresaProductoDefiProduGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductoDefiProduGenerico.setSelectedIndex(0);
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

					if(this.productodefiprodu!=null) {
						this.productodefiprodu.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductoDefiProdu.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductoDefiProduGenerico)throws Exception
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
				jComboBoxid_sucursalProductoDefiProduGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductoDefiProduGenerico!=null && jComboBoxid_sucursalProductoDefiProduGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductoDefiProduGenerico.setSelectedIndex(0);
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

					if(this.productodefiprodu!=null) {
						this.productodefiprodu.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductoDefiProdu.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductoDefiProduGenerico)throws Exception
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
				jComboBoxid_bodegaProductoDefiProduGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductoDefiProduGenerico!=null && jComboBoxid_bodegaProductoDefiProduGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductoDefiProduGenerico.setSelectedIndex(0);
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

					if(this.productodefiprodu!=null) {
						this.productodefiprodu.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductoDefiProdu.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductoDefiProduGenerico)throws Exception
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
				jComboBoxid_productoProductoDefiProduGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductoDefiProduGenerico!=null && jComboBoxid_productoProductoDefiProduGenerico.getItemCount()>0) {
					jComboBoxid_productoProductoDefiProduGenerico.setSelectedIndex(0);
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

					if(this.productodefiprodu!=null) {
						this.productodefiprodu.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadProductoDefiProdu.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadProductoDefiProduGenerico)throws Exception
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
				jComboBoxid_unidadProductoDefiProduGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadProductoDefiProduGenerico!=null && jComboBoxid_unidadProductoDefiProduGenerico.getItemCount()>0) {
					jComboBoxid_unidadProductoDefiProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductoDefiProdu productodefiprodu,JComboBox jComboBoxid_empresaProductoDefiProduGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductoDefiProduGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductoDefiProduGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productodefiprodu.setid_empresa(empresaAux.getId());
				productodefiprodu.setempresa_descripcion(ProductoDefiProduConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productodefiprodu.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductoDefiProdu productodefiprodu,JComboBox jComboBoxid_sucursalProductoDefiProduGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductoDefiProduGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductoDefiProduGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productodefiprodu.setid_sucursal(sucursalAux.getId());
				productodefiprodu.setsucursal_descripcion(ProductoDefiProduConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productodefiprodu.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductoDefiProdu productodefiprodu,JComboBox jComboBoxid_bodegaProductoDefiProduGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductoDefiProduGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductoDefiProduGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productodefiprodu.setid_bodega(bodegaAux.getId());
				productodefiprodu.setbodega_descripcion(ProductoDefiProduConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productodefiprodu.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductoDefiProdu productodefiprodu,JComboBox jComboBoxid_productoProductoDefiProduGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductoDefiProduGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductoDefiProduGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productodefiprodu.setid_producto(productoAux.getId());
				productodefiprodu.setproducto_descripcion(ProductoDefiProduConstantesFunciones.getProductoDescripcion(productoAux));
				productodefiprodu.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ProductoDefiProdu productodefiprodu,JComboBox jComboBoxid_unidadProductoDefiProduGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadProductoDefiProduGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadProductoDefiProduGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				productodefiprodu.setid_unidad(unidadAux.getId());
				productodefiprodu.setunidad_descripcion(ProductoDefiProduConstantesFunciones.getUnidadDescripcion(unidadAux));
				productodefiprodu.setUnidad(unidadAux);			}
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

					if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { 
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { 
					}

					if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { 
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { 
					}

					if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { 
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { 
					}

					if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { 
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { 
					}

					if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { 
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { 
					}

					if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesProductoDefiProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoDefiProduConstantesFunciones.refrescarForeignKeysDescripcionesProductoDefiProdu(this.productodefiproduLogic.getProductoDefiProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoDefiProduConstantesFunciones.refrescarForeignKeysDescripcionesProductoDefiProdu(this.productodefiprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productodefiproduLogic.setProductoDefiProdus(this.productodefiprodus);
			productodefiproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoDefiProduParameterReturnGeneral getProductoDefiProduParameterGeneral() {
		return this.productodefiproduParameterGeneral;
	}
	
	public void setProductoDefiProduParameterGeneral(ProductoDefiProduParameterReturnGeneral productodefiproduParameterGeneral) {
		this.productodefiproduParameterGeneral = productodefiproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoDefiProdu() {
		return isPermisoTodoProductoDefiProdu;
	}

	public void setIsPermisoTodoProductoDefiProdu(Boolean isPermisoTodoProductoDefiProdu) {
		this.isPermisoTodoProductoDefiProdu = isPermisoTodoProductoDefiProdu;
	}

	public Boolean getIsPermisoNuevoProductoDefiProdu() {
		return isPermisoNuevoProductoDefiProdu;
	}

	public void setIsPermisoNuevoProductoDefiProdu(Boolean isPermisoNuevoProductoDefiProdu) {
		this.isPermisoNuevoProductoDefiProdu = isPermisoNuevoProductoDefiProdu;
	}

	public Boolean getIsPermisoActualizarProductoDefiProdu() {
		return isPermisoActualizarProductoDefiProdu;
	}

	public void setIsPermisoActualizarProductoDefiProdu(Boolean isPermisoActualizarProductoDefiProdu) {
		this.isPermisoActualizarProductoDefiProdu = isPermisoActualizarProductoDefiProdu;
	}

	public Boolean getIsPermisoEliminarProductoDefiProdu() {
		return isPermisoEliminarProductoDefiProdu;
	}

	public void setIsPermisoEliminarProductoDefiProdu(Boolean isPermisoEliminarProductoDefiProdu) {
		this.isPermisoEliminarProductoDefiProdu = isPermisoEliminarProductoDefiProdu;
	}

	public Boolean getIsPermisoGuardarCambiosProductoDefiProdu() {
		return isPermisoGuardarCambiosProductoDefiProdu;
	}

	public void setIsPermisoGuardarCambiosProductoDefiProdu(Boolean isPermisoGuardarCambiosProductoDefiProdu) {
		this.isPermisoGuardarCambiosProductoDefiProdu = isPermisoGuardarCambiosProductoDefiProdu;
	}
	
	public Boolean getIsPermisoConsultaProductoDefiProdu() {
		return isPermisoConsultaProductoDefiProdu;
	}

	public void setIsPermisoConsultaProductoDefiProdu(Boolean isPermisoConsultaProductoDefiProdu) {
		this.isPermisoConsultaProductoDefiProdu = isPermisoConsultaProductoDefiProdu;
	}

	public Boolean getIsPermisoBusquedaProductoDefiProdu() {
		return isPermisoBusquedaProductoDefiProdu;
	}

	public void setIsPermisoBusquedaProductoDefiProdu(Boolean isPermisoBusquedaProductoDefiProdu) {
		this.isPermisoBusquedaProductoDefiProdu = isPermisoBusquedaProductoDefiProdu;
	}

	public Boolean getIsPermisoReporteProductoDefiProdu() {
		return isPermisoReporteProductoDefiProdu;
	}

	public void setIsPermisoReporteProductoDefiProdu(Boolean isPermisoReporteProductoDefiProdu) {
		this.isPermisoReporteProductoDefiProdu = isPermisoReporteProductoDefiProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoDefiProdu() {
		return isPermisoPaginacionMedioProductoDefiProdu;
	}

	public void setIsPermisoPaginacionMedioProductoDefiProdu(Boolean isPermisoPaginacionMedioProductoDefiProdu) {
		this.isPermisoPaginacionMedioProductoDefiProdu = isPermisoPaginacionMedioProductoDefiProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoDefiProdu() {
		return isPermisoPaginacionTodoProductoDefiProdu;
	}

	public void setIsPermisoPaginacionTodoProductoDefiProdu(Boolean isPermisoPaginacionTodoProductoDefiProdu) {
		this.isPermisoPaginacionTodoProductoDefiProdu = isPermisoPaginacionTodoProductoDefiProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoDefiProdu() {
		return isPermisoPaginacionAltoProductoDefiProdu;
	}

	public void setIsPermisoPaginacionAltoProductoDefiProdu(Boolean isPermisoPaginacionAltoProductoDefiProdu) {
		this.isPermisoPaginacionAltoProductoDefiProdu = isPermisoPaginacionAltoProductoDefiProdu;
	}
	
	public Boolean getIsPermisoCopiarProductoDefiProdu() {
		return isPermisoCopiarProductoDefiProdu;
	}

	public void setIsPermisoCopiarProductoDefiProdu(Boolean isPermisoCopiarProductoDefiProdu) {
		this.isPermisoCopiarProductoDefiProdu = isPermisoCopiarProductoDefiProdu;
	}
	
	public Boolean getIsPermisoVerFormProductoDefiProdu() {
		return isPermisoVerFormProductoDefiProdu;
	}

	public void setIsPermisoVerFormProductoDefiProdu(Boolean isPermisoVerFormProductoDefiProdu) {
		this.isPermisoVerFormProductoDefiProdu = isPermisoVerFormProductoDefiProdu;
	}
	
	public Boolean getIsPermisoDuplicarProductoDefiProdu() {
		return isPermisoDuplicarProductoDefiProdu;
	}

	public void setIsPermisoDuplicarProductoDefiProdu(Boolean isPermisoDuplicarProductoDefiProdu) {
		this.isPermisoDuplicarProductoDefiProdu = isPermisoDuplicarProductoDefiProdu;
	}
	
	public Boolean getIsPermisoOrdenProductoDefiProdu() {
		return isPermisoOrdenProductoDefiProdu;
	}

	public void setIsPermisoOrdenProductoDefiProdu(Boolean isPermisoOrdenProductoDefiProdu) {
		this.isPermisoOrdenProductoDefiProdu = isPermisoOrdenProductoDefiProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoDefiProdu() {
		return isVisibilidadCeldaNuevoProductoDefiProdu;
	}

	public void setIsVisibilidadCeldaNuevoProductoDefiProdu(Boolean isVisibilidadCeldaNuevoProductoDefiProdu) {
		this.isVisibilidadCeldaNuevoProductoDefiProdu = isVisibilidadCeldaNuevoProductoDefiProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoDefiProdu() {
		return isVisibilidadCeldaDuplicarProductoDefiProdu;
	}

	public void setIsVisibilidadCeldaDuplicarProductoDefiProdu(Boolean isVisibilidadCeldaDuplicarProductoDefiProdu) {
		this.isVisibilidadCeldaDuplicarProductoDefiProdu = isVisibilidadCeldaDuplicarProductoDefiProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoDefiProdu() {
		return isVisibilidadCeldaCopiarProductoDefiProdu;
	}

	public void setIsVisibilidadCeldaCopiarProductoDefiProdu(Boolean isVisibilidadCeldaCopiarProductoDefiProdu) {
		this.isVisibilidadCeldaCopiarProductoDefiProdu = isVisibilidadCeldaCopiarProductoDefiProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoDefiProdu() {
		return isVisibilidadCeldaVerFormProductoDefiProdu;
	}

	public void setIsVisibilidadCeldaVerFormProductoDefiProdu(Boolean isVisibilidadCeldaVerFormProductoDefiProdu) {
		this.isVisibilidadCeldaVerFormProductoDefiProdu = isVisibilidadCeldaVerFormProductoDefiProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoDefiProdu() {
		return isVisibilidadCeldaOrdenProductoDefiProdu;
	}

	public void setIsVisibilidadCeldaOrdenProductoDefiProdu(Boolean isVisibilidadCeldaOrdenProductoDefiProdu) {
		this.isVisibilidadCeldaOrdenProductoDefiProdu = isVisibilidadCeldaOrdenProductoDefiProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoDefiProdu() {
		return isVisibilidadCeldaNuevoRelacionesProductoDefiProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoDefiProdu(Boolean isVisibilidadCeldaNuevoRelacionesProductoDefiProdu) {
		this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu = isVisibilidadCeldaNuevoRelacionesProductoDefiProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoDefiProdu() {
		return isVisibilidadCeldaModificarProductoDefiProdu;
	}

	public void setIsVisibilidadCeldaModificarProductoDefiProdu(Boolean isVisibilidadCeldaModificarProductoDefiProdu) {
		this.isVisibilidadCeldaModificarProductoDefiProdu = isVisibilidadCeldaModificarProductoDefiProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoDefiProdu() {
		return isVisibilidadCeldaActualizarProductoDefiProdu;
	}

	public void setIsVisibilidadCeldaActualizarProductoDefiProdu(Boolean isVisibilidadCeldaActualizarProductoDefiProdu) {
		this.isVisibilidadCeldaActualizarProductoDefiProdu = isVisibilidadCeldaActualizarProductoDefiProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoDefiProdu() {
		return isVisibilidadCeldaEliminarProductoDefiProdu;
	}

	public void setIsVisibilidadCeldaEliminarProductoDefiProdu(Boolean isVisibilidadCeldaEliminarProductoDefiProdu) {
		this.isVisibilidadCeldaEliminarProductoDefiProdu = isVisibilidadCeldaEliminarProductoDefiProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoDefiProdu() {
		return isVisibilidadCeldaCancelarProductoDefiProdu;
	}

	public void setIsVisibilidadCeldaCancelarProductoDefiProdu(Boolean isVisibilidadCeldaCancelarProductoDefiProdu) {
		this.isVisibilidadCeldaCancelarProductoDefiProdu = isVisibilidadCeldaCancelarProductoDefiProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoDefiProdu() {
		return isVisibilidadCeldaGuardarProductoDefiProdu;
	}

	public void setIsVisibilidadCeldaGuardarProductoDefiProdu(Boolean isVisibilidadCeldaGuardarProductoDefiProdu) {
		this.isVisibilidadCeldaGuardarProductoDefiProdu = isVisibilidadCeldaGuardarProductoDefiProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoDefiProdu() {
		return isVisibilidadCeldaGuardarCambiosProductoDefiProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoDefiProdu(Boolean isVisibilidadCeldaGuardarCambiosProductoDefiProdu) {
		this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu = isVisibilidadCeldaGuardarCambiosProductoDefiProdu;
	}
		
	public ProductoDefiProduSessionBean getproductodefiproduSessionBean() {
		return this.productodefiproduSessionBean;
	}
	
	public void setproductodefiproduSessionBean(ProductoDefiProduSessionBean productodefiproduSessionBean) {
		this.productodefiproduSessionBean=productodefiproduSessionBean;
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

	public Boolean getisVisibilidadFK_IdUnidadUnad() {
		return this.isVisibilidadFK_IdUnidadUnad;
	}

	public void setisVisibilidadFK_IdUnidadUnad(Boolean isVisibilidadFK_IdUnidadUnad) {
		this.isVisibilidadFK_IdUnidadUnad=isVisibilidadFK_IdUnidadUnad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(ProductoDefiProdu productodefiprodu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productodefiprodu,null);
				this.setActualParaGuardarSucursalForeignKey(productodefiprodu,null);
				this.setActualParaGuardarBodegaForeignKey(productodefiprodu,null);
				this.setActualParaGuardarProductoForeignKey(productodefiprodu,null);
				this.setActualParaGuardarUnidadForeignKey(productodefiprodu,null);
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
	
	public void bugActualizarReferenciaActual(ProductoDefiProdu productodefiprodu,ProductoDefiProdu productodefiproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoDefiProdu(productodefiprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productodefiproduAux.setId(productodefiprodu.getId());
		productodefiproduAux.setVersionRow(productodefiprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoDefiProdu();
		
			int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productodefiproduValidator.getInvalidValues(this.productodefiprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productodefiproduLogic.setDatosCliente(datosCliente);
			productodefiproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productodefiproduAux=new  ProductoDefiProdu();
				
				productodefiproduAux.setIsNew(true);
				productodefiproduAux.setIsChanged(true);
				
				productodefiproduAux.setProductoDefiProduOriginal(this.productodefiprodu);
				
				productodefiproduAux.setId(this.productodefiprodu.getId());	
				productodefiproduAux.setVersionRow(this.productodefiprodu.getVersionRow());	
				productodefiproduAux.setid_empresa(this.productodefiprodu.getid_empresa());	
				productodefiproduAux.setid_sucursal(this.productodefiprodu.getid_sucursal());	
				productodefiproduAux.setid_bodega(this.productodefiprodu.getid_bodega());	
				productodefiproduAux.setid_producto(this.productodefiprodu.getid_producto());	
				productodefiproduAux.setid_unidad(this.productodefiprodu.getid_unidad());	
				productodefiproduAux.setcon_genera_sub_productos(this.productodefiprodu.getcon_genera_sub_productos());	
				productodefiproduAux.setdescripcion(this.productodefiprodu.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productodefiproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productodefiproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productodefiproduAux,productodefiproduLogic.getProductoDefiProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productodefiproduAux,productodefiprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productodefiproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productodefiproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productodefiproduLogic.saveProductoDefiProdus();//WithConnection
						//productodefiproduLogic.getSetVersionRowProductoDefiProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productodefiprodu,productodefiproduAux);
					
					this.refrescarForeignKeysDescripcionesProductoDefiProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productodefiproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanosEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.getProductoProduMermas().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermasEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.getProductoProduGastos().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastosEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.getProductoProdus().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodusEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanosEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermas.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermasEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastos.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastosEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodus.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodusEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productodefiproduLogic.saveProductoDefiProduRelaciones(productodefiproduAux,this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos(),this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.getProductoProduMermas(),this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.getProductoProduGastos(),this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.getProductoProdus(),this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());//WithConnection
								//productodefiproduLogic.getSetVersionRowProductoDefiProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productodefiprodu,productodefiproduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.setProductoProduManos(new ArrayList<ProductoProduMano>());
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.setProductoProduMermas(new ArrayList<ProductoProduMerma>());
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.setProductoProduGastos(new ArrayList<ProductoProduGasto>());
							this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.setProductoProdus(new ArrayList<ProductoProdu>());
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos= new ArrayList<ProductoProduMano>();
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermas= new ArrayList<ProductoProduMerma>();
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastos= new ArrayList<ProductoProduGasto>();
							this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodus= new ArrayList<ProductoProdu>();
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProduManos(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos());

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProduMermas(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.getProductoProduMermas());

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProduGastos(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.getProductoProduGastos());

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProdus(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.getProductoProdus());

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProduMaquinas(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productodefiproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productodefiproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productodefiproduAux,productodefiproduLogic.getProductoDefiProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productodefiproduAux,productodefiprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productodefiprodu,productodefiproduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productodefiproduAux=new  ProductoDefiProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productodefiproduSessionBean.getEsGuardarRelacionado() 
					|| (this.productodefiproduSessionBean.getEsGuardarRelacionado() && this.productodefiprodu.getId()>=0)) {
						
					productodefiproduAux.setIsNew(false);
				}
				
				productodefiproduAux.setIsDeleted(false);
			
				productodefiproduAux.setId(this.productodefiprodu.getId());	
				productodefiproduAux.setVersionRow(this.productodefiprodu.getVersionRow());	
				productodefiproduAux.setid_empresa(this.productodefiprodu.getid_empresa());	
				productodefiproduAux.setid_sucursal(this.productodefiprodu.getid_sucursal());	
				productodefiproduAux.setid_bodega(this.productodefiprodu.getid_bodega());	
				productodefiproduAux.setid_producto(this.productodefiprodu.getid_producto());	
				productodefiproduAux.setid_unidad(this.productodefiprodu.getid_unidad());	
				productodefiproduAux.setcon_genera_sub_productos(this.productodefiprodu.getcon_genera_sub_productos());	
				productodefiproduAux.setdescripcion(this.productodefiprodu.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productodefiproduAux,productodefiproduLogic.getProductoDefiProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productodefiproduAux,productodefiprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productodefiproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productodefiproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productodefiproduLogic.saveProductoDefiProdus();//WithConnection
						//productodefiproduLogic.getSetVersionRowProductoDefiProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productodefiprodu,productodefiproduAux);
					
					this.refrescarForeignKeysDescripcionesProductoDefiProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productodefiproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanosEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.getProductoProduMermas().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermasEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.getProductoProduGastos().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastosEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.getProductoProdus().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodusEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanosEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermas.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermasEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastos.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastosEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodus.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodusEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productodefiproduLogic.saveProductoDefiProduRelaciones(productodefiproduAux,this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos(),this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.getProductoProduMermas(),this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.getProductoProduGastos(),this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.getProductoProdus(),this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());//WithConnection
								//productodefiproduLogic.getSetVersionRowProductoDefiProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productodefiprodu,productodefiproduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.setProductoProduManos(new ArrayList<ProductoProduMano>());
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.setProductoProduMermas(new ArrayList<ProductoProduMerma>());
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.setProductoProduGastos(new ArrayList<ProductoProduGasto>());
							this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.setProductoProdus(new ArrayList<ProductoProdu>());
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos= new ArrayList<ProductoProduMano>();
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermas= new ArrayList<ProductoProduMerma>();
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastos= new ArrayList<ProductoProduGasto>();
							this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodus= new ArrayList<ProductoProdu>();
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProduManos(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos());

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProduMermas(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.getProductoProduMermas());

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProduGastos(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.getProductoProduGastos());

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProdus(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.getProductoProdus());

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProduMaquinas(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productodefiproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productodefiproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productodefiproduAux,productodefiproduLogic.getProductoDefiProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productodefiproduAux,productodefiprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productodefiprodu,productodefiproduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productodefiproduAux=new  ProductoDefiProdu();
				
				productodefiproduAux.setIsNew(false);
				productodefiproduAux.setIsChanged(false);
				
				productodefiproduAux.setIsDeleted(true);
				
				productodefiproduAux.setId(this.productodefiprodu.getId());	
				productodefiproduAux.setVersionRow(this.productodefiprodu.getVersionRow());	
				productodefiproduAux.setid_empresa(this.productodefiprodu.getid_empresa());	
				productodefiproduAux.setid_sucursal(this.productodefiprodu.getid_sucursal());	
				productodefiproduAux.setid_bodega(this.productodefiprodu.getid_bodega());	
				productodefiproduAux.setid_producto(this.productodefiprodu.getid_producto());	
				productodefiproduAux.setid_unidad(this.productodefiprodu.getid_unidad());	
				productodefiproduAux.setcon_genera_sub_productos(this.productodefiprodu.getcon_genera_sub_productos());	
				productodefiproduAux.setdescripcion(this.productodefiprodu.getdescripcion());	
				
				if(this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productodefiproduAux.getId()>=0) {	
						this.productodefiprodusEliminados.add(productodefiproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productodefiproduAux,productodefiproduLogic.getProductoDefiProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productodefiproduAux,productodefiprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productodefiproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productodefiproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productodefiproduLogic.saveProductoDefiProdus();//WithConnection
						//productodefiproduLogic.getSetVersionRowProductoDefiProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productodefiproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanosEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.getProductoProduMermas().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermasEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.getProductoProduGastos().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastosEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.getProductoProdus().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodusEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanosEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermas.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermasEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastos.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastosEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodus.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodusEliminados);
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas.addAll(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productodefiproduLogic.saveProductoDefiProduRelaciones(productodefiproduAux,this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos(),this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.getProductoProduMermas(),this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.getProductoProduGastos(),this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.getProductoProdus(),this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());//WithConnection
								//productodefiproduLogic.getSetVersionRowProductoDefiProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.setProductoProduManos(new ArrayList<ProductoProduMano>());
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.setProductoProduMermas(new ArrayList<ProductoProduMerma>());
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.setProductoProduGastos(new ArrayList<ProductoProduGasto>());
							this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.setProductoProdus(new ArrayList<ProductoProdu>());
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos= new ArrayList<ProductoProduMano>();
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermas= new ArrayList<ProductoProduMerma>();
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastos= new ArrayList<ProductoProduGasto>();
							this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodus= new ArrayList<ProductoProdu>();
							this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProduManos(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos());

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProduMermas(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.getProductoProduMermas());

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProduGastos(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.getProductoProduGastos());

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProdus(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.getProductoProdus());

							if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();}
							productodefiproduAux.setProductoProduMaquinas(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.productodefiproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productodefiproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productodefiproduAux,productodefiproduLogic.getProductoDefiProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productodefiproduAux,productodefiprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getProductoDefiProdus().addAll(this.productodefiprodusEliminados);
					
					productodefiproduLogic.saveProductoDefiProdus();//WithConnection
					//productodefiproduLogic.getSetVersionRowProductoDefiProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoDefiProdu();
				
				this.productodefiprodusEliminados= new ArrayList<ProductoDefiProdu>();		
			}
			
			if(this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Producto Definicion Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Producto Definicion Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productodefiprodu=productodefiproduAux;
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
      		//this.finishProcessProductoDefiProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoDefiProdu productodefiproduLocal) throws Exception {
		
		if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				productodefiproduLocal.setProductoProduManos(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos());
				productodefiproduLocal.setProductoProduMermas(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.getProductoProduMermas());
				productodefiproduLocal.setProductoProduGastos(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.getProductoProduGastos());
				productodefiproduLocal.setProductoProdus(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.getProductoProdus());
				productodefiproduLocal.setProductoProduMaquinas(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
			
			} else {
			
				productodefiproduLocal.setProductoProduManos(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanos);
				productodefiproduLocal.setProductoProduMermas(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermas);
				productodefiproduLocal.setProductoProduGastos(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastos);
				productodefiproduLocal.setProductoProdus(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoprodus);
				productodefiproduLocal.setProductoProduMaquinas(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoDefiProdu productodefiproduLocal) throws Exception {	
		if(this.productodefiproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productodefiproduLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productodefiproduLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productodefiproduLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productodefiproduLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				productodefiproduLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoDefiProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productodefiproduValidator.getInvalidValues(this.productodefiprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoDefiProdu productodefiprodu,List<ProductoDefiProdu> productodefiprodus) throws Exception {
		try	{		
			ProductoDefiProduConstantesFunciones.actualizarLista(productodefiprodu,productodefiprodus,this.productodefiproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoDefiProdu productodefiprodu,List<ProductoDefiProdu> productodefiprodus) throws Exception {
		try	{			
			ProductoDefiProduConstantesFunciones.actualizarSelectedLista(productodefiprodu,productodefiprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoDefiProdu> productodefiprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productodefiprodusLocal=this.productodefiproduLogic.getProductoDefiProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productodefiprodusLocal=this.productodefiprodus;
			}
			//ARCHITECTURE
		
			for(ProductoDefiProdu productodefiproduLocal:productodefiprodusLocal) {
				if(this.permiteMantenimiento(productodefiproduLocal) && productodefiproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoDefiProduConstantesFunciones.getProductoDefiProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoDefiProduConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelid_empresaProductoDefiProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoDefiProduConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelid_sucursalProductoDefiProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoDefiProduConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelid_bodegaProductoDefiProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoDefiProduConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelid_productoProductoDefiProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoDefiProduConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelid_unidadProductoDefiProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoDefiProduConstantesFunciones.CONGENERASUBPRODUCTOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelcon_genera_sub_productosProductoDefiProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoDefiProduConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoDefiProdu.jLabeldescripcionProductoDefiProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelid_empresaProductoDefiProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelid_sucursalProductoDefiProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelid_bodegaProductoDefiProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelid_productoProductoDefiProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelid_unidadProductoDefiProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelcon_genera_sub_productosProductoDefiProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoDefiProdu.jLabeldescripcionProductoDefiProdu,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ProductoProduMano")) {
			if(this.productodefiprodu==null) {
				this.productodefiprodu= new ProductoDefiProdu();
			}

			if(this.productodefiproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProductoDefiProdu
				this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);

				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.getproductoprodumano().setProductoDefiProdu(this.productodefiprodu);
			}

			return;
		}
		 else  if(sTipo.equals("ProductoProduMerma")) {
			if(this.productodefiprodu==null) {
				this.productodefiprodu= new ProductoDefiProdu();
			}

			if(this.productodefiproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProductoDefiProdu
				this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);

				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.getproductoprodumerma().setProductoDefiProdu(this.productodefiprodu);
			}

			return;
		}
		 else  if(sTipo.equals("ProductoProduGasto")) {
			if(this.productodefiprodu==null) {
				this.productodefiprodu= new ProductoDefiProdu();
			}

			if(this.productodefiproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProductoDefiProdu
				this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);

				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.getproductoprodugasto().setProductoDefiProdu(this.productodefiprodu);
			}

			return;
		}
		 else  if(sTipo.equals("ProductoProdu")) {
			if(this.productodefiprodu==null) {
				this.productodefiprodu= new ProductoDefiProdu();
			}

			if(this.productodefiproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProductoDefiProdu
				this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);

				this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.getproductoprodu().setProductoDefiProdu(this.productodefiprodu);
			}

			return;
		}
		 else  if(sTipo.equals("ProductoProduMaquina")) {
			if(this.productodefiprodu==null) {
				this.productodefiprodu= new ProductoDefiProdu();
			}

			if(this.productodefiproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProductoDefiProdu
				this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);

				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.getproductoprodumaquina().setProductoDefiProdu(this.productodefiprodu);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoProductoDefiProdu--;	
		
		
		this.productodefiproduAux=new ProductoDefiProdu();
		
		this.productodefiproduAux.setId(this.iIdNuevoProductoDefiProdu);
		this.productodefiproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productodefiproduLogic.getProductoDefiProdus().add(this.productodefiproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productodefiprodus.add(this.productodefiproduAux);
		}
		//ARCHITECTURE
		
		this.productodefiprodu=this.productodefiproduAux;
		
		if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoDefiProdu(this.productodefiprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoDefiProdu(this.productodefiprodu);
		}
				
		//this.setDefaultControlesProductoDefiProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoDefiProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoDefiProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoDefiProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoDefiProdu(this.productodefiproduBean,this.productodefiprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoDefiProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
			classes=ProductoDefiProduConstantesFunciones.getClassesRelationshipsOfProductoDefiProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productodefiproduReturnGeneral=productodefiproduLogic.procesarEventosProductoDefiProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productodefiproduLogic.getProductoDefiProdus(),this.productodefiprodu,this.productodefiproduParameterGeneral,this.isEsNuevoProductoDefiProdu,classes);//this.productodefiproduLogic.getProductoDefiProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoDefiProdu(this.productodefiproduReturnGeneral,this.productodefiproduBean,false);
		
		if(this.productodefiproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoDefiProdu(this.productodefiproduReturnGeneral.getProductoDefiProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoDefiProdu(this.productodefiproduReturnGeneral.getProductoDefiProdu());
		}
		
		if(this.productodefiproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoDefiProdu(this.productodefiproduReturnGeneral.getProductoDefiProdu(),classes);//this.productodefiproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoDefiProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoDefiProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.RecargarFormProductoDefiProdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoDefiProdu(false);
						
			if(productodefiproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.getEsGuardarRelacionado() && ProductoProduManoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduManoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaSessionBean.getEsGuardarRelacionado() && ProductoProduMermaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduMermaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoSessionBean.getEsGuardarRelacionado() && ProductoProduGastoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduGastoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduSessionBean.getEsGuardarRelacionado() && ProductoProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduMaquinaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoDefiProdu();
			}
			
			this.actualizarVisualTableDatosProductoDefiProdu();
			
			this.jTableDatosProductoDefiProdu.setRowSelectionInterval(this.getIndiceNuevoProductoDefiProdu(), this.getIndiceNuevoProductoDefiProdu());
			
			this.seleccionarFilaTablaProductoDefiProduActual();
						
			this.actualizarEstadoCeldasBotonesProductoDefiProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoDefiProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxcon_genera_sub_productosProductoDefiProdu.setEnabled(isHabilitar && this.productodefiproduConstantesFunciones.activarcon_genera_sub_productosProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jTextAreadescripcionProductoDefiProdu.setEnabled(isHabilitar && this.productodefiproduConstantesFunciones.activardescripcionProductoDefiProdu);	
		//
		this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.setEnabled(isHabilitar && this.productodefiproduConstantesFunciones.activarid_empresaProductoDefiProdu);//
		this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.setEnabled(isHabilitar && this.productodefiproduConstantesFunciones.activarid_sucursalProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.setEnabled(isHabilitar && this.productodefiproduConstantesFunciones.activarid_bodegaProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.setEnabled(isHabilitar && this.productodefiproduConstantesFunciones.activarid_productoProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.setEnabled(isHabilitar && this.productodefiproduConstantesFunciones.activarid_unidadProductoDefiProdu);
	};
	
	public void setDefaultControlesProductoDefiProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoDefiProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productodefiproduSessionBean.setConGuardarRelaciones(true);			
			this.productodefiproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.productodefiproduSessionBean.setConGuardarRelaciones(false);			
			this.productodefiproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoProductoDefiProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoDefiProdu productodefiproduAux:this.productodefiproduLogic.getProductoDefiProdus()) {
				if(productodefiproduAux.getId().equals(this.iIdNuevoProductoDefiProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoDefiProdu productodefiproduAux:this.productodefiprodus) {
				if(productodefiproduAux.getId().equals(this.iIdNuevoProductoDefiProdu)) {
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
	
	public int getIndiceActualProductoDefiProdu(ProductoDefiProdu productodefiprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoDefiProdu productodefiproduAux:this.productodefiproduLogic.getProductoDefiProdus()) {
				if(productodefiproduAux.getId().equals(productodefiprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoDefiProdu productodefiproduAux:this.productodefiprodus) {
				if(productodefiproduAux.getId().equals(productodefiprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoDefiProdu(ProductoDefiProdu productodefiproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoDefiProdu productodefiproduAux:this.productodefiproduLogic.getProductoDefiProdus()) {
				if(productodefiproduAux.getProductoDefiProduOriginal().getId().equals(productodefiproduOriginal.getId())) {
					existe=true;
					productodefiproduOriginal.setId(productodefiproduAux.getId());
					productodefiproduOriginal.setVersionRow(productodefiproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoDefiProdu productodefiproduAux:this.productodefiprodus) {
				if(productodefiproduAux.getProductoDefiProduOriginal().getId().equals(productodefiproduOriginal.getId())) {
					existe=true;
					productodefiproduOriginal.setId(productodefiproduAux.getId());
					productodefiproduOriginal.setVersionRow(productodefiproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoDefiProdu(Boolean esParaCancelar) throws Exception {
		productodefiprodusAux=new ArrayList<ProductoDefiProdu>();
		productodefiproduAux=new ProductoDefiProdu();
		
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoDefiProdu productodefiproduAux:this.productodefiproduLogic.getProductoDefiProdus()) {
					if(productodefiproduAux.getId()<0) {
						productodefiprodusAux.add(productodefiproduAux);
					}		
				}
				this.iIdNuevoProductoDefiProdu=0L;
				this.productodefiproduLogic.getProductoDefiProdus().removeAll(productodefiprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoDefiProdu productodefiproduAux:this.productodefiprodus) {
					if(productodefiproduAux.getId()<0) {
						productodefiprodusAux.add(productodefiproduAux);
					}		
				}
				this.iIdNuevoProductoDefiProdu=0L;
				this.productodefiprodus.removeAll(productodefiprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoDefiProdu 
					&& this.productodefiproduLogic.getProductoDefiProdus().size()>0
					) {
					productodefiproduAux=this.productodefiproduLogic.getProductoDefiProdus().get(this.productodefiproduLogic.getProductoDefiProdus().size() - 1);
				
					if(productodefiproduAux.getId()<0) {
						this.productodefiproduLogic.getProductoDefiProdus().remove(productodefiproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoDefiProdu && this.productodefiprodus.size()>0) {
					productodefiproduAux=this.productodefiprodus.get(this.productodefiprodus.size() - 1);
				
					if(productodefiproduAux.getId()<0) {
						this.productodefiprodus.remove(productodefiproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoDefiProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productodefiprodu.getId()<0) {
				this.productodefiproduLogic.getProductoDefiProdus().remove(this.productodefiprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productodefiprodu.getId()<0) {
				this.productodefiprodus.remove(this.productodefiprodu);
			}
		}			
	}
	
	public void setEstadosInicialesProductoDefiProdu(List<ProductoDefiProdu> productodefiprodusAux) throws Exception {
		ProductoDefiProduConstantesFunciones.setEstadosInicialesProductoDefiProdu(productodefiprodusAux);
	}
	
	public void setEstadosInicialesProductoDefiProdu(ProductoDefiProdu productodefiproduAux) throws Exception {
		ProductoDefiProduConstantesFunciones.setEstadosInicialesProductoDefiProdu(productodefiproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoDefiProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoDefiProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoDefiProduActual()) {
				if(!this.isEsNuevoProductoDefiProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoDefiProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoDefiProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoDefiProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Producto Definicion Produccion ?", "MANTENIMIENTO DE Producto Definicion Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoDefiProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoDefiProdu productodefiprodu) throws Exception {
		ProductoDefiProduConstantesFunciones.seleccionarAsignar(this.productodefiprodu,productodefiprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoDefiProdu=this.isPermisoActualizarOriginalProductoDefiProdu;
			
			
			this.seleccionarAsignar(productodefiprodu);
			
			

			idProductoActual=productodefiprodu.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoDefiProduConstantesFunciones.quitarEspaciosProductoDefiProdu(this.productodefiprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoDefiProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productodefiproduSessionBean.setsFuncionBusquedaRapida(this.productodefiproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoProductoDefiProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoDefiProdu(esParaCancelar);				
				this.cancelarNuevoProductoDefiProdu(esParaCancelar);								
			}
			
			this.productodefiprodu=new ProductoDefiProdu();
			
			this.inicializarProductoDefiProdu();
			
			this.actualizarEstadoCeldasBotonesProductoDefiProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoDefiProdu() throws Exception {
		try {
			ProductoDefiProduConstantesFunciones.inicializarProductoDefiProdu(this.productodefiprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productodefiproduLogic.getProductoDefiProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoDefiProdus(String sAccionBusqueda,List<ProductoDefiProdu> productodefiprodusParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoDefiProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoDefiProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoDefiProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoDefiProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Producto Definicion Producciones");		
		parameters.put("busquedapor", ProductoDefiProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ProductoProduMano.class));
			classes.add(new Classe(ProductoProduMerma.class));
			classes.add(new Classe(ProductoProduGasto.class));
			classes.add(new Classe(ProductoProdu.class));
			classes.add(new Classe(ProductoProduMaquina.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ProductoDefiProduLogic productodefiproduLogicAuxiliar=new ProductoDefiProduLogic();
					productodefiproduLogicAuxiliar.setDatosCliente(productodefiproduLogic.getDatosCliente());				
					productodefiproduLogicAuxiliar.setProductoDefiProdus(productodefiprodusParaReportes);
					
					productodefiproduLogicAuxiliar.cargarRelacionesLoteForeignKeyProductoDefiProduWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					productodefiprodusParaReportes=productodefiproduLogicAuxiliar.getProductoDefiProdus();
					
					//productodefiproduLogic.getNewConnexionToDeep();
					
					//for (ProductoDefiProdu productodefiprodu:productodefiprodusParaReportes) {
					//	productodefiproduLogic.deepLoad(productodefiprodu, false, DeepLoadType.INCLUDE, classes);
					//}						
					//productodefiproduLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//productodefiproduLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProductoProduMano = AuxiliarReportes.class.getResourceAsStream("ProductoProduManoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoprodumano", reportFileProductoProduMano);

			InputStream reportFileProductoProduMerma = AuxiliarReportes.class.getResourceAsStream("ProductoProduMermaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoprodumerma", reportFileProductoProduMerma);

			InputStream reportFileProductoProduGasto = AuxiliarReportes.class.getResourceAsStream("ProductoProduGastoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoprodugasto", reportFileProductoProduGasto);

			InputStream reportFileProductoProdu = AuxiliarReportes.class.getResourceAsStream("ProductoProduDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoprodu", reportFileProductoProdu);

			InputStream reportFileProductoProduMaquina = AuxiliarReportes.class.getResourceAsStream("ProductoProduMaquinaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoprodumaquina", reportFileProductoProduMaquina);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoDefiProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoDefiProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoDefiProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoDefiProdu=new JRBeanArrayDataSource(ProductoDefiProduJInternalFrame.TraerProductoDefiProduBeans(productodefiprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoDefiProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoDefiProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoDefiProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoDefiProduBean.TraerProductoDefiProduBeans(productodefiprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoDefiProdus(sAccionBusqueda,sTipoArchivoReporte,productodefiprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoDefiProdus(sAccionBusqueda,sTipoArchivoReporte,productodefiprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoDefiProduActionPerformed(null);
					//this.generarExcelReporteProductoDefiProdus(sAccionBusqueda,sTipoArchivoReporte,productodefiprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoDefiProdus(sAccionBusqueda,sTipoArchivoReporte,productodefiprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoDefiProdus(sAccionBusqueda,sTipoArchivoReporte,productodefiprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoDefiProdus(sAccionBusqueda,sTipoArchivoReporte,productodefiprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoDefiProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoDefiProdu> productodefiprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productodefiprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoDefiProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoDefiProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoDefiProdu productodefiprodu : productodefiprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoDefiProduConstantesFunciones.generarExcelReporteDataProductoDefiProdu("NORMAL",row,workbook,productodefiprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Definicion Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoDefiProdu(String sTipo,Row row,Workbook workbook) {
		
		ProductoDefiProduConstantesFunciones.generarExcelReporteHeaderProductoDefiProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoDefiProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoDefiProdu> productodefiprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productodefiprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoDefiProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoDefiProdu productodefiprodu : productodefiprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoDefiProduConstantesFunciones.getProductoDefiProduDescripcion(productodefiprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productodefiprodu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productodefiprodu.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productodefiprodu.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productodefiprodu.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productodefiprodu.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(productodefiprodu.getcon_genera_sub_productos()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productodefiprodu.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Definicion Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoDefiProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoDefiProdu> productodefiprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoDefiProdu> productodefiprodusRespaldo=null;
		
		classes=ProductoDefiProduConstantesFunciones.getClassesRelationshipsOfProductoDefiProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productodefiproduLogic.setDatosCliente(this.datosCliente);
		this.productodefiproduLogic.setDatosDeep(this.datosDeep);
		this.productodefiproduLogic.setIsConDeep(true);
		
		productodefiprodusRespaldo=this.productodefiproduLogic.getProductoDefiProdus();
		
		this.productodefiproduLogic.setProductoDefiProdus(productodefiprodusParaReportes);	
		this.productodefiproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productodefiprodusParaReportes=this.productodefiproduLogic.getProductoDefiProdus();
		this.productodefiproduLogic.setProductoDefiProdus(productodefiprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productodefiprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoDefiProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoDefiProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoDefiProdu productodefiprodu : productodefiprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoDefiProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoDefiProduConstantesFunciones.generarExcelReporteDataProductoDefiProdu("NORMAL",row,workbook,productodefiprodu,cellStyleDataAux);
		
			
			


				//ProductoProduMano
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoProduManoConstantesFunciones.SCLASSWEBTITULO))) {

				if(productodefiprodu.getProductoProduManos()!=null && productodefiprodu.getProductoProduManos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoProduManoConstantesFunciones.generarExcelReporteHeaderProductoProduMano("RELACIONADO",row,workbook);
				}

				if(productodefiprodu.getProductoProduManos()!=null) {
					i2=0;
					for(ProductoProduMano productoprodumano : productodefiprodu.getProductoProduManos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoProduManoConstantesFunciones.generarExcelReporteDataProductoProduMano("RELACIONADO",row,workbook,productoprodumano,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ProductoProduMerma
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO))) {

				if(productodefiprodu.getProductoProduMermas()!=null && productodefiprodu.getProductoProduMermas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoProduMermaConstantesFunciones.generarExcelReporteHeaderProductoProduMerma("RELACIONADO",row,workbook);
				}

				if(productodefiprodu.getProductoProduMermas()!=null) {
					i2=0;
					for(ProductoProduMerma productoprodumerma : productodefiprodu.getProductoProduMermas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoProduMermaConstantesFunciones.generarExcelReporteDataProductoProduMerma("RELACIONADO",row,workbook,productoprodumerma,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ProductoProduGasto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO))) {

				if(productodefiprodu.getProductoProduGastos()!=null && productodefiprodu.getProductoProduGastos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoProduGastoConstantesFunciones.generarExcelReporteHeaderProductoProduGasto("RELACIONADO",row,workbook);
				}

				if(productodefiprodu.getProductoProduGastos()!=null) {
					i2=0;
					for(ProductoProduGasto productoprodugasto : productodefiprodu.getProductoProduGastos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoProduGastoConstantesFunciones.generarExcelReporteDataProductoProduGasto("RELACIONADO",row,workbook,productoprodugasto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ProductoProdu
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoProduConstantesFunciones.SCLASSWEBTITULO))) {

				if(productodefiprodu.getProductoProdus()!=null && productodefiprodu.getProductoProdus().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoProduConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoProduConstantesFunciones.generarExcelReporteHeaderProductoProdu("RELACIONADO",row,workbook);
				}

				if(productodefiprodu.getProductoProdus()!=null) {
					i2=0;
					for(ProductoProdu productoprodu : productodefiprodu.getProductoProdus()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoProduConstantesFunciones.generarExcelReporteDataProductoProdu("RELACIONADO",row,workbook,productoprodu,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ProductoProduMaquina
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO))) {

				if(productodefiprodu.getProductoProduMaquinas()!=null && productodefiprodu.getProductoProduMaquinas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoProduMaquinaConstantesFunciones.generarExcelReporteHeaderProductoProduMaquina("RELACIONADO",row,workbook);
				}

				if(productodefiprodu.getProductoProduMaquinas()!=null) {
					i2=0;
					for(ProductoProduMaquina productoprodumaquina : productodefiprodu.getProductoProduMaquinas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoProduMaquinaConstantesFunciones.generarExcelReporteDataProductoProduMaquina("RELACIONADO",row,workbook,productoprodumaquina,cellStyleDataAuxHijo);
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
		cell.setCellValue(ProductoDefiProduConstantesFunciones.getProductoDefiProduDescripcion(productodefiprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Definicion Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoDefiProdu() throws Exception {		
		this.startProcessProductoDefiProdu(true);
	}
	
	public void startProcessProductoDefiProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoDefiProdu ,this.jPanelParametrosReportesProductoDefiProdu, this.jScrollPanelDatosProductoDefiProdu,this.jPanelPaginacionProductoDefiProdu, this.jScrollPanelDatosEdicionProductoDefiProdu, this.jPanelAccionesProductoDefiProdu,this.jPanelAccionesFormularioProductoDefiProdu,this.jmenuBarProductoDefiProdu,this.jmenuBarDetalleProductoDefiProdu,this.jTtoolBarProductoDefiProdu,this.jTtoolBarDetalleProductoDefiProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoDefiProdu=this.jTabbedPaneBusquedasProductoDefiProdu; 
		
		final JPanel jPanelParametrosReportesProductoDefiProdu=this.jPanelParametrosReportesProductoDefiProdu;
		//final JScrollPane jScrollPanelDatosProductoDefiProdu=this.jScrollPanelDatosProductoDefiProdu;
		final JTable jTableDatosProductoDefiProdu=this.jTableDatosProductoDefiProdu;		
		final JPanel jPanelPaginacionProductoDefiProdu=this.jPanelPaginacionProductoDefiProdu;
		//final JScrollPane jScrollPanelDatosEdicionProductoDefiProdu=this.jScrollPanelDatosEdicionProductoDefiProdu;
		final JPanel jPanelAccionesProductoDefiProdu=this.jPanelAccionesProductoDefiProdu;
		
		JPanel jPanelCamposAuxiliarProductoDefiProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoDefiProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
			jPanelCamposAuxiliarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jPanelCamposProductoDefiProdu;
			jPanelAccionesFormularioAuxiliarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jPanelAccionesFormularioProductoDefiProdu;
		}
		
		final JPanel jPanelCamposProductoDefiProdu=jPanelCamposAuxiliarProductoDefiProdu;
		final JPanel jPanelAccionesFormularioProductoDefiProdu=jPanelAccionesFormularioAuxiliarProductoDefiProdu;
		
		
		final JMenuBar jmenuBarProductoDefiProdu=this.jmenuBarProductoDefiProdu;
		final JToolBar jTtoolBarProductoDefiProdu=this.jTtoolBarProductoDefiProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoDefiProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoDefiProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
			jmenuBarDetalleAuxiliarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jmenuBarDetalleProductoDefiProdu;
			jTtoolBarDetalleAuxiliarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jTtoolBarDetalleProductoDefiProdu;
		}
		
		final JMenuBar jmenuBarDetalleProductoDefiProdu=jmenuBarDetalleAuxiliarProductoDefiProdu;
		final JToolBar jTtoolBarDetalleProductoDefiProdu=jTtoolBarDetalleAuxiliarProductoDefiProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoDefiProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoDefiProdu;
			processRunnable.jTableDatos=jTableDatosProductoDefiProdu;
			processRunnable.jPanelCampos=jPanelCamposProductoDefiProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoDefiProdu;
			processRunnable.jPanelAcciones=jPanelAccionesProductoDefiProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoDefiProdu;
			
			
			processRunnable.jmenuBar=jmenuBarProductoDefiProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoDefiProdu;
			processRunnable.jTtoolBar=jTtoolBarProductoDefiProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoDefiProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoDefiProdu ,jPanelParametrosReportesProductoDefiProdu,jTableDatosProductoDefiProdu, /*jScrollPanelDatosProductoDefiProdu,*/jPanelCamposProductoDefiProdu,jPanelPaginacionProductoDefiProdu, /*jScrollPanelDatosEdicionProductoDefiProdu,*/ jPanelAccionesProductoDefiProdu,jPanelAccionesFormularioProductoDefiProdu,jmenuBarProductoDefiProdu,jmenuBarDetalleProductoDefiProdu,jTtoolBarProductoDefiProdu,jTtoolBarDetalleProductoDefiProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoDefiProdu ,jPanelParametrosReportesProductoDefiProdu, jScrollPanelDatosProductoDefiProdu,jPanelPaginacionProductoDefiProdu, jScrollPanelDatosEdicionProductoDefiProdu, jPanelAccionesProductoDefiProdu,jPanelAccionesFormularioProductoDefiProdu,jmenuBarProductoDefiProdu,jmenuBarDetalleProductoDefiProdu,jTtoolBarProductoDefiProdu,jTtoolBarDetalleProductoDefiProdu);
						
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
	
	public void finishProcessProductoDefiProdu() {// throws Exception 
		this.finishProcessProductoDefiProdu(true);
	}
	
	public void finishProcessProductoDefiProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoDefiProdu ,this.jPanelParametrosReportesProductoDefiProdu, this.jScrollPanelDatosProductoDefiProdu,this.jPanelPaginacionProductoDefiProdu, this.jScrollPanelDatosEdicionProductoDefiProdu, this.jPanelAccionesProductoDefiProdu,this.jPanelAccionesFormularioProductoDefiProdu,this.jmenuBarProductoDefiProdu,this.jmenuBarDetalleProductoDefiProdu,this.jTtoolBarProductoDefiProdu,this.jTtoolBarDetalleProductoDefiProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoDefiProdu=this.jTabbedPaneBusquedasProductoDefiProdu; 
		
		final JPanel jPanelParametrosReportesProductoDefiProdu=this.jPanelParametrosReportesProductoDefiProdu;
		//final JScrollPane jScrollPanelDatosProductoDefiProdu=this.jScrollPanelDatosProductoDefiProdu;
		final JTable jTableDatosProductoDefiProdu=this.jTableDatosProductoDefiProdu;		
		final JPanel jPanelPaginacionProductoDefiProdu=this.jPanelPaginacionProductoDefiProdu;
		//final JScrollPane jScrollPanelDatosEdicionProductoDefiProdu=this.jScrollPanelDatosEdicionProductoDefiProdu;
		final JPanel jPanelAccionesProductoDefiProdu=this.jPanelAccionesProductoDefiProdu;
		
		JPanel jPanelCamposAuxiliarProductoDefiProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoDefiProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
			jPanelCamposAuxiliarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jPanelCamposProductoDefiProdu;
			jPanelAccionesFormularioAuxiliarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jPanelAccionesFormularioProductoDefiProdu;
		}
		
		final JPanel jPanelCamposProductoDefiProdu=jPanelCamposAuxiliarProductoDefiProdu;
		final JPanel jPanelAccionesFormularioProductoDefiProdu=jPanelAccionesFormularioAuxiliarProductoDefiProdu;
		
		
		final JMenuBar jmenuBarProductoDefiProdu=this.jmenuBarProductoDefiProdu;		
		final JToolBar jTtoolBarProductoDefiProdu=this.jTtoolBarProductoDefiProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoDefiProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoDefiProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
			jmenuBarDetalleAuxiliarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jmenuBarDetalleProductoDefiProdu;
			jTtoolBarDetalleAuxiliarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jTtoolBarDetalleProductoDefiProdu;		
		}
		
		final JMenuBar jmenuBarDetalleProductoDefiProdu=jmenuBarDetalleAuxiliarProductoDefiProdu;
		final JToolBar jTtoolBarDetalleProductoDefiProdu=jTtoolBarDetalleAuxiliarProductoDefiProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoDefiProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoDefiProdu;
			processRunnable.jTableDatos=jTableDatosProductoDefiProdu;
			processRunnable.jPanelCampos=jPanelCamposProductoDefiProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoDefiProdu;
			processRunnable.jPanelAcciones=jPanelAccionesProductoDefiProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoDefiProdu;
			
			
			processRunnable.jmenuBar=jmenuBarProductoDefiProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoDefiProdu;
			processRunnable.jTtoolBar=jTtoolBarProductoDefiProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoDefiProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoDefiProdu ,jPanelParametrosReportesProductoDefiProdu, jTableDatosProductoDefiProdu,/*jScrollPanelDatosProductoDefiProdu,*/jPanelCamposProductoDefiProdu,jPanelPaginacionProductoDefiProdu, /*jScrollPanelDatosEdicionProductoDefiProdu,*/ jPanelAccionesProductoDefiProdu,jPanelAccionesFormularioProductoDefiProdu,jmenuBarProductoDefiProdu,jmenuBarDetalleProductoDefiProdu,jTtoolBarProductoDefiProdu,jTtoolBarDetalleProductoDefiProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoDefiProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoDefiProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoDefiProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoDefiProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoDefiProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoDefiProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoDefiProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoDefiProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoDefiProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productodefiproduConstantesFunciones.getsFinalQueryProductoDefiProdu();
		String  finalQueryPaginacionTodos=this.productodefiproduConstantesFunciones.getsFinalQueryProductoDefiProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoDefiProduConstantesFunciones.getArrayColumnasGlobalesNoProductoDefiProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoDefiProduConstantesFunciones.getArrayColumnasGlobalesProductoDefiProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoDefiProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productodefiprodusEliminados= new ArrayList<ProductoDefiProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoDefiProdu();
		
				///*ProductoDefiProduSessionBean*/this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			
			if(this.productodefiproduSessionBean==null) {
				this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
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
					this.iNumeroPaginacion=ProductoDefiProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoDefiProduConstantesFunciones.getClassesForeignKeysOfProductoDefiProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productodefiprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productodefiprodusAux= new ArrayList<ProductoDefiProdu>();
			
				
			productodefiproduLogic.setDatosCliente(this.datosCliente);
			productodefiproduLogic.setDatosDeep(this.datosDeep);
			productodefiproduLogic.setIsConDeep(true);
			
			
			productodefiproduLogic.getProductoDefiProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productodefiproduLogic.getTodosProductoDefiProdus(finalQueryGlobal,pagination);
					
					//productodefiproduLogic.getTodosProductoDefiProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productodefiproduLogic.getProductoDefiProdus()==null|| productodefiproduLogic.getProductoDefiProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productodefiprodusAux= new ArrayList<ProductoDefiProdu>();
							productodefiprodusAux.addAll(productodefiproduLogic.getProductoDefiProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productodefiprodusAux= new ArrayList<ProductoDefiProdu>();
							productodefiprodusAux.addAll(productodefiprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productodefiproduLogic.getTodosProductoDefiProdus(finalQueryGlobal+"",this.pagination);												
							
							//productodefiproduLogic.getTodosProductoDefiProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoDefiProdus("Todos",productodefiproduLogic.getProductoDefiProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productodefiproduLogic.setProductoDefiProdus(new ArrayList<ProductoDefiProdu>());					
							productodefiproduLogic.getProductoDefiProdus().addAll(productodefiprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productodefiprodus=new ArrayList<ProductoDefiProdu>();
							productodefiprodus.addAll(productodefiprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoDefiProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoDefiProdu=this.idActual;
				
				} else if(this.idProductoDefiProduActual!=null && this.idProductoDefiProduActual!=0L) {
					idProductoDefiProdu=idProductoDefiProduActual;
				}
				
					
				this.sDetalleReporte=ProductoDefiProduConstantesFunciones.getDetalleIndicePorId(idProductoDefiProdu);
				
				this.productodefiprodus=new ArrayList<ProductoDefiProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productodefiproduLogic.getEntity(idProductoDefiProdu);
					
					//productodefiproduLogic.getEntityWithConnection(idProductoDefiProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLogic.setProductoDefiProdus(new ArrayList<ProductoDefiProdu>());
					productodefiproduLogic.getProductoDefiProdus().add(productodefiproduLogic.getProductoDefiProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productodefiprodus=new ArrayList<ProductoDefiProdu>();
					this.productodefiprodus.add(productodefiprodu);
				}
				
				if(productodefiproduLogic.getProductoDefiProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ProductoDefiProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productodefiproduLogic.getProductoDefiProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoDefiProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoDefiProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productodefiproduLogic.getProductoDefiProdus()==null||productodefiproduLogic.getProductoDefiProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productodefiprodus==null|| productodefiprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productodefiprodusAux=new ArrayList<ProductoDefiProdu>();
						productodefiprodusAux.addAll(productodefiproduLogic.getProductoDefiProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productodefiprodusAux=new ArrayList<ProductoDefiProdu>();
							productodefiprodusAux.addAll(productodefiprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productodefiproduLogic.getProductoDefiProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoDefiProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoDefiProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoDefiProdus("FK_IdEmpresa",productodefiproduLogic.getProductoDefiProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoDefiProdus("FK_IdEmpresa",productodefiprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productodefiproduLogic.setProductoDefiProdus(new ArrayList<ProductoDefiProdu>());
						productodefiproduLogic.getProductoDefiProdus().addAll(productodefiprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productodefiprodus=new ArrayList<ProductoDefiProdu>();
							productodefiprodus.addAll(productodefiprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ProductoDefiProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productodefiproduLogic.getProductoDefiProdusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoDefiProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoDefiProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productodefiproduLogic.getProductoDefiProdus()==null||productodefiproduLogic.getProductoDefiProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productodefiprodus==null|| productodefiprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productodefiprodusAux=new ArrayList<ProductoDefiProdu>();
						productodefiprodusAux.addAll(productodefiproduLogic.getProductoDefiProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productodefiprodusAux=new ArrayList<ProductoDefiProdu>();
							productodefiprodusAux.addAll(productodefiprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productodefiproduLogic.getProductoDefiProdusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoDefiProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoDefiProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoDefiProdus("FK_IdSucursal",productodefiproduLogic.getProductoDefiProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoDefiProdus("FK_IdSucursal",productodefiprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productodefiproduLogic.setProductoDefiProdus(new ArrayList<ProductoDefiProdu>());
						productodefiproduLogic.getProductoDefiProdus().addAll(productodefiprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productodefiprodus=new ArrayList<ProductoDefiProdu>();
							productodefiprodus.addAll(productodefiprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoDefiProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoDefiProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productodefiproduLogic.getProductoDefiProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productodefiprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productodefiproduLogic.getProductoDefiProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productodefiprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoDefiProdu productodefiprodu) {
		Boolean permite=true;
		
		if(this.productodefiprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoDefiProduConstantesFunciones.getOrderByListaProductoDefiProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoDefiProduConstantesFunciones.getOrderByListaProductoDefiProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoDefiProdu productodefiprodu:productodefiproduLogic.getProductoDefiProdus()) {
				if(productodefiprodu.getsType().equals(Constantes2.S_TOTALES)) {
					productodefiproduTotales=productodefiprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoDefiProdu productodefiprodu:this.productodefiprodus) {
				if(productodefiprodu.getsType().equals(Constantes2.S_TOTALES)) {
					productodefiproduTotales=productodefiprodu;
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
			this.productodefiproduAux=new ProductoDefiProdu();
			this.productodefiproduAux.setsType(Constantes2.S_TOTALES);
			this.productodefiproduAux.setIsNew(false);
			this.productodefiproduAux.setIsChanged(false);
			this.productodefiproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoDefiProduConstantesFunciones.TotalizarValoresFilaProductoDefiProdu(this.productodefiproduLogic.getProductoDefiProdus(),this.productodefiproduAux);
				
				this.productodefiproduLogic.getProductoDefiProdus().add(this.productodefiproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoDefiProduConstantesFunciones.TotalizarValoresFilaProductoDefiProdu(this.productodefiprodus,this.productodefiproduAux);
				
				this.productodefiprodus.add(this.productodefiproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productodefiproduTotales=new ProductoDefiProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productodefiproduLogic.getProductoDefiProdus().remove(productodefiproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productodefiprodus.remove(productodefiproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productodefiproduTotales=new ProductoDefiProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoDefiProdu productodefiprodu:productodefiproduLogic.getProductoDefiProdus()) {
				if(productodefiprodu.getsType().equals(Constantes2.S_TOTALES)) {
					productodefiproduTotales=productodefiprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoDefiProduConstantesFunciones.TotalizarValoresFilaProductoDefiProdu(this.productodefiproduLogic.getProductoDefiProdus(),productodefiproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoDefiProdu productodefiprodu:this.productodefiprodus) {
				if(productodefiprodu.getsType().equals(Constantes2.S_TOTALES)) {
					productodefiproduTotales=productodefiprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoDefiProduConstantesFunciones.TotalizarValoresFilaProductoDefiProdu(this.productodefiprodus,productodefiproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoDefiProdusFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoDefiProdusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoDefiProdusFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoDefiProdusFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoDefiProdusFK_IdUnidadUnad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidadUnad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoDefiProdusFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLogic.getProductoDefiProdusFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoDefiProdusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLogic.getProductoDefiProdusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoDefiProdusFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLogic.getProductoDefiProdusFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoDefiProdusFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLogic.getProductoDefiProdusFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoDefiProdusFK_IdUnidadUnad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLogic.getProductoDefiProdusFK_IdUnidadUnad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosProductoDefiProdu() {
		this.isPermisoTodoProductoDefiProdu=false;
		this.isPermisoNuevoProductoDefiProdu=false;
		this.isPermisoActualizarProductoDefiProdu=false;
		this.isPermisoActualizarOriginalProductoDefiProdu=false;
		this.isPermisoEliminarProductoDefiProdu=false;
		this.isPermisoGuardarCambiosProductoDefiProdu=false;
		this.isPermisoConsultaProductoDefiProdu=false;
		this.isPermisoBusquedaProductoDefiProdu=false;
		this.isPermisoReporteProductoDefiProdu=false;		
		this.isPermisoOrdenProductoDefiProdu=false;		
		this.isPermisoPaginacionMedioProductoDefiProdu=false;		
		this.isPermisoPaginacionAltoProductoDefiProdu=false;
		this.isPermisoPaginacionTodoProductoDefiProdu=false;
		this.isPermisoCopiarProductoDefiProdu=false;		
		this.isPermisoVerFormProductoDefiProdu=false;		
		this.isPermisoDuplicarProductoDefiProdu=false;		
		this.isPermisoOrdenProductoDefiProdu=false;		
	}
	
	public void setPermisosUsuarioProductoDefiProdu(Boolean isPermiso) {
		this.isPermisoTodoProductoDefiProdu=isPermiso;
		this.isPermisoNuevoProductoDefiProdu=isPermiso;
		this.isPermisoActualizarProductoDefiProdu=isPermiso;
		this.isPermisoActualizarOriginalProductoDefiProdu=isPermiso;
		this.isPermisoEliminarProductoDefiProdu=isPermiso;
		this.isPermisoGuardarCambiosProductoDefiProdu=isPermiso;
		this.isPermisoConsultaProductoDefiProdu=isPermiso;
		this.isPermisoBusquedaProductoDefiProdu=isPermiso;
		this.isPermisoReporteProductoDefiProdu=isPermiso;
		this.isPermisoOrdenProductoDefiProdu=isPermiso;		
		this.isPermisoPaginacionMedioProductoDefiProdu=isPermiso;		
		this.isPermisoPaginacionAltoProductoDefiProdu=isPermiso;		
		this.isPermisoPaginacionTodoProductoDefiProdu=isPermiso;		
		this.isPermisoCopiarProductoDefiProdu=isPermiso;		
		this.isPermisoVerFormProductoDefiProdu=isPermiso;		
		this.isPermisoDuplicarProductoDefiProdu=isPermiso;
		this.isPermisoOrdenProductoDefiProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoDefiProdu(Boolean isPermiso) {
		//this.isPermisoTodoProductoDefiProdu=isPermiso;
		this.isPermisoNuevoProductoDefiProdu=isPermiso;
		this.isPermisoActualizarProductoDefiProdu=isPermiso;
		this.isPermisoActualizarOriginalProductoDefiProdu=isPermiso;
		this.isPermisoEliminarProductoDefiProdu=isPermiso;
		this.isPermisoGuardarCambiosProductoDefiProdu=isPermiso;
		//this.isPermisoConsultaProductoDefiProdu=isPermiso;
		//this.isPermisoBusquedaProductoDefiProdu=isPermiso;
		//this.isPermisoReporteProductoDefiProdu=isPermiso;
		//this.isPermisoOrdenProductoDefiProdu=isPermiso;		
		//this.isPermisoPaginacionMedioProductoDefiProdu=isPermiso;		
		//this.isPermisoPaginacionAltoProductoDefiProdu=isPermiso;		
		//this.isPermisoPaginacionTodoProductoDefiProdu=isPermiso;		
		//this.isPermisoCopiarProductoDefiProdu=isPermiso;		
		//this.isPermisoDuplicarProductoDefiProdu=isPermiso;
		//this.isPermisoOrdenProductoDefiProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoDefiProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoProduManoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProductoProduMermaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProductoProduGastoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProductoProduConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION);
		
		if(ProductoDefiProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProductoProduMano=false;
		this.isTienePermisosProductoProduMano=this.verificarGetPermisosUsuarioOpcionProductoDefiProduClaseRelacionada(this.opcionsRelacionadas,ProductoProduManoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProductoProduMerma=false;
		this.isTienePermisosProductoProduMerma=this.verificarGetPermisosUsuarioOpcionProductoDefiProduClaseRelacionada(this.opcionsRelacionadas,ProductoProduMermaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProductoProduGasto=false;
		this.isTienePermisosProductoProduGasto=this.verificarGetPermisosUsuarioOpcionProductoDefiProduClaseRelacionada(this.opcionsRelacionadas,ProductoProduGastoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProductoProdu=false;
		this.isTienePermisosProductoProdu=this.verificarGetPermisosUsuarioOpcionProductoDefiProduClaseRelacionada(this.opcionsRelacionadas,ProductoProduConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProductoProduMaquina=false;
		this.isTienePermisosProductoProduMaquina=this.verificarGetPermisosUsuarioOpcionProductoDefiProduClaseRelacionada(this.opcionsRelacionadas,ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoDefiProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoDefiProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProductoProduMano=conPermiso;
		this.isTienePermisosProductoProduMerma=conPermiso;
		this.isTienePermisosProductoProduGasto=conPermiso;
		this.isTienePermisosProductoProdu=conPermiso;
		this.isTienePermisosProductoProduMaquina=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioProductoDefiProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoDefiProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoDefiProduClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProductoProduMano && this.jInternalFrameDetalleFormProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.remove(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProductoProduMerma && this.jInternalFrameDetalleFormProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.remove(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProductoProduGasto && this.jInternalFrameDetalleFormProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.remove(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProductoProdu && this.jInternalFrameDetalleFormProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.remove(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProductoProduMaquina && this.jInternalFrameDetalleFormProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.remove(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioProductoDefiProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoDefiProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoDefiProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoDefiProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoDefiProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoDefiProdu=this.isPermisoActualizarProductoDefiProdu;
			this.isPermisoEliminarProductoDefiProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoDefiProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoDefiProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoDefiProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoDefiProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoDefiProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoDefiProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoDefiProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoDefiProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoDefiProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoDefiProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoDefiProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoDefiProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoDefiProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoDefiProdu.setToolTipText(this.jTableDatosProductoDefiProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoDefiProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoDefiProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoDefiProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoDefiProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoDefiProdu() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProductoProduMano && this.productodefiproduConstantesFunciones.mostrarProductoProduManoProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto Mano De Obra Produccion");
			reporte.setsDescripcion("Producto Mano De Obra Produccion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProductoProduMerma && this.productodefiproduConstantesFunciones.mostrarProductoProduMermaProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto Merma Produccion");
			reporte.setsDescripcion("Producto Merma Produccion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProductoProduGasto && this.productodefiproduConstantesFunciones.mostrarProductoProduGastoProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto Gasto Produccion");
			reporte.setsDescripcion("Producto Gasto Produccion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProductoProdu && this.productodefiproduConstantesFunciones.mostrarProductoProduProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto Parte Produccion");
			reporte.setsDescripcion("Producto Parte Produccion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProductoProduMaquina && this.productodefiproduConstantesFunciones.mostrarProductoProduMaquinaProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto Maquina Produccion");
			reporte.setsDescripcion("Producto Maquina Produccion");
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
	public void inicializarCombosForeignKeyProductoDefiProduListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoDefiProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoDefiProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoDefiProduListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyProductoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.productosForeignKey==null||this.productosForeignKey.size()<=0)) {
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

			if(cargarCombosDependencia && (this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0)) {
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
	
	public void cargarCombosLoteForeignKeyProductoDefiProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoDefiProduParameterReturnGeneral productodefiproduReturnGeneral=new ProductoDefiProduParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.productodefiproduConstantesFunciones.cargarid_empresaProductoDefiProdu)
					 || (this.esRecargarFks && this.productodefiproduConstantesFunciones.cargarid_empresaProductoDefiProdu)) {

					if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+productodefiproduSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.productodefiproduConstantesFunciones.cargarid_sucursalProductoDefiProdu)
					 || (this.esRecargarFks && this.productodefiproduConstantesFunciones.cargarid_sucursalProductoDefiProdu)) {

					if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+productodefiproduSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.productodefiproduConstantesFunciones.cargarid_bodegaProductoDefiProdu)
					 || (this.esRecargarFks && this.productodefiproduConstantesFunciones.cargarid_bodegaProductoDefiProdu)) {

					if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+productodefiproduSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(cargarCombosDependencia && ((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.productodefiproduConstantesFunciones.cargarid_productoProductoDefiProdu)
					 || (this.esRecargarFks && this.productodefiproduConstantesFunciones.cargarid_productoProductoDefiProdu)) {

					if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+productodefiproduSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(cargarCombosDependencia && ((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.productodefiproduConstantesFunciones.cargarid_unidadProductoDefiProdu)
					 || (this.esRecargarFks && this.productodefiproduConstantesFunciones.cargarid_unidadProductoDefiProdu)) {

					if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+productodefiproduSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productodefiproduReturnGeneral=productodefiproduLogic.cargarCombosLoteForeignKeyProductoDefiProdu(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=productodefiproduReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=productodefiproduReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=productodefiproduReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=productodefiproduReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=productodefiproduReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoDefiProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.productodefiproduSessionBean==null) {
				this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			}

			if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.productodefiproduSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoDefiProdu()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega("Todos");
			this.initActionsCombosForeignKeyProducto("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoDefiProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega(sFormularioTipoBusqueda);
			this.initActionsCombosForeignKeyProducto(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyBodega(JComboBox jComboBoxBodegaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Bodega bodegaLocal=(Bodega)jComboBoxBodegaGenerico.getSelectedItem();

			if(bodegaLocal!=null  && bodegaLocal.getId()!=null  && bodegaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_bodega="+bodegaLocal.getId();
			}
			//REDEFINE
			sFinalQueryCombo=InventarioSql.GetQueryProductoFromBodega(bodegaLocal);

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboProducto=sFinalQueryCombo;

			this.productosForeignKey=new ArrayList<Producto>();
			this.cargarCombosForeignKeyProducto(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyProducto(JComboBox jComboBoxProductoGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Producto productoLocal=(Producto)jComboBoxProductoGenerico.getSelectedItem();

			if(productoLocal!=null  && productoLocal.getId()!=null  && productoLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_producto="+productoLocal.getId();
			}
			//REDEFINE
			sFinalQueryCombo=InventarioSql.GetQueryUnidadFromBodegaYProducto(productoLocal,this.productodefiprodu.getid_bodega());

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboUnidad=sFinalQueryCombo;

			this.unidadsForeignKey=new ArrayList<Unidad>();
			this.cargarCombosForeignKeyUnidad(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyBodega(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.addItemListener(new ComboBoxItemListener(this,"id_bodegaProductoDefiProdu"));
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaProductoDefiProdu"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.addActionListener(new ComboBoxActionListener(this,"id_bodegaProductoDefiProdu"));
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaProductoDefiProdu"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void initActionsCombosForeignKeyProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.addItemListener(new ComboBoxItemListener(this,"id_productoProductoDefiProdu"));
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.addFocusListener(new ComboBoxFocusListener(this,"id_productoProductoDefiProdu"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.addActionListener(new ComboBoxActionListener(this,"id_productoProductoDefiProdu"));
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.addFocusListener(new ComboBoxFocusListener(this,"id_productoProductoDefiProdu"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyProductoDefiProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoDefiProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoDefiProdu(ProductoDefiProdu productodefiprodu)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(productodefiprodu.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(productodefiprodu.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(productodefiprodu.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoDefiProdu(ProductoDefiProdu productodefiprodu,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productodefiprodu.getProducto()!=null && !sTipoEvento.equals("id_productoProductoDefiProdu")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(productodefiprodu.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoDefiProdu()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.productodefiproduConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.productodefiproduConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(this.productodefiproduConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoDefiProdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoDefiProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoDefiProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoDefiProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoDefiProdu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoDefiProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoDefiProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	





	public void recargarFormProductoDefiProduBodega(JComboBox<?> jComboBoxGenericoBodega,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProductoDefiProduid_producto(jComboBoxGenericoBodega,sFormularioTipoBusqueda,"Bodega",false);
	}

	public void recargarFormProductoDefiProduProducto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProductoDefiProduid_unidad(jComboBoxGenericoProducto,sFormularioTipoBusqueda,"Producto",false);
	}


	
	



	public void recargarFormProductoDefiProduid_producto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Bodega")){
				this.setActualParaGuardarBodegaForeignKey(this.productodefiprodu,jComboBoxGenericoProducto);
			}

			if(this.productodefiprodu.getid_bodega()!=null && this.productodefiprodu.getid_bodega()!=0L) {
				sFinalQuery+="  WHERE  id_bodega="+this.productodefiprodu.getid_bodega();
			} else {
				sFinalQuery+="  WHERE  id_bodega=-1";
			}



			//BUCLE RECURSIVO
			this.setActualProductoForeignKey(this.productodefiprodu.getid_bodega(),true,sFormularioTipoBusqueda);

			this.cargarCombosProductosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormProductoDefiProduid_unidad(JComboBox<?> jComboBoxGenericoUnidad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Producto")){
				this.setActualParaGuardarProductoForeignKey(this.productodefiprodu,jComboBoxGenericoUnidad);
			}

			if(this.productodefiprodu.getid_producto()!=null && this.productodefiprodu.getid_producto()!=0L) {
				sFinalQuery+="  WHERE  id_producto="+this.productodefiprodu.getid_producto();
			} else {
				sFinalQuery+="  WHERE  id_producto=-1";
			}



			//BUCLE RECURSIVO
			this.setActualUnidadForeignKey(this.productodefiprodu.getid_producto(),true,sFormularioTipoBusqueda);

			this.cargarCombosUnidadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ProductoDefiProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoDefiProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoDefiProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productodefiproduSessionBean=new ProductoDefiProduSessionBean(); 
		this.productodefiproduConstantesFunciones=new ProductoDefiProduConstantesFunciones(); 
		this.productodefiproduBean=new ProductoDefiProdu();//(this.productodefiproduConstantesFunciones); 		
		this.productodefiproduReturnGeneral=new ProductoDefiProduParameterReturnGeneral(); 
		
		this.productodefiproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productodefiproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoDefiProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoDefiProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoDefiProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoDefiProdu(true);
			
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
			
			this.productodefiproduConstantesFunciones=new ProductoDefiProduConstantesFunciones(); 
			this.productodefiproduBean=new ProductoDefiProdu();//this.productodefiproduConstantesFunciones); 			
			this.productodefiproduReturnGeneral=new ProductoDefiProduParameterReturnGeneral(); 
		
			ProductoDefiProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Definicion Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.productodefiprodu=new ProductoDefiProdu();
			this.productodefiprodus = new ArrayList<ProductoDefiProdu>();
			this.productodefiprodusAux = new ArrayList<ProductoDefiProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic=new ProductoDefiProduLogic();
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}
			
			//this.productodefiproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productodefiproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoDefiProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoDefiProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoDefiProdu);	
					}
					
					if(this.jInternalFrameImportacionProductoDefiProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoDefiProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoDefiProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoDefiProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoDefiProdu);
				this.jInternalFrameDetalleFormProductoDefiProdu.setVisible(false);
				this.jInternalFrameDetalleFormProductoDefiProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoDefiProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoDefiProdu);
					this.jInternalFrameReporteDinamicoProductoDefiProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoDefiProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoDefiProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoDefiProdu);
					this.jInternalFrameImportacionProductoDefiProdu.setVisible(false);
					this.jInternalFrameImportacionProductoDefiProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoDefiProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoDefiProdu);
					this.jInternalFrameOrderByProductoDefiProdu.setVisible(false);
					this.jInternalFrameOrderByProductoDefiProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoDefiProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoDefiProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productodefiproduReturnGeneral=new ProductoDefiProduParameterReturnGeneral();
			
			this.productodefiproduParameterGeneral=new ProductoDefiProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productodefiproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoDefiProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoProduManoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProductoProduMermaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProductoProduGastoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProductoProduConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoDefiProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productodefiproduSessionBean.getEsGuardarRelacionado(),this.productodefiproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoDefiProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productodefiproduSessionBean.getEsGuardarRelacionado(),this.productodefiproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoDefiProdu=false;
			this.isVisibilidadCeldaDuplicarProductoDefiProdu=true;
			this.isVisibilidadCeldaCopiarProductoDefiProdu=true;
			this.isVisibilidadCeldaVerFormProductoDefiProdu=true;
			this.isVisibilidadCeldaOrdenProductoDefiProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=false;
			this.isVisibilidadCeldaModificarProductoDefiProdu=false;
			this.isVisibilidadCeldaActualizarProductoDefiProdu=false;
			this.isVisibilidadCeldaEliminarProductoDefiProdu=false;
			this.isVisibilidadCeldaCancelarProductoDefiProdu=false;
			this.isVisibilidadCeldaGuardarProductoDefiProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUnidadUnad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoDefiProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoDefiProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoDefiProdu(false);
			
			this.setPermisosUsuarioProductoDefiProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productodefiproduSessionBean.getEsGuardarRelacionado() 
				|| (this.productodefiproduSessionBean.getEsGuardarRelacionado() && this.productodefiproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoDefiProduClasesRelacionadas();
			}
			
			if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoDefiProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoDefiProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoDefiProdu();
			}
			
			if(!this.isPermisoBusquedaProductoDefiProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoDefiProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoDefiProdu,this.isPermisoPaginacionMedioProductoDefiProdu,this.isPermisoPaginacionTodoProductoDefiProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoDefiProduConstantesFunciones.getTiposSeleccionarProductoDefiProdu());
				
				this.tiposColumnasSelect=ProductoDefiProduConstantesFunciones.getTiposSeleccionarProductoDefiProdu(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectProductoDefiProdu();				
				//this.tiposRelacionesSelect=ProductoDefiProduConstantesFunciones.getTiposRelacionesProductoDefiProdu(true);
				
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
			//if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoDefiProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioProductoDefiProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioProductoDefiProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoDefiProdu() ;
			
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
			
			
			this.productoprodumanoLogic=new ProductoProduManoLogic();
			this.productoprodumermaLogic=new ProductoProduMermaLogic();
			this.productoprodugastoLogic=new ProductoProduGastoLogic();
			this.productoproduLogic=new ProductoProduLogic();
			this.productoprodumaquinaLogic=new ProductoProduMaquinaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
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
				productodefiproduImplementable= (ProductoDefiProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoDefiProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productodefiproduImplementableHome= (ProductoDefiProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoDefiProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productodefiprodus= new ArrayList<ProductoDefiProdu>();
			this.productodefiprodusEliminados= new ArrayList<ProductoDefiProdu>();
						
			this.isEsNuevoProductoDefiProdu=false;
			this.esParaAccionDesdeFormularioProductoDefiProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoDefiProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoDefiProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoDefiProduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoDefiProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoDefiProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoDefiProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoDefiProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoDefiProdu();
			}
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoDefiProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoDefiProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoDefiProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoDefiProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoDefiProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoDefiProdu() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProductoProduConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoProduConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoDefiProdu")) {
				iIndex=this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();	
				
				

				if(sTitle.equals("Producto Parte Producciones")) {
					if(!ProductoProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProductoDefiProdu();

						this.cargarParteTabPanelRelacionadaProductoProdu(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Producto Gasto Producciones")) {
					if(!ProductoProduGastoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProductoDefiProdu();

						this.cargarParteTabPanelRelacionadaProductoProduGasto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Producto Mano De Obra Producciones")) {
					if(!ProductoProduManoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProductoDefiProdu();

						this.cargarParteTabPanelRelacionadaProductoProduMano(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Producto Maquina Producciones")) {
					if(!ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProductoDefiProdu();

						this.cargarParteTabPanelRelacionadaProductoProduMaquina(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Producto Merma Producciones")) {
					if(!ProductoProduMermaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProductoDefiProdu();

						this.cargarParteTabPanelRelacionadaProductoProduMerma(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoDefiProdu();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaProductoProdu(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProductoDefiProdu.cargarSessionConBeanSwingJInternalFrameProductoProdu(false,true,iIndex);
		this.jButtonProductoProduActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoProdu();

		//this.jTabbedPaneRelacionesProductoDefiProdu.updateUI();
		//this.jTabbedPaneRelacionesProductoDefiProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProductoDefiProdu.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProductoProduGasto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProductoDefiProdu.cargarSessionConBeanSwingJInternalFrameProductoProduGasto(false,true,iIndex);
		this.jButtonProductoProduGastoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoProduGasto();

		//this.jTabbedPaneRelacionesProductoDefiProdu.updateUI();
		//this.jTabbedPaneRelacionesProductoDefiProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProductoDefiProdu.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProductoProduMano(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProductoDefiProdu.cargarSessionConBeanSwingJInternalFrameProductoProduMano(false,true,iIndex);
		this.jButtonProductoProduManoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoProduMano();

		//this.jTabbedPaneRelacionesProductoDefiProdu.updateUI();
		//this.jTabbedPaneRelacionesProductoDefiProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProductoDefiProdu.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProductoProduMaquina(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProductoDefiProdu.cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(false,true,iIndex);
		this.jButtonProductoProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoProduMaquina();

		//this.jTabbedPaneRelacionesProductoDefiProdu.updateUI();
		//this.jTabbedPaneRelacionesProductoDefiProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProductoDefiProdu.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProductoProduMerma(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProductoDefiProdu.cargarSessionConBeanSwingJInternalFrameProductoProduMerma(false,true,iIndex);
		this.jButtonProductoProduMermaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoProduMerma();

		//this.jTabbedPaneRelacionesProductoDefiProdu.updateUI();
		//this.jTabbedPaneRelacionesProductoDefiProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProductoDefiProdu.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ProductoProduMano")) {
				int row=this.jTableDatosProductoDefiProdu.getSelectedRow();
				jButtonProductoProduManoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ProductoProduMerma")) {
				int row=this.jTableDatosProductoDefiProdu.getSelectedRow();
				jButtonProductoProduMermaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ProductoProduGasto")) {
				int row=this.jTableDatosProductoDefiProdu.getSelectedRow();
				jButtonProductoProduGastoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ProductoProdu")) {
				int row=this.jTableDatosProductoDefiProdu.getSelectedRow();
				jButtonProductoProduActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ProductoProduMaquina")) {
				int row=this.jTableDatosProductoDefiProdu.getSelectedRow();
				jButtonProductoProduMaquinaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Producto Mano De Obra Produccion")) {

					if(this.isTienePermisosProductoProduMano && this.productodefiproduConstantesFunciones.mostrarProductoProduManoProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Producto Mano De Obra Producciones"+"("+ProductoProduManoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Producto Mano De Obra Producciones");

						if(productodefiproduConstantesFunciones.resaltarProductoProduManoProductoDefiProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(productodefiproduConstantesFunciones.resaltarProductoProduManoProductoDefiProdu);
						}

						jmenuItem.setEnabled(this.productodefiproduConstantesFunciones.activarProductoProduManoProductoDefiProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoProduMano"));

						

						this.jInternalFrameDetalleFormProductoDefiProdu.jmenuDetalleProductoDefiProdu.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Producto Merma Produccion")) {

					if(this.isTienePermisosProductoProduMerma && this.productodefiproduConstantesFunciones.mostrarProductoProduMermaProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Producto Merma Producciones"+"("+ProductoProduMermaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Producto Merma Producciones");

						if(productodefiproduConstantesFunciones.resaltarProductoProduMermaProductoDefiProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(productodefiproduConstantesFunciones.resaltarProductoProduMermaProductoDefiProdu);
						}

						jmenuItem.setEnabled(this.productodefiproduConstantesFunciones.activarProductoProduMermaProductoDefiProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoProduMerma"));

						

						this.jInternalFrameDetalleFormProductoDefiProdu.jmenuDetalleProductoDefiProdu.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Producto Gasto Produccion")) {

					if(this.isTienePermisosProductoProduGasto && this.productodefiproduConstantesFunciones.mostrarProductoProduGastoProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Producto Gasto Producciones"+"("+ProductoProduGastoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Producto Gasto Producciones");

						if(productodefiproduConstantesFunciones.resaltarProductoProduGastoProductoDefiProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(productodefiproduConstantesFunciones.resaltarProductoProduGastoProductoDefiProdu);
						}

						jmenuItem.setEnabled(this.productodefiproduConstantesFunciones.activarProductoProduGastoProductoDefiProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoProduGasto"));

						

						this.jInternalFrameDetalleFormProductoDefiProdu.jmenuDetalleProductoDefiProdu.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Producto Parte Produccion")) {

					if(this.isTienePermisosProductoProdu && this.productodefiproduConstantesFunciones.mostrarProductoProduProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Producto Parte Producciones"+"("+ProductoProduConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Producto Parte Producciones");

						if(productodefiproduConstantesFunciones.resaltarProductoProduProductoDefiProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(productodefiproduConstantesFunciones.resaltarProductoProduProductoDefiProdu);
						}

						jmenuItem.setEnabled(this.productodefiproduConstantesFunciones.activarProductoProduProductoDefiProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoProdu"));

						

						this.jInternalFrameDetalleFormProductoDefiProdu.jmenuDetalleProductoDefiProdu.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Producto Maquina Produccion")) {

					if(this.isTienePermisosProductoProduMaquina && this.productodefiproduConstantesFunciones.mostrarProductoProduMaquinaProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Producto Maquina Producciones"+"("+ProductoProduMaquinaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Producto Maquina Producciones");

						if(productodefiproduConstantesFunciones.resaltarProductoProduMaquinaProductoDefiProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(productodefiproduConstantesFunciones.resaltarProductoProduMaquinaProductoDefiProdu);
						}

						jmenuItem.setEnabled(this.productodefiproduConstantesFunciones.activarProductoProduMaquinaProductoDefiProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoProduMaquina"));

						

						this.jInternalFrameDetalleFormProductoDefiProdu.jmenuDetalleProductoDefiProdu.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyProductoDefiProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoDefiProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoDefiProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoDefiProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoDefiProdu();
		
		this.cargarCombosFrameForeignKeyProductoDefiProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoDefiProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoDefiProdu();
		}
	}
	
	

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyBodega("Todos");
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
					this.initActionsCombosForeignKeyProducto("Todos");
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
					this.initActionsCombosForeignKeyProducto("Todos");
				}

			this.recargarComboTablaUnidad(this.unidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProductoDefiProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoDefiProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			
			
			if(jTableDatosProductoDefiProdu.getRowCount()>=1) {
				jTableDatosProductoDefiProdu.removeRowSelectionInterval(0, jTableDatosProductoDefiProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoDefiProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoDefiProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoDefiProdu(true);			
			//this.productodefiprodu=new ProductoDefiProdu();
			//this.productodefiprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoDefiProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoDefiProdu() ;
			
			if(ProductoDefiProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoDefiProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productodefiprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);				
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			
			if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoDefiProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoDefiProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoDefiProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoDefiProdu.getSelectedRows().length;			
			}
			
			productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoDefiProdu--;			
				//ProductoDefiProdu productodefiproduAux= new ProductoDefiProdu();			
				//productodefiproduAux.setId(this.iIdNuevoProductoDefiProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoDefiProdu productodefiproduOrigen=new ProductoDefiProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoDefiProdu productodefiproduOrigen : productodefiprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productodefiproduOrigen =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productodefiproduOrigen =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoDefiProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productodefiprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoDefiProdu(productodefiproduOrigen,this.productodefiprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productodefiproduLogic.getProductoDefiProdus().add(this.productodefiproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productodefiprodus.add(this.productodefiproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoDefiProdu(false);
				
				this.jTableDatosProductoDefiProdu.setRowSelectionInterval(this.getIndiceNuevoProductoDefiProdu(), this.getIndiceNuevoProductoDefiProdu());
				
				int iLastRow =  this.jTableDatosProductoDefiProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoDefiProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoDefiProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoDefiProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();									
		
			ProductoDefiProdu productodefiproduOrigen=new ProductoDefiProdu();
			ProductoDefiProdu productodefiproduDestino=new ProductoDefiProdu();
				
			productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoDefiProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productodefiprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoDefiProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productodefiproduOrigen =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productodefiproduOrigen =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productodefiproduDestino =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productodefiproduDestino =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productodefiproduOrigen =productodefiprodusSeleccionados.get(0);
				productodefiproduDestino =productodefiprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoDefiProdu(productodefiproduOrigen,productodefiproduDestino,true,false);
				
				productodefiproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productodefiproduDestino,productodefiproduLogic.getProductoDefiProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productodefiproduDestino,productodefiprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoDefiProdu(false);
				
				//this.jTableDatosProductoDefiProdu.setRowSelectionInterval(this.getIndiceNuevoProductoDefiProdu(), this.getIndiceNuevoProductoDefiProdu());
				
				int iLastRow =  this.jTableDatosProductoDefiProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoDefiProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoDefiProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoDefiProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoDefiProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoDefiProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoDefiProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoDefiProdu.setVisible(!isVisible);
			this.jPanelPaginacionProductoDefiProdu.setVisible(!isVisible);
			this.jPanelAccionesProductoDefiProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoDefiProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoDefiProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoDefiProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoDefiProdu();
			
			this.abrirFrameOrderByProductoDefiProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoDefiProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoDefiProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoDefiProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoDefiProdu.isMaximum()) {
					this.jInternalFrameDetalleFormProductoDefiProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoDefiProdu.setSize(this.jInternalFrameDetalleFormProductoDefiProdu.iWidthFormulario,this.jInternalFrameDetalleFormProductoDefiProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoDefiProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoDefiProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoDefiProdu.isMaximum()) {
						this.jInternalFrameDetalleFormProductoDefiProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoDefiProdu.jContentPaneDetalleProductoDefiProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoDefiProdu.jContentPaneDetalleProductoDefiProdu.getWidth(),ProductoDefiProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoDefiProdu.jContentPaneDetalleProductoDefiProdu.getWidth(),ProductoDefiProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoDefiProdu.jContentPaneDetalleProductoDefiProdu.getWidth(),ProductoDefiProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ProductoProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoProdu();
					}

					if(ProductoProduGastoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoProduGasto();
					}

					if(ProductoProduManoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoProduMano();
					}

					if(ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoProduMaquina();
					}

					if(ProductoProduMermaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoProduMerma();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoDefiProdu.setVisible(true);
	        this.jInternalFrameDetalleFormProductoDefiProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoDefiProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoDefiProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoDefiProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoDefiProdu,false,this);
				} else {
					this.jInternalFrameOrderByProductoDefiProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoDefiProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoDefiProdu);
				this.jInternalFrameOrderByProductoDefiProdu.setVisible(false);
				this.jInternalFrameOrderByProductoDefiProdu.setSelected(false);
				
				this.jInternalFrameOrderByProductoDefiProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoDefiProdu"));
				
				this.inicializarActualizarBindingTablaOrderByProductoDefiProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoDefiProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoDefiProdu==null) {
				
				this.jInternalFrameImportacionProductoDefiProdu=new ImportacionJInternalFrame(ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoDefiProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoDefiProdu);
				this.jInternalFrameImportacionProductoDefiProdu.setVisible(false);
				this.jInternalFrameImportacionProductoDefiProdu.setSelected(false);


				this.jInternalFrameImportacionProductoDefiProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoDefiProdu"));
				this.jInternalFrameImportacionProductoDefiProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoDefiProdu"));
				this.jInternalFrameImportacionProductoDefiProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoDefiProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoDefiProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoDefiProdu==null) {
				this.jInternalFrameReporteDinamicoProductoDefiProdu=new ReporteDinamicoJInternalFrame(ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoDefiProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoDefiProdu);
				this.jInternalFrameReporteDinamicoProductoDefiProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoDefiProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoDefiProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoDefiProdu"));
				this.jInternalFrameReporteDinamicoProductoDefiProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoDefiProdu"));
				this.jInternalFrameReporteDinamicoProductoDefiProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoDefiProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoDefiProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaProductoProdu() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.jScrollPanelDatosProductoProdu.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProductoDefiProdu.jContentPaneDetalleProductoDefiProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.jScrollPanelDatosProductoProdu.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.jScrollPanelDatosProductoProdu.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.jScrollPanelDatosProductoProdu.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProductoProduGasto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduGasto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProductoDefiProdu.jContentPaneDetalleProductoDefiProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduGasto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduGasto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduGasto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProductoProduMano() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMano.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProductoDefiProdu.jContentPaneDetalleProductoDefiProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMano.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMano.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMano.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProductoProduMaquina() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProductoDefiProdu.jContentPaneDetalleProductoDefiProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProductoProduMerma() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMerma.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProductoDefiProdu.jContentPaneDetalleProductoDefiProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMerma.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMerma.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMerma.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleProductoDefiProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoDefiProdu);
			
	       	this.jInternalFrameDetalleFormProductoDefiProdu.setVisible(false);
	        this.jInternalFrameDetalleFormProductoDefiProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoDefiProdu.dispose();
			//this.jInternalFrameDetalleFormProductoDefiProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoDefiProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoDefiProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoDefiProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoDefiProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoDefiProdu.setVisible(true);
	        this.jInternalFrameImportacionProductoDefiProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoDefiProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoDefiProdu.setVisible(true);
	        this.jInternalFrameOrderByProductoDefiProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoDefiProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoDefiProdu.setVisible(false);
	        this.jInternalFrameOrderByProductoDefiProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoDefiProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoDefiProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoDefiProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoDefiProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoDefiProdu.setVisible(false);
	        this.jInternalFrameImportacionProductoDefiProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoDefiProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoDefiProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoDefiProdu(true);
			//this.isEsNuevoProductoDefiProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoDefiProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoDefiProdu(false) ;
			
			if(productodefiproduSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.getEsGuardarRelacionado() && ProductoProduManoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduManoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaSessionBean.getEsGuardarRelacionado() && ProductoProduMermaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduMermaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoSessionBean.getEsGuardarRelacionado() && ProductoProduGastoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduGastoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduSessionBean.getEsGuardarRelacionado() && ProductoProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getEsGuardarRelacionado() && ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoProduMaquinaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ProductoDefiProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoDefiProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoDefiProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoDefiProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoDefiProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoDefiProdu(true);
			//this.isEsNuevoProductoDefiProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productodefiprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoDefiProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoDefiProdu(false) ;
			
			if(ProductoDefiProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoDefiProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoDefiProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.productodefiproduConstantesFunciones.cargarid_productoProductoDefiProdu) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoDefiProdu(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoDefiProdu.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoDefiProdu.getSelectedRow();

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
		TableColumn tableColumnUnidad=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoDefiProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoDefiProdu(false);
			
			//if(!this.isEsNuevoProductoDefiProdu) {								
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
				
			}
			
			if(this.permiteMantenimiento(this.productodefiprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoDefiProdu=true;
					this.inicializarActualizarBindingTablaProductoDefiProdu(false);
					this.isEsNuevoProductoDefiProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoDefiProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoDefiProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoDefiProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoDefiProdu(false);
				
				this.habilitarDeshabilitarControlesProductoDefiProdu(false);
			
												
				
				if(ProductoDefiProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoDefiProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoDefiProduActionPerformed(evt,productodefiproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoDefiProdu(this.productodefiprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoDefiProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productodefiproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productodefiprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoDefiProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoDefiProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				this.productodefiprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				this.productodefiprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productodefiprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoDefiProduModel) this.jTableDatosProductoDefiProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoDefiProdu=true;
				this.inicializarActualizarBindingTablaProductoDefiProdu(false);
				this.isEsNuevoProductoDefiProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoDefiProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoDefiProdu(false);
				
				this.habilitarDeshabilitarControlesProductoDefiProdu(false);
				
				
				
				if(ProductoDefiProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoDefiProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoDefiProdu.getRowCount()>=1) {
				jTableDatosProductoDefiProdu.removeRowSelectionInterval(0, jTableDatosProductoDefiProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoDefiProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoDefiProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoDefiProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoDefiProdu(false) ;
			
			this.isEsNuevoProductoDefiProdu=false;
			
			if(ProductoDefiProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoDefiProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoDefiProdu(false);
				
				//SI ES MANUAL
				if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoDefiProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoDefiProdu--;			
			//ProductoDefiProdu productodefiproduAux= new ProductoDefiProdu();			
			//productodefiproduAux.setId(this.iIdNuevoProductoDefiProdu);
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoDefiProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
			
			this.productodefiprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productodefiproduLogic.getProductoDefiProdus().add(this.productodefiproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productodefiprodus.add(this.productodefiproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoDefiProdu(false);
			
			this.jTableDatosProductoDefiProdu.setRowSelectionInterval(this.getIndiceNuevoProductoDefiProdu(), this.getIndiceNuevoProductoDefiProdu());
			
			int iLastRow =  this.jTableDatosProductoDefiProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoDefiProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoDefiProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoDefiProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoDefiProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoDefiProdu(false);
			
			//SI ES MANUAL
			if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoDefiProdu();
			}
			
			//this.abrirFrameTreeProductoDefiProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Producto Definicion ProduccionES ?", "MANTENIMIENTO DE Producto Definicion Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoDefiProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoDefiProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productodefiproduReturnGeneral=productodefiproduLogic.procesarImportacionProductoDefiProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productodefiproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoDefiProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoDefiProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoDefiProdu.setFileImportacion(this.jInternalFrameImportacionProductoDefiProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoDefiProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoDefiProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoDefiProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoDefiProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();		

		productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoDefiProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoDefiProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoDefiProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoDefiProduBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoDefiProdus("Todos",productodefiprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Definicion Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nGeneraSubProductos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nGeneraSubProductos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nGeneraSubProductos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nGeneraSubProductos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductoDefiProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoDefiProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoDefiProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS:
					sNombreCampoCategoria="con_genera_sub_productos";
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoDefiProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS:
					sNombreCampoCategoriaValor="con_genera_sub_productos";
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Genera Sub Productos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_genera_sub_productos");
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();		
		
		productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productodefiprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoDefiProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductoDefiProdu productodefiprodu:productodefiprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productodefiprodu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductoDefiProdu productodefiprodu:productodefiprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productodefiprodu.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductoDefiProdu productodefiprodu:productodefiprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productodefiprodu.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductoDefiProdu productodefiprodu:productodefiprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productodefiprodu.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ProductoDefiProdu productodefiprodu:productodefiprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productodefiprodu.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS);
					iRow++;

					for(ProductoDefiProdu productodefiprodu:productodefiprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productodefiprodu.getcon_genera_sub_productos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoDefiProdu productodefiprodu:productodefiprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productodefiprodu.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelProductoDefiProdu(row);				
			//	iRow++;
			//}				
			
			//for(ProductoDefiProdu productodefiproduAux:productodefiprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoDefiProdu(productodefiproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Definicion Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoDefiProdu(false);
			
			//SI ES MANUAL
			if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoDefiProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoDefiProdu(false);
			
			//SI ES MANUAL
			if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoDefiProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoDefiProdu(false);
			
			//SI ES MANUAL
			if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoDefiProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoDefiProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoDefiProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoDefiProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoDefiProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoDefiProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoDefiProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoDefiProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoDefiProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoDefiProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoDefiProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoDefiProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoDefiProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoDefiProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoDefiProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoDefiProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoDefiProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoDefiProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoDefiProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoDefiProdu();
		
		this.inicializarActualizarBindingBotonesManualProductoDefiProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoDefiProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoDefiProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoDefiProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoDefiProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoDefiProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoDefiProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoDefiProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxPostAccionNuevoProductoDefiProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxPostAccionSinCerrarProductoDefiProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxPostAccionSinMensajeProductoDefiProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoDefiProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoDefiProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoDefiProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxPostAccionNuevoProductoDefiProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxPostAccionSinCerrarProductoDefiProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxPostAccionSinMensajeProductoDefiProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoDefiProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoDefiProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoDefiProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoDefiProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoDefiProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoDefiProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoDefiProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoDefiProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoDefiProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoDefiProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoDefiProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoDefiProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoDefiProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoDefiProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoDefiProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoDefiProdu() throws Exception {
		try	{
			if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoDefiProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoDefiProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoDefiProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoDefiProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoDefiProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoDefiProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoDefiProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoDefiProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoDefiProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoDefiProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoDefiProdu.addItem(reporte);
			}
			
			
			if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoDefiProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoDefiProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoDefiProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoDefiProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoDefiProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoDefiProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoDefiProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoDefiProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoDefiProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoDefiProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoDefiProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoDefiProdu!=null) {
				this.jInternalFrameReporteDinamicoProductoDefiProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoDefiProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoDefiProdu!=null) {
				this.jInternalFrameReporteDinamicoProductoDefiProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoDefiProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoDefiProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoDefiProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoDefiProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoDefiProdu(Boolean esInicializar) throws Exception {				
		if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoDefiProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoDefiProdu() throws Exception {
		this.inicializarActualizarBindingTablaProductoDefiProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoDefiProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoDefiProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoDefiProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoDefiProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoDefiProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoDefiProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoDefiProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productodefiproduLogic.getProductoDefiProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productodefiprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoDefiProdu.setModel(new ProductoDefiProduModel(this.productodefiproduLogic.getProductoDefiProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoDefiProdu.setModel(new ProductoDefiProduModel(this.productodefiprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoDefiProdu!=null && this.jInternalFrameOrderByProductoDefiProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoDefiProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoDefiProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO,productodefiproduConstantesFunciones.resaltarSeleccionarProductoDefiProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoDefiProduConstantesFunciones.SCLASSWEBTITULO,productodefiproduConstantesFunciones.resaltarSeleccionarProductoDefiProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,ProductoDefiProduConstantesFunciones.LABEL_ID));

		if(this.productodefiproduConstantesFunciones.mostraridProductoDefiProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoDefiProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productodefiproduConstantesFunciones.resaltaridProductoDefiProdu,this.productodefiproduConstantesFunciones.activaridProductoDefiProdu,this,true,"idProductoDefiProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productodefiproduConstantesFunciones.resaltaridProductoDefiProdu,this.productodefiproduConstantesFunciones.activaridProductoDefiProdu,this,true,"idProductoDefiProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA));

		if(this.productodefiproduConstantesFunciones.mostrarid_empresaProductoDefiProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.productodefiproduConstantesFunciones.resaltarid_empresaProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarid_empresaProductoDefiProdu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.productodefiproduConstantesFunciones.resaltarid_empresaProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarid_empresaProductoDefiProdu,false,"id_empresaProductoDefiProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoDefiProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.productodefiproduConstantesFunciones.mostrarid_sucursalProductoDefiProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.productodefiproduConstantesFunciones.resaltarid_sucursalProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarid_sucursalProductoDefiProdu));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.productodefiproduConstantesFunciones.resaltarid_sucursalProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarid_sucursalProductoDefiProdu,false,"id_sucursalProductoDefiProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoDefiProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA));

		if(this.productodefiproduConstantesFunciones.mostrarid_bodegaProductoDefiProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.productodefiproduConstantesFunciones.resaltarid_bodegaProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarid_bodegaProductoDefiProdu));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.productodefiproduConstantesFunciones.resaltarid_bodegaProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarid_bodegaProductoDefiProdu,true,"id_bodegaProductoDefiProdu","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProductoDefiProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.productodefiproduConstantesFunciones.mostrarid_productoProductoDefiProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.productodefiproduConstantesFunciones.resaltarid_productoProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarid_productoProductoDefiProdu));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.productodefiproduConstantesFunciones.resaltarid_productoProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarid_productoProductoDefiProdu,true,"id_productoProductoDefiProdu","CON_BUSQUEDA-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProductoDefiProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD));

		if(this.productodefiproduConstantesFunciones.mostrarid_unidadProductoDefiProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.productodefiproduConstantesFunciones.resaltarid_unidadProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarid_unidadProductoDefiProdu));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.productodefiproduConstantesFunciones.resaltarid_unidadProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarid_unidadProductoDefiProdu,true,"id_unidadProductoDefiProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoDefiProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS));

		if(this.productodefiproduConstantesFunciones.mostrarcon_genera_sub_productosProductoDefiProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.productodefiproduConstantesFunciones.resaltarcon_genera_sub_productosProductoDefiProdu,this.productodefiproduConstantesFunciones.activarcon_genera_sub_productosProductoDefiProdu));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.productodefiproduConstantesFunciones.resaltarcon_genera_sub_productosProductoDefiProdu,this.productodefiproduConstantesFunciones.activarcon_genera_sub_productosProductoDefiProdu,this,true,"con_genera_sub_productosProductoDefiProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoDefiProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productodefiproduConstantesFunciones.mostrardescripcionProductoDefiProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productodefiproduConstantesFunciones.resaltardescripcionProductoDefiProdu,this.productodefiproduConstantesFunciones.activardescripcionProductoDefiProdu,this,true,"descripcionProductoDefiProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productodefiproduConstantesFunciones.resaltardescripcionProductoDefiProdu,this.productodefiproduConstantesFunciones.activardescripcionProductoDefiProdu,this,true,"descripcionProductoDefiProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoDefiProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProductoProduMano && this.productodefiproduConstantesFunciones.mostrarProductoProduManoProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Producto Mano De Obra Producciones");
				tableColumn.setHeaderValue("Producto Mano De Obra Producciones");
				tableColumn.setCellRenderer(new ProductoProduManoTableCell(productodefiproduConstantesFunciones.resaltarProductoProduManoProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarProductoProduManoProductoDefiProdu));
				tableColumn.setCellEditor(new ProductoProduManoTableCell(productodefiproduConstantesFunciones.resaltarProductoProduManoProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarProductoProduManoProductoDefiProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProductoDefiProdu.addColumn(tableColumn);
			}

			if(this.isTienePermisosProductoProduMerma && this.productodefiproduConstantesFunciones.mostrarProductoProduMermaProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Producto Merma Producciones");
				tableColumn.setHeaderValue("Producto Merma Producciones");
				tableColumn.setCellRenderer(new ProductoProduMermaTableCell(productodefiproduConstantesFunciones.resaltarProductoProduMermaProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarProductoProduMermaProductoDefiProdu));
				tableColumn.setCellEditor(new ProductoProduMermaTableCell(productodefiproduConstantesFunciones.resaltarProductoProduMermaProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarProductoProduMermaProductoDefiProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProductoDefiProdu.addColumn(tableColumn);
			}

			if(this.isTienePermisosProductoProduGasto && this.productodefiproduConstantesFunciones.mostrarProductoProduGastoProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Producto Gasto Producciones");
				tableColumn.setHeaderValue("Producto Gasto Producciones");
				tableColumn.setCellRenderer(new ProductoProduGastoTableCell(productodefiproduConstantesFunciones.resaltarProductoProduGastoProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarProductoProduGastoProductoDefiProdu));
				tableColumn.setCellEditor(new ProductoProduGastoTableCell(productodefiproduConstantesFunciones.resaltarProductoProduGastoProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarProductoProduGastoProductoDefiProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProductoDefiProdu.addColumn(tableColumn);
			}

			if(this.isTienePermisosProductoProdu && this.productodefiproduConstantesFunciones.mostrarProductoProduProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Producto Parte Producciones");
				tableColumn.setHeaderValue("Producto Parte Producciones");
				tableColumn.setCellRenderer(new ProductoProduTableCell(productodefiproduConstantesFunciones.resaltarProductoProduProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarProductoProduProductoDefiProdu));
				tableColumn.setCellEditor(new ProductoProduTableCell(productodefiproduConstantesFunciones.resaltarProductoProduProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarProductoProduProductoDefiProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProductoDefiProdu.addColumn(tableColumn);
			}

			if(this.isTienePermisosProductoProduMaquina && this.productodefiproduConstantesFunciones.mostrarProductoProduMaquinaProductoDefiProdu && !ProductoDefiProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Producto Maquina Producciones");
				tableColumn.setHeaderValue("Producto Maquina Producciones");
				tableColumn.setCellRenderer(new ProductoProduMaquinaTableCell(productodefiproduConstantesFunciones.resaltarProductoProduMaquinaProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarProductoProduMaquinaProductoDefiProdu));
				tableColumn.setCellEditor(new ProductoProduMaquinaTableCell(productodefiproduConstantesFunciones.resaltarProductoProduMaquinaProductoDefiProdu,this,this.productodefiproduConstantesFunciones.activarProductoProduMaquinaProductoDefiProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProductoDefiProdu.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productodefiproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productodefiproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoDefiProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productodefiproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productodefiproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoDefiProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productodefiproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productodefiproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoDefiProdu.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.productodefiproduSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosProductoDefiProdu.addColumn(tableColumn);
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
			
			this.jTableDatosProductoDefiProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.productodefiproduSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoDefiProdu.moveColumn(this.jTableDatosProductoDefiProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoDefiProdu.moveColumn(this.jTableDatosProductoDefiProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.productodefiproduSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosProductoDefiProdu.moveColumn(this.jTableDatosProductoDefiProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoDefiProdu.moveColumn(this.jTableDatosProductoDefiProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoDefiProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoDefiProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoDefiProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoDefiProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoDefiProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoDefiProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoDefiProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoDefiProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productodefiproduLogic.getProductoDefiProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productodefiprodus.size()-1;
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
		//this.jTableDatosProductoDefiProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoDefiProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoDefiProdu();
			
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
				
				//this.isEsNuevoProductoDefiProdu=false;
					
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			
				if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoDefiProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoDefiProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoDefiProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productodefiprodu.getsType().equals("DUPLICADO")
				   || this.productodefiprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoDefiProdu=true;
				
				} else {
					this.isEsNuevoProductoDefiProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
					if(this.productodefiprodu.getId()>=0 && !this.productodefiprodu.getIsNew()) {						
						this.isEsNuevoProductoDefiProdu=false;
						
					} else {
						this.isEsNuevoProductoDefiProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoDefiProdu(esRelaciones);						
				
				this.seleccionarProductoDefiProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productodefiprodu.getId()<0) {
					this.isEsNuevoProductoDefiProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoDefiProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoDefiProdu(evt,rowIndex);
				}	
				
				if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoDefiProdu: " + this.dDif); 
					}
				}								
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoDefiProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productodefiprodu)) {
					if(this.productodefiprodu.getId()>0) {
						this.productodefiprodu.setIsDeleted(true);
						
						this.productodefiprodusEliminados.add(this.productodefiprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productodefiproduLogic.getProductoDefiProdus().remove(this.productodefiprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productodefiprodus.remove(this.productodefiprodu);				
					}
					
					
					((ProductoDefiProduModel) this.jTableDatosProductoDefiProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoDefiProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoDefiProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoDefiProdu) {
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoDefiProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoDefiProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoDefiProdu(this.productodefiprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.productodefiproduConstantesFunciones.cargarid_empresaProductoDefiProdu || this.productodefiproduConstantesFunciones.event_dependid_empresaProductoDefiProdu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.productodefiprodu.getid_empresa());
									//this.inicializarActualizarBindingProductoDefiProdu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(productodefiprodu.getEmpresa()!=null) {
							this.empresasForeignKey.add(productodefiprodu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.productodefiprodu.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.productodefiproduConstantesFunciones.cargarid_sucursalProductoDefiProdu || this.productodefiproduConstantesFunciones.event_dependid_sucursalProductoDefiProdu) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.productodefiprodu.getid_sucursal());
									//this.inicializarActualizarBindingProductoDefiProdu(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(productodefiprodu.getSucursal()!=null) {
							this.sucursalsForeignKey.add(productodefiprodu.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.productodefiprodu.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.productodefiproduConstantesFunciones.cargarid_bodegaProductoDefiProdu || this.productodefiproduConstantesFunciones.event_dependid_bodegaProductoDefiProdu) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.productodefiprodu.getid_bodega());
									//this.inicializarActualizarBindingProductoDefiProdu(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(productodefiprodu.getBodega()!=null) {
							this.bodegasForeignKey.add(productodefiprodu.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.productodefiprodu.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.productodefiproduConstantesFunciones.cargarid_productoProductoDefiProdu || this.productodefiproduConstantesFunciones.event_dependid_productoProductoDefiProdu) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.productodefiprodu.getid_producto());
									//this.inicializarActualizarBindingProductoDefiProdu(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(productodefiprodu.getProducto()!=null) {
							this.productosForeignKey.add(productodefiprodu.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.productodefiprodu.getid_producto(),false,"Formulario");

					//Unidad
					if(!this.productodefiproduConstantesFunciones.cargarid_unidadProductoDefiProdu || this.productodefiproduConstantesFunciones.event_dependid_unidadProductoDefiProdu) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.productodefiprodu.getid_unidad());
									//this.inicializarActualizarBindingProductoDefiProdu(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(productodefiprodu.getUnidad()!=null) {
							this.unidadsForeignKey.add(productodefiprodu.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.productodefiprodu.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoDefiProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoDefiProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoDefiProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoDefiProdu(ProductoDefiProdu productodefiprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoDefiProdu(productodefiprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoDefiProdu(ProductoDefiProdu productodefiprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoDefiProdu(productodefiprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoDefiProdu(productodefiprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoDefiProdu(productodefiprodu);
	}
	
	public void setVariablesObjetoActualToFormularioProductoDefiProdu(ProductoDefiProdu productodefiprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoDefiProdu.jLabelidProductoDefiProdu.setText(productodefiprodu.getId().toString());
			this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxcon_genera_sub_productosProductoDefiProdu.setSelected(productodefiprodu.getcon_genera_sub_productos());
			this.jInternalFrameDetalleFormProductoDefiProdu.jTextAreadescripcionProductoDefiProdu.setText(productodefiprodu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoDefiProdu productodefiproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productodefiproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoDefiProdu productodefiproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productodefiproduLocal=this.productodefiprodu;
			} else {
				productodefiproduLocal=this.productodefiproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productodefiproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoDefiProdu(productodefiproduLocal,true);
					
					if(productodefiproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productodefiproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productodefiproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoDefiProdu(ProductoDefiProdu productodefiprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoDefiProdu(productodefiprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(productodefiprodu);
	}
	
	public void setVariablesFormularioToObjetoActualProductoDefiProdu(ProductoDefiProdu productodefiprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoDefiProdu(productodefiprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoDefiProdu(ProductoDefiProdu productodefiprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoDefiProdu.jLabelidProductoDefiProdu.getText()==null || this.jInternalFrameDetalleFormProductoDefiProdu.jLabelidProductoDefiProdu.getText()=="" || this.jInternalFrameDetalleFormProductoDefiProdu.jLabelidProductoDefiProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoDefiProdu.jLabelidProductoDefiProdu.setText("0");
			}

			if(conColumnasBase) {productodefiprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoDefiProdu.jLabelidProductoDefiProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoDefiProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelIdProductoDefiProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productodefiprodu.setcon_genera_sub_productos(this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxcon_genera_sub_productosProductoDefiProdu.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoDefiProdu.jLabelcon_genera_sub_productosProductoDefiProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productodefiprodu.setdescripcion(this.jInternalFrameDetalleFormProductoDefiProdu.jTextAreadescripcionProductoDefiProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoDefiProdu.jLabeldescripcionProductoDefiProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoDefiProdu(ProductoDefiProdu productodefiproduBean,ProductoDefiProdu productodefiprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productodefiproduBean.getid_bodega()!=null && !productodefiproduBean.getid_bodega().equals(-1L))) {productodefiprodu.setid_bodega(productodefiproduBean.getid_bodega());}
			if(conDefault || (!conDefault && productodefiproduBean.getid_producto()!=null && !productodefiproduBean.getid_producto().equals(-1L))) {productodefiprodu.setid_producto(productodefiproduBean.getid_producto());}
			if(conDefault || (!conDefault && productodefiproduBean.getid_unidad()!=null && !productodefiproduBean.getid_unidad().equals(-1L))) {productodefiprodu.setid_unidad(productodefiproduBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoDefiProdu(ProductoDefiProdu productodefiproduOrigen,ProductoDefiProdu productodefiprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productodefiproduOrigen.getId()!=null && !productodefiproduOrigen.getId().equals(0L))) {productodefiprodu.setId(productodefiproduOrigen.getId());}}
			if(conDefault || (!conDefault && productodefiproduOrigen.getid_bodega()!=null && !productodefiproduOrigen.getid_bodega().equals(-1L))) {productodefiprodu.setid_bodega(productodefiproduOrigen.getid_bodega());}
			if(conDefault || (!conDefault && productodefiproduOrigen.getid_producto()!=null && !productodefiproduOrigen.getid_producto().equals(-1L))) {productodefiprodu.setid_producto(productodefiproduOrigen.getid_producto());}
			if(conDefault || (!conDefault && productodefiproduOrigen.getid_unidad()!=null && !productodefiproduOrigen.getid_unidad().equals(-1L))) {productodefiprodu.setid_unidad(productodefiproduOrigen.getid_unidad());}
			if(conDefault || (!conDefault && productodefiproduOrigen.getcon_genera_sub_productos()!=null && !productodefiproduOrigen.getcon_genera_sub_productos().equals(false))) {productodefiprodu.setcon_genera_sub_productos(productodefiproduOrigen.getcon_genera_sub_productos());}
			if(conDefault || (!conDefault && productodefiproduOrigen.getdescripcion()!=null && !productodefiproduOrigen.getdescripcion().equals(""))) {productodefiprodu.setdescripcion(productodefiproduOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoDefiProdu(ProductoDefiProdu productodefiprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoDefiProdu.jLabelidProductoDefiProdu.setText(productodefiprodu.getId().toString());
			this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxcon_genera_sub_productosProductoDefiProdu.setSelected(productodefiprodu.getcon_genera_sub_productos());
			this.jInternalFrameDetalleFormProductoDefiProdu.jTextAreadescripcionProductoDefiProdu.setText(productodefiprodu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoDefiProdu(ProductoDefiProduBean productodefiproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoDefiProdu.jLabelidProductoDefiProdu.setText(productodefiproduBean.getId().toString());
			this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxcon_genera_sub_productosProductoDefiProdu.setSelected(productodefiproduBean.getcon_genera_sub_productos());
			this.jInternalFrameDetalleFormProductoDefiProdu.jTextAreadescripcionProductoDefiProdu.setText(productodefiproduBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoDefiProdu(ProductoDefiProduParameterReturnGeneral productodefiproduReturnGeneral,ProductoDefiProduBean productodefiproduBean,Boolean conDefault) throws Exception { 
		try {
			ProductoDefiProdu productodefiproduLocal=new ProductoDefiProdu();
			
			productodefiproduLocal=productodefiproduReturnGeneral.getProductoDefiProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productodefiproduLocal.getId()!=null && !productodefiproduLocal.getId().equals(0L))) {productodefiproduBean.setId(productodefiproduLocal.getId());}}
			if(conDefault || (!conDefault && productodefiproduLocal.getid_bodega()!=null && !productodefiproduLocal.getid_bodega().equals(-1L))) {productodefiproduBean.setid_bodega(productodefiproduLocal.getid_bodega());}
			if(conDefault || (!conDefault && productodefiproduLocal.getid_producto()!=null && !productodefiproduLocal.getid_producto().equals(-1L))) {productodefiproduBean.setid_producto(productodefiproduLocal.getid_producto());}
			if(conDefault || (!conDefault && productodefiproduLocal.getid_unidad()!=null && !productodefiproduLocal.getid_unidad().equals(-1L))) {productodefiproduBean.setid_unidad(productodefiproduLocal.getid_unidad());}
			if(conDefault || (!conDefault && productodefiproduLocal.getcon_genera_sub_productos()!=null && !productodefiproduLocal.getcon_genera_sub_productos().equals(false))) {productodefiproduBean.setcon_genera_sub_productos(productodefiproduLocal.getcon_genera_sub_productos());}
			if(conDefault || (!conDefault && productodefiproduLocal.getdescripcion()!=null && !productodefiproduLocal.getdescripcion().equals(""))) {productodefiproduBean.setdescripcion(productodefiproduLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoDefiProduGenerico(Long idProductoDefiProduSeleccionado,JComboBox jComboBoxProductoDefiProdu,List<ProductoDefiProdu> productodefiprodusLocal)throws Exception {
		try {
			ProductoDefiProdu  productodefiproduTemp=null;

			for(ProductoDefiProdu productodefiproduAux:productodefiprodusLocal) {
				if(productodefiproduAux.getId()!=null && productodefiproduAux.getId().equals(idProductoDefiProduSeleccionado)) {
					productodefiproduTemp=productodefiproduAux;
					break;
				}
			}

			jComboBoxProductoDefiProdu.setSelectedItem(productodefiproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoDefiProduGenerico(JComboBox jComboBoxProductoDefiProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoDefiProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoDefiProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoDefiProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoDefiProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoDefiProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoDefiProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ProductoProduMano")) {
			jButtonProductoProduManoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ProductoProduMerma")) {
			jButtonProductoProduMermaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ProductoProduGasto")) {
			jButtonProductoProduGastoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ProductoProdu")) {
			jButtonProductoProduActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ProductoProduMaquina")) {
			jButtonProductoProduMaquinaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productodefiprodu=(ProductoDefiProdu) productodefiproduLogic.getProductoDefiProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productodefiprodu =(ProductoDefiProdu) productodefiprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productodefiprodu.getIsNew() && !productodefiprodu.getIsChanged() && !productodefiprodu.getIsDeleted()) {
				sDescripcion=productodefiprodu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productodefiprodu.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productodefiprodu.getIsNew() && !productodefiprodu.getIsChanged() && !productodefiprodu.getIsDeleted()) {
				sDescripcion=productodefiprodu.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productodefiprodu.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productodefiprodu.getIsNew() && !productodefiprodu.getIsChanged() && !productodefiprodu.getIsDeleted()) {
				sDescripcion=productodefiprodu.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productodefiprodu.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productodefiprodu.getIsNew() && !productodefiprodu.getIsChanged() && !productodefiprodu.getIsDeleted()) {
				sDescripcion=productodefiprodu.getproducto_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=productodefiprodu.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!productodefiprodu.getIsNew() && !productodefiprodu.getIsChanged() && !productodefiprodu.getIsDeleted()) {
				sDescripcion=productodefiprodu.getunidad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=productodefiprodu.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoDefiProdu productodefiproduRow=new ProductoDefiProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productodefiproduRow=(ProductoDefiProdu) productodefiproduLogic.getProductoDefiProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productodefiproduRow=(ProductoDefiProdu) productodefiprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoProduManoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ProductoDefiProdu productodefiprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProductoDefiProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu = (ProductoDefiProdu)this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.productodefiprodu = (ProductoDefiProdu)this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(productodefiprodu!=null) {
						this.productodefiprodu = productodefiprodu;
					} else {
						this.productodefiprodu = new ProductoDefiProdu();
					}
				}

				if(this.isTienePermisosProductoProduMano && this.permiteMantenimiento(this.productodefiprodu)) {
					ProductoProduManoBeanSwingJInternalFrame productoprodumanoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFramePopup=new ProductoProduManoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoprodumanoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFramePopup;
					} else {
						productoprodumanoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame;
					}

					List<ProductoDefiProdu> productodefiprodus=new ArrayList<ProductoDefiProdu>();
					productodefiprodus.add(this.productodefiprodu);
					if(!esRelacionado) {
						//productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.setConGuardarRelaciones(false);
						//productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoprodumanoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProductoDefiProdu.cargarProductoProduManoBeanSwingJInternalFrame(productodefiprodus,this.productodefiprodu,productoprodumanoBeanSwingJInternalFrame,/*conInicializar,*/productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.getConGuardarRelaciones(),productoprodumanoBeanSwingJInternalFrame.productoprodumanoSessionBean.getEsGuardarRelacionado());
					productoprodumanoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoprodumanoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMano("no_relacionado");

						productoprodumanoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoProduManoConstantesFunciones.ITAMANIOFILATABLA + (ProductoProduManoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoprodumanoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProductoDefiProdu=(TitledBorder)this.jScrollPanelDatosProductoDefiProdu.getBorder();
						TitledBorder titledBorderProductoProduMano=(TitledBorder)productoprodumanoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMano.getBorder();

						titledBorderProductoProduMano.setTitle(titledBorderProductoDefiProdu.getTitle() + " -> Producto Mano De Obra Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoprodumanoBeanSwingJInternalFrame);
						}

						productoprodumanoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoprodumanoBeanSwingJInternalFrame);

						productoprodumanoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.productodefiproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto Mano De Obra Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProductoProduMermaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ProductoDefiProdu productodefiprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProductoDefiProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu = (ProductoDefiProdu)this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.productodefiprodu = (ProductoDefiProdu)this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(productodefiprodu!=null) {
						this.productodefiprodu = productodefiprodu;
					} else {
						this.productodefiprodu = new ProductoDefiProdu();
					}
				}

				if(this.isTienePermisosProductoProduMerma && this.permiteMantenimiento(this.productodefiprodu)) {
					ProductoProduMermaBeanSwingJInternalFrame productoprodumermaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFramePopup=new ProductoProduMermaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoprodumermaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFramePopup;
					} else {
						productoprodumermaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame;
					}

					List<ProductoDefiProdu> productodefiprodus=new ArrayList<ProductoDefiProdu>();
					productodefiprodus.add(this.productodefiprodu);
					if(!esRelacionado) {
						//productoprodumermaBeanSwingJInternalFrame.productoprodumermaSessionBean.setConGuardarRelaciones(false);
						//productoprodumermaBeanSwingJInternalFrame.productoprodumermaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoprodumermaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProductoDefiProdu.cargarProductoProduMermaBeanSwingJInternalFrame(productodefiprodus,this.productodefiprodu,productoprodumermaBeanSwingJInternalFrame,/*conInicializar,*/productoprodumermaBeanSwingJInternalFrame.productoprodumermaSessionBean.getConGuardarRelaciones(),productoprodumermaBeanSwingJInternalFrame.productoprodumermaSessionBean.getEsGuardarRelacionado());
					productoprodumermaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoprodumermaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMerma("no_relacionado");

						productoprodumermaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoProduMermaConstantesFunciones.ITAMANIOFILATABLA + (ProductoProduMermaConstantesFunciones.ITAMANIOFILATABLA/2));

						productoprodumermaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProductoDefiProdu=(TitledBorder)this.jScrollPanelDatosProductoDefiProdu.getBorder();
						TitledBorder titledBorderProductoProduMerma=(TitledBorder)productoprodumermaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMerma.getBorder();

						titledBorderProductoProduMerma.setTitle(titledBorderProductoDefiProdu.getTitle() + " -> Producto Merma Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoprodumermaBeanSwingJInternalFrame);
						}

						productoprodumermaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoprodumermaBeanSwingJInternalFrame);

						productoprodumermaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.productodefiproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto Merma Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProductoProduGastoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ProductoDefiProdu productodefiprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProductoDefiProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu = (ProductoDefiProdu)this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.productodefiprodu = (ProductoDefiProdu)this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(productodefiprodu!=null) {
						this.productodefiprodu = productodefiprodu;
					} else {
						this.productodefiprodu = new ProductoDefiProdu();
					}
				}

				if(this.isTienePermisosProductoProduGasto && this.permiteMantenimiento(this.productodefiprodu)) {
					ProductoProduGastoBeanSwingJInternalFrame productoprodugastoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFramePopup=new ProductoProduGastoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoprodugastoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFramePopup;
					} else {
						productoprodugastoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame;
					}

					List<ProductoDefiProdu> productodefiprodus=new ArrayList<ProductoDefiProdu>();
					productodefiprodus.add(this.productodefiprodu);
					if(!esRelacionado) {
						//productoprodugastoBeanSwingJInternalFrame.productoprodugastoSessionBean.setConGuardarRelaciones(false);
						//productoprodugastoBeanSwingJInternalFrame.productoprodugastoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoprodugastoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProductoDefiProdu.cargarProductoProduGastoBeanSwingJInternalFrame(productodefiprodus,this.productodefiprodu,productoprodugastoBeanSwingJInternalFrame,/*conInicializar,*/productoprodugastoBeanSwingJInternalFrame.productoprodugastoSessionBean.getConGuardarRelaciones(),productoprodugastoBeanSwingJInternalFrame.productoprodugastoSessionBean.getEsGuardarRelacionado());
					productoprodugastoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoprodugastoBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduGasto("no_relacionado");

						productoprodugastoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoProduGastoConstantesFunciones.ITAMANIOFILATABLA + (ProductoProduGastoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoprodugastoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProductoDefiProdu=(TitledBorder)this.jScrollPanelDatosProductoDefiProdu.getBorder();
						TitledBorder titledBorderProductoProduGasto=(TitledBorder)productoprodugastoBeanSwingJInternalFrame.jScrollPanelDatosProductoProduGasto.getBorder();

						titledBorderProductoProduGasto.setTitle(titledBorderProductoDefiProdu.getTitle() + " -> Producto Gasto Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoprodugastoBeanSwingJInternalFrame);
						}

						productoprodugastoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoprodugastoBeanSwingJInternalFrame);

						productoprodugastoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.productodefiproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto Gasto Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProductoProduActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ProductoDefiProdu productodefiprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProductoDefiProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu = (ProductoDefiProdu)this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.productodefiprodu = (ProductoDefiProdu)this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(productodefiprodu!=null) {
						this.productodefiprodu = productodefiprodu;
					} else {
						this.productodefiprodu = new ProductoDefiProdu();
					}
				}

				if(this.isTienePermisosProductoProdu && this.permiteMantenimiento(this.productodefiprodu)) {
					ProductoProduBeanSwingJInternalFrame productoproduBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFramePopup=new ProductoProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFramePopup;
					} else {
						productoproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame;
					}

					List<ProductoDefiProdu> productodefiprodus=new ArrayList<ProductoDefiProdu>();
					productodefiprodus.add(this.productodefiprodu);
					if(!esRelacionado) {
						//productoproduBeanSwingJInternalFrame.productoproduSessionBean.setConGuardarRelaciones(false);
						//productoproduBeanSwingJInternalFrame.productoproduSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoproduBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProductoDefiProdu.cargarProductoProduBeanSwingJInternalFrame(productodefiprodus,this.productodefiprodu,productoproduBeanSwingJInternalFrame,/*conInicializar,*/productoproduBeanSwingJInternalFrame.productoproduSessionBean.getConGuardarRelaciones(),productoproduBeanSwingJInternalFrame.productoproduSessionBean.getEsGuardarRelacionado());
					productoproduBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoproduBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProdu("no_relacionado");

						productoproduBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoProduConstantesFunciones.ITAMANIOFILATABLA + (ProductoProduConstantesFunciones.ITAMANIOFILATABLA/2));

						productoproduBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProductoDefiProdu=(TitledBorder)this.jScrollPanelDatosProductoDefiProdu.getBorder();
						TitledBorder titledBorderProductoProdu=(TitledBorder)productoproduBeanSwingJInternalFrame.jScrollPanelDatosProductoProdu.getBorder();

						titledBorderProductoProdu.setTitle(titledBorderProductoDefiProdu.getTitle() + " -> Producto Parte Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoproduBeanSwingJInternalFrame);
						}

						productoproduBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoproduBeanSwingJInternalFrame);

						productoproduBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.productodefiproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto Parte Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProductoProduMaquinaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ProductoDefiProdu productodefiprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProductoDefiProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu = (ProductoDefiProdu)this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.productodefiprodu = (ProductoDefiProdu)this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(productodefiprodu!=null) {
						this.productodefiprodu = productodefiprodu;
					} else {
						this.productodefiprodu = new ProductoDefiProdu();
					}
				}

				if(this.isTienePermisosProductoProduMaquina && this.permiteMantenimiento(this.productodefiprodu)) {
					ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFramePopup=new ProductoProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFramePopup;
					} else {
						productoprodumaquinaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame;
					}

					List<ProductoDefiProdu> productodefiprodus=new ArrayList<ProductoDefiProdu>();
					productodefiprodus.add(this.productodefiprodu);
					if(!esRelacionado) {
						//productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setConGuardarRelaciones(false);
						//productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProductoDefiProdu.cargarProductoProduMaquinaBeanSwingJInternalFrame(productodefiprodus,this.productodefiprodu,productoprodumaquinaBeanSwingJInternalFrame,/*conInicializar,*/productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getConGuardarRelaciones(),productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.getEsGuardarRelacionado());
					productoprodumaquinaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMaquina("no_relacionado");

						productoprodumaquinaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoProduMaquinaConstantesFunciones.ITAMANIOFILATABLA + (ProductoProduMaquinaConstantesFunciones.ITAMANIOFILATABLA/2));

						productoprodumaquinaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProductoDefiProdu=(TitledBorder)this.jScrollPanelDatosProductoDefiProdu.getBorder();
						TitledBorder titledBorderProductoProduMaquina=(TitledBorder)productoprodumaquinaBeanSwingJInternalFrame.jScrollPanelDatosProductoProduMaquina.getBorder();

						titledBorderProductoProduMaquina.setTitle(titledBorderProductoDefiProdu.getTitle() + " -> Producto Maquina Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoprodumaquinaBeanSwingJInternalFrame);
						}

						productoprodumaquinaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoprodumaquinaBeanSwingJInternalFrame);

						productoprodumaquinaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.productodefiproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto Maquina Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoDefiProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoDefiProdu.setVisible((this.isVisibilidadCeldaNuevoProductoDefiProdu && this.isPermisoNuevoProductoDefiProdu));			
			this.jButtonDuplicarProductoDefiProdu.setVisible((this.isVisibilidadCeldaDuplicarProductoDefiProdu && this.isPermisoDuplicarProductoDefiProdu));			
			this.jButtonCopiarProductoDefiProdu.setVisible((this.isVisibilidadCeldaCopiarProductoDefiProdu && this.isPermisoCopiarProductoDefiProdu));
			this.jButtonVerFormProductoDefiProdu.setVisible((this.isVisibilidadCeldaVerFormProductoDefiProdu && this.isPermisoVerFormProductoDefiProdu));
			
			this.jButtonAbrirOrderByProductoDefiProdu.setVisible((this.isVisibilidadCeldaOrdenProductoDefiProdu && this.isPermisoOrdenProductoDefiProdu));			
			
			this.jButtonNuevoRelacionesProductoDefiProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu && this.isPermisoNuevoProductoDefiProdu));			
			this.jButtonNuevoGuardarCambiosProductoDefiProdu.setVisible((this.isVisibilidadCeldaNuevoProductoDefiProdu && this.isPermisoNuevoProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu));
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonModificarProductoDefiProdu.setVisible((this.isVisibilidadCeldaModificarProductoDefiProdu && this.isPermisoActualizarProductoDefiProdu));	
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonActualizarProductoDefiProdu.setVisible((this.isVisibilidadCeldaActualizarProductoDefiProdu && this.isPermisoActualizarProductoDefiProdu));	
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonEliminarProductoDefiProdu.setVisible((this.isVisibilidadCeldaEliminarProductoDefiProdu && this.isPermisoEliminarProductoDefiProdu));
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonCancelarProductoDefiProdu.setVisible(this.isVisibilidadCeldaCancelarProductoDefiProdu);							
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonGuardarCambiosProductoDefiProdu.setVisible((this.isVisibilidadCeldaGuardarProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoDefiProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoDefiProdu.setVisible((this.isVisibilidadCeldaNuevoProductoDefiProdu && this.isPermisoNuevoProductoDefiProdu));						
			this.jButtonDuplicarToolBarProductoDefiProdu.setVisible((this.isVisibilidadCeldaDuplicarProductoDefiProdu && this.isPermisoDuplicarProductoDefiProdu));						
			this.jButtonCopiarToolBarProductoDefiProdu.setVisible((this.isVisibilidadCeldaCopiarProductoDefiProdu && this.isPermisoCopiarProductoDefiProdu));			
			this.jButtonVerFormToolBarProductoDefiProdu.setVisible((this.isVisibilidadCeldaVerFormProductoDefiProdu && this.isPermisoVerFormProductoDefiProdu));			
			this.jButtonAbrirOrderByToolBarProductoDefiProdu.setVisible((this.isVisibilidadCeldaOrdenProductoDefiProdu && this.isPermisoOrdenProductoDefiProdu));
			this.jButtonNuevoRelacionesToolBarProductoDefiProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu && this.isPermisoNuevoProductoDefiProdu));			
			this.jButtonNuevoGuardarCambiosToolBarProductoDefiProdu.setVisible((this.isVisibilidadCeldaNuevoProductoDefiProdu && this.isPermisoNuevoProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu));			
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonModificarToolBarProductoDefiProdu.setVisible((this.isVisibilidadCeldaModificarProductoDefiProdu && this.isPermisoActualizarProductoDefiProdu));	
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonActualizarToolBarProductoDefiProdu.setVisible((this.isVisibilidadCeldaActualizarProductoDefiProdu  && this.isPermisoActualizarProductoDefiProdu));	
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonEliminarToolBarProductoDefiProdu.setVisible((this.isVisibilidadCeldaEliminarProductoDefiProdu && this.isPermisoEliminarProductoDefiProdu));
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonCancelarToolBarProductoDefiProdu.setVisible(this.isVisibilidadCeldaCancelarProductoDefiProdu);				
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonGuardarCambiosToolBarProductoDefiProdu.setVisible((this.isVisibilidadCeldaGuardarProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoDefiProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoDefiProdu.setVisible((this.isVisibilidadCeldaNuevoProductoDefiProdu && this.isPermisoNuevoProductoDefiProdu));			
			this.jMenuItemDuplicarProductoDefiProdu.setVisible((this.isVisibilidadCeldaDuplicarProductoDefiProdu && this.isPermisoDuplicarProductoDefiProdu));			
			this.jMenuItemCopiarProductoDefiProdu.setVisible((this.isVisibilidadCeldaCopiarProductoDefiProdu && this.isPermisoCopiarProductoDefiProdu));			
			this.jMenuItemVerFormProductoDefiProdu.setVisible((this.isVisibilidadCeldaVerFormProductoDefiProdu && this.isPermisoVerFormProductoDefiProdu));			
			this.jMenuItemAbrirOrderByProductoDefiProdu.setVisible((this.isVisibilidadCeldaOrdenProductoDefiProdu && this.isPermisoOrdenProductoDefiProdu));			
			//this.jMenuItemMostrarOcultarProductoDefiProdu.setVisible((this.isVisibilidadCeldaOrdenProductoDefiProdu && this.isPermisoOrdenProductoDefiProdu));
			this.jMenuItemDetalleAbrirOrderByProductoDefiProdu.setVisible((this.isVisibilidadCeldaOrdenProductoDefiProdu && this.isPermisoOrdenProductoDefiProdu));			
			//this.jMenuItemDetalleMostrarOcultarProductoDefiProdu.setVisible((this.isVisibilidadCeldaOrdenProductoDefiProdu && this.isPermisoOrdenProductoDefiProdu));			
			this.jMenuItemNuevoRelacionesProductoDefiProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu && this.isPermisoNuevoProductoDefiProdu));			
			this.jMenuItemNuevoGuardarCambiosProductoDefiProdu.setVisible((this.isVisibilidadCeldaNuevoProductoDefiProdu && this.isPermisoNuevoProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu));									
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemModificarProductoDefiProdu.setVisible((this.isVisibilidadCeldaModificarProductoDefiProdu && this.isPermisoActualizarProductoDefiProdu));	
			this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemActualizarProductoDefiProdu.setVisible((this.isVisibilidadCeldaActualizarProductoDefiProdu && this.isPermisoActualizarProductoDefiProdu));	
			this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemEliminarProductoDefiProdu.setVisible((this.isVisibilidadCeldaEliminarProductoDefiProdu && this.isPermisoEliminarProductoDefiProdu));
			this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemCancelarProductoDefiProdu.setVisible(this.isVisibilidadCeldaCancelarProductoDefiProdu);				
			}
			
			this.jMenuItemGuardarCambiosProductoDefiProdu.setVisible((this.isVisibilidadCeldaGuardarProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu));						
			this.jMenuItemGuardarCambiosTablaProductoDefiProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoDefiProdu=this.jButtonNuevoProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaDuplicarProductoDefiProdu=this.jButtonDuplicarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaCopiarProductoDefiProdu=this.jButtonCopiarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaVerFormProductoDefiProdu=this.jButtonVerFormProductoDefiProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoDefiProdu=this.jButtonAbrirOrderByProductoDefiProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=this.jButtonNuevoRelacionesProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaModificarProductoDefiProdu=this.jButtonModificarProductoDefiProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
			this.isVisibilidadCeldaActualizarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jButtonActualizarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaEliminarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jButtonEliminarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaCancelarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jButtonCancelarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaGuardarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jButtonGuardarCambiosProductoDefiProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=this.jButtonGuardarCambiosTablaProductoDefiProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoDefiProdu=this.jButtonNuevoToolBarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=this.jButtonNuevoRelacionesToolBarProductoDefiProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
			this.isVisibilidadCeldaModificarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jButtonModificarToolBarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaActualizarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jButtonActualizarToolBarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaEliminarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jButtonEliminarToolBarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaCancelarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jButtonCancelarToolBarProductoDefiProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoDefiProdu=this.jButtonGuardarCambiosToolBarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=this.jButtonGuardarCambiosTablaToolBarProductoDefiProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoDefiProdu=this.jMenuItemNuevoProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=this.jMenuItemNuevoRelacionesProductoDefiProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
			this.isVisibilidadCeldaModificarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemModificarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaActualizarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemActualizarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaEliminarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemEliminarProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaCancelarProductoDefiProdu=this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemCancelarProductoDefiProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoDefiProdu=this.jMenuItemGuardarCambiosProductoDefiProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=this.jMenuItemGuardarCambiosTablaProductoDefiProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoDefiProdu(Boolean esInicializar) {
		if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
				//if(this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoDefiProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoDefiProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoDefiProdu() {
		this.jButtonNuevoProductoDefiProdu.setVisible(this.isPermisoNuevoProductoDefiProdu);			
		this.jButtonDuplicarProductoDefiProdu.setVisible(this.isPermisoDuplicarProductoDefiProdu);			
		this.jButtonCopiarProductoDefiProdu.setVisible(this.isPermisoCopiarProductoDefiProdu);			
		this.jButtonVerFormProductoDefiProdu.setVisible(this.isPermisoVerFormProductoDefiProdu);			
		
		this.jButtonAbrirOrderByProductoDefiProdu.setVisible(this.isPermisoOrdenProductoDefiProdu);					
		
		this.jButtonNuevoRelacionesProductoDefiProdu.setVisible(this.isPermisoNuevoProductoDefiProdu);			
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonModificarProductoDefiProdu.setVisible(this.isPermisoActualizarProductoDefiProdu);	
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonActualizarProductoDefiProdu.setVisible(this.isPermisoActualizarProductoDefiProdu);	
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonEliminarProductoDefiProdu.setVisible(this.isPermisoEliminarProductoDefiProdu);
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonCancelarProductoDefiProdu.setVisible(this.isVisibilidadCeldaCancelarProductoDefiProdu);						
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonGuardarCambiosProductoDefiProdu.setVisible(this.isPermisoGuardarCambiosProductoDefiProdu);							
		}
		
		this.jButtonGuardarCambiosTablaProductoDefiProdu.setVisible(this.isPermisoActualizarProductoDefiProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoDefiProdu() {
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonModificarProductoDefiProdu.setVisible(this.isPermisoActualizarProductoDefiProdu);	
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonActualizarProductoDefiProdu.setVisible(this.isPermisoActualizarProductoDefiProdu);	
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonEliminarProductoDefiProdu.setVisible(this.isPermisoEliminarProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonCancelarProductoDefiProdu.setVisible(this.isVisibilidadCeldaCancelarProductoDefiProdu);							
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonGuardarCambiosProductoDefiProdu.setVisible((this.isVisibilidadCeldaGuardarProductoDefiProdu && this.isPermisoGuardarCambiosProductoDefiProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoDefiProdu() {
		if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoDefiProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoDefiProdu() {
	}
	
	public void jTableDatosProductoDefiProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoDefiProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoDefiProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productodefiprodu==null) {
						this.productodefiprodu = new ProductoDefiProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
				}

				if(this.productodefiprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productodefiprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoDefiProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductoDefiProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductoDefiProdu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoDefiProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoDefiProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productodefiproduLogic.getConnexion());

				if(this.productodefiprodu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productodefiprodu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoDefiProdu=(TitledBorder)this.jScrollPanelDatosProductoDefiProdu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductoDefiProdu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductoDefiProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productodefiprodu==null) {
						this.productodefiprodu = new ProductoDefiProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
				}

				if(this.productodefiprodu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productodefiprodu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoDefiProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductoDefiProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductoDefiProdu(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoDefiProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoDefiProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productodefiproduLogic.getConnexion());

				if(this.productodefiprodu.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productodefiprodu.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoDefiProdu=(TitledBorder)this.jScrollPanelDatosProductoDefiProdu.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductoDefiProdu.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductoDefiProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productodefiprodu==null) {
						this.productodefiprodu = new ProductoDefiProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
				}

				if(this.productodefiprodu.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productodefiprodu.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoDefiProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductoDefiProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductoDefiProdu(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoDefiProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoDefiProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productodefiproduLogic.getConnexion());

				if(this.productodefiprodu.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productodefiprodu.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoDefiProdu=(TitledBorder)this.jScrollPanelDatosProductoDefiProdu.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductoDefiProdu.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductoDefiProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productodefiprodu==null) {
						this.productodefiprodu = new ProductoDefiProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
				}

				if(this.productodefiprodu.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productodefiprodu.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoDefiProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductoDefiProduActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoDefiProdu=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosProductoDefiProdu.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoDefiProdu=(TitledBorder)this.jScrollPanelDatosProductoDefiProdu.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoDefiProdu.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoProductoDefiProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductoDefiProdu(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoDefiProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoDefiProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productodefiproduLogic.getConnexion());

				if(this.productodefiprodu.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productodefiprodu.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoDefiProdu=(TitledBorder)this.jScrollPanelDatosProductoDefiProdu.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoDefiProdu.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductoDefiProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productodefiprodu==null) {
						this.productodefiprodu = new ProductoDefiProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
				}

				if(this.productodefiprodu.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productodefiprodu.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoDefiProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadProductoDefiProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebProductoDefiProdu(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoDefiProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoDefiProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.productodefiproduLogic.getConnexion());

				if(this.productodefiprodu.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.productodefiprodu.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoDefiProdu=(TitledBorder)this.jScrollPanelDatosProductoDefiProdu.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderProductoDefiProdu.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadProductoDefiProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productodefiprodu==null) {
						this.productodefiprodu = new ProductoDefiProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
				}

				if(this.productodefiprodu.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.productodefiprodu.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoDefiProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_genera_sub_productosProductoDefiProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productodefiprodu==null) {
						this.productodefiprodu = new ProductoDefiProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
				}

				if(this.productodefiprodu.getcon_genera_sub_productos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_genera_sub_productos = "+this.productodefiprodu.getcon_genera_sub_productos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoDefiProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoDefiProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.getproductodefiprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productodefiprodu==null) {
						this.productodefiprodu = new ProductoDefiProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);
				}

				if(this.productodefiprodu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productodefiprodu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoDefiProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoDefiProdu(false,false);

			this.getProductoDefiProdusFK_IdBodega();

			this.inicializarActualizarBindingProductoDefiProdu(false);

			//if(ProductoDefiProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoDefiProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoDefiProdu(false,false);

			this.getProductoDefiProdusFK_IdEmpresa();

			this.inicializarActualizarBindingProductoDefiProdu(false);

			//if(ProductoDefiProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoDefiProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoDefiProdu(false,false);

			this.getProductoDefiProdusFK_IdProducto();

			this.inicializarActualizarBindingProductoDefiProdu(false);

			//if(ProductoDefiProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoDefiProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoDefiProdu(false,false);

			this.getProductoDefiProdusFK_IdSucursal();

			this.inicializarActualizarBindingProductoDefiProdu(false);

			//if(ProductoDefiProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoDefiProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadUnadProductoDefiProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoDefiProdu(false,false);

			this.getProductoDefiProdusFK_IdUnidadUnad();

			this.inicializarActualizarBindingProductoDefiProdu(false);

			//if(ProductoDefiProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoDefiProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productodefiproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoDefiProdu() {
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
		

		if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
			this.jInternalFrameDetalleFormProductoDefiProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoDefiProdu.dispose();
			this.jInternalFrameDetalleFormProductoDefiProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoDefiProdu!=null) {
			this.jInternalFrameReporteDinamicoProductoDefiProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoDefiProdu.dispose();
			this.jInternalFrameReporteDinamicoProductoDefiProdu=null;
		}
		
		if(this.jInternalFrameImportacionProductoDefiProdu!=null) {
			this.jInternalFrameImportacionProductoDefiProdu.setVisible(false);	    			
			this.jInternalFrameImportacionProductoDefiProdu.dispose();
			this.jInternalFrameImportacionProductoDefiProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoDefiProdu();
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoDefiProdu")) {
				jButtonNuevoProductoDefiProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoDefiProdu")) {
				jButtonDuplicarProductoDefiProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoDefiProdu")) {
				jButtonCopiarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoDefiProdu")) {
				jButtonVerFormProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoDefiProdu")) {
				jButtonNuevoProductoDefiProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoDefiProdu")) {
				jButtonDuplicarProductoDefiProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoDefiProdu")) {
				jButtonNuevoProductoDefiProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoDefiProdu")) {
				jButtonDuplicarProductoDefiProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoDefiProdu")) {
				jButtonNuevoProductoDefiProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoDefiProdu")) {
				jButtonNuevoProductoDefiProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoDefiProdu")) {
				jButtonNuevoProductoDefiProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoDefiProdu")) {
				jButtonModificarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoDefiProdu")) {
				jButtonModificarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoDefiProdu")) {
				jButtonModificarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoDefiProdu")) {
				jButtonActualizarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoDefiProdu")) {
				jButtonActualizarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoDefiProdu")) {
				jButtonActualizarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoDefiProdu")) {
				jButtonEliminarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoDefiProdu")) {
				jButtonEliminarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoDefiProdu")) {
				jButtonEliminarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoDefiProdu")) {
				jButtonCancelarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoDefiProdu")) {
				jButtonCancelarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoDefiProdu")) {
				jButtonCancelarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoDefiProdu")) {
				jButtonCerrarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoDefiProdu")) {
				jButtonCerrarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoDefiProdu")) {
				jButtonCerrarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoDefiProdu")) {
				jButtonMostrarOcultarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoDefiProdu")) {
				jButtonCancelarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoDefiProdu")) {
				jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoDefiProdu")) {
				jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoDefiProdu")) {
				jButtonCopiarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoDefiProdu")) {
				jButtonVerFormProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoDefiProdu")) {
				jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoDefiProdu")) {
				jButtonCopiarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoDefiProdu")) {
				jButtonVerFormProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoDefiProdu")) {
				jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoDefiProdu")) {
				jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoDefiProdu")) {
				jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoDefiProdu")) {
				jButtonRecargarInformacionProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoDefiProdu")) {
				jButtonRecargarInformacionProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoDefiProdu")) {
				jButtonRecargarInformacionProductoDefiProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoDefiProdu")) {
				jButtonAnterioresProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoDefiProdu")) {
				jButtonAnterioresProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoDefiProdu")) {
				jButtonAnterioresProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoDefiProdu")) {
				jButtonSiguientesProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoDefiProdu")) {
				jButtonSiguientesProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoDefiProdu")) {
				jButtonSiguientesProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoDefiProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoDefiProdu")) {
				jButtonAbrirOrderByProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoDefiProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoDefiProdu")) {
				jButtonMostrarOcultarProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoDefiProdu")) {
				jButtonNuevoGuardarCambiosProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoDefiProdu")) {
				jButtonNuevoGuardarCambiosProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoDefiProdu")) {
				jButtonNuevoGuardarCambiosProductoDefiProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoDefiProdu")) {
				jButtonCerrarReporteDinamicoProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoDefiProdu")) {
				jButtonGenerarReporteDinamicoProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoDefiProdu")) {
				
				jButtonGenerarExcelReporteDinamicoProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoDefiProdu")) {
				jButtonCerrarImportacionProductoDefiProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoDefiProdu")) {
				
				jButtonGenerarImportacionProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoDefiProdu")) {
				
				jButtonAbrirImportacionProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoDefiProdu")) {
				jComboBoxTiposAccionesProductoDefiProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoDefiProdu")) {
				jComboBoxTiposRelacionesProductoDefiProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoDefiProdu")) {
				jComboBoxTiposAccionesProductoDefiProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoDefiProdu")) {
				
				jComboBoxTiposSeleccionarProductoDefiProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoDefiProdu")) {
				jTextFieldValorCampoGeneralProductoDefiProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoDefiProdu")) {
				jButtonAbrirOrderByProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoDefiProdu")) {
				jButtonAbrirOrderByProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoDefiProdu")) {
				jButtonCerrarOrderByProductoDefiProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoDefiProduBusqueda")) {
				this.jButtonidProductoDefiProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoDefiProduUpdate")) {
				this.jButtonid_empresaProductoDefiProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoDefiProduBusqueda")) {
				this.jButtonid_empresaProductoDefiProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoDefiProduUpdate")) {
				this.jButtonid_sucursalProductoDefiProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoDefiProduBusqueda")) {
				this.jButtonid_sucursalProductoDefiProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoDefiProduUpdate")) {
				this.jButtonid_bodegaProductoDefiProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoDefiProduBusqueda")) {
				this.jButtonid_bodegaProductoDefiProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoDefiProdu")) {
				this.jButtonid_productoProductoDefiProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoDefiProduUpdate")) {
				this.jButtonid_productoProductoDefiProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoDefiProduBusqueda")) {
				this.jButtonid_productoProductoDefiProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoDefiProduUpdate")) {
				this.jButtonid_unidadProductoDefiProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoDefiProduBusqueda")) {
				this.jButtonid_unidadProductoDefiProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_genera_sub_productosProductoDefiProduBusqueda")) {
				this.jButtoncon_genera_sub_productosProductoDefiProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoDefiProduBusqueda")) {
				this.jButtondescripcionProductoDefiProduBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoDefiProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoDefiProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				


				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoDefiProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoDefiProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoDefiProdu productodefiproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				productodefiproduLocal=this.productodefiprodu;
			} else {
				productodefiproduLocal=this.productodefiproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
							
				
				


				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoDefiProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoDefiProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoDefiProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
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
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			
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
			
			


			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoDefiProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
								
						
				


				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoDefiProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoDefiProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
								
				
				


				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoDefiProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoDefiProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoDefiProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoDefiProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoDefiProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
							
				
				


				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoDefiProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoDefiProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoDefiProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
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
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			
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
			
			


			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoDefiProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
								
				
				


				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoDefiProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoDefiProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoDefiProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoDefiProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoDefiProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoDefiProdu")) {
					jCheckBoxSeleccionarTodosProductoDefiProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoDefiProdu")) {
					jCheckBoxSeleccionadosProductoDefiProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoDefiProdu")) {
					
				}
				
				


				
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoDefiProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoDefiProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
												
				
				


				
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoDefiProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoDefiProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoDefiProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoDefiProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
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
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
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
			
			


			if(sTipo.equals("id_bodegaProductoDefiProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu;
				}

				if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoDefiProduConstantesFunciones.getClassesRelationshipsOfProductoDefiProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoDefiProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_productoProductoDefiProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu;
				}

				if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoDefiProduConstantesFunciones.getClassesRelationshipsOfProductoDefiProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoDefiProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoDefiProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_bodegaProductoDefiProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu;
				}

				if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoDefiProduConstantesFunciones.getClassesRelationshipsOfProductoDefiProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoDefiProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_productoProductoDefiProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu;
				}

				if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoDefiProduConstantesFunciones.getClassesRelationshipsOfProductoDefiProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoDefiProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoDefiProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoDefiProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productodefiprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productodefiprodu);
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
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
				
				


			if(sTipo.equals("id_bodegaProductoDefiProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu;
				}

				if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoDefiProduConstantesFunciones.getClassesRelationshipsOfProductoDefiProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoDefiProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_productoProductoDefiProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu;
				}

				if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoDefiProduConstantesFunciones.getClassesRelationshipsOfProductoDefiProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoDefiProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoDefiProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoDefiProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoDefiProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productodefiproduAnterior =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoDefiProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoDefiProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoDefiProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productodefiprodu =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productodefiprodu =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productodefiprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoDefiProdu")) {
				
				}
				
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoDefiProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoDefiProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoDefiProdu")) {
			
			}
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoDefiProdu();
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			
			if(sTipo.equals("NuevoProductoDefiProdu")) {
				jButtonNuevoProductoDefiProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoDefiProdu")) {
				jButtonDuplicarProductoDefiProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoDefiProdu")) {
				jButtonCopiarProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoDefiProdu")) {
				jButtonVerFormProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoDefiProdu")) {
				jButtonNuevoProductoDefiProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoDefiProdu")) {
				jButtonModificarProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoDefiProdu")) {
				jButtonActualizarProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoDefiProdu")) {
				jButtonEliminarProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoDefiProdu")) {
				jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoDefiProdu")) {
				jButtonCancelarProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoDefiProdu")) {
				jButtonCerrarProductoDefiProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoDefiProdu")) {
				jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoDefiProdu")) {
				jButtonNuevoGuardarCambiosProductoDefiProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoDefiProdu")) {
				jButtonAbrirOrderByProductoDefiProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoDefiProdu")) {
				jButtonRecargarInformacionProductoDefiProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoDefiProdu")) {
				jButtonAnterioresProductoDefiProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoDefiProdu")) {
				jButtonSiguientesProductoDefiProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoDefiProduBusqueda")) {
				this.jButtonidProductoDefiProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoDefiProduUpdate")) {
				this.jButtonid_empresaProductoDefiProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoDefiProduBusqueda")) {
				this.jButtonid_empresaProductoDefiProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoDefiProduUpdate")) {
				this.jButtonid_sucursalProductoDefiProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoDefiProduBusqueda")) {
				this.jButtonid_sucursalProductoDefiProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoDefiProduUpdate")) {
				this.jButtonid_bodegaProductoDefiProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoDefiProduBusqueda")) {
				this.jButtonid_bodegaProductoDefiProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoDefiProdu")) {
				this.jButtonid_productoProductoDefiProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoDefiProduUpdate")) {
				this.jButtonid_productoProductoDefiProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoDefiProduBusqueda")) {
				this.jButtonid_productoProductoDefiProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoDefiProduUpdate")) {
				this.jButtonid_unidadProductoDefiProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoDefiProduBusqueda")) {
				this.jButtonid_unidadProductoDefiProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_genera_sub_productosProductoDefiProduBusqueda")) {
				this.jButtoncon_genera_sub_productosProductoDefiProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoDefiProduBusqueda")) {
				this.jButtondescripcionProductoDefiProduBusquedaActionPerformed(evt);
			}
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoDefiProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoDefiProdu")) {
				closingInternalFrameProductoDefiProdu();
				
			} else if(sTipo.equals("jButtonCancelarProductoDefiProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoDefiProdu = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoDefiProduBeanSwingJInternalFrame jInternalFrameParent=(ProductoDefiProduBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoDefiProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoDefiProduActionPerformed(null);
			}
			
			ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productodefiprodu,new Object(),this.productodefiproduParameterGeneral,this.productodefiproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoDefiProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoDefiProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoDefiProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productodefiprodu)) {
			if(!esControlTabla) {
				if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);			
				}
				
				if(this.productodefiproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoDefiProdu(this.productodefiprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productodefiproduReturnGeneral=productodefiproduLogic.procesarEventosProductoDefiProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productodefiproduLogic.getProductoDefiProdus(),this.productodefiprodu,this.productodefiproduParameterGeneral,this.isEsNuevoProductoDefiProdu,classes);//this.productodefiproduLogic.getProductoDefiProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoDefiProdu(this.productodefiproduReturnGeneral,this.productodefiproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productodefiproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoDefiProdu(classes,this.productodefiproduReturnGeneral,this.productodefiproduBean,false);
					}
						
					if(this.productodefiproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoDefiProdu(this.productodefiproduReturnGeneral.getProductoDefiProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoDefiProdu(this.productodefiproduReturnGeneral.getProductoDefiProdu());	
					}
						
					if(this.productodefiproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoDefiProdu(this.productodefiproduReturnGeneral.getProductoDefiProdu(),classes);//this.productodefiproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoDefiProdu(this.productodefiprodu,classes);//this.productodefiproduBean);									
				}
			
				if(ProductoDefiProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoDefiProdu(this.productodefiprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoDefiProdu(this.productodefiprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productodefiproduAnterior!=null) {
						this.productodefiprodu=this.productodefiproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productodefiproduReturnGeneral=productodefiproduLogic.procesarEventosProductoDefiProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productodefiproduLogic.getProductoDefiProdus(),this.productodefiprodu,this.productodefiproduParameterGeneral,this.isEsNuevoProductoDefiProdu,classes);//this.productodefiproduLogic.getProductoDefiProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productodefiproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productodefiproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productodefiproduReturnGeneral.getProductoDefiProdu(),productodefiproduLogic.getProductoDefiProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productodefiproduReturnGeneral.getProductoDefiProdu(),this.productodefiprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoDefiProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoDefiProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoDefiProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoDefiProdu() throws Exception {
		
		ProductoDefiProduModel productodefiproduModel=(ProductoDefiProduModel)this.jTableDatosProductoDefiProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productodefiproduModel.productodefiprodus=this.productodefiproduLogic.getProductoDefiProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productodefiproduModel.productodefiprodus=this.productodefiprodus;
		}
		
		
		((ProductoDefiProduModel) this.jTableDatosProductoDefiProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoDefiProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductodefiproduAnterior(),this.productodefiproduLogic.getProductoDefiProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductodefiproduAnterior(),this.productodefiprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoDefiProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoDefiProdu(ProductoDefiProdu productodefiprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMano.class)) {
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.setProductoProduManos(productodefiprodu.getProductoProduManos());
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMano(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMerma.class)) {
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.setProductoProduMermas(productodefiprodu.getProductoProduMermas());
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMerma(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduGasto.class)) {
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.setProductoProduGastos(productodefiprodu.getProductoProduGastos());
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduGasto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProdu.class)) {
					this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.setProductoProdus(productodefiprodu.getProductoProdus());
					this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProdu(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMaquina.class)) {
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(productodefiprodu.getProductoProduMaquinas());
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMaquina(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
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
										
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productodefiprodu,new Object(),generalEntityParameterGeneral,this.productodefiproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productodefiproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoDefiProduConstantesFunciones.getClassesRelationshipsOfProductoDefiProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoDefiProduConstantesFunciones.getClassesRelationshipsFromStringsOfProductoDefiProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoDefiProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoDefiProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productodefiprodu,new Object(),generalEntityParameterGeneral,this.productodefiproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoDefiProdu(ProductoDefiProduBean productodefiproduBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMano.class)) {
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.setProductoProduManos(productodefiprodu.getProductoProduManos());
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMano(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMerma.class)) {
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.setProductoProduMermas(productodefiprodu.getProductoProduMermas());
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMerma(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduGasto.class)) {
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.setProductoProduGastos(productodefiprodu.getProductoProduGastos());
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduGasto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProdu.class)) {
					this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.setProductoProdus(productodefiprodu.getProductoProdus());
					this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProdu(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMaquina.class)) {
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.setProductoProduMaquinas(productodefiprodu.getProductoProduMaquinas());
					this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMaquina(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoDefiProdu(ArrayList<Classe> classes,ProductoDefiProduReturnGeneral productodefiproduReturnGeneral,ProductoDefiProduBean productodefiproduBean,Boolean conDefault) throws Exception {
		
			this.productodefiproduBean.setProductoProduManos(productodefiproduReturnGeneral.getProductoDefiProdu().getProductoProduManos());
			this.productodefiproduBean.setProductoProduMermas(productodefiproduReturnGeneral.getProductoDefiProdu().getProductoProduMermas());
			this.productodefiproduBean.setProductoProduGastos(productodefiproduReturnGeneral.getProductoDefiProdu().getProductoProduGastos());
			this.productodefiproduBean.setProductoProdus(productodefiproduReturnGeneral.getProductoDefiProdu().getProductoProdus());
			this.productodefiproduBean.setProductoProduMaquinas(productodefiproduReturnGeneral.getProductoDefiProdu().getProductoProduMaquinas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoDefiProdu(ProductoDefiProdu productodefiprodu,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMano.class)) {
					productodefiprodu.setProductoProduManos(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoBeanSwingJInternalFrame.productoprodumanoLogic.getProductoProduManos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMerma.class)) {
					productodefiprodu.setProductoProduMermas(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaBeanSwingJInternalFrame.productoprodumermaLogic.getProductoProduMermas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduGasto.class)) {
					productodefiprodu.setProductoProduGastos(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoBeanSwingJInternalFrame.productoprodugastoLogic.getProductoProduGastos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProdu.class)) {
					productodefiprodu.setProductoProdus(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduBeanSwingJInternalFrame.productoproduLogic.getProductoProdus());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoProduMaquina.class)) {
					productodefiprodu.setProductoProduMaquinas(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaLogic.getProductoProduMaquinas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.productodefiprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoDefiProdu = new ProductoDefiProduDetalleFormJInternalFrame(jDesktopPane,this.productodefiproduSessionBean.getConGuardarRelaciones(),this.productodefiproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.setVisible(false);
		this.jInternalFrameDetalleFormProductoDefiProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoDefiProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoDefiProdu.productodefiproduLogic=this.productodefiproduLogic;
		
		this.cargarCombosFrameForeignKeyProductoDefiProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoDefiProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoDefiProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoDefiProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoDefiProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoDefiProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoDefiProdu"));
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonModificarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"ModificarProductoDefiProdu"));

		
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonModificarToolBarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoDefiProdu"));
					
		this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemModificarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoDefiProdu"));		
		
		
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonActualizarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"ActualizarProductoDefiProdu"));
		
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonActualizarToolBarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoDefiProdu"));
						
		this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemActualizarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoDefiProdu"));		
		
		
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonEliminarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"EliminarProductoDefiProdu"));
		
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonEliminarToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoDefiProdu"));
								
		this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemEliminarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoDefiProdu"));		
		
		
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonCancelarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"CancelarProductoDefiProdu"));
		
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonCancelarToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoDefiProdu"));
					
		this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemCancelarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoDefiProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemDetalleCerrarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoDefiProdu"));		
		
		
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonGuardarCambiosToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoDefiProdu"));
		
		
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonGuardarCambiosToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoDefiProdu"));
		
		
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoDefiProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonidProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"idProductoDefiProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_empresaProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_empresaProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoDefiProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_sucursalProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_sucursalProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoDefiProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_bodegaProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_bodegaProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoDefiProduBusqueda"));
		//jButtonid_productoProductoDefiProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoDefiProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_productoProductoDefiProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoDefiProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_productoProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_productoProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoDefiProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_unidadProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_unidadProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoDefiProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtoncon_genera_sub_productosProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"con_genera_sub_productosProductoDefiProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtondescripcionProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoDefiProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoDefiProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoDefiProdu"));
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoDefiProdu"));
		}
		
		this.jTableDatosProductoDefiProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoDefiProdu"));
		
		this.jTableDatosProductoDefiProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoDefiProdu"));
		
		this.jButtonNuevoProductoDefiProdu.addActionListener(new ButtonActionListener(this,"NuevoProductoDefiProdu"));
		
		this.jButtonDuplicarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"DuplicarProductoDefiProdu"));
		
		this.jButtonCopiarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"CopiarProductoDefiProdu"));
		
		this.jButtonVerFormProductoDefiProdu.addActionListener(new ButtonActionListener(this,"VerFormProductoDefiProdu"));
		
		
		this.jButtonNuevoToolBarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoDefiProdu"));
			
		this.jButtonDuplicarToolBarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoDefiProdu"));
			
		this.jMenuItemNuevoProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoDefiProdu"));
			
		this.jMenuItemDuplicarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoDefiProdu"));		
		
		
		this.jButtonNuevoRelacionesProductoDefiProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoDefiProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoDefiProdu"));
			
		this.jMenuItemNuevoRelacionesProductoDefiProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoDefiProdu"));		
		
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonModificarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"ModificarProductoDefiProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonModificarToolBarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoDefiProdu"));
			
			this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemModificarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoDefiProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonActualizarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"ActualizarProductoDefiProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonActualizarToolBarProductoDefiProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoDefiProdu"));
				
			this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemActualizarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoDefiProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonEliminarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"EliminarProductoDefiProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonEliminarToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoDefiProdu"));
						
			this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemEliminarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoDefiProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonCancelarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"CancelarProductoDefiProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonCancelarToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoDefiProdu"));
			
			this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemCancelarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoDefiProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoDefiProdu"));		
		
		
		this.jButtonCerrarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"CerrarProductoDefiProdu"));
		
		
		this.jButtonCerrarToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoDefiProdu"));
			
		this.jMenuItemCerrarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoDefiProdu"));
			
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jMenuItemDetalleCerrarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoDefiProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonGuardarCambiosProductoDefiProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoDefiProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonGuardarCambiosToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoDefiProdu"));
		}
		
		this.jButtonCopiarToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoDefiProdu"));
			
		this.jButtonVerFormToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoDefiProdu"));
		
		this.jMenuItemGuardarCambiosProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoDefiProdu"));
			
		this.jMenuItemCopiarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoDefiProdu"));		
		
		this.jMenuItemVerFormProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoDefiProdu"));		
		
		
		this.jButtonGuardarCambiosTablaProductoDefiProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoDefiProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoDefiProdu"));
			
		this.jMenuItemGuardarCambiosTablaProductoDefiProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoDefiProdu"));		
		
		
		
		this.jButtonRecargarInformacionProductoDefiProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoDefiProdu"));
					
		this.jButtonRecargarInformacionToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoDefiProdu"));
		
		this.jMenuItemRecargarInformacionProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoDefiProdu"));		
		
		
		
		this.jButtonAnterioresProductoDefiProdu.addActionListener (new ButtonActionListener(this,"AnterioresProductoDefiProdu"));
		
		
		this.jButtonAnterioresToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoDefiProdu"));
		
		this.jMenuItemAnterioresProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoDefiProdu"));		
		
		
		this.jButtonSiguientesProductoDefiProdu.addActionListener (new ButtonActionListener(this,"SiguientesProductoDefiProdu"));
		
		
		this.jButtonSiguientesToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoDefiProdu"));
			
		this.jMenuItemSiguientesProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoDefiProdu"));
			
		this.jMenuItemAbrirOrderByProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoDefiProdu"));
			
		this.jMenuItemMostrarOcultarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoDefiProdu"));
			
		this.jMenuItemDetalleAbrirOrderByProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoDefiProdu"));
			
		this.jMenuItemDetalleMostarOcultarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoDefiProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoDefiProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoDefiProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoDefiProdu"));
			
		this.jMenuItemNuevoGuardarCambiosProductoDefiProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoDefiProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoDefiProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoDefiProdu"));

		this.jCheckBoxSeleccionadosProductoDefiProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoDefiProdu"));
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoDefiProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoDefiProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoDefiProdu"));
			
		this.jComboBoxTiposAccionesProductoDefiProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoDefiProdu"));
					
		this.jComboBoxTiposSeleccionarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoDefiProdu"));
			
		this.jTextFieldValorCampoGeneralProductoDefiProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoDefiProdu"));		
		
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonidProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"idProductoDefiProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_empresaProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_empresaProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoDefiProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_sucursalProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_sucursalProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoDefiProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_bodegaProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_bodegaProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoDefiProduBusqueda"));
		//jButtonid_productoProductoDefiProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoDefiProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_productoProductoDefiProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoDefiProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_productoProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_productoProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoDefiProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_unidadProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_unidadProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoDefiProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtoncon_genera_sub_productosProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"con_genera_sub_productosProductoDefiProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtondescripcionProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoDefiProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoDefiProdu!=null) {
				this.jInternalFrameReporteDinamicoProductoDefiProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoDefiProdu"));
				this.jInternalFrameReporteDinamicoProductoDefiProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoDefiProdu"));
				this.jInternalFrameReporteDinamicoProductoDefiProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoDefiProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoDefiProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoDefiProdu"));				
			//this.jButtonGenerarReporteDinamicoProductoDefiProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoDefiProdu"));
			//this.jButtonGenerarExcelReporteDinamicoProductoDefiProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoDefiProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoDefiProdu!=null) {
				this.jInternalFrameImportacionProductoDefiProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoDefiProdu"));
				this.jInternalFrameImportacionProductoDefiProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoDefiProdu"));
				this.jInternalFrameImportacionProductoDefiProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoDefiProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoDefiProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoDefiProdu"));
			
			this.jButtonAbrirOrderByToolBarProductoDefiProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoDefiProdu"));			
			
			if(this.jInternalFrameOrderByProductoDefiProdu!=null) {
				this.jInternalFrameOrderByProductoDefiProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoDefiProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoDefiProdu.jTabbedPaneRelacionesProductoDefiProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoDefiProdu"));
		
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
            		closingInternalFrameProductoDefiProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoDefiProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoDefiProdu = (JInternalFrameBase)event.getSource();
	            	
	            ProductoDefiProduBeanSwingJInternalFrame jInternalFrameParent=(ProductoDefiProduBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoDefiProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoDefiProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoDefiProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoDefiProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoDefiProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoDefiProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoDefiProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoDefiProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoDefiProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoDefiProdu";
		inputMap = this.jButtonNuevoProductoDefiProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoDefiProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoDefiProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoDefiProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoDefiProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoDefiProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoDefiProdu";
		inputMap = this.jButtonNuevoRelacionesProductoDefiProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoDefiProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoDefiProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoDefiProdu";
		inputMap = this.jButtonModificarProductoDefiProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoDefiProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoDefiProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoDefiProdu";
		inputMap = this.jButtonActualizarProductoDefiProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoDefiProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoDefiProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoDefiProdu";
		inputMap = this.jButtonEliminarProductoDefiProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoDefiProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoDefiProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoDefiProdu";
		inputMap = this.jButtonCancelarProductoDefiProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoDefiProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoDefiProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoDefiProdu";
		inputMap = this.jButtonCerrarProductoDefiProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoDefiProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoDefiProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonGuardarCambiosProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoDefiProdu";
		inputMap = this.jInternalFrameDetalleFormProductoDefiProdu.jButtonGuardarCambiosProductoDefiProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonGuardarCambiosProductoDefiProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoDefiProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoDefiProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoDefiProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoDefiProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoDefiProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoDefiProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoDefiProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoDefiProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoDefiProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonidProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"idProductoDefiProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_empresaProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_empresaProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoDefiProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_sucursalProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_sucursalProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoDefiProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_bodegaProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_bodegaProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoDefiProduBusqueda"));
		//jButtonid_productoProductoDefiProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoDefiProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_productoProductoDefiProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoDefiProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_productoProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_productoProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoDefiProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_unidadProductoDefiProduUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoDefiProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_unidadProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoDefiProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtoncon_genera_sub_productosProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"con_genera_sub_productosProductoDefiProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoDefiProdu.jButtondescripcionProductoDefiProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoDefiProduBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoDefiProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoDefiProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoDefiProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoDefiProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoDefiProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoDefiProdu productodefiproduAux:this.productodefiproduLogic.getProductoDefiProdus()) {
					productodefiproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoDefiProdu productodefiproduAux:productodefiprodus) {
					productodefiproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoDefiProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoDefiProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoDefiProdu productodefiproduAux:this.productodefiproduLogic.getProductoDefiProdus()) {
						productodefiproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoDefiProdu productodefiproduAux:productodefiprodus) {
						productodefiproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoDefiProdu productodefiproduAux:this.productodefiproduLogic.getProductoDefiProdus()) {
					
						if(sTipoSeleccionar.equals(ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS)) {
							existe=true;
							productodefiproduAux.setcon_genera_sub_productos(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoDefiProdu productodefiproduAux:productodefiprodus) {
						
						if(sTipoSeleccionar.equals(ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS)) {
							existe=true;
							productodefiproduAux.setcon_genera_sub_productos(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoDefiProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoDefiProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoDefiProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoDefiProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoDefiProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoDefiProdu.getSelectedRows();
			
			ProductoDefiProdu productodefiproduLocal=new ProductoDefiProdu();
			
			//this.seleccionarTodosProductoDefiProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLocal =(ProductoDefiProdu) this.productodefiproduLogic.getProductoDefiProdus().toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productodefiproduLocal =(ProductoDefiProdu) this.productodefiprodus.toArray()[this.jTableDatosProductoDefiProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productodefiproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoDefiProdu productodefiproduAux:this.productodefiproduLogic.getProductoDefiProdus()) {
						productodefiproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoDefiProdu productodefiproduAux:productodefiprodus) {
						productodefiproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoDefiProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoDefiProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoDefiProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoDefiProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoDefiProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoDefiProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoDefiProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoDefiProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoDefiProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoDefiProdu productodefiproduAux:this.productodefiproduLogic.getProductoDefiProdus()) {
				
						if(sTipoSeleccionar.equals(ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productodefiproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoDefiProdu productodefiproduAux:productodefiprodus) {
					
						if(sTipoSeleccionar.equals(ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productodefiproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoDefiProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoDefiProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoDefiProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoDefiProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoDefiProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoDefiProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoDefiProdu(conSplash);
				
					this.generarReporteProductoDefiProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoDefiProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoDefiProdusSeleccionados();
				//this.jComboBoxTiposAccionesProductoDefiProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoDefiProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoDefiProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoDefiProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoDefiProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoDefiProdu();
				
				this.exportarProductoDefiProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoDefiProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoDefiProdus();
				//this.importarProductoDefiProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoDefiProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoDefiProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoDefiProdusSeleccionados();
				//this.jComboBoxTiposAccionesProductoDefiProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Producto Definicion Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoDefiProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoDefiProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoDefiProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Producto Definicion Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoDefiProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoDefiProduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoDefiProdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoDefiProdu(conSplash);
					
						//this.actualizarParametrosGeneralProductoDefiProdu();
						
						this.generarReporteProcesoAccionProductoDefiProdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoDefiProdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoDefiProduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Producto Definicion ProduccionES SELECCIONADOS?", "MANTENIMIENTO DE Producto Definicion Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoDefiProdu();
				
						this.actualizarParametrosGeneralProductoDefiProdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productodefiproduReturnGeneral=productodefiproduLogic.procesarAccionProductoDefiProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productodefiproduLogic.getProductoDefiProdus(),this.productodefiproduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoDefiProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoDefiProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoDefiProdu();
					
					ProductoDefiProduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoDefiProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoDefiProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxTiposAccionesFormularioProductoDefiProdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoDefiProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoDefiProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoDefiProdu();
			
			if(this.jInternalFrameDetalleFormProductoDefiProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();		
			ProductoDefiProdu productodefiprodu=new ProductoDefiProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoDefiProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoDefiProdu.getSelectedItem();
			
			
			
			
			productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(productodefiprodusSeleccionados.size()==1) {
				for(ProductoDefiProdu productodefiproduAux:productodefiprodusSeleccionados) {
					productodefiprodu=productodefiproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Producto Mano De Obra Produccion")) {
					jButtonProductoProduManoActionPerformed(null,rowIndex,true,false,productodefiprodu);
				}
				else if(this.sTipoRelacion.equals("Producto Merma Produccion")) {
					jButtonProductoProduMermaActionPerformed(null,rowIndex,true,false,productodefiprodu);
				}
				else if(this.sTipoRelacion.equals("Producto Gasto Produccion")) {
					jButtonProductoProduGastoActionPerformed(null,rowIndex,true,false,productodefiprodu);
				}
				else if(this.sTipoRelacion.equals("Producto Parte Produccion")) {
					jButtonProductoProduActionPerformed(null,rowIndex,true,false,productodefiprodu);
				}
				else if(this.sTipoRelacion.equals("Producto Maquina Produccion")) {
					jButtonProductoProduMaquinaActionPerformed(null,rowIndex,true,false,productodefiprodu);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoDefiProdu();
			
      		//this.finishProcessProductoDefiProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoDefiProduReturnGeneral() throws Exception {
		if(this.productodefiproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productodefiproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productodefiproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productodefiproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productodefiproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productodefiproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoDefiProdu(false);
		}
		
		if(this.productodefiproduReturnGeneral.getConRetornoLista() || this.productodefiproduReturnGeneral.getConRetornoObjeto()) {
			if(this.productodefiproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productodefiproduLogic.setProductoDefiProdus(this.productodefiproduReturnGeneral.getProductoDefiProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productodefiproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productodefiproduLogic.setProductoDefiProdu(this.productodefiproduReturnGeneral.getProductoDefiProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoDefiProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoDefiProdu() throws Exception {
		
		
	}
	
	public ArrayList<ProductoDefiProdu> getProductoDefiProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoDefiProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoDefiProdu productodefiproduAux:productodefiproduLogic.getProductoDefiProdus()) {
					if(productodefiproduAux.getIsSelected()) {
						productodefiprodusSeleccionados.add(productodefiproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoDefiProdu productodefiproduAux:this.productodefiprodus) {
					if(productodefiproduAux.getIsSelected()) {
						productodefiprodusSeleccionados.add(productodefiproduAux);				
					}
				}
			}
			
			if(productodefiprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productodefiprodusSeleccionados.addAll(this.productodefiproduLogic.getProductoDefiProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productodefiprodusSeleccionados.addAll(this.productodefiprodus);				
					}
				}
			}
		} else {
			productodefiprodusSeleccionados.add(this.productodefiprodu);
		}
		
		return productodefiprodusSeleccionados;
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
	
	public void generarReporteProductoDefiProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoDefiProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoDefiProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoDefiProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoDefiProdusSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesProductoDefiProdusSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Producto Definicion Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoDefiProdusSeleccionados() throws Exception {
		ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();		
		
		productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoDefiProdus("Todos",productodefiprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoDefiProdusSeleccionados() throws Exception {
		ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();		
		
		productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoDefiProdus("Todos",productodefiprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoDefiProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();
		
		productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoDefiProdus("Todos",productodefiprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoDefiProdusSeleccionados() throws Exception {
		ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoDefiProdu();
		
		
		productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoDefiProdu();
		
		
		//this.generarReporteProductoDefiProdus("Todos",productodefiprodusSeleccionados ,productodefiproduImplementable,productodefiproduImplementableHome);
	}
	
	public void mostrarImportacionProductoDefiProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoDefiProdu();
		
		this.abrirFrameImportacionProductoDefiProdu();		
		
			
		//this.generarReporteProductoDefiProdus("Todos",productodefiprodusSeleccionados ,productodefiproduImplementable,productodefiproduImplementableHome);
	}
	
	public void importarProductoDefiProdus() throws Exception {		
	
	}
	
	public void exportarProductoDefiProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoDefiProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoDefiProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoDefiProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Producto Definicion Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoDefiProdusSeleccionados() throws Exception {
		ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();		
		
		productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productodefiprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoDefiProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoDefiProdu productodefiproduAux:productodefiprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoDefiProdu(productodefiproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productodefiproduAux.setsDetalleGeneralEntityReporte(productodefiproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Definicion Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoDefiProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoDefiProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoDefiProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoDefiProdu(ProductoDefiProdu productodefiprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productodefiprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productodefiprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productodefiprodu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productodefiprodu.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productodefiprodu.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productodefiprodu.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productodefiprodu.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productodefiprodu.getcon_genera_sub_productos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productodefiprodu.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoDefiProdusSeleccionados() throws Exception {
		ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();		
		
		productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productodefiprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoDefiProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoDefiProdu(row);				
				iRow++;
			}				
			
			for(ProductoDefiProdu productodefiproduAux:productodefiprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoDefiProdu(productodefiproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Definicion Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoDefiProdusSeleccionados() throws Exception {
		ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();		
		
		productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productodefiprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productodefiprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productodefiprodu");
			//elementRoot.appendChild(element);
		
			for(ProductoDefiProdu productodefiproduAux:productodefiprodusSeleccionados) {
				element = document.createElement("productodefiprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoDefiProdu(productodefiproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Definicion Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoDefiProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoDefiProdu(ProductoDefiProdu productodefiprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productodefiprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productodefiprodu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productodefiprodu.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productodefiprodu.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productodefiprodu.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productodefiprodu.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productodefiprodu.getcon_genera_sub_productos());
		cell = row.createCell(iColumn++);cell.setCellValue(productodefiprodu.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProductoDefiProdu(ProductoDefiProdu productodefiprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoDefiProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productodefiprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoDefiProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productodefiprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductoDefiProduConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productodefiprodu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductoDefiProduConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productodefiprodu.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductoDefiProduConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productodefiprodu.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductoDefiProduConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productodefiprodu.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementunidad_descripcion = document.createElement(ProductoDefiProduConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(productodefiprodu.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcon_genera_sub_productos = document.createElement(ProductoDefiProduConstantesFunciones.CONGENERASUBPRODUCTOS);
		elementcon_genera_sub_productos.appendChild(document.createTextNode(productodefiprodu.getcon_genera_sub_productos().toString().trim()));
		element.appendChild(elementcon_genera_sub_productos);

		Element elementdescripcion = document.createElement(ProductoDefiProduConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productodefiprodu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProductoDefiProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados=new ArrayList<ProductoDefiProdu>();
		
		productodefiprodusSeleccionados=this.getProductoDefiProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoDefiProdu(productodefiprodusSeleccionados);
		
		this.generarReporteProductoDefiProdus("Todos",productodefiprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoDefiProdu(ArrayList<ProductoDefiProdu> productodefiprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoDefiProdu productodefiproduAux:productodefiprodusSeleccionados) {
				productodefiproduAux.setsDetalleGeneralEntityReporte(productodefiproduAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoDefiProduConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productodefiproduAux.setsDescripcionGeneralEntityReporte1(productodefiproduAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoDefiProduConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productodefiproduAux.setsDescripcionGeneralEntityReporte1(productodefiproduAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoDefiProduConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productodefiproduAux.setsDescripcionGeneralEntityReporte1(productodefiproduAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoDefiProduConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productodefiproduAux.setsDescripcionGeneralEntityReporte1(productodefiproduAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoDefiProduConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					productodefiproduAux.setsDescripcionGeneralEntityReporte1(productodefiproduAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoDefiProduConstantesFunciones.LABEL_CONGENERASUBPRODUCTOS)) {
					existe=true;
					productodefiproduAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(productodefiproduAux.getcon_genera_sub_productos()));
				}
				 else if(sTipoSeleccionar.equals(ProductoDefiProduConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productodefiproduAux.setsDescripcionGeneralEntityReporte1(productodefiproduAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoDefiProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoDefiProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoDefiProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=true;
				this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=true;
			}
			
			this.isVisibilidadCeldaModificarProductoDefiProdu=false;
			this.isVisibilidadCeldaActualizarProductoDefiProdu=false;
			this.isVisibilidadCeldaEliminarProductoDefiProdu=false;
			this.isVisibilidadCeldaCancelarProductoDefiProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoDefiProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=false;
			this.isVisibilidadCeldaModificarProductoDefiProdu=false;
			this.isVisibilidadCeldaActualizarProductoDefiProdu=true;
			this.isVisibilidadCeldaEliminarProductoDefiProdu=false;
			this.isVisibilidadCeldaCancelarProductoDefiProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoDefiProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=false;
			this.isVisibilidadCeldaModificarProductoDefiProdu=false;
			this.isVisibilidadCeldaActualizarProductoDefiProdu=true;
			this.isVisibilidadCeldaEliminarProductoDefiProdu=true;
			this.isVisibilidadCeldaCancelarProductoDefiProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoDefiProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=false;
			this.isVisibilidadCeldaModificarProductoDefiProdu=false;
			this.isVisibilidadCeldaActualizarProductoDefiProdu=true;
			this.isVisibilidadCeldaEliminarProductoDefiProdu=false;
			this.isVisibilidadCeldaCancelarProductoDefiProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoDefiProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=true;
			this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=true;
			this.isVisibilidadCeldaModificarProductoDefiProdu=false;
			this.isVisibilidadCeldaActualizarProductoDefiProdu=false;
			this.isVisibilidadCeldaEliminarProductoDefiProdu=false;
			this.isVisibilidadCeldaCancelarProductoDefiProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoDefiProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=false;
			this.isVisibilidadCeldaActualizarProductoDefiProdu=false;
			this.isVisibilidadCeldaEliminarProductoDefiProdu=false;
			this.isVisibilidadCeldaCancelarProductoDefiProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoDefiProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=false;
			this.isVisibilidadCeldaModificarProductoDefiProdu=true;
			this.isVisibilidadCeldaActualizarProductoDefiProdu=false;
			this.isVisibilidadCeldaEliminarProductoDefiProdu=false;
			this.isVisibilidadCeldaCancelarProductoDefiProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoDefiProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoDefiProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoDefiProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=true;
			this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=true;
		} else {
			this.actualizarEstadoPanelsProductoDefiProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoDefiProdu=false;
			//this.isVisibilidadCeldaVerFormProductoDefiProdu=false;
			this.isVisibilidadCeldaDuplicarProductoDefiProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productodefiproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoDefiProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productodefiproduSessionBean.getEsGuardarRelacionado()) {
			if(!productodefiproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=false;												
			}
			
			this.jButtonCerrarProductoDefiProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoDefiProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.productodefiprodu)) {
			this.isVisibilidadCeldaActualizarProductoDefiProdu=false;
			this.isVisibilidadCeldaEliminarProductoDefiProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoDefiProdu() {
		this.isVisibilidadCeldaNuevoProductoDefiProdu=false;
		this.isVisibilidadCeldaGuardarCambiosProductoDefiProdu=false;
	}
	
	public void actualizarEstadoPanelsProductoDefiProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoDefiProdu!=null) {
				this.jScrollPanelDatosEdicionProductoDefiProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoDefiProdu!=null) {
				this.jTabbedPaneBusquedasProductoDefiProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoDefiProdu!=null) {
				this.jScrollPanelDatosProductoDefiProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoDefiProdu!=null) {
				this.jPanelPaginacionProductoDefiProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoDefiProdu!=null) {
				this.jPanelParametrosReportesProductoDefiProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoDefiProdu!=null) {
				this.jScrollPanelDatosEdicionProductoDefiProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoDefiProdu!=null) {
				this.jTabbedPaneBusquedasProductoDefiProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoDefiProdu!=null) {
				this.jScrollPanelDatosProductoDefiProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoDefiProdu!=null) {
				this.jPanelPaginacionProductoDefiProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoDefiProdu!=null) {
				this.jPanelParametrosReportesProductoDefiProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoDefiProdu!=null) {
				this.jScrollPanelDatosEdicionProductoDefiProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoDefiProdu!=null) {
				this.jTabbedPaneBusquedasProductoDefiProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoDefiProdu!=null) {
				this.jScrollPanelDatosProductoDefiProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoDefiProdu!=null) {
				this.jPanelPaginacionProductoDefiProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoDefiProdu!=null) {
				this.jPanelParametrosReportesProductoDefiProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoDefiProdu!=null) {
				this.jScrollPanelDatosEdicionProductoDefiProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoDefiProdu!=null) {
				this.jTabbedPaneBusquedasProductoDefiProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoDefiProdu!=null) {
				this.jScrollPanelDatosProductoDefiProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoDefiProdu!=null) {
				this.jPanelPaginacionProductoDefiProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoDefiProdu!=null) {
				this.jPanelParametrosReportesProductoDefiProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoDefiProdu!=null) {
				this.jScrollPanelDatosEdicionProductoDefiProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoDefiProdu!=null) {
				this.jTabbedPaneBusquedasProductoDefiProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoDefiProdu!=null) {
				this.jScrollPanelDatosProductoDefiProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoDefiProdu!=null) {
				this.jPanelPaginacionProductoDefiProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoDefiProdu!=null) {
				this.jPanelParametrosReportesProductoDefiProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoDefiProdu!=null) {
				this.jScrollPanelDatosEdicionProductoDefiProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoDefiProdu!=null) {
				this.jTabbedPaneBusquedasProductoDefiProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoDefiProdu!=null) {
				this.jScrollPanelDatosProductoDefiProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoDefiProdu!=null) {
				this.jPanelPaginacionProductoDefiProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoDefiProdu!=null) {
				this.jPanelParametrosReportesProductoDefiProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoDefiProdu!=null) {
				this.jScrollPanelDatosEdicionProductoDefiProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoDefiProdu!=null) {
				this.jTabbedPaneBusquedasProductoDefiProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoDefiProdu!=null) {
				this.jScrollPanelDatosProductoDefiProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoDefiProdu!=null) {
				this.jPanelPaginacionProductoDefiProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoDefiProdu!=null) {
				this.jPanelParametrosReportesProductoDefiProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoDefiProdu!=null) {
					this.jTabbedPaneBusquedasProductoDefiProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoDefiProdu!=null) {
				this.jPanelParametrosReportesProductoDefiProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productodefiproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoDefiProdu!=null) {
				this.jTabbedPaneBusquedasProductoDefiProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoDefiProdu!=null) {
				this.jPanelParametrosReportesProductoDefiProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;
		}
		
	}
	
	

	public String registrarSesionProductoDefiProduParaProductoProduManoes() throws Exception {
		Boolean isPaginaPopupProductoProduMano=false;

		try {

			if(this.productodefiproduSessionBean==null) {
				this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoSessionBean==null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoSessionBean=new ProductoProduManoSessionBean();
			}

			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoSessionBean.setsPathNavegacionActual(productodefiproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoProduManoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoProduMano=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoProduMano(true);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduMano(ProductoDefiProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoSessionBean.setisBusquedaDesdeForeignKeySesionProductoDefiProdu(true);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumanoSessionBean.setlidProductoDefiProduActual(this.idProductoDefiProduActual);

			productodefiproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoDefiProdu(true);
			productodefiproduSessionBean.setlIdProductoDefiProduActualForeignKey(this.idProductoDefiProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionProductoDefiProduParaProductoProduMermaes() throws Exception {
		Boolean isPaginaPopupProductoProduMerma=false;

		try {

			if(this.productodefiproduSessionBean==null) {
				this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaSessionBean==null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaSessionBean=new ProductoProduMermaSessionBean();
			}

			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaSessionBean.setsPathNavegacionActual(productodefiproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoProduMermaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoProduMerma=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoProduMerma(true);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduMerma(ProductoDefiProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaSessionBean.setisBusquedaDesdeForeignKeySesionProductoDefiProdu(true);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumermaSessionBean.setlidProductoDefiProduActual(this.idProductoDefiProduActual);

			productodefiproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoDefiProdu(true);
			productodefiproduSessionBean.setlIdProductoDefiProduActualForeignKey(this.idProductoDefiProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionProductoDefiProduParaProductoProduGastoes() throws Exception {
		Boolean isPaginaPopupProductoProduGasto=false;

		try {

			if(this.productodefiproduSessionBean==null) {
				this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoSessionBean==null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
			}

			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoSessionBean.setsPathNavegacionActual(productodefiproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoProduGasto=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoProduGasto(true);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduGasto(ProductoDefiProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoSessionBean.setisBusquedaDesdeForeignKeySesionProductoDefiProdu(true);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodugastoSessionBean.setlidProductoDefiProduActual(this.idProductoDefiProduActual);

			productodefiproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoDefiProdu(true);
			productodefiproduSessionBean.setlIdProductoDefiProduActualForeignKey(this.idProductoDefiProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionProductoDefiProduParaProductoProdues() throws Exception {
		Boolean isPaginaPopupProductoProdu=false;

		try {

			if(this.productodefiproduSessionBean==null) {
				this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoproduSessionBean==null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoproduSessionBean=new ProductoProduSessionBean();
			}

			this.jInternalFrameDetalleFormProductoDefiProdu.productoproduSessionBean.setsPathNavegacionActual(productodefiproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoProduConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoproduSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoProdu=this.jInternalFrameDetalleFormProductoDefiProdu.productoproduSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoproduSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoProdu(true);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoproduSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProdu(ProductoDefiProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoproduSessionBean.setisBusquedaDesdeForeignKeySesionProductoDefiProdu(true);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoproduSessionBean.setlidProductoDefiProduActual(this.idProductoDefiProduActual);

			productodefiproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoDefiProdu(true);
			productodefiproduSessionBean.setlIdProductoDefiProduActualForeignKey(this.idProductoDefiProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionProductoDefiProduParaProductoProduMaquinaes() throws Exception {
		Boolean isPaginaPopupProductoProduMaquina=false;

		try {

			if(this.productodefiproduSessionBean==null) {
				this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaSessionBean==null) {
				this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
			}

			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaSessionBean.setsPathNavegacionActual(productodefiproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoProduMaquina=this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoProduMaquina(true);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduMaquina(ProductoDefiProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionProductoDefiProdu(true);
			this.jInternalFrameDetalleFormProductoDefiProdu.productoprodumaquinaSessionBean.setlidProductoDefiProduActual(this.idProductoDefiProduActual);

			productodefiproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoDefiProdu(true);
			productodefiproduSessionBean.setlIdProductoDefiProduActualForeignKey(this.idProductoDefiProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionProductoDefiProduParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(productodefiproduSessionBean==null) {
				productodefiproduSessionBean=new ProductoDefiProduSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(productodefiproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.productodefiproduFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProductoDefiProduConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProductoDefiProdu(true);
			//productoSessionBean.setlidProductoDefiProduActual(this.idProductoDefiProduActual);

			productodefiproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoDefiProdu(true);
			productodefiproduSessionBean.setlIdProductoDefiProduActualForeignKey(this.idProductoDefiProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoDefiProduSessionBean productodefiproduSessionBean=new ProductoDefiProduSessionBean();
		
		if(this.productodefiproduSessionBean==null) {
			this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
		}
		
		this.productodefiproduSessionBean.setsUltimaBusquedaProductoDefiProdu(this.getsAccionBusqueda());
		this.productodefiproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productodefiproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			productodefiproduSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			productodefiproduSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoDefiProduSessionBean productodefiproduSessionBean=new ProductoDefiProduSessionBean();
		
		if(this.productodefiproduSessionBean==null) {
			this.productodefiproduSessionBean=new ProductoDefiProduSessionBean();
		}
		
		if(this.productodefiproduSessionBean.getsUltimaBusquedaProductoDefiProdu()!=null&&!this.productodefiproduSessionBean.getsUltimaBusquedaProductoDefiProdu().equals("")) {
			this.setsAccionBusqueda(productodefiproduSessionBean.getsUltimaBusquedaProductoDefiProdu());
			this.setiNumeroPaginacion(productodefiproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productodefiproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(productodefiproduSessionBean.getid_empresa());
				productodefiproduSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(productodefiproduSessionBean.getid_sucursal());
				productodefiproduSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.productodefiproduSessionBean.setsUltimaBusquedaProductoDefiProdu("");
		this.productodefiproduSessionBean.setiNumeroPaginacion(ProductoDefiProduConstantesFunciones.INUMEROPAGINACION);
		this.productodefiproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoDefiProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoDefiProdu() {
		this.updateBorderResaltarBusquedasFormularioProductoDefiProdu();
		this.updateVisibilidadBusquedasFormularioProductoDefiProdu();
		this.updateHabilitarBusquedasFormularioProductoDefiProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoDefiProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoDefiProdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoDefiProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoDefiProdu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoDefiProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoDefiProdu.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoDefiProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarProductoDefiProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoDefiProdu() throws Exception {

		if(this.jInternalFrameDetalleFormProductoDefiProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoDefiProdu();
		this.updateVisibilidadResaltarControlesFormularioProductoDefiProdu();
		this.updateHabilitarResaltarControlesFormularioProductoDefiProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoDefiProdu() throws Exception {
		if(this.jInternalFrameDetalleFormProductoDefiProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productodefiproduConstantesFunciones.resaltaridProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu!=null) {this.jInternalFrameDetalleFormProductoDefiProdu.jLabelidProductoDefiProdu.setBorder(this.productodefiproduConstantesFunciones.resaltaridProductoDefiProdu);}
		if(this.productodefiproduConstantesFunciones.resaltarid_empresaProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu!=null) {this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.setBorder(this.productodefiproduConstantesFunciones.resaltarid_empresaProductoDefiProdu);}
		if(this.productodefiproduConstantesFunciones.resaltarid_sucursalProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu!=null) {this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.setBorder(this.productodefiproduConstantesFunciones.resaltarid_sucursalProductoDefiProdu);}
		if(this.productodefiproduConstantesFunciones.resaltarid_bodegaProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu!=null) {this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.setBorder(this.productodefiproduConstantesFunciones.resaltarid_bodegaProductoDefiProdu);}
		if(this.productodefiproduConstantesFunciones.resaltarid_productoProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu!=null) {this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.setBorder(this.productodefiproduConstantesFunciones.resaltarid_productoProductoDefiProdu);}
		if(this.productodefiproduConstantesFunciones.resaltarid_unidadProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu!=null) {this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.setBorder(this.productodefiproduConstantesFunciones.resaltarid_unidadProductoDefiProdu);}
		if(this.productodefiproduConstantesFunciones.resaltarcon_genera_sub_productosProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu!=null) {this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxcon_genera_sub_productosProductoDefiProdu.setBorderPainted(true);this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxcon_genera_sub_productosProductoDefiProdu.setBorder(this.productodefiproduConstantesFunciones.resaltarcon_genera_sub_productosProductoDefiProdu);}
		if(this.productodefiproduConstantesFunciones.resaltardescripcionProductoDefiProdu!=null && this.jInternalFrameDetalleFormProductoDefiProdu!=null) {this.jInternalFrameDetalleFormProductoDefiProdu.jTextAreadescripcionProductoDefiProdu.setBorder(this.productodefiproduConstantesFunciones.resaltardescripcionProductoDefiProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoDefiProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoDefiProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
	
		//this.jInternalFrameDetalleFormProductoDefiProdu.jLabelidProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostraridProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jPanelidProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostraridProductoDefiProdu);
		//this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarid_empresaProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jPanelid_empresaProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarid_empresaProductoDefiProdu);
		//this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarid_sucursalProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jPanelid_sucursalProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarid_sucursalProductoDefiProdu);
		//this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarid_bodegaProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jPanelid_bodegaProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarid_bodegaProductoDefiProdu);
		//this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarid_productoProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jPanelid_productoProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarid_productoProductoDefiProdu);
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_productoProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarid_productoProductoDefiProdu);
		//this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarid_unidadProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jPanelid_unidadProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarid_unidadProductoDefiProdu);
		//this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxcon_genera_sub_productosProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarcon_genera_sub_productosProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jPanelcon_genera_sub_productosProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrarcon_genera_sub_productosProductoDefiProdu);
		//this.jInternalFrameDetalleFormProductoDefiProdu.jTextAreadescripcionProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrardescripcionProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jPaneldescripcionProductoDefiProdu.setVisible(this.productodefiproduConstantesFunciones.mostrardescripcionProductoDefiProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoDefiProdu() throws Exception {
		if(this.jInternalFrameDetalleFormProductoDefiProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoDefiProdu!=null) {
	
		this.jInternalFrameDetalleFormProductoDefiProdu.jLabelidProductoDefiProdu.setEnabled(this.productodefiproduConstantesFunciones.activaridProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_empresaProductoDefiProdu.setEnabled(this.productodefiproduConstantesFunciones.activarid_empresaProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_sucursalProductoDefiProdu.setEnabled(this.productodefiproduConstantesFunciones.activarid_sucursalProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_bodegaProductoDefiProdu.setEnabled(this.productodefiproduConstantesFunciones.activarid_bodegaProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_productoProductoDefiProdu.setEnabled(this.productodefiproduConstantesFunciones.activarid_productoProductoDefiProdu);
			this.jInternalFrameDetalleFormProductoDefiProdu.jButtonid_productoProductoDefiProdu.setEnabled(this.productodefiproduConstantesFunciones.activarid_productoProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jComboBoxid_unidadProductoDefiProdu.setEnabled(this.productodefiproduConstantesFunciones.activarid_unidadProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jCheckBoxcon_genera_sub_productosProductoDefiProdu.setEnabled(this.productodefiproduConstantesFunciones.activarcon_genera_sub_productosProductoDefiProdu);
		this.jInternalFrameDetalleFormProductoDefiProdu.jTextAreadescripcionProductoDefiProdu.setEnabled(this.productodefiproduConstantesFunciones.activardescripcionProductoDefiProdu);
		}
	}
	
		
}