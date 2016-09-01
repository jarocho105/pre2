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

import com.bydan.erp.produccion.util.ProductoProduMaquinaConstantesFunciones;
import com.bydan.erp.produccion.util.ProductoProduMaquinaParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProductoProduMaquinaParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ProductoProduMaquinaBean;
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

import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProductoProduMaquinaBeanSwingJInternalFrame extends ProductoProduMaquinaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoProduMaquinaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoProduMaquina> productoprodumaquinaValidator = new ClassValidator<ProductoProduMaquina>(ProductoProduMaquina.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoProduMaquina productoprodumaquina;	
	public ProductoProduMaquina productoprodumaquinaAux;
	public ProductoProduMaquina productoprodumaquinaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoProduMaquina productoprodumaquinaTotales;
	public Long idProductoProduMaquinaActual;
	public Long iIdNuevoProductoProduMaquina=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboProductoDefiProdu="";

	public List<ProductoDefiProdu> productodefiprodusForeignKey;

	public List<ProductoDefiProdu> getproductodefiprodusForeignKey() {
		return productodefiprodusForeignKey;
	}

	public void setproductodefiprodusForeignKey(List<ProductoDefiProdu> productodefiprodusForeignKey) {
		this.productodefiprodusForeignKey = productodefiprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public ProductoDefiProdu productodefiproduForeignKey;

	public ProductoDefiProdu getproductodefiproduForeignKey() {
		return productodefiproduForeignKey;
	}

	public void setproductodefiproduForeignKey(ProductoDefiProdu productodefiproduForeignKey) {
		this.productodefiproduForeignKey = productodefiproduForeignKey;
	}

	public String sFinalQueryComboTipoAreaEmpresaProdu="";

	public List<TipoAreaEmpresaProdu> tipoareaempresaprodusForeignKey;

	public List<TipoAreaEmpresaProdu> gettipoareaempresaprodusForeignKey() {
		return tipoareaempresaprodusForeignKey;
	}

	public void settipoareaempresaprodusForeignKey(List<TipoAreaEmpresaProdu> tipoareaempresaprodusForeignKey) {
		this.tipoareaempresaprodusForeignKey = tipoareaempresaprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoAreaEmpresaProdu tipoareaempresaproduForeignKey;

	public TipoAreaEmpresaProdu gettipoareaempresaproduForeignKey() {
		return tipoareaempresaproduForeignKey;
	}

	public void settipoareaempresaproduForeignKey(TipoAreaEmpresaProdu tipoareaempresaproduForeignKey) {
		this.tipoareaempresaproduForeignKey = tipoareaempresaproduForeignKey;
	}

	public String sFinalQueryComboTipoProcesoEmpresaProdu="";

	public List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusForeignKey;

	public List<TipoProcesoEmpresaProdu> gettipoprocesoempresaprodusForeignKey() {
		return tipoprocesoempresaprodusForeignKey;
	}

	public void settipoprocesoempresaprodusForeignKey(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusForeignKey) {
		this.tipoprocesoempresaprodusForeignKey = tipoprocesoempresaprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoProcesoEmpresaProdu tipoprocesoempresaproduForeignKey;

	public TipoProcesoEmpresaProdu gettipoprocesoempresaproduForeignKey() {
		return tipoprocesoempresaproduForeignKey;
	}

	public void settipoprocesoempresaproduForeignKey(TipoProcesoEmpresaProdu tipoprocesoempresaproduForeignKey) {
		this.tipoprocesoempresaproduForeignKey = tipoprocesoempresaproduForeignKey;
	}

	public String sFinalQueryComboTipoMaquinaEmpresa="";

	public List<TipoMaquinaEmpresa> tipomaquinaempresasForeignKey;

	public List<TipoMaquinaEmpresa> gettipomaquinaempresasForeignKey() {
		return tipomaquinaempresasForeignKey;
	}

	public void settipomaquinaempresasForeignKey(List<TipoMaquinaEmpresa> tipomaquinaempresasForeignKey) {
		this.tipomaquinaempresasForeignKey = tipomaquinaempresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMaquinaEmpresa tipomaquinaempresaForeignKey;

	public TipoMaquinaEmpresa gettipomaquinaempresaForeignKey() {
		return tipomaquinaempresaForeignKey;
	}

	public void settipomaquinaempresaForeignKey(TipoMaquinaEmpresa tipomaquinaempresaForeignKey) {
		this.tipomaquinaempresaForeignKey = tipomaquinaempresaForeignKey;
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
	
	public Boolean isPermisoTodoProductoProduMaquina;
	public Boolean isPermisoNuevoProductoProduMaquina;
	public Boolean isPermisoActualizarProductoProduMaquina;
	public Boolean isPermisoActualizarOriginalProductoProduMaquina;
	public Boolean isPermisoEliminarProductoProduMaquina;
	public Boolean isPermisoGuardarCambiosProductoProduMaquina;
	public Boolean isPermisoConsultaProductoProduMaquina;
	public Boolean isPermisoBusquedaProductoProduMaquina;
	public Boolean isPermisoReporteProductoProduMaquina;
	public Boolean isPermisoPaginacionMedioProductoProduMaquina;
	public Boolean isPermisoPaginacionAltoProductoProduMaquina;
	public Boolean isPermisoPaginacionTodoProductoProduMaquina;
	public Boolean isPermisoCopiarProductoProduMaquina;
	public Boolean isPermisoVerFormProductoProduMaquina;
	public Boolean isPermisoDuplicarProductoProduMaquina;
	public Boolean isPermisoOrdenProductoProduMaquina;
	
	
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
	
	public ProductoProduMaquinaParameterReturnGeneral productoprodumaquinaReturnGeneral;
	public ProductoProduMaquinaParameterReturnGeneral productoprodumaquinaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoProduMaquina=false;
	public Boolean esParaAccionDesdeFormularioProductoProduMaquina=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoProduMaquinaSessionBeanAdditional productoprodumaquinaSessionBeanAdditional=null;
	
	public ProductoProduMaquinaSessionBeanAdditional getProductoProduMaquinaSessionBeanAdditional() {
		return this.productoprodumaquinaSessionBeanAdditional;
	}
	
	public void setProductoProduMaquinaSessionBeanAdditional(ProductoProduMaquinaSessionBeanAdditional productoprodumaquinaSessionBeanAdditional) {
		try {
			this.productoprodumaquinaSessionBeanAdditional=productoprodumaquinaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoProduMaquinaBeanSwingJInternalFrameAdditional productoprodumaquinaBeanSwingJInternalFrameAdditional=null;
	//public class ProductoProduMaquinaBeanSwingJInternalFrame
	
	public ProductoProduMaquinaBeanSwingJInternalFrameAdditional getProductoProduMaquinaBeanSwingJInternalFrameAdditional() {
		return this.productoprodumaquinaBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoProduMaquinaBeanSwingJInternalFrameAdditional(ProductoProduMaquinaBeanSwingJInternalFrameAdditional productoprodumaquinaBeanSwingJInternalFrameAdditional) {
		try {
			this.productoprodumaquinaBeanSwingJInternalFrameAdditional=productoprodumaquinaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoProduMaquinaLogic productoprodumaquinaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoProduMaquina productoprodumaquinaBean;
	public ProductoProduMaquinaConstantesFunciones productoprodumaquinaConstantesFunciones;
	//public ProductoProduMaquinaParameterReturnGeneral productoprodumaquinaReturnGeneral;
	
	//FK
	
	public ProductoDefiProduLogic productodefiproduLogic;
	public TipoAreaEmpresaProduLogic tipoareaempresaproduLogic;
	public TipoProcesoEmpresaProduLogic tipoprocesoempresaproduLogic;
	public TipoMaquinaEmpresaLogic tipomaquinaempresaLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoProduMaquina> productoprodumaquinas;	
	//public List<ProductoProduMaquina> productoprodumaquinasEliminados;
	//public List<ProductoProduMaquina> productoprodumaquinasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoProduMaquina=false;
	public Boolean isVisibilidadCeldaDuplicarProductoProduMaquina=true;
	public Boolean isVisibilidadCeldaCopiarProductoProduMaquina=true;
	public Boolean isVisibilidadCeldaVerFormProductoProduMaquina=true;
	public Boolean isVisibilidadCeldaOrdenProductoProduMaquina=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=false;
	public Boolean isVisibilidadCeldaModificarProductoProduMaquina=false;
	public Boolean isVisibilidadCeldaActualizarProductoProduMaquina=false;
	public Boolean isVisibilidadCeldaEliminarProductoProduMaquina=false;
	public Boolean isVisibilidadCeldaCancelarProductoProduMaquina=false;
	public Boolean isVisibilidadCeldaGuardarProductoProduMaquina=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoProduMaquina=false;	
	
	
	public Boolean isVisibilidadFK_IdProductoDefiProdu=false;
	public Boolean isVisibilidadFK_IdTipoAreaEmpresaProdu=false;
	public Boolean isVisibilidadFK_IdTipoMaquinaEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoProcesoEmpresaProdu=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoProductoProduMaquina() {
		return this.iIdNuevoProductoProduMaquina;
	}

	public void setiIdNuevoProductoProduMaquina(Long iIdNuevoProductoProduMaquina) {
		this.iIdNuevoProductoProduMaquina = iIdNuevoProductoProduMaquina;
	}
	
	public Long getidProductoProduMaquinaActual() {
		return this.idProductoProduMaquinaActual;
	}

	public void setidProductoProduMaquinaActual(Long idProductoProduMaquinaActual) {
		this.idProductoProduMaquinaActual = idProductoProduMaquinaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoProduMaquina getproductoprodumaquina() {
		return this.productoprodumaquina;
	}

	public void setproductoprodumaquina(ProductoProduMaquina productoprodumaquina) {
		this.productoprodumaquina = productoprodumaquina;
	}
	
	public ProductoProduMaquina getproductoprodumaquinaAux() {
		return this.productoprodumaquinaAux;
	}

	public void setproductoprodumaquinaAux(ProductoProduMaquina productoprodumaquinaAux) {
		this.productoprodumaquinaAux = productoprodumaquinaAux;
	}				
	
	public ProductoProduMaquina getproductoprodumaquinaAnterior() {
		return this.productoprodumaquinaAnterior;
	}

	public void setproductoprodumaquinaAnterior(ProductoProduMaquina productoprodumaquinaAnterior) {
		this.productoprodumaquinaAnterior = productoprodumaquinaAnterior;
	}	
	
	public ProductoProduMaquina getproductoprodumaquinaTotales() {
		return this.productoprodumaquinaTotales;
	}

	public void setproductoprodumaquinaTotales(ProductoProduMaquina productoprodumaquinaTotales) {
		this.productoprodumaquinaTotales = productoprodumaquinaTotales;
	}	
	
	public ProductoProduMaquina getproductoprodumaquinaBean() {
		return this.productoprodumaquinaBean;
	}

	public void setproductoprodumaquinaBean(ProductoProduMaquina productoprodumaquinaBean) {
		this.productoprodumaquinaBean = productoprodumaquinaBean;
	}	
	
	public ProductoProduMaquinaParameterReturnGeneral getproductoprodumaquinaReturnGeneral() {
		return this.productoprodumaquinaReturnGeneral;
	}

	public void setproductoprodumaquinaReturnGeneral(ProductoProduMaquinaParameterReturnGeneral productoprodumaquinaReturnGeneral) {
		this.productoprodumaquinaReturnGeneral = productoprodumaquinaReturnGeneral;
	}	
	
	
	public Long id_producto_defi_produFK_IdProductoDefiProdu=-1L;

	public Long getid_producto_defi_produFK_IdProductoDefiProdu() {
		return this.id_producto_defi_produFK_IdProductoDefiProdu;
	}

	public void setid_producto_defi_produFK_IdProductoDefiProdu(Long id_producto_defi_produFK_IdProductoDefiProdu) {
		this.id_producto_defi_produFK_IdProductoDefiProdu = id_producto_defi_produFK_IdProductoDefiProdu;
	}

	public Long id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu=-1L;

	public Long getid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu() {
		return this.id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu;
	}

	public void setid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu(Long id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu) {
		this.id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu = id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu;
	}

	public Long id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa=-1L;

	public Long getid_tipo_merma_empresaFK_IdTipoMaquinaEmpresa() {
		return this.id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa;
	}

	public void setid_tipo_merma_empresaFK_IdTipoMaquinaEmpresa(Long id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa) {
		this.id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa = id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa;
	}

	public Long id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu=-1L;

	public Long getid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu() {
		return this.id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu;
	}

	public void setid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu(Long id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu) {
		this.id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu = id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu;
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
	
	
	public ProductoProduMaquinaLogic getProductoProduMaquinaLogic()	{		
		return productoprodumaquinaLogic;
	}

	public void setProductoProduMaquinaLogic(ProductoProduMaquinaLogic productoprodumaquinaLogic) {
		this.productoprodumaquinaLogic = productoprodumaquinaLogic;
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
	
	public Boolean getIsEsNuevoProductoProduMaquina() {
		return isEsNuevoProductoProduMaquina;
	}

	public void setIsEsNuevoProductoProduMaquina(Boolean isEsNuevoProductoProduMaquina) {
		this.isEsNuevoProductoProduMaquina = isEsNuevoProductoProduMaquina;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoProduMaquina() {
		return esParaAccionDesdeFormularioProductoProduMaquina;
	}
	
	public void setEsParaAccionDesdeFormularioProductoProduMaquina(Boolean esParaAccionDesdeFormularioProductoProduMaquina) {
		this.esParaAccionDesdeFormularioProductoProduMaquina = esParaAccionDesdeFormularioProductoProduMaquina;
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
	
	
	public void cargarCombosProductoDefiProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoDefiProduLogic productodefiproduLogic=new ProductoDefiProduLogic();

			productodefiproduLogic.getProductoDefiProduDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodumaquinaSessionBean==null) {
				this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
			}

			if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLogic.getProductoDefiProduDataAccess().setIsForForeingKeyData(true);

					productodefiproduLogic.getTodosProductoDefiProdusWithConnection(sFinalQuery,new Pagination());

					this.productodefiprodusForeignKey=productodefiproduLogic.getProductoDefiProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProductoDefiProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLogic.getEntityWithConnection(productoprodumaquinaSessionBean.getlidProductoDefiProduActual());
					this.productodefiprodusForeignKey.add(productodefiproduLogic.getProductoDefiProdu());
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

	public void cargarCombosTipoAreaEmpresaProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoareaempresaprodusForeignKey=new ArrayList<TipoAreaEmpresaProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoAreaEmpresaProduLogic tipoareaempresaproduLogic=new TipoAreaEmpresaProduLogic();

			tipoareaempresaproduLogic.getTipoAreaEmpresaProduDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodumaquinaSessionBean==null) {
				this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
			}

			if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoAreaEmpresaProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoareaempresaproduLogic.getTipoAreaEmpresaProduDataAccess().setIsForForeingKeyData(true);

					tipoareaempresaproduLogic.getTodosTipoAreaEmpresaProdusWithConnection(sFinalQuery,new Pagination());

					this.tipoareaempresaprodusForeignKey=tipoareaempresaproduLogic.getTipoAreaEmpresaProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoAreaEmpresaProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoareaempresaproduLogic.getEntityWithConnection(productoprodumaquinaSessionBean.getlidTipoAreaEmpresaProduActual());
					this.tipoareaempresaprodusForeignKey.add(tipoareaempresaproduLogic.getTipoAreaEmpresaProdu());
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

	public void cargarCombosTipoProcesoEmpresaProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoprocesoempresaprodusForeignKey=new ArrayList<TipoProcesoEmpresaProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoProcesoEmpresaProduLogic tipoprocesoempresaproduLogic=new TipoProcesoEmpresaProduLogic();

			tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProduDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodumaquinaSessionBean==null) {
				this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
			}

			if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProduDataAccess().setIsForForeingKeyData(true);

					tipoprocesoempresaproduLogic.getTodosTipoProcesoEmpresaProdusWithConnection(sFinalQuery,new Pagination());

					this.tipoprocesoempresaprodusForeignKey=tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoProcesoEmpresaProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesoempresaproduLogic.getEntityWithConnection(productoprodumaquinaSessionBean.getlidTipoProcesoEmpresaProduActual());
					this.tipoprocesoempresaprodusForeignKey.add(tipoprocesoempresaproduLogic.getTipoProcesoEmpresaProdu());
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

	public void cargarCombosTipoMaquinaEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomaquinaempresasForeignKey=new ArrayList<TipoMaquinaEmpresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMaquinaEmpresaLogic tipomaquinaempresaLogic=new TipoMaquinaEmpresaLogic();

			tipomaquinaempresaLogic.getTipoMaquinaEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodumaquinaSessionBean==null) {
				this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
			}

			if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoMaquinaEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomaquinaempresaLogic.getTipoMaquinaEmpresaDataAccess().setIsForForeingKeyData(true);

					tipomaquinaempresaLogic.getTodosTipoMaquinaEmpresasWithConnection(sFinalQuery,new Pagination());

					this.tipomaquinaempresasForeignKey=tipomaquinaempresaLogic.getTipoMaquinaEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMaquinaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomaquinaempresaLogic.getEntityWithConnection(productoprodumaquinaSessionBean.getlidTipoMaquinaEmpresaActual());
					this.tipomaquinaempresasForeignKey.add(tipomaquinaempresaLogic.getTipoMaquinaEmpresa());
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

			unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.productoprodumaquinaSessionBean==null) {
				this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
			}

			if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

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
					unidadLogic.getEntityWithConnection(productoprodumaquinaSessionBean.getlidUnidadActual());
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

	
	
	public void setActualProductoDefiProduForeignKey(Long idProductoDefiProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ProductoDefiProdu  productodefiproduTemp=null;

			for(ProductoDefiProdu productodefiproduAux:productodefiprodusForeignKey) {
				if(productodefiproduAux.getId()!=null && productodefiproduAux.getId().equals(idProductoDefiProduSeleccionado)) {
					productodefiproduTemp=productodefiproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productodefiproduTemp!=null) {

					if(this.productoprodumaquina!=null) {
						this.productoprodumaquina.setProductoDefiProdu(productodefiproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
						this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.setSelectedItem(productodefiproduTemp);
					}
				} else {
					//jComboBoxid_producto_defi_produProductoProduMaquina.setSelectedItem(productodefiproduTemp);
					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
						if(this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProductoDefiProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(productodefiproduTemp!=null && jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina!=null) {
						jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setSelectedItem(productodefiproduTemp);
					} else {
						if(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina!=null) {
							//jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setSelectedItem(productodefiproduTemp);
							if(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.getItemCount()>0) {
								jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setSelectedIndex(0);
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

	public String getActualProductoDefiProduForeignKeyDescripcion(Long idProductoDefiProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ProductoDefiProdu  productodefiproduTemp=null;

			for(ProductoDefiProdu productodefiproduAux:productodefiprodusForeignKey) {
				if(productodefiproduAux.getId()!=null && productodefiproduAux.getId().equals(idProductoDefiProduSeleccionado)) {
					productodefiproduTemp=productodefiproduAux;
					break;
				}
			}


			sDescripcion=ProductoDefiProduConstantesFunciones.getProductoDefiProduDescripcion(productodefiproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoDefiProduForeignKeyGenerico(Long idProductoDefiProduSeleccionado,JComboBox jComboBoxid_producto_defi_produProductoProduMaquinaGenerico)throws Exception
	{
		try
		{
			ProductoDefiProdu  productodefiproduTemp=null;

			for(ProductoDefiProdu productodefiproduAux:productodefiprodusForeignKey) {
				if(productodefiproduAux.getId()!=null && productodefiproduAux.getId().equals(idProductoDefiProduSeleccionado)) {
					productodefiproduTemp=productodefiproduAux;
					break;
				}
			}

			if(productodefiproduTemp!=null) {
				jComboBoxid_producto_defi_produProductoProduMaquinaGenerico.setSelectedItem(productodefiproduTemp);
			} else {
				if(jComboBoxid_producto_defi_produProductoProduMaquinaGenerico!=null && jComboBoxid_producto_defi_produProductoProduMaquinaGenerico.getItemCount()>0) {
					jComboBoxid_producto_defi_produProductoProduMaquinaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoAreaEmpresaProduForeignKey(Long idTipoAreaEmpresaProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoAreaEmpresaProdu  tipoareaempresaproduTemp=null;

			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodusForeignKey) {
				if(tipoareaempresaproduAux.getId()!=null && tipoareaempresaproduAux.getId().equals(idTipoAreaEmpresaProduSeleccionado)) {
					tipoareaempresaproduTemp=tipoareaempresaproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoareaempresaproduTemp!=null) {

					if(this.productoprodumaquina!=null) {
						this.productoprodumaquina.setTipoAreaEmpresaProdu(tipoareaempresaproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
						this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setSelectedItem(tipoareaempresaproduTemp);
					}
				} else {
					//jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setSelectedItem(tipoareaempresaproduTemp);
					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
						if(this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoAreaEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoareaempresaproduTemp!=null && jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina!=null) {
						jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setSelectedItem(tipoareaempresaproduTemp);
					} else {
						if(jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina!=null) {
							//jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setSelectedItem(tipoareaempresaproduTemp);
							if(jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.getItemCount()>0) {
								jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setSelectedIndex(0);
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

	public String getActualTipoAreaEmpresaProduForeignKeyDescripcion(Long idTipoAreaEmpresaProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoAreaEmpresaProdu  tipoareaempresaproduTemp=null;

			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodusForeignKey) {
				if(tipoareaempresaproduAux.getId()!=null && tipoareaempresaproduAux.getId().equals(idTipoAreaEmpresaProduSeleccionado)) {
					tipoareaempresaproduTemp=tipoareaempresaproduAux;
					break;
				}
			}


			sDescripcion=TipoAreaEmpresaProduConstantesFunciones.getTipoAreaEmpresaProduDescripcion(tipoareaempresaproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoAreaEmpresaProduForeignKeyGenerico(Long idTipoAreaEmpresaProduSeleccionado,JComboBox jComboBoxid_tipo_area_empresa_produProductoProduMaquinaGenerico)throws Exception
	{
		try
		{
			TipoAreaEmpresaProdu  tipoareaempresaproduTemp=null;

			for(TipoAreaEmpresaProdu tipoareaempresaproduAux:tipoareaempresaprodusForeignKey) {
				if(tipoareaempresaproduAux.getId()!=null && tipoareaempresaproduAux.getId().equals(idTipoAreaEmpresaProduSeleccionado)) {
					tipoareaempresaproduTemp=tipoareaempresaproduAux;
					break;
				}
			}

			if(tipoareaempresaproduTemp!=null) {
				jComboBoxid_tipo_area_empresa_produProductoProduMaquinaGenerico.setSelectedItem(tipoareaempresaproduTemp);
			} else {
				if(jComboBoxid_tipo_area_empresa_produProductoProduMaquinaGenerico!=null && jComboBoxid_tipo_area_empresa_produProductoProduMaquinaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_area_empresa_produProductoProduMaquinaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoProcesoEmpresaProduForeignKey(Long idTipoProcesoEmpresaProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoProcesoEmpresaProdu  tipoprocesoempresaproduTemp=null;

			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusForeignKey) {
				if(tipoprocesoempresaproduAux.getId()!=null && tipoprocesoempresaproduAux.getId().equals(idTipoProcesoEmpresaProduSeleccionado)) {
					tipoprocesoempresaproduTemp=tipoprocesoempresaproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoprocesoempresaproduTemp!=null) {

					if(this.productoprodumaquina!=null) {
						this.productoprodumaquina.setTipoProcesoEmpresaProdu(tipoprocesoempresaproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
						this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setSelectedItem(tipoprocesoempresaproduTemp);
					}
				} else {
					//jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setSelectedItem(tipoprocesoempresaproduTemp);
					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
						if(this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProcesoEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprocesoempresaproduTemp!=null && jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina!=null) {
						jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setSelectedItem(tipoprocesoempresaproduTemp);
					} else {
						if(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina!=null) {
							//jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setSelectedItem(tipoprocesoempresaproduTemp);
							if(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.getItemCount()>0) {
								jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setSelectedIndex(0);
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

	public String getActualTipoProcesoEmpresaProduForeignKeyDescripcion(Long idTipoProcesoEmpresaProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoProcesoEmpresaProdu  tipoprocesoempresaproduTemp=null;

			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusForeignKey) {
				if(tipoprocesoempresaproduAux.getId()!=null && tipoprocesoempresaproduAux.getId().equals(idTipoProcesoEmpresaProduSeleccionado)) {
					tipoprocesoempresaproduTemp=tipoprocesoempresaproduAux;
					break;
				}
			}


			sDescripcion=TipoProcesoEmpresaProduConstantesFunciones.getTipoProcesoEmpresaProduDescripcion(tipoprocesoempresaproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoProcesoEmpresaProduForeignKeyGenerico(Long idTipoProcesoEmpresaProduSeleccionado,JComboBox jComboBoxid_tipo_proceso_empresa_produProductoProduMaquinaGenerico)throws Exception
	{
		try
		{
			TipoProcesoEmpresaProdu  tipoprocesoempresaproduTemp=null;

			for(TipoProcesoEmpresaProdu tipoprocesoempresaproduAux:tipoprocesoempresaprodusForeignKey) {
				if(tipoprocesoempresaproduAux.getId()!=null && tipoprocesoempresaproduAux.getId().equals(idTipoProcesoEmpresaProduSeleccionado)) {
					tipoprocesoempresaproduTemp=tipoprocesoempresaproduAux;
					break;
				}
			}

			if(tipoprocesoempresaproduTemp!=null) {
				jComboBoxid_tipo_proceso_empresa_produProductoProduMaquinaGenerico.setSelectedItem(tipoprocesoempresaproduTemp);
			} else {
				if(jComboBoxid_tipo_proceso_empresa_produProductoProduMaquinaGenerico!=null && jComboBoxid_tipo_proceso_empresa_produProductoProduMaquinaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_proceso_empresa_produProductoProduMaquinaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMaquinaEmpresaForeignKey(Long idTipoMaquinaEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMaquinaEmpresa  tipomaquinaempresaTemp=null;

			for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresasForeignKey) {
				if(tipomaquinaempresaAux.getId()!=null && tipomaquinaempresaAux.getId().equals(idTipoMaquinaEmpresaSeleccionado)) {
					tipomaquinaempresaTemp=tipomaquinaempresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomaquinaempresaTemp!=null) {

					if(this.productoprodumaquina!=null) {
						this.productoprodumaquina.setTipoMaquinaEmpresa(tipomaquinaempresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
						this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.setSelectedItem(tipomaquinaempresaTemp);
					}
				} else {
					//jComboBoxid_tipo_merma_empresaProductoProduMaquina.setSelectedItem(tipomaquinaempresaTemp);
					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
						if(this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoMaquinaEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomaquinaempresaTemp!=null && jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina!=null) {
						jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setSelectedItem(tipomaquinaempresaTemp);
					} else {
						if(jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina!=null) {
							//jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setSelectedItem(tipomaquinaempresaTemp);
							if(jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.getItemCount()>0) {
								jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setSelectedIndex(0);
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

	public String getActualTipoMaquinaEmpresaForeignKeyDescripcion(Long idTipoMaquinaEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMaquinaEmpresa  tipomaquinaempresaTemp=null;

			for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresasForeignKey) {
				if(tipomaquinaempresaAux.getId()!=null && tipomaquinaempresaAux.getId().equals(idTipoMaquinaEmpresaSeleccionado)) {
					tipomaquinaempresaTemp=tipomaquinaempresaAux;
					break;
				}
			}


			sDescripcion=TipoMaquinaEmpresaConstantesFunciones.getTipoMaquinaEmpresaDescripcion(tipomaquinaempresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMaquinaEmpresaForeignKeyGenerico(Long idTipoMaquinaEmpresaSeleccionado,JComboBox jComboBoxid_tipo_merma_empresaProductoProduMaquinaGenerico)throws Exception
	{
		try
		{
			TipoMaquinaEmpresa  tipomaquinaempresaTemp=null;

			for(TipoMaquinaEmpresa tipomaquinaempresaAux:tipomaquinaempresasForeignKey) {
				if(tipomaquinaempresaAux.getId()!=null && tipomaquinaempresaAux.getId().equals(idTipoMaquinaEmpresaSeleccionado)) {
					tipomaquinaempresaTemp=tipomaquinaempresaAux;
					break;
				}
			}

			if(tipomaquinaempresaTemp!=null) {
				jComboBoxid_tipo_merma_empresaProductoProduMaquinaGenerico.setSelectedItem(tipomaquinaempresaTemp);
			} else {
				if(jComboBoxid_tipo_merma_empresaProductoProduMaquinaGenerico!=null && jComboBoxid_tipo_merma_empresaProductoProduMaquinaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_merma_empresaProductoProduMaquinaGenerico.setSelectedIndex(0);
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

					if(this.productoprodumaquina!=null) {
						this.productoprodumaquina.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
						this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadProductoProduMaquina.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
						if(this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadProductoProduMaquina!=null) {
						jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadProductoProduMaquina!=null) {
							//jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadProductoProduMaquinaGenerico)throws Exception
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
				jComboBoxid_unidadProductoProduMaquinaGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadProductoProduMaquinaGenerico!=null && jComboBoxid_unidadProductoProduMaquinaGenerico.getItemCount()>0) {
					jComboBoxid_unidadProductoProduMaquinaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoDefiProduForeignKey(ProductoProduMaquina productoprodumaquina,JComboBox jComboBoxid_producto_defi_produProductoProduMaquinaGenerico)throws Exception
	{
		try
		{
			ProductoDefiProdu  productodefiproduAux=new ProductoDefiProdu();

			if(jComboBoxid_producto_defi_produProductoProduMaquinaGenerico==null) {
				productodefiproduAux=(ProductoDefiProdu)this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.getSelectedItem();
			} else {
				productodefiproduAux=(ProductoDefiProdu)jComboBoxid_producto_defi_produProductoProduMaquinaGenerico.getSelectedItem();
			}

			if(productodefiproduAux!=null && productodefiproduAux.getId()!=null) {
				productoprodumaquina.setid_producto_defi_produ(productodefiproduAux.getId());
				productoprodumaquina.setproductodefiprodu_descripcion(ProductoProduMaquinaConstantesFunciones.getProductoDefiProduDescripcion(productodefiproduAux));
				productoprodumaquina.setProductoDefiProdu(productodefiproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoAreaEmpresaProduForeignKey(ProductoProduMaquina productoprodumaquina,JComboBox jComboBoxid_tipo_area_empresa_produProductoProduMaquinaGenerico)throws Exception
	{
		try
		{
			TipoAreaEmpresaProdu  tipoareaempresaproduAux=new TipoAreaEmpresaProdu();

			if(jComboBoxid_tipo_area_empresa_produProductoProduMaquinaGenerico==null) {
				tipoareaempresaproduAux=(TipoAreaEmpresaProdu)this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.getSelectedItem();
			} else {
				tipoareaempresaproduAux=(TipoAreaEmpresaProdu)jComboBoxid_tipo_area_empresa_produProductoProduMaquinaGenerico.getSelectedItem();
			}

			if(tipoareaempresaproduAux!=null && tipoareaempresaproduAux.getId()!=null) {
				productoprodumaquina.setid_tipo_area_empresa_produ(tipoareaempresaproduAux.getId());
				productoprodumaquina.settipoareaempresaprodu_descripcion(ProductoProduMaquinaConstantesFunciones.getTipoAreaEmpresaProduDescripcion(tipoareaempresaproduAux));
				productoprodumaquina.setTipoAreaEmpresaProdu(tipoareaempresaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProcesoEmpresaProduForeignKey(ProductoProduMaquina productoprodumaquina,JComboBox jComboBoxid_tipo_proceso_empresa_produProductoProduMaquinaGenerico)throws Exception
	{
		try
		{
			TipoProcesoEmpresaProdu  tipoprocesoempresaproduAux=new TipoProcesoEmpresaProdu();

			if(jComboBoxid_tipo_proceso_empresa_produProductoProduMaquinaGenerico==null) {
				tipoprocesoempresaproduAux=(TipoProcesoEmpresaProdu)this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.getSelectedItem();
			} else {
				tipoprocesoempresaproduAux=(TipoProcesoEmpresaProdu)jComboBoxid_tipo_proceso_empresa_produProductoProduMaquinaGenerico.getSelectedItem();
			}

			if(tipoprocesoempresaproduAux!=null && tipoprocesoempresaproduAux.getId()!=null) {
				productoprodumaquina.setid_tipo_proceso_empresa_produ(tipoprocesoempresaproduAux.getId());
				productoprodumaquina.settipoprocesoempresaprodu_descripcion(ProductoProduMaquinaConstantesFunciones.getTipoProcesoEmpresaProduDescripcion(tipoprocesoempresaproduAux));
				productoprodumaquina.setTipoProcesoEmpresaProdu(tipoprocesoempresaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMaquinaEmpresaForeignKey(ProductoProduMaquina productoprodumaquina,JComboBox jComboBoxid_tipo_merma_empresaProductoProduMaquinaGenerico)throws Exception
	{
		try
		{
			TipoMaquinaEmpresa  tipomaquinaempresaAux=new TipoMaquinaEmpresa();

			if(jComboBoxid_tipo_merma_empresaProductoProduMaquinaGenerico==null) {
				tipomaquinaempresaAux=(TipoMaquinaEmpresa)this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.getSelectedItem();
			} else {
				tipomaquinaempresaAux=(TipoMaquinaEmpresa)jComboBoxid_tipo_merma_empresaProductoProduMaquinaGenerico.getSelectedItem();
			}

			if(tipomaquinaempresaAux!=null && tipomaquinaempresaAux.getId()!=null) {
				productoprodumaquina.setid_tipo_merma_empresa(tipomaquinaempresaAux.getId());
				productoprodumaquina.settipomaquinaempresa_descripcion(ProductoProduMaquinaConstantesFunciones.getTipoMaquinaEmpresaDescripcion(tipomaquinaempresaAux));
				productoprodumaquina.setTipoMaquinaEmpresa(tipomaquinaempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ProductoProduMaquina productoprodumaquina,JComboBox jComboBoxid_unidadProductoProduMaquinaGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadProductoProduMaquinaGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadProductoProduMaquinaGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				productoprodumaquina.setid_unidad(unidadAux.getId());
				productoprodumaquina.setunidad_descripcion(ProductoProduMaquinaConstantesFunciones.getUnidadDescripcion(unidadAux));
				productoprodumaquina.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductoDefiProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProductoDefiProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { 
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.removeAllItems();

							for(ProductoDefiProdu productodefiprodu:this.productodefiprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.addItem(productodefiprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { 
					}

					if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProductoDefiProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.removeAllItems();

							for(ProductoDefiProdu productodefiprodu:this.productodefiprodusForeignKey) {
								this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.addItem(productodefiprodu);
							}
						}

						if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoAreaEmpresaProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoAreaEmpresaProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { 
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.removeAllItems();

							for(TipoAreaEmpresaProdu tipoareaempresaprodu:this.tipoareaempresaprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.addItem(tipoareaempresaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { 
					}

					if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoAreaEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.removeAllItems();

							for(TipoAreaEmpresaProdu tipoareaempresaprodu:this.tipoareaempresaprodusForeignKey) {
								this.jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.addItem(tipoareaempresaprodu);
							}
						}

						if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoProcesoEmpresaProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoProcesoEmpresaProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { 
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.removeAllItems();

							for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:this.tipoprocesoempresaprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.addItem(tipoprocesoempresaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { 
					}

					if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProcesoEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.removeAllItems();

							for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:this.tipoprocesoempresaprodusForeignKey) {
								this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.addItem(tipoprocesoempresaprodu);
							}
						}

						if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMaquinaEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMaquinaEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { 
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.removeAllItems();

							for(TipoMaquinaEmpresa tipomaquinaempresa:this.tipomaquinaempresasForeignKey) {
								this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.addItem(tipomaquinaempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { 
					}

					if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoMaquinaEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.removeAllItems();

							for(TipoMaquinaEmpresa tipomaquinaempresa:this.tipomaquinaempresasForeignKey) {
								this.jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.addItem(tipomaquinaempresa);
							}
						}

						if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { 
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { 
					}

					if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.addItem(unidad);
							}
						}

						if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameProductoDefiProduForeignKey(ProductoDefiProdu productodefiprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.setSelectedItem(productodefiprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setSelectedItem(productodefiprodu);
						} else {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoAreaEmpresaProduForeignKey(TipoAreaEmpresaProdu tipoareaempresaprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setSelectedItem(tipoareaempresaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setSelectedItem(tipoareaempresaprodu);
						} else {
							this.jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoProcesoEmpresaProduForeignKey(TipoProcesoEmpresaProdu tipoprocesoempresaprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setSelectedItem(tipoprocesoempresaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setSelectedItem(tipoprocesoempresaprodu);
						} else {
							this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoMaquinaEmpresaForeignKey(TipoMaquinaEmpresa tipomaquinaempresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.setSelectedItem(tipomaquinaempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setSelectedItem(tipomaquinaempresa);
						} else {
							this.jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoProduMaquina() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoProduMaquinaConstantesFunciones.refrescarForeignKeysDescripcionesProductoProduMaquina(this.productoprodumaquinaLogic.getProductoProduMaquinas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoProduMaquinaConstantesFunciones.refrescarForeignKeysDescripcionesProductoProduMaquina(this.productoprodumaquinas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(ProductoDefiProdu.class));
		classes.add(new Classe(TipoAreaEmpresaProdu.class));
		classes.add(new Classe(TipoProcesoEmpresaProdu.class));
		classes.add(new Classe(TipoMaquinaEmpresa.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoprodumaquinaLogic.setProductoProduMaquinas(this.productoprodumaquinas);
			productoprodumaquinaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoProduMaquinaParameterReturnGeneral getProductoProduMaquinaParameterGeneral() {
		return this.productoprodumaquinaParameterGeneral;
	}
	
	public void setProductoProduMaquinaParameterGeneral(ProductoProduMaquinaParameterReturnGeneral productoprodumaquinaParameterGeneral) {
		this.productoprodumaquinaParameterGeneral = productoprodumaquinaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoProduMaquina() {
		return isPermisoTodoProductoProduMaquina;
	}

	public void setIsPermisoTodoProductoProduMaquina(Boolean isPermisoTodoProductoProduMaquina) {
		this.isPermisoTodoProductoProduMaquina = isPermisoTodoProductoProduMaquina;
	}

	public Boolean getIsPermisoNuevoProductoProduMaquina() {
		return isPermisoNuevoProductoProduMaquina;
	}

	public void setIsPermisoNuevoProductoProduMaquina(Boolean isPermisoNuevoProductoProduMaquina) {
		this.isPermisoNuevoProductoProduMaquina = isPermisoNuevoProductoProduMaquina;
	}

	public Boolean getIsPermisoActualizarProductoProduMaquina() {
		return isPermisoActualizarProductoProduMaquina;
	}

	public void setIsPermisoActualizarProductoProduMaquina(Boolean isPermisoActualizarProductoProduMaquina) {
		this.isPermisoActualizarProductoProduMaquina = isPermisoActualizarProductoProduMaquina;
	}

	public Boolean getIsPermisoEliminarProductoProduMaquina() {
		return isPermisoEliminarProductoProduMaquina;
	}

	public void setIsPermisoEliminarProductoProduMaquina(Boolean isPermisoEliminarProductoProduMaquina) {
		this.isPermisoEliminarProductoProduMaquina = isPermisoEliminarProductoProduMaquina;
	}

	public Boolean getIsPermisoGuardarCambiosProductoProduMaquina() {
		return isPermisoGuardarCambiosProductoProduMaquina;
	}

	public void setIsPermisoGuardarCambiosProductoProduMaquina(Boolean isPermisoGuardarCambiosProductoProduMaquina) {
		this.isPermisoGuardarCambiosProductoProduMaquina = isPermisoGuardarCambiosProductoProduMaquina;
	}
	
	public Boolean getIsPermisoConsultaProductoProduMaquina() {
		return isPermisoConsultaProductoProduMaquina;
	}

	public void setIsPermisoConsultaProductoProduMaquina(Boolean isPermisoConsultaProductoProduMaquina) {
		this.isPermisoConsultaProductoProduMaquina = isPermisoConsultaProductoProduMaquina;
	}

	public Boolean getIsPermisoBusquedaProductoProduMaquina() {
		return isPermisoBusquedaProductoProduMaquina;
	}

	public void setIsPermisoBusquedaProductoProduMaquina(Boolean isPermisoBusquedaProductoProduMaquina) {
		this.isPermisoBusquedaProductoProduMaquina = isPermisoBusquedaProductoProduMaquina;
	}

	public Boolean getIsPermisoReporteProductoProduMaquina() {
		return isPermisoReporteProductoProduMaquina;
	}

	public void setIsPermisoReporteProductoProduMaquina(Boolean isPermisoReporteProductoProduMaquina) {
		this.isPermisoReporteProductoProduMaquina = isPermisoReporteProductoProduMaquina;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoProduMaquina() {
		return isPermisoPaginacionMedioProductoProduMaquina;
	}

	public void setIsPermisoPaginacionMedioProductoProduMaquina(Boolean isPermisoPaginacionMedioProductoProduMaquina) {
		this.isPermisoPaginacionMedioProductoProduMaquina = isPermisoPaginacionMedioProductoProduMaquina;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoProduMaquina() {
		return isPermisoPaginacionTodoProductoProduMaquina;
	}

	public void setIsPermisoPaginacionTodoProductoProduMaquina(Boolean isPermisoPaginacionTodoProductoProduMaquina) {
		this.isPermisoPaginacionTodoProductoProduMaquina = isPermisoPaginacionTodoProductoProduMaquina;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoProduMaquina() {
		return isPermisoPaginacionAltoProductoProduMaquina;
	}

	public void setIsPermisoPaginacionAltoProductoProduMaquina(Boolean isPermisoPaginacionAltoProductoProduMaquina) {
		this.isPermisoPaginacionAltoProductoProduMaquina = isPermisoPaginacionAltoProductoProduMaquina;
	}
	
	public Boolean getIsPermisoCopiarProductoProduMaquina() {
		return isPermisoCopiarProductoProduMaquina;
	}

	public void setIsPermisoCopiarProductoProduMaquina(Boolean isPermisoCopiarProductoProduMaquina) {
		this.isPermisoCopiarProductoProduMaquina = isPermisoCopiarProductoProduMaquina;
	}
	
	public Boolean getIsPermisoVerFormProductoProduMaquina() {
		return isPermisoVerFormProductoProduMaquina;
	}

	public void setIsPermisoVerFormProductoProduMaquina(Boolean isPermisoVerFormProductoProduMaquina) {
		this.isPermisoVerFormProductoProduMaquina = isPermisoVerFormProductoProduMaquina;
	}
	
	public Boolean getIsPermisoDuplicarProductoProduMaquina() {
		return isPermisoDuplicarProductoProduMaquina;
	}

	public void setIsPermisoDuplicarProductoProduMaquina(Boolean isPermisoDuplicarProductoProduMaquina) {
		this.isPermisoDuplicarProductoProduMaquina = isPermisoDuplicarProductoProduMaquina;
	}
	
	public Boolean getIsPermisoOrdenProductoProduMaquina() {
		return isPermisoOrdenProductoProduMaquina;
	}

	public void setIsPermisoOrdenProductoProduMaquina(Boolean isPermisoOrdenProductoProduMaquina) {
		this.isPermisoOrdenProductoProduMaquina = isPermisoOrdenProductoProduMaquina;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoProduMaquina() {
		return isVisibilidadCeldaNuevoProductoProduMaquina;
	}

	public void setIsVisibilidadCeldaNuevoProductoProduMaquina(Boolean isVisibilidadCeldaNuevoProductoProduMaquina) {
		this.isVisibilidadCeldaNuevoProductoProduMaquina = isVisibilidadCeldaNuevoProductoProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoProduMaquina() {
		return isVisibilidadCeldaDuplicarProductoProduMaquina;
	}

	public void setIsVisibilidadCeldaDuplicarProductoProduMaquina(Boolean isVisibilidadCeldaDuplicarProductoProduMaquina) {
		this.isVisibilidadCeldaDuplicarProductoProduMaquina = isVisibilidadCeldaDuplicarProductoProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoProduMaquina() {
		return isVisibilidadCeldaCopiarProductoProduMaquina;
	}

	public void setIsVisibilidadCeldaCopiarProductoProduMaquina(Boolean isVisibilidadCeldaCopiarProductoProduMaquina) {
		this.isVisibilidadCeldaCopiarProductoProduMaquina = isVisibilidadCeldaCopiarProductoProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoProduMaquina() {
		return isVisibilidadCeldaVerFormProductoProduMaquina;
	}

	public void setIsVisibilidadCeldaVerFormProductoProduMaquina(Boolean isVisibilidadCeldaVerFormProductoProduMaquina) {
		this.isVisibilidadCeldaVerFormProductoProduMaquina = isVisibilidadCeldaVerFormProductoProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoProduMaquina() {
		return isVisibilidadCeldaOrdenProductoProduMaquina;
	}

	public void setIsVisibilidadCeldaOrdenProductoProduMaquina(Boolean isVisibilidadCeldaOrdenProductoProduMaquina) {
		this.isVisibilidadCeldaOrdenProductoProduMaquina = isVisibilidadCeldaOrdenProductoProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoProduMaquina() {
		return isVisibilidadCeldaNuevoRelacionesProductoProduMaquina;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoProduMaquina(Boolean isVisibilidadCeldaNuevoRelacionesProductoProduMaquina) {
		this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina = isVisibilidadCeldaNuevoRelacionesProductoProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoProduMaquina() {
		return isVisibilidadCeldaModificarProductoProduMaquina;
	}

	public void setIsVisibilidadCeldaModificarProductoProduMaquina(Boolean isVisibilidadCeldaModificarProductoProduMaquina) {
		this.isVisibilidadCeldaModificarProductoProduMaquina = isVisibilidadCeldaModificarProductoProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoProduMaquina() {
		return isVisibilidadCeldaActualizarProductoProduMaquina;
	}

	public void setIsVisibilidadCeldaActualizarProductoProduMaquina(Boolean isVisibilidadCeldaActualizarProductoProduMaquina) {
		this.isVisibilidadCeldaActualizarProductoProduMaquina = isVisibilidadCeldaActualizarProductoProduMaquina;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoProduMaquina() {
		return isVisibilidadCeldaEliminarProductoProduMaquina;
	}

	public void setIsVisibilidadCeldaEliminarProductoProduMaquina(Boolean isVisibilidadCeldaEliminarProductoProduMaquina) {
		this.isVisibilidadCeldaEliminarProductoProduMaquina = isVisibilidadCeldaEliminarProductoProduMaquina;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoProduMaquina() {
		return isVisibilidadCeldaCancelarProductoProduMaquina;
	}

	public void setIsVisibilidadCeldaCancelarProductoProduMaquina(Boolean isVisibilidadCeldaCancelarProductoProduMaquina) {
		this.isVisibilidadCeldaCancelarProductoProduMaquina = isVisibilidadCeldaCancelarProductoProduMaquina;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoProduMaquina() {
		return isVisibilidadCeldaGuardarProductoProduMaquina;
	}

	public void setIsVisibilidadCeldaGuardarProductoProduMaquina(Boolean isVisibilidadCeldaGuardarProductoProduMaquina) {
		this.isVisibilidadCeldaGuardarProductoProduMaquina = isVisibilidadCeldaGuardarProductoProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoProduMaquina() {
		return isVisibilidadCeldaGuardarCambiosProductoProduMaquina;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoProduMaquina(Boolean isVisibilidadCeldaGuardarCambiosProductoProduMaquina) {
		this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina = isVisibilidadCeldaGuardarCambiosProductoProduMaquina;
	}
		
	public ProductoProduMaquinaSessionBean getproductoprodumaquinaSessionBean() {
		return this.productoprodumaquinaSessionBean;
	}
	
	public void setproductoprodumaquinaSessionBean(ProductoProduMaquinaSessionBean productoprodumaquinaSessionBean) {
		this.productoprodumaquinaSessionBean=productoprodumaquinaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdProductoDefiProdu() {
		return this.isVisibilidadFK_IdProductoDefiProdu;
	}

	public void setisVisibilidadFK_IdProductoDefiProdu(Boolean isVisibilidadFK_IdProductoDefiProdu) {
		this.isVisibilidadFK_IdProductoDefiProdu=isVisibilidadFK_IdProductoDefiProdu;
	}

	public Boolean getisVisibilidadFK_IdTipoAreaEmpresaProdu() {
		return this.isVisibilidadFK_IdTipoAreaEmpresaProdu;
	}

	public void setisVisibilidadFK_IdTipoAreaEmpresaProdu(Boolean isVisibilidadFK_IdTipoAreaEmpresaProdu) {
		this.isVisibilidadFK_IdTipoAreaEmpresaProdu=isVisibilidadFK_IdTipoAreaEmpresaProdu;
	}

	public Boolean getisVisibilidadFK_IdTipoMaquinaEmpresa() {
		return this.isVisibilidadFK_IdTipoMaquinaEmpresa;
	}

	public void setisVisibilidadFK_IdTipoMaquinaEmpresa(Boolean isVisibilidadFK_IdTipoMaquinaEmpresa) {
		this.isVisibilidadFK_IdTipoMaquinaEmpresa=isVisibilidadFK_IdTipoMaquinaEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoProcesoEmpresaProdu() {
		return this.isVisibilidadFK_IdTipoProcesoEmpresaProdu;
	}

	public void setisVisibilidadFK_IdTipoProcesoEmpresaProdu(Boolean isVisibilidadFK_IdTipoProcesoEmpresaProdu) {
		this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isVisibilidadFK_IdTipoProcesoEmpresaProdu;
	}

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(ProductoProduMaquina productoprodumaquina)throws Exception {
		try {
			
				this.setActualParaGuardarProductoDefiProduForeignKey(productoprodumaquina,null);
				this.setActualParaGuardarTipoAreaEmpresaProduForeignKey(productoprodumaquina,null);
				this.setActualParaGuardarTipoProcesoEmpresaProduForeignKey(productoprodumaquina,null);
				this.setActualParaGuardarTipoMaquinaEmpresaForeignKey(productoprodumaquina,null);
				this.setActualParaGuardarUnidadForeignKey(productoprodumaquina,null);
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
	
	public void bugActualizarReferenciaActual(ProductoProduMaquina productoprodumaquina,ProductoProduMaquina productoprodumaquinaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoProduMaquina(productoprodumaquina);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoprodumaquinaAux.setId(productoprodumaquina.getId());
		productoprodumaquinaAux.setVersionRow(productoprodumaquina.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoProduMaquina();
		
			int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoprodumaquinaValidator.getInvalidValues(this.productoprodumaquina);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoprodumaquinaLogic.setDatosCliente(datosCliente);
			productoprodumaquinaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoprodumaquinaAux=new  ProductoProduMaquina();
				
				productoprodumaquinaAux.setIsNew(true);
				productoprodumaquinaAux.setIsChanged(true);
				
				productoprodumaquinaAux.setProductoProduMaquinaOriginal(this.productoprodumaquina);
				
				productoprodumaquinaAux.setId(this.productoprodumaquina.getId());	
				productoprodumaquinaAux.setVersionRow(this.productoprodumaquina.getVersionRow());	
				productoprodumaquinaAux.setid_producto_defi_produ(this.productoprodumaquina.getid_producto_defi_produ());	
				productoprodumaquinaAux.setid_tipo_area_empresa_produ(this.productoprodumaquina.getid_tipo_area_empresa_produ());	
				productoprodumaquinaAux.setid_tipo_proceso_empresa_produ(this.productoprodumaquina.getid_tipo_proceso_empresa_produ());	
				productoprodumaquinaAux.setid_tipo_merma_empresa(this.productoprodumaquina.getid_tipo_merma_empresa());	
				productoprodumaquinaAux.setid_unidad(this.productoprodumaquina.getid_unidad());	
				productoprodumaquinaAux.setcantidad(this.productoprodumaquina.getcantidad());	
				productoprodumaquinaAux.setcosto(this.productoprodumaquina.getcosto());	
				productoprodumaquinaAux.setcosto_total(this.productoprodumaquina.getcosto_total());	
				productoprodumaquinaAux.setdescripcion(this.productoprodumaquina.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoprodumaquinaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoprodumaquinaAux,productoprodumaquinaLogic.getProductoProduMaquinas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodumaquinaAux,productoprodumaquinas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinaLogic.saveProductoProduMaquinas();//WithConnection
						//productoprodumaquinaLogic.getSetVersionRowProductoProduMaquinas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoprodumaquina,productoprodumaquinaAux);
					
					this.refrescarForeignKeysDescripcionesProductoProduMaquina();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoprodumaquinaLogic.saveProductoProduMaquinaRelaciones(productoprodumaquinaAux);//WithConnection
								//productoprodumaquinaLogic.getSetVersionRowProductoProduMaquinas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoprodumaquina,productoprodumaquinaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoprodumaquinaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoprodumaquinaAux,productoprodumaquinaLogic.getProductoProduMaquinas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoprodumaquinaAux,productoprodumaquinas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoprodumaquina,productoprodumaquinaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoprodumaquinaAux=new  ProductoProduMaquina();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() 
					|| (this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() && this.productoprodumaquina.getId()>=0)) {
						
					productoprodumaquinaAux.setIsNew(false);
				}
				
				productoprodumaquinaAux.setIsDeleted(false);
			
				productoprodumaquinaAux.setId(this.productoprodumaquina.getId());	
				productoprodumaquinaAux.setVersionRow(this.productoprodumaquina.getVersionRow());	
				productoprodumaquinaAux.setid_producto_defi_produ(this.productoprodumaquina.getid_producto_defi_produ());	
				productoprodumaquinaAux.setid_tipo_area_empresa_produ(this.productoprodumaquina.getid_tipo_area_empresa_produ());	
				productoprodumaquinaAux.setid_tipo_proceso_empresa_produ(this.productoprodumaquina.getid_tipo_proceso_empresa_produ());	
				productoprodumaquinaAux.setid_tipo_merma_empresa(this.productoprodumaquina.getid_tipo_merma_empresa());	
				productoprodumaquinaAux.setid_unidad(this.productoprodumaquina.getid_unidad());	
				productoprodumaquinaAux.setcantidad(this.productoprodumaquina.getcantidad());	
				productoprodumaquinaAux.setcosto(this.productoprodumaquina.getcosto());	
				productoprodumaquinaAux.setcosto_total(this.productoprodumaquina.getcosto_total());	
				productoprodumaquinaAux.setdescripcion(this.productoprodumaquina.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoprodumaquinaAux,productoprodumaquinaLogic.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodumaquinaAux,productoprodumaquinas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinaLogic.saveProductoProduMaquinas();//WithConnection
						//productoprodumaquinaLogic.getSetVersionRowProductoProduMaquinas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoprodumaquina,productoprodumaquinaAux);
					
					this.refrescarForeignKeysDescripcionesProductoProduMaquina();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoprodumaquinaLogic.saveProductoProduMaquinaRelaciones(productoprodumaquinaAux);//WithConnection
								//productoprodumaquinaLogic.getSetVersionRowProductoProduMaquinas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoprodumaquina,productoprodumaquinaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoprodumaquinaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoprodumaquinaAux,productoprodumaquinaLogic.getProductoProduMaquinas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoprodumaquinaAux,productoprodumaquinas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoprodumaquina,productoprodumaquinaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoprodumaquinaAux=new  ProductoProduMaquina();
				
				productoprodumaquinaAux.setIsNew(false);
				productoprodumaquinaAux.setIsChanged(false);
				
				productoprodumaquinaAux.setIsDeleted(true);
				
				productoprodumaquinaAux.setId(this.productoprodumaquina.getId());	
				productoprodumaquinaAux.setVersionRow(this.productoprodumaquina.getVersionRow());	
				productoprodumaquinaAux.setid_producto_defi_produ(this.productoprodumaquina.getid_producto_defi_produ());	
				productoprodumaquinaAux.setid_tipo_area_empresa_produ(this.productoprodumaquina.getid_tipo_area_empresa_produ());	
				productoprodumaquinaAux.setid_tipo_proceso_empresa_produ(this.productoprodumaquina.getid_tipo_proceso_empresa_produ());	
				productoprodumaquinaAux.setid_tipo_merma_empresa(this.productoprodumaquina.getid_tipo_merma_empresa());	
				productoprodumaquinaAux.setid_unidad(this.productoprodumaquina.getid_unidad());	
				productoprodumaquinaAux.setcantidad(this.productoprodumaquina.getcantidad());	
				productoprodumaquinaAux.setcosto(this.productoprodumaquina.getcosto());	
				productoprodumaquinaAux.setcosto_total(this.productoprodumaquina.getcosto_total());	
				productoprodumaquinaAux.setdescripcion(this.productoprodumaquina.getdescripcion());	
				
				if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoprodumaquinaAux.getId()>=0) {	
						this.productoprodumaquinasEliminados.add(productoprodumaquinaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoprodumaquinaAux,productoprodumaquinaLogic.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodumaquinaAux,productoprodumaquinas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinaLogic.saveProductoProduMaquinas();//WithConnection
						//productoprodumaquinaLogic.getSetVersionRowProductoProduMaquinas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoprodumaquinaLogic.saveProductoProduMaquinaRelaciones(productoprodumaquinaAux);//WithConnection
								//productoprodumaquinaLogic.getSetVersionRowProductoProduMaquinas();//WithConnection
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
							if(this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoprodumaquinaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoprodumaquinaAux,productoprodumaquinaLogic.getProductoProduMaquinas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoprodumaquinaAux,productoprodumaquinas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.getProductoProduMaquinas().addAll(this.productoprodumaquinasEliminados);
					
					productoprodumaquinaLogic.saveProductoProduMaquinas();//WithConnection
					//productoprodumaquinaLogic.getSetVersionRowProductoProduMaquinas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoProduMaquina();
				
				this.productoprodumaquinasEliminados= new ArrayList<ProductoProduMaquina>();		
			}
			
			if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Producto Maquina Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Producto Maquina Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoprodumaquina=productoprodumaquinaAux;
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
      		//this.finishProcessProductoProduMaquina();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoProduMaquina productoprodumaquinaLocal) throws Exception {
		
		if(this.productoprodumaquinaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoProduMaquina productoprodumaquinaLocal) throws Exception {	
		if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ProductoDefiProduDetalleFormJInternalFrame.class)) {
				ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrameLocal=(ProductoDefiProduBeanSwingJInternalFrame) ((ProductoDefiProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productodefiproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProductoDefiProdu(productodefiproduBeanSwingJInternalFrameLocal.getproductodefiprodu(),true);
				productodefiproduBeanSwingJInternalFrameLocal.actualizarLista(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu,this.productodefiprodusForeignKey);

				productodefiproduBeanSwingJInternalFrameLocal.actualizarRelaciones(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu);

				productoprodumaquinaLocal.setProductoDefiProdu(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu);

				this.addItemDefectoCombosForeignKeyProductoDefiProdu();
				this.cargarCombosFrameProductoDefiProdusForeignKey("Formulario");
				this.setActualProductoDefiProduForeignKey(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoAreaEmpresaProduDetalleFormJInternalFrame.class)) {
				TipoAreaEmpresaProduBeanSwingJInternalFrame tipoareaempresaproduBeanSwingJInternalFrameLocal=(TipoAreaEmpresaProduBeanSwingJInternalFrame) ((TipoAreaEmpresaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoareaempresaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoAreaEmpresaProdu(tipoareaempresaproduBeanSwingJInternalFrameLocal.gettipoareaempresaprodu(),true);
				tipoareaempresaproduBeanSwingJInternalFrameLocal.actualizarLista(tipoareaempresaproduBeanSwingJInternalFrameLocal.tipoareaempresaprodu,this.tipoareaempresaprodusForeignKey);

				tipoareaempresaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoareaempresaproduBeanSwingJInternalFrameLocal.tipoareaempresaprodu);

				productoprodumaquinaLocal.setTipoAreaEmpresaProdu(tipoareaempresaproduBeanSwingJInternalFrameLocal.tipoareaempresaprodu);

				this.addItemDefectoCombosForeignKeyTipoAreaEmpresaProdu();
				this.cargarCombosFrameTipoAreaEmpresaProdusForeignKey("Formulario");
				this.setActualTipoAreaEmpresaProduForeignKey(tipoareaempresaproduBeanSwingJInternalFrameLocal.tipoareaempresaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProcesoEmpresaProduDetalleFormJInternalFrame.class)) {
				TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrameLocal=(TipoProcesoEmpresaProduBeanSwingJInternalFrame) ((TipoProcesoEmpresaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprocesoempresaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProcesoEmpresaProdu(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.gettipoprocesoempresaprodu(),true);
				tipoprocesoempresaproduBeanSwingJInternalFrameLocal.actualizarLista(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu,this.tipoprocesoempresaprodusForeignKey);

				tipoprocesoempresaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu);

				productoprodumaquinaLocal.setTipoProcesoEmpresaProdu(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu);

				this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
				this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey("Formulario");
				this.setActualTipoProcesoEmpresaProduForeignKey(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMaquinaEmpresaDetalleFormJInternalFrame.class)) {
				TipoMaquinaEmpresaBeanSwingJInternalFrame tipomaquinaempresaBeanSwingJInternalFrameLocal=(TipoMaquinaEmpresaBeanSwingJInternalFrame) ((TipoMaquinaEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomaquinaempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMaquinaEmpresa(tipomaquinaempresaBeanSwingJInternalFrameLocal.gettipomaquinaempresa(),true);
				tipomaquinaempresaBeanSwingJInternalFrameLocal.actualizarLista(tipomaquinaempresaBeanSwingJInternalFrameLocal.tipomaquinaempresa,this.tipomaquinaempresasForeignKey);

				tipomaquinaempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomaquinaempresaBeanSwingJInternalFrameLocal.tipomaquinaempresa);

				productoprodumaquinaLocal.setTipoMaquinaEmpresa(tipomaquinaempresaBeanSwingJInternalFrameLocal.tipomaquinaempresa);

				this.addItemDefectoCombosForeignKeyTipoMaquinaEmpresa();
				this.cargarCombosFrameTipoMaquinaEmpresasForeignKey("Formulario");
				this.setActualTipoMaquinaEmpresaForeignKey(tipomaquinaempresaBeanSwingJInternalFrameLocal.tipomaquinaempresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				productoprodumaquinaLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoProduMaquinaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoprodumaquinaValidator.getInvalidValues(this.productoprodumaquina);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoProduMaquina productoprodumaquina,List<ProductoProduMaquina> productoprodumaquinas) throws Exception {
		try	{		
			ProductoProduMaquinaConstantesFunciones.actualizarLista(productoprodumaquina,productoprodumaquinas,this.productoprodumaquinaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoProduMaquina productoprodumaquina,List<ProductoProduMaquina> productoprodumaquinas) throws Exception {
		try	{			
			ProductoProduMaquinaConstantesFunciones.actualizarSelectedLista(productoprodumaquina,productoprodumaquinas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoProduMaquina> productoprodumaquinasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoprodumaquinasLocal=this.productoprodumaquinaLogic.getProductoProduMaquinas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoprodumaquinasLocal=this.productoprodumaquinas;
			}
			//ARCHITECTURE
		
			for(ProductoProduMaquina productoprodumaquinaLocal:productoprodumaquinasLocal) {
				if(this.permiteMantenimiento(productoprodumaquinaLocal) && productoprodumaquinaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoProduMaquinaConstantesFunciones.getProductoProduMaquinaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoProduMaquinaConstantesFunciones.IDPRODUCTODEFIPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelid_producto_defi_produProductoProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMaquinaConstantesFunciones.IDTIPOAREAEMPRESAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelid_tipo_area_empresa_produProductoProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMaquinaConstantesFunciones.IDTIPOPROCESOEMPRESAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelid_tipo_proceso_empresa_produProductoProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMaquinaConstantesFunciones.IDTIPOMAQUINAEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelid_tipo_merma_empresaProductoProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMaquinaConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelid_unidadProductoProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMaquinaConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelcantidadProductoProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMaquinaConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelcostoProductoProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMaquinaConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelcosto_totalProductoProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduMaquinaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabeldescripcionProductoProduMaquina,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelid_producto_defi_produProductoProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelid_tipo_area_empresa_produProductoProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelid_tipo_proceso_empresa_produProductoProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelid_tipo_merma_empresaProductoProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelid_unidadProductoProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelcantidadProductoProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelcostoProductoProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelcosto_totalProductoProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProduMaquina.jLabeldescripcionProductoProduMaquina,"");
		
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
		this.iIdNuevoProductoProduMaquina--;	
		
		
		this.productoprodumaquinaAux=new ProductoProduMaquina();
		
		this.productoprodumaquinaAux.setId(this.iIdNuevoProductoProduMaquina);
		this.productoprodumaquinaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoprodumaquinaLogic.getProductoProduMaquinas().add(this.productoprodumaquinaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoprodumaquinas.add(this.productoprodumaquinaAux);
		}
		//ARCHITECTURE
		
		this.productoprodumaquina=this.productoprodumaquinaAux;
		
		if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoProduMaquina(this.productoprodumaquina);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoProduMaquina(this.productoprodumaquina);
		}
				
		//this.setDefaultControlesProductoProduMaquina();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoProduMaquina();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoProduMaquina();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProduMaquina();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoProduMaquina(this.productoprodumaquinaBean,this.productoprodumaquina,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
			classes=ProductoProduMaquinaConstantesFunciones.getClassesRelationshipsOfProductoProduMaquina(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoprodumaquinaReturnGeneral=productoprodumaquinaLogic.procesarEventosProductoProduMaquinasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodumaquinaLogic.getProductoProduMaquinas(),this.productoprodumaquina,this.productoprodumaquinaParameterGeneral,this.isEsNuevoProductoProduMaquina,classes);//this.productoprodumaquinaLogic.getProductoProduMaquina()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoProduMaquina(this.productoprodumaquinaReturnGeneral,this.productoprodumaquinaBean,false);
		
		if(this.productoprodumaquinaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoProduMaquina(this.productoprodumaquinaReturnGeneral.getProductoProduMaquina());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoProduMaquina(this.productoprodumaquinaReturnGeneral.getProductoProduMaquina());
		}
		
		if(this.productoprodumaquinaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoProduMaquina(this.productoprodumaquinaReturnGeneral.getProductoProduMaquina(),classes);//this.productoprodumaquinaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoProduMaquina();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoProduMaquina();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.RecargarFormProductoProduMaquina(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoProduMaquina(false);
						
			if(productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProduMaquina();
			}
			
			this.actualizarVisualTableDatosProductoProduMaquina();
			
			this.jTableDatosProductoProduMaquina.setRowSelectionInterval(this.getIndiceNuevoProductoProduMaquina(), this.getIndiceNuevoProductoProduMaquina());
			
			this.seleccionarFilaTablaProductoProduMaquinaActual();
						
			this.actualizarEstadoCeldasBotonesProductoProduMaquina("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoProduMaquina(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcantidadProductoProduMaquina.setEnabled(isHabilitar && this.productoprodumaquinaConstantesFunciones.activarcantidadProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcostoProductoProduMaquina.setEnabled(isHabilitar && this.productoprodumaquinaConstantesFunciones.activarcostoProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcosto_totalProductoProduMaquina.setEnabled(isHabilitar && this.productoprodumaquinaConstantesFunciones.activarcosto_totalProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jTextAreadescripcionProductoProduMaquina.setEnabled(isHabilitar && this.productoprodumaquinaConstantesFunciones.activardescripcionProductoProduMaquina);	
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.setEnabled(isHabilitar && this.productoprodumaquinaConstantesFunciones.activarid_producto_defi_produProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setEnabled(isHabilitar && this.productoprodumaquinaConstantesFunciones.activarid_tipo_area_empresa_produProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setEnabled(isHabilitar && this.productoprodumaquinaConstantesFunciones.activarid_tipo_proceso_empresa_produProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.setEnabled(isHabilitar && this.productoprodumaquinaConstantesFunciones.activarid_tipo_merma_empresaProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.setEnabled(isHabilitar && this.productoprodumaquinaConstantesFunciones.activarid_unidadProductoProduMaquina);
	};
	
	public void setDefaultControlesProductoProduMaquina() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoProduMaquina(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoprodumaquinaSessionBean.setConGuardarRelaciones(true);			
			this.productoprodumaquinaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoProduMaquina.jTabbedPaneRelacionesProductoProduMaquina.setVisible(true);
			
					
		} else {
			//this.productoprodumaquinaSessionBean.setConGuardarRelaciones(false);			
			this.productoprodumaquinaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoProduMaquina.jTabbedPaneRelacionesProductoProduMaquina.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoProduMaquina() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinaLogic.getProductoProduMaquinas()) {
				if(productoprodumaquinaAux.getId().equals(this.iIdNuevoProductoProduMaquina)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinas) {
				if(productoprodumaquinaAux.getId().equals(this.iIdNuevoProductoProduMaquina)) {
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
	
	public int getIndiceActualProductoProduMaquina(ProductoProduMaquina productoprodumaquina,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinaLogic.getProductoProduMaquinas()) {
				if(productoprodumaquinaAux.getId().equals(productoprodumaquina.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinas) {
				if(productoprodumaquinaAux.getId().equals(productoprodumaquina.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoProduMaquina(ProductoProduMaquina productoprodumaquinaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinaLogic.getProductoProduMaquinas()) {
				if(productoprodumaquinaAux.getProductoProduMaquinaOriginal().getId().equals(productoprodumaquinaOriginal.getId())) {
					existe=true;
					productoprodumaquinaOriginal.setId(productoprodumaquinaAux.getId());
					productoprodumaquinaOriginal.setVersionRow(productoprodumaquinaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinas) {
				if(productoprodumaquinaAux.getProductoProduMaquinaOriginal().getId().equals(productoprodumaquinaOriginal.getId())) {
					existe=true;
					productoprodumaquinaOriginal.setId(productoprodumaquinaAux.getId());
					productoprodumaquinaOriginal.setVersionRow(productoprodumaquinaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoProduMaquina(Boolean esParaCancelar) throws Exception {
		productoprodumaquinasAux=new ArrayList<ProductoProduMaquina>();
		productoprodumaquinaAux=new ProductoProduMaquina();
		
		if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinaLogic.getProductoProduMaquinas()) {
					if(productoprodumaquinaAux.getId()<0) {
						productoprodumaquinasAux.add(productoprodumaquinaAux);
					}		
				}
				this.iIdNuevoProductoProduMaquina=0L;
				this.productoprodumaquinaLogic.getProductoProduMaquinas().removeAll(productoprodumaquinasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinas) {
					if(productoprodumaquinaAux.getId()<0) {
						productoprodumaquinasAux.add(productoprodumaquinaAux);
					}		
				}
				this.iIdNuevoProductoProduMaquina=0L;
				this.productoprodumaquinas.removeAll(productoprodumaquinasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoProduMaquina 
					&& this.productoprodumaquinaLogic.getProductoProduMaquinas().size()>0
					) {
					productoprodumaquinaAux=this.productoprodumaquinaLogic.getProductoProduMaquinas().get(this.productoprodumaquinaLogic.getProductoProduMaquinas().size() - 1);
				
					if(productoprodumaquinaAux.getId()<0) {
						this.productoprodumaquinaLogic.getProductoProduMaquinas().remove(productoprodumaquinaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoProduMaquina && this.productoprodumaquinas.size()>0) {
					productoprodumaquinaAux=this.productoprodumaquinas.get(this.productoprodumaquinas.size() - 1);
				
					if(productoprodumaquinaAux.getId()<0) {
						this.productoprodumaquinas.remove(productoprodumaquinaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoProduMaquina(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoprodumaquina.getId()<0) {
				this.productoprodumaquinaLogic.getProductoProduMaquinas().remove(this.productoprodumaquina);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoprodumaquina.getId()<0) {
				this.productoprodumaquinas.remove(this.productoprodumaquina);
			}
		}			
	}
	
	public void setEstadosInicialesProductoProduMaquina(List<ProductoProduMaquina> productoprodumaquinasAux) throws Exception {
		ProductoProduMaquinaConstantesFunciones.setEstadosInicialesProductoProduMaquina(productoprodumaquinasAux);
	}
	
	public void setEstadosInicialesProductoProduMaquina(ProductoProduMaquina productoprodumaquinaAux) throws Exception {
		ProductoProduMaquinaConstantesFunciones.setEstadosInicialesProductoProduMaquina(productoprodumaquinaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoProduMaquinaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoProduMaquina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoProduMaquinaActual()) {
				if(!this.isEsNuevoProductoProduMaquina) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoProduMaquina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoProduMaquina=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoProduMaquinaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Producto Maquina Produccion ?", "MANTENIMIENTO DE Producto Maquina Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoProduMaquina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoProduMaquina productoprodumaquina) throws Exception {
		ProductoProduMaquinaConstantesFunciones.seleccionarAsignar(this.productoprodumaquina,productoprodumaquina);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoProduMaquina=this.isPermisoActualizarOriginalProductoProduMaquina;
			
			
			this.seleccionarAsignar(productoprodumaquina);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoProduMaquinaConstantesFunciones.quitarEspaciosProductoProduMaquina(this.productoprodumaquina,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoProduMaquina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoprodumaquinaSessionBean.setsFuncionBusquedaRapida(this.productoprodumaquinaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductoProduMaquina) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoProduMaquina(esParaCancelar);				
				this.cancelarNuevoProductoProduMaquina(esParaCancelar);								
			}
			
			this.productoprodumaquina=new ProductoProduMaquina();
			
			this.inicializarProductoProduMaquina();
			
			this.actualizarEstadoCeldasBotonesProductoProduMaquina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoProduMaquina() throws Exception {
		try {
			ProductoProduMaquinaConstantesFunciones.inicializarProductoProduMaquina(this.productoprodumaquina);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoprodumaquinaLogic.getProductoProduMaquinas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoProduMaquinas(String sAccionBusqueda,List<ProductoProduMaquina> productoprodumaquinasParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoProduMaquina"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoProduMaquinaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoProduMaquinaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoProduMaquina"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Producto Maquina Producciones");		
		parameters.put("busquedapor", ProductoProduMaquinaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoProduMaquina=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoProduMaquinaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoProduMaquinaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoProduMaquina=new JRBeanArrayDataSource(ProductoProduMaquinaJInternalFrame.TraerProductoProduMaquinaBeans(productoprodumaquinasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoProduMaquina);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoProduMaquinaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoProduMaquinaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoProduMaquinaBean.TraerProductoProduMaquinaBeans(productoprodumaquinasParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoProduMaquinas(sAccionBusqueda,sTipoArchivoReporte,productoprodumaquinasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoProduMaquinas(sAccionBusqueda,sTipoArchivoReporte,productoprodumaquinasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoProduMaquinaActionPerformed(null);
					//this.generarExcelReporteProductoProduMaquinas(sAccionBusqueda,sTipoArchivoReporte,productoprodumaquinasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoProduMaquinas(sAccionBusqueda,sTipoArchivoReporte,productoprodumaquinasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoProduMaquinas(sAccionBusqueda,sTipoArchivoReporte,productoprodumaquinasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoProduMaquinas(sAccionBusqueda,sTipoArchivoReporte,productoprodumaquinasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoProduMaquinas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProduMaquina> productoprodumaquinasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumaquina";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProduMaquinas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoProduMaquina("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoProduMaquina productoprodumaquina : productoprodumaquinasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoProduMaquinaConstantesFunciones.generarExcelReporteDataProductoProduMaquina("NORMAL",row,workbook,productoprodumaquina,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Maquina Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoProduMaquina(String sTipo,Row row,Workbook workbook) {
		
		ProductoProduMaquinaConstantesFunciones.generarExcelReporteHeaderProductoProduMaquina(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoProduMaquinas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProduMaquina> productoprodumaquinasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumaquina_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProduMaquinas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoProduMaquina productoprodumaquina : productoprodumaquinasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoProduMaquinaConstantesFunciones.getProductoProduMaquinaDescripcion(productoprodumaquina));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumaquina.getproductodefiprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumaquina.gettipoareaempresaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumaquina.gettipoprocesoempresaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumaquina.gettipomaquinaempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumaquina.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumaquina.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMaquinaConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumaquina.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumaquina.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodumaquina.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Maquina Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoProduMaquinas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProduMaquina> productoprodumaquinasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoProduMaquina> productoprodumaquinasRespaldo=null;
		
		classes=ProductoProduMaquinaConstantesFunciones.getClassesRelationshipsOfProductoProduMaquina(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoprodumaquinaLogic.setDatosCliente(this.datosCliente);
		this.productoprodumaquinaLogic.setDatosDeep(this.datosDeep);
		this.productoprodumaquinaLogic.setIsConDeep(true);
		
		productoprodumaquinasRespaldo=this.productoprodumaquinaLogic.getProductoProduMaquinas();
		
		this.productoprodumaquinaLogic.setProductoProduMaquinas(productoprodumaquinasParaReportes);	
		this.productoprodumaquinaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoprodumaquinasParaReportes=this.productoprodumaquinaLogic.getProductoProduMaquinas();
		this.productoprodumaquinaLogic.setProductoProduMaquinas(productoprodumaquinasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumaquina_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProduMaquinas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoProduMaquina("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoProduMaquina productoprodumaquina : productoprodumaquinasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoProduMaquina("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoProduMaquinaConstantesFunciones.generarExcelReporteDataProductoProduMaquina("NORMAL",row,workbook,productoprodumaquina,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoProduMaquinaConstantesFunciones.getProductoProduMaquinaDescripcion(productoprodumaquina));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Maquina Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoProduMaquina() throws Exception {		
		this.startProcessProductoProduMaquina(true);
	}
	
	public void startProcessProductoProduMaquina(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoProduMaquina ,this.jPanelParametrosReportesProductoProduMaquina, this.jScrollPanelDatosProductoProduMaquina,this.jPanelPaginacionProductoProduMaquina, this.jScrollPanelDatosEdicionProductoProduMaquina, this.jPanelAccionesProductoProduMaquina,this.jPanelAccionesFormularioProductoProduMaquina,this.jmenuBarProductoProduMaquina,this.jmenuBarDetalleProductoProduMaquina,this.jTtoolBarProductoProduMaquina,this.jTtoolBarDetalleProductoProduMaquina);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoProduMaquina=this.jTabbedPaneBusquedasProductoProduMaquina; 
		
		final JPanel jPanelParametrosReportesProductoProduMaquina=this.jPanelParametrosReportesProductoProduMaquina;
		//final JScrollPane jScrollPanelDatosProductoProduMaquina=this.jScrollPanelDatosProductoProduMaquina;
		final JTable jTableDatosProductoProduMaquina=this.jTableDatosProductoProduMaquina;		
		final JPanel jPanelPaginacionProductoProduMaquina=this.jPanelPaginacionProductoProduMaquina;
		//final JScrollPane jScrollPanelDatosEdicionProductoProduMaquina=this.jScrollPanelDatosEdicionProductoProduMaquina;
		final JPanel jPanelAccionesProductoProduMaquina=this.jPanelAccionesProductoProduMaquina;
		
		JPanel jPanelCamposAuxiliarProductoProduMaquina=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoProduMaquina=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			jPanelCamposAuxiliarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jPanelCamposProductoProduMaquina;
			jPanelAccionesFormularioAuxiliarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jPanelAccionesFormularioProductoProduMaquina;
		}
		
		final JPanel jPanelCamposProductoProduMaquina=jPanelCamposAuxiliarProductoProduMaquina;
		final JPanel jPanelAccionesFormularioProductoProduMaquina=jPanelAccionesFormularioAuxiliarProductoProduMaquina;
		
		
		final JMenuBar jmenuBarProductoProduMaquina=this.jmenuBarProductoProduMaquina;
		final JToolBar jTtoolBarProductoProduMaquina=this.jTtoolBarProductoProduMaquina;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoProduMaquina=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoProduMaquina=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			jmenuBarDetalleAuxiliarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jmenuBarDetalleProductoProduMaquina;
			jTtoolBarDetalleAuxiliarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jTtoolBarDetalleProductoProduMaquina;
		}
		
		final JMenuBar jmenuBarDetalleProductoProduMaquina=jmenuBarDetalleAuxiliarProductoProduMaquina;
		final JToolBar jTtoolBarDetalleProductoProduMaquina=jTtoolBarDetalleAuxiliarProductoProduMaquina;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoProduMaquina;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoProduMaquina;
			processRunnable.jTableDatos=jTableDatosProductoProduMaquina;
			processRunnable.jPanelCampos=jPanelCamposProductoProduMaquina;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoProduMaquina;
			processRunnable.jPanelAcciones=jPanelAccionesProductoProduMaquina;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoProduMaquina;
			
			
			processRunnable.jmenuBar=jmenuBarProductoProduMaquina;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoProduMaquina;
			processRunnable.jTtoolBar=jTtoolBarProductoProduMaquina;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoProduMaquina;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoProduMaquina ,jPanelParametrosReportesProductoProduMaquina,jTableDatosProductoProduMaquina, /*jScrollPanelDatosProductoProduMaquina,*/jPanelCamposProductoProduMaquina,jPanelPaginacionProductoProduMaquina, /*jScrollPanelDatosEdicionProductoProduMaquina,*/ jPanelAccionesProductoProduMaquina,jPanelAccionesFormularioProductoProduMaquina,jmenuBarProductoProduMaquina,jmenuBarDetalleProductoProduMaquina,jTtoolBarProductoProduMaquina,jTtoolBarDetalleProductoProduMaquina);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoProduMaquina ,jPanelParametrosReportesProductoProduMaquina, jScrollPanelDatosProductoProduMaquina,jPanelPaginacionProductoProduMaquina, jScrollPanelDatosEdicionProductoProduMaquina, jPanelAccionesProductoProduMaquina,jPanelAccionesFormularioProductoProduMaquina,jmenuBarProductoProduMaquina,jmenuBarDetalleProductoProduMaquina,jTtoolBarProductoProduMaquina,jTtoolBarDetalleProductoProduMaquina);
						
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
	
	public void finishProcessProductoProduMaquina() {// throws Exception 
		this.finishProcessProductoProduMaquina(true);
	}
	
	public void finishProcessProductoProduMaquina(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoProduMaquina ,this.jPanelParametrosReportesProductoProduMaquina, this.jScrollPanelDatosProductoProduMaquina,this.jPanelPaginacionProductoProduMaquina, this.jScrollPanelDatosEdicionProductoProduMaquina, this.jPanelAccionesProductoProduMaquina,this.jPanelAccionesFormularioProductoProduMaquina,this.jmenuBarProductoProduMaquina,this.jmenuBarDetalleProductoProduMaquina,this.jTtoolBarProductoProduMaquina,this.jTtoolBarDetalleProductoProduMaquina);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoProduMaquina=this.jTabbedPaneBusquedasProductoProduMaquina; 
		
		final JPanel jPanelParametrosReportesProductoProduMaquina=this.jPanelParametrosReportesProductoProduMaquina;
		//final JScrollPane jScrollPanelDatosProductoProduMaquina=this.jScrollPanelDatosProductoProduMaquina;
		final JTable jTableDatosProductoProduMaquina=this.jTableDatosProductoProduMaquina;		
		final JPanel jPanelPaginacionProductoProduMaquina=this.jPanelPaginacionProductoProduMaquina;
		//final JScrollPane jScrollPanelDatosEdicionProductoProduMaquina=this.jScrollPanelDatosEdicionProductoProduMaquina;
		final JPanel jPanelAccionesProductoProduMaquina=this.jPanelAccionesProductoProduMaquina;
		
		JPanel jPanelCamposAuxiliarProductoProduMaquina=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoProduMaquina=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			jPanelCamposAuxiliarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jPanelCamposProductoProduMaquina;
			jPanelAccionesFormularioAuxiliarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jPanelAccionesFormularioProductoProduMaquina;
		}
		
		final JPanel jPanelCamposProductoProduMaquina=jPanelCamposAuxiliarProductoProduMaquina;
		final JPanel jPanelAccionesFormularioProductoProduMaquina=jPanelAccionesFormularioAuxiliarProductoProduMaquina;
		
		
		final JMenuBar jmenuBarProductoProduMaquina=this.jmenuBarProductoProduMaquina;		
		final JToolBar jTtoolBarProductoProduMaquina=this.jTtoolBarProductoProduMaquina;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoProduMaquina=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoProduMaquina=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			jmenuBarDetalleAuxiliarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jmenuBarDetalleProductoProduMaquina;
			jTtoolBarDetalleAuxiliarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jTtoolBarDetalleProductoProduMaquina;		
		}
		
		final JMenuBar jmenuBarDetalleProductoProduMaquina=jmenuBarDetalleAuxiliarProductoProduMaquina;
		final JToolBar jTtoolBarDetalleProductoProduMaquina=jTtoolBarDetalleAuxiliarProductoProduMaquina;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoProduMaquina;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoProduMaquina;
			processRunnable.jTableDatos=jTableDatosProductoProduMaquina;
			processRunnable.jPanelCampos=jPanelCamposProductoProduMaquina;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoProduMaquina;
			processRunnable.jPanelAcciones=jPanelAccionesProductoProduMaquina;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoProduMaquina;
			
			
			processRunnable.jmenuBar=jmenuBarProductoProduMaquina;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoProduMaquina;
			processRunnable.jTtoolBar=jTtoolBarProductoProduMaquina;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoProduMaquina;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoProduMaquina ,jPanelParametrosReportesProductoProduMaquina, jTableDatosProductoProduMaquina,/*jScrollPanelDatosProductoProduMaquina,*/jPanelCamposProductoProduMaquina,jPanelPaginacionProductoProduMaquina, /*jScrollPanelDatosEdicionProductoProduMaquina,*/ jPanelAccionesProductoProduMaquina,jPanelAccionesFormularioProductoProduMaquina,jmenuBarProductoProduMaquina,jmenuBarDetalleProductoProduMaquina,jTtoolBarProductoProduMaquina,jTtoolBarDetalleProductoProduMaquina));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoProduMaquina(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoProduMaquina(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoProduMaquina(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoProduMaquina(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoProduMaquina,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoProduMaquina,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoProduMaquina(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoProduMaquina,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoProduMaquina,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoprodumaquinaConstantesFunciones.getsFinalQueryProductoProduMaquina();
		String  finalQueryPaginacionTodos=this.productoprodumaquinaConstantesFunciones.getsFinalQueryProductoProduMaquina();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoProduMaquinaConstantesFunciones.getArrayColumnasGlobalesNoProductoProduMaquina(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoProduMaquinaConstantesFunciones.getArrayColumnasGlobalesProductoProduMaquina(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoProduMaquinaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoprodumaquinasEliminados= new ArrayList<ProductoProduMaquina>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoProduMaquina();
		
				///*ProductoProduMaquinaSessionBean*/this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
			
			if(this.productoprodumaquinaSessionBean==null) {
				this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
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
					this.iNumeroPaginacion=ProductoProduMaquinaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoProduMaquinaConstantesFunciones.getClassesForeignKeysOfProductoProduMaquina(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoprodumaquina."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoprodumaquinasAux= new ArrayList<ProductoProduMaquina>();
			
				
			productoprodumaquinaLogic.setDatosCliente(this.datosCliente);
			productoprodumaquinaLogic.setDatosDeep(this.datosDeep);
			productoprodumaquinaLogic.setIsConDeep(true);
			
			
			productoprodumaquinaLogic.getProductoProduMaquinaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoprodumaquinaLogic.getTodosProductoProduMaquinas(finalQueryGlobal,pagination);
					
					//productoprodumaquinaLogic.getTodosProductoProduMaquinasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoprodumaquinaLogic.getProductoProduMaquinas()==null|| productoprodumaquinaLogic.getProductoProduMaquinas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodumaquinasAux= new ArrayList<ProductoProduMaquina>();
							productoprodumaquinasAux.addAll(productoprodumaquinaLogic.getProductoProduMaquinas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinasAux= new ArrayList<ProductoProduMaquina>();
							productoprodumaquinasAux.addAll(productoprodumaquinas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodumaquinaLogic.getTodosProductoProduMaquinas(finalQueryGlobal+"",this.pagination);												
							
							//productoprodumaquinaLogic.getTodosProductoProduMaquinasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoProduMaquinas("Todos",productoprodumaquinaLogic.getProductoProduMaquinas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());					
							productoprodumaquinaLogic.getProductoProduMaquinas().addAll(productoprodumaquinasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinas=new ArrayList<ProductoProduMaquina>();
							productoprodumaquinas.addAll(productoprodumaquinasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoProduMaquina=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoProduMaquina=this.idActual;
				
				} else if(this.idProductoProduMaquinaActual!=null && this.idProductoProduMaquinaActual!=0L) {
					idProductoProduMaquina=idProductoProduMaquinaActual;
				}
				
					
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndicePorId(idProductoProduMaquina);
				
				this.productoprodumaquinas=new ArrayList<ProductoProduMaquina>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoprodumaquinaLogic.getEntity(idProductoProduMaquina);
					
					//productoprodumaquinaLogic.getEntityWithConnection(idProductoProduMaquina);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
					productoprodumaquinaLogic.getProductoProduMaquinas().add(productoprodumaquinaLogic.getProductoProduMaquina());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumaquinas=new ArrayList<ProductoProduMaquina>();
					this.productoprodumaquinas.add(productoprodumaquina);
				}
				
				if(productoprodumaquinaLogic.getProductoProduMaquina()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdProductoDefiProdu")) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodumaquinaLogic.getProductoProduMaquinasFK_IdProductoDefiProdu(finalQueryGlobal,pagination,id_producto_defi_produFK_IdProductoDefiProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodumaquinaLogic.getProductoProduMaquinas()==null||productoprodumaquinaLogic.getProductoProduMaquinas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodumaquinas==null|| productoprodumaquinas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinasAux=new ArrayList<ProductoProduMaquina>();
						productoprodumaquinasAux.addAll(productoprodumaquinaLogic.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinasAux=new ArrayList<ProductoProduMaquina>();
							productoprodumaquinasAux.addAll(productoprodumaquinas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodumaquinaLogic.getProductoProduMaquinasFK_IdProductoDefiProdu(finalQueryGlobal,pagination,id_producto_defi_produFK_IdProductoDefiProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduMaquinas("FK_IdProductoDefiProdu",productoprodumaquinaLogic.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduMaquinas("FK_IdProductoDefiProdu",productoprodumaquinas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
						productoprodumaquinaLogic.getProductoProduMaquinas().addAll(productoprodumaquinasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinas=new ArrayList<ProductoProduMaquina>();
							productoprodumaquinas.addAll(productoprodumaquinasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoAreaEmpresaProdu")) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoAreaEmpresaProdu(id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodumaquinaLogic.getProductoProduMaquinasFK_IdTipoAreaEmpresaProdu(finalQueryGlobal,pagination,id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoAreaEmpresaProdu(id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoAreaEmpresaProdu(id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodumaquinaLogic.getProductoProduMaquinas()==null||productoprodumaquinaLogic.getProductoProduMaquinas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodumaquinas==null|| productoprodumaquinas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinasAux=new ArrayList<ProductoProduMaquina>();
						productoprodumaquinasAux.addAll(productoprodumaquinaLogic.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinasAux=new ArrayList<ProductoProduMaquina>();
							productoprodumaquinasAux.addAll(productoprodumaquinas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodumaquinaLogic.getProductoProduMaquinasFK_IdTipoAreaEmpresaProdu(finalQueryGlobal,pagination,id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoAreaEmpresaProdu(id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoAreaEmpresaProdu(id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduMaquinas("FK_IdTipoAreaEmpresaProdu",productoprodumaquinaLogic.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduMaquinas("FK_IdTipoAreaEmpresaProdu",productoprodumaquinas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
						productoprodumaquinaLogic.getProductoProduMaquinas().addAll(productoprodumaquinasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinas=new ArrayList<ProductoProduMaquina>();
							productoprodumaquinas.addAll(productoprodumaquinasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoMaquinaEmpresa")) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoMaquinaEmpresa(id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodumaquinaLogic.getProductoProduMaquinasFK_IdTipoMaquinaEmpresa(finalQueryGlobal,pagination,id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoMaquinaEmpresa(id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoMaquinaEmpresa(id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodumaquinaLogic.getProductoProduMaquinas()==null||productoprodumaquinaLogic.getProductoProduMaquinas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodumaquinas==null|| productoprodumaquinas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinasAux=new ArrayList<ProductoProduMaquina>();
						productoprodumaquinasAux.addAll(productoprodumaquinaLogic.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinasAux=new ArrayList<ProductoProduMaquina>();
							productoprodumaquinasAux.addAll(productoprodumaquinas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodumaquinaLogic.getProductoProduMaquinasFK_IdTipoMaquinaEmpresa(finalQueryGlobal,pagination,id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoMaquinaEmpresa(id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoMaquinaEmpresa(id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduMaquinas("FK_IdTipoMaquinaEmpresa",productoprodumaquinaLogic.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduMaquinas("FK_IdTipoMaquinaEmpresa",productoprodumaquinas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
						productoprodumaquinaLogic.getProductoProduMaquinas().addAll(productoprodumaquinasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinas=new ArrayList<ProductoProduMaquina>();
							productoprodumaquinas.addAll(productoprodumaquinasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProcesoEmpresaProdu")) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodumaquinaLogic.getProductoProduMaquinasFK_IdTipoProcesoEmpresaProdu(finalQueryGlobal,pagination,id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodumaquinaLogic.getProductoProduMaquinas()==null||productoprodumaquinaLogic.getProductoProduMaquinas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodumaquinas==null|| productoprodumaquinas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinasAux=new ArrayList<ProductoProduMaquina>();
						productoprodumaquinasAux.addAll(productoprodumaquinaLogic.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinasAux=new ArrayList<ProductoProduMaquina>();
							productoprodumaquinasAux.addAll(productoprodumaquinas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodumaquinaLogic.getProductoProduMaquinasFK_IdTipoProcesoEmpresaProdu(finalQueryGlobal,pagination,id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduMaquinas("FK_IdTipoProcesoEmpresaProdu",productoprodumaquinaLogic.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduMaquinas("FK_IdTipoProcesoEmpresaProdu",productoprodumaquinas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
						productoprodumaquinaLogic.getProductoProduMaquinas().addAll(productoprodumaquinasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinas=new ArrayList<ProductoProduMaquina>();
							productoprodumaquinas.addAll(productoprodumaquinasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoprodumaquinaLogic.getProductoProduMaquinasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoprodumaquinaLogic.getProductoProduMaquinas()==null||productoprodumaquinaLogic.getProductoProduMaquinas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodumaquinas==null|| productoprodumaquinas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinasAux=new ArrayList<ProductoProduMaquina>();
						productoprodumaquinasAux.addAll(productoprodumaquinaLogic.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinasAux=new ArrayList<ProductoProduMaquina>();
							productoprodumaquinasAux.addAll(productoprodumaquinas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoprodumaquinaLogic.getProductoProduMaquinasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProduMaquinas("FK_IdUnidad",productoprodumaquinaLogic.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProduMaquinas("FK_IdUnidad",productoprodumaquinas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinaLogic.setProductoProduMaquinas(new ArrayList<ProductoProduMaquina>());
						productoprodumaquinaLogic.getProductoProduMaquinas().addAll(productoprodumaquinasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinas=new ArrayList<ProductoProduMaquina>();
							productoprodumaquinas.addAll(productoprodumaquinasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoProduMaquina();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoProduMaquina();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoprodumaquinaLogic.getProductoProduMaquinas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodumaquinas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoprodumaquinaLogic.getProductoProduMaquinas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodumaquinas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoProduMaquina productoprodumaquina) {
		Boolean permite=true;
		
		if(this.productoprodumaquina.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoProduMaquinaConstantesFunciones.getOrderByListaProductoProduMaquina();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoProduMaquinaConstantesFunciones.getOrderByListaProductoProduMaquina();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMaquina productoprodumaquina:productoprodumaquinaLogic.getProductoProduMaquinas()) {
				if(productoprodumaquina.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodumaquinaTotales=productoprodumaquina;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMaquina productoprodumaquina:this.productoprodumaquinas) {
				if(productoprodumaquina.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodumaquinaTotales=productoprodumaquina;
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
			this.productoprodumaquinaAux=new ProductoProduMaquina();
			this.productoprodumaquinaAux.setsType(Constantes2.S_TOTALES);
			this.productoprodumaquinaAux.setIsNew(false);
			this.productoprodumaquinaAux.setIsChanged(false);
			this.productoprodumaquinaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoProduMaquinaConstantesFunciones.TotalizarValoresFilaProductoProduMaquina(this.productoprodumaquinaLogic.getProductoProduMaquinas(),this.productoprodumaquinaAux);
				
				this.productoprodumaquinaLogic.getProductoProduMaquinas().add(this.productoprodumaquinaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoProduMaquinaConstantesFunciones.TotalizarValoresFilaProductoProduMaquina(this.productoprodumaquinas,this.productoprodumaquinaAux);
				
				this.productoprodumaquinas.add(this.productoprodumaquinaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoprodumaquinaTotales=new ProductoProduMaquina();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoprodumaquinaLogic.getProductoProduMaquinas().remove(productoprodumaquinaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoprodumaquinas.remove(productoprodumaquinaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoprodumaquinaTotales=new ProductoProduMaquina();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProduMaquina productoprodumaquina:productoprodumaquinaLogic.getProductoProduMaquinas()) {
				if(productoprodumaquina.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodumaquinaTotales=productoprodumaquina;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoProduMaquinaConstantesFunciones.TotalizarValoresFilaProductoProduMaquina(this.productoprodumaquinaLogic.getProductoProduMaquinas(),productoprodumaquinaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProduMaquina productoprodumaquina:this.productoprodumaquinas) {
				if(productoprodumaquina.getsType().equals(Constantes2.S_TOTALES)) {
					productoprodumaquinaTotales=productoprodumaquina;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoProduMaquinaConstantesFunciones.TotalizarValoresFilaProductoProduMaquina(this.productoprodumaquinas,productoprodumaquinaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoProduMaquinasFK_IdProductoDefiProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdProductoDefiProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduMaquinasFK_IdTipoAreaEmpresaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoAreaEmpresaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduMaquinasFK_IdTipoMaquinaEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMaquinaEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduMaquinasFK_IdTipoProcesoEmpresaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProcesoEmpresaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProduMaquinasFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoProduMaquinasFK_IdProductoDefiProdu(String sFinalQuery,Long id_producto_defi_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumaquinaLogic.getProductoProduMaquinasFK_IdProductoDefiProdu(sFinalQuery,this.pagination,id_producto_defi_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduMaquinasFK_IdTipoAreaEmpresaProdu(String sFinalQuery,Long id_tipo_area_empresa_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumaquinaLogic.getProductoProduMaquinasFK_IdTipoAreaEmpresaProdu(sFinalQuery,this.pagination,id_tipo_area_empresa_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduMaquinasFK_IdTipoMaquinaEmpresa(String sFinalQuery,Long id_tipo_merma_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumaquinaLogic.getProductoProduMaquinasFK_IdTipoMaquinaEmpresa(sFinalQuery,this.pagination,id_tipo_merma_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduMaquinasFK_IdTipoProcesoEmpresaProdu(String sFinalQuery,Long id_tipo_proceso_empresa_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumaquinaLogic.getProductoProduMaquinasFK_IdTipoProcesoEmpresaProdu(sFinalQuery,this.pagination,id_tipo_proceso_empresa_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProduMaquinasFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumaquinaLogic.getProductoProduMaquinasFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosProductoProduMaquina() {
		this.isPermisoTodoProductoProduMaquina=false;
		this.isPermisoNuevoProductoProduMaquina=false;
		this.isPermisoActualizarProductoProduMaquina=false;
		this.isPermisoActualizarOriginalProductoProduMaquina=false;
		this.isPermisoEliminarProductoProduMaquina=false;
		this.isPermisoGuardarCambiosProductoProduMaquina=false;
		this.isPermisoConsultaProductoProduMaquina=false;
		this.isPermisoBusquedaProductoProduMaquina=false;
		this.isPermisoReporteProductoProduMaquina=false;		
		this.isPermisoOrdenProductoProduMaquina=false;		
		this.isPermisoPaginacionMedioProductoProduMaquina=false;		
		this.isPermisoPaginacionAltoProductoProduMaquina=false;
		this.isPermisoPaginacionTodoProductoProduMaquina=false;
		this.isPermisoCopiarProductoProduMaquina=false;		
		this.isPermisoVerFormProductoProduMaquina=false;		
		this.isPermisoDuplicarProductoProduMaquina=false;		
		this.isPermisoOrdenProductoProduMaquina=false;		
	}
	
	public void setPermisosUsuarioProductoProduMaquina(Boolean isPermiso) {
		this.isPermisoTodoProductoProduMaquina=isPermiso;
		this.isPermisoNuevoProductoProduMaquina=isPermiso;
		this.isPermisoActualizarProductoProduMaquina=isPermiso;
		this.isPermisoActualizarOriginalProductoProduMaquina=isPermiso;
		this.isPermisoEliminarProductoProduMaquina=isPermiso;
		this.isPermisoGuardarCambiosProductoProduMaquina=isPermiso;
		this.isPermisoConsultaProductoProduMaquina=isPermiso;
		this.isPermisoBusquedaProductoProduMaquina=isPermiso;
		this.isPermisoReporteProductoProduMaquina=isPermiso;
		this.isPermisoOrdenProductoProduMaquina=isPermiso;		
		this.isPermisoPaginacionMedioProductoProduMaquina=isPermiso;		
		this.isPermisoPaginacionAltoProductoProduMaquina=isPermiso;		
		this.isPermisoPaginacionTodoProductoProduMaquina=isPermiso;		
		this.isPermisoCopiarProductoProduMaquina=isPermiso;		
		this.isPermisoVerFormProductoProduMaquina=isPermiso;		
		this.isPermisoDuplicarProductoProduMaquina=isPermiso;
		this.isPermisoOrdenProductoProduMaquina=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoProduMaquina(Boolean isPermiso) {
		//this.isPermisoTodoProductoProduMaquina=isPermiso;
		this.isPermisoNuevoProductoProduMaquina=isPermiso;
		this.isPermisoActualizarProductoProduMaquina=isPermiso;
		this.isPermisoActualizarOriginalProductoProduMaquina=isPermiso;
		this.isPermisoEliminarProductoProduMaquina=isPermiso;
		this.isPermisoGuardarCambiosProductoProduMaquina=isPermiso;
		//this.isPermisoConsultaProductoProduMaquina=isPermiso;
		//this.isPermisoBusquedaProductoProduMaquina=isPermiso;
		//this.isPermisoReporteProductoProduMaquina=isPermiso;
		//this.isPermisoOrdenProductoProduMaquina=isPermiso;		
		//this.isPermisoPaginacionMedioProductoProduMaquina=isPermiso;		
		//this.isPermisoPaginacionAltoProductoProduMaquina=isPermiso;		
		//this.isPermisoPaginacionTodoProductoProduMaquina=isPermiso;		
		//this.isPermisoCopiarProductoProduMaquina=isPermiso;		
		//this.isPermisoDuplicarProductoProduMaquina=isPermiso;
		//this.isPermisoOrdenProductoProduMaquina=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoProduMaquinaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoProduMaquinaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoProduMaquina(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoProduMaquinaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoProduMaquinaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoProduMaquinaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoProduMaquinaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoProduMaquina() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoProduMaquinaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoProduMaquina=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoProduMaquina=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoProduMaquina=this.isPermisoActualizarProductoProduMaquina;
			this.isPermisoEliminarProductoProduMaquina=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoProduMaquina=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoProduMaquina=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoProduMaquina=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoProduMaquina=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoProduMaquina=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoProduMaquina=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoProduMaquina=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoProduMaquina=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoProduMaquina=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoProduMaquina=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoProduMaquina=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoProduMaquina=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoProduMaquina=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoProduMaquina.setToolTipText(this.jTableDatosProductoProduMaquina.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoProduMaquina(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoProduMaquina(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoProduMaquinaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoProduMaquinaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoProduMaquina() throws Exception {
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
	public void inicializarCombosForeignKeyProductoProduMaquinaListas()throws Exception {
		try	{						
			
				this.productodefiprodusForeignKey=new ArrayList();
				this.tipoareaempresaprodusForeignKey=new ArrayList();
				this.tipoprocesoempresaprodusForeignKey=new ArrayList();
				this.tipomaquinaempresasForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoProduMaquinaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoProduMaquinaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoProduMaquinaListas(false);
			} else {
			
				this.cargarCombosForeignKeyProductoDefiProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoAreaEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProcesoEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMaquinaEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyProductoDefiProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.productodefiprodusForeignKey==null||this.productodefiprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoDefiProduConstantesFunciones.getArrayColumnasGlobalesProductoDefiProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoDefiProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoDefiProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductoDefiProdusForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoAreaEmpresaProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoareaempresaprodusForeignKey==null||this.tipoareaempresaprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoAreaEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoAreaEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoAreaEmpresaProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoAreaEmpresaProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoAreaEmpresaProdusForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProcesoEmpresaProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoprocesoempresaprodusForeignKey==null||this.tipoprocesoempresaprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoProcesoEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoProcesoEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProcesoEmpresaProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoProcesoEmpresaProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoProcesoEmpresaProdusForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMaquinaEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomaquinaempresasForeignKey==null||this.tipomaquinaempresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMaquinaEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoMaquinaEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMaquinaEmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMaquinaEmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMaquinaEmpresasForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyProductoProduMaquinaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoProduMaquinaParameterReturnGeneral productoprodumaquinaReturnGeneral=new ProductoProduMaquinaParameterReturnGeneral();
						
			


				String finalQueryGlobalProductoDefiProdu="";

				if(((this.productodefiprodusForeignKey==null||this.productodefiprodusForeignKey.size()<=0) && this.productoprodumaquinaConstantesFunciones.cargarid_producto_defi_produProductoProduMaquina)
					 || (this.esRecargarFks && this.productoprodumaquinaConstantesFunciones.cargarid_producto_defi_produProductoProduMaquina)) {

					if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoDefiProduConstantesFunciones.getArrayColumnasGlobalesProductoDefiProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProductoDefiProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoDefiProduConstantesFunciones.TABLENAME);

						finalQueryGlobalProductoDefiProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalProductoDefiProdu, "");
						finalQueryGlobalProductoDefiProdu+=ProductoDefiProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductoDefiProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProductoDefiProdu=" WHERE " + ConstantesSql.ID + "="+productoprodumaquinaSessionBean.getlidProductoDefiProduActual();
					}
				} else {
					finalQueryGlobalProductoDefiProdu="NONE";
				}


				String finalQueryGlobalTipoAreaEmpresaProdu="";

				if(((this.tipoareaempresaprodusForeignKey==null||this.tipoareaempresaprodusForeignKey.size()<=0) && this.productoprodumaquinaConstantesFunciones.cargarid_tipo_area_empresa_produProductoProduMaquina)
					 || (this.esRecargarFks && this.productoprodumaquinaConstantesFunciones.cargarid_tipo_area_empresa_produProductoProduMaquina)) {

					if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoAreaEmpresaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoAreaEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoAreaEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoAreaEmpresaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoAreaEmpresaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoAreaEmpresaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoAreaEmpresaProdu, "");
						finalQueryGlobalTipoAreaEmpresaProdu+=TipoAreaEmpresaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoAreaEmpresaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoAreaEmpresaProdu=" WHERE " + ConstantesSql.ID + "="+productoprodumaquinaSessionBean.getlidTipoAreaEmpresaProduActual();
					}
				} else {
					finalQueryGlobalTipoAreaEmpresaProdu="NONE";
				}


				String finalQueryGlobalTipoProcesoEmpresaProdu="";

				if(((this.tipoprocesoempresaprodusForeignKey==null||this.tipoprocesoempresaprodusForeignKey.size()<=0) && this.productoprodumaquinaConstantesFunciones.cargarid_tipo_proceso_empresa_produProductoProduMaquina)
					 || (this.esRecargarFks && this.productoprodumaquinaConstantesFunciones.cargarid_tipo_proceso_empresa_produProductoProduMaquina)) {

					if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProcesoEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoProcesoEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProcesoEmpresaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProcesoEmpresaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProcesoEmpresaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProcesoEmpresaProdu, "");
						finalQueryGlobalTipoProcesoEmpresaProdu+=TipoProcesoEmpresaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProcesoEmpresaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProcesoEmpresaProdu=" WHERE " + ConstantesSql.ID + "="+productoprodumaquinaSessionBean.getlidTipoProcesoEmpresaProduActual();
					}
				} else {
					finalQueryGlobalTipoProcesoEmpresaProdu="NONE";
				}


				String finalQueryGlobalTipoMaquinaEmpresa="";

				if(((this.tipomaquinaempresasForeignKey==null||this.tipomaquinaempresasForeignKey.size()<=0) && this.productoprodumaquinaConstantesFunciones.cargarid_tipo_merma_empresaProductoProduMaquina)
					 || (this.esRecargarFks && this.productoprodumaquinaConstantesFunciones.cargarid_tipo_merma_empresaProductoProduMaquina)) {

					if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoMaquinaEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMaquinaEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoMaquinaEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMaquinaEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMaquinaEmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMaquinaEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMaquinaEmpresa, "");
						finalQueryGlobalTipoMaquinaEmpresa+=TipoMaquinaEmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMaquinaEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMaquinaEmpresa=" WHERE " + ConstantesSql.ID + "="+productoprodumaquinaSessionBean.getlidTipoMaquinaEmpresaActual();
					}
				} else {
					finalQueryGlobalTipoMaquinaEmpresa="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.productoprodumaquinaConstantesFunciones.cargarid_unidadProductoProduMaquina)
					 || (this.esRecargarFks && this.productoprodumaquinaConstantesFunciones.cargarid_unidadProductoProduMaquina)) {

					if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+productoprodumaquinaSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoprodumaquinaReturnGeneral=productoprodumaquinaLogic.cargarCombosLoteForeignKeyProductoProduMaquina(finalQueryGlobalProductoDefiProdu,finalQueryGlobalTipoAreaEmpresaProdu,finalQueryGlobalTipoProcesoEmpresaProdu,finalQueryGlobalTipoMaquinaEmpresa,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalProductoDefiProdu.equals("NONE")) {
				this.productodefiprodusForeignKey=productoprodumaquinaReturnGeneral.getproductodefiprodusForeignKey();
			}

			if(!finalQueryGlobalTipoAreaEmpresaProdu.equals("NONE")) {
				this.tipoareaempresaprodusForeignKey=productoprodumaquinaReturnGeneral.gettipoareaempresaprodusForeignKey();
			}

			if(!finalQueryGlobalTipoProcesoEmpresaProdu.equals("NONE")) {
				this.tipoprocesoempresaprodusForeignKey=productoprodumaquinaReturnGeneral.gettipoprocesoempresaprodusForeignKey();
			}

			if(!finalQueryGlobalTipoMaquinaEmpresa.equals("NONE")) {
				this.tipomaquinaempresasForeignKey=productoprodumaquinaReturnGeneral.gettipomaquinaempresasForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=productoprodumaquinaReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoProduMaquina()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyProductoDefiProdu();
			this.addItemDefectoCombosForeignKeyTipoAreaEmpresaProdu();
			this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
			this.addItemDefectoCombosForeignKeyTipoMaquinaEmpresa();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyProductoDefiProdu()throws Exception {
		try {
			if(this.productoprodumaquinaSessionBean==null) {
				this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
			}

			if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {
				ProductoDefiProdu productodefiprodu=new ProductoDefiProdu();
				ProductoDefiProduConstantesFunciones.setProductoDefiProduDescripcion(productodefiprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				productodefiprodu.setId(null);

				if(!ProductoDefiProduConstantesFunciones.ExisteEnLista(this.productodefiprodusForeignKey,productodefiprodu,true)) {

					this.productodefiprodusForeignKey.add(0,productodefiprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoAreaEmpresaProdu()throws Exception {
		try {

			if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoAreaEmpresaProdu()) {
				TipoAreaEmpresaProdu tipoareaempresaprodu=new TipoAreaEmpresaProdu();
				TipoAreaEmpresaProduConstantesFunciones.setTipoAreaEmpresaProduDescripcion(tipoareaempresaprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoareaempresaprodu.setId(null);

				if(!TipoAreaEmpresaProduConstantesFunciones.ExisteEnLista(this.tipoareaempresaprodusForeignKey,tipoareaempresaprodu,true)) {

					this.tipoareaempresaprodusForeignKey.add(0,tipoareaempresaprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu()throws Exception {
		try {

			if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu()) {
				TipoProcesoEmpresaProdu tipoprocesoempresaprodu=new TipoProcesoEmpresaProdu();
				TipoProcesoEmpresaProduConstantesFunciones.setTipoProcesoEmpresaProduDescripcion(tipoprocesoempresaprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoprocesoempresaprodu.setId(null);

				if(!TipoProcesoEmpresaProduConstantesFunciones.ExisteEnLista(this.tipoprocesoempresaprodusForeignKey,tipoprocesoempresaprodu,true)) {

					this.tipoprocesoempresaprodusForeignKey.add(0,tipoprocesoempresaprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoMaquinaEmpresa()throws Exception {
		try {

			if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoMaquinaEmpresa()) {
				TipoMaquinaEmpresa tipomaquinaempresa=new TipoMaquinaEmpresa();
				TipoMaquinaEmpresaConstantesFunciones.setTipoMaquinaEmpresaDescripcion(tipomaquinaempresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomaquinaempresa.setId(null);

				if(!TipoMaquinaEmpresaConstantesFunciones.ExisteEnLista(this.tipomaquinaempresasForeignKey,tipomaquinaempresa,true)) {

					this.tipomaquinaempresasForeignKey.add(0,tipomaquinaempresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.productoprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoProduMaquina()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoProduMaquina(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoProduMaquina()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProduMaquina();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoProduMaquina(ProductoProduMaquina productoprodumaquina)throws Exception {	
		try {
			
			this.setActualProductoDefiProduForeignKey(productoprodumaquina.getid_producto_defi_produ(),false,"Formulario");
			this.setActualTipoAreaEmpresaProduForeignKey(productoprodumaquina.getid_tipo_area_empresa_produ(),false,"Formulario");
			this.setActualTipoProcesoEmpresaProduForeignKey(productoprodumaquina.getid_tipo_proceso_empresa_produ(),false,"Formulario");
			this.setActualTipoMaquinaEmpresaForeignKey(productoprodumaquina.getid_tipo_merma_empresa(),false,"Formulario");
			this.setActualUnidadForeignKey(productoprodumaquina.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoProduMaquina(ProductoProduMaquina productoprodumaquina,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoProduMaquina()throws Exception {	
		try {
			
			this.setActualProductoDefiProduForeignKey(this.productoprodumaquinaConstantesFunciones.getid_producto_defi_produ(),false,"Formulario");
			this.setActualTipoAreaEmpresaProduForeignKey(this.productoprodumaquinaConstantesFunciones.getid_tipo_area_empresa_produ(),false,"Formulario");
			this.setActualTipoProcesoEmpresaProduForeignKey(this.productoprodumaquinaConstantesFunciones.getid_tipo_proceso_empresa_produ(),false,"Formulario");
			this.setActualTipoMaquinaEmpresaForeignKey(this.productoprodumaquinaConstantesFunciones.getid_tipo_merma_empresa(),false,"Formulario");
			this.setActualUnidadForeignKey(this.productoprodumaquinaConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProduMaquina()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoProduMaquina()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoProduMaquina()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoProduMaquina()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoProduMaquina()throws Exception {
		try {
			

			this.cargarCombosFrameProductoDefiProdusForeignKey("Todos");
			this.cargarCombosFrameTipoAreaEmpresaProdusForeignKey("Todos");
			this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey("Todos");
			this.cargarCombosFrameTipoMaquinaEmpresasForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoProduMaquina(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameProductoDefiProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoAreaEmpresaProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMaquinaEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoProduMaquina()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ProductoProduMaquinaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoProduMaquinaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoProduMaquinaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean(); 
		this.productoprodumaquinaConstantesFunciones=new ProductoProduMaquinaConstantesFunciones(); 
		this.productoprodumaquinaBean=new ProductoProduMaquina();//(this.productoprodumaquinaConstantesFunciones); 		
		this.productoprodumaquinaReturnGeneral=new ProductoProduMaquinaParameterReturnGeneral(); 
		
		this.productoprodumaquinaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoProduMaquinaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoProduMaquinaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoProduMaquinaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoProduMaquina(true);
			
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
			
			this.productoprodumaquinaConstantesFunciones=new ProductoProduMaquinaConstantesFunciones(); 
			this.productoprodumaquinaBean=new ProductoProduMaquina();//this.productoprodumaquinaConstantesFunciones); 			
			this.productoprodumaquinaReturnGeneral=new ProductoProduMaquinaParameterReturnGeneral(); 
		
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Maquina Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productoprodumaquina=new ProductoProduMaquina();
			this.productoprodumaquinas = new ArrayList<ProductoProduMaquina>();
			this.productoprodumaquinasAux = new ArrayList<ProductoProduMaquina>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic=new ProductoProduMaquinaLogic();
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			//this.productoprodumaquinaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoProduMaquina);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoProduMaquina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoProduMaquina);	
					}
					
					if(this.jInternalFrameImportacionProductoProduMaquina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoProduMaquina);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoProduMaquina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoProduMaquina);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoProduMaquina);
				this.jInternalFrameDetalleFormProductoProduMaquina.setVisible(false);
				this.jInternalFrameDetalleFormProductoProduMaquina.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProduMaquina!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoProduMaquina);
					this.jInternalFrameReporteDinamicoProductoProduMaquina.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoProduMaquina.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoProduMaquina!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoProduMaquina);
					this.jInternalFrameImportacionProductoProduMaquina.setVisible(false);
					this.jInternalFrameImportacionProductoProduMaquina.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoProduMaquina!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoProduMaquina);
					this.jInternalFrameOrderByProductoProduMaquina.setVisible(false);
					this.jInternalFrameOrderByProductoProduMaquina.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoProduMaquinaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoProduMaquinaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoprodumaquinaReturnGeneral=new ProductoProduMaquinaParameterReturnGeneral();
			
			this.productoprodumaquinaParameterGeneral=new ProductoProduMaquinaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoprodumaquinaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoProduMaquinaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoprodumaquinaSessionBean.getEsGuardarRelacionado(),this.productoprodumaquinaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoProduMaquinaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoprodumaquinaSessionBean.getEsGuardarRelacionado(),this.productoprodumaquinaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoProduMaquina=false;
			this.isVisibilidadCeldaDuplicarProductoProduMaquina=true;
			this.isVisibilidadCeldaCopiarProductoProduMaquina=true;
			this.isVisibilidadCeldaVerFormProductoProduMaquina=true;
			this.isVisibilidadCeldaOrdenProductoProduMaquina=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=false;
			this.isVisibilidadCeldaModificarProductoProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoProduMaquina=false;
			this.isVisibilidadCeldaEliminarProductoProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoProduMaquina=false;
			this.isVisibilidadCeldaGuardarProductoProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=false;
			
			
			this.isVisibilidadFK_IdProductoDefiProdu=true;
			this.isVisibilidadFK_IdTipoAreaEmpresaProdu=true;
			this.isVisibilidadFK_IdTipoMaquinaEmpresa=true;
			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoProduMaquina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoProduMaquina();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoProduMaquina(false);
			
			this.setPermisosUsuarioProductoProduMaquina();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() 
				|| (this.productoprodumaquinaSessionBean.getEsGuardarRelacionado() && this.productoprodumaquinaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoProduMaquinaClasesRelacionadas();
			}
			
			if(this.productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoProduMaquinaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoProduMaquina();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoProduMaquina();
			}
			
			if(!this.isPermisoBusquedaProductoProduMaquina) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoProduMaquina.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoProduMaquina,this.isPermisoPaginacionMedioProductoProduMaquina,this.isPermisoPaginacionTodoProductoProduMaquina);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoProduMaquinaConstantesFunciones.getTiposSeleccionarProductoProduMaquina());
				
				this.tiposColumnasSelect=ProductoProduMaquinaConstantesFunciones.getTiposSeleccionarProductoProduMaquina(true);
				
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
			//if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoProduMaquina();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoProduMaquina(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoProduMaquina(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduMaquina() ;
			
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
			
			this.productodefiproduLogic=new ProductoDefiProduLogic();
			this.tipoareaempresaproduLogic=new TipoAreaEmpresaProduLogic();
			this.tipoprocesoempresaproduLogic=new TipoProcesoEmpresaProduLogic();
			this.tipomaquinaempresaLogic=new TipoMaquinaEmpresaLogic();
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
				productoprodumaquinaImplementable= (ProductoProduMaquinaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoProduMaquinaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoprodumaquinaImplementableHome= (ProductoProduMaquinaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoProduMaquinaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoprodumaquinas= new ArrayList<ProductoProduMaquina>();
			this.productoprodumaquinasEliminados= new ArrayList<ProductoProduMaquina>();
						
			this.isEsNuevoProductoProduMaquina=false;
			this.esParaAccionDesdeFormularioProductoProduMaquina=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>() ;
			this.tipoareaempresaprodusForeignKey=new ArrayList<TipoAreaEmpresaProdu>() ;
			this.tipoprocesoempresaprodusForeignKey=new ArrayList<TipoProcesoEmpresaProdu>() ;
			this.tipomaquinaempresasForeignKey=new ArrayList<TipoMaquinaEmpresa>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoProduMaquina(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoProduMaquina();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoProduMaquinaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoProduMaquina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoProduMaquina(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoProduMaquina();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoProduMaquina();
			}
			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoProduMaquina.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoProduMaquina.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoProduMaquina.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoProduMaquina(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoProduMaquina: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoProduMaquina() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoProduMaquina")) {
				iIndex=this.jInternalFrameDetalleFormProductoProduMaquina.jTabbedPaneRelacionesProductoProduMaquina.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoProduMaquina.jTabbedPaneRelacionesProductoProduMaquina.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoProduMaquina();	
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
	
	public void cargarCombosForeignKeyProductoProduMaquina(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoProduMaquina(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoProduMaquina(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoProduMaquinaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoProduMaquina();
		
		this.cargarCombosFrameForeignKeyProductoProduMaquina();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoProduMaquina();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoProduMaquina();
		}
	}
	
	

	public void cargarCombosForeignKeyProductoDefiProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoDefiProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProductoDefiProdu();
				this.cargarCombosFrameProductoDefiProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProductoDefiProdu(this.productodefiprodusForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoAreaEmpresaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoAreaEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoAreaEmpresaProdu();
				this.cargarCombosFrameTipoAreaEmpresaProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoAreaEmpresaProdu(this.tipoareaempresaprodusForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProcesoEmpresaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoProcesoEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
				this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoProcesoEmpresaProdu(this.tipoprocesoempresaprodusForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMaquinaEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMaquinaEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMaquinaEmpresa();
				this.cargarCombosFrameTipoMaquinaEmpresasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoMaquinaEmpresa(this.tipomaquinaempresasForeignKey);

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
	
	public void jButtonNuevoProductoProduMaquinaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			
			
			if(jTableDatosProductoProduMaquina.getRowCount()>=1) {
				jTableDatosProductoProduMaquina.removeRowSelectionInterval(0, jTableDatosProductoProduMaquina.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoProduMaquina=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoProduMaquina(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoProduMaquina(true);			
			//this.productoprodumaquina=new ProductoProduMaquina();
			//this.productoprodumaquina.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProduMaquina(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduMaquina() ;
			
			if(ProductoProduMaquinaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProduMaquina(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoprodumaquina);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);				
			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			
			if(this.productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoProduMaquina: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoProduMaquinaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoProduMaquina.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoProduMaquina.getSelectedRows().length;			
			}
			
			productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoProduMaquina--;			
				//ProductoProduMaquina productoprodumaquinaAux= new ProductoProduMaquina();			
				//productoprodumaquinaAux.setId(this.iIdNuevoProductoProduMaquina);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoProduMaquina productoprodumaquinaOrigen=new ProductoProduMaquina();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoProduMaquina productoprodumaquinaOrigen : productoprodumaquinasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoprodumaquinaOrigen =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodumaquinaOrigen =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoProduMaquina();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoprodumaquina.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoProduMaquina(productoprodumaquinaOrigen,this.productoprodumaquina,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoprodumaquinaLogic.getProductoProduMaquinas().add(this.productoprodumaquinaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoprodumaquinas.add(this.productoprodumaquinaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoProduMaquina(false);
				
				this.jTableDatosProductoProduMaquina.setRowSelectionInterval(this.getIndiceNuevoProductoProduMaquina(), this.getIndiceNuevoProductoProduMaquina());
				
				int iLastRow =  this.jTableDatosProductoProduMaquina.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoProduMaquina.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoProduMaquina.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProduMaquina(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();									
		
			ProductoProduMaquina productoprodumaquinaOrigen=new ProductoProduMaquina();
			ProductoProduMaquina productoprodumaquinaDestino=new ProductoProduMaquina();
				
			productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoProduMaquina.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoprodumaquinasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoProduMaquina.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinaOrigen =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoprodumaquinaOrigen =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodumaquinaDestino =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoprodumaquinaDestino =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoprodumaquinaOrigen =productoprodumaquinasSeleccionados.get(0);
				productoprodumaquinaDestino =productoprodumaquinasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoProduMaquina(productoprodumaquinaOrigen,productoprodumaquinaDestino,true,false);
				
				productoprodumaquinaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoprodumaquinaDestino,productoprodumaquinaLogic.getProductoProduMaquinas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoprodumaquinaDestino,productoprodumaquinas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoProduMaquina(false);
				
				//this.jTableDatosProductoProduMaquina.setRowSelectionInterval(this.getIndiceNuevoProductoProduMaquina(), this.getIndiceNuevoProductoProduMaquina());
				
				int iLastRow =  this.jTableDatosProductoProduMaquina.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoProduMaquina.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoProduMaquina.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProduMaquina(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoProduMaquina.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoProduMaquina.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoProduMaquina.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoProduMaquina.setVisible(!isVisible);
			this.jPanelPaginacionProductoProduMaquina.setVisible(!isVisible);
			this.jPanelAccionesProductoProduMaquina.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoProduMaquina();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoProduMaquina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoProduMaquina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoProduMaquina();
			
			this.abrirFrameOrderByProductoProduMaquina();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoProduMaquina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoProduMaquina(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoProduMaquina);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoProduMaquina.isMaximum()) {
					this.jInternalFrameDetalleFormProductoProduMaquina.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoProduMaquina.setSize(this.jInternalFrameDetalleFormProductoProduMaquina.iWidthFormulario,this.jInternalFrameDetalleFormProductoProduMaquina.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoProduMaquina.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoProduMaquina.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoProduMaquina.isMaximum()) {
						this.jInternalFrameDetalleFormProductoProduMaquina.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoProduMaquina.jContentPaneDetalleProductoProduMaquina.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoProduMaquina.jTabbedPaneRelacionesProductoProduMaquina.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoProduMaquina.jContentPaneDetalleProductoProduMaquina.getWidth(),ProductoProduMaquinaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoProduMaquina.jTabbedPaneRelacionesProductoProduMaquina.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoProduMaquina.jContentPaneDetalleProductoProduMaquina.getWidth(),ProductoProduMaquinaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoProduMaquina.jTabbedPaneRelacionesProductoProduMaquina.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoProduMaquina.jContentPaneDetalleProductoProduMaquina.getWidth(),ProductoProduMaquinaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoProduMaquina.setVisible(true);
	        this.jInternalFrameDetalleFormProductoProduMaquina.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoProduMaquina() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoProduMaquina==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoProduMaquina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduMaquina,false,this);
				} else {
					this.jInternalFrameOrderByProductoProduMaquina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduMaquina,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoProduMaquina);
				this.jInternalFrameOrderByProductoProduMaquina.setVisible(false);
				this.jInternalFrameOrderByProductoProduMaquina.setSelected(false);
				
				this.jInternalFrameOrderByProductoProduMaquina.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoProduMaquina"));
				
				this.inicializarActualizarBindingTablaOrderByProductoProduMaquina();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoProduMaquina() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoProduMaquina==null) {
				
				this.jInternalFrameImportacionProductoProduMaquina=new ImportacionJInternalFrame(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoProduMaquina);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoProduMaquina);
				this.jInternalFrameImportacionProductoProduMaquina.setVisible(false);
				this.jInternalFrameImportacionProductoProduMaquina.setSelected(false);


				this.jInternalFrameImportacionProductoProduMaquina.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoProduMaquina"));
				this.jInternalFrameImportacionProductoProduMaquina.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoProduMaquina"));
				this.jInternalFrameImportacionProductoProduMaquina.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoProduMaquina"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoProduMaquina() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoProduMaquina==null) {
				this.jInternalFrameReporteDinamicoProductoProduMaquina=new ReporteDinamicoJInternalFrame(ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoProduMaquina);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoProduMaquina);
				this.jInternalFrameReporteDinamicoProductoProduMaquina.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoProduMaquina.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoProduMaquina.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProduMaquina"));
				this.jInternalFrameReporteDinamicoProductoProduMaquina.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProduMaquina"));
				this.jInternalFrameReporteDinamicoProductoProduMaquina.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProduMaquina"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProduMaquina();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoProduMaquina() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoProduMaquina);
			
	       	this.jInternalFrameDetalleFormProductoProduMaquina.setVisible(false);
	        this.jInternalFrameDetalleFormProductoProduMaquina.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoProduMaquina.dispose();
			//this.jInternalFrameDetalleFormProductoProduMaquina=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoProduMaquina() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoProduMaquina.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoProduMaquina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoProduMaquina() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoProduMaquina.setVisible(true);
	        this.jInternalFrameImportacionProductoProduMaquina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoProduMaquina() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoProduMaquina.setVisible(true);
	        this.jInternalFrameOrderByProductoProduMaquina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoProduMaquina() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoProduMaquina.setVisible(false);
	        this.jInternalFrameOrderByProductoProduMaquina.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoProduMaquina() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoProduMaquina.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoProduMaquina.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoProduMaquina() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoProduMaquina.setVisible(false);
	        this.jInternalFrameImportacionProductoProduMaquina.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoProduMaquina(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoProduMaquina(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoProduMaquina(true);
			//this.isEsNuevoProductoProduMaquina=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoProduMaquina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProduMaquina(false) ;
			
			if(productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoProduMaquinaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProduMaquina(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduMaquina(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoProduMaquinaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoProduMaquina(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoProduMaquina(true);
			//this.isEsNuevoProductoProduMaquina=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoprodumaquina.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoProduMaquina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoProduMaquina(false) ;
			
			if(ProductoProduMaquinaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProduMaquina(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduMaquina(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaProductoDefiProdu(List<ProductoDefiProdu> productodefiprodusForeignKey)throws Exception{
		TableColumn tableColumnProductoDefiProdu=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU));
		TableCellEditor tableCellEditorProductoDefiProdu =tableColumnProductoDefiProdu.getCellEditor();

		ProductoDefiProduTableCell productodefiproduTableCellFk=(ProductoDefiProduTableCell)tableCellEditorProductoDefiProdu;

		if(productodefiproduTableCellFk!=null) {
			productodefiproduTableCellFk.setproductodefiprodusForeignKey(productodefiprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduMaquina.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productodefiproduTableCellFk.setRowActual(intSelectedRow);
			//productodefiproduTableCellFk.setproductodefiprodusForeignKeyActual(productodefiprodusForeignKey);
		//}


		if(productodefiproduTableCellFk!=null) {
			productodefiproduTableCellFk.RecargarProductoDefiProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoAreaEmpresaProdu(List<TipoAreaEmpresaProdu> tipoareaempresaprodusForeignKey)throws Exception{
		TableColumn tableColumnTipoAreaEmpresaProdu=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU));
		TableCellEditor tableCellEditorTipoAreaEmpresaProdu =tableColumnTipoAreaEmpresaProdu.getCellEditor();

		TipoAreaEmpresaProduTableCell tipoareaempresaproduTableCellFk=(TipoAreaEmpresaProduTableCell)tableCellEditorTipoAreaEmpresaProdu;

		if(tipoareaempresaproduTableCellFk!=null) {
			tipoareaempresaproduTableCellFk.settipoareaempresaprodusForeignKey(tipoareaempresaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduMaquina.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoareaempresaproduTableCellFk.setRowActual(intSelectedRow);
			//tipoareaempresaproduTableCellFk.settipoareaempresaprodusForeignKeyActual(tipoareaempresaprodusForeignKey);
		//}


		if(tipoareaempresaproduTableCellFk!=null) {
			tipoareaempresaproduTableCellFk.RecargarTipoAreaEmpresaProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoProcesoEmpresaProdu(List<TipoProcesoEmpresaProdu> tipoprocesoempresaprodusForeignKey)throws Exception{
		TableColumn tableColumnTipoProcesoEmpresaProdu=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU));
		TableCellEditor tableCellEditorTipoProcesoEmpresaProdu =tableColumnTipoProcesoEmpresaProdu.getCellEditor();

		TipoProcesoEmpresaProduTableCell tipoprocesoempresaproduTableCellFk=(TipoProcesoEmpresaProduTableCell)tableCellEditorTipoProcesoEmpresaProdu;

		if(tipoprocesoempresaproduTableCellFk!=null) {
			tipoprocesoempresaproduTableCellFk.settipoprocesoempresaprodusForeignKey(tipoprocesoempresaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduMaquina.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprocesoempresaproduTableCellFk.setRowActual(intSelectedRow);
			//tipoprocesoempresaproduTableCellFk.settipoprocesoempresaprodusForeignKeyActual(tipoprocesoempresaprodusForeignKey);
		//}


		if(tipoprocesoempresaproduTableCellFk!=null) {
			tipoprocesoempresaproduTableCellFk.RecargarTipoProcesoEmpresaProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoMaquinaEmpresa(List<TipoMaquinaEmpresa> tipomaquinaempresasForeignKey)throws Exception{
		TableColumn tableColumnTipoMaquinaEmpresa=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA));
		TableCellEditor tableCellEditorTipoMaquinaEmpresa =tableColumnTipoMaquinaEmpresa.getCellEditor();

		TipoMaquinaEmpresaTableCell tipomaquinaempresaTableCellFk=(TipoMaquinaEmpresaTableCell)tableCellEditorTipoMaquinaEmpresa;

		if(tipomaquinaempresaTableCellFk!=null) {
			tipomaquinaempresaTableCellFk.settipomaquinaempresasForeignKey(tipomaquinaempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduMaquina.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomaquinaempresaTableCellFk.setRowActual(intSelectedRow);
			//tipomaquinaempresaTableCellFk.settipomaquinaempresasForeignKeyActual(tipomaquinaempresasForeignKey);
		//}


		if(tipomaquinaempresaTableCellFk!=null) {
			tipomaquinaempresaTableCellFk.RecargarTipoMaquinaEmpresasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProduMaquina.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoProduMaquina(false);
			
			//if(!this.isEsNuevoProductoProduMaquina) {								
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
				
			}
			
			if(this.permiteMantenimiento(this.productoprodumaquina)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoProduMaquina=true;
					this.inicializarActualizarBindingTablaProductoProduMaquina(false);
					this.isEsNuevoProductoProduMaquina=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoProduMaquina=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoProduMaquina=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoProduMaquina(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProduMaquina(false);
				
				this.habilitarDeshabilitarControlesProductoProduMaquina(false);
			
												
				
				if(ProductoProduMaquinaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoProduMaquina();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoProduMaquinaActionPerformed(evt,productoprodumaquinaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoProduMaquina(this.productoprodumaquina,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoProduMaquina.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoprodumaquinaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoprodumaquina.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoProduMaquina.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMaquina.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				this.productoprodumaquina.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				this.productoprodumaquina.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoprodumaquina)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoProduMaquinaModel) this.jTableDatosProductoProduMaquina.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoProduMaquina=true;
				this.inicializarActualizarBindingTablaProductoProduMaquina(false);
				this.isEsNuevoProductoProduMaquina=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoProduMaquina(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProduMaquina(false);
				
				this.habilitarDeshabilitarControlesProductoProduMaquina(false);
				
				
				
				if(ProductoProduMaquinaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoProduMaquina();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoProduMaquina.getRowCount()>=1) {
				jTableDatosProductoProduMaquina.removeRowSelectionInterval(0, jTableDatosProductoProduMaquina.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoProduMaquina(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoProduMaquina(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProduMaquina(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProduMaquina(false) ;
			
			this.isEsNuevoProductoProduMaquina=false;
			
			if(ProductoProduMaquinaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoProduMaquina();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoProduMaquina(false);
				
				//SI ES MANUAL
				if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoProduMaquina();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoProduMaquina--;			
			//ProductoProduMaquina productoprodumaquinaAux= new ProductoProduMaquina();			
			//productoprodumaquinaAux.setId(this.iIdNuevoProductoProduMaquina);
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoProduMaquina();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
			
			this.productoprodumaquina.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoprodumaquinaLogic.getProductoProduMaquinas().add(this.productoprodumaquinaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoprodumaquinas.add(this.productoprodumaquinaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoProduMaquina(false);
			
			this.jTableDatosProductoProduMaquina.setRowSelectionInterval(this.getIndiceNuevoProductoProduMaquina(), this.getIndiceNuevoProductoProduMaquina());
			
			int iLastRow =  this.jTableDatosProductoProduMaquina.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoProduMaquina.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoProduMaquina.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoProduMaquina(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoProduMaquina(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduMaquina(false);
			
			//SI ES MANUAL
			if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProduMaquina();
			}
			
			//this.abrirFrameTreeProductoProduMaquina();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Producto Maquina ProduccionES ?", "MANTENIMIENTO DE Producto Maquina Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoProduMaquina.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoProduMaquina();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoprodumaquinaReturnGeneral=productoprodumaquinaLogic.procesarImportacionProductoProduMaquinasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoprodumaquinaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoProduMaquinaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoProduMaquina.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoProduMaquina.setFileImportacion(this.jInternalFrameImportacionProductoProduMaquina.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoProduMaquina.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoProduMaquina.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoProduMaquina.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoProduMaquina.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();		

		productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoProduMaquinaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoProduMaquinaBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoProduMaquinas("Todos",productoprodumaquinasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Maquina Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ProductoDefiProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ProductoDefiProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ProductoDefiProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ProductoDefiProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoAreaEmpresaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoAreaEmpresaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoAreaEmpresaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoAreaEmpresaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProcesoEmpresaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProcesoEmpresaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProcesoEmpresaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProcesoEmpresaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMaquinaEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMaquinaEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMaquinaEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMaquinaEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoProductoProduMaquina.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					sNombreCampoCategoria="id_producto_defi_produ";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU:
					sNombreCampoCategoria="id_tipo_area_empresa_produ";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					sNombreCampoCategoria="id_tipo_proceso_empresa_produ";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA:
					sNombreCampoCategoria="id_tipo_merma_empresa";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					sNombreCampoCategoriaValor="id_producto_defi_produ";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU:
					sNombreCampoCategoriaValor="id_tipo_area_empresa_produ";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					sNombreCampoCategoriaValor="id_tipo_proceso_empresa_produ";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA:
					sNombreCampoCategoriaValor="id_tipo_merma_empresa";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto Defi Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto_defi_produ");
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Area Empresa Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_area_empresa_produ");
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Proceso Empresa Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_proceso_empresa_produ");
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Merma Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_merma_empresa");
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();		
		
		productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumaquina";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoProduMaquinas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
					iRow++;

					for(ProductoProduMaquina productoprodumaquina:productoprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumaquina.getproductodefiprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU);
					iRow++;

					for(ProductoProduMaquina productoprodumaquina:productoprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumaquina.gettipoareaempresaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
					iRow++;

					for(ProductoProduMaquina productoprodumaquina:productoprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumaquina.gettipoprocesoempresaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA);
					iRow++;

					for(ProductoProduMaquina productoprodumaquina:productoprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumaquina.gettipomaquinaempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ProductoProduMaquina productoprodumaquina:productoprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumaquina.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductoProduMaquina productoprodumaquina:productoprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumaquina.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(ProductoProduMaquina productoprodumaquina:productoprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumaquina.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ProductoProduMaquina productoprodumaquina:productoprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumaquina.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoProduMaquina productoprodumaquina:productoprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodumaquina.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelProductoProduMaquina(row);				
			//	iRow++;
			//}				
			
			//for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoProduMaquina(productoprodumaquinaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Maquina Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduMaquina(false);
			
			//SI ES MANUAL
			if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProduMaquina();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduMaquina(false);
			
			//SI ES MANUAL
			if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoProduMaquina();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProduMaquina(false);
			
			//SI ES MANUAL
			if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoProduMaquina();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoProduMaquina() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoProduMaquina.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoProduMaquina.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoProduMaquina.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoProduMaquina.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoProduMaquina.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoProduMaquina.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoProduMaquina.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoProduMaquina(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoProduMaquina(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoProduMaquina(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoProduMaquina(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoProduMaquina(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoProduMaquina(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduMaquina(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoProduMaquina(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoProduMaquina() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoProduMaquina();
		
		this.inicializarActualizarBindingBotonesManualProductoProduMaquina(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoProduMaquina();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduMaquina() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProduMaquina(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProduMaquina(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoProduMaquina.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoProduMaquina.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoProduMaquina.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoProduMaquina.jCheckBoxPostAccionNuevoProductoProduMaquina.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoProduMaquina.jCheckBoxPostAccionSinCerrarProductoProduMaquina.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoProduMaquina.jCheckBoxPostAccionSinMensajeProductoProduMaquina.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoProduMaquina.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoProduMaquina.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoProduMaquina.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
				this.jInternalFrameDetalleFormProductoProduMaquina.jCheckBoxPostAccionNuevoProductoProduMaquina.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoProduMaquina.jCheckBoxPostAccionSinCerrarProductoProduMaquina.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoProduMaquina.jCheckBoxPostAccionSinMensajeProductoProduMaquina.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoProduMaquina.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoProduMaquina.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoProduMaquina.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoProduMaquina!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoProduMaquina.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoProduMaquina.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoProduMaquina.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoProduMaquina.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoProduMaquina!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoProduMaquina.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoProduMaquina.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoProduMaquina(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProduMaquina(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoProduMaquina() throws Exception {
		try	{
			if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoProduMaquina();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoProduMaquina() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoProduMaquina() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoProduMaquina.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoProduMaquina.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoProduMaquina.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoProduMaquina.addItem(reporte);
			}
			
			
			if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoProduMaquina.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoProduMaquina.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoProduMaquina.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoProduMaquina.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoProduMaquina.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoProduMaquina.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProduMaquina();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProduMaquina() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoProduMaquina!=null) {
				this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoProduMaquina!=null) {
				this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoProduMaquina!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoProduMaquinaConstantesFunciones.getTiposSeleccionarProductoProduMaquina(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoProduMaquinaConstantesFunciones.getTiposSeleccionarProductoProduMaquina(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoProduMaquinaConstantesFunciones.getTiposSeleccionarProductoProduMaquina(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProduMaquina.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoProduMaquina.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoProduMaquina()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.getSelectedItem()!=null){this.id_producto_defi_produFK_IdProductoDefiProdu=((ProductoDefiProdu)this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduMaquina.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.getSelectedItem()!=null){this.id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu=((TipoAreaEmpresaProdu)this.jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoProduMaquina.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.getSelectedItem()!=null){this.id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa=((TipoMaquinaEmpresa)this.jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoProduMaquina.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.getSelectedItem()!=null){this.id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu=((TipoProcesoEmpresaProdu)this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoProduMaquina.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadProductoProduMaquina.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoProduMaquina(Boolean esInicializar) throws Exception {				
		if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoProduMaquina();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoProduMaquina() throws Exception {
		this.inicializarActualizarBindingTablaProductoProduMaquina(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoProduMaquina() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoProduMaquinaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquinaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoProduMaquina(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoprodumaquinaLogic.getProductoProduMaquinas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoprodumaquinas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoProduMaquina.setModel(new ProductoProduMaquinaModel(this.productoprodumaquinaLogic.getProductoProduMaquinas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoProduMaquina.setModel(new ProductoProduMaquinaModel(this.productoprodumaquinas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoProduMaquina!=null && this.jInternalFrameOrderByProductoProduMaquina.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoProduMaquina();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO,productoprodumaquinaConstantesFunciones.resaltarSeleccionarProductoProduMaquina,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoProduMaquinaConstantesFunciones.SCLASSWEBTITULO,productoprodumaquinaConstantesFunciones.resaltarSeleccionarProductoProduMaquina,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_ID));

		if(this.productoprodumaquinaConstantesFunciones.mostraridProductoProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMaquinaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodumaquinaConstantesFunciones.resaltaridProductoProduMaquina,this.productoprodumaquinaConstantesFunciones.activaridProductoProduMaquina,iSizeTabla,this,true,"idProductoProduMaquina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumaquinaConstantesFunciones.resaltaridProductoProduMaquina,this.productoprodumaquinaConstantesFunciones.activaridProductoProduMaquina,this,true,"idProductoProduMaquina","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU));

		if(this.productoprodumaquinaConstantesFunciones.mostrarid_producto_defi_produProductoProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoDefiProduTableCell(this.productodefiprodusForeignKey,this.productoprodumaquinaConstantesFunciones.resaltarid_producto_defi_produProductoProduMaquina,this,this.productoprodumaquinaConstantesFunciones.activarid_producto_defi_produProductoProduMaquina,iSizeTabla));
			tableColumn.setCellEditor(new ProductoDefiProduTableCell(this.productodefiprodusForeignKey,this.productoprodumaquinaConstantesFunciones.resaltarid_producto_defi_produProductoProduMaquina,this,this.productoprodumaquinaConstantesFunciones.activarid_producto_defi_produProductoProduMaquina,true,"id_producto_defi_produProductoProduMaquina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU));

		if(this.productoprodumaquinaConstantesFunciones.mostrarid_tipo_area_empresa_produProductoProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoAreaEmpresaProduTableCell(this.tipoareaempresaprodusForeignKey,this.productoprodumaquinaConstantesFunciones.resaltarid_tipo_area_empresa_produProductoProduMaquina,this,this.productoprodumaquinaConstantesFunciones.activarid_tipo_area_empresa_produProductoProduMaquina,iSizeTabla));
			tableColumn.setCellEditor(new TipoAreaEmpresaProduTableCell(this.tipoareaempresaprodusForeignKey,this.productoprodumaquinaConstantesFunciones.resaltarid_tipo_area_empresa_produProductoProduMaquina,this,this.productoprodumaquinaConstantesFunciones.activarid_tipo_area_empresa_produProductoProduMaquina,true,"id_tipo_area_empresa_produProductoProduMaquina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU));

		if(this.productoprodumaquinaConstantesFunciones.mostrarid_tipo_proceso_empresa_produProductoProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProcesoEmpresaProduTableCell(this.tipoprocesoempresaprodusForeignKey,this.productoprodumaquinaConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoProduMaquina,this,this.productoprodumaquinaConstantesFunciones.activarid_tipo_proceso_empresa_produProductoProduMaquina,iSizeTabla));
			tableColumn.setCellEditor(new TipoProcesoEmpresaProduTableCell(this.tipoprocesoempresaprodusForeignKey,this.productoprodumaquinaConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoProduMaquina,this,this.productoprodumaquinaConstantesFunciones.activarid_tipo_proceso_empresa_produProductoProduMaquina,true,"id_tipo_proceso_empresa_produProductoProduMaquina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA));

		if(this.productoprodumaquinaConstantesFunciones.mostrarid_tipo_merma_empresaProductoProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMaquinaEmpresaTableCell(this.tipomaquinaempresasForeignKey,this.productoprodumaquinaConstantesFunciones.resaltarid_tipo_merma_empresaProductoProduMaquina,this,this.productoprodumaquinaConstantesFunciones.activarid_tipo_merma_empresaProductoProduMaquina,iSizeTabla));
			tableColumn.setCellEditor(new TipoMaquinaEmpresaTableCell(this.tipomaquinaempresasForeignKey,this.productoprodumaquinaConstantesFunciones.resaltarid_tipo_merma_empresaProductoProduMaquina,this,this.productoprodumaquinaConstantesFunciones.activarid_tipo_merma_empresaProductoProduMaquina,true,"id_tipo_merma_empresaProductoProduMaquina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD));

		if(this.productoprodumaquinaConstantesFunciones.mostrarid_unidadProductoProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.productoprodumaquinaConstantesFunciones.resaltarid_unidadProductoProduMaquina,this,this.productoprodumaquinaConstantesFunciones.activarid_unidadProductoProduMaquina,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.productoprodumaquinaConstantesFunciones.resaltarid_unidadProductoProduMaquina,this,this.productoprodumaquinaConstantesFunciones.activarid_unidadProductoProduMaquina,true,"id_unidadProductoProduMaquina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD));

		if(this.productoprodumaquinaConstantesFunciones.mostrarcantidadProductoProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodumaquinaConstantesFunciones.resaltarcantidadProductoProduMaquina,this.productoprodumaquinaConstantesFunciones.activarcantidadProductoProduMaquina,iSizeTabla,this,true,"cantidadProductoProduMaquina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumaquinaConstantesFunciones.resaltarcantidadProductoProduMaquina,this.productoprodumaquinaConstantesFunciones.activarcantidadProductoProduMaquina,this,true,"cantidadProductoProduMaquina","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_COSTO));

		if(this.productoprodumaquinaConstantesFunciones.mostrarcostoProductoProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMaquinaConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodumaquinaConstantesFunciones.resaltarcostoProductoProduMaquina,this.productoprodumaquinaConstantesFunciones.activarcostoProductoProduMaquina,iSizeTabla,this,true,"costoProductoProduMaquina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumaquinaConstantesFunciones.resaltarcostoProductoProduMaquina,this.productoprodumaquinaConstantesFunciones.activarcostoProductoProduMaquina,this,true,"costoProductoProduMaquina","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.productoprodumaquinaConstantesFunciones.mostrarcosto_totalProductoProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoprodumaquinaConstantesFunciones.resaltarcosto_totalProductoProduMaquina,this.productoprodumaquinaConstantesFunciones.activarcosto_totalProductoProduMaquina,iSizeTabla,this,true,"costo_totalProductoProduMaquina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumaquinaConstantesFunciones.resaltarcosto_totalProductoProduMaquina,this.productoprodumaquinaConstantesFunciones.activarcosto_totalProductoProduMaquina,this,true,"costo_totalProductoProduMaquina","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productoprodumaquinaConstantesFunciones.mostrardescripcionProductoProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoprodumaquinaConstantesFunciones.resaltardescripcionProductoProduMaquina,this.productoprodumaquinaConstantesFunciones.activardescripcionProductoProduMaquina,iSizeTabla,this,true,"descripcionProductoProduMaquina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoprodumaquinaConstantesFunciones.resaltardescripcionProductoProduMaquina,this.productoprodumaquinaConstantesFunciones.activardescripcionProductoProduMaquina,this,true,"descripcionProductoProduMaquina","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoprodumaquinaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoprodumaquinaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoProduMaquina.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoprodumaquinaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoprodumaquinaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoProduMaquina.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoprodumaquinaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoprodumaquinaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoProduMaquina.addColumn(tableColumn);
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
			
			this.jTableDatosProductoProduMaquina.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoProduMaquina.moveColumn(this.jTableDatosProductoProduMaquina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoProduMaquina.moveColumn(this.jTableDatosProductoProduMaquina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoProduMaquina.moveColumn(this.jTableDatosProductoProduMaquina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoProduMaquina.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoProduMaquina.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoProduMaquina,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoProduMaquina.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoProduMaquina.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoProduMaquina.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoProduMaquina.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoprodumaquinaLogic.getProductoProduMaquinas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoprodumaquinas.size()-1;
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
		//this.jTableDatosProductoProduMaquina.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoProduMaquina();
			
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
				
				//this.isEsNuevoProductoProduMaquina=false;
					
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			
				if(this.productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoProduMaquina==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoProduMaquina.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoProduMaquina.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoprodumaquina.getsType().equals("DUPLICADO")
				   || this.productoprodumaquina.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoProduMaquina=true;
				
				} else {
					this.isEsNuevoProductoProduMaquina=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
					if(this.productoprodumaquina.getId()>=0 && !this.productoprodumaquina.getIsNew()) {						
						this.isEsNuevoProductoProduMaquina=false;
						
					} else {
						this.isEsNuevoProductoProduMaquina=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoProduMaquina(esRelaciones);						
				
				this.seleccionarProductoProduMaquina(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoprodumaquina.getId()<0) {
					this.isEsNuevoProductoProduMaquina=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoProduMaquina(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoProduMaquina(evt,rowIndex);
				}	
				
				if(this.productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoProduMaquina: " + this.dDif); 
					}
				}								
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoProduMaquina(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoprodumaquina)) {
					if(this.productoprodumaquina.getId()>0) {
						this.productoprodumaquina.setIsDeleted(true);
						
						this.productoprodumaquinasEliminados.add(this.productoprodumaquina);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoprodumaquinaLogic.getProductoProduMaquinas().remove(this.productoprodumaquina);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoprodumaquinas.remove(this.productoprodumaquina);				
					}
					
					
					((ProductoProduMaquinaModel) this.jTableDatosProductoProduMaquina.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProduMaquina(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoProduMaquina(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoProduMaquina) {
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoProduMaquina.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoProduMaquina.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoProduMaquina(this.productoprodumaquina);
				}
				
				//ARCHITECTURE
				try {
					

					//ProductoDefiProdu
					if(!this.productoprodumaquinaConstantesFunciones.cargarid_producto_defi_produProductoProduMaquina || this.productoprodumaquinaConstantesFunciones.event_dependid_producto_defi_produProductoProduMaquina) {
						//this.cargarCombosProductoDefiProdusForeignKeyLista(" where id="+this.productoprodumaquina.getid_producto_defi_produ());
									//this.inicializarActualizarBindingProductoProduMaquina(false,false);
						this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>();

						if(productoprodumaquina.getProductoDefiProdu()!=null) {
							this.productodefiprodusForeignKey.add(productoprodumaquina.getProductoDefiProdu());
						}

						this.addItemDefectoCombosForeignKeyProductoDefiProdu();
						this.cargarCombosFrameProductoDefiProdusForeignKey("Todos");
					}
					this.setActualProductoDefiProduForeignKey(this.productoprodumaquina.getid_producto_defi_produ(),false,"Formulario");

					//TipoAreaEmpresaProdu
					if(!this.productoprodumaquinaConstantesFunciones.cargarid_tipo_area_empresa_produProductoProduMaquina || this.productoprodumaquinaConstantesFunciones.event_dependid_tipo_area_empresa_produProductoProduMaquina) {
						//this.cargarCombosTipoAreaEmpresaProdusForeignKeyLista(" where id="+this.productoprodumaquina.getid_tipo_area_empresa_produ());
									//this.inicializarActualizarBindingProductoProduMaquina(false,false);
						this.tipoareaempresaprodusForeignKey=new ArrayList<TipoAreaEmpresaProdu>();

						if(productoprodumaquina.getTipoAreaEmpresaProdu()!=null) {
							this.tipoareaempresaprodusForeignKey.add(productoprodumaquina.getTipoAreaEmpresaProdu());
						}

						this.addItemDefectoCombosForeignKeyTipoAreaEmpresaProdu();
						this.cargarCombosFrameTipoAreaEmpresaProdusForeignKey("Todos");
					}
					this.setActualTipoAreaEmpresaProduForeignKey(this.productoprodumaquina.getid_tipo_area_empresa_produ(),false,"Formulario");

					//TipoProcesoEmpresaProdu
					if(!this.productoprodumaquinaConstantesFunciones.cargarid_tipo_proceso_empresa_produProductoProduMaquina || this.productoprodumaquinaConstantesFunciones.event_dependid_tipo_proceso_empresa_produProductoProduMaquina) {
						//this.cargarCombosTipoProcesoEmpresaProdusForeignKeyLista(" where id="+this.productoprodumaquina.getid_tipo_proceso_empresa_produ());
									//this.inicializarActualizarBindingProductoProduMaquina(false,false);
						this.tipoprocesoempresaprodusForeignKey=new ArrayList<TipoProcesoEmpresaProdu>();

						if(productoprodumaquina.getTipoProcesoEmpresaProdu()!=null) {
							this.tipoprocesoempresaprodusForeignKey.add(productoprodumaquina.getTipoProcesoEmpresaProdu());
						}

						this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
						this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey("Todos");
					}
					this.setActualTipoProcesoEmpresaProduForeignKey(this.productoprodumaquina.getid_tipo_proceso_empresa_produ(),false,"Formulario");

					//TipoMaquinaEmpresa
					if(!this.productoprodumaquinaConstantesFunciones.cargarid_tipo_merma_empresaProductoProduMaquina || this.productoprodumaquinaConstantesFunciones.event_dependid_tipo_merma_empresaProductoProduMaquina) {
						//this.cargarCombosTipoMaquinaEmpresasForeignKeyLista(" where id="+this.productoprodumaquina.getid_tipo_merma_empresa());
									//this.inicializarActualizarBindingProductoProduMaquina(false,false);
						this.tipomaquinaempresasForeignKey=new ArrayList<TipoMaquinaEmpresa>();

						if(productoprodumaquina.getTipoMaquinaEmpresa()!=null) {
							this.tipomaquinaempresasForeignKey.add(productoprodumaquina.getTipoMaquinaEmpresa());
						}

						this.addItemDefectoCombosForeignKeyTipoMaquinaEmpresa();
						this.cargarCombosFrameTipoMaquinaEmpresasForeignKey("Todos");
					}
					this.setActualTipoMaquinaEmpresaForeignKey(this.productoprodumaquina.getid_tipo_merma_empresa(),false,"Formulario");

					//Unidad
					if(!this.productoprodumaquinaConstantesFunciones.cargarid_unidadProductoProduMaquina || this.productoprodumaquinaConstantesFunciones.event_dependid_unidadProductoProduMaquina) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.productoprodumaquina.getid_unidad());
									//this.inicializarActualizarBindingProductoProduMaquina(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(productoprodumaquina.getUnidad()!=null) {
							this.unidadsForeignKey.add(productoprodumaquina.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.productoprodumaquina.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoProduMaquina("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoProduMaquina(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProduMaquina() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoProduMaquina(ProductoProduMaquina productoprodumaquina) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoProduMaquina(productoprodumaquina,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoProduMaquina(ProductoProduMaquina productoprodumaquina,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoProduMaquina(productoprodumaquina);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoProduMaquina(productoprodumaquina,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoProduMaquina(productoprodumaquina);
	}
	
	public void setVariablesObjetoActualToFormularioProductoProduMaquina(ProductoProduMaquina productoprodumaquina) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoProduMaquina.jLabelidProductoProduMaquina.setText(productoprodumaquina.getId().toString());
			this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcantidadProductoProduMaquina.setText(productoprodumaquina.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcostoProductoProduMaquina.setText(productoprodumaquina.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcosto_totalProductoProduMaquina.setText(productoprodumaquina.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProduMaquina.jTextAreadescripcionProductoProduMaquina.setText(productoprodumaquina.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoProduMaquina productoprodumaquinaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoprodumaquinaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoProduMaquina productoprodumaquinaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoprodumaquinaLocal=this.productoprodumaquina;
			} else {
				productoprodumaquinaLocal=this.productoprodumaquinaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoprodumaquinaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoProduMaquina(productoprodumaquinaLocal,true);
					
					if(productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoprodumaquinaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoprodumaquinaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoProduMaquina(ProductoProduMaquina productoprodumaquina,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoProduMaquina(productoprodumaquina,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(productoprodumaquina);
	}
	
	public void setVariablesFormularioToObjetoActualProductoProduMaquina(ProductoProduMaquina productoprodumaquina,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoProduMaquina(productoprodumaquina,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoProduMaquina(ProductoProduMaquina productoprodumaquina,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoProduMaquina.jLabelidProductoProduMaquina.getText()==null || this.jInternalFrameDetalleFormProductoProduMaquina.jLabelidProductoProduMaquina.getText()=="" || this.jInternalFrameDetalleFormProductoProduMaquina.jLabelidProductoProduMaquina.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoProduMaquina.jLabelidProductoProduMaquina.setText("0");
			}

			if(conColumnasBase) {productoprodumaquina.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoProduMaquina.jLabelidProductoProduMaquina.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduMaquinaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelIdProductoProduMaquina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodumaquina.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcantidadProductoProduMaquina.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelcantidadProductoProduMaquina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodumaquina.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcostoProductoProduMaquina.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduMaquinaConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelcostoProductoProduMaquina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodumaquina.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcosto_totalProductoProduMaquina.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabelcosto_totalProductoProduMaquina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodumaquina.setdescripcion(this.jInternalFrameDetalleFormProductoProduMaquina.jTextAreadescripcionProductoProduMaquina.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProduMaquina.jLabeldescripcionProductoProduMaquina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoProduMaquina(ProductoProduMaquina productoprodumaquinaBean,ProductoProduMaquina productoprodumaquina,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoprodumaquinaBean.getid_producto_defi_produ()!=null && !productoprodumaquinaBean.getid_producto_defi_produ().equals(-1L))) {productoprodumaquina.setid_producto_defi_produ(productoprodumaquinaBean.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoprodumaquinaBean.getid_tipo_area_empresa_produ()!=null && !productoprodumaquinaBean.getid_tipo_area_empresa_produ().equals(-1L))) {productoprodumaquina.setid_tipo_area_empresa_produ(productoprodumaquinaBean.getid_tipo_area_empresa_produ());}
			if(conDefault || (!conDefault && productoprodumaquinaBean.getid_tipo_proceso_empresa_produ()!=null && !productoprodumaquinaBean.getid_tipo_proceso_empresa_produ().equals(-1L))) {productoprodumaquina.setid_tipo_proceso_empresa_produ(productoprodumaquinaBean.getid_tipo_proceso_empresa_produ());}
			if(conDefault || (!conDefault && productoprodumaquinaBean.getid_tipo_merma_empresa()!=null && !productoprodumaquinaBean.getid_tipo_merma_empresa().equals(-1L))) {productoprodumaquina.setid_tipo_merma_empresa(productoprodumaquinaBean.getid_tipo_merma_empresa());}
			if(conDefault || (!conDefault && productoprodumaquinaBean.getid_unidad()!=null && !productoprodumaquinaBean.getid_unidad().equals(-1L))) {productoprodumaquina.setid_unidad(productoprodumaquinaBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoProduMaquina(ProductoProduMaquina productoprodumaquinaOrigen,ProductoProduMaquina productoprodumaquina,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoprodumaquinaOrigen.getId()!=null && !productoprodumaquinaOrigen.getId().equals(0L))) {productoprodumaquina.setId(productoprodumaquinaOrigen.getId());}}
			if(conDefault || (!conDefault && productoprodumaquinaOrigen.getid_producto_defi_produ()!=null && !productoprodumaquinaOrigen.getid_producto_defi_produ().equals(-1L))) {productoprodumaquina.setid_producto_defi_produ(productoprodumaquinaOrigen.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoprodumaquinaOrigen.getid_tipo_area_empresa_produ()!=null && !productoprodumaquinaOrigen.getid_tipo_area_empresa_produ().equals(-1L))) {productoprodumaquina.setid_tipo_area_empresa_produ(productoprodumaquinaOrigen.getid_tipo_area_empresa_produ());}
			if(conDefault || (!conDefault && productoprodumaquinaOrigen.getid_tipo_proceso_empresa_produ()!=null && !productoprodumaquinaOrigen.getid_tipo_proceso_empresa_produ().equals(-1L))) {productoprodumaquina.setid_tipo_proceso_empresa_produ(productoprodumaquinaOrigen.getid_tipo_proceso_empresa_produ());}
			if(conDefault || (!conDefault && productoprodumaquinaOrigen.getid_tipo_merma_empresa()!=null && !productoprodumaquinaOrigen.getid_tipo_merma_empresa().equals(-1L))) {productoprodumaquina.setid_tipo_merma_empresa(productoprodumaquinaOrigen.getid_tipo_merma_empresa());}
			if(conDefault || (!conDefault && productoprodumaquinaOrigen.getid_unidad()!=null && !productoprodumaquinaOrigen.getid_unidad().equals(-1L))) {productoprodumaquina.setid_unidad(productoprodumaquinaOrigen.getid_unidad());}
			if(conDefault || (!conDefault && productoprodumaquinaOrigen.getcantidad()!=null && !productoprodumaquinaOrigen.getcantidad().equals(0))) {productoprodumaquina.setcantidad(productoprodumaquinaOrigen.getcantidad());}
			if(conDefault || (!conDefault && productoprodumaquinaOrigen.getcosto()!=null && !productoprodumaquinaOrigen.getcosto().equals(0.0))) {productoprodumaquina.setcosto(productoprodumaquinaOrigen.getcosto());}
			if(conDefault || (!conDefault && productoprodumaquinaOrigen.getcosto_total()!=null && !productoprodumaquinaOrigen.getcosto_total().equals(0.0))) {productoprodumaquina.setcosto_total(productoprodumaquinaOrigen.getcosto_total());}
			if(conDefault || (!conDefault && productoprodumaquinaOrigen.getdescripcion()!=null && !productoprodumaquinaOrigen.getdescripcion().equals(""))) {productoprodumaquina.setdescripcion(productoprodumaquinaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoProduMaquina(ProductoProduMaquina productoprodumaquina) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoProduMaquina.jLabelidProductoProduMaquina.setText(productoprodumaquina.getId().toString());
			this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcantidadProductoProduMaquina.setText(productoprodumaquina.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcostoProductoProduMaquina.setText(productoprodumaquina.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcosto_totalProductoProduMaquina.setText(productoprodumaquina.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProduMaquina.jTextAreadescripcionProductoProduMaquina.setText(productoprodumaquina.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoProduMaquina(ProductoProduMaquinaBean productoprodumaquinaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoProduMaquina.jLabelidProductoProduMaquina.setText(productoprodumaquinaBean.getId().toString());
			this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcantidadProductoProduMaquina.setText(productoprodumaquinaBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcostoProductoProduMaquina.setText(productoprodumaquinaBean.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcosto_totalProductoProduMaquina.setText(productoprodumaquinaBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProduMaquina.jTextAreadescripcionProductoProduMaquina.setText(productoprodumaquinaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoProduMaquina(ProductoProduMaquinaParameterReturnGeneral productoprodumaquinaReturnGeneral,ProductoProduMaquinaBean productoprodumaquinaBean,Boolean conDefault) throws Exception { 
		try {
			ProductoProduMaquina productoprodumaquinaLocal=new ProductoProduMaquina();
			
			productoprodumaquinaLocal=productoprodumaquinaReturnGeneral.getProductoProduMaquina();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoprodumaquinaLocal.getId()!=null && !productoprodumaquinaLocal.getId().equals(0L))) {productoprodumaquinaBean.setId(productoprodumaquinaLocal.getId());}}
			if(conDefault || (!conDefault && productoprodumaquinaLocal.getid_producto_defi_produ()!=null && !productoprodumaquinaLocal.getid_producto_defi_produ().equals(-1L))) {productoprodumaquinaBean.setid_producto_defi_produ(productoprodumaquinaLocal.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoprodumaquinaLocal.getid_tipo_area_empresa_produ()!=null && !productoprodumaquinaLocal.getid_tipo_area_empresa_produ().equals(-1L))) {productoprodumaquinaBean.setid_tipo_area_empresa_produ(productoprodumaquinaLocal.getid_tipo_area_empresa_produ());}
			if(conDefault || (!conDefault && productoprodumaquinaLocal.getid_tipo_proceso_empresa_produ()!=null && !productoprodumaquinaLocal.getid_tipo_proceso_empresa_produ().equals(-1L))) {productoprodumaquinaBean.setid_tipo_proceso_empresa_produ(productoprodumaquinaLocal.getid_tipo_proceso_empresa_produ());}
			if(conDefault || (!conDefault && productoprodumaquinaLocal.getid_tipo_merma_empresa()!=null && !productoprodumaquinaLocal.getid_tipo_merma_empresa().equals(-1L))) {productoprodumaquinaBean.setid_tipo_merma_empresa(productoprodumaquinaLocal.getid_tipo_merma_empresa());}
			if(conDefault || (!conDefault && productoprodumaquinaLocal.getid_unidad()!=null && !productoprodumaquinaLocal.getid_unidad().equals(-1L))) {productoprodumaquinaBean.setid_unidad(productoprodumaquinaLocal.getid_unidad());}
			if(conDefault || (!conDefault && productoprodumaquinaLocal.getcantidad()!=null && !productoprodumaquinaLocal.getcantidad().equals(0))) {productoprodumaquinaBean.setcantidad(productoprodumaquinaLocal.getcantidad());}
			if(conDefault || (!conDefault && productoprodumaquinaLocal.getcosto()!=null && !productoprodumaquinaLocal.getcosto().equals(0.0))) {productoprodumaquinaBean.setcosto(productoprodumaquinaLocal.getcosto());}
			if(conDefault || (!conDefault && productoprodumaquinaLocal.getcosto_total()!=null && !productoprodumaquinaLocal.getcosto_total().equals(0.0))) {productoprodumaquinaBean.setcosto_total(productoprodumaquinaLocal.getcosto_total());}
			if(conDefault || (!conDefault && productoprodumaquinaLocal.getdescripcion()!=null && !productoprodumaquinaLocal.getdescripcion().equals(""))) {productoprodumaquinaBean.setdescripcion(productoprodumaquinaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoProduMaquinaGenerico(Long idProductoProduMaquinaSeleccionado,JComboBox jComboBoxProductoProduMaquina,List<ProductoProduMaquina> productoprodumaquinasLocal)throws Exception {
		try {
			ProductoProduMaquina  productoprodumaquinaTemp=null;

			for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinasLocal) {
				if(productoprodumaquinaAux.getId()!=null && productoprodumaquinaAux.getId().equals(idProductoProduMaquinaSeleccionado)) {
					productoprodumaquinaTemp=productoprodumaquinaAux;
					break;
				}
			}

			jComboBoxProductoProduMaquina.setSelectedItem(productoprodumaquinaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoProduMaquinaGenerico(JComboBox jComboBoxProductoProduMaquina,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoProduMaquina.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoProduMaquina.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoProduMaquina.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoProduMaquina.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodumaquina=(ProductoProduMaquina) productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoprodumaquina =(ProductoProduMaquina) productoprodumaquinas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("ProductoDefiProdu")) {
			//sDescripcion=this.getActualProductoDefiProduForeignKeyDescripcion((Long)value);
			if(!productoprodumaquina.getIsNew() && !productoprodumaquina.getIsChanged() && !productoprodumaquina.getIsDeleted()) {
				sDescripcion=productoprodumaquina.getproductodefiprodu_descripcion();
			} else {
				//sDescripcion=this.getActualProductoDefiProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodumaquina.getproductodefiprodu_descripcion();
			}
		}

		if(sTipo.equals("TipoAreaEmpresaProdu")) {
			//sDescripcion=this.getActualTipoAreaEmpresaProduForeignKeyDescripcion((Long)value);
			if(!productoprodumaquina.getIsNew() && !productoprodumaquina.getIsChanged() && !productoprodumaquina.getIsDeleted()) {
				sDescripcion=productoprodumaquina.gettipoareaempresaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualTipoAreaEmpresaProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodumaquina.gettipoareaempresaprodu_descripcion();
			}
		}

		if(sTipo.equals("TipoProcesoEmpresaProdu")) {
			//sDescripcion=this.getActualTipoProcesoEmpresaProduForeignKeyDescripcion((Long)value);
			if(!productoprodumaquina.getIsNew() && !productoprodumaquina.getIsChanged() && !productoprodumaquina.getIsDeleted()) {
				sDescripcion=productoprodumaquina.gettipoprocesoempresaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProcesoEmpresaProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodumaquina.gettipoprocesoempresaprodu_descripcion();
			}
		}

		if(sTipo.equals("TipoMaquinaEmpresa")) {
			//sDescripcion=this.getActualTipoMaquinaEmpresaForeignKeyDescripcion((Long)value);
			if(!productoprodumaquina.getIsNew() && !productoprodumaquina.getIsChanged() && !productoprodumaquina.getIsDeleted()) {
				sDescripcion=productoprodumaquina.gettipomaquinaempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMaquinaEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodumaquina.gettipomaquinaempresa_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!productoprodumaquina.getIsNew() && !productoprodumaquina.getIsChanged() && !productoprodumaquina.getIsDeleted()) {
				sDescripcion=productoprodumaquina.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodumaquina.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoProduMaquina productoprodumaquinaRow=new ProductoProduMaquina();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodumaquinaRow=(ProductoProduMaquina) productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoprodumaquinaRow=(ProductoProduMaquina) productoprodumaquinas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoProduMaquina(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoProduMaquina.setVisible((this.isVisibilidadCeldaNuevoProductoProduMaquina && this.isPermisoNuevoProductoProduMaquina));			
			this.jButtonDuplicarProductoProduMaquina.setVisible((this.isVisibilidadCeldaDuplicarProductoProduMaquina && this.isPermisoDuplicarProductoProduMaquina));			
			this.jButtonCopiarProductoProduMaquina.setVisible((this.isVisibilidadCeldaCopiarProductoProduMaquina && this.isPermisoCopiarProductoProduMaquina));
			this.jButtonVerFormProductoProduMaquina.setVisible((this.isVisibilidadCeldaVerFormProductoProduMaquina && this.isPermisoVerFormProductoProduMaquina));
			
			this.jButtonAbrirOrderByProductoProduMaquina.setVisible((this.isVisibilidadCeldaOrdenProductoProduMaquina && this.isPermisoOrdenProductoProduMaquina));			
			
			this.jButtonNuevoRelacionesProductoProduMaquina.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina && this.isPermisoNuevoProductoProduMaquina));			
			this.jButtonNuevoGuardarCambiosProductoProduMaquina.setVisible((this.isVisibilidadCeldaNuevoProductoProduMaquina && this.isPermisoNuevoProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina));
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonModificarProductoProduMaquina.setVisible((this.isVisibilidadCeldaModificarProductoProduMaquina && this.isPermisoActualizarProductoProduMaquina));	
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonActualizarProductoProduMaquina.setVisible((this.isVisibilidadCeldaActualizarProductoProduMaquina && this.isPermisoActualizarProductoProduMaquina));	
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonEliminarProductoProduMaquina.setVisible((this.isVisibilidadCeldaEliminarProductoProduMaquina && this.isPermisoEliminarProductoProduMaquina));
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonCancelarProductoProduMaquina.setVisible(this.isVisibilidadCeldaCancelarProductoProduMaquina);							
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonGuardarCambiosProductoProduMaquina.setVisible((this.isVisibilidadCeldaGuardarProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoProduMaquina.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoProduMaquina.setVisible((this.isVisibilidadCeldaNuevoProductoProduMaquina && this.isPermisoNuevoProductoProduMaquina));						
			this.jButtonDuplicarToolBarProductoProduMaquina.setVisible((this.isVisibilidadCeldaDuplicarProductoProduMaquina && this.isPermisoDuplicarProductoProduMaquina));						
			this.jButtonCopiarToolBarProductoProduMaquina.setVisible((this.isVisibilidadCeldaCopiarProductoProduMaquina && this.isPermisoCopiarProductoProduMaquina));			
			this.jButtonVerFormToolBarProductoProduMaquina.setVisible((this.isVisibilidadCeldaVerFormProductoProduMaquina && this.isPermisoVerFormProductoProduMaquina));			
			this.jButtonAbrirOrderByToolBarProductoProduMaquina.setVisible((this.isVisibilidadCeldaOrdenProductoProduMaquina && this.isPermisoOrdenProductoProduMaquina));
			this.jButtonNuevoRelacionesToolBarProductoProduMaquina.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina && this.isPermisoNuevoProductoProduMaquina));			
			this.jButtonNuevoGuardarCambiosToolBarProductoProduMaquina.setVisible((this.isVisibilidadCeldaNuevoProductoProduMaquina && this.isPermisoNuevoProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina));			
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonModificarToolBarProductoProduMaquina.setVisible((this.isVisibilidadCeldaModificarProductoProduMaquina && this.isPermisoActualizarProductoProduMaquina));	
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonActualizarToolBarProductoProduMaquina.setVisible((this.isVisibilidadCeldaActualizarProductoProduMaquina  && this.isPermisoActualizarProductoProduMaquina));	
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonEliminarToolBarProductoProduMaquina.setVisible((this.isVisibilidadCeldaEliminarProductoProduMaquina && this.isPermisoEliminarProductoProduMaquina));
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonCancelarToolBarProductoProduMaquina.setVisible(this.isVisibilidadCeldaCancelarProductoProduMaquina);				
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonGuardarCambiosToolBarProductoProduMaquina.setVisible((this.isVisibilidadCeldaGuardarProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoProduMaquina.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoProduMaquina.setVisible((this.isVisibilidadCeldaNuevoProductoProduMaquina && this.isPermisoNuevoProductoProduMaquina));			
			this.jMenuItemDuplicarProductoProduMaquina.setVisible((this.isVisibilidadCeldaDuplicarProductoProduMaquina && this.isPermisoDuplicarProductoProduMaquina));			
			this.jMenuItemCopiarProductoProduMaquina.setVisible((this.isVisibilidadCeldaCopiarProductoProduMaquina && this.isPermisoCopiarProductoProduMaquina));			
			this.jMenuItemVerFormProductoProduMaquina.setVisible((this.isVisibilidadCeldaVerFormProductoProduMaquina && this.isPermisoVerFormProductoProduMaquina));			
			this.jMenuItemAbrirOrderByProductoProduMaquina.setVisible((this.isVisibilidadCeldaOrdenProductoProduMaquina && this.isPermisoOrdenProductoProduMaquina));			
			//this.jMenuItemMostrarOcultarProductoProduMaquina.setVisible((this.isVisibilidadCeldaOrdenProductoProduMaquina && this.isPermisoOrdenProductoProduMaquina));
			this.jMenuItemDetalleAbrirOrderByProductoProduMaquina.setVisible((this.isVisibilidadCeldaOrdenProductoProduMaquina && this.isPermisoOrdenProductoProduMaquina));			
			//this.jMenuItemDetalleMostrarOcultarProductoProduMaquina.setVisible((this.isVisibilidadCeldaOrdenProductoProduMaquina && this.isPermisoOrdenProductoProduMaquina));			
			this.jMenuItemNuevoRelacionesProductoProduMaquina.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina && this.isPermisoNuevoProductoProduMaquina));			
			this.jMenuItemNuevoGuardarCambiosProductoProduMaquina.setVisible((this.isVisibilidadCeldaNuevoProductoProduMaquina && this.isPermisoNuevoProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina));									
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemModificarProductoProduMaquina.setVisible((this.isVisibilidadCeldaModificarProductoProduMaquina && this.isPermisoActualizarProductoProduMaquina));	
			this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemActualizarProductoProduMaquina.setVisible((this.isVisibilidadCeldaActualizarProductoProduMaquina && this.isPermisoActualizarProductoProduMaquina));	
			this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemEliminarProductoProduMaquina.setVisible((this.isVisibilidadCeldaEliminarProductoProduMaquina && this.isPermisoEliminarProductoProduMaquina));
			this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemCancelarProductoProduMaquina.setVisible(this.isVisibilidadCeldaCancelarProductoProduMaquina);				
			}
			
			this.jMenuItemGuardarCambiosProductoProduMaquina.setVisible((this.isVisibilidadCeldaGuardarProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina));						
			this.jMenuItemGuardarCambiosTablaProductoProduMaquina.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoProduMaquina=this.jButtonNuevoProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaDuplicarProductoProduMaquina=this.jButtonDuplicarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaCopiarProductoProduMaquina=this.jButtonCopiarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaVerFormProductoProduMaquina=this.jButtonVerFormProductoProduMaquina.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoProduMaquina=this.jButtonAbrirOrderByProductoProduMaquina.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=this.jButtonNuevoRelacionesProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaModificarProductoProduMaquina=this.jButtonModificarProductoProduMaquina.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			this.isVisibilidadCeldaActualizarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jButtonActualizarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaEliminarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jButtonEliminarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaCancelarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jButtonCancelarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaGuardarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jButtonGuardarCambiosProductoProduMaquina.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=this.jButtonGuardarCambiosTablaProductoProduMaquina.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoProduMaquina=this.jButtonNuevoToolBarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=this.jButtonNuevoRelacionesToolBarProductoProduMaquina.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			this.isVisibilidadCeldaModificarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jButtonModificarToolBarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaActualizarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jButtonActualizarToolBarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaEliminarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jButtonEliminarToolBarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaCancelarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jButtonCancelarToolBarProductoProduMaquina.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoProduMaquina=this.jButtonGuardarCambiosToolBarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=this.jButtonGuardarCambiosTablaToolBarProductoProduMaquina.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoProduMaquina=this.jMenuItemNuevoProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=this.jMenuItemNuevoRelacionesProductoProduMaquina.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			this.isVisibilidadCeldaModificarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemModificarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaActualizarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemActualizarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaEliminarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemEliminarProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaCancelarProductoProduMaquina=this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemCancelarProductoProduMaquina.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoProduMaquina=this.jMenuItemGuardarCambiosProductoProduMaquina.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=this.jMenuItemGuardarCambiosTablaProductoProduMaquina.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoProduMaquina(Boolean esInicializar) {
		if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
				//if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoProduMaquina();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoProduMaquina(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoProduMaquina() {
		this.jButtonNuevoProductoProduMaquina.setVisible(this.isPermisoNuevoProductoProduMaquina);			
		this.jButtonDuplicarProductoProduMaquina.setVisible(this.isPermisoDuplicarProductoProduMaquina);			
		this.jButtonCopiarProductoProduMaquina.setVisible(this.isPermisoCopiarProductoProduMaquina);			
		this.jButtonVerFormProductoProduMaquina.setVisible(this.isPermisoVerFormProductoProduMaquina);			
		
		this.jButtonAbrirOrderByProductoProduMaquina.setVisible(this.isPermisoOrdenProductoProduMaquina);					
		
		this.jButtonNuevoRelacionesProductoProduMaquina.setVisible(this.isPermisoNuevoProductoProduMaquina);			
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonModificarProductoProduMaquina.setVisible(this.isPermisoActualizarProductoProduMaquina);	
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonActualizarProductoProduMaquina.setVisible(this.isPermisoActualizarProductoProduMaquina);	
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonEliminarProductoProduMaquina.setVisible(this.isPermisoEliminarProductoProduMaquina);
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonCancelarProductoProduMaquina.setVisible(this.isVisibilidadCeldaCancelarProductoProduMaquina);						
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonGuardarCambiosProductoProduMaquina.setVisible(this.isPermisoGuardarCambiosProductoProduMaquina);							
		}
		
		this.jButtonGuardarCambiosTablaProductoProduMaquina.setVisible(this.isPermisoActualizarProductoProduMaquina);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoProduMaquina() {
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonModificarProductoProduMaquina.setVisible(this.isPermisoActualizarProductoProduMaquina);	
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonActualizarProductoProduMaquina.setVisible(this.isPermisoActualizarProductoProduMaquina);	
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonEliminarProductoProduMaquina.setVisible(this.isPermisoEliminarProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonCancelarProductoProduMaquina.setVisible(this.isVisibilidadCeldaCancelarProductoProduMaquina);							
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonGuardarCambiosProductoProduMaquina.setVisible((this.isVisibilidadCeldaGuardarProductoProduMaquina && this.isPermisoGuardarCambiosProductoProduMaquina));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoProduMaquina() {
		if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoProduMaquina();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoProduMaquina() {
	}
	
	public void jTableDatosProductoProduMaquinaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoProduMaquina(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumaquina==null) {
						this.productoprodumaquina = new ProductoProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
				}

				if(this.productoprodumaquina.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoprodumaquina.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_producto_defi_produProductoProduMaquinaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproductodefiprodu=true;

			idTienePermisoproductodefiprodu=this.tienePermisosUsuarioEnPaginaWebProductoProduMaquina(ProductoDefiProduConstantesFunciones.CLASSNAME);

			if(idTienePermisoproductodefiprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduMaquina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduMaquina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);

				this.productodefiproduBeanSwingJInternalFrame=new ProductoDefiProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productodefiproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productodefiproduBeanSwingJInternalFrame.getProductoDefiProduLogic().setConnexion(this.productoprodumaquinaLogic.getConnexion());

				if(this.productoprodumaquina.getid_producto_defi_produ()!=null) {
					this.productodefiproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productodefiproduBeanSwingJInternalFrame.setIdActual(this.productoprodumaquina.getid_producto_defi_produ());
					this.productodefiproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productodefiproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productodefiproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoDefiProdu();
				}

				JInternalFrameBase jinternalFrame =this.productodefiproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduMaquina=(TitledBorder)this.jScrollPanelDatosProductoProduMaquina.getBorder();
				TitledBorder titledBorderproductodefiprodu=(TitledBorder)this.productodefiproduBeanSwingJInternalFrame.jScrollPanelDatosProductoDefiProdu.getBorder();

				titledBorderproductodefiprodu.setTitle(titledBorderProductoProduMaquina.getTitle() + " -> Producto Definicion Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_producto_defi_produProductoProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumaquina==null) {
						this.productoprodumaquina = new ProductoProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
				}

				if(this.productoprodumaquina.getid_producto_defi_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto_defi_produ = "+this.productoprodumaquina.getid_producto_defi_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoareaempresaprodu=true;

			idTienePermisotipoareaempresaprodu=this.tienePermisosUsuarioEnPaginaWebProductoProduMaquina(TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoareaempresaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduMaquina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduMaquina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);

				this.tipoareaempresaproduBeanSwingJInternalFrame=new TipoAreaEmpresaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoareaempresaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoareaempresaproduBeanSwingJInternalFrame.getTipoAreaEmpresaProduLogic().setConnexion(this.productoprodumaquinaLogic.getConnexion());

				if(this.productoprodumaquina.getid_tipo_area_empresa_produ()!=null) {
					this.tipoareaempresaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoareaempresaproduBeanSwingJInternalFrame.setIdActual(this.productoprodumaquina.getid_tipo_area_empresa_produ());
					this.tipoareaempresaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoareaempresaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoareaempresaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoAreaEmpresaProdu();
				}

				JInternalFrameBase jinternalFrame =this.tipoareaempresaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduMaquina=(TitledBorder)this.jScrollPanelDatosProductoProduMaquina.getBorder();
				TitledBorder titledBordertipoareaempresaprodu=(TitledBorder)this.tipoareaempresaproduBeanSwingJInternalFrame.jScrollPanelDatosTipoAreaEmpresaProdu.getBorder();

				titledBordertipoareaempresaprodu.setTitle(titledBorderProductoProduMaquina.getTitle() + " -> Tipo Area Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_area_empresa_produProductoProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumaquina==null) {
						this.productoprodumaquina = new ProductoProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
				}

				if(this.productoprodumaquina.getid_tipo_area_empresa_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_area_empresa_produ = "+this.productoprodumaquina.getid_tipo_area_empresa_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprocesoempresaprodu=true;

			idTienePermisotipoprocesoempresaprodu=this.tienePermisosUsuarioEnPaginaWebProductoProduMaquina(TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprocesoempresaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduMaquina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduMaquina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);

				this.tipoprocesoempresaproduBeanSwingJInternalFrame=new TipoProcesoEmpresaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprocesoempresaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprocesoempresaproduBeanSwingJInternalFrame.getTipoProcesoEmpresaProduLogic().setConnexion(this.productoprodumaquinaLogic.getConnexion());

				if(this.productoprodumaquina.getid_tipo_proceso_empresa_produ()!=null) {
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.setIdActual(this.productoprodumaquina.getid_tipo_proceso_empresa_produ());
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu();
				}

				JInternalFrameBase jinternalFrame =this.tipoprocesoempresaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduMaquina=(TitledBorder)this.jScrollPanelDatosProductoProduMaquina.getBorder();
				TitledBorder titledBordertipoprocesoempresaprodu=(TitledBorder)this.tipoprocesoempresaproduBeanSwingJInternalFrame.jScrollPanelDatosTipoProcesoEmpresaProdu.getBorder();

				titledBordertipoprocesoempresaprodu.setTitle(titledBorderProductoProduMaquina.getTitle() + " -> Tipo Proceso Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumaquina==null) {
						this.productoprodumaquina = new ProductoProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
				}

				if(this.productoprodumaquina.getid_tipo_proceso_empresa_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_proceso_empresa_produ = "+this.productoprodumaquina.getid_tipo_proceso_empresa_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_merma_empresaProductoProduMaquinaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomaquinaempresa=true;

			idTienePermisotipomaquinaempresa=this.tienePermisosUsuarioEnPaginaWebProductoProduMaquina(TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomaquinaempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduMaquina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduMaquina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);

				this.tipomaquinaempresaBeanSwingJInternalFrame=new TipoMaquinaEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomaquinaempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomaquinaempresaBeanSwingJInternalFrame.getTipoMaquinaEmpresaLogic().setConnexion(this.productoprodumaquinaLogic.getConnexion());

				if(this.productoprodumaquina.getid_tipo_merma_empresa()!=null) {
					this.tipomaquinaempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomaquinaempresaBeanSwingJInternalFrame.setIdActual(this.productoprodumaquina.getid_tipo_merma_empresa());
					this.tipomaquinaempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomaquinaempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomaquinaempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMaquinaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipomaquinaempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduMaquina=(TitledBorder)this.jScrollPanelDatosProductoProduMaquina.getBorder();
				TitledBorder titledBordertipomaquinaempresa=(TitledBorder)this.tipomaquinaempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoMaquinaEmpresa.getBorder();

				titledBordertipomaquinaempresa.setTitle(titledBorderProductoProduMaquina.getTitle() + " -> Tipo Maquina Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_merma_empresaProductoProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumaquina==null) {
						this.productoprodumaquina = new ProductoProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
				}

				if(this.productoprodumaquina.getid_tipo_merma_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_merma_empresa = "+this.productoprodumaquina.getid_tipo_merma_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadProductoProduMaquinaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebProductoProduMaquina(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProduMaquina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProduMaquina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.productoprodumaquinaLogic.getConnexion());

				if(this.productoprodumaquina.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.productoprodumaquina.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProduMaquina=(TitledBorder)this.jScrollPanelDatosProductoProduMaquina.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderProductoProduMaquina.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadProductoProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumaquina==null) {
						this.productoprodumaquina = new ProductoProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
				}

				if(this.productoprodumaquina.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.productoprodumaquina.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductoProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumaquina==null) {
						this.productoprodumaquina = new ProductoProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
				}

				if(this.productoprodumaquina.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productoprodumaquina.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoProductoProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumaquina==null) {
						this.productoprodumaquina = new ProductoProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
				}

				if(this.productoprodumaquina.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.productoprodumaquina.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalProductoProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumaquina==null) {
						this.productoprodumaquina = new ProductoProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
				}

				if(this.productoprodumaquina.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.productoprodumaquina.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.getproductoprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodumaquina==null) {
						this.productoprodumaquina = new ProductoProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);
				}

				if(this.productoprodumaquina.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productoprodumaquina.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdProductoDefiProduProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduMaquina(false,false);

			this.getProductoProduMaquinasFK_IdProductoDefiProdu();

			this.inicializarActualizarBindingProductoProduMaquina(false);

			//if(ProductoProduMaquinaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduMaquina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoAreaEmpresaProduProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduMaquina(false,false);

			this.getProductoProduMaquinasFK_IdTipoAreaEmpresaProdu();

			this.inicializarActualizarBindingProductoProduMaquina(false);

			//if(ProductoProduMaquinaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduMaquina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMaquinaEmpresaProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduMaquina(false,false);

			this.getProductoProduMaquinasFK_IdTipoMaquinaEmpresa();

			this.inicializarActualizarBindingProductoProduMaquina(false);

			//if(ProductoProduMaquinaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduMaquina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProcesoEmpresaProduProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduMaquina(false,false);

			this.getProductoProduMaquinasFK_IdTipoProcesoEmpresaProdu();

			this.inicializarActualizarBindingProductoProduMaquina(false);

			//if(ProductoProduMaquinaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduMaquina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadProductoProduMaquinaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProduMaquina(false,false);

			this.getProductoProduMaquinasFK_IdUnidad();

			this.inicializarActualizarBindingProductoProduMaquina(false);

			//if(ProductoProduMaquinaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProduMaquina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoProduMaquina() {
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
			this.jInternalFrameDetalleFormProductoProduMaquina.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoProduMaquina.dispose();
			this.jInternalFrameDetalleFormProductoProduMaquina=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoProduMaquina!=null) {
			this.jInternalFrameReporteDinamicoProductoProduMaquina.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoProduMaquina.dispose();
			this.jInternalFrameReporteDinamicoProductoProduMaquina=null;
		}
		
		if(this.jInternalFrameImportacionProductoProduMaquina!=null) {
			this.jInternalFrameImportacionProductoProduMaquina.setVisible(false);	    			
			this.jInternalFrameImportacionProductoProduMaquina.dispose();
			this.jInternalFrameImportacionProductoProduMaquina=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoProduMaquina();
			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoProduMaquina")) {
				jButtonNuevoProductoProduMaquinaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoProduMaquina")) {
				jButtonDuplicarProductoProduMaquinaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoProduMaquina")) {
				jButtonCopiarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoProduMaquina")) {
				jButtonVerFormProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoProduMaquina")) {
				jButtonNuevoProductoProduMaquinaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoProduMaquina")) {
				jButtonDuplicarProductoProduMaquinaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoProduMaquina")) {
				jButtonNuevoProductoProduMaquinaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoProduMaquina")) {
				jButtonDuplicarProductoProduMaquinaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoProduMaquina")) {
				jButtonNuevoProductoProduMaquinaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoProduMaquina")) {
				jButtonNuevoProductoProduMaquinaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoProduMaquina")) {
				jButtonNuevoProductoProduMaquinaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoProduMaquina")) {
				jButtonModificarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoProduMaquina")) {
				jButtonModificarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoProduMaquina")) {
				jButtonModificarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoProduMaquina")) {
				jButtonActualizarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoProduMaquina")) {
				jButtonActualizarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoProduMaquina")) {
				jButtonActualizarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoProduMaquina")) {
				jButtonEliminarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoProduMaquina")) {
				jButtonEliminarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoProduMaquina")) {
				jButtonEliminarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoProduMaquina")) {
				jButtonCancelarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoProduMaquina")) {
				jButtonCancelarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoProduMaquina")) {
				jButtonCancelarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoProduMaquina")) {
				jButtonCerrarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoProduMaquina")) {
				jButtonCerrarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoProduMaquina")) {
				jButtonCerrarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoProduMaquina")) {
				jButtonMostrarOcultarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoProduMaquina")) {
				jButtonCancelarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoProduMaquina")) {
				jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoProduMaquina")) {
				jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoProduMaquina")) {
				jButtonCopiarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoProduMaquina")) {
				jButtonVerFormProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoProduMaquina")) {
				jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoProduMaquina")) {
				jButtonCopiarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoProduMaquina")) {
				jButtonVerFormProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoProduMaquina")) {
				jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoProduMaquina")) {
				jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoProduMaquina")) {
				jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoProduMaquina")) {
				jButtonRecargarInformacionProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoProduMaquina")) {
				jButtonRecargarInformacionProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoProduMaquina")) {
				jButtonRecargarInformacionProductoProduMaquinaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoProduMaquina")) {
				jButtonAnterioresProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoProduMaquina")) {
				jButtonAnterioresProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoProduMaquina")) {
				jButtonAnterioresProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoProduMaquina")) {
				jButtonSiguientesProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoProduMaquina")) {
				jButtonSiguientesProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoProduMaquina")) {
				jButtonSiguientesProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoProduMaquina") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoProduMaquina")) {
				jButtonAbrirOrderByProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoProduMaquina") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoProduMaquina")) {
				jButtonMostrarOcultarProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoProduMaquina")) {
				jButtonNuevoGuardarCambiosProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoProduMaquina")) {
				jButtonNuevoGuardarCambiosProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoProduMaquina")) {
				jButtonNuevoGuardarCambiosProductoProduMaquinaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoProduMaquina")) {
				jButtonCerrarReporteDinamicoProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoProduMaquina")) {
				jButtonGenerarReporteDinamicoProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoProduMaquina")) {
				
				jButtonGenerarExcelReporteDinamicoProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoProduMaquina")) {
				jButtonCerrarImportacionProductoProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoProduMaquina")) {
				
				jButtonGenerarImportacionProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoProduMaquina")) {
				
				jButtonAbrirImportacionProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoProduMaquina")) {
				jComboBoxTiposAccionesProductoProduMaquinaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoProduMaquina")) {
				jComboBoxTiposRelacionesProductoProduMaquinaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoProduMaquina")) {
				jComboBoxTiposAccionesProductoProduMaquinaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoProduMaquina")) {
				
				jComboBoxTiposSeleccionarProductoProduMaquinaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoProduMaquina")) {
				jTextFieldValorCampoGeneralProductoProduMaquinaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoProduMaquina")) {
				jButtonAbrirOrderByProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoProduMaquina")) {
				jButtonAbrirOrderByProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoProduMaquina")) {
				jButtonCerrarOrderByProductoProduMaquinaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoProduMaquinaBusqueda")) {
				this.jButtonidProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduMaquinaUpdate")) {
				this.jButtonid_producto_defi_produProductoProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduMaquinaBusqueda")) {
				this.jButtonid_producto_defi_produProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_area_empresa_produProductoProduMaquinaUpdate")) {
				this.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_area_empresa_produProductoProduMaquinaBusqueda")) {
				this.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoProduMaquinaUpdate")) {
				this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoProduMaquinaBusqueda")) {
				this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoProduMaquinaUpdate")) {
				this.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoProduMaquinaBusqueda")) {
				this.jButtonid_tipo_merma_empresaProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoProduMaquinaUpdate")) {
				this.jButtonid_unidadProductoProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoProduMaquinaBusqueda")) {
				this.jButtonid_unidadProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoProduMaquinaBusqueda")) {
				this.jButtoncantidadProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoProduMaquinaBusqueda")) {
				this.jButtoncostoProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoProduMaquinaBusqueda")) {
				this.jButtoncosto_totalProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoProduMaquinaBusqueda")) {
				this.jButtondescripcionProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdProductoDefiProduProductoProduMaquina")) {
				this.jButtonFK_IdProductoDefiProduProductoProduMaquinaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoAreaEmpresaProduProductoProduMaquina")) {
				this.jButtonFK_IdTipoAreaEmpresaProduProductoProduMaquinaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoMaquinaEmpresaProductoProduMaquina")) {
				this.jButtonFK_IdTipoMaquinaEmpresaProductoProduMaquinaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProcesoEmpresaProduProductoProduMaquina")) {
				this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMaquinaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadProductoProduMaquina")) {
				this.jButtonFK_IdUnidadProductoProduMaquinaActionPerformed(evt);
			}
			
			;
			
			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoProduMaquina();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMaquinaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				


				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoProduMaquina productoprodumaquinaLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoprodumaquinaLocal=this.productoprodumaquina;
			} else {
				productoprodumaquinaLocal=this.productoprodumaquinaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
							
				
				


				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMaquinaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
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
			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			
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
			
			


			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMaquinaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
								
						
				


				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMaquina.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
								
				
				


				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMaquinaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMaquinaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMaquinaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
							
				
				


				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMaquina.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMaquinaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
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
			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			
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
			
			


			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMaquinaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
								
				
				


				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMaquinaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMaquinaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMaquinaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoProduMaquina")) {
					jCheckBoxSeleccionarTodosProductoProduMaquinaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoProduMaquina")) {
					jCheckBoxSeleccionadosProductoProduMaquinaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoProduMaquina")) {
					
				}
				
				


				
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
												
				
				


				
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMaquinaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMaquinaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
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
			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
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
			
			


			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduMaquinaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMaquina.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMaquina.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodumaquina);
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
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
				
				


				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProduMaquina.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduMaquinaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodumaquinaAnterior =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoProduMaquina")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoProduMaquinaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoProduMaquina.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoprodumaquina =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoprodumaquina);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoProduMaquina")) {
				
				}
				
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoProduMaquina")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoProduMaquina.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoProduMaquina")) {
			
			}
			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoProduMaquina();
			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			
			if(sTipo.equals("NuevoProductoProduMaquina")) {
				jButtonNuevoProductoProduMaquinaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoProduMaquina")) {
				jButtonDuplicarProductoProduMaquinaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoProduMaquina")) {
				jButtonCopiarProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoProduMaquina")) {
				jButtonVerFormProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoProduMaquina")) {
				jButtonNuevoProductoProduMaquinaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoProduMaquina")) {
				jButtonModificarProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoProduMaquina")) {
				jButtonActualizarProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoProduMaquina")) {
				jButtonEliminarProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoProduMaquina")) {
				jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoProduMaquina")) {
				jButtonCancelarProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoProduMaquina")) {
				jButtonCerrarProductoProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoProduMaquina")) {
				jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoProduMaquina")) {
				jButtonNuevoGuardarCambiosProductoProduMaquinaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoProduMaquina")) {
				jButtonAbrirOrderByProductoProduMaquinaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoProduMaquina")) {
				jButtonRecargarInformacionProductoProduMaquinaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoProduMaquina")) {
				jButtonAnterioresProductoProduMaquinaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoProduMaquina")) {
				jButtonSiguientesProductoProduMaquinaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoProduMaquinaBusqueda")) {
				this.jButtonidProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduMaquinaUpdate")) {
				this.jButtonid_producto_defi_produProductoProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduMaquinaBusqueda")) {
				this.jButtonid_producto_defi_produProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_area_empresa_produProductoProduMaquinaUpdate")) {
				this.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_area_empresa_produProductoProduMaquinaBusqueda")) {
				this.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoProduMaquinaUpdate")) {
				this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoProduMaquinaBusqueda")) {
				this.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoProduMaquinaUpdate")) {
				this.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoProduMaquinaBusqueda")) {
				this.jButtonid_tipo_merma_empresaProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoProduMaquinaUpdate")) {
				this.jButtonid_unidadProductoProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoProduMaquinaBusqueda")) {
				this.jButtonid_unidadProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoProduMaquinaBusqueda")) {
				this.jButtoncantidadProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoProduMaquinaBusqueda")) {
				this.jButtoncostoProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoProduMaquinaBusqueda")) {
				this.jButtoncosto_totalProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoProduMaquinaBusqueda")) {
				this.jButtondescripcionProductoProduMaquinaBusquedaActionPerformed(evt);
			}
			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoProduMaquina();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoProduMaquina")) {
				closingInternalFrameProductoProduMaquina();
				
			} else if(sTipo.equals("jButtonCancelarProductoProduMaquina")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoProduMaquina = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoProduMaquinaBeanSwingJInternalFrame jInternalFrameParent=(ProductoProduMaquinaBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoProduMaquina.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoProduMaquinaActionPerformed(null);
			}
			
			ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoprodumaquina,new Object(),this.productoprodumaquinaParameterGeneral,this.productoprodumaquinaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoProduMaquina(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoProduMaquina(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoProduMaquina(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoprodumaquina)) {
			if(!esControlTabla) {
				if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);			
				}
				
				if(this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoProduMaquina(this.productoprodumaquina,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoprodumaquinaReturnGeneral=productoprodumaquinaLogic.procesarEventosProductoProduMaquinasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodumaquinaLogic.getProductoProduMaquinas(),this.productoprodumaquina,this.productoprodumaquinaParameterGeneral,this.isEsNuevoProductoProduMaquina,classes);//this.productoprodumaquinaLogic.getProductoProduMaquina()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoProduMaquina(this.productoprodumaquinaReturnGeneral,this.productoprodumaquinaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoProduMaquina(classes,this.productoprodumaquinaReturnGeneral,this.productoprodumaquinaBean,false);
					}
						
					if(this.productoprodumaquinaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoProduMaquina(this.productoprodumaquinaReturnGeneral.getProductoProduMaquina());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoProduMaquina(this.productoprodumaquinaReturnGeneral.getProductoProduMaquina());	
					}
						
					if(this.productoprodumaquinaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoProduMaquina(this.productoprodumaquinaReturnGeneral.getProductoProduMaquina(),classes);//this.productoprodumaquinaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoProduMaquina(this.productoprodumaquina,classes);//this.productoprodumaquinaBean);									
				}
			
				if(ProductoProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoProduMaquina(this.productoprodumaquina,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProduMaquina(this.productoprodumaquina);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoprodumaquinaAnterior!=null) {
						this.productoprodumaquina=this.productoprodumaquinaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoprodumaquinaReturnGeneral=productoprodumaquinaLogic.procesarEventosProductoProduMaquinasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodumaquinaLogic.getProductoProduMaquinas(),this.productoprodumaquina,this.productoprodumaquinaParameterGeneral,this.isEsNuevoProductoProduMaquina,classes);//this.productoprodumaquinaLogic.getProductoProduMaquina()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoprodumaquinaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoprodumaquinaReturnGeneral.getProductoProduMaquina(),productoprodumaquinaLogic.getProductoProduMaquinas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoprodumaquinaReturnGeneral.getProductoProduMaquina(),this.productoprodumaquinas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoProduMaquina.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoProduMaquina.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoProduMaquina();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoProduMaquina() throws Exception {
		
		ProductoProduMaquinaModel productoprodumaquinaModel=(ProductoProduMaquinaModel)this.jTableDatosProductoProduMaquina.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodumaquinaModel.productoprodumaquinas=this.productoprodumaquinaLogic.getProductoProduMaquinas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoprodumaquinaModel.productoprodumaquinas=this.productoprodumaquinas;
		}
		
		
		((ProductoProduMaquinaModel) this.jTableDatosProductoProduMaquina.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoProduMaquina() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoprodumaquinaAnterior(),this.productoprodumaquinaLogic.getProductoProduMaquinas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoprodumaquinaAnterior(),this.productoprodumaquinas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoProduMaquina();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoProduMaquina(ProductoProduMaquina productoprodumaquina,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
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
										
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodumaquina,new Object(),generalEntityParameterGeneral,this.productoprodumaquinaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoProduMaquinaConstantesFunciones.getClassesRelationshipsOfProductoProduMaquina(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoProduMaquinaConstantesFunciones.getClassesRelationshipsFromStringsOfProductoProduMaquina(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoProduMaquina(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodumaquina,new Object(),generalEntityParameterGeneral,this.productoprodumaquinaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoProduMaquina(ProductoProduMaquinaBean productoprodumaquinaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoProduMaquina(ArrayList<Classe> classes,ProductoProduMaquinaReturnGeneral productoprodumaquinaReturnGeneral,ProductoProduMaquinaBean productoprodumaquinaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoProduMaquina(ProductoProduMaquina productoprodumaquina,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoprodumaquina)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoProduMaquina = new ProductoProduMaquinaDetalleFormJInternalFrame(jDesktopPane,this.productoprodumaquinaSessionBean.getConGuardarRelaciones(),this.productoprodumaquinaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.setVisible(false);
		this.jInternalFrameDetalleFormProductoProduMaquina.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoProduMaquina.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoProduMaquina.productoprodumaquinaLogic=this.productoprodumaquinaLogic;
		
		this.cargarCombosFrameForeignKeyProductoProduMaquina("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoProduMaquina();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoProduMaquina();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoProduMaquina("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoProduMaquina();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoProduMaquina.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoProduMaquina"));
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonModificarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"ModificarProductoProduMaquina"));

		
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonModificarToolBarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoProduMaquina"));
					
		this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemModificarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoProduMaquina"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonActualizarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"ActualizarProductoProduMaquina"));
		
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonActualizarToolBarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoProduMaquina"));
						
		this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemActualizarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoProduMaquina"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonEliminarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"EliminarProductoProduMaquina"));
		
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonEliminarToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoProduMaquina"));
								
		this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemEliminarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoProduMaquina"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonCancelarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"CancelarProductoProduMaquina"));
		
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonCancelarToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoProduMaquina"));
					
		this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemCancelarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoProduMaquina"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemDetalleCerrarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoProduMaquina"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonGuardarCambiosToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProduMaquina"));
		
		
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonGuardarCambiosToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProduMaquina"));
		
		
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoProduMaquina"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonidProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_producto_defi_produProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_producto_defi_produProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_area_empresa_produProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_area_empresa_produProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_unidadProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_unidadProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtoncantidadProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtoncostoProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtoncosto_totalProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtondescripcionProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduMaquinaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoProduMaquina.jTabbedPaneRelacionesProductoProduMaquina.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoProduMaquina"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoProduMaquina"));
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoProduMaquina"));
		}
		
		this.jTableDatosProductoProduMaquina.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoProduMaquina"));
		
		this.jTableDatosProductoProduMaquina.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoProduMaquina"));
		
		this.jButtonNuevoProductoProduMaquina.addActionListener(new ButtonActionListener(this,"NuevoProductoProduMaquina"));
		
		this.jButtonDuplicarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"DuplicarProductoProduMaquina"));
		
		this.jButtonCopiarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"CopiarProductoProduMaquina"));
		
		this.jButtonVerFormProductoProduMaquina.addActionListener(new ButtonActionListener(this,"VerFormProductoProduMaquina"));
		
		
		this.jButtonNuevoToolBarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoProduMaquina"));
			
		this.jButtonDuplicarToolBarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoProduMaquina"));
			
		this.jMenuItemNuevoProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoProduMaquina"));
			
		this.jMenuItemDuplicarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoProduMaquina"));		
		
		
		this.jButtonNuevoRelacionesProductoProduMaquina.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoProduMaquina"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoProduMaquina"));
			
		this.jMenuItemNuevoRelacionesProductoProduMaquina.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoProduMaquina"));		
		
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonModificarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"ModificarProductoProduMaquina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonModificarToolBarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoProduMaquina"));
			
			this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemModificarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoProduMaquina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonActualizarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"ActualizarProductoProduMaquina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonActualizarToolBarProductoProduMaquina.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoProduMaquina"));
				
			this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemActualizarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoProduMaquina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonEliminarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"EliminarProductoProduMaquina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonEliminarToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoProduMaquina"));
						
			this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemEliminarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoProduMaquina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonCancelarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"CancelarProductoProduMaquina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonCancelarToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoProduMaquina"));
			
			this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemCancelarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoProduMaquina"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoProduMaquina"));		
		
		
		this.jButtonCerrarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"CerrarProductoProduMaquina"));
		
		
		this.jButtonCerrarToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoProduMaquina"));
			
		this.jMenuItemCerrarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoProduMaquina"));
			
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jMenuItemDetalleCerrarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoProduMaquina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonGuardarCambiosProductoProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoProduMaquina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jButtonGuardarCambiosToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProduMaquina"));
		}
		
		this.jButtonCopiarToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoProduMaquina"));
			
		this.jButtonVerFormToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoProduMaquina"));
		
		this.jMenuItemGuardarCambiosProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoProduMaquina"));
			
		this.jMenuItemCopiarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoProduMaquina"));		
		
		this.jMenuItemVerFormProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoProduMaquina"));		
		
		
		this.jButtonGuardarCambiosTablaProductoProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoProduMaquina"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoProduMaquina"));
			
		this.jMenuItemGuardarCambiosTablaProductoProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoProduMaquina"));		
		
		
		
		this.jButtonRecargarInformacionProductoProduMaquina.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoProduMaquina"));
					
		this.jButtonRecargarInformacionToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoProduMaquina"));
		
		this.jMenuItemRecargarInformacionProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoProduMaquina"));		
		
		
		
		this.jButtonAnterioresProductoProduMaquina.addActionListener (new ButtonActionListener(this,"AnterioresProductoProduMaquina"));
		
		
		this.jButtonAnterioresToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoProduMaquina"));
		
		this.jMenuItemAnterioresProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoProduMaquina"));		
		
		
		this.jButtonSiguientesProductoProduMaquina.addActionListener (new ButtonActionListener(this,"SiguientesProductoProduMaquina"));
		
		
		this.jButtonSiguientesToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoProduMaquina"));
			
		this.jMenuItemSiguientesProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoProduMaquina"));
			
		this.jMenuItemAbrirOrderByProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoProduMaquina"));
			
		this.jMenuItemMostrarOcultarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoProduMaquina"));
			
		this.jMenuItemDetalleAbrirOrderByProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoProduMaquina"));
			
		this.jMenuItemDetalleMostarOcultarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoProduMaquina"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoProduMaquina.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoProduMaquina"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoProduMaquina"));
			
		this.jMenuItemNuevoGuardarCambiosProductoProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoProduMaquina"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoProduMaquina.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoProduMaquina"));

		this.jCheckBoxSeleccionadosProductoProduMaquina.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoProduMaquina"));
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoProduMaquina"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoProduMaquina.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoProduMaquina"));
			
		this.jComboBoxTiposAccionesProductoProduMaquina.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoProduMaquina"));
					
		this.jComboBoxTiposSeleccionarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoProduMaquina"));
			
		this.jTextFieldValorCampoGeneralProductoProduMaquina.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoProduMaquina"));		
		
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonidProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_producto_defi_produProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_producto_defi_produProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_area_empresa_produProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_area_empresa_produProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_unidadProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_unidadProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtoncantidadProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtoncostoProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtoncosto_totalProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtondescripcionProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduMaquinaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdProductoDefiProduProductoProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdProductoDefiProduProductoProduMaquina"));

			this.jButtonFK_IdTipoAreaEmpresaProduProductoProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdTipoAreaEmpresaProduProductoProduMaquina"));

			this.jButtonFK_IdTipoMaquinaEmpresaProductoProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdTipoMaquinaEmpresaProductoProduMaquina"));

			this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdTipoProcesoEmpresaProduProductoProduMaquina"));

			this.jButtonFK_IdUnidadProductoProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoProduMaquina"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoProduMaquina!=null) {
				this.jInternalFrameReporteDinamicoProductoProduMaquina.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProduMaquina"));
				this.jInternalFrameReporteDinamicoProductoProduMaquina.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProduMaquina"));
				this.jInternalFrameReporteDinamicoProductoProduMaquina.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProduMaquina"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoProduMaquina.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProduMaquina"));				
			//this.jButtonGenerarReporteDinamicoProductoProduMaquina.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProduMaquina"));
			//this.jButtonGenerarExcelReporteDinamicoProductoProduMaquina.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProduMaquina"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoProduMaquina!=null) {
				this.jInternalFrameImportacionProductoProduMaquina.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoProduMaquina"));
				this.jInternalFrameImportacionProductoProduMaquina.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoProduMaquina"));
				this.jInternalFrameImportacionProductoProduMaquina.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoProduMaquina"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoProduMaquina.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoProduMaquina"));
			
			this.jButtonAbrirOrderByToolBarProductoProduMaquina.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoProduMaquina"));			
			
			if(this.jInternalFrameOrderByProductoProduMaquina!=null) {
				this.jInternalFrameOrderByProductoProduMaquina.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoProduMaquina"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProduMaquina.jTabbedPaneRelacionesProductoProduMaquina.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoProduMaquina"));
		
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
            		closingInternalFrameProductoProduMaquina();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoProduMaquina.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoProduMaquina = (JInternalFrameBase)event.getSource();
	            	
	            ProductoProduMaquinaBeanSwingJInternalFrame jInternalFrameParent=(ProductoProduMaquinaBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoProduMaquina.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoProduMaquinaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoProduMaquina.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoProduMaquinaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoProduMaquina.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoProduMaquina.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduMaquinaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduMaquinaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduMaquinaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoProduMaquina";
		inputMap = this.jButtonNuevoProductoProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoProduMaquinaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduMaquinaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduMaquinaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduMaquinaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoProduMaquina";
		inputMap = this.jButtonNuevoRelacionesProductoProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoProduMaquinaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoProduMaquina";
		inputMap = this.jButtonModificarProductoProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoProduMaquinaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoProduMaquina";
		inputMap = this.jButtonActualizarProductoProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoProduMaquinaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoProduMaquina";
		inputMap = this.jButtonEliminarProductoProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoProduMaquinaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoProduMaquina";
		inputMap = this.jButtonCancelarProductoProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoProduMaquinaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoProduMaquina";
		inputMap = this.jButtonCerrarProductoProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoProduMaquinaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonGuardarCambiosProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoProduMaquina";
		inputMap = this.jInternalFrameDetalleFormProductoProduMaquina.jButtonGuardarCambiosProductoProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonGuardarCambiosProductoProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoProduMaquinaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoProduMaquina.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoProduMaquinaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoProduMaquina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoProduMaquinaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoProduMaquina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoProduMaquinaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoProduMaquina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoProduMaquinaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonidProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_producto_defi_produProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_producto_defi_produProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_area_empresa_produProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_area_empresa_produProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_area_empresa_produProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_area_empresa_produProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_proceso_empresa_produProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_merma_empresaProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_tipo_merma_empresaProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_unidadProductoProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtonid_unidadProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtoncantidadProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtoncostoProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtoncosto_totalProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProduMaquina.jButtondescripcionProductoProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduMaquinaBusqueda"));
		
		
		this.jButtonFK_IdProductoDefiProduProductoProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdProductoDefiProduProductoProduMaquina"));

		this.jButtonFK_IdTipoAreaEmpresaProduProductoProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdTipoAreaEmpresaProduProductoProduMaquina"));

		this.jButtonFK_IdTipoMaquinaEmpresaProductoProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdTipoMaquinaEmpresaProductoProduMaquina"));

		this.jButtonFK_IdTipoProcesoEmpresaProduProductoProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdTipoProcesoEmpresaProduProductoProduMaquina"));

		this.jButtonFK_IdUnidadProductoProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoProduMaquina"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoProduMaquinaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoProduMaquina.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoProduMaquina(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinaLogic.getProductoProduMaquinas()) {
					productoprodumaquinaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinas) {
					productoprodumaquinaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoProduMaquinaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoProduMaquina(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinaLogic.getProductoProduMaquinas()) {
						productoprodumaquinaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinas) {
						productoprodumaquinaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinaLogic.getProductoProduMaquinas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoProduMaquina(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoProduMaquina.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoProduMaquina.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoProduMaquinaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoProduMaquina(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoProduMaquina.getSelectedRows();
			
			ProductoProduMaquina productoprodumaquinaLocal=new ProductoProduMaquina();
			
			//this.seleccionarTodosProductoProduMaquina(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoprodumaquinaLocal =(ProductoProduMaquina) this.productoprodumaquinaLogic.getProductoProduMaquinas().toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoprodumaquinaLocal =(ProductoProduMaquina) this.productoprodumaquinas.toArray()[this.jTableDatosProductoProduMaquina.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoprodumaquinaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinaLogic.getProductoProduMaquinas()) {
						productoprodumaquinaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinas) {
						productoprodumaquinaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoProduMaquina(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoProduMaquina.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoProduMaquina.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoProduMaquina,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoProduMaquinaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoProduMaquinaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoProduMaquinaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoProduMaquina(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoProduMaquina.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinaLogic.getProductoProduMaquinas()) {
				
						if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoprodumaquinaAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoprodumaquinaAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoprodumaquinaAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoprodumaquinaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinas) {
					
						if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoprodumaquinaAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoprodumaquinaAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoprodumaquinaAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoprodumaquinaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoProduMaquina(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoProduMaquinaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoProduMaquina(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoProduMaquina=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoProduMaquina.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoProduMaquina) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoProduMaquina(conSplash);
				
					this.generarReporteProductoProduMaquinasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduMaquina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoProduMaquinasSeleccionados();
				//this.jComboBoxTiposAccionesProductoProduMaquina.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoProduMaquinasSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoProduMaquina.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoProduMaquinasSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoProduMaquina.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoProduMaquina();
				
				this.exportarProductoProduMaquinasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduMaquina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoProduMaquinas();
				//this.importarProductoProduMaquinas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduMaquina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoProduMaquina();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoProduMaquinasSeleccionados();
				//this.jComboBoxTiposAccionesProductoProduMaquina.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Producto Maquina Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoProduMaquina();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoProduMaquina)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoProduMaquina(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Producto Maquina Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProduMaquina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoProduMaquinaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoProduMaquina) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoProduMaquina(conSplash);
					
						//this.actualizarParametrosGeneralProductoProduMaquina();
						
						this.generarReporteProcesoAccionProductoProduMaquinasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoProduMaquina.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoProduMaquinaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Producto Maquina ProduccionES SELECCIONADOS?", "MANTENIMIENTO DE Producto Maquina Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoProduMaquina();
				
						this.actualizarParametrosGeneralProductoProduMaquina();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoprodumaquinaReturnGeneral=productoprodumaquinaLogic.procesarAccionProductoProduMaquinasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoprodumaquinaLogic.getProductoProduMaquinas(),this.productoprodumaquinaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoProduMaquinaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoProduMaquina.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoProduMaquina();
					
					ProductoProduMaquinaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoProduMaquinaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoProduMaquina.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxTiposAccionesFormularioProductoProduMaquina.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoProduMaquina(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoProduMaquinaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoProduMaquina();
			
			if(this.jInternalFrameDetalleFormProductoProduMaquina==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();		
			ProductoProduMaquina productoprodumaquina=new ProductoProduMaquina();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoProduMaquina(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoProduMaquina.getSelectedItem();
			
			
			
			
			productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoprodumaquinasSeleccionados.size()==1) {
				for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinasSeleccionados) {
					productoprodumaquina=productoprodumaquinaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoProduMaquina();
			
      		//this.finishProcessProductoProduMaquina(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoProduMaquinaReturnGeneral() throws Exception {
		if(this.productoprodumaquinaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoprodumaquinaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoprodumaquinaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoprodumaquinaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoprodumaquinaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoprodumaquinaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoProduMaquina(false);
		}
		
		if(this.productoprodumaquinaReturnGeneral.getConRetornoLista() || this.productoprodumaquinaReturnGeneral.getConRetornoObjeto()) {
			if(this.productoprodumaquinaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoprodumaquinaLogic.setProductoProduMaquinas(this.productoprodumaquinaReturnGeneral.getProductoProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoprodumaquinaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoprodumaquinaLogic.setProductoProduMaquina(this.productoprodumaquinaReturnGeneral.getProductoProduMaquina());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoProduMaquina(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoProduMaquina() throws Exception {
		
		
	}
	
	public ArrayList<ProductoProduMaquina> getProductoProduMaquinasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoProduMaquina) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinaLogic.getProductoProduMaquinas()) {
					if(productoprodumaquinaAux.getIsSelected()) {
						productoprodumaquinasSeleccionados.add(productoprodumaquinaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProduMaquina productoprodumaquinaAux:this.productoprodumaquinas) {
					if(productoprodumaquinaAux.getIsSelected()) {
						productoprodumaquinasSeleccionados.add(productoprodumaquinaAux);				
					}
				}
			}
			
			if(productoprodumaquinasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoprodumaquinasSeleccionados.addAll(this.productoprodumaquinaLogic.getProductoProduMaquinas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoprodumaquinasSeleccionados.addAll(this.productoprodumaquinas);				
					}
				}
			}
		} else {
			productoprodumaquinasSeleccionados.add(this.productoprodumaquina);
		}
		
		return productoprodumaquinasSeleccionados;
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
	
	public void generarReporteProductoProduMaquinasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoProduMaquinasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoProduMaquinasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoProduMaquinasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoProduMaquinasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Producto Maquina Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoProduMaquinasSeleccionados() throws Exception {
		ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();		
		
		productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoProduMaquinas("Todos",productoprodumaquinasSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoProduMaquinasSeleccionados() throws Exception {
		ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();		
		
		productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoProduMaquinas("Todos",productoprodumaquinasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoProduMaquinasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();
		
		productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoProduMaquinas("Todos",productoprodumaquinasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoProduMaquinasSeleccionados() throws Exception {
		ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoProduMaquina();
		
		
		productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoProduMaquina();
		
		
		//this.generarReporteProductoProduMaquinas("Todos",productoprodumaquinasSeleccionados ,productoprodumaquinaImplementable,productoprodumaquinaImplementableHome);
	}
	
	public void mostrarImportacionProductoProduMaquinas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoProduMaquina();
		
		this.abrirFrameImportacionProductoProduMaquina();		
		
			
		//this.generarReporteProductoProduMaquinas("Todos",productoprodumaquinasSeleccionados ,productoprodumaquinaImplementable,productoprodumaquinaImplementableHome);
	}
	
	public void importarProductoProduMaquinas() throws Exception {		
	
	}
	
	public void exportarProductoProduMaquinasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoProduMaquinasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoProduMaquinasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoProduMaquinasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Producto Maquina Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoProduMaquinasSeleccionados() throws Exception {
		ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();		
		
		productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumaquina."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoProduMaquina(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoProduMaquina(productoprodumaquinaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoprodumaquinaAux.setsDetalleGeneralEntityReporte(productoprodumaquinaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Maquina Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoProduMaquina(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoProduMaquinaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMaquinaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMaquinaConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoProduMaquina(ProductoProduMaquina productoprodumaquina,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoprodumaquina.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumaquina.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumaquina.getproductodefiprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumaquina.gettipoareaempresaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumaquina.gettipoprocesoempresaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumaquina.gettipomaquinaempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumaquina.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumaquina.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumaquina.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumaquina.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodumaquina.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoProduMaquinasSeleccionados() throws Exception {
		ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();		
		
		productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumaquina.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoProduMaquinas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoProduMaquina(row);				
				iRow++;
			}				
			
			for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoProduMaquina(productoprodumaquinaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Maquina Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoProduMaquinasSeleccionados() throws Exception {
		ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();		
		
		productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodumaquina.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoprodumaquinas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoprodumaquina");
			//elementRoot.appendChild(element);
		
			for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinasSeleccionados) {
				element = document.createElement("productoprodumaquina");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoProduMaquina(productoprodumaquinaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Maquina Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoProduMaquina(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoProduMaquina(ProductoProduMaquina productoprodumaquina,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumaquina.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumaquina.getproductodefiprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumaquina.gettipoareaempresaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumaquina.gettipoprocesoempresaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumaquina.gettipomaquinaempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumaquina.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumaquina.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumaquina.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumaquina.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodumaquina.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProductoProduMaquina(ProductoProduMaquina productoprodumaquina,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoProduMaquinaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoprodumaquina.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoProduMaquinaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoprodumaquina.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementproductodefiprodu_descripcion = document.createElement(ProductoProduMaquinaConstantesFunciones.IDPRODUCTODEFIPRODU);
		elementproductodefiprodu_descripcion.appendChild(document.createTextNode(productoprodumaquina.getproductodefiprodu_descripcion()));
		element.appendChild(elementproductodefiprodu_descripcion);

		Element elementtipoareaempresaprodu_descripcion = document.createElement(ProductoProduMaquinaConstantesFunciones.IDTIPOAREAEMPRESAPRODU);
		elementtipoareaempresaprodu_descripcion.appendChild(document.createTextNode(productoprodumaquina.gettipoareaempresaprodu_descripcion()));
		element.appendChild(elementtipoareaempresaprodu_descripcion);

		Element elementtipoprocesoempresaprodu_descripcion = document.createElement(ProductoProduMaquinaConstantesFunciones.IDTIPOPROCESOEMPRESAPRODU);
		elementtipoprocesoempresaprodu_descripcion.appendChild(document.createTextNode(productoprodumaquina.gettipoprocesoempresaprodu_descripcion()));
		element.appendChild(elementtipoprocesoempresaprodu_descripcion);

		Element elementtipomaquinaempresa_descripcion = document.createElement(ProductoProduMaquinaConstantesFunciones.IDTIPOMAQUINAEMPRESA);
		elementtipomaquinaempresa_descripcion.appendChild(document.createTextNode(productoprodumaquina.gettipomaquinaempresa_descripcion()));
		element.appendChild(elementtipomaquinaempresa_descripcion);

		Element elementunidad_descripcion = document.createElement(ProductoProduMaquinaConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(productoprodumaquina.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcantidad = document.createElement(ProductoProduMaquinaConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productoprodumaquina.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcosto = document.createElement(ProductoProduMaquinaConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(productoprodumaquina.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementcosto_total = document.createElement(ProductoProduMaquinaConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(productoprodumaquina.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(ProductoProduMaquinaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productoprodumaquina.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProductoProduMaquinasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados=new ArrayList<ProductoProduMaquina>();
		
		productoprodumaquinasSeleccionados=this.getProductoProduMaquinasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoProduMaquina(productoprodumaquinasSeleccionados);
		
		this.generarReporteProductoProduMaquinas("Todos",productoprodumaquinasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoProduMaquina(ArrayList<ProductoProduMaquina> productoprodumaquinasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoProduMaquina productoprodumaquinaAux:productoprodumaquinasSeleccionados) {
				productoprodumaquinaAux.setsDetalleGeneralEntityReporte(productoprodumaquinaAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU)) {
					existe=true;
					productoprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoprodumaquinaAux.getproductodefiprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU)) {
					existe=true;
					productoprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoprodumaquinaAux.gettipoareaempresaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU)) {
					existe=true;
					productoprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoprodumaquinaAux.gettipoprocesoempresaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA)) {
					existe=true;
					productoprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoprodumaquinaAux.gettipomaquinaempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					productoprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoprodumaquinaAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productoprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoprodumaquinaAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduMaquinaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productoprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoprodumaquinaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoProduMaquina(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoProduMaquina=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=true;
				this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=true;
			}
			
			this.isVisibilidadCeldaModificarProductoProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoProduMaquina=false;
			this.isVisibilidadCeldaEliminarProductoProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoProduMaquina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoProduMaquina=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=false;
			this.isVisibilidadCeldaModificarProductoProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoProduMaquina=true;
			this.isVisibilidadCeldaEliminarProductoProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoProduMaquina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoProduMaquina=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=false;
			this.isVisibilidadCeldaModificarProductoProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoProduMaquina=true;
			this.isVisibilidadCeldaEliminarProductoProduMaquina=true;
			this.isVisibilidadCeldaCancelarProductoProduMaquina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoProduMaquina=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=false;
			this.isVisibilidadCeldaModificarProductoProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoProduMaquina=true;
			this.isVisibilidadCeldaEliminarProductoProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoProduMaquina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoProduMaquina=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=true;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=true;
			this.isVisibilidadCeldaModificarProductoProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoProduMaquina=false;
			this.isVisibilidadCeldaEliminarProductoProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoProduMaquina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoProduMaquina=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoProduMaquina=false;
			this.isVisibilidadCeldaEliminarProductoProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoProduMaquina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoProduMaquina=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=false;
			this.isVisibilidadCeldaModificarProductoProduMaquina=true;
			this.isVisibilidadCeldaActualizarProductoProduMaquina=false;
			this.isVisibilidadCeldaEliminarProductoProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoProduMaquina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProduMaquina=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoProduMaquinaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoProduMaquina=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=true;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=true;
		} else {
			this.actualizarEstadoPanelsProductoProduMaquina(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoProduMaquina=false;
			//this.isVisibilidadCeldaVerFormProductoProduMaquina=false;
			this.isVisibilidadCeldaDuplicarProductoProduMaquina=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoprodumaquinaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProduMaquina=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			if(!productoprodumaquinaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=false;												
			}
			
			this.jButtonCerrarProductoProduMaquina.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoProduMaquina=false;
		}
		
		if(!this.permiteMantenimiento(this.productoprodumaquina)) {
			this.isVisibilidadCeldaActualizarProductoProduMaquina=false;
			this.isVisibilidadCeldaEliminarProductoProduMaquina=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoProduMaquina() {
	}
	
	public void actualizarEstadoPanelsProductoProduMaquina(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoProduMaquina.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoProduMaquina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMaquina!=null) {
				this.jScrollPanelDatosProductoProduMaquina.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduMaquina!=null) {
				this.jPanelPaginacionProductoProduMaquina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduMaquina!=null) {
				this.jPanelParametrosReportesProductoProduMaquina.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoProduMaquina.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoProduMaquina.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoProduMaquina!=null) {
				this.jScrollPanelDatosProductoProduMaquina.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProduMaquina!=null) {
				this.jPanelPaginacionProductoProduMaquina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProduMaquina!=null) {
				this.jPanelParametrosReportesProductoProduMaquina.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoProduMaquina.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoProduMaquina.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMaquina!=null) {
				this.jScrollPanelDatosProductoProduMaquina.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProduMaquina!=null) {
				this.jPanelPaginacionProductoProduMaquina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProduMaquina!=null) {
				this.jPanelParametrosReportesProductoProduMaquina.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoProduMaquina.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoProduMaquina.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMaquina!=null) {
				this.jScrollPanelDatosProductoProduMaquina.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProduMaquina!=null) {
				this.jPanelPaginacionProductoProduMaquina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProduMaquina!=null) {
				this.jPanelParametrosReportesProductoProduMaquina.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoProduMaquina.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoProduMaquina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMaquina!=null) {
				this.jScrollPanelDatosProductoProduMaquina.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduMaquina!=null) {
				this.jPanelPaginacionProductoProduMaquina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduMaquina!=null) {
				this.jPanelParametrosReportesProductoProduMaquina.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoProduMaquina.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoProduMaquina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMaquina!=null) {
				this.jScrollPanelDatosProductoProduMaquina.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduMaquina!=null) {
				this.jPanelPaginacionProductoProduMaquina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduMaquina!=null) {
				this.jPanelParametrosReportesProductoProduMaquina.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoProduMaquina.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoProduMaquina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProduMaquina!=null) {
				this.jScrollPanelDatosProductoProduMaquina.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProduMaquina!=null) {
				this.jPanelPaginacionProductoProduMaquina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProduMaquina!=null) {
				this.jPanelParametrosReportesProductoProduMaquina.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoProduMaquina!=null) {
					this.jTabbedPaneBusquedasProductoProduMaquina.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoProduMaquina!=null) {
				this.jPanelParametrosReportesProductoProduMaquina.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoProduMaquina.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoProduMaquina!=null) {
				this.jPanelParametrosReportesProductoProduMaquina.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaProductoDefiProdu(Boolean isParaProductoDefiProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoDefiProduNegation=!isParaProductoDefiProdu;

			this.isVisibilidadFK_IdProductoDefiProdu=isParaProductoDefiProdu;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdProductoDefiProduProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoAreaEmpresaProdu=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdTipoAreaEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoMaquinaEmpresa=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdTipoMaquinaEmpresa) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina);}

			this.isVisibilidadFK_IdUnidad=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdUnidadProductoProduMaquina);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoAreaEmpresaProdu(Boolean isParaTipoAreaEmpresaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoAreaEmpresaProduNegation=!isParaTipoAreaEmpresaProdu;

			this.isVisibilidadFK_IdProductoDefiProdu=isParaTipoAreaEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdProductoDefiProduProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoAreaEmpresaProdu=isParaTipoAreaEmpresaProdu;
			if(!this.isVisibilidadFK_IdTipoAreaEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoMaquinaEmpresa=isParaTipoAreaEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdTipoMaquinaEmpresa) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaTipoAreaEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina);}

			this.isVisibilidadFK_IdUnidad=isParaTipoAreaEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdUnidadProductoProduMaquina);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProcesoEmpresaProdu(Boolean isParaTipoProcesoEmpresaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProcesoEmpresaProduNegation=!isParaTipoProcesoEmpresaProdu;

			this.isVisibilidadFK_IdProductoDefiProdu=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdProductoDefiProduProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoAreaEmpresaProdu=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdTipoAreaEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoMaquinaEmpresa=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdTipoMaquinaEmpresa) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaTipoProcesoEmpresaProdu;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina);}

			this.isVisibilidadFK_IdUnidad=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdUnidadProductoProduMaquina);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMaquinaEmpresa(Boolean isParaTipoMaquinaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMaquinaEmpresaNegation=!isParaTipoMaquinaEmpresa;

			this.isVisibilidadFK_IdProductoDefiProdu=isParaTipoMaquinaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdProductoDefiProduProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoAreaEmpresaProdu=isParaTipoMaquinaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoAreaEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoMaquinaEmpresa=isParaTipoMaquinaEmpresa;
			if(!this.isVisibilidadFK_IdTipoMaquinaEmpresa) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaTipoMaquinaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina);}

			this.isVisibilidadFK_IdUnidad=isParaTipoMaquinaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdUnidadProductoProduMaquina);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdProductoDefiProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdProductoDefiProduProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoAreaEmpresaProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoAreaEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoMaquinaEmpresa=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoMaquinaEmpresa) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoProduMaquina.remove(jPanelFK_IdUnidadProductoProduMaquina);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoProduMaquinaSessionBean productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		
		if(this.productoprodumaquinaSessionBean==null) {
			this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		}
		
		this.productoprodumaquinaSessionBean.setsUltimaBusquedaProductoProduMaquina(this.getsAccionBusqueda());
		this.productoprodumaquinaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoprodumaquinaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdProductoDefiProdu")) {
			productoprodumaquinaSessionBean.setid_producto_defi_produ(this.getid_producto_defi_produFK_IdProductoDefiProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoAreaEmpresaProdu")) {
			productoprodumaquinaSessionBean.setid_tipo_area_empresa_produ(this.getid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoMaquinaEmpresa")) {
			productoprodumaquinaSessionBean.setid_tipo_merma_empresa(this.getid_tipo_merma_empresaFK_IdTipoMaquinaEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProcesoEmpresaProdu")) {
			productoprodumaquinaSessionBean.setid_tipo_proceso_empresa_produ(this.getid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			productoprodumaquinaSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoProduMaquinaSessionBean productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		
		if(this.productoprodumaquinaSessionBean==null) {
			this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		}
		
		if(this.productoprodumaquinaSessionBean.getsUltimaBusquedaProductoProduMaquina()!=null&&!this.productoprodumaquinaSessionBean.getsUltimaBusquedaProductoProduMaquina().equals("")) {
			this.setsAccionBusqueda(productoprodumaquinaSessionBean.getsUltimaBusquedaProductoProduMaquina());
			this.setiNumeroPaginacion(productoprodumaquinaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoprodumaquinaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdProductoDefiProdu")) {
				this.setid_producto_defi_produFK_IdProductoDefiProdu(productoprodumaquinaSessionBean.getid_producto_defi_produ());
				productoprodumaquinaSessionBean.setid_producto_defi_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoAreaEmpresaProdu")) {
				this.setid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu(productoprodumaquinaSessionBean.getid_tipo_area_empresa_produ());
				productoprodumaquinaSessionBean.setid_tipo_area_empresa_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoMaquinaEmpresa")) {
				this.setid_tipo_merma_empresaFK_IdTipoMaquinaEmpresa(productoprodumaquinaSessionBean.getid_tipo_merma_empresa());
				productoprodumaquinaSessionBean.setid_tipo_merma_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProcesoEmpresaProdu")) {
				this.setid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu(productoprodumaquinaSessionBean.getid_tipo_proceso_empresa_produ());
				productoprodumaquinaSessionBean.setid_tipo_proceso_empresa_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(productoprodumaquinaSessionBean.getid_unidad());
				productoprodumaquinaSessionBean.setid_unidad(-1L);
			}
		}
		
		this.productoprodumaquinaSessionBean.setsUltimaBusquedaProductoProduMaquina("");
		this.productoprodumaquinaSessionBean.setiNumeroPaginacion(ProductoProduMaquinaConstantesFunciones.INUMEROPAGINACION);
		this.productoprodumaquinaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoProduMaquina(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoProduMaquina() {
		this.updateBorderResaltarBusquedasFormularioProductoProduMaquina();
		this.updateVisibilidadBusquedasFormularioProductoProduMaquina();
		this.updateHabilitarBusquedasFormularioProductoProduMaquina();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoProduMaquina() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoProduMaquina.getComponents().length>0) {
	

		if(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProduMaquina!=null) {
			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduMaquina);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
				jPanel.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProduMaquina);
			}
		}

		if(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdTipoAreaEmpresaProduProductoProduMaquina!=null) {
			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
				jPanel.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdTipoAreaEmpresaProduProductoProduMaquina);
			}
		}

		if(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdTipoMaquinaEmpresaProductoProduMaquina!=null) {
			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
				jPanel.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdTipoMaquinaEmpresaProductoProduMaquina);
			}
		}

		if(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdTipoProcesoEmpresaProduProductoProduMaquina!=null) {
			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
				jPanel.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdTipoProcesoEmpresaProduProductoProduMaquina);
			}
		}

		if(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdUnidadProductoProduMaquina!=null) {
			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdUnidadProductoProduMaquina);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
				jPanel.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdUnidadProductoProduMaquina);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoProduMaquina() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoProduMaquina.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduMaquina);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarFK_IdProductoDefiProduProductoProduMaquina);
			if(!this.productoprodumaquinaConstantesFunciones.mostrarFK_IdProductoDefiProduProductoProduMaquina && index>-1) {
				this.jTabbedPaneBusquedasProductoProduMaquina.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarFK_IdTipoAreaEmpresaProduProductoProduMaquina);
			if(!this.productoprodumaquinaConstantesFunciones.mostrarFK_IdTipoAreaEmpresaProduProductoProduMaquina && index>-1) {
				this.jTabbedPaneBusquedasProductoProduMaquina.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarFK_IdTipoMaquinaEmpresaProductoProduMaquina);
			if(!this.productoprodumaquinaConstantesFunciones.mostrarFK_IdTipoMaquinaEmpresaProductoProduMaquina && index>-1) {
				this.jTabbedPaneBusquedasProductoProduMaquina.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarFK_IdTipoProcesoEmpresaProduProductoProduMaquina);
			if(!this.productoprodumaquinaConstantesFunciones.mostrarFK_IdTipoProcesoEmpresaProduProductoProduMaquina && index>-1) {
				this.jTabbedPaneBusquedasProductoProduMaquina.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdUnidadProductoProduMaquina);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarFK_IdUnidadProductoProduMaquina);
			if(!this.productoprodumaquinaConstantesFunciones.mostrarFK_IdUnidadProductoProduMaquina && index>-1) {
				this.jTabbedPaneBusquedasProductoProduMaquina.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoProduMaquina() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoProduMaquina.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduMaquina);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodumaquinaConstantesFunciones.activarFK_IdProductoDefiProduProductoProduMaquina);
				this.jTabbedPaneBusquedasProductoProduMaquina.setEnabledAt(index,this.productoprodumaquinaConstantesFunciones.activarFK_IdProductoDefiProduProductoProduMaquina);
			}

			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodumaquinaConstantesFunciones.activarFK_IdTipoAreaEmpresaProduProductoProduMaquina);
				this.jTabbedPaneBusquedasProductoProduMaquina.setEnabledAt(index,this.productoprodumaquinaConstantesFunciones.activarFK_IdTipoAreaEmpresaProduProductoProduMaquina);
			}

			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodumaquinaConstantesFunciones.activarFK_IdTipoMaquinaEmpresaProductoProduMaquina);
				this.jTabbedPaneBusquedasProductoProduMaquina.setEnabledAt(index,this.productoprodumaquinaConstantesFunciones.activarFK_IdTipoMaquinaEmpresaProductoProduMaquina);
			}

			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodumaquinaConstantesFunciones.activarFK_IdTipoProcesoEmpresaProduProductoProduMaquina);
				this.jTabbedPaneBusquedasProductoProduMaquina.setEnabledAt(index,this.productoprodumaquinaConstantesFunciones.activarFK_IdTipoProcesoEmpresaProduProductoProduMaquina);
			}

			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdUnidadProductoProduMaquina);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoprodumaquinaConstantesFunciones.activarFK_IdUnidadProductoProduMaquina);
				this.jTabbedPaneBusquedasProductoProduMaquina.setEnabledAt(index,this.productoprodumaquinaConstantesFunciones.activarFK_IdUnidadProductoProduMaquina);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoProduMaquina(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdProductoDefiProdu")) {
			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProduMaquina);

			this.jTabbedPaneBusquedasProductoProduMaquina.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);

			this.productoprodumaquinaConstantesFunciones.setResaltarFK_IdProductoDefiProduProductoProduMaquina(resaltar);

			jPanel.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProduMaquina);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoAreaEmpresaProdu")) {
			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdTipoAreaEmpresaProduProductoProduMaquina);

			this.jTabbedPaneBusquedasProductoProduMaquina.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);

			this.productoprodumaquinaConstantesFunciones.setResaltarFK_IdTipoAreaEmpresaProduProductoProduMaquina(resaltar);

			jPanel.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdTipoAreaEmpresaProduProductoProduMaquina);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoMaquinaEmpresa")) {
			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdTipoMaquinaEmpresaProductoProduMaquina);

			this.jTabbedPaneBusquedasProductoProduMaquina.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);

			this.productoprodumaquinaConstantesFunciones.setResaltarFK_IdTipoMaquinaEmpresaProductoProduMaquina(resaltar);

			jPanel.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdTipoMaquinaEmpresaProductoProduMaquina);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProcesoEmpresaProdu")) {
			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoProduMaquina);

			this.jTabbedPaneBusquedasProductoProduMaquina.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);

			this.productoprodumaquinaConstantesFunciones.setResaltarFK_IdTipoProcesoEmpresaProduProductoProduMaquina(resaltar);

			jPanel.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdTipoProcesoEmpresaProduProductoProduMaquina);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasProductoProduMaquina.indexOfComponent(this.jPanelFK_IdUnidadProductoProduMaquina);

			this.jTabbedPaneBusquedasProductoProduMaquina.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProduMaquina.getComponent(index);

			this.productoprodumaquinaConstantesFunciones.setResaltarFK_IdUnidadProductoProduMaquina(resaltar);

			jPanel.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarFK_IdUnidadProductoProduMaquina);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoProduMaquina.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoProduMaquina() throws Exception {

		if(this.jInternalFrameDetalleFormProductoProduMaquina==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoProduMaquina();
		this.updateVisibilidadResaltarControlesFormularioProductoProduMaquina();
		this.updateHabilitarResaltarControlesFormularioProductoProduMaquina();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoProduMaquina() throws Exception {
		if(this.jInternalFrameDetalleFormProductoProduMaquina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoprodumaquinaConstantesFunciones.resaltaridProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina!=null) {this.jInternalFrameDetalleFormProductoProduMaquina.jLabelidProductoProduMaquina.setBorder(this.productoprodumaquinaConstantesFunciones.resaltaridProductoProduMaquina);}
		if(this.productoprodumaquinaConstantesFunciones.resaltarid_producto_defi_produProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina!=null) {this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarid_producto_defi_produProductoProduMaquina);}
		if(this.productoprodumaquinaConstantesFunciones.resaltarid_tipo_area_empresa_produProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina!=null) {this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarid_tipo_area_empresa_produProductoProduMaquina);}
		if(this.productoprodumaquinaConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina!=null) {this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoProduMaquina);}
		if(this.productoprodumaquinaConstantesFunciones.resaltarid_tipo_merma_empresaProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina!=null) {this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarid_tipo_merma_empresaProductoProduMaquina);}
		if(this.productoprodumaquinaConstantesFunciones.resaltarid_unidadProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina!=null) {this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarid_unidadProductoProduMaquina);}
		if(this.productoprodumaquinaConstantesFunciones.resaltarcantidadProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina!=null) {this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcantidadProductoProduMaquina.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarcantidadProductoProduMaquina);}
		if(this.productoprodumaquinaConstantesFunciones.resaltarcostoProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina!=null) {this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcostoProductoProduMaquina.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarcostoProductoProduMaquina);}
		if(this.productoprodumaquinaConstantesFunciones.resaltarcosto_totalProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina!=null) {this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcosto_totalProductoProduMaquina.setBorder(this.productoprodumaquinaConstantesFunciones.resaltarcosto_totalProductoProduMaquina);}
		if(this.productoprodumaquinaConstantesFunciones.resaltardescripcionProductoProduMaquina!=null && this.jInternalFrameDetalleFormProductoProduMaquina!=null) {this.jInternalFrameDetalleFormProductoProduMaquina.jTextAreadescripcionProductoProduMaquina.setBorder(this.productoprodumaquinaConstantesFunciones.resaltardescripcionProductoProduMaquina);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoProduMaquina() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoProduMaquina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
	
		//this.jInternalFrameDetalleFormProductoProduMaquina.jLabelidProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostraridProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jPanelidProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostraridProductoProduMaquina);
		//this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarid_producto_defi_produProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jPanelid_producto_defi_produProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarid_producto_defi_produProductoProduMaquina);
		//this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarid_tipo_area_empresa_produProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jPanelid_tipo_area_empresa_produProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarid_tipo_area_empresa_produProductoProduMaquina);
		//this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarid_tipo_proceso_empresa_produProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jPanelid_tipo_proceso_empresa_produProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarid_tipo_proceso_empresa_produProductoProduMaquina);
		//this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarid_tipo_merma_empresaProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jPanelid_tipo_merma_empresaProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarid_tipo_merma_empresaProductoProduMaquina);
		//this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarid_unidadProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jPanelid_unidadProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarid_unidadProductoProduMaquina);
		//this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcantidadProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarcantidadProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jPanelcantidadProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarcantidadProductoProduMaquina);
		//this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcostoProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarcostoProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jPanelcostoProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarcostoProductoProduMaquina);
		//this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcosto_totalProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarcosto_totalProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jPanelcosto_totalProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrarcosto_totalProductoProduMaquina);
		//this.jInternalFrameDetalleFormProductoProduMaquina.jTextAreadescripcionProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrardescripcionProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jPaneldescripcionProductoProduMaquina.setVisible(this.productoprodumaquinaConstantesFunciones.mostrardescripcionProductoProduMaquina);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoProduMaquina() throws Exception {
		if(this.jInternalFrameDetalleFormProductoProduMaquina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoProduMaquina!=null) {
	
		this.jInternalFrameDetalleFormProductoProduMaquina.jLabelidProductoProduMaquina.setEnabled(this.productoprodumaquinaConstantesFunciones.activaridProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_producto_defi_produProductoProduMaquina.setEnabled(this.productoprodumaquinaConstantesFunciones.activarid_producto_defi_produProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_area_empresa_produProductoProduMaquina.setEnabled(this.productoprodumaquinaConstantesFunciones.activarid_tipo_area_empresa_produProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoProduMaquina.setEnabled(this.productoprodumaquinaConstantesFunciones.activarid_tipo_proceso_empresa_produProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_tipo_merma_empresaProductoProduMaquina.setEnabled(this.productoprodumaquinaConstantesFunciones.activarid_tipo_merma_empresaProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jComboBoxid_unidadProductoProduMaquina.setEnabled(this.productoprodumaquinaConstantesFunciones.activarid_unidadProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcantidadProductoProduMaquina.setEnabled(this.productoprodumaquinaConstantesFunciones.activarcantidadProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcostoProductoProduMaquina.setEnabled(this.productoprodumaquinaConstantesFunciones.activarcostoProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jTextFieldcosto_totalProductoProduMaquina.setEnabled(this.productoprodumaquinaConstantesFunciones.activarcosto_totalProductoProduMaquina);
		this.jInternalFrameDetalleFormProductoProduMaquina.jTextAreadescripcionProductoProduMaquina.setEnabled(this.productoprodumaquinaConstantesFunciones.activardescripcionProductoProduMaquina);
		}
	}
	
		
}