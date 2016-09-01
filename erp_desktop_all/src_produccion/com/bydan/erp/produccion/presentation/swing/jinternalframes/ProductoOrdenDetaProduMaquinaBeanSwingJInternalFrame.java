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

import com.bydan.erp.produccion.util.ProductoOrdenDetaProduMaquinaConstantesFunciones;
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduMaquinaParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProductoOrdenDetaProduMaquinaParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ProductoOrdenDetaProduMaquinaBean;
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
public class ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame extends ProductoOrdenDetaProduMaquinaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinaValidator = new ClassValidator<ProductoOrdenDetaProduMaquina>(ProductoOrdenDetaProduMaquina.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoOrdenDetaProduMaquina productoordendetaprodumaquina;	
	public ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux;
	public ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaTotales;
	public Long idProductoOrdenDetaProduMaquinaActual;
	public Long iIdNuevoProductoOrdenDetaProduMaquina=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboOrdenDetaProdu="";

	public List<OrdenDetaProdu> ordendetaprodusForeignKey;

	public List<OrdenDetaProdu> getordendetaprodusForeignKey() {
		return ordendetaprodusForeignKey;
	}

	public void setordendetaprodusForeignKey(List<OrdenDetaProdu> ordendetaprodusForeignKey) {
		this.ordendetaprodusForeignKey = ordendetaprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public OrdenDetaProdu ordendetaproduForeignKey;

	public OrdenDetaProdu getordendetaproduForeignKey() {
		return ordendetaproduForeignKey;
	}

	public void setordendetaproduForeignKey(OrdenDetaProdu ordendetaproduForeignKey) {
		this.ordendetaproduForeignKey = ordendetaproduForeignKey;
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
	
	public Boolean isPermisoTodoProductoOrdenDetaProduMaquina;
	public Boolean isPermisoNuevoProductoOrdenDetaProduMaquina;
	public Boolean isPermisoActualizarProductoOrdenDetaProduMaquina;
	public Boolean isPermisoActualizarOriginalProductoOrdenDetaProduMaquina;
	public Boolean isPermisoEliminarProductoOrdenDetaProduMaquina;
	public Boolean isPermisoGuardarCambiosProductoOrdenDetaProduMaquina;
	public Boolean isPermisoConsultaProductoOrdenDetaProduMaquina;
	public Boolean isPermisoBusquedaProductoOrdenDetaProduMaquina;
	public Boolean isPermisoReporteProductoOrdenDetaProduMaquina;
	public Boolean isPermisoPaginacionMedioProductoOrdenDetaProduMaquina;
	public Boolean isPermisoPaginacionAltoProductoOrdenDetaProduMaquina;
	public Boolean isPermisoPaginacionTodoProductoOrdenDetaProduMaquina;
	public Boolean isPermisoCopiarProductoOrdenDetaProduMaquina;
	public Boolean isPermisoVerFormProductoOrdenDetaProduMaquina;
	public Boolean isPermisoDuplicarProductoOrdenDetaProduMaquina;
	public Boolean isPermisoOrdenProductoOrdenDetaProduMaquina;
	
	
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
	
	public ProductoOrdenDetaProduMaquinaParameterReturnGeneral productoordendetaprodumaquinaReturnGeneral;
	public ProductoOrdenDetaProduMaquinaParameterReturnGeneral productoordendetaprodumaquinaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoOrdenDetaProduMaquina=false;
	public Boolean esParaAccionDesdeFormularioProductoOrdenDetaProduMaquina=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoOrdenDetaProduMaquinaSessionBeanAdditional productoordendetaprodumaquinaSessionBeanAdditional=null;
	
	public ProductoOrdenDetaProduMaquinaSessionBeanAdditional getProductoOrdenDetaProduMaquinaSessionBeanAdditional() {
		return this.productoordendetaprodumaquinaSessionBeanAdditional;
	}
	
	public void setProductoOrdenDetaProduMaquinaSessionBeanAdditional(ProductoOrdenDetaProduMaquinaSessionBeanAdditional productoordendetaprodumaquinaSessionBeanAdditional) {
		try {
			this.productoordendetaprodumaquinaSessionBeanAdditional=productoordendetaprodumaquinaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional productoordendetaprodumaquinaBeanSwingJInternalFrameAdditional=null;
	//public class ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame
	
	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional getProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional() {
		return this.productoordendetaprodumaquinaBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional(ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional productoordendetaprodumaquinaBeanSwingJInternalFrameAdditional) {
		try {
			this.productoordendetaprodumaquinaBeanSwingJInternalFrameAdditional=productoordendetaprodumaquinaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoOrdenDetaProduMaquinaLogic productoordendetaprodumaquinaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaBean;
	public ProductoOrdenDetaProduMaquinaConstantesFunciones productoordendetaprodumaquinaConstantesFunciones;
	//public ProductoOrdenDetaProduMaquinaParameterReturnGeneral productoordendetaprodumaquinaReturnGeneral;
	
	//FK
	
	public OrdenDetaProduLogic ordendetaproduLogic;
	public TipoAreaEmpresaProduLogic tipoareaempresaproduLogic;
	public TipoProcesoEmpresaProduLogic tipoprocesoempresaproduLogic;
	public TipoMaquinaEmpresaLogic tipomaquinaempresaLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinas;	
	//public List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasEliminados;
	//public List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=false;
	public Boolean isVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina=true;
	public Boolean isVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina=true;
	public Boolean isVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina=true;
	public Boolean isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=false;
	public Boolean isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina=false;
	public Boolean isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=false;
	public Boolean isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=false;
	public Boolean isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina=false;
	public Boolean isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=false;	
	
	
	public Boolean isVisibilidadFK_IdOrdenDetaProdu=false;
	public Boolean isVisibilidadFK_IdTipoAreaEmpresaProdu=false;
	public Boolean isVisibilidadFK_IdTipoMaquinaEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoProcesoEmpresaProdu=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoProductoOrdenDetaProduMaquina() {
		return this.iIdNuevoProductoOrdenDetaProduMaquina;
	}

	public void setiIdNuevoProductoOrdenDetaProduMaquina(Long iIdNuevoProductoOrdenDetaProduMaquina) {
		this.iIdNuevoProductoOrdenDetaProduMaquina = iIdNuevoProductoOrdenDetaProduMaquina;
	}
	
	public Long getidProductoOrdenDetaProduMaquinaActual() {
		return this.idProductoOrdenDetaProduMaquinaActual;
	}

	public void setidProductoOrdenDetaProduMaquinaActual(Long idProductoOrdenDetaProduMaquinaActual) {
		this.idProductoOrdenDetaProduMaquinaActual = idProductoOrdenDetaProduMaquinaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoOrdenDetaProduMaquina getproductoordendetaprodumaquina() {
		return this.productoordendetaprodumaquina;
	}

	public void setproductoordendetaprodumaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina) {
		this.productoordendetaprodumaquina = productoordendetaprodumaquina;
	}
	
	public ProductoOrdenDetaProduMaquina getproductoordendetaprodumaquinaAux() {
		return this.productoordendetaprodumaquinaAux;
	}

	public void setproductoordendetaprodumaquinaAux(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux) {
		this.productoordendetaprodumaquinaAux = productoordendetaprodumaquinaAux;
	}				
	
	public ProductoOrdenDetaProduMaquina getproductoordendetaprodumaquinaAnterior() {
		return this.productoordendetaprodumaquinaAnterior;
	}

	public void setproductoordendetaprodumaquinaAnterior(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAnterior) {
		this.productoordendetaprodumaquinaAnterior = productoordendetaprodumaquinaAnterior;
	}	
	
	public ProductoOrdenDetaProduMaquina getproductoordendetaprodumaquinaTotales() {
		return this.productoordendetaprodumaquinaTotales;
	}

	public void setproductoordendetaprodumaquinaTotales(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaTotales) {
		this.productoordendetaprodumaquinaTotales = productoordendetaprodumaquinaTotales;
	}	
	
	public ProductoOrdenDetaProduMaquina getproductoordendetaprodumaquinaBean() {
		return this.productoordendetaprodumaquinaBean;
	}

	public void setproductoordendetaprodumaquinaBean(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaBean) {
		this.productoordendetaprodumaquinaBean = productoordendetaprodumaquinaBean;
	}	
	
	public ProductoOrdenDetaProduMaquinaParameterReturnGeneral getproductoordendetaprodumaquinaReturnGeneral() {
		return this.productoordendetaprodumaquinaReturnGeneral;
	}

	public void setproductoordendetaprodumaquinaReturnGeneral(ProductoOrdenDetaProduMaquinaParameterReturnGeneral productoordendetaprodumaquinaReturnGeneral) {
		this.productoordendetaprodumaquinaReturnGeneral = productoordendetaprodumaquinaReturnGeneral;
	}	
	
	
	public Long id_orden_deta_produFK_IdOrdenDetaProdu=-1L;

	public Long getid_orden_deta_produFK_IdOrdenDetaProdu() {
		return this.id_orden_deta_produFK_IdOrdenDetaProdu;
	}

	public void setid_orden_deta_produFK_IdOrdenDetaProdu(Long id_orden_deta_produFK_IdOrdenDetaProdu) {
		this.id_orden_deta_produFK_IdOrdenDetaProdu = id_orden_deta_produFK_IdOrdenDetaProdu;
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
	
	
	public ProductoOrdenDetaProduMaquinaLogic getProductoOrdenDetaProduMaquinaLogic()	{		
		return productoordendetaprodumaquinaLogic;
	}

	public void setProductoOrdenDetaProduMaquinaLogic(ProductoOrdenDetaProduMaquinaLogic productoordendetaprodumaquinaLogic) {
		this.productoordendetaprodumaquinaLogic = productoordendetaprodumaquinaLogic;
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
	
	public Boolean getIsEsNuevoProductoOrdenDetaProduMaquina() {
		return isEsNuevoProductoOrdenDetaProduMaquina;
	}

	public void setIsEsNuevoProductoOrdenDetaProduMaquina(Boolean isEsNuevoProductoOrdenDetaProduMaquina) {
		this.isEsNuevoProductoOrdenDetaProduMaquina = isEsNuevoProductoOrdenDetaProduMaquina;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoOrdenDetaProduMaquina() {
		return esParaAccionDesdeFormularioProductoOrdenDetaProduMaquina;
	}
	
	public void setEsParaAccionDesdeFormularioProductoOrdenDetaProduMaquina(Boolean esParaAccionDesdeFormularioProductoOrdenDetaProduMaquina) {
		this.esParaAccionDesdeFormularioProductoOrdenDetaProduMaquina = esParaAccionDesdeFormularioProductoOrdenDetaProduMaquina;
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
	
	
	public void cargarCombosOrdenDetaProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			OrdenDetaProduLogic ordendetaproduLogic=new OrdenDetaProduLogic();

			ordendetaproduLogic.getOrdenDetaProduDataAccess().setIsForForeingKeyData(true);

			if(this.productoordendetaprodumaquinaSessionBean==null) {
				this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
			}

			if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordendetaproduLogic.getOrdenDetaProduDataAccess().setIsForForeingKeyData(true);

					ordendetaproduLogic.getTodosOrdenDetaProdusWithConnection(sFinalQuery,new Pagination());

					this.ordendetaprodusForeignKey=ordendetaproduLogic.getOrdenDetaProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaOrdenDetaProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordendetaproduLogic.getEntityWithConnection(productoordendetaprodumaquinaSessionBean.getlidOrdenDetaProduActual());
					this.ordendetaprodusForeignKey.add(ordendetaproduLogic.getOrdenDetaProdu());
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

			if(this.productoordendetaprodumaquinaSessionBean==null) {
				this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
			}

			if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoAreaEmpresaProdu()) {
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
					tipoareaempresaproduLogic.getEntityWithConnection(productoordendetaprodumaquinaSessionBean.getlidTipoAreaEmpresaProduActual());
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

			if(this.productoordendetaprodumaquinaSessionBean==null) {
				this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
			}

			if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu()) {
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
					tipoprocesoempresaproduLogic.getEntityWithConnection(productoordendetaprodumaquinaSessionBean.getlidTipoProcesoEmpresaProduActual());
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

			if(this.productoordendetaprodumaquinaSessionBean==null) {
				this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
			}

			if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoMaquinaEmpresa()) {
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
					tipomaquinaempresaLogic.getEntityWithConnection(productoordendetaprodumaquinaSessionBean.getlidTipoMaquinaEmpresaActual());
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

			if(this.productoordendetaprodumaquinaSessionBean==null) {
				this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
			}

			if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(productoordendetaprodumaquinaSessionBean.getlidUnidadActual());
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

	
	
	public void setActualOrdenDetaProduForeignKey(Long idOrdenDetaProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			OrdenDetaProdu  ordendetaproduTemp=null;

			for(OrdenDetaProdu ordendetaproduAux:ordendetaprodusForeignKey) {
				if(ordendetaproduAux.getId()!=null && ordendetaproduAux.getId().equals(idOrdenDetaProduSeleccionado)) {
					ordendetaproduTemp=ordendetaproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ordendetaproduTemp!=null) {

					if(this.productoordendetaprodumaquina!=null) {
						this.productoordendetaprodumaquina.setOrdenDetaProdu(ordendetaproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setSelectedItem(ordendetaproduTemp);
					}
				} else {
					//jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setSelectedItem(ordendetaproduTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdOrdenDetaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(ordendetaproduTemp!=null && jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina!=null) {
						jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setSelectedItem(ordendetaproduTemp);
					} else {
						if(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina!=null) {
							//jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setSelectedItem(ordendetaproduTemp);
							if(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.getItemCount()>0) {
								jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setSelectedIndex(0);
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

	public String getActualOrdenDetaProduForeignKeyDescripcion(Long idOrdenDetaProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			OrdenDetaProdu  ordendetaproduTemp=null;

			for(OrdenDetaProdu ordendetaproduAux:ordendetaprodusForeignKey) {
				if(ordendetaproduAux.getId()!=null && ordendetaproduAux.getId().equals(idOrdenDetaProduSeleccionado)) {
					ordendetaproduTemp=ordendetaproduAux;
					break;
				}
			}


			sDescripcion=OrdenDetaProduConstantesFunciones.getOrdenDetaProduDescripcion(ordendetaproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualOrdenDetaProduForeignKeyGenerico(Long idOrdenDetaProduSeleccionado,JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquinaGenerico)throws Exception
	{
		try
		{
			OrdenDetaProdu  ordendetaproduTemp=null;

			for(OrdenDetaProdu ordendetaproduAux:ordendetaprodusForeignKey) {
				if(ordendetaproduAux.getId()!=null && ordendetaproduAux.getId().equals(idOrdenDetaProduSeleccionado)) {
					ordendetaproduTemp=ordendetaproduAux;
					break;
				}
			}

			if(ordendetaproduTemp!=null) {
				jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquinaGenerico.setSelectedItem(ordendetaproduTemp);
			} else {
				if(jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquinaGenerico!=null && jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquinaGenerico.getItemCount()>0) {
					jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquinaGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodumaquina!=null) {
						this.productoordendetaprodumaquina.setTipoAreaEmpresaProdu(tipoareaempresaproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setSelectedItem(tipoareaempresaproduTemp);
					}
				} else {
					//jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setSelectedItem(tipoareaempresaproduTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoAreaEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoareaempresaproduTemp!=null && jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina!=null) {
						jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setSelectedItem(tipoareaempresaproduTemp);
					} else {
						if(jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina!=null) {
							//jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setSelectedItem(tipoareaempresaproduTemp);
							if(jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.getItemCount()>0) {
								jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setSelectedIndex(0);
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
	public void setActualTipoAreaEmpresaProduForeignKeyGenerico(Long idTipoAreaEmpresaProduSeleccionado,JComboBox jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaGenerico)throws Exception
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
				jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaGenerico.setSelectedItem(tipoareaempresaproduTemp);
			} else {
				if(jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaGenerico!=null && jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodumaquina!=null) {
						this.productoordendetaprodumaquina.setTipoProcesoEmpresaProdu(tipoprocesoempresaproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setSelectedItem(tipoprocesoempresaproduTemp);
					}
				} else {
					//jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setSelectedItem(tipoprocesoempresaproduTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProcesoEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprocesoempresaproduTemp!=null && jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina!=null) {
						jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setSelectedItem(tipoprocesoempresaproduTemp);
					} else {
						if(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina!=null) {
							//jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setSelectedItem(tipoprocesoempresaproduTemp);
							if(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.getItemCount()>0) {
								jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setSelectedIndex(0);
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
	public void setActualTipoProcesoEmpresaProduForeignKeyGenerico(Long idTipoProcesoEmpresaProduSeleccionado,JComboBox jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaGenerico)throws Exception
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
				jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaGenerico.setSelectedItem(tipoprocesoempresaproduTemp);
			} else {
				if(jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaGenerico!=null && jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodumaquina!=null) {
						this.productoordendetaprodumaquina.setTipoMaquinaEmpresa(tipomaquinaempresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setSelectedItem(tipomaquinaempresaTemp);
					}
				} else {
					//jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setSelectedItem(tipomaquinaempresaTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoMaquinaEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomaquinaempresaTemp!=null && jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina!=null) {
						jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setSelectedItem(tipomaquinaempresaTemp);
					} else {
						if(jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina!=null) {
							//jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setSelectedItem(tipomaquinaempresaTemp);
							if(jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.getItemCount()>0) {
								jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setSelectedIndex(0);
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
	public void setActualTipoMaquinaEmpresaForeignKeyGenerico(Long idTipoMaquinaEmpresaSeleccionado,JComboBox jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquinaGenerico)throws Exception
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
				jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquinaGenerico.setSelectedItem(tipomaquinaempresaTemp);
			} else {
				if(jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquinaGenerico!=null && jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquinaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquinaGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodumaquina!=null) {
						this.productoordendetaprodumaquina.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadProductoOrdenDetaProduMaquina.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina!=null) {
						jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina!=null) {
							//jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadProductoOrdenDetaProduMaquinaGenerico)throws Exception
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
				jComboBoxid_unidadProductoOrdenDetaProduMaquinaGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadProductoOrdenDetaProduMaquinaGenerico!=null && jComboBoxid_unidadProductoOrdenDetaProduMaquinaGenerico.getItemCount()>0) {
					jComboBoxid_unidadProductoOrdenDetaProduMaquinaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarOrdenDetaProduForeignKey(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquinaGenerico)throws Exception
	{
		try
		{
			OrdenDetaProdu  ordendetaproduAux=new OrdenDetaProdu();

			if(jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquinaGenerico==null) {
				ordendetaproduAux=(OrdenDetaProdu)this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.getSelectedItem();
			} else {
				ordendetaproduAux=(OrdenDetaProdu)jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquinaGenerico.getSelectedItem();
			}

			if(ordendetaproduAux!=null && ordendetaproduAux.getId()!=null) {
				productoordendetaprodumaquina.setid_orden_deta_produ(ordendetaproduAux.getId());
				productoordendetaprodumaquina.setordendetaprodu_descripcion(ProductoOrdenDetaProduMaquinaConstantesFunciones.getOrdenDetaProduDescripcion(ordendetaproduAux));
				productoordendetaprodumaquina.setOrdenDetaProdu(ordendetaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoAreaEmpresaProduForeignKey(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,JComboBox jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaGenerico)throws Exception
	{
		try
		{
			TipoAreaEmpresaProdu  tipoareaempresaproduAux=new TipoAreaEmpresaProdu();

			if(jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaGenerico==null) {
				tipoareaempresaproduAux=(TipoAreaEmpresaProdu)this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.getSelectedItem();
			} else {
				tipoareaempresaproduAux=(TipoAreaEmpresaProdu)jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaGenerico.getSelectedItem();
			}

			if(tipoareaempresaproduAux!=null && tipoareaempresaproduAux.getId()!=null) {
				productoordendetaprodumaquina.setid_tipo_area_empresa_produ(tipoareaempresaproduAux.getId());
				productoordendetaprodumaquina.settipoareaempresaprodu_descripcion(ProductoOrdenDetaProduMaquinaConstantesFunciones.getTipoAreaEmpresaProduDescripcion(tipoareaempresaproduAux));
				productoordendetaprodumaquina.setTipoAreaEmpresaProdu(tipoareaempresaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProcesoEmpresaProduForeignKey(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,JComboBox jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaGenerico)throws Exception
	{
		try
		{
			TipoProcesoEmpresaProdu  tipoprocesoempresaproduAux=new TipoProcesoEmpresaProdu();

			if(jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaGenerico==null) {
				tipoprocesoempresaproduAux=(TipoProcesoEmpresaProdu)this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.getSelectedItem();
			} else {
				tipoprocesoempresaproduAux=(TipoProcesoEmpresaProdu)jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaGenerico.getSelectedItem();
			}

			if(tipoprocesoempresaproduAux!=null && tipoprocesoempresaproduAux.getId()!=null) {
				productoordendetaprodumaquina.setid_tipo_proceso_empresa_produ(tipoprocesoempresaproduAux.getId());
				productoordendetaprodumaquina.settipoprocesoempresaprodu_descripcion(ProductoOrdenDetaProduMaquinaConstantesFunciones.getTipoProcesoEmpresaProduDescripcion(tipoprocesoempresaproduAux));
				productoordendetaprodumaquina.setTipoProcesoEmpresaProdu(tipoprocesoempresaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMaquinaEmpresaForeignKey(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,JComboBox jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquinaGenerico)throws Exception
	{
		try
		{
			TipoMaquinaEmpresa  tipomaquinaempresaAux=new TipoMaquinaEmpresa();

			if(jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquinaGenerico==null) {
				tipomaquinaempresaAux=(TipoMaquinaEmpresa)this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.getSelectedItem();
			} else {
				tipomaquinaempresaAux=(TipoMaquinaEmpresa)jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquinaGenerico.getSelectedItem();
			}

			if(tipomaquinaempresaAux!=null && tipomaquinaempresaAux.getId()!=null) {
				productoordendetaprodumaquina.setid_tipo_merma_empresa(tipomaquinaempresaAux.getId());
				productoordendetaprodumaquina.settipomaquinaempresa_descripcion(ProductoOrdenDetaProduMaquinaConstantesFunciones.getTipoMaquinaEmpresaDescripcion(tipomaquinaempresaAux));
				productoordendetaprodumaquina.setTipoMaquinaEmpresa(tipomaquinaempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,JComboBox jComboBoxid_unidadProductoOrdenDetaProduMaquinaGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadProductoOrdenDetaProduMaquinaGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadProductoOrdenDetaProduMaquinaGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				productoordendetaprodumaquina.setid_unidad(unidadAux.getId());
				productoordendetaprodumaquina.setunidad_descripcion(ProductoOrdenDetaProduMaquinaConstantesFunciones.getUnidadDescripcion(unidadAux));
				productoordendetaprodumaquina.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameOrdenDetaProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingOrdenDetaProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.removeAllItems();

							for(OrdenDetaProdu ordendetaprodu:this.ordendetaprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.addItem(ordendetaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { 
					}

					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdOrdenDetaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.removeAllItems();

							for(OrdenDetaProdu ordendetaprodu:this.ordendetaprodusForeignKey) {
								this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.addItem(ordendetaprodu);
							}
						}

						if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.removeAllItems();

							for(TipoAreaEmpresaProdu tipoareaempresaprodu:this.tipoareaempresaprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.addItem(tipoareaempresaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { 
					}

					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoAreaEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.removeAllItems();

							for(TipoAreaEmpresaProdu tipoareaempresaprodu:this.tipoareaempresaprodusForeignKey) {
								this.jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.addItem(tipoareaempresaprodu);
							}
						}

						if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.removeAllItems();

							for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:this.tipoprocesoempresaprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.addItem(tipoprocesoempresaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { 
					}

					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProcesoEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.removeAllItems();

							for(TipoProcesoEmpresaProdu tipoprocesoempresaprodu:this.tipoprocesoempresaprodusForeignKey) {
								this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.addItem(tipoprocesoempresaprodu);
							}
						}

						if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.removeAllItems();

							for(TipoMaquinaEmpresa tipomaquinaempresa:this.tipomaquinaempresasForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.addItem(tipomaquinaempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { 
					}

					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoMaquinaEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.removeAllItems();

							for(TipoMaquinaEmpresa tipomaquinaempresa:this.tipomaquinaempresasForeignKey) {
								this.jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.addItem(tipomaquinaempresa);
							}
						}

						if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { 
					}

					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.addItem(unidad);
							}
						}

						if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameOrdenDetaProduForeignKey(OrdenDetaProdu ordendetaprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setSelectedItem(ordendetaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setSelectedItem(ordendetaprodu);
						} else {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setSelectedItem(tipoareaempresaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setSelectedItem(tipoareaempresaprodu);
						} else {
							this.jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setSelectedItem(tipoprocesoempresaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setSelectedItem(tipoprocesoempresaprodu);
						} else {
							this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setSelectedItem(tipomaquinaempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setSelectedItem(tipomaquinaempresa);
						} else {
							this.jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoOrdenDetaProduMaquina() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoOrdenDetaProduMaquinaConstantesFunciones.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoOrdenDetaProduMaquinaConstantesFunciones.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(OrdenDetaProdu.class));
		classes.add(new Classe(TipoAreaEmpresaProdu.class));
		classes.add(new Classe(TipoProcesoEmpresaProdu.class));
		classes.add(new Classe(TipoMaquinaEmpresa.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(this.productoordendetaprodumaquinas);
			productoordendetaprodumaquinaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoOrdenDetaProduMaquinaParameterReturnGeneral getProductoOrdenDetaProduMaquinaParameterGeneral() {
		return this.productoordendetaprodumaquinaParameterGeneral;
	}
	
	public void setProductoOrdenDetaProduMaquinaParameterGeneral(ProductoOrdenDetaProduMaquinaParameterReturnGeneral productoordendetaprodumaquinaParameterGeneral) {
		this.productoordendetaprodumaquinaParameterGeneral = productoordendetaprodumaquinaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoOrdenDetaProduMaquina() {
		return isPermisoTodoProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoTodoProductoOrdenDetaProduMaquina(Boolean isPermisoTodoProductoOrdenDetaProduMaquina) {
		this.isPermisoTodoProductoOrdenDetaProduMaquina = isPermisoTodoProductoOrdenDetaProduMaquina;
	}

	public Boolean getIsPermisoNuevoProductoOrdenDetaProduMaquina() {
		return isPermisoNuevoProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoNuevoProductoOrdenDetaProduMaquina(Boolean isPermisoNuevoProductoOrdenDetaProduMaquina) {
		this.isPermisoNuevoProductoOrdenDetaProduMaquina = isPermisoNuevoProductoOrdenDetaProduMaquina;
	}

	public Boolean getIsPermisoActualizarProductoOrdenDetaProduMaquina() {
		return isPermisoActualizarProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoActualizarProductoOrdenDetaProduMaquina(Boolean isPermisoActualizarProductoOrdenDetaProduMaquina) {
		this.isPermisoActualizarProductoOrdenDetaProduMaquina = isPermisoActualizarProductoOrdenDetaProduMaquina;
	}

	public Boolean getIsPermisoEliminarProductoOrdenDetaProduMaquina() {
		return isPermisoEliminarProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoEliminarProductoOrdenDetaProduMaquina(Boolean isPermisoEliminarProductoOrdenDetaProduMaquina) {
		this.isPermisoEliminarProductoOrdenDetaProduMaquina = isPermisoEliminarProductoOrdenDetaProduMaquina;
	}

	public Boolean getIsPermisoGuardarCambiosProductoOrdenDetaProduMaquina() {
		return isPermisoGuardarCambiosProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoGuardarCambiosProductoOrdenDetaProduMaquina(Boolean isPermisoGuardarCambiosProductoOrdenDetaProduMaquina) {
		this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina = isPermisoGuardarCambiosProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsPermisoConsultaProductoOrdenDetaProduMaquina() {
		return isPermisoConsultaProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoConsultaProductoOrdenDetaProduMaquina(Boolean isPermisoConsultaProductoOrdenDetaProduMaquina) {
		this.isPermisoConsultaProductoOrdenDetaProduMaquina = isPermisoConsultaProductoOrdenDetaProduMaquina;
	}

	public Boolean getIsPermisoBusquedaProductoOrdenDetaProduMaquina() {
		return isPermisoBusquedaProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoBusquedaProductoOrdenDetaProduMaquina(Boolean isPermisoBusquedaProductoOrdenDetaProduMaquina) {
		this.isPermisoBusquedaProductoOrdenDetaProduMaquina = isPermisoBusquedaProductoOrdenDetaProduMaquina;
	}

	public Boolean getIsPermisoReporteProductoOrdenDetaProduMaquina() {
		return isPermisoReporteProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoReporteProductoOrdenDetaProduMaquina(Boolean isPermisoReporteProductoOrdenDetaProduMaquina) {
		this.isPermisoReporteProductoOrdenDetaProduMaquina = isPermisoReporteProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoOrdenDetaProduMaquina() {
		return isPermisoPaginacionMedioProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoPaginacionMedioProductoOrdenDetaProduMaquina(Boolean isPermisoPaginacionMedioProductoOrdenDetaProduMaquina) {
		this.isPermisoPaginacionMedioProductoOrdenDetaProduMaquina = isPermisoPaginacionMedioProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoOrdenDetaProduMaquina() {
		return isPermisoPaginacionTodoProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoPaginacionTodoProductoOrdenDetaProduMaquina(Boolean isPermisoPaginacionTodoProductoOrdenDetaProduMaquina) {
		this.isPermisoPaginacionTodoProductoOrdenDetaProduMaquina = isPermisoPaginacionTodoProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoOrdenDetaProduMaquina() {
		return isPermisoPaginacionAltoProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoPaginacionAltoProductoOrdenDetaProduMaquina(Boolean isPermisoPaginacionAltoProductoOrdenDetaProduMaquina) {
		this.isPermisoPaginacionAltoProductoOrdenDetaProduMaquina = isPermisoPaginacionAltoProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsPermisoCopiarProductoOrdenDetaProduMaquina() {
		return isPermisoCopiarProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoCopiarProductoOrdenDetaProduMaquina(Boolean isPermisoCopiarProductoOrdenDetaProduMaquina) {
		this.isPermisoCopiarProductoOrdenDetaProduMaquina = isPermisoCopiarProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsPermisoVerFormProductoOrdenDetaProduMaquina() {
		return isPermisoVerFormProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoVerFormProductoOrdenDetaProduMaquina(Boolean isPermisoVerFormProductoOrdenDetaProduMaquina) {
		this.isPermisoVerFormProductoOrdenDetaProduMaquina = isPermisoVerFormProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsPermisoDuplicarProductoOrdenDetaProduMaquina() {
		return isPermisoDuplicarProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoDuplicarProductoOrdenDetaProduMaquina(Boolean isPermisoDuplicarProductoOrdenDetaProduMaquina) {
		this.isPermisoDuplicarProductoOrdenDetaProduMaquina = isPermisoDuplicarProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsPermisoOrdenProductoOrdenDetaProduMaquina() {
		return isPermisoOrdenProductoOrdenDetaProduMaquina;
	}

	public void setIsPermisoOrdenProductoOrdenDetaProduMaquina(Boolean isPermisoOrdenProductoOrdenDetaProduMaquina) {
		this.isPermisoOrdenProductoOrdenDetaProduMaquina = isPermisoOrdenProductoOrdenDetaProduMaquina;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina() {
		return isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina;
	}

	public void setIsVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina(Boolean isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina) {
		this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina = isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina() {
		return isVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina;
	}

	public void setIsVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina(Boolean isVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina) {
		this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina = isVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina() {
		return isVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina;
	}

	public void setIsVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina(Boolean isVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina) {
		this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina = isVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina() {
		return isVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina;
	}

	public void setIsVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina(Boolean isVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina) {
		this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina = isVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina() {
		return isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina;
	}

	public void setIsVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina(Boolean isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina) {
		this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina = isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina() {
		return isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina(Boolean isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina) {
		this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina = isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoOrdenDetaProduMaquina() {
		return isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina;
	}

	public void setIsVisibilidadCeldaModificarProductoOrdenDetaProduMaquina(Boolean isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina) {
		this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina = isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina() {
		return isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina;
	}

	public void setIsVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina(Boolean isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina) {
		this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina = isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina() {
		return isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina;
	}

	public void setIsVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina(Boolean isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina) {
		this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina = isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina() {
		return isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina;
	}

	public void setIsVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina(Boolean isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina) {
		this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina = isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina() {
		return isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina;
	}

	public void setIsVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina(Boolean isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina) {
		this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina = isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina() {
		return isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina(Boolean isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina) {
		this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina = isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina;
	}
		
	public ProductoOrdenDetaProduMaquinaSessionBean getproductoordendetaprodumaquinaSessionBean() {
		return this.productoordendetaprodumaquinaSessionBean;
	}
	
	public void setproductoordendetaprodumaquinaSessionBean(ProductoOrdenDetaProduMaquinaSessionBean productoordendetaprodumaquinaSessionBean) {
		this.productoordendetaprodumaquinaSessionBean=productoordendetaprodumaquinaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdOrdenDetaProdu() {
		return this.isVisibilidadFK_IdOrdenDetaProdu;
	}

	public void setisVisibilidadFK_IdOrdenDetaProdu(Boolean isVisibilidadFK_IdOrdenDetaProdu) {
		this.isVisibilidadFK_IdOrdenDetaProdu=isVisibilidadFK_IdOrdenDetaProdu;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina)throws Exception {
		try {
			
				this.setActualParaGuardarOrdenDetaProduForeignKey(productoordendetaprodumaquina,null);
				this.setActualParaGuardarTipoAreaEmpresaProduForeignKey(productoordendetaprodumaquina,null);
				this.setActualParaGuardarTipoProcesoEmpresaProduForeignKey(productoordendetaprodumaquina,null);
				this.setActualParaGuardarTipoMaquinaEmpresaForeignKey(productoordendetaprodumaquina,null);
				this.setActualParaGuardarUnidadForeignKey(productoordendetaprodumaquina,null);
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
	
	public void bugActualizarReferenciaActual(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoOrdenDetaProduMaquina(productoordendetaprodumaquina);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoordendetaprodumaquinaAux.setId(productoordendetaprodumaquina.getId());
		productoordendetaprodumaquinaAux.setVersionRow(productoordendetaprodumaquina.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoOrdenDetaProduMaquina();
		
			int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoordendetaprodumaquinaValidator.getInvalidValues(this.productoordendetaprodumaquina);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoordendetaprodumaquinaLogic.setDatosCliente(datosCliente);
			productoordendetaprodumaquinaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoordendetaprodumaquinaAux=new  ProductoOrdenDetaProduMaquina();
				
				productoordendetaprodumaquinaAux.setIsNew(true);
				productoordendetaprodumaquinaAux.setIsChanged(true);
				
				productoordendetaprodumaquinaAux.setProductoOrdenDetaProduMaquinaOriginal(this.productoordendetaprodumaquina);
				
				productoordendetaprodumaquinaAux.setId(this.productoordendetaprodumaquina.getId());	
				productoordendetaprodumaquinaAux.setVersionRow(this.productoordendetaprodumaquina.getVersionRow());	
				productoordendetaprodumaquinaAux.setid_orden_deta_produ(this.productoordendetaprodumaquina.getid_orden_deta_produ());	
				productoordendetaprodumaquinaAux.setid_tipo_area_empresa_produ(this.productoordendetaprodumaquina.getid_tipo_area_empresa_produ());	
				productoordendetaprodumaquinaAux.setid_tipo_proceso_empresa_produ(this.productoordendetaprodumaquina.getid_tipo_proceso_empresa_produ());	
				productoordendetaprodumaquinaAux.setid_tipo_merma_empresa(this.productoordendetaprodumaquina.getid_tipo_merma_empresa());	
				productoordendetaprodumaquinaAux.setid_unidad(this.productoordendetaprodumaquina.getid_unidad());	
				productoordendetaprodumaquinaAux.setcantidad(this.productoordendetaprodumaquina.getcantidad());	
				productoordendetaprodumaquinaAux.setcosto(this.productoordendetaprodumaquina.getcosto());	
				productoordendetaprodumaquinaAux.setcosto_total(this.productoordendetaprodumaquina.getcosto_total());	
				productoordendetaprodumaquinaAux.setdescripcion(this.productoordendetaprodumaquina.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoordendetaprodumaquinaAux,productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodumaquinaAux,productoordendetaprodumaquinas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinaLogic.saveProductoOrdenDetaProduMaquinas();//WithConnection
						//productoordendetaprodumaquinaLogic.getSetVersionRowProductoOrdenDetaProduMaquinas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoordendetaprodumaquina,productoordendetaprodumaquinaAux);
					
					this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMaquina();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaprodumaquinaLogic.saveProductoOrdenDetaProduMaquinaRelaciones(productoordendetaprodumaquinaAux);//WithConnection
								//productoordendetaprodumaquinaLogic.getSetVersionRowProductoOrdenDetaProduMaquinas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoordendetaprodumaquina,productoordendetaprodumaquinaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoordendetaprodumaquinaAux,productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoordendetaprodumaquinaAux,productoordendetaprodumaquinas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoordendetaprodumaquina,productoordendetaprodumaquinaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoordendetaprodumaquinaAux=new  ProductoOrdenDetaProduMaquina();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() 
					|| (this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() && this.productoordendetaprodumaquina.getId()>=0)) {
						
					productoordendetaprodumaquinaAux.setIsNew(false);
				}
				
				productoordendetaprodumaquinaAux.setIsDeleted(false);
			
				productoordendetaprodumaquinaAux.setId(this.productoordendetaprodumaquina.getId());	
				productoordendetaprodumaquinaAux.setVersionRow(this.productoordendetaprodumaquina.getVersionRow());	
				productoordendetaprodumaquinaAux.setid_orden_deta_produ(this.productoordendetaprodumaquina.getid_orden_deta_produ());	
				productoordendetaprodumaquinaAux.setid_tipo_area_empresa_produ(this.productoordendetaprodumaquina.getid_tipo_area_empresa_produ());	
				productoordendetaprodumaquinaAux.setid_tipo_proceso_empresa_produ(this.productoordendetaprodumaquina.getid_tipo_proceso_empresa_produ());	
				productoordendetaprodumaquinaAux.setid_tipo_merma_empresa(this.productoordendetaprodumaquina.getid_tipo_merma_empresa());	
				productoordendetaprodumaquinaAux.setid_unidad(this.productoordendetaprodumaquina.getid_unidad());	
				productoordendetaprodumaquinaAux.setcantidad(this.productoordendetaprodumaquina.getcantidad());	
				productoordendetaprodumaquinaAux.setcosto(this.productoordendetaprodumaquina.getcosto());	
				productoordendetaprodumaquinaAux.setcosto_total(this.productoordendetaprodumaquina.getcosto_total());	
				productoordendetaprodumaquinaAux.setdescripcion(this.productoordendetaprodumaquina.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoordendetaprodumaquinaAux,productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodumaquinaAux,productoordendetaprodumaquinas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinaLogic.saveProductoOrdenDetaProduMaquinas();//WithConnection
						//productoordendetaprodumaquinaLogic.getSetVersionRowProductoOrdenDetaProduMaquinas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoordendetaprodumaquina,productoordendetaprodumaquinaAux);
					
					this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMaquina();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaprodumaquinaLogic.saveProductoOrdenDetaProduMaquinaRelaciones(productoordendetaprodumaquinaAux);//WithConnection
								//productoordendetaprodumaquinaLogic.getSetVersionRowProductoOrdenDetaProduMaquinas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoordendetaprodumaquina,productoordendetaprodumaquinaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoordendetaprodumaquinaAux,productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoordendetaprodumaquinaAux,productoordendetaprodumaquinas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoordendetaprodumaquina,productoordendetaprodumaquinaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoordendetaprodumaquinaAux=new  ProductoOrdenDetaProduMaquina();
				
				productoordendetaprodumaquinaAux.setIsNew(false);
				productoordendetaprodumaquinaAux.setIsChanged(false);
				
				productoordendetaprodumaquinaAux.setIsDeleted(true);
				
				productoordendetaprodumaquinaAux.setId(this.productoordendetaprodumaquina.getId());	
				productoordendetaprodumaquinaAux.setVersionRow(this.productoordendetaprodumaquina.getVersionRow());	
				productoordendetaprodumaquinaAux.setid_orden_deta_produ(this.productoordendetaprodumaquina.getid_orden_deta_produ());	
				productoordendetaprodumaquinaAux.setid_tipo_area_empresa_produ(this.productoordendetaprodumaquina.getid_tipo_area_empresa_produ());	
				productoordendetaprodumaquinaAux.setid_tipo_proceso_empresa_produ(this.productoordendetaprodumaquina.getid_tipo_proceso_empresa_produ());	
				productoordendetaprodumaquinaAux.setid_tipo_merma_empresa(this.productoordendetaprodumaquina.getid_tipo_merma_empresa());	
				productoordendetaprodumaquinaAux.setid_unidad(this.productoordendetaprodumaquina.getid_unidad());	
				productoordendetaprodumaquinaAux.setcantidad(this.productoordendetaprodumaquina.getcantidad());	
				productoordendetaprodumaquinaAux.setcosto(this.productoordendetaprodumaquina.getcosto());	
				productoordendetaprodumaquinaAux.setcosto_total(this.productoordendetaprodumaquina.getcosto_total());	
				productoordendetaprodumaquinaAux.setdescripcion(this.productoordendetaprodumaquina.getdescripcion());	
				
				if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoordendetaprodumaquinaAux.getId()>=0) {	
						this.productoordendetaprodumaquinasEliminados.add(productoordendetaprodumaquinaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoordendetaprodumaquinaAux,productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodumaquinaAux,productoordendetaprodumaquinas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinaLogic.saveProductoOrdenDetaProduMaquinas();//WithConnection
						//productoordendetaprodumaquinaLogic.getSetVersionRowProductoOrdenDetaProduMaquinas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaprodumaquinaLogic.saveProductoOrdenDetaProduMaquinaRelaciones(productoordendetaprodumaquinaAux);//WithConnection
								//productoordendetaprodumaquinaLogic.getSetVersionRowProductoOrdenDetaProduMaquinas();//WithConnection
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
							if(this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoordendetaprodumaquinaAux,productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoordendetaprodumaquinaAux,productoordendetaprodumaquinas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(this.productoordendetaprodumaquinasEliminados);
					
					productoordendetaprodumaquinaLogic.saveProductoOrdenDetaProduMaquinas();//WithConnection
					//productoordendetaprodumaquinaLogic.getSetVersionRowProductoOrdenDetaProduMaquinas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMaquina();
				
				this.productoordendetaprodumaquinasEliminados= new ArrayList<ProductoOrdenDetaProduMaquina>();		
			}
			
			if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Orden Maquina GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Orden Maquina",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoordendetaprodumaquina=productoordendetaprodumaquinaAux;
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
      		//this.finishProcessProductoOrdenDetaProduMaquina();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaLocal) throws Exception {
		
		if(this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaLocal) throws Exception {	
		if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(OrdenDetaProduDetalleFormJInternalFrame.class)) {
				OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrameLocal=(OrdenDetaProduBeanSwingJInternalFrame) ((OrdenDetaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ordendetaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoOrdenDetaProdu(ordendetaproduBeanSwingJInternalFrameLocal.getordendetaprodu(),true);
				ordendetaproduBeanSwingJInternalFrameLocal.actualizarLista(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu,this.ordendetaprodusForeignKey);

				ordendetaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu);

				productoordendetaprodumaquinaLocal.setOrdenDetaProdu(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu);

				this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
				this.cargarCombosFrameOrdenDetaProdusForeignKey("Formulario");
				this.setActualOrdenDetaProduForeignKey(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoAreaEmpresaProduDetalleFormJInternalFrame.class)) {
				TipoAreaEmpresaProduBeanSwingJInternalFrame tipoareaempresaproduBeanSwingJInternalFrameLocal=(TipoAreaEmpresaProduBeanSwingJInternalFrame) ((TipoAreaEmpresaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoareaempresaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoAreaEmpresaProdu(tipoareaempresaproduBeanSwingJInternalFrameLocal.gettipoareaempresaprodu(),true);
				tipoareaempresaproduBeanSwingJInternalFrameLocal.actualizarLista(tipoareaempresaproduBeanSwingJInternalFrameLocal.tipoareaempresaprodu,this.tipoareaempresaprodusForeignKey);

				tipoareaempresaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoareaempresaproduBeanSwingJInternalFrameLocal.tipoareaempresaprodu);

				productoordendetaprodumaquinaLocal.setTipoAreaEmpresaProdu(tipoareaempresaproduBeanSwingJInternalFrameLocal.tipoareaempresaprodu);

				this.addItemDefectoCombosForeignKeyTipoAreaEmpresaProdu();
				this.cargarCombosFrameTipoAreaEmpresaProdusForeignKey("Formulario");
				this.setActualTipoAreaEmpresaProduForeignKey(tipoareaempresaproduBeanSwingJInternalFrameLocal.tipoareaempresaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProcesoEmpresaProduDetalleFormJInternalFrame.class)) {
				TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrameLocal=(TipoProcesoEmpresaProduBeanSwingJInternalFrame) ((TipoProcesoEmpresaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprocesoempresaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProcesoEmpresaProdu(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.gettipoprocesoempresaprodu(),true);
				tipoprocesoempresaproduBeanSwingJInternalFrameLocal.actualizarLista(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu,this.tipoprocesoempresaprodusForeignKey);

				tipoprocesoempresaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu);

				productoordendetaprodumaquinaLocal.setTipoProcesoEmpresaProdu(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu);

				this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
				this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey("Formulario");
				this.setActualTipoProcesoEmpresaProduForeignKey(tipoprocesoempresaproduBeanSwingJInternalFrameLocal.tipoprocesoempresaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMaquinaEmpresaDetalleFormJInternalFrame.class)) {
				TipoMaquinaEmpresaBeanSwingJInternalFrame tipomaquinaempresaBeanSwingJInternalFrameLocal=(TipoMaquinaEmpresaBeanSwingJInternalFrame) ((TipoMaquinaEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomaquinaempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMaquinaEmpresa(tipomaquinaempresaBeanSwingJInternalFrameLocal.gettipomaquinaempresa(),true);
				tipomaquinaempresaBeanSwingJInternalFrameLocal.actualizarLista(tipomaquinaempresaBeanSwingJInternalFrameLocal.tipomaquinaempresa,this.tipomaquinaempresasForeignKey);

				tipomaquinaempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomaquinaempresaBeanSwingJInternalFrameLocal.tipomaquinaempresa);

				productoordendetaprodumaquinaLocal.setTipoMaquinaEmpresa(tipomaquinaempresaBeanSwingJInternalFrameLocal.tipomaquinaempresa);

				this.addItemDefectoCombosForeignKeyTipoMaquinaEmpresa();
				this.cargarCombosFrameTipoMaquinaEmpresasForeignKey("Formulario");
				this.setActualTipoMaquinaEmpresaForeignKey(tipomaquinaempresaBeanSwingJInternalFrameLocal.tipomaquinaempresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				productoordendetaprodumaquinaLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoOrdenDetaProduMaquinaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoordendetaprodumaquinaValidator.getInvalidValues(this.productoordendetaprodumaquina);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinas) throws Exception {
		try	{		
			ProductoOrdenDetaProduMaquinaConstantesFunciones.actualizarLista(productoordendetaprodumaquina,productoordendetaprodumaquinas,this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinas) throws Exception {
		try	{			
			ProductoOrdenDetaProduMaquinaConstantesFunciones.actualizarSelectedLista(productoordendetaprodumaquina,productoordendetaprodumaquinas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoordendetaprodumaquinasLocal=this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoordendetaprodumaquinasLocal=this.productoordendetaprodumaquinas;
			}
			//ARCHITECTURE
		
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaLocal:productoordendetaprodumaquinasLocal) {
				if(this.permiteMantenimiento(productoordendetaprodumaquinaLocal) && productoordendetaprodumaquinaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoOrdenDetaProduMaquinaConstantesFunciones.getProductoOrdenDetaProduMaquinaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.IDORDENDETAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelid_orden_deta_produProductoOrdenDetaProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.IDTIPOAREAEMPRESAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.IDTIPOPROCESOEMPRESAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.IDTIPOMAQUINAEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelid_unidadProductoOrdenDetaProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelcantidadProductoOrdenDetaProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelcostoProductoOrdenDetaProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelcosto_totalProductoOrdenDetaProduMaquina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabeldescripcionProductoOrdenDetaProduMaquina,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelid_orden_deta_produProductoOrdenDetaProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelid_unidadProductoOrdenDetaProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelcantidadProductoOrdenDetaProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelcostoProductoOrdenDetaProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelcosto_totalProductoOrdenDetaProduMaquina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabeldescripcionProductoOrdenDetaProduMaquina,"");
		
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
		this.iIdNuevoProductoOrdenDetaProduMaquina--;	
		
		
		this.productoordendetaprodumaquinaAux=new ProductoOrdenDetaProduMaquina();
		
		this.productoordendetaprodumaquinaAux.setId(this.iIdNuevoProductoOrdenDetaProduMaquina);
		this.productoordendetaprodumaquinaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().add(this.productoordendetaprodumaquinaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoordendetaprodumaquinas.add(this.productoordendetaprodumaquinaAux);
		}
		//ARCHITECTURE
		
		this.productoordendetaprodumaquina=this.productoordendetaprodumaquinaAux;
		
		if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
		}
				
		//this.setDefaultControlesProductoOrdenDetaProduMaquina();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoOrdenDetaProduMaquina();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduMaquina();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProduMaquina();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaBean,this.productoordendetaprodumaquina,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
			classes=ProductoOrdenDetaProduMaquinaConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProduMaquina(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoordendetaprodumaquinaReturnGeneral=productoordendetaprodumaquinaLogic.procesarEventosProductoOrdenDetaProduMaquinasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.productoordendetaprodumaquina,this.productoordendetaprodumaquinaParameterGeneral,this.isEsNuevoProductoOrdenDetaProduMaquina,classes);//this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquina()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaReturnGeneral,this.productoordendetaprodumaquinaBean,false);
		
		if(this.productoordendetaprodumaquinaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaReturnGeneral.getProductoOrdenDetaProduMaquina());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaReturnGeneral.getProductoOrdenDetaProduMaquina());
		}
		
		if(this.productoordendetaprodumaquinaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaReturnGeneral.getProductoOrdenDetaProduMaquina(),classes);//this.productoordendetaprodumaquinaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoOrdenDetaProduMaquina();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoOrdenDetaProduMaquina();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.RecargarFormProductoOrdenDetaProduMaquina(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
						
			if(productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProduMaquina();
			}
			
			this.actualizarVisualTableDatosProductoOrdenDetaProduMaquina();
			
			this.jTableDatosProductoOrdenDetaProduMaquina.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduMaquina(), this.getIndiceNuevoProductoOrdenDetaProduMaquina());
			
			this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
						
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoOrdenDetaProduMaquina(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcantidadProductoOrdenDetaProduMaquina.setEnabled(isHabilitar && this.productoordendetaprodumaquinaConstantesFunciones.activarcantidadProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcostoProductoOrdenDetaProduMaquina.setEnabled(isHabilitar && this.productoordendetaprodumaquinaConstantesFunciones.activarcostoProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcosto_totalProductoOrdenDetaProduMaquina.setEnabled(isHabilitar && this.productoordendetaprodumaquinaConstantesFunciones.activarcosto_totalProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextAreadescripcionProductoOrdenDetaProduMaquina.setEnabled(isHabilitar && this.productoordendetaprodumaquinaConstantesFunciones.activardescripcionProductoOrdenDetaProduMaquina);	
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setEnabled(isHabilitar && this.productoordendetaprodumaquinaConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setEnabled(isHabilitar && this.productoordendetaprodumaquinaConstantesFunciones.activarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setEnabled(isHabilitar && this.productoordendetaprodumaquinaConstantesFunciones.activarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setEnabled(isHabilitar && this.productoordendetaprodumaquinaConstantesFunciones.activarid_tipo_merma_empresaProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.setEnabled(isHabilitar && this.productoordendetaprodumaquinaConstantesFunciones.activarid_unidadProductoOrdenDetaProduMaquina);
	};
	
	public void setDefaultControlesProductoOrdenDetaProduMaquina() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProduMaquina(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(true);			
			this.productoordendetaprodumaquinaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.setVisible(true);
			
					
		} else {
			//this.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(false);			
			this.productoordendetaprodumaquinaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoOrdenDetaProduMaquina() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()) {
				if(productoordendetaprodumaquinaAux.getId().equals(this.iIdNuevoProductoOrdenDetaProduMaquina)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinas) {
				if(productoordendetaprodumaquinaAux.getId().equals(this.iIdNuevoProductoOrdenDetaProduMaquina)) {
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
	
	public int getIndiceActualProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()) {
				if(productoordendetaprodumaquinaAux.getId().equals(productoordendetaprodumaquina.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinas) {
				if(productoordendetaprodumaquinaAux.getId().equals(productoordendetaprodumaquina.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()) {
				if(productoordendetaprodumaquinaAux.getProductoOrdenDetaProduMaquinaOriginal().getId().equals(productoordendetaprodumaquinaOriginal.getId())) {
					existe=true;
					productoordendetaprodumaquinaOriginal.setId(productoordendetaprodumaquinaAux.getId());
					productoordendetaprodumaquinaOriginal.setVersionRow(productoordendetaprodumaquinaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinas) {
				if(productoordendetaprodumaquinaAux.getProductoOrdenDetaProduMaquinaOriginal().getId().equals(productoordendetaprodumaquinaOriginal.getId())) {
					existe=true;
					productoordendetaprodumaquinaOriginal.setId(productoordendetaprodumaquinaAux.getId());
					productoordendetaprodumaquinaOriginal.setVersionRow(productoordendetaprodumaquinaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoOrdenDetaProduMaquina(Boolean esParaCancelar) throws Exception {
		productoordendetaprodumaquinasAux=new ArrayList<ProductoOrdenDetaProduMaquina>();
		productoordendetaprodumaquinaAux=new ProductoOrdenDetaProduMaquina();
		
		if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()) {
					if(productoordendetaprodumaquinaAux.getId()<0) {
						productoordendetaprodumaquinasAux.add(productoordendetaprodumaquinaAux);
					}		
				}
				this.iIdNuevoProductoOrdenDetaProduMaquina=0L;
				this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().removeAll(productoordendetaprodumaquinasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinas) {
					if(productoordendetaprodumaquinaAux.getId()<0) {
						productoordendetaprodumaquinasAux.add(productoordendetaprodumaquinaAux);
					}		
				}
				this.iIdNuevoProductoOrdenDetaProduMaquina=0L;
				this.productoordendetaprodumaquinas.removeAll(productoordendetaprodumaquinasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoOrdenDetaProduMaquina 
					&& this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size()>0
					) {
					productoordendetaprodumaquinaAux=this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().get(this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size() - 1);
				
					if(productoordendetaprodumaquinaAux.getId()<0) {
						this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().remove(productoordendetaprodumaquinaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoOrdenDetaProduMaquina && this.productoordendetaprodumaquinas.size()>0) {
					productoordendetaprodumaquinaAux=this.productoordendetaprodumaquinas.get(this.productoordendetaprodumaquinas.size() - 1);
				
					if(productoordendetaprodumaquinaAux.getId()<0) {
						this.productoordendetaprodumaquinas.remove(productoordendetaprodumaquinaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoOrdenDetaProduMaquina(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoordendetaprodumaquina.getId()<0) {
				this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().remove(this.productoordendetaprodumaquina);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoordendetaprodumaquina.getId()<0) {
				this.productoordendetaprodumaquinas.remove(this.productoordendetaprodumaquina);
			}
		}			
	}
	
	public void setEstadosInicialesProductoOrdenDetaProduMaquina(List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasAux) throws Exception {
		ProductoOrdenDetaProduMaquinaConstantesFunciones.setEstadosInicialesProductoOrdenDetaProduMaquina(productoordendetaprodumaquinasAux);
	}
	
	public void setEstadosInicialesProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux) throws Exception {
		ProductoOrdenDetaProduMaquinaConstantesFunciones.setEstadosInicialesProductoOrdenDetaProduMaquina(productoordendetaprodumaquinaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoOrdenDetaProduMaquinaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoOrdenDetaProduMaquinaActual()) {
				if(!this.isEsNuevoProductoOrdenDetaProduMaquina) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoOrdenDetaProduMaquina=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoOrdenDetaProduMaquinaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Orden Maquina ?", "MANTENIMIENTO DE Orden Maquina", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina) throws Exception {
		ProductoOrdenDetaProduMaquinaConstantesFunciones.seleccionarAsignar(this.productoordendetaprodumaquina,productoordendetaprodumaquina);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoOrdenDetaProduMaquina=this.isPermisoActualizarOriginalProductoOrdenDetaProduMaquina;
			
			
			this.seleccionarAsignar(productoordendetaprodumaquina);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoOrdenDetaProduMaquinaConstantesFunciones.quitarEspaciosProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoordendetaprodumaquinaSessionBean.setsFuncionBusquedaRapida(this.productoordendetaprodumaquinaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductoOrdenDetaProduMaquina) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoOrdenDetaProduMaquina(esParaCancelar);				
				this.cancelarNuevoProductoOrdenDetaProduMaquina(esParaCancelar);								
			}
			
			this.productoordendetaprodumaquina=new ProductoOrdenDetaProduMaquina();
			
			this.inicializarProductoOrdenDetaProduMaquina();
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoOrdenDetaProduMaquina() throws Exception {
		try {
			ProductoOrdenDetaProduMaquinaConstantesFunciones.inicializarProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoOrdenDetaProduMaquinas(String sAccionBusqueda,List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoOrdenDetaProduMaquina"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoOrdenDetaProduMaquinaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoOrdenDetaProduMaquinaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoOrdenDetaProduMaquina"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Orden Maquinaes");		
		parameters.put("busquedapor", ProductoOrdenDetaProduMaquinaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoOrdenDetaProduMaquina=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoOrdenDetaProduMaquinaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoOrdenDetaProduMaquinaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoOrdenDetaProduMaquina=new JRBeanArrayDataSource(ProductoOrdenDetaProduMaquinaJInternalFrame.TraerProductoOrdenDetaProduMaquinaBeans(productoordendetaprodumaquinasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoOrdenDetaProduMaquina);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoOrdenDetaProduMaquinaBean.TraerProductoOrdenDetaProduMaquinaBeans(productoordendetaprodumaquinasParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoOrdenDetaProduMaquinas(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumaquinasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoOrdenDetaProduMaquinas(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumaquinasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquinaActionPerformed(null);
					//this.generarExcelReporteProductoOrdenDetaProduMaquinas(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumaquinasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoOrdenDetaProduMaquinas(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumaquinasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoOrdenDetaProduMaquinas(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumaquinasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoOrdenDetaProduMaquinas(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodumaquinasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoOrdenDetaProduMaquinas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumaquina";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduMaquinas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoOrdenDetaProduMaquina("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina : productoordendetaprodumaquinasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoOrdenDetaProduMaquinaConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProduMaquina("NORMAL",row,workbook,productoordendetaprodumaquina,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Maquina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoOrdenDetaProduMaquina(String sTipo,Row row,Workbook workbook) {
		
		ProductoOrdenDetaProduMaquinaConstantesFunciones.generarExcelReporteHeaderProductoOrdenDetaProduMaquina(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoOrdenDetaProduMaquinas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumaquina_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduMaquinas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina : productoordendetaprodumaquinasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.getProductoOrdenDetaProduMaquinaDescripcion(productoordendetaprodumaquina));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumaquina.getordendetaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumaquina.gettipoareaempresaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumaquina.gettipoprocesoempresaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumaquina.gettipomaquinaempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumaquina.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumaquina.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumaquina.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumaquina.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodumaquina.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Maquina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoOrdenDetaProduMaquinas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasRespaldo=null;
		
		classes=ProductoOrdenDetaProduMaquinaConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProduMaquina(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoordendetaprodumaquinaLogic.setDatosCliente(this.datosCliente);
		this.productoordendetaprodumaquinaLogic.setDatosDeep(this.datosDeep);
		this.productoordendetaprodumaquinaLogic.setIsConDeep(true);
		
		productoordendetaprodumaquinasRespaldo=this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas();
		
		this.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(productoordendetaprodumaquinasParaReportes);	
		this.productoordendetaprodumaquinaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoordendetaprodumaquinasParaReportes=this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas();
		this.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(productoordendetaprodumaquinasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumaquina_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduMaquinas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoOrdenDetaProduMaquina("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina : productoordendetaprodumaquinasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoOrdenDetaProduMaquina("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoOrdenDetaProduMaquinaConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProduMaquina("NORMAL",row,workbook,productoordendetaprodumaquina,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.getProductoOrdenDetaProduMaquinaDescripcion(productoordendetaprodumaquina));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Maquina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoOrdenDetaProduMaquina() throws Exception {		
		this.startProcessProductoOrdenDetaProduMaquina(true);
	}
	
	public void startProcessProductoOrdenDetaProduMaquina(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina ,this.jPanelParametrosReportesProductoOrdenDetaProduMaquina, this.jScrollPanelDatosProductoOrdenDetaProduMaquina,this.jPanelPaginacionProductoOrdenDetaProduMaquina, this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina, this.jPanelAccionesProductoOrdenDetaProduMaquina,this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina,this.jmenuBarProductoOrdenDetaProduMaquina,this.jmenuBarDetalleProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,this.jTtoolBarDetalleProductoOrdenDetaProduMaquina);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProduMaquina=this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina; 
		
		final JPanel jPanelParametrosReportesProductoOrdenDetaProduMaquina=this.jPanelParametrosReportesProductoOrdenDetaProduMaquina;
		//final JScrollPane jScrollPanelDatosProductoOrdenDetaProduMaquina=this.jScrollPanelDatosProductoOrdenDetaProduMaquina;
		final JTable jTableDatosProductoOrdenDetaProduMaquina=this.jTableDatosProductoOrdenDetaProduMaquina;		
		final JPanel jPanelPaginacionProductoOrdenDetaProduMaquina=this.jPanelPaginacionProductoOrdenDetaProduMaquina;
		//final JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina=this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina;
		final JPanel jPanelAccionesProductoOrdenDetaProduMaquina=this.jPanelAccionesProductoOrdenDetaProduMaquina;
		
		JPanel jPanelCamposAuxiliarProductoOrdenDetaProduMaquina=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMaquina=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			jPanelCamposAuxiliarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelCamposProductoOrdenDetaProduMaquina;
			jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelAccionesFormularioProductoOrdenDetaProduMaquina;
		}
		
		final JPanel jPanelCamposProductoOrdenDetaProduMaquina=jPanelCamposAuxiliarProductoOrdenDetaProduMaquina;
		final JPanel jPanelAccionesFormularioProductoOrdenDetaProduMaquina=jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMaquina;
		
		
		final JMenuBar jmenuBarProductoOrdenDetaProduMaquina=this.jmenuBarProductoOrdenDetaProduMaquina;
		final JToolBar jTtoolBarProductoOrdenDetaProduMaquina=this.jTtoolBarProductoOrdenDetaProduMaquina;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoOrdenDetaProduMaquina=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMaquina=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			jmenuBarDetalleAuxiliarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jmenuBarDetalleProductoOrdenDetaProduMaquina;
			jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTtoolBarDetalleProductoOrdenDetaProduMaquina;
		}
		
		final JMenuBar jmenuBarDetalleProductoOrdenDetaProduMaquina=jmenuBarDetalleAuxiliarProductoOrdenDetaProduMaquina;
		final JToolBar jTtoolBarDetalleProductoOrdenDetaProduMaquina=jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMaquina;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoOrdenDetaProduMaquina;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoOrdenDetaProduMaquina;
			processRunnable.jTableDatos=jTableDatosProductoOrdenDetaProduMaquina;
			processRunnable.jPanelCampos=jPanelCamposProductoOrdenDetaProduMaquina;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoOrdenDetaProduMaquina;
			processRunnable.jPanelAcciones=jPanelAccionesProductoOrdenDetaProduMaquina;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoOrdenDetaProduMaquina;
			
			
			processRunnable.jmenuBar=jmenuBarProductoOrdenDetaProduMaquina;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoOrdenDetaProduMaquina;
			processRunnable.jTtoolBar=jTtoolBarProductoOrdenDetaProduMaquina;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoOrdenDetaProduMaquina;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoOrdenDetaProduMaquina ,jPanelParametrosReportesProductoOrdenDetaProduMaquina,jTableDatosProductoOrdenDetaProduMaquina, /*jScrollPanelDatosProductoOrdenDetaProduMaquina,*/jPanelCamposProductoOrdenDetaProduMaquina,jPanelPaginacionProductoOrdenDetaProduMaquina, /*jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina,*/ jPanelAccionesProductoOrdenDetaProduMaquina,jPanelAccionesFormularioProductoOrdenDetaProduMaquina,jmenuBarProductoOrdenDetaProduMaquina,jmenuBarDetalleProductoOrdenDetaProduMaquina,jTtoolBarProductoOrdenDetaProduMaquina,jTtoolBarDetalleProductoOrdenDetaProduMaquina);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoOrdenDetaProduMaquina ,jPanelParametrosReportesProductoOrdenDetaProduMaquina, jScrollPanelDatosProductoOrdenDetaProduMaquina,jPanelPaginacionProductoOrdenDetaProduMaquina, jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina, jPanelAccionesProductoOrdenDetaProduMaquina,jPanelAccionesFormularioProductoOrdenDetaProduMaquina,jmenuBarProductoOrdenDetaProduMaquina,jmenuBarDetalleProductoOrdenDetaProduMaquina,jTtoolBarProductoOrdenDetaProduMaquina,jTtoolBarDetalleProductoOrdenDetaProduMaquina);
						
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
	
	public void finishProcessProductoOrdenDetaProduMaquina() {// throws Exception 
		this.finishProcessProductoOrdenDetaProduMaquina(true);
	}
	
	public void finishProcessProductoOrdenDetaProduMaquina(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina ,this.jPanelParametrosReportesProductoOrdenDetaProduMaquina, this.jScrollPanelDatosProductoOrdenDetaProduMaquina,this.jPanelPaginacionProductoOrdenDetaProduMaquina, this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina, this.jPanelAccionesProductoOrdenDetaProduMaquina,this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina,this.jmenuBarProductoOrdenDetaProduMaquina,this.jmenuBarDetalleProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,this.jTtoolBarDetalleProductoOrdenDetaProduMaquina);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProduMaquina=this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina; 
		
		final JPanel jPanelParametrosReportesProductoOrdenDetaProduMaquina=this.jPanelParametrosReportesProductoOrdenDetaProduMaquina;
		//final JScrollPane jScrollPanelDatosProductoOrdenDetaProduMaquina=this.jScrollPanelDatosProductoOrdenDetaProduMaquina;
		final JTable jTableDatosProductoOrdenDetaProduMaquina=this.jTableDatosProductoOrdenDetaProduMaquina;		
		final JPanel jPanelPaginacionProductoOrdenDetaProduMaquina=this.jPanelPaginacionProductoOrdenDetaProduMaquina;
		//final JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina=this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina;
		final JPanel jPanelAccionesProductoOrdenDetaProduMaquina=this.jPanelAccionesProductoOrdenDetaProduMaquina;
		
		JPanel jPanelCamposAuxiliarProductoOrdenDetaProduMaquina=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMaquina=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			jPanelCamposAuxiliarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelCamposProductoOrdenDetaProduMaquina;
			jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelAccionesFormularioProductoOrdenDetaProduMaquina;
		}
		
		final JPanel jPanelCamposProductoOrdenDetaProduMaquina=jPanelCamposAuxiliarProductoOrdenDetaProduMaquina;
		final JPanel jPanelAccionesFormularioProductoOrdenDetaProduMaquina=jPanelAccionesFormularioAuxiliarProductoOrdenDetaProduMaquina;
		
		
		final JMenuBar jmenuBarProductoOrdenDetaProduMaquina=this.jmenuBarProductoOrdenDetaProduMaquina;		
		final JToolBar jTtoolBarProductoOrdenDetaProduMaquina=this.jTtoolBarProductoOrdenDetaProduMaquina;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoOrdenDetaProduMaquina=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMaquina=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			jmenuBarDetalleAuxiliarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jmenuBarDetalleProductoOrdenDetaProduMaquina;
			jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTtoolBarDetalleProductoOrdenDetaProduMaquina;		
		}
		
		final JMenuBar jmenuBarDetalleProductoOrdenDetaProduMaquina=jmenuBarDetalleAuxiliarProductoOrdenDetaProduMaquina;
		final JToolBar jTtoolBarDetalleProductoOrdenDetaProduMaquina=jTtoolBarDetalleAuxiliarProductoOrdenDetaProduMaquina;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoOrdenDetaProduMaquina;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoOrdenDetaProduMaquina;
			processRunnable.jTableDatos=jTableDatosProductoOrdenDetaProduMaquina;
			processRunnable.jPanelCampos=jPanelCamposProductoOrdenDetaProduMaquina;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoOrdenDetaProduMaquina;
			processRunnable.jPanelAcciones=jPanelAccionesProductoOrdenDetaProduMaquina;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoOrdenDetaProduMaquina;
			
			
			processRunnable.jmenuBar=jmenuBarProductoOrdenDetaProduMaquina;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoOrdenDetaProduMaquina;
			processRunnable.jTtoolBar=jTtoolBarProductoOrdenDetaProduMaquina;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoOrdenDetaProduMaquina;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoOrdenDetaProduMaquina ,jPanelParametrosReportesProductoOrdenDetaProduMaquina, jTableDatosProductoOrdenDetaProduMaquina,/*jScrollPanelDatosProductoOrdenDetaProduMaquina,*/jPanelCamposProductoOrdenDetaProduMaquina,jPanelPaginacionProductoOrdenDetaProduMaquina, /*jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina,*/ jPanelAccionesProductoOrdenDetaProduMaquina,jPanelAccionesFormularioProductoOrdenDetaProduMaquina,jmenuBarProductoOrdenDetaProduMaquina,jmenuBarDetalleProductoOrdenDetaProduMaquina,jTtoolBarProductoOrdenDetaProduMaquina,jTtoolBarDetalleProductoOrdenDetaProduMaquina));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoOrdenDetaProduMaquina(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoOrdenDetaProduMaquina(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoOrdenDetaProduMaquina(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoOrdenDetaProduMaquina(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoOrdenDetaProduMaquina,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoOrdenDetaProduMaquina,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoOrdenDetaProduMaquina(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoOrdenDetaProduMaquina,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoOrdenDetaProduMaquina,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoordendetaprodumaquinaConstantesFunciones.getsFinalQueryProductoOrdenDetaProduMaquina();
		String  finalQueryPaginacionTodos=this.productoordendetaprodumaquinaConstantesFunciones.getsFinalQueryProductoOrdenDetaProduMaquina();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoOrdenDetaProduMaquinaConstantesFunciones.getArrayColumnasGlobalesNoProductoOrdenDetaProduMaquina(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoOrdenDetaProduMaquinaConstantesFunciones.getArrayColumnasGlobalesProductoOrdenDetaProduMaquina(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoOrdenDetaProduMaquinaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoordendetaprodumaquinasEliminados= new ArrayList<ProductoOrdenDetaProduMaquina>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoOrdenDetaProduMaquina();
		
				///*ProductoOrdenDetaProduMaquinaSessionBean*/this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
			
			if(this.productoordendetaprodumaquinaSessionBean==null) {
				this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
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
					this.iNumeroPaginacion=ProductoOrdenDetaProduMaquinaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoOrdenDetaProduMaquinaConstantesFunciones.getClassesForeignKeysOfProductoOrdenDetaProduMaquina(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoordendetaprodumaquina."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoordendetaprodumaquinasAux= new ArrayList<ProductoOrdenDetaProduMaquina>();
			
				
			productoordendetaprodumaquinaLogic.setDatosCliente(this.datosCliente);
			productoordendetaprodumaquinaLogic.setDatosDeep(this.datosDeep);
			productoordendetaprodumaquinaLogic.setIsConDeep(true);
			
			
			productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoordendetaprodumaquinaLogic.getTodosProductoOrdenDetaProduMaquinas(finalQueryGlobal,pagination);
					
					//productoordendetaprodumaquinaLogic.getTodosProductoOrdenDetaProduMaquinasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()==null|| productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodumaquinasAux= new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinasAux.addAll(productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinasAux= new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinasAux.addAll(productoordendetaprodumaquinas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodumaquinaLogic.getTodosProductoOrdenDetaProduMaquinas(finalQueryGlobal+"",this.pagination);												
							
							//productoordendetaprodumaquinaLogic.getTodosProductoOrdenDetaProduMaquinasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoOrdenDetaProduMaquinas("Todos",productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());					
							productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(productoordendetaprodumaquinasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinas=new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinas.addAll(productoordendetaprodumaquinasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoOrdenDetaProduMaquina=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoOrdenDetaProduMaquina=this.idActual;
				
				} else if(this.idProductoOrdenDetaProduMaquinaActual!=null && this.idProductoOrdenDetaProduMaquinaActual!=0L) {
					idProductoOrdenDetaProduMaquina=idProductoOrdenDetaProduMaquinaActual;
				}
				
					
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndicePorId(idProductoOrdenDetaProduMaquina);
				
				this.productoordendetaprodumaquinas=new ArrayList<ProductoOrdenDetaProduMaquina>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoordendetaprodumaquinaLogic.getEntity(idProductoOrdenDetaProduMaquina);
					
					//productoordendetaprodumaquinaLogic.getEntityWithConnection(idProductoOrdenDetaProduMaquina);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
					productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().add(productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquina());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumaquinas=new ArrayList<ProductoOrdenDetaProduMaquina>();
					this.productoordendetaprodumaquinas.add(productoordendetaprodumaquina);
				}
				
				if(productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquina()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdOrdenDetaProdu")) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdOrdenDetaProdu(finalQueryGlobal,pagination,id_orden_deta_produFK_IdOrdenDetaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()==null||productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodumaquinas==null|| productoordendetaprodumaquinas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinasAux=new ArrayList<ProductoOrdenDetaProduMaquina>();
						productoordendetaprodumaquinasAux.addAll(productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinasAux=new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinasAux.addAll(productoordendetaprodumaquinas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdOrdenDetaProdu(finalQueryGlobal,pagination,id_orden_deta_produFK_IdOrdenDetaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduMaquinas("FK_IdOrdenDetaProdu",productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduMaquinas("FK_IdOrdenDetaProdu",productoordendetaprodumaquinas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
						productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(productoordendetaprodumaquinasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinas=new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinas.addAll(productoordendetaprodumaquinasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoAreaEmpresaProdu")) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoAreaEmpresaProdu(id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdTipoAreaEmpresaProdu(finalQueryGlobal,pagination,id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoAreaEmpresaProdu(id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoAreaEmpresaProdu(id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()==null||productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodumaquinas==null|| productoordendetaprodumaquinas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinasAux=new ArrayList<ProductoOrdenDetaProduMaquina>();
						productoordendetaprodumaquinasAux.addAll(productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinasAux=new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinasAux.addAll(productoordendetaprodumaquinas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdTipoAreaEmpresaProdu(finalQueryGlobal,pagination,id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoAreaEmpresaProdu(id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoAreaEmpresaProdu(id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduMaquinas("FK_IdTipoAreaEmpresaProdu",productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduMaquinas("FK_IdTipoAreaEmpresaProdu",productoordendetaprodumaquinas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
						productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(productoordendetaprodumaquinasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinas=new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinas.addAll(productoordendetaprodumaquinasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoMaquinaEmpresa")) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoMaquinaEmpresa(id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdTipoMaquinaEmpresa(finalQueryGlobal,pagination,id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoMaquinaEmpresa(id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoMaquinaEmpresa(id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()==null||productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodumaquinas==null|| productoordendetaprodumaquinas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinasAux=new ArrayList<ProductoOrdenDetaProduMaquina>();
						productoordendetaprodumaquinasAux.addAll(productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinasAux=new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinasAux.addAll(productoordendetaprodumaquinas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdTipoMaquinaEmpresa(finalQueryGlobal,pagination,id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoMaquinaEmpresa(id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoMaquinaEmpresa(id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduMaquinas("FK_IdTipoMaquinaEmpresa",productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduMaquinas("FK_IdTipoMaquinaEmpresa",productoordendetaprodumaquinas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
						productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(productoordendetaprodumaquinasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinas=new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinas.addAll(productoordendetaprodumaquinasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProcesoEmpresaProdu")) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdTipoProcesoEmpresaProdu(finalQueryGlobal,pagination,id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()==null||productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodumaquinas==null|| productoordendetaprodumaquinas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinasAux=new ArrayList<ProductoOrdenDetaProduMaquina>();
						productoordendetaprodumaquinasAux.addAll(productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinasAux=new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinasAux.addAll(productoordendetaprodumaquinas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdTipoProcesoEmpresaProdu(finalQueryGlobal,pagination,id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoEmpresaProdu(id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduMaquinas("FK_IdTipoProcesoEmpresaProdu",productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduMaquinas("FK_IdTipoProcesoEmpresaProdu",productoordendetaprodumaquinas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
						productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(productoordendetaprodumaquinasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinas=new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinas.addAll(productoordendetaprodumaquinasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()==null||productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodumaquinas==null|| productoordendetaprodumaquinas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinasAux=new ArrayList<ProductoOrdenDetaProduMaquina>();
						productoordendetaprodumaquinasAux.addAll(productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinasAux=new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinasAux.addAll(productoordendetaprodumaquinas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduMaquinaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProduMaquinas("FK_IdUnidad",productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProduMaquinas("FK_IdUnidad",productoordendetaprodumaquinas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(new ArrayList<ProductoOrdenDetaProduMaquina>());
						productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().addAll(productoordendetaprodumaquinasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinas=new ArrayList<ProductoOrdenDetaProduMaquina>();
							productoordendetaprodumaquinas.addAll(productoordendetaprodumaquinasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoOrdenDetaProduMaquina();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoOrdenDetaProduMaquina();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodumaquinas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodumaquinas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina) {
		Boolean permite=true;
		
		if(this.productoordendetaprodumaquina.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoOrdenDetaProduMaquinaConstantesFunciones.getOrderByListaProductoOrdenDetaProduMaquina();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoOrdenDetaProduMaquinaConstantesFunciones.getOrderByListaProductoOrdenDetaProduMaquina();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()) {
				if(productoordendetaprodumaquina.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodumaquinaTotales=productoordendetaprodumaquina;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:this.productoordendetaprodumaquinas) {
				if(productoordendetaprodumaquina.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodumaquinaTotales=productoordendetaprodumaquina;
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
			this.productoordendetaprodumaquinaAux=new ProductoOrdenDetaProduMaquina();
			this.productoordendetaprodumaquinaAux.setsType(Constantes2.S_TOTALES);
			this.productoordendetaprodumaquinaAux.setIsNew(false);
			this.productoordendetaprodumaquinaAux.setIsChanged(false);
			this.productoordendetaprodumaquinaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoOrdenDetaProduMaquinaConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.productoordendetaprodumaquinaAux);
				
				this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().add(this.productoordendetaprodumaquinaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoOrdenDetaProduMaquinaConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinas,this.productoordendetaprodumaquinaAux);
				
				this.productoordendetaprodumaquinas.add(this.productoordendetaprodumaquinaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoordendetaprodumaquinaTotales=new ProductoOrdenDetaProduMaquina();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().remove(productoordendetaprodumaquinaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoordendetaprodumaquinas.remove(productoordendetaprodumaquinaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoordendetaprodumaquinaTotales=new ProductoOrdenDetaProduMaquina();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()) {
				if(productoordendetaprodumaquina.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodumaquinaTotales=productoordendetaprodumaquina;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoOrdenDetaProduMaquinaConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),productoordendetaprodumaquinaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:this.productoordendetaprodumaquinas) {
				if(productoordendetaprodumaquina.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaprodumaquinaTotales=productoordendetaprodumaquina;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoOrdenDetaProduMaquinaConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinas,productoordendetaprodumaquinaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoOrdenDetaProduMaquinasFK_IdOrdenDetaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdOrdenDetaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduMaquinasFK_IdTipoAreaEmpresaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoAreaEmpresaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduMaquinasFK_IdTipoMaquinaEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMaquinaEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduMaquinasFK_IdTipoProcesoEmpresaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProcesoEmpresaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProduMaquinasFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoOrdenDetaProduMaquinasFK_IdOrdenDetaProdu(String sFinalQuery,Long id_orden_deta_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdOrdenDetaProdu(sFinalQuery,this.pagination,id_orden_deta_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduMaquinasFK_IdTipoAreaEmpresaProdu(String sFinalQuery,Long id_tipo_area_empresa_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdTipoAreaEmpresaProdu(sFinalQuery,this.pagination,id_tipo_area_empresa_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduMaquinasFK_IdTipoMaquinaEmpresa(String sFinalQuery,Long id_tipo_merma_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdTipoMaquinaEmpresa(sFinalQuery,this.pagination,id_tipo_merma_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduMaquinasFK_IdTipoProcesoEmpresaProdu(String sFinalQuery,Long id_tipo_proceso_empresa_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdTipoProcesoEmpresaProdu(sFinalQuery,this.pagination,id_tipo_proceso_empresa_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProduMaquinasFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinasFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosProductoOrdenDetaProduMaquina() {
		this.isPermisoTodoProductoOrdenDetaProduMaquina=false;
		this.isPermisoNuevoProductoOrdenDetaProduMaquina=false;
		this.isPermisoActualizarProductoOrdenDetaProduMaquina=false;
		this.isPermisoActualizarOriginalProductoOrdenDetaProduMaquina=false;
		this.isPermisoEliminarProductoOrdenDetaProduMaquina=false;
		this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina=false;
		this.isPermisoConsultaProductoOrdenDetaProduMaquina=false;
		this.isPermisoBusquedaProductoOrdenDetaProduMaquina=false;
		this.isPermisoReporteProductoOrdenDetaProduMaquina=false;		
		this.isPermisoOrdenProductoOrdenDetaProduMaquina=false;		
		this.isPermisoPaginacionMedioProductoOrdenDetaProduMaquina=false;		
		this.isPermisoPaginacionAltoProductoOrdenDetaProduMaquina=false;
		this.isPermisoPaginacionTodoProductoOrdenDetaProduMaquina=false;
		this.isPermisoCopiarProductoOrdenDetaProduMaquina=false;		
		this.isPermisoVerFormProductoOrdenDetaProduMaquina=false;		
		this.isPermisoDuplicarProductoOrdenDetaProduMaquina=false;		
		this.isPermisoOrdenProductoOrdenDetaProduMaquina=false;		
	}
	
	public void setPermisosUsuarioProductoOrdenDetaProduMaquina(Boolean isPermiso) {
		this.isPermisoTodoProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoNuevoProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoActualizarProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoActualizarOriginalProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoEliminarProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoConsultaProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoBusquedaProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoReporteProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoOrdenProductoOrdenDetaProduMaquina=isPermiso;		
		this.isPermisoPaginacionMedioProductoOrdenDetaProduMaquina=isPermiso;		
		this.isPermisoPaginacionAltoProductoOrdenDetaProduMaquina=isPermiso;		
		this.isPermisoPaginacionTodoProductoOrdenDetaProduMaquina=isPermiso;		
		this.isPermisoCopiarProductoOrdenDetaProduMaquina=isPermiso;		
		this.isPermisoVerFormProductoOrdenDetaProduMaquina=isPermiso;		
		this.isPermisoDuplicarProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoOrdenProductoOrdenDetaProduMaquina=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoOrdenDetaProduMaquina(Boolean isPermiso) {
		//this.isPermisoTodoProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoNuevoProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoActualizarProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoActualizarOriginalProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoEliminarProductoOrdenDetaProduMaquina=isPermiso;
		this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina=isPermiso;
		//this.isPermisoConsultaProductoOrdenDetaProduMaquina=isPermiso;
		//this.isPermisoBusquedaProductoOrdenDetaProduMaquina=isPermiso;
		//this.isPermisoReporteProductoOrdenDetaProduMaquina=isPermiso;
		//this.isPermisoOrdenProductoOrdenDetaProduMaquina=isPermiso;		
		//this.isPermisoPaginacionMedioProductoOrdenDetaProduMaquina=isPermiso;		
		//this.isPermisoPaginacionAltoProductoOrdenDetaProduMaquina=isPermiso;		
		//this.isPermisoPaginacionTodoProductoOrdenDetaProduMaquina=isPermiso;		
		//this.isPermisoCopiarProductoOrdenDetaProduMaquina=isPermiso;		
		//this.isPermisoDuplicarProductoOrdenDetaProduMaquina=isPermiso;
		//this.isPermisoOrdenProductoOrdenDetaProduMaquina=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoOrdenDetaProduMaquinaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMaquina(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoOrdenDetaProduMaquinaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoOrdenDetaProduMaquinaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoOrdenDetaProduMaquinaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoOrdenDetaProduMaquinaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoOrdenDetaProduMaquina() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoOrdenDetaProduMaquinaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoOrdenDetaProduMaquina=this.isPermisoActualizarProductoOrdenDetaProduMaquina;
			this.isPermisoEliminarProductoOrdenDetaProduMaquina=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoOrdenDetaProduMaquina=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoOrdenDetaProduMaquina=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoOrdenDetaProduMaquina=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoOrdenDetaProduMaquina.setToolTipText(this.jTableDatosProductoOrdenDetaProduMaquina.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoOrdenDetaProduMaquina(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoOrdenDetaProduMaquina(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoOrdenDetaProduMaquina() throws Exception {
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
	public void inicializarCombosForeignKeyProductoOrdenDetaProduMaquinaListas()throws Exception {
		try	{						
			
				this.ordendetaprodusForeignKey=new ArrayList();
				this.tipoareaempresaprodusForeignKey=new ArrayList();
				this.tipoprocesoempresaprodusForeignKey=new ArrayList();
				this.tipomaquinaempresasForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoOrdenDetaProduMaquinaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoOrdenDetaProduMaquinaListas(false);
			} else {
			
				this.cargarCombosForeignKeyOrdenDetaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoAreaEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProcesoEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMaquinaEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyOrdenDetaProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ordendetaprodusForeignKey==null||this.ordendetaprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=OrdenDetaProduConstantesFunciones.getArrayColumnasGlobalesOrdenDetaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OrdenDetaProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=OrdenDetaProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosOrdenDetaProdusForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyProductoOrdenDetaProduMaquinaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoOrdenDetaProduMaquinaParameterReturnGeneral productoordendetaprodumaquinaReturnGeneral=new ProductoOrdenDetaProduMaquinaParameterReturnGeneral();
						
			


				String finalQueryGlobalOrdenDetaProdu="";

				if(((this.ordendetaprodusForeignKey==null||this.ordendetaprodusForeignKey.size()<=0) && this.productoordendetaprodumaquinaConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProduMaquina)
					 || (this.esRecargarFks && this.productoordendetaprodumaquinaConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProduMaquina)) {

					if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=OrdenDetaProduConstantesFunciones.getArrayColumnasGlobalesOrdenDetaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalOrdenDetaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OrdenDetaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalOrdenDetaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalOrdenDetaProdu, "");
						finalQueryGlobalOrdenDetaProdu+=OrdenDetaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosOrdenDetaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalOrdenDetaProdu=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodumaquinaSessionBean.getlidOrdenDetaProduActual();
					}
				} else {
					finalQueryGlobalOrdenDetaProdu="NONE";
				}


				String finalQueryGlobalTipoAreaEmpresaProdu="";

				if(((this.tipoareaempresaprodusForeignKey==null||this.tipoareaempresaprodusForeignKey.size()<=0) && this.productoordendetaprodumaquinaConstantesFunciones.cargarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina)
					 || (this.esRecargarFks && this.productoordendetaprodumaquinaConstantesFunciones.cargarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina)) {

					if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoAreaEmpresaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoAreaEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoAreaEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoAreaEmpresaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoAreaEmpresaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoAreaEmpresaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoAreaEmpresaProdu, "");
						finalQueryGlobalTipoAreaEmpresaProdu+=TipoAreaEmpresaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoAreaEmpresaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoAreaEmpresaProdu=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodumaquinaSessionBean.getlidTipoAreaEmpresaProduActual();
					}
				} else {
					finalQueryGlobalTipoAreaEmpresaProdu="NONE";
				}


				String finalQueryGlobalTipoProcesoEmpresaProdu="";

				if(((this.tipoprocesoempresaprodusForeignKey==null||this.tipoprocesoempresaprodusForeignKey.size()<=0) && this.productoordendetaprodumaquinaConstantesFunciones.cargarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina)
					 || (this.esRecargarFks && this.productoordendetaprodumaquinaConstantesFunciones.cargarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina)) {

					if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProcesoEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoProcesoEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProcesoEmpresaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProcesoEmpresaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProcesoEmpresaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProcesoEmpresaProdu, "");
						finalQueryGlobalTipoProcesoEmpresaProdu+=TipoProcesoEmpresaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProcesoEmpresaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProcesoEmpresaProdu=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodumaquinaSessionBean.getlidTipoProcesoEmpresaProduActual();
					}
				} else {
					finalQueryGlobalTipoProcesoEmpresaProdu="NONE";
				}


				String finalQueryGlobalTipoMaquinaEmpresa="";

				if(((this.tipomaquinaempresasForeignKey==null||this.tipomaquinaempresasForeignKey.size()<=0) && this.productoordendetaprodumaquinaConstantesFunciones.cargarid_tipo_merma_empresaProductoOrdenDetaProduMaquina)
					 || (this.esRecargarFks && this.productoordendetaprodumaquinaConstantesFunciones.cargarid_tipo_merma_empresaProductoOrdenDetaProduMaquina)) {

					if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoMaquinaEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMaquinaEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoMaquinaEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMaquinaEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMaquinaEmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMaquinaEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMaquinaEmpresa, "");
						finalQueryGlobalTipoMaquinaEmpresa+=TipoMaquinaEmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMaquinaEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMaquinaEmpresa=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodumaquinaSessionBean.getlidTipoMaquinaEmpresaActual();
					}
				} else {
					finalQueryGlobalTipoMaquinaEmpresa="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.productoordendetaprodumaquinaConstantesFunciones.cargarid_unidadProductoOrdenDetaProduMaquina)
					 || (this.esRecargarFks && this.productoordendetaprodumaquinaConstantesFunciones.cargarid_unidadProductoOrdenDetaProduMaquina)) {

					if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+productoordendetaprodumaquinaSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoordendetaprodumaquinaReturnGeneral=productoordendetaprodumaquinaLogic.cargarCombosLoteForeignKeyProductoOrdenDetaProduMaquina(finalQueryGlobalOrdenDetaProdu,finalQueryGlobalTipoAreaEmpresaProdu,finalQueryGlobalTipoProcesoEmpresaProdu,finalQueryGlobalTipoMaquinaEmpresa,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalOrdenDetaProdu.equals("NONE")) {
				this.ordendetaprodusForeignKey=productoordendetaprodumaquinaReturnGeneral.getordendetaprodusForeignKey();
			}

			if(!finalQueryGlobalTipoAreaEmpresaProdu.equals("NONE")) {
				this.tipoareaempresaprodusForeignKey=productoordendetaprodumaquinaReturnGeneral.gettipoareaempresaprodusForeignKey();
			}

			if(!finalQueryGlobalTipoProcesoEmpresaProdu.equals("NONE")) {
				this.tipoprocesoempresaprodusForeignKey=productoordendetaprodumaquinaReturnGeneral.gettipoprocesoempresaprodusForeignKey();
			}

			if(!finalQueryGlobalTipoMaquinaEmpresa.equals("NONE")) {
				this.tipomaquinaempresasForeignKey=productoordendetaprodumaquinaReturnGeneral.gettipomaquinaempresasForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=productoordendetaprodumaquinaReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoOrdenDetaProduMaquina()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
			this.addItemDefectoCombosForeignKeyTipoAreaEmpresaProdu();
			this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
			this.addItemDefectoCombosForeignKeyTipoMaquinaEmpresa();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyOrdenDetaProdu()throws Exception {
		try {
			if(this.productoordendetaprodumaquinaSessionBean==null) {
				this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
			}

			if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {
				OrdenDetaProdu ordendetaprodu=new OrdenDetaProdu();
				OrdenDetaProduConstantesFunciones.setOrdenDetaProduDescripcion(ordendetaprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				ordendetaprodu.setId(null);

				if(!OrdenDetaProduConstantesFunciones.ExisteEnLista(this.ordendetaprodusForeignKey,ordendetaprodu,true)) {

					this.ordendetaprodusForeignKey.add(0,ordendetaprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoAreaEmpresaProdu()throws Exception {
		try {

			if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoAreaEmpresaProdu()) {
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

			if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoEmpresaProdu()) {
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

			if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionTipoMaquinaEmpresa()) {
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

			if(!this.productoordendetaprodumaquinaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoOrdenDetaProduMaquina()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoOrdenDetaProduMaquina(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduMaquina()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProduMaquina();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina)throws Exception {	
		try {
			
			this.setActualOrdenDetaProduForeignKey(productoordendetaprodumaquina.getid_orden_deta_produ(),false,"Formulario");
			this.setActualTipoAreaEmpresaProduForeignKey(productoordendetaprodumaquina.getid_tipo_area_empresa_produ(),false,"Formulario");
			this.setActualTipoProcesoEmpresaProduForeignKey(productoordendetaprodumaquina.getid_tipo_proceso_empresa_produ(),false,"Formulario");
			this.setActualTipoMaquinaEmpresaForeignKey(productoordendetaprodumaquina.getid_tipo_merma_empresa(),false,"Formulario");
			this.setActualUnidadForeignKey(productoordendetaprodumaquina.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoOrdenDetaProduMaquina()throws Exception {	
		try {
			
			this.setActualOrdenDetaProduForeignKey(this.productoordendetaprodumaquinaConstantesFunciones.getid_orden_deta_produ(),false,"Formulario");
			this.setActualTipoAreaEmpresaProduForeignKey(this.productoordendetaprodumaquinaConstantesFunciones.getid_tipo_area_empresa_produ(),false,"Formulario");
			this.setActualTipoProcesoEmpresaProduForeignKey(this.productoordendetaprodumaquinaConstantesFunciones.getid_tipo_proceso_empresa_produ(),false,"Formulario");
			this.setActualTipoMaquinaEmpresaForeignKey(this.productoordendetaprodumaquinaConstantesFunciones.getid_tipo_merma_empresa(),false,"Formulario");
			this.setActualUnidadForeignKey(this.productoordendetaprodumaquinaConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProduMaquina()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoOrdenDetaProduMaquina()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoOrdenDetaProduMaquina()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoOrdenDetaProduMaquina()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoOrdenDetaProduMaquina()throws Exception {
		try {
			

			this.cargarCombosFrameOrdenDetaProdusForeignKey("Todos");
			this.cargarCombosFrameTipoAreaEmpresaProdusForeignKey("Todos");
			this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey("Todos");
			this.cargarCombosFrameTipoMaquinaEmpresasForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoOrdenDetaProduMaquina(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameOrdenDetaProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoAreaEmpresaProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMaquinaEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoOrdenDetaProduMaquina()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean(); 
		this.productoordendetaprodumaquinaConstantesFunciones=new ProductoOrdenDetaProduMaquinaConstantesFunciones(); 
		this.productoordendetaprodumaquinaBean=new ProductoOrdenDetaProduMaquina();//(this.productoordendetaprodumaquinaConstantesFunciones); 		
		this.productoordendetaprodumaquinaReturnGeneral=new ProductoOrdenDetaProduMaquinaParameterReturnGeneral(); 
		
		this.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoOrdenDetaProduMaquina(true);
			
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
			
			this.productoordendetaprodumaquinaConstantesFunciones=new ProductoOrdenDetaProduMaquinaConstantesFunciones(); 
			this.productoordendetaprodumaquinaBean=new ProductoOrdenDetaProduMaquina();//this.productoordendetaprodumaquinaConstantesFunciones); 			
			this.productoordendetaprodumaquinaReturnGeneral=new ProductoOrdenDetaProduMaquinaParameterReturnGeneral(); 
		
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden Maquina Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productoordendetaprodumaquina=new ProductoOrdenDetaProduMaquina();
			this.productoordendetaprodumaquinas = new ArrayList<ProductoOrdenDetaProduMaquina>();
			this.productoordendetaprodumaquinasAux = new ArrayList<ProductoOrdenDetaProduMaquina>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic=new ProductoOrdenDetaProduMaquinaLogic();
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			//this.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina);	
					}
					
					if(this.jInternalFrameImportacionProductoOrdenDetaProduMaquina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoOrdenDetaProduMaquina);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoOrdenDetaProduMaquina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoOrdenDetaProduMaquina);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setVisible(false);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina);
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoOrdenDetaProduMaquina!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoOrdenDetaProduMaquina);
					this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setVisible(false);
					this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoOrdenDetaProduMaquina!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoOrdenDetaProduMaquina);
					this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setVisible(false);
					this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoOrdenDetaProduMaquinaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoOrdenDetaProduMaquinaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoordendetaprodumaquinaReturnGeneral=new ProductoOrdenDetaProduMaquinaParameterReturnGeneral();
			
			this.productoordendetaprodumaquinaParameterGeneral=new ProductoOrdenDetaProduMaquinaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoordendetaprodumaquinaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoOrdenDetaProduMaquinaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado(),this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoOrdenDetaProduMaquinaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado(),this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=false;
			
			
			this.isVisibilidadFK_IdOrdenDetaProdu=true;
			this.isVisibilidadFK_IdTipoAreaEmpresaProdu=true;
			this.isVisibilidadFK_IdTipoMaquinaEmpresa=true;
			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoOrdenDetaProduMaquina();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoOrdenDetaProduMaquina(false);
			
			this.setPermisosUsuarioProductoOrdenDetaProduMaquina();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() 
				|| (this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() && this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoOrdenDetaProduMaquinaClasesRelacionadas();
			}
			
			if(this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoOrdenDetaProduMaquinaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoOrdenDetaProduMaquina();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProduMaquina();
			}
			
			if(!this.isPermisoBusquedaProductoOrdenDetaProduMaquina) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoOrdenDetaProduMaquina,this.isPermisoPaginacionMedioProductoOrdenDetaProduMaquina,this.isPermisoPaginacionTodoProductoOrdenDetaProduMaquina);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoOrdenDetaProduMaquinaConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMaquina());
				
				this.tiposColumnasSelect=ProductoOrdenDetaProduMaquinaConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMaquina(true);
				
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
			//if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoOrdenDetaProduMaquina();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoOrdenDetaProduMaquina(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoOrdenDetaProduMaquina(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduMaquina() ;
			
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
			
			this.ordendetaproduLogic=new OrdenDetaProduLogic();
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
				productoordendetaprodumaquinaImplementable= (ProductoOrdenDetaProduMaquinaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoOrdenDetaProduMaquinaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoordendetaprodumaquinaImplementableHome= (ProductoOrdenDetaProduMaquinaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoOrdenDetaProduMaquinaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoordendetaprodumaquinas= new ArrayList<ProductoOrdenDetaProduMaquina>();
			this.productoordendetaprodumaquinasEliminados= new ArrayList<ProductoOrdenDetaProduMaquina>();
						
			this.isEsNuevoProductoOrdenDetaProduMaquina=false;
			this.esParaAccionDesdeFormularioProductoOrdenDetaProduMaquina=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>() ;
			this.tipoareaempresaprodusForeignKey=new ArrayList<TipoAreaEmpresaProdu>() ;
			this.tipoprocesoempresaprodusForeignKey=new ArrayList<TipoProcesoEmpresaProdu>() ;
			this.tipomaquinaempresasForeignKey=new ArrayList<TipoMaquinaEmpresa>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoOrdenDetaProduMaquina(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoOrdenDetaProduMaquina();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoOrdenDetaProduMaquinaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoOrdenDetaProduMaquina();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoOrdenDetaProduMaquina();
			}
			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoOrdenDetaProduMaquina(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoOrdenDetaProduMaquina: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoOrdenDetaProduMaquina() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoOrdenDetaProduMaquina")) {
				iIndex=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoOrdenDetaProduMaquina();	
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
	
	public void cargarCombosForeignKeyProductoOrdenDetaProduMaquina(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoOrdenDetaProduMaquina(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoOrdenDetaProduMaquina(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoOrdenDetaProduMaquinaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoOrdenDetaProduMaquina();
		
		this.cargarCombosFrameForeignKeyProductoOrdenDetaProduMaquina();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoOrdenDetaProduMaquina();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduMaquina();
		}
	}
	
	

	public void cargarCombosForeignKeyOrdenDetaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyOrdenDetaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
				this.cargarCombosFrameOrdenDetaProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaOrdenDetaProdu(this.ordendetaprodusForeignKey);

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
	
	public void jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			
			
			if(jTableDatosProductoOrdenDetaProduMaquina.getRowCount()>=1) {
				jTableDatosProductoOrdenDetaProduMaquina.removeRowSelectionInterval(0, jTableDatosProductoOrdenDetaProduMaquina.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoOrdenDetaProduMaquina=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProduMaquina(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoOrdenDetaProduMaquina(true);			
			//this.productoordendetaprodumaquina=new ProductoOrdenDetaProduMaquina();
			//this.productoordendetaprodumaquina.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMaquina(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMaquina() ;
			
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProduMaquina(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoordendetaprodumaquina);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);				
			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			
			if(this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoOrdenDetaProduMaquina: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRows().length;			
			}
			
			productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoOrdenDetaProduMaquina--;			
				//ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux= new ProductoOrdenDetaProduMaquina();			
				//productoordendetaprodumaquinaAux.setId(this.iIdNuevoProductoOrdenDetaProduMaquina);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaOrigen=new ProductoOrdenDetaProduMaquina();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaOrigen : productoordendetaprodumaquinasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoordendetaprodumaquinaOrigen =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodumaquinaOrigen =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoOrdenDetaProduMaquina();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoordendetaprodumaquina.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoOrdenDetaProduMaquina(productoordendetaprodumaquinaOrigen,this.productoordendetaprodumaquina,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().add(this.productoordendetaprodumaquinaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumaquinas.add(this.productoordendetaprodumaquinaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
				
				this.jTableDatosProductoOrdenDetaProduMaquina.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduMaquina(), this.getIndiceNuevoProductoOrdenDetaProduMaquina());
				
				int iLastRow =  this.jTableDatosProductoOrdenDetaProduMaquina.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoOrdenDetaProduMaquina.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoOrdenDetaProduMaquina.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();									
		
			ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaOrigen=new ProductoOrdenDetaProduMaquina();
			ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaDestino=new ProductoOrdenDetaProduMaquina();
				
			productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoordendetaprodumaquinasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinaOrigen =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoordendetaprodumaquinaOrigen =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodumaquinaDestino =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoordendetaprodumaquinaDestino =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoordendetaprodumaquinaOrigen =productoordendetaprodumaquinasSeleccionados.get(0);
				productoordendetaprodumaquinaDestino =productoordendetaprodumaquinasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoOrdenDetaProduMaquina(productoordendetaprodumaquinaOrigen,productoordendetaprodumaquinaDestino,true,false);
				
				productoordendetaprodumaquinaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoordendetaprodumaquinaDestino,productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaprodumaquinaDestino,productoordendetaprodumaquinas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
				
				//this.jTableDatosProductoOrdenDetaProduMaquina.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduMaquina(), this.getIndiceNuevoProductoOrdenDetaProduMaquina());
				
				int iLastRow =  this.jTableDatosProductoOrdenDetaProduMaquina.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoOrdenDetaProduMaquina.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoOrdenDetaProduMaquina.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setVisible(!isVisible);
			this.jPanelPaginacionProductoOrdenDetaProduMaquina.setVisible(!isVisible);
			this.jPanelAccionesProductoOrdenDetaProduMaquina.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoOrdenDetaProduMaquina();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoOrdenDetaProduMaquina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoOrdenDetaProduMaquina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoOrdenDetaProduMaquina();
			
			this.abrirFrameOrderByProductoOrdenDetaProduMaquina();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoOrdenDetaProduMaquina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoOrdenDetaProduMaquina(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoOrdenDetaProduMaquina);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.isMaximum()) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setSize(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.iWidthFormulario,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.isMaximum()) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jContentPaneDetalleProductoOrdenDetaProduMaquina.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jContentPaneDetalleProductoOrdenDetaProduMaquina.getWidth(),ProductoOrdenDetaProduMaquinaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jContentPaneDetalleProductoOrdenDetaProduMaquina.getWidth(),ProductoOrdenDetaProduMaquinaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jContentPaneDetalleProductoOrdenDetaProduMaquina.getWidth(),ProductoOrdenDetaProduMaquinaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setVisible(true);
	        this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoOrdenDetaProduMaquina() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoOrdenDetaProduMaquina==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoOrdenDetaProduMaquina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina,false,this);
				} else {
					this.jInternalFrameOrderByProductoOrdenDetaProduMaquina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoOrdenDetaProduMaquina);
				this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setVisible(false);
				this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setSelected(false);
				
				this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoOrdenDetaProduMaquina"));
				
				this.inicializarActualizarBindingTablaOrderByProductoOrdenDetaProduMaquina();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoOrdenDetaProduMaquina() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoOrdenDetaProduMaquina==null) {
				
				this.jInternalFrameImportacionProductoOrdenDetaProduMaquina=new ImportacionJInternalFrame(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoOrdenDetaProduMaquina);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoOrdenDetaProduMaquina);
				this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setVisible(false);
				this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setSelected(false);


				this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoOrdenDetaProduMaquina"));
				this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoOrdenDetaProduMaquina"));
				this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoOrdenDetaProduMaquina"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoOrdenDetaProduMaquina() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina==null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina=new ReporteDinamicoJInternalFrame(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina);
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProduMaquina"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProduMaquina"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProduMaquina();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoOrdenDetaProduMaquina() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoOrdenDetaProduMaquina);
			
	       	this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setVisible(false);
	        this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.dispose();
			//this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoOrdenDetaProduMaquina() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoOrdenDetaProduMaquina() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setVisible(true);
	        this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoOrdenDetaProduMaquina() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setVisible(true);
	        this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoOrdenDetaProduMaquina() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setVisible(false);
	        this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoOrdenDetaProduMaquina() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoOrdenDetaProduMaquina() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setVisible(false);
	        this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoOrdenDetaProduMaquina(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoOrdenDetaProduMaquina(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoOrdenDetaProduMaquina(true);
			//this.isEsNuevoProductoOrdenDetaProduMaquina=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMaquina(false) ;
			
			if(productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProduMaquina(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMaquina(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoOrdenDetaProduMaquina(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoOrdenDetaProduMaquina(true);
			//this.isEsNuevoProductoOrdenDetaProduMaquina=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoordendetaprodumaquina.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMaquina(false) ;
			
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProduMaquina(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMaquina(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaOrdenDetaProdu(List<OrdenDetaProdu> ordendetaprodusForeignKey)throws Exception{
		TableColumn tableColumnOrdenDetaProdu=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU));
		TableCellEditor tableCellEditorOrdenDetaProdu =tableColumnOrdenDetaProdu.getCellEditor();

		OrdenDetaProduTableCell ordendetaproduTableCellFk=(OrdenDetaProduTableCell)tableCellEditorOrdenDetaProdu;

		if(ordendetaproduTableCellFk!=null) {
			ordendetaproduTableCellFk.setordendetaprodusForeignKey(ordendetaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ordendetaproduTableCellFk.setRowActual(intSelectedRow);
			//ordendetaproduTableCellFk.setordendetaprodusForeignKeyActual(ordendetaprodusForeignKey);
		//}


		if(ordendetaproduTableCellFk!=null) {
			ordendetaproduTableCellFk.RecargarOrdenDetaProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoAreaEmpresaProdu(List<TipoAreaEmpresaProdu> tipoareaempresaprodusForeignKey)throws Exception{
		TableColumn tableColumnTipoAreaEmpresaProdu=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU));
		TableCellEditor tableCellEditorTipoAreaEmpresaProdu =tableColumnTipoAreaEmpresaProdu.getCellEditor();

		TipoAreaEmpresaProduTableCell tipoareaempresaproduTableCellFk=(TipoAreaEmpresaProduTableCell)tableCellEditorTipoAreaEmpresaProdu;

		if(tipoareaempresaproduTableCellFk!=null) {
			tipoareaempresaproduTableCellFk.settipoareaempresaprodusForeignKey(tipoareaempresaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

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
		TableColumn tableColumnTipoProcesoEmpresaProdu=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU));
		TableCellEditor tableCellEditorTipoProcesoEmpresaProdu =tableColumnTipoProcesoEmpresaProdu.getCellEditor();

		TipoProcesoEmpresaProduTableCell tipoprocesoempresaproduTableCellFk=(TipoProcesoEmpresaProduTableCell)tableCellEditorTipoProcesoEmpresaProdu;

		if(tipoprocesoempresaproduTableCellFk!=null) {
			tipoprocesoempresaproduTableCellFk.settipoprocesoempresaprodusForeignKey(tipoprocesoempresaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

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
		TableColumn tableColumnTipoMaquinaEmpresa=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA));
		TableCellEditor tableCellEditorTipoMaquinaEmpresa =tableColumnTipoMaquinaEmpresa.getCellEditor();

		TipoMaquinaEmpresaTableCell tipomaquinaempresaTableCellFk=(TipoMaquinaEmpresaTableCell)tableCellEditorTipoMaquinaEmpresa;

		if(tipomaquinaempresaTableCellFk!=null) {
			tipomaquinaempresaTableCellFk.settipomaquinaempresasForeignKey(tipomaquinaempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

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
		TableColumn tableColumnUnidad=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoOrdenDetaProduMaquina(false);
			
			//if(!this.isEsNuevoProductoOrdenDetaProduMaquina) {								
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				
			}
			
			if(this.permiteMantenimiento(this.productoordendetaprodumaquina)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoOrdenDetaProduMaquina=true;
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
					this.isEsNuevoProductoOrdenDetaProduMaquina=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoOrdenDetaProduMaquina=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoOrdenDetaProduMaquina=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMaquina(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMaquina(false);
				
				this.habilitarDeshabilitarControlesProductoOrdenDetaProduMaquina(false);
			
												
				
				if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoOrdenDetaProduMaquina();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoOrdenDetaProduMaquina.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoordendetaprodumaquina.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMaquina.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMaquina.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				this.productoordendetaprodumaquina.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				this.productoordendetaprodumaquina.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoordendetaprodumaquina)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoOrdenDetaProduMaquinaModel) this.jTableDatosProductoOrdenDetaProduMaquina.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoOrdenDetaProduMaquina=true;
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
				this.isEsNuevoProductoOrdenDetaProduMaquina=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMaquina(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMaquina(false);
				
				this.habilitarDeshabilitarControlesProductoOrdenDetaProduMaquina(false);
				
				
				
				if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoOrdenDetaProduMaquina();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoOrdenDetaProduMaquina.getRowCount()>=1) {
				jTableDatosProductoOrdenDetaProduMaquina.removeRowSelectionInterval(0, jTableDatosProductoOrdenDetaProduMaquina.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoOrdenDetaProduMaquina(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMaquina(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMaquina(false) ;
			
			this.isEsNuevoProductoOrdenDetaProduMaquina=false;
			
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoOrdenDetaProduMaquina();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
				
				//SI ES MANUAL
				if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoOrdenDetaProduMaquina();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoOrdenDetaProduMaquina--;			
			//ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux= new ProductoOrdenDetaProduMaquina();			
			//productoordendetaprodumaquinaAux.setId(this.iIdNuevoProductoOrdenDetaProduMaquina);
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoOrdenDetaProduMaquina();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
			
			this.productoordendetaprodumaquina.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().add(this.productoordendetaprodumaquinaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoordendetaprodumaquinas.add(this.productoordendetaprodumaquinaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
			
			this.jTableDatosProductoOrdenDetaProduMaquina.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProduMaquina(), this.getIndiceNuevoProductoOrdenDetaProduMaquina());
			
			int iLastRow =  this.jTableDatosProductoOrdenDetaProduMaquina.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoOrdenDetaProduMaquina.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoOrdenDetaProduMaquina.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProduMaquina();
			}
			
			//this.abrirFrameTreeProductoOrdenDetaProduMaquina();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Orden MaquinaES ?", "MANTENIMIENTO DE Orden Maquina", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoOrdenDetaProduMaquina();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoordendetaprodumaquinaReturnGeneral=productoordendetaprodumaquinaLogic.procesarImportacionProductoOrdenDetaProduMaquinasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoordendetaprodumaquinaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoOrdenDetaProduMaquinaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setFileImportacion(this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoOrdenDetaProduMaquina.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();		

		productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoOrdenDetaProduMaquinaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoOrdenDetaProduMaquinaBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoOrdenDetaProduMaquinas("Todos",productoordendetaprodumaquinasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Maquina",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_OrdenDetaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_OrdenDetaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_OrdenDetaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_OrdenDetaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoAreaEmpresaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoAreaEmpresaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoAreaEmpresaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoAreaEmpresaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProcesoEmpresaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProcesoEmpresaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProcesoEmpresaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProcesoEmpresaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMaquinaEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMaquinaEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMaquinaEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMaquinaEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU:
					sNombreCampoCategoria="id_orden_deta_produ";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU:
					sNombreCampoCategoria="id_tipo_area_empresa_produ";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					sNombreCampoCategoria="id_tipo_proceso_empresa_produ";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA:
					sNombreCampoCategoria="id_tipo_merma_empresa";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU:
					sNombreCampoCategoriaValor="id_orden_deta_produ";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU:
					sNombreCampoCategoriaValor="id_tipo_area_empresa_produ";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					sNombreCampoCategoriaValor="id_tipo_proceso_empresa_produ";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA:
					sNombreCampoCategoriaValor="id_tipo_merma_empresa";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden Deta Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_orden_deta_produ");
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Area Empresa Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_area_empresa_produ");
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Proceso Empresa Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_proceso_empresa_produ");
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Merma Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_merma_empresa");
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();		
		
		productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumaquina";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoOrdenDetaProduMaquinas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU);
					iRow++;

					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:productoordendetaprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumaquina.getordendetaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU);
					iRow++;

					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:productoordendetaprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumaquina.gettipoareaempresaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
					iRow++;

					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:productoordendetaprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumaquina.gettipoprocesoempresaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA);
					iRow++;

					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:productoordendetaprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumaquina.gettipomaquinaempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:productoordendetaprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumaquina.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:productoordendetaprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumaquina.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:productoordendetaprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumaquina.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:productoordendetaprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumaquina.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:productoordendetaprodumaquinasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodumaquina.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelProductoOrdenDetaProduMaquina(row);				
			//	iRow++;
			//}				
			
			//for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoOrdenDetaProduMaquina(productoordendetaprodumaquinaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Maquina",JOptionPane.INFORMATION_MESSAGE);
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
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProduMaquina();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoOrdenDetaProduMaquina();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoOrdenDetaProduMaquina();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoOrdenDetaProduMaquina() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoOrdenDetaProduMaquina.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoOrdenDetaProduMaquina.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoOrdenDetaProduMaquina.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoOrdenDetaProduMaquina.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoOrdenDetaProduMaquina.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoOrdenDetaProduMaquina.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoOrdenDetaProduMaquina.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoOrdenDetaProduMaquina(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoOrdenDetaProduMaquina(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMaquina(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoOrdenDetaProduMaquina(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduMaquina(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoOrdenDetaProduMaquina(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoOrdenDetaProduMaquina() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina();
		
		this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMaquina(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoOrdenDetaProduMaquina();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduMaquina() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProduMaquina(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProduMaquina(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMaquina.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMaquina.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMaquina.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMaquina.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMaquina.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMaquina.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMaquina.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMaquina.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoOrdenDetaProduMaquina(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProduMaquina(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProduMaquina() throws Exception {
		try	{
			if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoOrdenDetaProduMaquina();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoOrdenDetaProduMaquina() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoOrdenDetaProduMaquina() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina.addItem(reporte);
			}
			
			
			if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProduMaquina();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProduMaquina() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoOrdenDetaProduMaquinaConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMaquina(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoOrdenDetaProduMaquinaConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMaquina(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoOrdenDetaProduMaquinaConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProduMaquina(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoOrdenDetaProduMaquina()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.getSelectedItem()!=null){this.id_orden_deta_produFK_IdOrdenDetaProdu=((OrdenDetaProdu)this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.getSelectedItem()!=null){this.id_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu=((TipoAreaEmpresaProdu)this.jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.getSelectedItem()!=null){this.id_tipo_merma_empresaFK_IdTipoMaquinaEmpresa=((TipoMaquinaEmpresa)this.jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.getSelectedItem()!=null){this.id_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu=((TipoProcesoEmpresaProdu)this.jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoOrdenDetaProduMaquina(Boolean esInicializar) throws Exception {				
		if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoOrdenDetaProduMaquina();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina() throws Exception {
		this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoOrdenDetaProduMaquina() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoOrdenDetaProduMaquinaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquinaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoordendetaprodumaquinas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoOrdenDetaProduMaquina.setModel(new ProductoOrdenDetaProduMaquinaModel(this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoOrdenDetaProduMaquina.setModel(new ProductoOrdenDetaProduMaquinaModel(this.productoordendetaprodumaquinas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoOrdenDetaProduMaquina!=null && this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoOrdenDetaProduMaquina();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO,productoordendetaprodumaquinaConstantesFunciones.resaltarSeleccionarProductoOrdenDetaProduMaquina,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO,productoordendetaprodumaquinaConstantesFunciones.resaltarSeleccionarProductoOrdenDetaProduMaquina,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_ID));

		if(this.productoordendetaprodumaquinaConstantesFunciones.mostraridProductoOrdenDetaProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodumaquinaConstantesFunciones.resaltaridProductoOrdenDetaProduMaquina,this.productoordendetaprodumaquinaConstantesFunciones.activaridProductoOrdenDetaProduMaquina,iSizeTabla,this,true,"idProductoOrdenDetaProduMaquina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumaquinaConstantesFunciones.resaltaridProductoOrdenDetaProduMaquina,this.productoordendetaprodumaquinaConstantesFunciones.activaridProductoOrdenDetaProduMaquina,this,true,"idProductoOrdenDetaProduMaquina","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU));

		if(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new OrdenDetaProduTableCell(this.ordendetaprodusForeignKey,this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduMaquina,this,this.productoordendetaprodumaquinaConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduMaquina,iSizeTabla));
			tableColumn.setCellEditor(new OrdenDetaProduTableCell(this.ordendetaprodusForeignKey,this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduMaquina,this,this.productoordendetaprodumaquinaConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduMaquina,true,"id_orden_deta_produProductoOrdenDetaProduMaquina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU));

		if(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoAreaEmpresaProduTableCell(this.tipoareaempresaprodusForeignKey,this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina,this,this.productoordendetaprodumaquinaConstantesFunciones.activarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina,iSizeTabla));
			tableColumn.setCellEditor(new TipoAreaEmpresaProduTableCell(this.tipoareaempresaprodusForeignKey,this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina,this,this.productoordendetaprodumaquinaConstantesFunciones.activarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina,true,"id_tipo_area_empresa_produProductoOrdenDetaProduMaquina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU));

		if(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProcesoEmpresaProduTableCell(this.tipoprocesoempresaprodusForeignKey,this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina,this,this.productoordendetaprodumaquinaConstantesFunciones.activarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina,iSizeTabla));
			tableColumn.setCellEditor(new TipoProcesoEmpresaProduTableCell(this.tipoprocesoempresaprodusForeignKey,this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina,this,this.productoordendetaprodumaquinaConstantesFunciones.activarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina,true,"id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA));

		if(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_tipo_merma_empresaProductoOrdenDetaProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMaquinaEmpresaTableCell(this.tipomaquinaempresasForeignKey,this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_tipo_merma_empresaProductoOrdenDetaProduMaquina,this,this.productoordendetaprodumaquinaConstantesFunciones.activarid_tipo_merma_empresaProductoOrdenDetaProduMaquina,iSizeTabla));
			tableColumn.setCellEditor(new TipoMaquinaEmpresaTableCell(this.tipomaquinaempresasForeignKey,this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_tipo_merma_empresaProductoOrdenDetaProduMaquina,this,this.productoordendetaprodumaquinaConstantesFunciones.activarid_tipo_merma_empresaProductoOrdenDetaProduMaquina,true,"id_tipo_merma_empresaProductoOrdenDetaProduMaquina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD));

		if(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_unidadProductoOrdenDetaProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduMaquina,this,this.productoordendetaprodumaquinaConstantesFunciones.activarid_unidadProductoOrdenDetaProduMaquina,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduMaquina,this,this.productoordendetaprodumaquinaConstantesFunciones.activarid_unidadProductoOrdenDetaProduMaquina,true,"id_unidadProductoOrdenDetaProduMaquina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD));

		if(this.productoordendetaprodumaquinaConstantesFunciones.mostrarcantidadProductoOrdenDetaProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodumaquinaConstantesFunciones.resaltarcantidadProductoOrdenDetaProduMaquina,this.productoordendetaprodumaquinaConstantesFunciones.activarcantidadProductoOrdenDetaProduMaquina,iSizeTabla,this,true,"cantidadProductoOrdenDetaProduMaquina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumaquinaConstantesFunciones.resaltarcantidadProductoOrdenDetaProduMaquina,this.productoordendetaprodumaquinaConstantesFunciones.activarcantidadProductoOrdenDetaProduMaquina,this,true,"cantidadProductoOrdenDetaProduMaquina","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO));

		if(this.productoordendetaprodumaquinaConstantesFunciones.mostrarcostoProductoOrdenDetaProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodumaquinaConstantesFunciones.resaltarcostoProductoOrdenDetaProduMaquina,this.productoordendetaprodumaquinaConstantesFunciones.activarcostoProductoOrdenDetaProduMaquina,iSizeTabla,this,true,"costoProductoOrdenDetaProduMaquina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumaquinaConstantesFunciones.resaltarcostoProductoOrdenDetaProduMaquina,this.productoordendetaprodumaquinaConstantesFunciones.activarcostoProductoOrdenDetaProduMaquina,this,true,"costoProductoOrdenDetaProduMaquina","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.productoordendetaprodumaquinaConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaprodumaquinaConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduMaquina,this.productoordendetaprodumaquinaConstantesFunciones.activarcosto_totalProductoOrdenDetaProduMaquina,iSizeTabla,this,true,"costo_totalProductoOrdenDetaProduMaquina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumaquinaConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduMaquina,this.productoordendetaprodumaquinaConstantesFunciones.activarcosto_totalProductoOrdenDetaProduMaquina,this,true,"costo_totalProductoOrdenDetaProduMaquina","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productoordendetaprodumaquinaConstantesFunciones.mostrardescripcionProductoOrdenDetaProduMaquina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoordendetaprodumaquinaConstantesFunciones.resaltardescripcionProductoOrdenDetaProduMaquina,this.productoordendetaprodumaquinaConstantesFunciones.activardescripcionProductoOrdenDetaProduMaquina,iSizeTabla,this,true,"descripcionProductoOrdenDetaProduMaquina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaprodumaquinaConstantesFunciones.resaltardescripcionProductoOrdenDetaProduMaquina,this.productoordendetaprodumaquinaConstantesFunciones.activardescripcionProductoOrdenDetaProduMaquina,this,true,"descripcionProductoOrdenDetaProduMaquina","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduMaquinaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoOrdenDetaProduMaquina.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoOrdenDetaProduMaquina.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoOrdenDetaProduMaquina.addColumn(tableColumn);
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
			
			this.jTableDatosProductoOrdenDetaProduMaquina.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoOrdenDetaProduMaquina.moveColumn(this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoOrdenDetaProduMaquina.moveColumn(this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoOrdenDetaProduMaquina.moveColumn(this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoOrdenDetaProduMaquina.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoOrdenDetaProduMaquina.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoOrdenDetaProduMaquina,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoOrdenDetaProduMaquina.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoOrdenDetaProduMaquina.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoOrdenDetaProduMaquina.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoordendetaprodumaquinas.size()-1;
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
		//this.jTableDatosProductoOrdenDetaProduMaquina.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoOrdenDetaProduMaquina();
			
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
				
				//this.isEsNuevoProductoOrdenDetaProduMaquina=false;
					
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			
				if(this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoOrdenDetaProduMaquina.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoordendetaprodumaquina.getsType().equals("DUPLICADO")
				   || this.productoordendetaprodumaquina.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoOrdenDetaProduMaquina=true;
				
				} else {
					this.isEsNuevoProductoOrdenDetaProduMaquina=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
					if(this.productoordendetaprodumaquina.getId()>=0 && !this.productoordendetaprodumaquina.getIsNew()) {						
						this.isEsNuevoProductoOrdenDetaProduMaquina=false;
						
					} else {
						this.isEsNuevoProductoOrdenDetaProduMaquina=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProduMaquina(esRelaciones);						
				
				this.seleccionarProductoOrdenDetaProduMaquina(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoordendetaprodumaquina.getId()<0) {
					this.isEsNuevoProductoOrdenDetaProduMaquina=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoOrdenDetaProduMaquina(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoOrdenDetaProduMaquina(evt,rowIndex);
				}	
				
				if(this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoOrdenDetaProduMaquina: " + this.dDif); 
					}
				}								
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoOrdenDetaProduMaquina(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoordendetaprodumaquina)) {
					if(this.productoordendetaprodumaquina.getId()>0) {
						this.productoordendetaprodumaquina.setIsDeleted(true);
						
						this.productoordendetaprodumaquinasEliminados.add(this.productoordendetaprodumaquina);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().remove(this.productoordendetaprodumaquina);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumaquinas.remove(this.productoordendetaprodumaquina);				
					}
					
					
					((ProductoOrdenDetaProduMaquinaModel) this.jTableDatosProductoOrdenDetaProduMaquina.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoOrdenDetaProduMaquina(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoOrdenDetaProduMaquina) {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoOrdenDetaProduMaquina.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				}
				
				//ARCHITECTURE
				try {
					

					//OrdenDetaProdu
					if(!this.productoordendetaprodumaquinaConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProduMaquina || this.productoordendetaprodumaquinaConstantesFunciones.event_dependid_orden_deta_produProductoOrdenDetaProduMaquina) {
						//this.cargarCombosOrdenDetaProdusForeignKeyLista(" where id="+this.productoordendetaprodumaquina.getid_orden_deta_produ());
									//this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
						this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>();

						if(productoordendetaprodumaquina.getOrdenDetaProdu()!=null) {
							this.ordendetaprodusForeignKey.add(productoordendetaprodumaquina.getOrdenDetaProdu());
						}

						this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
						this.cargarCombosFrameOrdenDetaProdusForeignKey("Todos");
					}
					this.setActualOrdenDetaProduForeignKey(this.productoordendetaprodumaquina.getid_orden_deta_produ(),false,"Formulario");

					//TipoAreaEmpresaProdu
					if(!this.productoordendetaprodumaquinaConstantesFunciones.cargarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina || this.productoordendetaprodumaquinaConstantesFunciones.event_dependid_tipo_area_empresa_produProductoOrdenDetaProduMaquina) {
						//this.cargarCombosTipoAreaEmpresaProdusForeignKeyLista(" where id="+this.productoordendetaprodumaquina.getid_tipo_area_empresa_produ());
									//this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
						this.tipoareaempresaprodusForeignKey=new ArrayList<TipoAreaEmpresaProdu>();

						if(productoordendetaprodumaquina.getTipoAreaEmpresaProdu()!=null) {
							this.tipoareaempresaprodusForeignKey.add(productoordendetaprodumaquina.getTipoAreaEmpresaProdu());
						}

						this.addItemDefectoCombosForeignKeyTipoAreaEmpresaProdu();
						this.cargarCombosFrameTipoAreaEmpresaProdusForeignKey("Todos");
					}
					this.setActualTipoAreaEmpresaProduForeignKey(this.productoordendetaprodumaquina.getid_tipo_area_empresa_produ(),false,"Formulario");

					//TipoProcesoEmpresaProdu
					if(!this.productoordendetaprodumaquinaConstantesFunciones.cargarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina || this.productoordendetaprodumaquinaConstantesFunciones.event_dependid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina) {
						//this.cargarCombosTipoProcesoEmpresaProdusForeignKeyLista(" where id="+this.productoordendetaprodumaquina.getid_tipo_proceso_empresa_produ());
									//this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
						this.tipoprocesoempresaprodusForeignKey=new ArrayList<TipoProcesoEmpresaProdu>();

						if(productoordendetaprodumaquina.getTipoProcesoEmpresaProdu()!=null) {
							this.tipoprocesoempresaprodusForeignKey.add(productoordendetaprodumaquina.getTipoProcesoEmpresaProdu());
						}

						this.addItemDefectoCombosForeignKeyTipoProcesoEmpresaProdu();
						this.cargarCombosFrameTipoProcesoEmpresaProdusForeignKey("Todos");
					}
					this.setActualTipoProcesoEmpresaProduForeignKey(this.productoordendetaprodumaquina.getid_tipo_proceso_empresa_produ(),false,"Formulario");

					//TipoMaquinaEmpresa
					if(!this.productoordendetaprodumaquinaConstantesFunciones.cargarid_tipo_merma_empresaProductoOrdenDetaProduMaquina || this.productoordendetaprodumaquinaConstantesFunciones.event_dependid_tipo_merma_empresaProductoOrdenDetaProduMaquina) {
						//this.cargarCombosTipoMaquinaEmpresasForeignKeyLista(" where id="+this.productoordendetaprodumaquina.getid_tipo_merma_empresa());
									//this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
						this.tipomaquinaempresasForeignKey=new ArrayList<TipoMaquinaEmpresa>();

						if(productoordendetaprodumaquina.getTipoMaquinaEmpresa()!=null) {
							this.tipomaquinaempresasForeignKey.add(productoordendetaprodumaquina.getTipoMaquinaEmpresa());
						}

						this.addItemDefectoCombosForeignKeyTipoMaquinaEmpresa();
						this.cargarCombosFrameTipoMaquinaEmpresasForeignKey("Todos");
					}
					this.setActualTipoMaquinaEmpresaForeignKey(this.productoordendetaprodumaquina.getid_tipo_merma_empresa(),false,"Formulario");

					//Unidad
					if(!this.productoordendetaprodumaquinaConstantesFunciones.cargarid_unidadProductoOrdenDetaProduMaquina || this.productoordendetaprodumaquinaConstantesFunciones.event_dependid_unidadProductoOrdenDetaProduMaquina) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.productoordendetaprodumaquina.getid_unidad());
									//this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(productoordendetaprodumaquina.getUnidad()!=null) {
							this.unidadsForeignKey.add(productoordendetaprodumaquina.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.productoordendetaprodumaquina.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProduMaquina(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMaquina() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProduMaquina(productoordendetaprodumaquina,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMaquina(productoordendetaprodumaquina);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoOrdenDetaProduMaquina(productoordendetaprodumaquina,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMaquina(productoordendetaprodumaquina);
	}
	
	public void setVariablesObjetoActualToFormularioProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelidProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquina.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcantidadProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquina.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcostoProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquina.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcosto_totalProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquina.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextAreadescripcionProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquina.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoordendetaprodumaquinaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoordendetaprodumaquinaLocal=this.productoordendetaprodumaquina;
			} else {
				productoordendetaprodumaquinaLocal=this.productoordendetaprodumaquinaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoordendetaprodumaquinaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoOrdenDetaProduMaquina(productoordendetaprodumaquinaLocal,true);
					
					if(productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoordendetaprodumaquinaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoordendetaprodumaquinaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(productoordendetaprodumaquina,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(productoordendetaprodumaquina);
	}
	
	public void setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(productoordendetaprodumaquina,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelidProductoOrdenDetaProduMaquina.getText()==null || this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelidProductoOrdenDetaProduMaquina.getText()=="" || this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelidProductoOrdenDetaProduMaquina.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelidProductoOrdenDetaProduMaquina.setText("0");
			}

			if(conColumnasBase) {productoordendetaprodumaquina.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelidProductoOrdenDetaProduMaquina.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelIdProductoOrdenDetaProduMaquina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodumaquina.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcantidadProductoOrdenDetaProduMaquina.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelcantidadProductoOrdenDetaProduMaquina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodumaquina.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcostoProductoOrdenDetaProduMaquina.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelcostoProductoOrdenDetaProduMaquina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodumaquina.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcosto_totalProductoOrdenDetaProduMaquina.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelcosto_totalProductoOrdenDetaProduMaquina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodumaquina.setdescripcion(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextAreadescripcionProductoOrdenDetaProduMaquina.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabeldescripcionProductoOrdenDetaProduMaquina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaBean,ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoordendetaprodumaquinaBean.getid_orden_deta_produ()!=null && !productoordendetaprodumaquinaBean.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodumaquina.setid_orden_deta_produ(productoordendetaprodumaquinaBean.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaBean.getid_tipo_area_empresa_produ()!=null && !productoordendetaprodumaquinaBean.getid_tipo_area_empresa_produ().equals(-1L))) {productoordendetaprodumaquina.setid_tipo_area_empresa_produ(productoordendetaprodumaquinaBean.getid_tipo_area_empresa_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaBean.getid_tipo_proceso_empresa_produ()!=null && !productoordendetaprodumaquinaBean.getid_tipo_proceso_empresa_produ().equals(-1L))) {productoordendetaprodumaquina.setid_tipo_proceso_empresa_produ(productoordendetaprodumaquinaBean.getid_tipo_proceso_empresa_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaBean.getid_tipo_merma_empresa()!=null && !productoordendetaprodumaquinaBean.getid_tipo_merma_empresa().equals(-1L))) {productoordendetaprodumaquina.setid_tipo_merma_empresa(productoordendetaprodumaquinaBean.getid_tipo_merma_empresa());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaBean.getid_unidad()!=null && !productoordendetaprodumaquinaBean.getid_unidad().equals(-1L))) {productoordendetaprodumaquina.setid_unidad(productoordendetaprodumaquinaBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaOrigen,ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoordendetaprodumaquinaOrigen.getId()!=null && !productoordendetaprodumaquinaOrigen.getId().equals(0L))) {productoordendetaprodumaquina.setId(productoordendetaprodumaquinaOrigen.getId());}}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaOrigen.getid_orden_deta_produ()!=null && !productoordendetaprodumaquinaOrigen.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodumaquina.setid_orden_deta_produ(productoordendetaprodumaquinaOrigen.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaOrigen.getid_tipo_area_empresa_produ()!=null && !productoordendetaprodumaquinaOrigen.getid_tipo_area_empresa_produ().equals(-1L))) {productoordendetaprodumaquina.setid_tipo_area_empresa_produ(productoordendetaprodumaquinaOrigen.getid_tipo_area_empresa_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaOrigen.getid_tipo_proceso_empresa_produ()!=null && !productoordendetaprodumaquinaOrigen.getid_tipo_proceso_empresa_produ().equals(-1L))) {productoordendetaprodumaquina.setid_tipo_proceso_empresa_produ(productoordendetaprodumaquinaOrigen.getid_tipo_proceso_empresa_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaOrigen.getid_tipo_merma_empresa()!=null && !productoordendetaprodumaquinaOrigen.getid_tipo_merma_empresa().equals(-1L))) {productoordendetaprodumaquina.setid_tipo_merma_empresa(productoordendetaprodumaquinaOrigen.getid_tipo_merma_empresa());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaOrigen.getid_unidad()!=null && !productoordendetaprodumaquinaOrigen.getid_unidad().equals(-1L))) {productoordendetaprodumaquina.setid_unidad(productoordendetaprodumaquinaOrigen.getid_unidad());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaOrigen.getcantidad()!=null && !productoordendetaprodumaquinaOrigen.getcantidad().equals(0))) {productoordendetaprodumaquina.setcantidad(productoordendetaprodumaquinaOrigen.getcantidad());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaOrigen.getcosto()!=null && !productoordendetaprodumaquinaOrigen.getcosto().equals(0.0))) {productoordendetaprodumaquina.setcosto(productoordendetaprodumaquinaOrigen.getcosto());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaOrigen.getcosto_total()!=null && !productoordendetaprodumaquinaOrigen.getcosto_total().equals(0.0))) {productoordendetaprodumaquina.setcosto_total(productoordendetaprodumaquinaOrigen.getcosto_total());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaOrigen.getdescripcion()!=null && !productoordendetaprodumaquinaOrigen.getdescripcion().equals(""))) {productoordendetaprodumaquina.setdescripcion(productoordendetaprodumaquinaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelidProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquina.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcantidadProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquina.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcostoProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquina.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcosto_totalProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquina.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextAreadescripcionProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquina.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquinaBean productoordendetaprodumaquinaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelidProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquinaBean.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcantidadProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquinaBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcostoProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquinaBean.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcosto_totalProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquinaBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextAreadescripcionProductoOrdenDetaProduMaquina.setText(productoordendetaprodumaquinaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquinaParameterReturnGeneral productoordendetaprodumaquinaReturnGeneral,ProductoOrdenDetaProduMaquinaBean productoordendetaprodumaquinaBean,Boolean conDefault) throws Exception { 
		try {
			ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaLocal=new ProductoOrdenDetaProduMaquina();
			
			productoordendetaprodumaquinaLocal=productoordendetaprodumaquinaReturnGeneral.getProductoOrdenDetaProduMaquina();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoordendetaprodumaquinaLocal.getId()!=null && !productoordendetaprodumaquinaLocal.getId().equals(0L))) {productoordendetaprodumaquinaBean.setId(productoordendetaprodumaquinaLocal.getId());}}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaLocal.getid_orden_deta_produ()!=null && !productoordendetaprodumaquinaLocal.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodumaquinaBean.setid_orden_deta_produ(productoordendetaprodumaquinaLocal.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaLocal.getid_tipo_area_empresa_produ()!=null && !productoordendetaprodumaquinaLocal.getid_tipo_area_empresa_produ().equals(-1L))) {productoordendetaprodumaquinaBean.setid_tipo_area_empresa_produ(productoordendetaprodumaquinaLocal.getid_tipo_area_empresa_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaLocal.getid_tipo_proceso_empresa_produ()!=null && !productoordendetaprodumaquinaLocal.getid_tipo_proceso_empresa_produ().equals(-1L))) {productoordendetaprodumaquinaBean.setid_tipo_proceso_empresa_produ(productoordendetaprodumaquinaLocal.getid_tipo_proceso_empresa_produ());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaLocal.getid_tipo_merma_empresa()!=null && !productoordendetaprodumaquinaLocal.getid_tipo_merma_empresa().equals(-1L))) {productoordendetaprodumaquinaBean.setid_tipo_merma_empresa(productoordendetaprodumaquinaLocal.getid_tipo_merma_empresa());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaLocal.getid_unidad()!=null && !productoordendetaprodumaquinaLocal.getid_unidad().equals(-1L))) {productoordendetaprodumaquinaBean.setid_unidad(productoordendetaprodumaquinaLocal.getid_unidad());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaLocal.getcantidad()!=null && !productoordendetaprodumaquinaLocal.getcantidad().equals(0))) {productoordendetaprodumaquinaBean.setcantidad(productoordendetaprodumaquinaLocal.getcantidad());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaLocal.getcosto()!=null && !productoordendetaprodumaquinaLocal.getcosto().equals(0.0))) {productoordendetaprodumaquinaBean.setcosto(productoordendetaprodumaquinaLocal.getcosto());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaLocal.getcosto_total()!=null && !productoordendetaprodumaquinaLocal.getcosto_total().equals(0.0))) {productoordendetaprodumaquinaBean.setcosto_total(productoordendetaprodumaquinaLocal.getcosto_total());}
			if(conDefault || (!conDefault && productoordendetaprodumaquinaLocal.getdescripcion()!=null && !productoordendetaprodumaquinaLocal.getdescripcion().equals(""))) {productoordendetaprodumaquinaBean.setdescripcion(productoordendetaprodumaquinaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoOrdenDetaProduMaquinaGenerico(Long idProductoOrdenDetaProduMaquinaSeleccionado,JComboBox jComboBoxProductoOrdenDetaProduMaquina,List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasLocal)throws Exception {
		try {
			ProductoOrdenDetaProduMaquina  productoordendetaprodumaquinaTemp=null;

			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinasLocal) {
				if(productoordendetaprodumaquinaAux.getId()!=null && productoordendetaprodumaquinaAux.getId().equals(idProductoOrdenDetaProduMaquinaSeleccionado)) {
					productoordendetaprodumaquinaTemp=productoordendetaprodumaquinaAux;
					break;
				}
			}

			jComboBoxProductoOrdenDetaProduMaquina.setSelectedItem(productoordendetaprodumaquinaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoOrdenDetaProduMaquinaGenerico(JComboBox jComboBoxProductoOrdenDetaProduMaquina,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoOrdenDetaProduMaquina.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoOrdenDetaProduMaquina.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoOrdenDetaProduMaquina.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoOrdenDetaProduMaquina.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodumaquina=(ProductoOrdenDetaProduMaquina) productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) productoordendetaprodumaquinas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("OrdenDetaProdu")) {
			//sDescripcion=this.getActualOrdenDetaProduForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodumaquina.getIsNew() && !productoordendetaprodumaquina.getIsChanged() && !productoordendetaprodumaquina.getIsDeleted()) {
				sDescripcion=productoordendetaprodumaquina.getordendetaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualOrdenDetaProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodumaquina.getordendetaprodu_descripcion();
			}
		}

		if(sTipo.equals("TipoAreaEmpresaProdu")) {
			//sDescripcion=this.getActualTipoAreaEmpresaProduForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodumaquina.getIsNew() && !productoordendetaprodumaquina.getIsChanged() && !productoordendetaprodumaquina.getIsDeleted()) {
				sDescripcion=productoordendetaprodumaquina.gettipoareaempresaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualTipoAreaEmpresaProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodumaquina.gettipoareaempresaprodu_descripcion();
			}
		}

		if(sTipo.equals("TipoProcesoEmpresaProdu")) {
			//sDescripcion=this.getActualTipoProcesoEmpresaProduForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodumaquina.getIsNew() && !productoordendetaprodumaquina.getIsChanged() && !productoordendetaprodumaquina.getIsDeleted()) {
				sDescripcion=productoordendetaprodumaquina.gettipoprocesoempresaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProcesoEmpresaProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodumaquina.gettipoprocesoempresaprodu_descripcion();
			}
		}

		if(sTipo.equals("TipoMaquinaEmpresa")) {
			//sDescripcion=this.getActualTipoMaquinaEmpresaForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodumaquina.getIsNew() && !productoordendetaprodumaquina.getIsChanged() && !productoordendetaprodumaquina.getIsDeleted()) {
				sDescripcion=productoordendetaprodumaquina.gettipomaquinaempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMaquinaEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodumaquina.gettipomaquinaempresa_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodumaquina.getIsNew() && !productoordendetaprodumaquina.getIsChanged() && !productoordendetaprodumaquina.getIsDeleted()) {
				sDescripcion=productoordendetaprodumaquina.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodumaquina.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaRow=new ProductoOrdenDetaProduMaquina();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodumaquinaRow=(ProductoOrdenDetaProduMaquina) productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoordendetaprodumaquinaRow=(ProductoOrdenDetaProduMaquina) productoordendetaprodumaquinas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMaquina(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina && this.isPermisoNuevoProductoOrdenDetaProduMaquina));			
			this.jButtonDuplicarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina && this.isPermisoDuplicarProductoOrdenDetaProduMaquina));			
			this.jButtonCopiarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina && this.isPermisoCopiarProductoOrdenDetaProduMaquina));
			this.jButtonVerFormProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina && this.isPermisoVerFormProductoOrdenDetaProduMaquina));
			
			this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina && this.isPermisoOrdenProductoOrdenDetaProduMaquina));			
			
			this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina && this.isPermisoNuevoProductoOrdenDetaProduMaquina));			
			this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina && this.isPermisoNuevoProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina));
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonModificarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina && this.isPermisoActualizarProductoOrdenDetaProduMaquina));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonActualizarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina && this.isPermisoActualizarProductoOrdenDetaProduMaquina));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonEliminarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina && this.isPermisoEliminarProductoOrdenDetaProduMaquina));
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonCancelarProductoOrdenDetaProduMaquina.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina);							
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonGuardarCambiosProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina && this.isPermisoNuevoProductoOrdenDetaProduMaquina));						
			this.jButtonDuplicarToolBarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina && this.isPermisoDuplicarProductoOrdenDetaProduMaquina));						
			this.jButtonCopiarToolBarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina && this.isPermisoCopiarProductoOrdenDetaProduMaquina));			
			this.jButtonVerFormToolBarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina && this.isPermisoVerFormProductoOrdenDetaProduMaquina));			
			this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina && this.isPermisoOrdenProductoOrdenDetaProduMaquina));
			this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina && this.isPermisoNuevoProductoOrdenDetaProduMaquina));			
			this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina && this.isPermisoNuevoProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina));			
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonModificarToolBarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina && this.isPermisoActualizarProductoOrdenDetaProduMaquina));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonActualizarToolBarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina  && this.isPermisoActualizarProductoOrdenDetaProduMaquina));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonEliminarToolBarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina && this.isPermisoEliminarProductoOrdenDetaProduMaquina));
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonCancelarToolBarProductoOrdenDetaProduMaquina.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina);				
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina && this.isPermisoNuevoProductoOrdenDetaProduMaquina));			
			this.jMenuItemDuplicarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina && this.isPermisoDuplicarProductoOrdenDetaProduMaquina));			
			this.jMenuItemCopiarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina && this.isPermisoCopiarProductoOrdenDetaProduMaquina));			
			this.jMenuItemVerFormProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina && this.isPermisoVerFormProductoOrdenDetaProduMaquina));			
			this.jMenuItemAbrirOrderByProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina && this.isPermisoOrdenProductoOrdenDetaProduMaquina));			
			//this.jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina && this.isPermisoOrdenProductoOrdenDetaProduMaquina));
			this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina && this.isPermisoOrdenProductoOrdenDetaProduMaquina));			
			//this.jMenuItemDetalleMostrarOcultarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina && this.isPermisoOrdenProductoOrdenDetaProduMaquina));			
			this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina && this.isPermisoNuevoProductoOrdenDetaProduMaquina));			
			this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina && this.isPermisoNuevoProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina));									
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemModificarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina && this.isPermisoActualizarProductoOrdenDetaProduMaquina));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemActualizarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina && this.isPermisoActualizarProductoOrdenDetaProduMaquina));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemEliminarProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina && this.isPermisoEliminarProductoOrdenDetaProduMaquina));
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemCancelarProductoOrdenDetaProduMaquina.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina);				
			}
			
			this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina));						
			this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=this.jButtonNuevoProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina=this.jButtonDuplicarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina=this.jButtonCopiarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina=this.jButtonVerFormProductoOrdenDetaProduMaquina.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoOrdenDetaProduMaquina=this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina=this.jButtonModificarProductoOrdenDetaProduMaquina.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonActualizarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonEliminarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonCancelarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonGuardarCambiosProductoOrdenDetaProduMaquina.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=this.jButtonNuevoToolBarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMaquina.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonModificarToolBarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonActualizarToolBarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonEliminarToolBarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonCancelarToolBarProductoOrdenDetaProduMaquina.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMaquina.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=this.jMenuItemNuevoProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMaquina.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemModificarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemActualizarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemEliminarProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina=this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemCancelarProductoOrdenDetaProduMaquina.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMaquina.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoOrdenDetaProduMaquina(Boolean esInicializar) {
		if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
				//if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoOrdenDetaProduMaquina();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProduMaquina(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProduMaquina() {
		this.jButtonNuevoProductoOrdenDetaProduMaquina.setVisible(this.isPermisoNuevoProductoOrdenDetaProduMaquina);			
		this.jButtonDuplicarProductoOrdenDetaProduMaquina.setVisible(this.isPermisoDuplicarProductoOrdenDetaProduMaquina);			
		this.jButtonCopiarProductoOrdenDetaProduMaquina.setVisible(this.isPermisoCopiarProductoOrdenDetaProduMaquina);			
		this.jButtonVerFormProductoOrdenDetaProduMaquina.setVisible(this.isPermisoVerFormProductoOrdenDetaProduMaquina);			
		
		this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina.setVisible(this.isPermisoOrdenProductoOrdenDetaProduMaquina);					
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina.setVisible(this.isPermisoNuevoProductoOrdenDetaProduMaquina);			
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonModificarProductoOrdenDetaProduMaquina.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMaquina);	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonActualizarProductoOrdenDetaProduMaquina.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMaquina);	
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonEliminarProductoOrdenDetaProduMaquina.setVisible(this.isPermisoEliminarProductoOrdenDetaProduMaquina);
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonCancelarProductoOrdenDetaProduMaquina.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina);						
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonGuardarCambiosProductoOrdenDetaProduMaquina.setVisible(this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina);							
		}
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMaquina);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoOrdenDetaProduMaquina() {
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonModificarProductoOrdenDetaProduMaquina.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMaquina);	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonActualizarProductoOrdenDetaProduMaquina.setVisible(this.isPermisoActualizarProductoOrdenDetaProduMaquina);	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonEliminarProductoOrdenDetaProduMaquina.setVisible(this.isPermisoEliminarProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonCancelarProductoOrdenDetaProduMaquina.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina);							
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonGuardarCambiosProductoOrdenDetaProduMaquina.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina && this.isPermisoGuardarCambiosProductoOrdenDetaProduMaquina));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoOrdenDetaProduMaquina() {
		if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProduMaquina();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoOrdenDetaProduMaquina() {
	}
	
	public void jTableDatosProductoOrdenDetaProduMaquinaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoOrdenDetaProduMaquina(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoOrdenDetaProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumaquina==null) {
						this.productoordendetaprodumaquina = new ProductoOrdenDetaProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				}

				if(this.productoordendetaprodumaquina.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoordendetaprodumaquina.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoordendetaprodu=true;

			idTienePermisoordendetaprodu=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMaquina(OrdenDetaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisoordendetaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduMaquina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduMaquina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);

				this.ordendetaproduBeanSwingJInternalFrame=new OrdenDetaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ordendetaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ordendetaproduBeanSwingJInternalFrame.getOrdenDetaProduLogic().setConnexion(this.productoordendetaprodumaquinaLogic.getConnexion());

				if(this.productoordendetaprodumaquina.getid_orden_deta_produ()!=null) {
					this.ordendetaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ordendetaproduBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodumaquina.getid_orden_deta_produ());
					this.ordendetaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ordendetaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ordendetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenDetaProdu();
				}

				JInternalFrameBase jinternalFrame =this.ordendetaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduMaquina=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduMaquina.getBorder();
				TitledBorder titledBorderordendetaprodu=(TitledBorder)this.ordendetaproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenDetaProdu.getBorder();

				titledBorderordendetaprodu.setTitle(titledBorderProductoOrdenDetaProduMaquina.getTitle() + " -> Orden Detalle Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumaquina==null) {
						this.productoordendetaprodumaquina = new ProductoOrdenDetaProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				}

				if(this.productoordendetaprodumaquina.getid_orden_deta_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_orden_deta_produ = "+this.productoordendetaprodumaquina.getid_orden_deta_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoareaempresaprodu=true;

			idTienePermisotipoareaempresaprodu=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMaquina(TipoAreaEmpresaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoareaempresaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduMaquina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduMaquina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);

				this.tipoareaempresaproduBeanSwingJInternalFrame=new TipoAreaEmpresaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoareaempresaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoareaempresaproduBeanSwingJInternalFrame.getTipoAreaEmpresaProduLogic().setConnexion(this.productoordendetaprodumaquinaLogic.getConnexion());

				if(this.productoordendetaprodumaquina.getid_tipo_area_empresa_produ()!=null) {
					this.tipoareaempresaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoareaempresaproduBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodumaquina.getid_tipo_area_empresa_produ());
					this.tipoareaempresaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoareaempresaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoareaempresaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoAreaEmpresaProdu();
				}

				JInternalFrameBase jinternalFrame =this.tipoareaempresaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduMaquina=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduMaquina.getBorder();
				TitledBorder titledBordertipoareaempresaprodu=(TitledBorder)this.tipoareaempresaproduBeanSwingJInternalFrame.jScrollPanelDatosTipoAreaEmpresaProdu.getBorder();

				titledBordertipoareaempresaprodu.setTitle(titledBorderProductoOrdenDetaProduMaquina.getTitle() + " -> Tipo Area Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumaquina==null) {
						this.productoordendetaprodumaquina = new ProductoOrdenDetaProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				}

				if(this.productoordendetaprodumaquina.getid_tipo_area_empresa_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_area_empresa_produ = "+this.productoordendetaprodumaquina.getid_tipo_area_empresa_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprocesoempresaprodu=true;

			idTienePermisotipoprocesoempresaprodu=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMaquina(TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprocesoempresaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduMaquina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduMaquina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);

				this.tipoprocesoempresaproduBeanSwingJInternalFrame=new TipoProcesoEmpresaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprocesoempresaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprocesoempresaproduBeanSwingJInternalFrame.getTipoProcesoEmpresaProduLogic().setConnexion(this.productoordendetaprodumaquinaLogic.getConnexion());

				if(this.productoordendetaprodumaquina.getid_tipo_proceso_empresa_produ()!=null) {
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodumaquina.getid_tipo_proceso_empresa_produ());
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprocesoempresaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProcesoEmpresaProdu();
				}

				JInternalFrameBase jinternalFrame =this.tipoprocesoempresaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduMaquina=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduMaquina.getBorder();
				TitledBorder titledBordertipoprocesoempresaprodu=(TitledBorder)this.tipoprocesoempresaproduBeanSwingJInternalFrame.jScrollPanelDatosTipoProcesoEmpresaProdu.getBorder();

				titledBordertipoprocesoempresaprodu.setTitle(titledBorderProductoOrdenDetaProduMaquina.getTitle() + " -> Tipo Proceso Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumaquina==null) {
						this.productoordendetaprodumaquina = new ProductoOrdenDetaProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				}

				if(this.productoordendetaprodumaquina.getid_tipo_proceso_empresa_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_proceso_empresa_produ = "+this.productoordendetaprodumaquina.getid_tipo_proceso_empresa_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomaquinaempresa=true;

			idTienePermisotipomaquinaempresa=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMaquina(TipoMaquinaEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomaquinaempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduMaquina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduMaquina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);

				this.tipomaquinaempresaBeanSwingJInternalFrame=new TipoMaquinaEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomaquinaempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomaquinaempresaBeanSwingJInternalFrame.getTipoMaquinaEmpresaLogic().setConnexion(this.productoordendetaprodumaquinaLogic.getConnexion());

				if(this.productoordendetaprodumaquina.getid_tipo_merma_empresa()!=null) {
					this.tipomaquinaempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomaquinaempresaBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodumaquina.getid_tipo_merma_empresa());
					this.tipomaquinaempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomaquinaempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomaquinaempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMaquinaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipomaquinaempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduMaquina=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduMaquina.getBorder();
				TitledBorder titledBordertipomaquinaempresa=(TitledBorder)this.tipomaquinaempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoMaquinaEmpresa.getBorder();

				titledBordertipomaquinaempresa.setTitle(titledBorderProductoOrdenDetaProduMaquina.getTitle() + " -> Tipo Maquina Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumaquina==null) {
						this.productoordendetaprodumaquina = new ProductoOrdenDetaProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				}

				if(this.productoordendetaprodumaquina.getid_tipo_merma_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_merma_empresa = "+this.productoordendetaprodumaquina.getid_tipo_merma_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadProductoOrdenDetaProduMaquinaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProduMaquina(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProduMaquina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProduMaquina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.productoordendetaprodumaquinaLogic.getConnexion());

				if(this.productoordendetaprodumaquina.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodumaquina.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProduMaquina=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProduMaquina.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderProductoOrdenDetaProduMaquina.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadProductoOrdenDetaProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumaquina==null) {
						this.productoordendetaprodumaquina = new ProductoOrdenDetaProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				}

				if(this.productoordendetaprodumaquina.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.productoordendetaprodumaquina.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductoOrdenDetaProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumaquina==null) {
						this.productoordendetaprodumaquina = new ProductoOrdenDetaProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				}

				if(this.productoordendetaprodumaquina.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productoordendetaprodumaquina.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoProductoOrdenDetaProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumaquina==null) {
						this.productoordendetaprodumaquina = new ProductoOrdenDetaProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				}

				if(this.productoordendetaprodumaquina.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.productoordendetaprodumaquina.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalProductoOrdenDetaProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumaquina==null) {
						this.productoordendetaprodumaquina = new ProductoOrdenDetaProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				}

				if(this.productoordendetaprodumaquina.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.productoordendetaprodumaquina.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoOrdenDetaProduMaquinaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.getproductoordendetaprodumaquina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodumaquina==null) {
						this.productoordendetaprodumaquina = new ProductoOrdenDetaProduMaquina();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);
				}

				if(this.productoordendetaprodumaquina.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productoordendetaprodumaquina.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);

			this.getProductoOrdenDetaProduMaquinasFK_IdOrdenDetaProdu();

			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);

			//if(ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);

			this.getProductoOrdenDetaProduMaquinasFK_IdTipoAreaEmpresaProdu();

			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);

			//if(ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);

			this.getProductoOrdenDetaProduMaquinasFK_IdTipoMaquinaEmpresa();

			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);

			//if(ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);

			this.getProductoOrdenDetaProduMaquinasFK_IdTipoProcesoEmpresaProdu();

			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);

			//if(ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadProductoOrdenDetaProduMaquinaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);

			this.getProductoOrdenDetaProduMaquinasFK_IdUnidad();

			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);

			//if(ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodumaquinaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoOrdenDetaProduMaquina() {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.dispose();
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina!=null) {
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.dispose();
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina=null;
		}
		
		if(this.jInternalFrameImportacionProductoOrdenDetaProduMaquina!=null) {
			this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setVisible(false);	    			
			this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.dispose();
			this.jInternalFrameImportacionProductoOrdenDetaProduMaquina=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoOrdenDetaProduMaquina();
			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoOrdenDetaProduMaquina")) {
				jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoOrdenDetaProduMaquina")) {
				jButtonDuplicarProductoOrdenDetaProduMaquinaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoOrdenDetaProduMaquina")) {
				jButtonCopiarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoOrdenDetaProduMaquina")) {
				jButtonVerFormProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoOrdenDetaProduMaquina")) {
				jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoOrdenDetaProduMaquina")) {
				jButtonDuplicarProductoOrdenDetaProduMaquinaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoOrdenDetaProduMaquina")) {
				jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoOrdenDetaProduMaquina")) {
				jButtonDuplicarProductoOrdenDetaProduMaquinaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoOrdenDetaProduMaquina")) {
				jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoOrdenDetaProduMaquina")) {
				jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoOrdenDetaProduMaquina")) {
				jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoOrdenDetaProduMaquina")) {
				jButtonModificarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoOrdenDetaProduMaquina")) {
				jButtonModificarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoOrdenDetaProduMaquina")) {
				jButtonModificarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoOrdenDetaProduMaquina")) {
				jButtonActualizarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoOrdenDetaProduMaquina")) {
				jButtonActualizarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoOrdenDetaProduMaquina")) {
				jButtonActualizarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoOrdenDetaProduMaquina")) {
				jButtonEliminarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoOrdenDetaProduMaquina")) {
				jButtonEliminarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoOrdenDetaProduMaquina")) {
				jButtonEliminarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoOrdenDetaProduMaquina")) {
				jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoOrdenDetaProduMaquina")) {
				jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoOrdenDetaProduMaquina")) {
				jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoOrdenDetaProduMaquina")) {
				jButtonCerrarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoOrdenDetaProduMaquina")) {
				jButtonCerrarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoOrdenDetaProduMaquina")) {
				jButtonCerrarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoOrdenDetaProduMaquina")) {
				jButtonMostrarOcultarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoOrdenDetaProduMaquina")) {
				jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoOrdenDetaProduMaquina")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoOrdenDetaProduMaquina")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoOrdenDetaProduMaquina")) {
				jButtonCopiarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoOrdenDetaProduMaquina")) {
				jButtonVerFormProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoOrdenDetaProduMaquina")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoOrdenDetaProduMaquina")) {
				jButtonCopiarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoOrdenDetaProduMaquina")) {
				jButtonVerFormProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoOrdenDetaProduMaquina")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoOrdenDetaProduMaquina")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoOrdenDetaProduMaquina")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoOrdenDetaProduMaquina")) {
				jButtonRecargarInformacionProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoOrdenDetaProduMaquina")) {
				jButtonRecargarInformacionProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoOrdenDetaProduMaquina")) {
				jButtonRecargarInformacionProductoOrdenDetaProduMaquinaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoOrdenDetaProduMaquina")) {
				jButtonAnterioresProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoOrdenDetaProduMaquina")) {
				jButtonAnterioresProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoOrdenDetaProduMaquina")) {
				jButtonAnterioresProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoOrdenDetaProduMaquina")) {
				jButtonSiguientesProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoOrdenDetaProduMaquina")) {
				jButtonSiguientesProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoOrdenDetaProduMaquina")) {
				jButtonSiguientesProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoOrdenDetaProduMaquina") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoOrdenDetaProduMaquina")) {
				jButtonAbrirOrderByProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoOrdenDetaProduMaquina") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoOrdenDetaProduMaquina")) {
				jButtonMostrarOcultarProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoOrdenDetaProduMaquina")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoOrdenDetaProduMaquina")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoOrdenDetaProduMaquina")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoOrdenDetaProduMaquina")) {
				jButtonCerrarReporteDinamicoProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoOrdenDetaProduMaquina")) {
				jButtonGenerarReporteDinamicoProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina")) {
				
				jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoOrdenDetaProduMaquina")) {
				jButtonCerrarImportacionProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoOrdenDetaProduMaquina")) {
				
				jButtonGenerarImportacionProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoOrdenDetaProduMaquina")) {
				
				jButtonAbrirImportacionProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoOrdenDetaProduMaquina")) {
				jComboBoxTiposAccionesProductoOrdenDetaProduMaquinaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoOrdenDetaProduMaquina")) {
				jComboBoxTiposRelacionesProductoOrdenDetaProduMaquinaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoOrdenDetaProduMaquina")) {
				jComboBoxTiposAccionesProductoOrdenDetaProduMaquinaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoOrdenDetaProduMaquina")) {
				
				jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquinaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoOrdenDetaProduMaquina")) {
				jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquinaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoOrdenDetaProduMaquina")) {
				jButtonAbrirOrderByProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoOrdenDetaProduMaquina")) {
				jButtonAbrirOrderByProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoOrdenDetaProduMaquina")) {
				jButtonCerrarOrderByProductoOrdenDetaProduMaquinaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtonidProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduMaquinaUpdate")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate")) {
				this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate")) {
				this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate")) {
				this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduMaquinaUpdate")) {
				this.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtonid_unidadProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtoncantidadProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtoncostoProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtondescripcionProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdOrdenDetaProduProductoOrdenDetaProduMaquina")) {
				this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMaquinaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina")) {
				this.jButtonFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquinaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina")) {
				this.jButtonFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquinaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina")) {
				this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquinaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadProductoOrdenDetaProduMaquina")) {
				this.jButtonFK_IdUnidadProductoOrdenDetaProduMaquinaActionPerformed(evt);
			}
			
			;
			
			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoOrdenDetaProduMaquina();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				


				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoordendetaprodumaquinaLocal=this.productoordendetaprodumaquina;
			} else {
				productoordendetaprodumaquinaLocal=this.productoordendetaprodumaquinaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
							
				
				


				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			
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
			
			


			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
								
						
				


				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMaquina.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
								
				
				


				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
							
				
				


				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMaquina.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			
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
			
			


			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
								
				
				


				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoOrdenDetaProduMaquina")) {
					jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquinaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoOrdenDetaProduMaquina")) {
					jCheckBoxSeleccionadosProductoOrdenDetaProduMaquinaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoOrdenDetaProduMaquina")) {
					
				}
				
				


				
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
												
				
				


				
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMaquina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
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
			
			


			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMaquina.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMaquina.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodumaquina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodumaquina);
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
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
				
				


				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProduMaquina.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProduMaquina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduMaquinaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodumaquinaAnterior =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoOrdenDetaProduMaquina")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoOrdenDetaProduMaquinaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoordendetaprodumaquina =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoordendetaprodumaquina);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProduMaquina")) {
				
				}
				
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoOrdenDetaProduMaquina")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProduMaquina")) {
			
			}
			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoOrdenDetaProduMaquina();
			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			
			if(sTipo.equals("NuevoProductoOrdenDetaProduMaquina")) {
				jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoOrdenDetaProduMaquina")) {
				jButtonDuplicarProductoOrdenDetaProduMaquinaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoOrdenDetaProduMaquina")) {
				jButtonCopiarProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoOrdenDetaProduMaquina")) {
				jButtonVerFormProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoOrdenDetaProduMaquina")) {
				jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoOrdenDetaProduMaquina")) {
				jButtonModificarProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoOrdenDetaProduMaquina")) {
				jButtonActualizarProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoOrdenDetaProduMaquina")) {
				jButtonEliminarProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoOrdenDetaProduMaquina")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoOrdenDetaProduMaquina")) {
				jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoOrdenDetaProduMaquina")) {
				jButtonCerrarProductoOrdenDetaProduMaquinaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoOrdenDetaProduMaquina")) {
				jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoOrdenDetaProduMaquina")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoOrdenDetaProduMaquina")) {
				jButtonAbrirOrderByProductoOrdenDetaProduMaquinaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoOrdenDetaProduMaquina")) {
				jButtonRecargarInformacionProductoOrdenDetaProduMaquinaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoOrdenDetaProduMaquina")) {
				jButtonAnterioresProductoOrdenDetaProduMaquinaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoOrdenDetaProduMaquina")) {
				jButtonSiguientesProductoOrdenDetaProduMaquinaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtonidProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduMaquinaUpdate")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate")) {
				this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate")) {
				this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate")) {
				this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduMaquinaUpdate")) {
				this.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtonid_unidadProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtoncantidadProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtoncostoProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoOrdenDetaProduMaquinaBusqueda")) {
				this.jButtondescripcionProductoOrdenDetaProduMaquinaBusquedaActionPerformed(evt);
			}
			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoOrdenDetaProduMaquina();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoOrdenDetaProduMaquina")) {
				closingInternalFrameProductoOrdenDetaProduMaquina();
				
			} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProduMaquina")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoOrdenDetaProduMaquina = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame jInternalFrameParent=(ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(null);
			}
			
			ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoordendetaprodumaquina,new Object(),this.productoordendetaprodumaquinaParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoOrdenDetaProduMaquina(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoOrdenDetaProduMaquina(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoOrdenDetaProduMaquina(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoordendetaprodumaquina)) {
			if(!esControlTabla) {
				if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);			
				}
				
				if(this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoordendetaprodumaquinaReturnGeneral=productoordendetaprodumaquinaLogic.procesarEventosProductoOrdenDetaProduMaquinasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.productoordendetaprodumaquina,this.productoordendetaprodumaquinaParameterGeneral,this.isEsNuevoProductoOrdenDetaProduMaquina,classes);//this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquina()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaReturnGeneral,this.productoordendetaprodumaquinaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoOrdenDetaProduMaquina(classes,this.productoordendetaprodumaquinaReturnGeneral,this.productoordendetaprodumaquinaBean,false);
					}
						
					if(this.productoordendetaprodumaquinaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaReturnGeneral.getProductoOrdenDetaProduMaquina());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaReturnGeneral.getProductoOrdenDetaProduMaquina());	
					}
						
					if(this.productoordendetaprodumaquinaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaReturnGeneral.getProductoOrdenDetaProduMaquina(),classes);//this.productoordendetaprodumaquinaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,classes);//this.productoordendetaprodumaquinaBean);									
				}
			
				if(ProductoOrdenDetaProduMaquinaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquina);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoordendetaprodumaquinaAnterior!=null) {
						this.productoordendetaprodumaquina=this.productoordendetaprodumaquinaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoordendetaprodumaquinaReturnGeneral=productoordendetaprodumaquinaLogic.procesarEventosProductoOrdenDetaProduMaquinasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.productoordendetaprodumaquina,this.productoordendetaprodumaquinaParameterGeneral,this.isEsNuevoProductoOrdenDetaProduMaquina,classes);//this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquina()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoordendetaprodumaquinaReturnGeneral.getProductoOrdenDetaProduMaquina(),productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoordendetaprodumaquinaReturnGeneral.getProductoOrdenDetaProduMaquina(),this.productoordendetaprodumaquinas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoOrdenDetaProduMaquina.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoOrdenDetaProduMaquina.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoOrdenDetaProduMaquina();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoOrdenDetaProduMaquina() throws Exception {
		
		ProductoOrdenDetaProduMaquinaModel productoordendetaprodumaquinaModel=(ProductoOrdenDetaProduMaquinaModel)this.jTableDatosProductoOrdenDetaProduMaquina.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodumaquinaModel.productoordendetaprodumaquinas=this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoordendetaprodumaquinaModel.productoordendetaprodumaquinas=this.productoordendetaprodumaquinas;
		}
		
		
		((ProductoOrdenDetaProduMaquinaModel) this.jTableDatosProductoOrdenDetaProduMaquina.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoOrdenDetaProduMaquina() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoordendetaprodumaquinaAnterior(),this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoordendetaprodumaquinaAnterior(),this.productoordendetaprodumaquinas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoOrdenDetaProduMaquina();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
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
										
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodumaquina,new Object(),generalEntityParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoOrdenDetaProduMaquinaConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProduMaquina(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoOrdenDetaProduMaquinaConstantesFunciones.getClassesRelationshipsFromStringsOfProductoOrdenDetaProduMaquina(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoOrdenDetaProduMaquina(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodumaquina,new Object(),generalEntityParameterGeneral,this.productoordendetaprodumaquinaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquinaBean productoordendetaprodumaquinaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoOrdenDetaProduMaquina(ArrayList<Classe> classes,ProductoOrdenDetaProduMaquinaReturnGeneral productoordendetaprodumaquinaReturnGeneral,ProductoOrdenDetaProduMaquinaBean productoordendetaprodumaquinaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoordendetaprodumaquina)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina = new ProductoOrdenDetaProduMaquinaDetalleFormJInternalFrame(jDesktopPane,this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones(),this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setVisible(false);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.productoordendetaprodumaquinaLogic=this.productoordendetaprodumaquinaLogic;
		
		this.cargarCombosFrameForeignKeyProductoOrdenDetaProduMaquina("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoOrdenDetaProduMaquina();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoOrdenDetaProduMaquina();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoOrdenDetaProduMaquina("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProduMaquina();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoOrdenDetaProduMaquina"));
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonModificarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"ModificarProductoOrdenDetaProduMaquina"));

		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonModificarToolBarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoOrdenDetaProduMaquina"));
					
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemModificarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoOrdenDetaProduMaquina"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonActualizarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"ActualizarProductoOrdenDetaProduMaquina"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonActualizarToolBarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoOrdenDetaProduMaquina"));
						
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemActualizarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoOrdenDetaProduMaquina"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonEliminarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"EliminarProductoOrdenDetaProduMaquina"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonEliminarToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoOrdenDetaProduMaquina"));
								
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemEliminarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoOrdenDetaProduMaquina"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonCancelarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"CancelarProductoOrdenDetaProduMaquina"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonCancelarToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoOrdenDetaProduMaquina"));
					
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemCancelarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoOrdenDetaProduMaquina"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemDetalleCerrarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoOrdenDetaProduMaquina"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProduMaquina"));
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProduMaquina"));
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoOrdenDetaProduMaquina"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonidProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtoncostoProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduMaquinaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoOrdenDetaProduMaquina"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoOrdenDetaProduMaquina"));
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoOrdenDetaProduMaquina"));
		}
		
		this.jTableDatosProductoOrdenDetaProduMaquina.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoOrdenDetaProduMaquina"));
		
		this.jTableDatosProductoOrdenDetaProduMaquina.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoOrdenDetaProduMaquina"));
		
		this.jButtonNuevoProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"NuevoProductoOrdenDetaProduMaquina"));
		
		this.jButtonDuplicarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"DuplicarProductoOrdenDetaProduMaquina"));
		
		this.jButtonCopiarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"CopiarProductoOrdenDetaProduMaquina"));
		
		this.jButtonVerFormProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"VerFormProductoOrdenDetaProduMaquina"));
		
		
		this.jButtonNuevoToolBarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoOrdenDetaProduMaquina"));
			
		this.jButtonDuplicarToolBarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoOrdenDetaProduMaquina"));
			
		this.jMenuItemNuevoProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoOrdenDetaProduMaquina"));
			
		this.jMenuItemDuplicarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoOrdenDetaProduMaquina"));		
		
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoOrdenDetaProduMaquina"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoOrdenDetaProduMaquina"));
			
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoOrdenDetaProduMaquina"));		
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonModificarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"ModificarProductoOrdenDetaProduMaquina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonModificarToolBarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoOrdenDetaProduMaquina"));
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemModificarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoOrdenDetaProduMaquina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonActualizarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"ActualizarProductoOrdenDetaProduMaquina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonActualizarToolBarProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoOrdenDetaProduMaquina"));
				
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemActualizarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoOrdenDetaProduMaquina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonEliminarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"EliminarProductoOrdenDetaProduMaquina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonEliminarToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoOrdenDetaProduMaquina"));
						
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemEliminarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoOrdenDetaProduMaquina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonCancelarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"CancelarProductoOrdenDetaProduMaquina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonCancelarToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoOrdenDetaProduMaquina"));
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemCancelarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoOrdenDetaProduMaquina"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoOrdenDetaProduMaquina"));		
		
		
		this.jButtonCerrarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"CerrarProductoOrdenDetaProduMaquina"));
		
		
		this.jButtonCerrarToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoOrdenDetaProduMaquina"));
			
		this.jMenuItemCerrarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoOrdenDetaProduMaquina"));
			
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jMenuItemDetalleCerrarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoOrdenDetaProduMaquina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonGuardarCambiosProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoOrdenDetaProduMaquina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProduMaquina"));
		}
		
		this.jButtonCopiarToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoOrdenDetaProduMaquina"));
			
		this.jButtonVerFormToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoOrdenDetaProduMaquina"));
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoOrdenDetaProduMaquina"));
			
		this.jMenuItemCopiarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoOrdenDetaProduMaquina"));		
		
		this.jMenuItemVerFormProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoOrdenDetaProduMaquina"));		
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoOrdenDetaProduMaquina"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoOrdenDetaProduMaquina"));
			
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoOrdenDetaProduMaquina"));		
		
		
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoOrdenDetaProduMaquina"));
					
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoOrdenDetaProduMaquina"));
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoOrdenDetaProduMaquina"));		
		
		
		
		this.jButtonAnterioresProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"AnterioresProductoOrdenDetaProduMaquina"));
		
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoOrdenDetaProduMaquina"));
		
		this.jMenuItemAnterioresProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoOrdenDetaProduMaquina"));		
		
		
		this.jButtonSiguientesProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"SiguientesProductoOrdenDetaProduMaquina"));
		
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoOrdenDetaProduMaquina"));
			
		this.jMenuItemSiguientesProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoOrdenDetaProduMaquina"));
			
		this.jMenuItemAbrirOrderByProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoOrdenDetaProduMaquina"));
			
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoOrdenDetaProduMaquina"));
			
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoOrdenDetaProduMaquina"));
			
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoOrdenDetaProduMaquina"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoOrdenDetaProduMaquina"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoOrdenDetaProduMaquina"));
			
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoOrdenDetaProduMaquina"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoOrdenDetaProduMaquina"));

		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoOrdenDetaProduMaquina"));
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoOrdenDetaProduMaquina"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoOrdenDetaProduMaquina"));
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoOrdenDetaProduMaquina"));
					
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoOrdenDetaProduMaquina"));
			
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoOrdenDetaProduMaquina"));		
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonidProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtoncostoProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduMaquinaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdOrdenDetaProduProductoOrdenDetaProduMaquina"));

			this.jButtonFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina"));

			this.jButtonFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina"));

			this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina"));

			this.jButtonFK_IdUnidadProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoOrdenDetaProduMaquina"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProduMaquina"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProduMaquina"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProduMaquina"));				
			//this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProduMaquina"));
			//this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoOrdenDetaProduMaquina!=null) {
				this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoOrdenDetaProduMaquina"));
				this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoOrdenDetaProduMaquina"));
				this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoOrdenDetaProduMaquina"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoOrdenDetaProduMaquina"));
			
			this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduMaquina.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoOrdenDetaProduMaquina"));			
			
			if(this.jInternalFrameOrderByProductoOrdenDetaProduMaquina!=null) {
				this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoOrdenDetaProduMaquina"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoOrdenDetaProduMaquina"));
		
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
            		closingInternalFrameProductoOrdenDetaProduMaquina();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoOrdenDetaProduMaquina = (JInternalFrameBase)event.getSource();
	            	
	            ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame jInternalFrameParent=(ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoOrdenDetaProduMaquina.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoOrdenDetaProduMaquinaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoOrdenDetaProduMaquina.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoOrdenDetaProduMaquina.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonNuevoProductoOrdenDetaProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoOrdenDetaProduMaquinaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonModificarProductoOrdenDetaProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoOrdenDetaProduMaquinaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonActualizarProductoOrdenDetaProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoOrdenDetaProduMaquinaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonEliminarProductoOrdenDetaProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoOrdenDetaProduMaquinaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonCancelarProductoOrdenDetaProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonCerrarProductoOrdenDetaProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoOrdenDetaProduMaquinaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonGuardarCambiosProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoOrdenDetaProduMaquina";
		inputMap = this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonGuardarCambiosProductoOrdenDetaProduMaquina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonGuardarCambiosProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquinaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoOrdenDetaProduMaquinaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquinaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquinaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonidProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduMaquinaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtoncostoProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduMaquinaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduMaquinaBusqueda"));
		
		
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdOrdenDetaProduProductoOrdenDetaProduMaquina"));

		this.jButtonFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina"));

		this.jButtonFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina"));

		this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina"));

		this.jButtonFK_IdUnidadProductoOrdenDetaProduMaquina.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoOrdenDetaProduMaquina"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoOrdenDetaProduMaquina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoOrdenDetaProduMaquinaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquinaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoOrdenDetaProduMaquina(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()) {
					productoordendetaprodumaquinaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinas) {
					productoordendetaprodumaquinaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquinaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()) {
						productoordendetaprodumaquinaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinas) {
						productoordendetaprodumaquinaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduMaquina.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoOrdenDetaProduMaquina.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoOrdenDetaProduMaquinaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProduMaquina.getSelectedRows();
			
			ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaLocal=new ProductoOrdenDetaProduMaquina();
			
			//this.seleccionarTodosProductoOrdenDetaProduMaquina(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaprodumaquinaLocal =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoordendetaprodumaquinaLocal =(ProductoOrdenDetaProduMaquina) this.productoordendetaprodumaquinas.toArray()[this.jTableDatosProductoOrdenDetaProduMaquina.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoordendetaprodumaquinaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()) {
						productoordendetaprodumaquinaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinas) {
						productoordendetaprodumaquinaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduMaquina.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoOrdenDetaProduMaquina.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduMaquina,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoOrdenDetaProduMaquinaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoOrdenDetaProduMaquinaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquinaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()) {
				
						if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoordendetaprodumaquinaAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoordendetaprodumaquinaAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoordendetaprodumaquinaAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoordendetaprodumaquinaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinas) {
					
						if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoordendetaprodumaquinaAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoordendetaprodumaquinaAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoordendetaprodumaquinaAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoordendetaprodumaquinaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoOrdenDetaProduMaquinaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoOrdenDetaProduMaquina=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoOrdenDetaProduMaquina) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoOrdenDetaProduMaquina(conSplash);
				
					this.generarReporteProductoOrdenDetaProduMaquinasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoOrdenDetaProduMaquinasSeleccionados();
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoOrdenDetaProduMaquinasSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoOrdenDetaProduMaquinasSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoOrdenDetaProduMaquina();
				
				this.exportarProductoOrdenDetaProduMaquinasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoOrdenDetaProduMaquinas();
				//this.importarProductoOrdenDetaProduMaquinas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoOrdenDetaProduMaquina();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoOrdenDetaProduMaquinasSeleccionados();
				//this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Orden Maquina", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoOrdenDetaProduMaquina();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoOrdenDetaProduMaquina)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoOrdenDetaProduMaquina(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Orden Maquina",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoOrdenDetaProduMaquina) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoOrdenDetaProduMaquina(conSplash);
					
						//this.actualizarParametrosGeneralProductoOrdenDetaProduMaquina();
						
						this.generarReporteProcesoAccionProductoOrdenDetaProduMaquinasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Orden MaquinaES SELECCIONADOS?", "MANTENIMIENTO DE Orden Maquina", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoOrdenDetaProduMaquina();
				
						this.actualizarParametrosGeneralProductoOrdenDetaProduMaquina();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoordendetaprodumaquinaReturnGeneral=productoordendetaprodumaquinaLogic.procesarAccionProductoOrdenDetaProduMaquinasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas(),this.productoordendetaprodumaquinaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoOrdenDetaProduMaquinaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoOrdenDetaProduMaquina();
					
					ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoOrdenDetaProduMaquinaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoOrdenDetaProduMaquina(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoOrdenDetaProduMaquinaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoOrdenDetaProduMaquina();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();		
			ProductoOrdenDetaProduMaquina productoordendetaprodumaquina=new ProductoOrdenDetaProduMaquina();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina.getSelectedItem();
			
			
			
			
			productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoordendetaprodumaquinasSeleccionados.size()==1) {
				for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinasSeleccionados) {
					productoordendetaprodumaquina=productoordendetaprodumaquinaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoOrdenDetaProduMaquina();
			
      		//this.finishProcessProductoOrdenDetaProduMaquina(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoOrdenDetaProduMaquinaReturnGeneral() throws Exception {
		if(this.productoordendetaprodumaquinaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoordendetaprodumaquinaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoordendetaprodumaquinaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoordendetaprodumaquinaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoordendetaprodumaquinaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoordendetaprodumaquinaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
		}
		
		if(this.productoordendetaprodumaquinaReturnGeneral.getConRetornoLista() || this.productoordendetaprodumaquinaReturnGeneral.getConRetornoObjeto()) {
			if(this.productoordendetaprodumaquinaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquinas(this.productoordendetaprodumaquinaReturnGeneral.getProductoOrdenDetaProduMaquinas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoordendetaprodumaquinaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoordendetaprodumaquinaLogic.setProductoOrdenDetaProduMaquina(this.productoordendetaprodumaquinaReturnGeneral.getProductoOrdenDetaProduMaquina());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoOrdenDetaProduMaquina(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoOrdenDetaProduMaquina() throws Exception {
		
		
	}
	
	public ArrayList<ProductoOrdenDetaProduMaquina> getProductoOrdenDetaProduMaquinasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoOrdenDetaProduMaquina) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas()) {
					if(productoordendetaprodumaquinaAux.getIsSelected()) {
						productoordendetaprodumaquinasSeleccionados.add(productoordendetaprodumaquinaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:this.productoordendetaprodumaquinas) {
					if(productoordendetaprodumaquinaAux.getIsSelected()) {
						productoordendetaprodumaquinasSeleccionados.add(productoordendetaprodumaquinaAux);				
					}
				}
			}
			
			if(productoordendetaprodumaquinasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoordendetaprodumaquinasSeleccionados.addAll(this.productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoordendetaprodumaquinasSeleccionados.addAll(this.productoordendetaprodumaquinas);				
					}
				}
			}
		} else {
			productoordendetaprodumaquinasSeleccionados.add(this.productoordendetaprodumaquina);
		}
		
		return productoordendetaprodumaquinasSeleccionados;
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
	
	public void generarReporteProductoOrdenDetaProduMaquinasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoOrdenDetaProduMaquinasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoOrdenDetaProduMaquinasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoOrdenDetaProduMaquinasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoOrdenDetaProduMaquinasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Orden Maquina",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoOrdenDetaProduMaquinasSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();		
		
		productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoOrdenDetaProduMaquinas("Todos",productoordendetaprodumaquinasSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoOrdenDetaProduMaquinasSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();		
		
		productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoOrdenDetaProduMaquinas("Todos",productoordendetaprodumaquinasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoOrdenDetaProduMaquinasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();
		
		productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoOrdenDetaProduMaquinas("Todos",productoordendetaprodumaquinasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoOrdenDetaProduMaquinasSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoOrdenDetaProduMaquina();
		
		
		productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoOrdenDetaProduMaquina();
		
		
		//this.generarReporteProductoOrdenDetaProduMaquinas("Todos",productoordendetaprodumaquinasSeleccionados ,productoordendetaprodumaquinaImplementable,productoordendetaprodumaquinaImplementableHome);
	}
	
	public void mostrarImportacionProductoOrdenDetaProduMaquinas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoOrdenDetaProduMaquina();
		
		this.abrirFrameImportacionProductoOrdenDetaProduMaquina();		
		
			
		//this.generarReporteProductoOrdenDetaProduMaquinas("Todos",productoordendetaprodumaquinasSeleccionados ,productoordendetaprodumaquinaImplementable,productoordendetaprodumaquinaImplementableHome);
	}
	
	public void importarProductoOrdenDetaProduMaquinas() throws Exception {		
	
	}
	
	public void exportarProductoOrdenDetaProduMaquinasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoOrdenDetaProduMaquinasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoOrdenDetaProduMaquinasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoOrdenDetaProduMaquinasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Orden Maquina",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoOrdenDetaProduMaquinasSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();		
		
		productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumaquina."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoOrdenDetaProduMaquina(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoOrdenDetaProduMaquina(productoordendetaprodumaquinaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoordendetaprodumaquinaAux.setsDetalleGeneralEntityReporte(productoordendetaprodumaquinaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Maquina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoOrdenDetaProduMaquina(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoordendetaprodumaquina.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumaquina.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumaquina.getordendetaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumaquina.gettipoareaempresaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumaquina.gettipoprocesoempresaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumaquina.gettipomaquinaempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumaquina.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumaquina.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumaquina.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumaquina.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodumaquina.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoOrdenDetaProduMaquinasSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();		
		
		productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumaquina.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoOrdenDetaProduMaquinas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoOrdenDetaProduMaquina(row);				
				iRow++;
			}				
			
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoOrdenDetaProduMaquina(productoordendetaprodumaquinaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Maquina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoOrdenDetaProduMaquinasSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();		
		
		productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodumaquina.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoordendetaprodumaquinas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoordendetaprodumaquina");
			//elementRoot.appendChild(element);
		
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinasSeleccionados) {
				element = document.createElement("productoordendetaprodumaquina");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoOrdenDetaProduMaquina(productoordendetaprodumaquinaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Maquina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoOrdenDetaProduMaquina(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumaquina.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumaquina.getordendetaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumaquina.gettipoareaempresaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumaquina.gettipoprocesoempresaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumaquina.gettipomaquinaempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumaquina.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumaquina.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumaquina.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumaquina.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodumaquina.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProductoOrdenDetaProduMaquina(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoOrdenDetaProduMaquinaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoordendetaprodumaquina.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoOrdenDetaProduMaquinaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoordendetaprodumaquina.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementordendetaprodu_descripcion = document.createElement(ProductoOrdenDetaProduMaquinaConstantesFunciones.IDORDENDETAPRODU);
		elementordendetaprodu_descripcion.appendChild(document.createTextNode(productoordendetaprodumaquina.getordendetaprodu_descripcion()));
		element.appendChild(elementordendetaprodu_descripcion);

		Element elementtipoareaempresaprodu_descripcion = document.createElement(ProductoOrdenDetaProduMaquinaConstantesFunciones.IDTIPOAREAEMPRESAPRODU);
		elementtipoareaempresaprodu_descripcion.appendChild(document.createTextNode(productoordendetaprodumaquina.gettipoareaempresaprodu_descripcion()));
		element.appendChild(elementtipoareaempresaprodu_descripcion);

		Element elementtipoprocesoempresaprodu_descripcion = document.createElement(ProductoOrdenDetaProduMaquinaConstantesFunciones.IDTIPOPROCESOEMPRESAPRODU);
		elementtipoprocesoempresaprodu_descripcion.appendChild(document.createTextNode(productoordendetaprodumaquina.gettipoprocesoempresaprodu_descripcion()));
		element.appendChild(elementtipoprocesoempresaprodu_descripcion);

		Element elementtipomaquinaempresa_descripcion = document.createElement(ProductoOrdenDetaProduMaquinaConstantesFunciones.IDTIPOMAQUINAEMPRESA);
		elementtipomaquinaempresa_descripcion.appendChild(document.createTextNode(productoordendetaprodumaquina.gettipomaquinaempresa_descripcion()));
		element.appendChild(elementtipomaquinaempresa_descripcion);

		Element elementunidad_descripcion = document.createElement(ProductoOrdenDetaProduMaquinaConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(productoordendetaprodumaquina.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcantidad = document.createElement(ProductoOrdenDetaProduMaquinaConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productoordendetaprodumaquina.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcosto = document.createElement(ProductoOrdenDetaProduMaquinaConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(productoordendetaprodumaquina.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementcosto_total = document.createElement(ProductoOrdenDetaProduMaquinaConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(productoordendetaprodumaquina.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(ProductoOrdenDetaProduMaquinaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productoordendetaprodumaquina.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProductoOrdenDetaProduMaquinasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados=new ArrayList<ProductoOrdenDetaProduMaquina>();
		
		productoordendetaprodumaquinasSeleccionados=this.getProductoOrdenDetaProduMaquinasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoOrdenDetaProduMaquina(productoordendetaprodumaquinasSeleccionados);
		
		this.generarReporteProductoOrdenDetaProduMaquinas("Todos",productoordendetaprodumaquinasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoOrdenDetaProduMaquina(ArrayList<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquinaAux:productoordendetaprodumaquinasSeleccionados) {
				productoordendetaprodumaquinaAux.setsDetalleGeneralEntityReporte(productoordendetaprodumaquinaAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU)) {
					existe=true;
					productoordendetaprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumaquinaAux.getordendetaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU)) {
					existe=true;
					productoordendetaprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumaquinaAux.gettipoareaempresaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU)) {
					existe=true;
					productoordendetaprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumaquinaAux.gettipoprocesoempresaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA)) {
					existe=true;
					productoordendetaprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumaquinaAux.gettipomaquinaempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					productoordendetaprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumaquinaAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productoordendetaprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumaquinaAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productoordendetaprodumaquinaAux.setsDescripcionGeneralEntityReporte1(productoordendetaprodumaquinaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=true;
				this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=true;
			}
			
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProduMaquina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProduMaquina=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=true;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=true;
		} else {
			this.actualizarEstadoPanelsProductoOrdenDetaProduMaquina(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProduMaquina=false;
			//this.isVisibilidadCeldaVerFormProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProduMaquina=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProduMaquina=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			if(!productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=false;												
			}
			
			this.jButtonCerrarProductoOrdenDetaProduMaquina.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProduMaquina=false;
		}
		
		if(!this.permiteMantenimiento(this.productoordendetaprodumaquina)) {
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProduMaquina=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProduMaquina=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoOrdenDetaProduMaquina() {
	}
	
	public void actualizarEstadoPanelsProductoOrdenDetaProduMaquina(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMaquina!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMaquina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMaquina!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMaquina!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMaquina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMaquina!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMaquina!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMaquina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMaquina!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMaquina!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMaquina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMaquina!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMaquina!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMaquina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMaquina!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMaquina!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMaquina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMaquina!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProduMaquina!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProduMaquina!=null) {
				this.jPanelPaginacionProductoOrdenDetaProduMaquina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMaquina!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina!=null) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMaquina!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProduMaquina!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaOrdenDetaProdu(Boolean isParaOrdenDetaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaOrdenDetaProduNegation=!isParaOrdenDetaProdu;

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaOrdenDetaProdu;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoAreaEmpresaProdu=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdTipoAreaEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoMaquinaEmpresa=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdTipoMaquinaEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdUnidad=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdUnidadProductoOrdenDetaProduMaquina);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoAreaEmpresaProdu(Boolean isParaTipoAreaEmpresaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoAreaEmpresaProduNegation=!isParaTipoAreaEmpresaProdu;

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaTipoAreaEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoAreaEmpresaProdu=isParaTipoAreaEmpresaProdu;
			if(!this.isVisibilidadFK_IdTipoAreaEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoMaquinaEmpresa=isParaTipoAreaEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdTipoMaquinaEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaTipoAreaEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdUnidad=isParaTipoAreaEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdUnidadProductoOrdenDetaProduMaquina);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProcesoEmpresaProdu(Boolean isParaTipoProcesoEmpresaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProcesoEmpresaProduNegation=!isParaTipoProcesoEmpresaProdu;

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoAreaEmpresaProdu=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdTipoAreaEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoMaquinaEmpresa=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdTipoMaquinaEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaTipoProcesoEmpresaProdu;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdUnidad=isParaTipoProcesoEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdUnidadProductoOrdenDetaProduMaquina);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMaquinaEmpresa(Boolean isParaTipoMaquinaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMaquinaEmpresaNegation=!isParaTipoMaquinaEmpresa;

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaTipoMaquinaEmpresaNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoAreaEmpresaProdu=isParaTipoMaquinaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoAreaEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoMaquinaEmpresa=isParaTipoMaquinaEmpresa;
			if(!this.isVisibilidadFK_IdTipoMaquinaEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaTipoMaquinaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdUnidad=isParaTipoMaquinaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdUnidadProductoOrdenDetaProduMaquina);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoAreaEmpresaProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoAreaEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoMaquinaEmpresa=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoMaquinaEmpresa) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdTipoProcesoEmpresaProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoEmpresaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(jPanelFK_IdUnidadProductoOrdenDetaProduMaquina);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoOrdenDetaProduMaquinaSessionBean productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		
		if(this.productoordendetaprodumaquinaSessionBean==null) {
			this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		}
		
		this.productoordendetaprodumaquinaSessionBean.setsUltimaBusquedaProductoOrdenDetaProduMaquina(this.getsAccionBusqueda());
		this.productoordendetaprodumaquinaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoordendetaprodumaquinaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdOrdenDetaProdu")) {
			productoordendetaprodumaquinaSessionBean.setid_orden_deta_produ(this.getid_orden_deta_produFK_IdOrdenDetaProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoAreaEmpresaProdu")) {
			productoordendetaprodumaquinaSessionBean.setid_tipo_area_empresa_produ(this.getid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoMaquinaEmpresa")) {
			productoordendetaprodumaquinaSessionBean.setid_tipo_merma_empresa(this.getid_tipo_merma_empresaFK_IdTipoMaquinaEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProcesoEmpresaProdu")) {
			productoordendetaprodumaquinaSessionBean.setid_tipo_proceso_empresa_produ(this.getid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			productoordendetaprodumaquinaSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoOrdenDetaProduMaquinaSessionBean productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		
		if(this.productoordendetaprodumaquinaSessionBean==null) {
			this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		}
		
		if(this.productoordendetaprodumaquinaSessionBean.getsUltimaBusquedaProductoOrdenDetaProduMaquina()!=null&&!this.productoordendetaprodumaquinaSessionBean.getsUltimaBusquedaProductoOrdenDetaProduMaquina().equals("")) {
			this.setsAccionBusqueda(productoordendetaprodumaquinaSessionBean.getsUltimaBusquedaProductoOrdenDetaProduMaquina());
			this.setiNumeroPaginacion(productoordendetaprodumaquinaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoordendetaprodumaquinaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdOrdenDetaProdu")) {
				this.setid_orden_deta_produFK_IdOrdenDetaProdu(productoordendetaprodumaquinaSessionBean.getid_orden_deta_produ());
				productoordendetaprodumaquinaSessionBean.setid_orden_deta_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoAreaEmpresaProdu")) {
				this.setid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProdu(productoordendetaprodumaquinaSessionBean.getid_tipo_area_empresa_produ());
				productoordendetaprodumaquinaSessionBean.setid_tipo_area_empresa_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoMaquinaEmpresa")) {
				this.setid_tipo_merma_empresaFK_IdTipoMaquinaEmpresa(productoordendetaprodumaquinaSessionBean.getid_tipo_merma_empresa());
				productoordendetaprodumaquinaSessionBean.setid_tipo_merma_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProcesoEmpresaProdu")) {
				this.setid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProdu(productoordendetaprodumaquinaSessionBean.getid_tipo_proceso_empresa_produ());
				productoordendetaprodumaquinaSessionBean.setid_tipo_proceso_empresa_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(productoordendetaprodumaquinaSessionBean.getid_unidad());
				productoordendetaprodumaquinaSessionBean.setid_unidad(-1L);
			}
		}
		
		this.productoordendetaprodumaquinaSessionBean.setsUltimaBusquedaProductoOrdenDetaProduMaquina("");
		this.productoordendetaprodumaquinaSessionBean.setiNumeroPaginacion(ProductoOrdenDetaProduMaquinaConstantesFunciones.INUMEROPAGINACION);
		this.productoordendetaprodumaquinaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoOrdenDetaProduMaquina() {
		this.updateBorderResaltarBusquedasFormularioProductoOrdenDetaProduMaquina();
		this.updateVisibilidadBusquedasFormularioProductoOrdenDetaProduMaquina();
		this.updateHabilitarBusquedasFormularioProductoOrdenDetaProduMaquina();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoOrdenDetaProduMaquina() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponents().length>0) {
	

		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);
			}
		}

		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);
			}
		}

		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);
			}
		}

		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);
			}
		}

		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdUnidadProductoOrdenDetaProduMaquina!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduMaquina);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
				jPanel.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdUnidadProductoOrdenDetaProduMaquina);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoOrdenDetaProduMaquina() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);
			if(!this.productoordendetaprodumaquinaConstantesFunciones.mostrarFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);
			if(!this.productoordendetaprodumaquinaConstantesFunciones.mostrarFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);
			if(!this.productoordendetaprodumaquinaConstantesFunciones.mostrarFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);
			if(!this.productoordendetaprodumaquinaConstantesFunciones.mostrarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduMaquina);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarFK_IdUnidadProductoOrdenDetaProduMaquina);
			if(!this.productoordendetaprodumaquinaConstantesFunciones.mostrarFK_IdUnidadProductoOrdenDetaProduMaquina && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoOrdenDetaProduMaquina() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setEnabledAt(index,this.productoordendetaprodumaquinaConstantesFunciones.activarFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setEnabledAt(index,this.productoordendetaprodumaquinaConstantesFunciones.activarFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setEnabledAt(index,this.productoordendetaprodumaquinaConstantesFunciones.activarFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setEnabledAt(index,this.productoordendetaprodumaquinaConstantesFunciones.activarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduMaquina);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarFK_IdUnidadProductoOrdenDetaProduMaquina);
				this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setEnabledAt(index,this.productoordendetaprodumaquinaConstantesFunciones.activarFK_IdUnidadProductoOrdenDetaProduMaquina);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoOrdenDetaProduMaquina(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdOrdenDetaProdu")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);

			this.productoordendetaprodumaquinaConstantesFunciones.setResaltarFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina(resaltar);

			jPanel.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoAreaEmpresaProdu")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);

			this.productoordendetaprodumaquinaConstantesFunciones.setResaltarFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina(resaltar);

			jPanel.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoMaquinaEmpresa")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);

			this.productoordendetaprodumaquinaConstantesFunciones.setResaltarFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina(resaltar);

			jPanel.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProcesoEmpresaProdu")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);

			this.productoordendetaprodumaquinaConstantesFunciones.setResaltarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina(resaltar);

			jPanel.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.indexOfComponent(this.jPanelFK_IdUnidadProductoOrdenDetaProduMaquina);

			this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.getComponent(index);

			this.productoordendetaprodumaquinaConstantesFunciones.setResaltarFK_IdUnidadProductoOrdenDetaProduMaquina(resaltar);

			jPanel.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarFK_IdUnidadProductoOrdenDetaProduMaquina);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoOrdenDetaProduMaquina.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoOrdenDetaProduMaquina() throws Exception {

		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoOrdenDetaProduMaquina();
		this.updateVisibilidadResaltarControlesFormularioProductoOrdenDetaProduMaquina();
		this.updateHabilitarResaltarControlesFormularioProductoOrdenDetaProduMaquina();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoOrdenDetaProduMaquina() throws Exception {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltaridProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelidProductoOrdenDetaProduMaquina.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltaridProductoOrdenDetaProduMaquina);}
		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProduMaquina);}
		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina);}
		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina);}
		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_tipo_merma_empresaProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_tipo_merma_empresaProductoOrdenDetaProduMaquina);}
		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarid_unidadProductoOrdenDetaProduMaquina);}
		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarcantidadProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcantidadProductoOrdenDetaProduMaquina.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarcantidadProductoOrdenDetaProduMaquina);}
		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarcostoProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcostoProductoOrdenDetaProduMaquina.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarcostoProductoOrdenDetaProduMaquina);}
		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcosto_totalProductoOrdenDetaProduMaquina.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProduMaquina);}
		if(this.productoordendetaprodumaquinaConstantesFunciones.resaltardescripcionProductoOrdenDetaProduMaquina!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextAreadescripcionProductoOrdenDetaProduMaquina.setBorder(this.productoordendetaprodumaquinaConstantesFunciones.resaltardescripcionProductoOrdenDetaProduMaquina);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoOrdenDetaProduMaquina() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
	
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelidProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostraridProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelidProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostraridProductoOrdenDetaProduMaquina);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelid_orden_deta_produProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProduMaquina);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_tipo_merma_empresaProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_tipo_merma_empresaProductoOrdenDetaProduMaquina);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_unidadProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelid_unidadProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarid_unidadProductoOrdenDetaProduMaquina);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcantidadProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarcantidadProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelcantidadProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarcantidadProductoOrdenDetaProduMaquina);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcostoProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarcostoProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelcostoProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarcostoProductoOrdenDetaProduMaquina);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcosto_totalProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPanelcosto_totalProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProduMaquina);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextAreadescripcionProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrardescripcionProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jPaneldescripcionProductoOrdenDetaProduMaquina.setVisible(this.productoordendetaprodumaquinaConstantesFunciones.mostrardescripcionProductoOrdenDetaProduMaquina);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoOrdenDetaProduMaquina() throws Exception {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina!=null) {
	
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jLabelidProductoOrdenDetaProduMaquina.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activaridProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarid_tipo_area_empresa_produProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarid_tipo_merma_empresaProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jComboBoxid_unidadProductoOrdenDetaProduMaquina.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarid_unidadProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcantidadProductoOrdenDetaProduMaquina.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarcantidadProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcostoProductoOrdenDetaProduMaquina.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarcostoProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextFieldcosto_totalProductoOrdenDetaProduMaquina.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activarcosto_totalProductoOrdenDetaProduMaquina);
		this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina.jTextAreadescripcionProductoOrdenDetaProduMaquina.setEnabled(this.productoordendetaprodumaquinaConstantesFunciones.activardescripcionProductoOrdenDetaProduMaquina);
		}
	}
	
		
}